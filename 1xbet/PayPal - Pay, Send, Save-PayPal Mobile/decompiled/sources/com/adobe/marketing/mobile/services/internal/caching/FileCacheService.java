package com.adobe.marketing.mobile.services.internal.caching;

/* loaded from: classes3.dex */
public class FileCacheService implements com.adobe.marketing.mobile.services.caching.CacheService {
    private final com.adobe.marketing.mobile.services.internal.caching.CacheFileManager Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.services.internal.caching.CacheFileManager("aepsdkcache");

    @Override // com.adobe.marketing.mobile.services.caching.CacheService
    public boolean set(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.services.caching.CacheEntry cacheEntry) {
        com.adobe.marketing.mobile.services.internal.caching.CacheFileManager cacheFileManager = this.Camera2StreamConfigurationMap;
        java.io.File file = null;
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            java.io.File applicationCacheDir = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
            if (!com.adobe.marketing.mobile.internal.util.FileUtils.isWritableDirectory(applicationCacheDir)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "App cache directory is not writable.", new java.lang.Object[0]);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cacheFileManager.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(java.io.File.separator);
                sb.append(str);
                java.io.File file2 = new java.io.File(applicationCacheDir, sb.toString());
                if (file2.exists() || file2.mkdirs()) {
                    file = file2;
                } else {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Cannot create cache bucket.", new java.lang.Object[0]);
                }
            }
        }
        if (file == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "FileCacheService", "Could not set value for key: [%s] in cache: [%s].Cache creation failed.", new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.services.internal.caching.CacheFileManager cacheFileManager2 = this.Camera2StreamConfigurationMap;
        if (!com.adobe.marketing.mobile.services.internal.caching.CacheFileManager.getHighSpeedVideoFpsRanges(str, str2)) {
            return false;
        }
        java.lang.String Camera2StreamConfigurationMap = cacheFileManager2.Camera2StreamConfigurationMap(str, str2);
        if (Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Entry location for cache name: [%s], cache key [%s] is null.", str, str2);
            return false;
        }
        if (!com.adobe.marketing.mobile.internal.util.FileUtils.readInputStreamIntoFile(new java.io.File(Camera2StreamConfigurationMap), cacheEntry.getData(), false)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Failed to save cache file for cache name: [%s], cache key [%s].", str, str2);
            return false;
        }
        if (com.adobe.marketing.mobile.services.internal.caching.CacheFileManager.getHighSpeedVideoSizes(cacheEntry, Camera2StreamConfigurationMap, cacheFileManager2.getHighSpeedVideoFpsRangesFor(str, str2))) {
            return true;
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Failed to save metadata forcache name: [%s], cache key [%s].", str, str2);
        com.adobe.marketing.mobile.internal.util.FileUtils.deleteFile(new java.io.File(Camera2StreamConfigurationMap), true);
        return false;
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheService
    public com.adobe.marketing.mobile.services.caching.CacheResult get(java.lang.String str, java.lang.String str2) {
        java.io.File highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(str, str2);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(str, str2);
        if (highSpeedVideoSizes == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "FileCacheService", "Could not find metadata for key: [%s] in cache: [%s].", new java.lang.Object[0]);
            remove(str, str2);
            return null;
        }
        com.adobe.marketing.mobile.services.caching.CacheExpiry highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highSpeedVideoSizes.get("expiryInMillis"));
        if (highSpeedVideoFpsRanges.isExpired()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "FileCacheService", "Cache entry for key: [%s] in cache: [%s] has expired.", new java.lang.Object[0]);
            remove(str, str2);
            return null;
        }
        return new com.adobe.marketing.mobile.services.internal.caching.FileCacheResult(highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRanges, highSpeedVideoSizes);
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheService
    public boolean remove(java.lang.String str, java.lang.String str2) {
        com.adobe.marketing.mobile.services.internal.caching.CacheFileManager cacheFileManager = this.Camera2StreamConfigurationMap;
        if (!com.adobe.marketing.mobile.services.internal.caching.CacheFileManager.getHighSpeedVideoFpsRanges(str, str2)) {
            return false;
        }
        java.io.File highResolutionOutputSizeshNQ4ISI = cacheFileManager.getHighResolutionOutputSizeshNQ4ISI(str, str2);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Cannot delete cache file. No file to delete.", new java.lang.Object[0]);
        } else {
            if (!com.adobe.marketing.mobile.internal.util.FileUtils.deleteFile(highResolutionOutputSizeshNQ4ISI, true)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Failed to delete cache file for cache name [%s], key: [%s]", str, str2);
                return false;
            }
            java.lang.String highSpeedVideoFpsRangesFor = cacheFileManager.getHighSpeedVideoFpsRangesFor(str, str2);
            if (highSpeedVideoFpsRangesFor != null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Failed to delete cache metadata file for cache name [%s], key: [%s]", str, str2);
                com.adobe.marketing.mobile.internal.util.FileUtils.deleteFile(new java.io.File(highSpeedVideoFpsRangesFor), true);
            }
        }
        return true;
    }

    private static com.adobe.marketing.mobile.services.caching.CacheExpiry getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            if (str == null) {
                return com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
            }
            return com.adobe.marketing.mobile.services.caching.CacheExpiry.at(new java.util.Date(java.lang.Long.parseLong(str)));
        } catch (java.lang.NumberFormatException unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "FileCacheService", "Failed to parse expiry from stored metadata. Marking as expired", new java.lang.Object[0]);
            return com.adobe.marketing.mobile.services.caching.CacheExpiry.at(new java.util.Date(0L));
        }
    }
}
