package com.adobe.marketing.mobile.launch.rulesengine.download;

/* loaded from: classes7.dex */
public class RulesLoader {
    final java.lang.String Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper getHighResolutionOutputSizeshNQ4ISI;

    public RulesLoader(java.lang.String str) {
        this(str, new com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper());
    }

    private RulesLoader(java.lang.String str, com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper rulesZipProcessingHelper) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Name cannot be null or empty");
        }
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = rulesZipProcessingHelper;
    }

    public void loadFromUrl(final java.lang.String str, final com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult> adobeCallback) {
        if (!com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str)) {
            com.adobe.marketing.mobile.services.Log.trace("RulesLoader", this.Camera2StreamConfigurationMap, "Provided download url: %s is null or empty. ", str);
            adobeCallback.call(new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.INVALID_SOURCE));
        } else {
            com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getNetworkService().connectAsync(new com.adobe.marketing.mobile.services.NetworkRequest(str, com.adobe.marketing.mobile.services.HttpMethod.GET, null, getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().get(this.Camera2StreamConfigurationMap, str)), 10, 10), new com.adobe.marketing.mobile.services.NetworkCallback() { // from class: com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.services.NetworkCallback
                public final void call(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
                    com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult highResolutionOutputSizeshNQ4ISI;
                    com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader rulesLoader = com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader.this;
                    java.lang.String str2 = str;
                    com.adobe.marketing.mobile.AdobeCallback adobeCallback2 = adobeCallback;
                    if (httpConnecting == null) {
                        com.adobe.marketing.mobile.services.Log.trace("RulesLoader", rulesLoader.Camera2StreamConfigurationMap, "Received null response.", new java.lang.Object[0]);
                        highResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NO_DATA);
                    } else {
                        int responseCode = httpConnecting.getResponseCode();
                        if (responseCode == 200) {
                            java.io.InputStream inputStream = httpConnecting.getInputStream();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            java.util.Date parseRFC2822Date = com.adobe.marketing.mobile.util.TimeUtils.parseRFC2822Date(httpConnecting.getResponsePropertyValue("Last-Modified"), java.util.TimeZone.getTimeZone("GMT"), java.util.Locale.US);
                            hashMap.put("Last-Modified", parseRFC2822Date == null ? java.lang.String.valueOf(new java.util.Date(0L).getTime()) : java.lang.String.valueOf(parseRFC2822Date.getTime()));
                            java.lang.String responsePropertyValue = httpConnecting.getResponsePropertyValue("ETag");
                            if (responsePropertyValue == null) {
                                responsePropertyValue = "";
                            }
                            hashMap.put("ETag", responsePropertyValue);
                            highResolutionOutputSizeshNQ4ISI = rulesLoader.getHighResolutionOutputSizeshNQ4ISI(str2, inputStream, hashMap);
                        } else if (responseCode != 304) {
                            com.adobe.marketing.mobile.services.Log.trace("RulesLoader", rulesLoader.Camera2StreamConfigurationMap, "Received download response: %s", java.lang.Integer.valueOf(httpConnecting.getResponseCode()));
                            highResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NO_DATA);
                        } else {
                            highResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NOT_MODIFIED);
                        }
                    }
                    if (httpConnecting != null) {
                        httpConnecting.close();
                    }
                    adobeCallback2.call(highResolutionOutputSizeshNQ4ISI);
                }
            });
        }
    }

    public com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult loadFromAsset(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.INVALID_SOURCE);
        }
        java.io.InputStream asset = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getAsset(str);
        if (asset == null) {
            com.adobe.marketing.mobile.services.Log.trace("RulesLoader", this.Camera2StreamConfigurationMap, "Provided asset: %s is invalid.", str);
            return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.INVALID_SOURCE);
        }
        return getHighResolutionOutputSizeshNQ4ISI(str, asset, new java.util.HashMap());
    }

    public com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult loadFromCache(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.INVALID_SOURCE);
        }
        com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().get(this.Camera2StreamConfigurationMap, str);
        if (cacheResult == null) {
            return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NO_DATA);
        }
        return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(com.adobe.marketing.mobile.util.StreamUtils.readAsString(cacheResult.getData()), com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.SUCCESS);
    }

    public java.lang.String getCacheName() {
        return this.Camera2StreamConfigurationMap;
    }

    com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.io.InputStream inputStream, java.util.Map<java.lang.String, java.lang.String> map) {
        if (inputStream == null) {
            com.adobe.marketing.mobile.services.Log.debug("RulesLoader", this.Camera2StreamConfigurationMap, "Zip content stream is null", new java.lang.Object[0]);
            return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NO_DATA);
        }
        if (com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.Camera2StreamConfigurationMap(str)) {
            java.io.File highSpeedVideoFpsRanges = com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.getHighSpeedVideoFpsRanges(str);
            if (!highSpeedVideoFpsRanges.exists() && !highSpeedVideoFpsRanges.mkdirs()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Cannot access application cache directory to create temp dir.", new java.lang.Object[0]);
            } else {
                if (com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.Camera2StreamConfigurationMap(str)) {
                    if (com.adobe.marketing.mobile.internal.util.FileUtils.readInputStreamIntoFile(com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.getHighResolutionOutputSizeshNQ4ISI(str), inputStream, false)) {
                        java.lang.String highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(str);
                        if (highSpeedVideoFpsRangesFor == null) {
                            com.adobe.marketing.mobile.services.Log.debug("RulesLoader", this.Camera2StreamConfigurationMap, "Failed to extract rules response zip into temp dir.", new java.lang.Object[0]);
                            return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.ZIP_EXTRACTION_FAILED);
                        }
                        if (!com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().set(this.Camera2StreamConfigurationMap, str, new com.adobe.marketing.mobile.services.caching.CacheEntry(new java.io.ByteArrayInputStream(highSpeedVideoFpsRangesFor.getBytes(java.nio.charset.StandardCharsets.UTF_8)), com.adobe.marketing.mobile.services.caching.CacheExpiry.never(), map))) {
                            com.adobe.marketing.mobile.services.Log.debug("RulesLoader", this.Camera2StreamConfigurationMap, "Could not cache rules from source %s", str);
                        }
                        if (com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.Camera2StreamConfigurationMap(str)) {
                            com.adobe.marketing.mobile.internal.util.FileUtils.deleteFile(com.adobe.marketing.mobile.launch.rulesengine.download.RulesZipProcessingHelper.getHighSpeedVideoFpsRanges(str), true);
                        }
                        return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(highSpeedVideoFpsRangesFor, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.SUCCESS);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Cannot read response content into temp dir.", new java.lang.Object[0]);
                }
                com.adobe.marketing.mobile.services.Log.debug("RulesLoader", this.Camera2StreamConfigurationMap, "Cannot read response content into temp dir.", new java.lang.Object[0]);
                return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.CANNOT_STORE_IN_TEMP_DIR);
            }
        }
        com.adobe.marketing.mobile.services.Log.debug("RulesLoader", this.Camera2StreamConfigurationMap, "Cannot access application cache directory to create temp dir.", new java.lang.Object[0]);
        return new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult(null, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.CANNOT_CREATE_TEMP_DIR);
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.services.caching.CacheResult cacheResult) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (cacheResult == null) {
            return hashMap;
        }
        java.util.Map<java.lang.String, java.lang.String> metadata = cacheResult.getMetadata();
        java.lang.String str = metadata == null ? "" : metadata.get("ETag");
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
}
