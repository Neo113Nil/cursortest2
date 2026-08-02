package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class MessageAssetDownloader {
    final java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    java.io.File getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.services.caching.CacheService getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;

    MessageAssetDownloader(java.util.List<java.lang.String> list) {
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService();
        this.getHighSpeedVideoSizes = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges();
    }

    MessageAssetDownloader() {
        this(null);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.services.caching.CacheResult> adobeCallback) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAsset - Failed to download asset, the asset url is null or empty.", new java.lang.Object[0]);
            if (adobeCallback != null) {
                adobeCallback.call(null);
                return;
            }
            return;
        }
        final com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizes, str);
        com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getNetworkService().connectAsync(new com.adobe.marketing.mobile.services.NetworkRequest(str, com.adobe.marketing.mobile.services.HttpMethod.GET, null, getHighSpeedVideoSizes(cacheResult), 5, 5), new com.adobe.marketing.mobile.services.NetworkCallback() { // from class: com.adobe.marketing.mobile.messaging.MessageAssetDownloader$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.services.NetworkCallback
            public final void call(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
                com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = com.adobe.marketing.mobile.messaging.MessageAssetDownloader.this;
                java.lang.String str2 = str;
                com.adobe.marketing.mobile.AdobeCallback adobeCallback2 = adobeCallback;
                com.adobe.marketing.mobile.services.caching.CacheResult cacheResult2 = cacheResult;
                if (httpConnecting == null) {
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAsset - connection returned from NetworkService was null. Aborting asset download for: %s", str2);
                    if (adobeCallback2 != null) {
                        adobeCallback2.call(null);
                        return;
                    }
                    return;
                }
                if (httpConnecting.getResponseCode() == 304) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAsset - Asset was cached previously: %s", str2);
                    httpConnecting.close();
                    if (adobeCallback2 != null) {
                        adobeCallback2.call(cacheResult2);
                        return;
                    }
                    return;
                }
                if (httpConnecting.getResponseCode() != 200) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAsset - Failed to download asset from URL: %s", str2);
                    httpConnecting.close();
                    if (adobeCallback2 != null) {
                        adobeCallback2.call(null);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "cacheAssetData - Failed to cache asset from %s, the asset cache location is not available.", str2);
                } else if (messageAssetDownloader.getHighSpeedVideoFpsRanges()) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "cacheAssetData - Caching asset %s.", str2);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.Date parseRFC2822Date = com.adobe.marketing.mobile.util.TimeUtils.parseRFC2822Date(httpConnecting.getResponsePropertyValue("Last-Modified"), java.util.TimeZone.getTimeZone("GMT"), java.util.Locale.US);
                    hashMap.put("Last-Modified", parseRFC2822Date == null ? java.lang.String.valueOf(new java.util.Date(0L).getTime()) : java.lang.String.valueOf(parseRFC2822Date.getTime()));
                    java.lang.String responsePropertyValue = httpConnecting.getResponsePropertyValue(com.adobe.marketing.mobile.services.NetworkingConstants.Headers.ETAG);
                    if (responsePropertyValue == null) {
                        responsePropertyValue = "";
                    }
                    hashMap.put(com.adobe.marketing.mobile.services.NetworkingConstants.Headers.ETAG, responsePropertyValue);
                    messageAssetDownloader.getHighSpeedVideoFpsRangesFor.set(messageAssetDownloader.getHighSpeedVideoSizes, str2, new com.adobe.marketing.mobile.services.caching.CacheEntry(httpConnecting.getInputStream(), com.adobe.marketing.mobile.services.caching.CacheExpiry.never(), hashMap));
                    if (adobeCallback2 != null) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "cacheAssetData - Downloaded and cached asset from %s.", str2);
                        adobeCallback2.call(messageAssetDownloader.getHighSpeedVideoFpsRangesFor.get(messageAssetDownloader.getHighSpeedVideoSizes, str2));
                    }
                } else {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "cacheAssetData - Cannot cache asset, failed to create image cache directory.", new java.lang.Object[0]);
                }
                httpConnecting.close();
            }
        });
    }

    final void Camera2StreamConfigurationMap(java.io.File file, java.util.List<java.lang.String> list) {
        if (file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                Camera2StreamConfigurationMap(file2, list);
            }
            return;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (!file.getName().equals(com.adobe.marketing.mobile.internal.util.StringEncoder.sha2hash(it.next())) && file.exists()) {
                file.delete();
            }
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(com.adobe.marketing.mobile.services.caching.CacheResult cacheResult) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (cacheResult == null) {
            return hashMap;
        }
        java.util.Map<java.lang.String, java.lang.String> metadata = cacheResult.getMetadata();
        java.lang.String str = metadata == null ? "" : metadata.get(com.adobe.marketing.mobile.services.NetworkingConstants.Headers.ETAG);
        hashMap.put("If-None-Match", str != null ? str : "");
        java.lang.String str2 = metadata == null ? null : metadata.get("Last-Modified");
        long j = 0;
        if (str2 != null) {
            try {
                j = java.lang.Long.parseLong(str2);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        hashMap.put("If-Modified-Since", com.adobe.marketing.mobile.util.TimeUtils.getRFC2822Date(j, java.util.TimeZone.getTimeZone("GMT"), java.util.Locale.US));
        return hashMap;
    }

    final boolean getHighSpeedVideoFpsRanges() {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.getHighSpeedVideoSizes)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "createAssetCacheDirectory - Failed to create asset cache directory, the asset cache location is not available.", new java.lang.Object[0]);
            return false;
        }
        try {
            java.io.File file = new java.io.File(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRanges = file;
            if (file.exists()) {
                return true;
            }
            return this.getHighSpeedVideoFpsRanges.mkdirs();
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "createAssetCacheDirectory - An unexpected error occurred while managing the image cache directory: \n %s", e.getLocalizedMessage());
            return false;
        }
    }
}
