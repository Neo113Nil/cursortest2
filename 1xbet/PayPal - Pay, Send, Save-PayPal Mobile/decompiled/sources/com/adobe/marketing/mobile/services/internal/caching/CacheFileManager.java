package com.adobe.marketing.mobile.services.internal.caching;

/* loaded from: classes3.dex */
class CacheFileManager {
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    CacheFileManager(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    final java.io.File getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, str2);
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        java.io.File file = new java.io.File(Camera2StreamConfigurationMap);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    static boolean getHighSpeedVideoSizes(com.adobe.marketing.mobile.services.caching.CacheEntry cacheEntry, java.lang.String str, java.lang.String str2) {
        if (cacheEntry != null && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("pathToFile", str);
            java.util.Date expiration = cacheEntry.getExpiry().getExpiration();
            if (expiration != null) {
                hashMap.put("expiryInMillis", java.lang.String.valueOf(expiration.getTime()));
            }
            if (cacheEntry.getMetadata() != null) {
                hashMap.putAll(cacheEntry.getMetadata());
            }
            try {
                return com.adobe.marketing.mobile.internal.util.FileUtils.readInputStreamIntoFile(new java.io.File(str2), new java.io.ByteArrayInputStream(new org.json.JSONObject(hashMap).toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)), false);
            } catch (java.lang.Exception e) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Cannot create cache metadata %s", e);
            }
        }
        return false;
    }

    static boolean getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        return (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) ? false : true;
    }

    final java.lang.String Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            return null;
        }
        java.lang.String sha2hash = com.adobe.marketing.mobile.util.StringEncoder.sha2hash(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir().getPath());
        sb.append(java.io.File.separator);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(java.io.File.separator);
        sb.append(str);
        sb.append(java.io.File.separator);
        sb.append(sha2hash);
        return sb.toString();
    }

    final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, str2);
            if (highSpeedVideoFpsRangesFor == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Metadata location forcache name: [%s], cache key [%s] is null.", str, str2);
                return null;
            }
            java.lang.String readAsString = com.adobe.marketing.mobile.internal.util.FileUtils.readAsString(new java.io.File(highSpeedVideoFpsRangesFor));
            if (readAsString == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Metadata stored forcache name: [%s], cache key [%s] is null.", str, str2);
                return null;
            }
            try {
                java.util.HashMap hashMap = new java.util.HashMap();
                org.json.JSONObject jSONObject = new org.json.JSONObject(new org.json.JSONTokener(readAsString));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
                return hashMap;
            } catch (org.json.JSONException e) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "CacheFileManager", "Cannot create cache metadata forcache name: [%s], cache key: [%s] due to %s", str, str2, e.getMessage());
            }
        }
        return null;
    }

    final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Camera2StreamConfigurationMap(str, str2));
        sb.append("_metadata.txt");
        return sb.toString();
    }
}
