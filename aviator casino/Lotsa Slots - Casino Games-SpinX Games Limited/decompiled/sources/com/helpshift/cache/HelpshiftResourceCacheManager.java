package com.helpshift.cache;

/* loaded from: classes4.dex */
public class HelpshiftResourceCacheManager {
    private static final java.lang.String CACHE_URL_MAPPING_ETAG = "url_mapping_etag";
    private static final java.lang.String CACHE_URL_MAPPING_LAST_SUCCESS_TIME = "url_mapping_last_success_time";
    private static final java.lang.String ETAG_SUFFIX = "_etag";
    private static final java.lang.String HEADERS_SUFFIX = "_headers";
    private static final java.lang.String MIMETYPE_SUFFIX = "_mimetype";
    private static final java.lang.String RESOURCE_LAST_SUCCESS_TIME_SUFFIX = "_last_success_time";
    private static final java.lang.String TAG = "resCacheMngr";
    private final java.lang.String appFileDirPath;
    private java.util.Map<java.lang.String, java.lang.Long> cacheURLMapping = new java.util.HashMap();
    private final java.lang.String cacheUrlConfigFileName;
    private final java.lang.String cacheUrlConfigRoute;
    private final com.helpshift.network.HSDownloaderNetwork hsDownloaderNetwork;
    private final com.helpshift.cache.ResourceCacheEvictStrategy resourceCacheEvictStrategy;
    private final com.helpshift.storage.ISharedPreferencesStore resourceCacheSharedPref;
    private final java.lang.String subdirPath;

    public HelpshiftResourceCacheManager(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, com.helpshift.network.HSDownloaderNetwork hSDownloaderNetwork, com.helpshift.cache.ResourceCacheEvictStrategy resourceCacheEvictStrategy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.hsDownloaderNetwork = hSDownloaderNetwork;
        this.resourceCacheSharedPref = iSharedPreferencesStore;
        this.resourceCacheEvictStrategy = resourceCacheEvictStrategy;
        this.appFileDirPath = str;
        this.cacheUrlConfigRoute = str2;
        this.cacheUrlConfigFileName = str3;
        this.subdirPath = str4;
    }

    public synchronized boolean shouldCacheUrl(java.lang.String str) {
        boolean z = false;
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return false;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> it = this.cacheURLMapping.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (str.startsWith(it.next().getKey())) {
                z = true;
                break;
            }
        }
        com.helpshift.log.HSLogger.d(TAG, "Should cache url? " + z + "   with path - " + str);
        return z;
    }

    private synchronized long getTTLForResource(java.lang.String str) {
        long j = 0;
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return 0L;
        }
        java.lang.Long l = 0L;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> it = this.cacheURLMapping.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry<java.lang.String, java.lang.Long> next = it.next();
            if (str.startsWith(next.getKey())) {
                l = this.cacheURLMapping.get(next.getKey());
                break;
            }
        }
        if (l != null) {
            j = l.longValue();
        }
        return j;
    }

    public void ensureCacheURLsListAvailable() {
        java.lang.String string = getString(CACHE_URL_MAPPING_ETAG);
        long j = getLong(CACHE_URL_MAPPING_LAST_SUCCESS_TIME);
        java.io.File file = new java.io.File(getCacheURLsConfigFilePath());
        boolean exists = file.exists();
        if (!exists) {
            file.getParentFile().mkdirs();
            string = "";
        }
        if (!exists || com.helpshift.util.Utils.isEmpty(string) || j < java.lang.System.currentTimeMillis() - getCacheURLsConfigTTL() || j < java.lang.System.currentTimeMillis() - com.helpshift.util.Utils.TIME_7DAYS_MILLIS) {
            fetchCacheURLsMapping(string, file);
        }
        this.cacheURLMapping = getCacheURLMapping();
    }

    private java.util.Map<java.lang.String, java.lang.Long> getCacheURLMapping() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(com.helpshift.util.FileUtil.readFileToString(getCacheURLsConfigFilePath())).getJSONArray("url_paths");
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                hashMap.put(jSONObject.getString("path"), java.lang.Long.valueOf(jSONObject.optLong("ttl", 86400000L)));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting URLs mapping", e);
        }
        return hashMap;
    }

    private long getCacheURLsConfigTTL() {
        try {
            return new org.json.JSONObject(com.helpshift.util.FileUtil.readFileToString(getCacheURLsConfigFilePath())).optLong("ttl", 86400000L);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting cache mapping ttl", e);
            return 86400000L;
        }
    }

    private void fetchCacheURLsMapping(java.lang.String str, java.io.File file) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.helpshift.util.Utils.isNotEmpty(str)) {
            hashMap.put(com.google.common.net.HttpHeaders.IF_NONE_MATCH, str);
        }
        com.helpshift.network.HSDownloaderResponse downloadResource = this.hsDownloaderNetwork.downloadResource(this.cacheUrlConfigRoute, hashMap, file);
        if (!downloadResource.isSuccess) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to download the URLs mapping file " + this.cacheUrlConfigRoute + " Error code " + downloadResource.status);
            return;
        }
        setString(CACHE_URL_MAPPING_ETAG, downloadResource.etag);
        setLong(CACHE_URL_MAPPING_LAST_SUCCESS_TIME, java.lang.System.currentTimeMillis());
    }

    public java.io.InputStream fetchCachedResourceStream(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            java.io.File fetchCachedResource = fetchCachedResource(str, str2, str3, map);
            if (fetchCachedResource != null) {
                return new java.io.BufferedInputStream(new java.io.FileInputStream(fetchCachedResource));
            }
            com.helpshift.log.HSLogger.e(TAG, "Error fetching file, cache/download result is null: " + str);
            return null;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error while fetching resource file: " + str, e);
            return null;
        }
    }

    public java.io.File fetchCachedResource(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String generateURLStorageKey = com.helpshift.util.Utils.generateURLStorageKey(str2, str3);
        java.lang.String str4 = generateURLStorageKey + RESOURCE_LAST_SUCCESS_TIME_SUFFIX;
        long j = this.resourceCacheSharedPref.getLong(str4);
        java.lang.String str5 = generateURLStorageKey + ETAG_SUFFIX;
        java.lang.String string = this.resourceCacheSharedPref.getString(str5);
        long tTLForResource = getTTLForResource(str2);
        java.lang.String resourceCacheDirPath = getResourceCacheDirPath();
        java.lang.String str6 = resourceCacheDirPath + java.io.File.separator + generateURLStorageKey;
        java.io.File file = new java.io.File(str6);
        boolean exists = file.exists();
        try {
            if (shouldFetchNewResource(exists, string, j, tTLForResource)) {
                if (!exists) {
                    file.getParentFile().mkdirs();
                    string = "";
                }
                java.lang.String str7 = string;
                java.io.File file2 = new java.io.File(str6 + "_temp");
                if (com.helpshift.util.Utils.isNotEmpty(str7)) {
                    map.put(com.google.common.net.HttpHeaders.IF_NONE_MATCH, str7);
                }
                com.helpshift.network.HSDownloaderResponse downloadResource = this.hsDownloaderNetwork.downloadResource(str, map, file2);
                if (!downloadResource.isSuccess) {
                    com.helpshift.log.HSLogger.e(TAG, "Failed to download the cache resource " + str + " Error Code " + downloadResource.status);
                    return null;
                }
                if (!updateCache(downloadResource, str5, str4, file, file2, generateURLStorageKey)) {
                    return null;
                }
                deleteOlderCachedResources(resourceCacheDirPath, str2, file.getName());
            }
            return file;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error while fetching resource file: " + str, e);
            return null;
        }
    }

    private boolean shouldFetchNewResource(boolean z, java.lang.String str, long j, long j2) {
        return !z || com.helpshift.util.Utils.isEmpty(str) || j < java.lang.System.currentTimeMillis() - j2 || j < java.lang.System.currentTimeMillis() - com.helpshift.util.Utils.TIME_7DAYS_MILLIS;
    }

    private boolean updateCache(com.helpshift.network.HSDownloaderResponse hSDownloaderResponse, java.lang.String str, java.lang.String str2, java.io.File file, java.io.File file2, java.lang.String str3) {
        setString(str, hSDownloaderResponse.etag);
        setLong(str2, java.lang.System.currentTimeMillis());
        int i = hSDownloaderResponse.status;
        if (i < 200 || i > 300) {
            return true;
        }
        if (!file.delete()) {
            com.helpshift.log.HSLogger.d(TAG, "Failed to delete file : " + file.getAbsolutePath());
        }
        if (!file2.renameTo(file)) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to rename temporary file: " + file2.getAbsolutePath());
            return false;
        }
        java.lang.String str4 = str3 + MIMETYPE_SUFFIX;
        java.lang.String str5 = hSDownloaderResponse.mimetype;
        if (str5.contains("text/html")) {
            str5 = "text/html";
        }
        if (com.helpshift.util.Utils.isNotEmpty(str5)) {
            setString(str4, str5);
        }
        setString(str3 + HEADERS_SUFFIX, hSDownloaderResponse.headers.toString());
        return true;
    }

    private void deleteOlderCachedResources(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        deleteOlderCachedResource(str, str2, str3);
    }

    private void deleteOlderCachedResource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.File[] listFiles = new java.io.File(str).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        java.lang.String generateURLStorageKey = com.helpshift.util.Utils.generateURLStorageKey(str2, null);
        for (java.io.File file : listFiles) {
            java.lang.String name = file.getName();
            if (!name.equals(str3) && this.resourceCacheEvictStrategy.shouldEvictCache(name, generateURLStorageKey) && !file.delete()) {
                com.helpshift.log.HSLogger.d(TAG, "Failed to delete file : " + file.getPath());
            }
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getCachedResponseHeadersForResource(java.lang.String str, java.lang.String str2) {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap(getString(com.helpshift.util.Utils.generateURLStorageKey(str, str2) + HEADERS_SUFFIX));
    }

    public java.lang.String getResourceMimeType(java.lang.String str, java.lang.String str2) {
        return this.resourceCacheSharedPref.getString(com.helpshift.util.Utils.generateURLStorageKey(str, str2) + MIMETYPE_SUFFIX);
    }

    private java.lang.String getResourceCacheDirPath() {
        return com.helpshift.util.Utils.getResourceCacheDirPath(this.appFileDirPath, this.subdirPath);
    }

    private java.lang.String getCacheURLsConfigFilePath() {
        return getResourceCacheDirPath() + java.io.File.separator + this.cacheUrlConfigFileName;
    }

    private void setString(java.lang.String str, java.lang.String str2) {
        this.resourceCacheSharedPref.putString(str, str2);
    }

    private void setLong(java.lang.String str, long j) {
        this.resourceCacheSharedPref.putLong(str, j);
    }

    private java.lang.String getString(java.lang.String str) {
        return this.resourceCacheSharedPref.getString(str);
    }

    private long getLong(java.lang.String str) {
        return this.resourceCacheSharedPref.getLong(str);
    }

    public synchronized void deleteAllCachedFiles() {
        com.helpshift.util.FileUtil.deleteDir(getResourceCacheDirPath());
        this.resourceCacheSharedPref.clear();
        this.cacheURLMapping.clear();
    }
}
