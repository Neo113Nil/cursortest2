package com.adobe.marketing.mobile.internal.configuration;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationDownloader;", "", "<init>", "()V", "", "url", "Lkotlin/Function1;", "", "", "completionCallback", "download", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "p0", "Ljava/io/InputStream;", "p1", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/io/InputStream;Ljava/util/Map;)Ljava/util/Map;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfigurationDownloader {
    public static final java.lang.String CONFIG_CACHE_NAME = "config";
    public static final java.lang.String HTTP_HEADER_ETAG = "ETag";
    public static final java.lang.String HTTP_HEADER_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final java.lang.String HTTP_HEADER_IF_NONE_MATCH = "If-None-Match";
    public static final java.lang.String HTTP_HEADER_LAST_MODIFIED = "Last-Modified";
    public static final java.lang.String LOG_TAG = "ConfigurationDownloader";

    public final void download(final java.lang.String url, final kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, ? extends java.lang.Object>, kotlin.Unit> completionCallback) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completionCallback, "");
        if (!com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(url)) {
            completionCallback.invoke(null);
            return;
        }
        com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().get("config", url);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (cacheResult != null) {
            java.util.Map<java.lang.String, java.lang.String> metadata = cacheResult.getMetadata();
            if (metadata == null || (str = metadata.get("ETag")) == null) {
                str = "";
            }
            hashMap.put("If-None-Match", str);
            java.util.Map<java.lang.String, java.lang.String> metadata2 = cacheResult.getMetadata();
            java.lang.String str2 = metadata2 != null ? metadata2.get("Last-Modified") : null;
            long j = 0;
            if (str2 != null) {
                try {
                    j = java.lang.Long.parseLong(str2);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "");
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            hashMap.put("If-Modified-Since", com.adobe.marketing.mobile.util.TimeUtils.getRFC2822Date(j, timeZone, locale));
        }
        com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getNetworkService().connectAsync(new com.adobe.marketing.mobile.services.NetworkRequest(url, com.adobe.marketing.mobile.services.HttpMethod.GET, null, hashMap, 10, 10), new com.adobe.marketing.mobile.services.NetworkCallback() { // from class: com.adobe.marketing.mobile.internal.configuration.ConfigurationDownloader$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.services.NetworkCallback
            public final void call(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
                com.adobe.marketing.mobile.internal.configuration.ConfigurationDownloader.$r8$lambda$pOR6tejSZKhPD9FxcXZiJRRWVbU(com.adobe.marketing.mobile.internal.configuration.ConfigurationDownloader.this, url, completionCallback, httpConnecting);
            }
        });
    }

    private static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes(java.lang.String p0, java.io.InputStream p1, java.util.Map<java.lang.String, java.lang.String> p2) {
        java.lang.String readAsString = com.adobe.marketing.mobile.util.StreamUtils.readAsString(p1);
        if (readAsString == null) {
            return null;
        }
        if (readAsString.length() == 0) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, LOG_TAG, "Downloaded configuration is empty.", new java.lang.Object[0]);
            return kotlin.collections.MapsKt.emptyMap();
        }
        try {
            java.util.Map<java.lang.String, java.lang.Object> map = com.adobe.marketing.mobile.internal.util.JSONExtensionsKt.toMap(new org.json.JSONObject(new org.json.JSONTokener(readAsString)));
            byte[] bytes = readAsString.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().set("config", p0, new com.adobe.marketing.mobile.services.caching.CacheEntry(new java.io.ByteArrayInputStream(bytes), com.adobe.marketing.mobile.services.caching.CacheExpiry.never(), p2));
            return map;
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, LOG_TAG, "Exception processing downloaded configuration ".concat(java.lang.String.valueOf(e)), new java.lang.Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void $r8$lambda$pOR6tejSZKhPD9FxcXZiJRRWVbU(com.adobe.marketing.mobile.internal.configuration.ConfigurationDownloader configurationDownloader, java.lang.String str, kotlin.jvm.functions.Function1 function1, com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationDownloader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (httpConnecting == null) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, LOG_TAG, "Received a null response.", new java.lang.Object[0]);
        } else {
            int responseCode = httpConnecting.getResponseCode();
            if (responseCode == 200) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String responsePropertyValue = httpConnecting.getResponsePropertyValue("Last-Modified");
                java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "");
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.util.Date parseRFC2822Date = com.adobe.marketing.mobile.util.TimeUtils.parseRFC2822Date(responsePropertyValue, timeZone, locale);
                if (parseRFC2822Date == null) {
                    parseRFC2822Date = new java.util.Date(0L);
                }
                linkedHashMap.put("Last-Modified", java.lang.String.valueOf(parseRFC2822Date.getTime()));
                java.lang.String responsePropertyValue2 = httpConnecting.getResponsePropertyValue("ETag");
                linkedHashMap.put("ETag", responsePropertyValue2 != null ? responsePropertyValue2 : "");
                r3 = getHighSpeedVideoSizes(str, httpConnecting.getInputStream(), linkedHashMap);
            } else if (responseCode != 304) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Download result :");
                sb.append(httpConnecting.getResponseCode());
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, LOG_TAG, sb.toString(), new java.lang.Object[0]);
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Configuration from ");
                sb2.append(str);
                sb2.append(" has not been modified. Fetching from cache.");
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, LOG_TAG, sb2.toString(), new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().get("config", str);
                r3 = getHighSpeedVideoSizes(str, cacheResult != null ? cacheResult.getData() : null, cacheResult != null ? cacheResult.getMetadata() : null);
            }
        }
        if (httpConnecting != null) {
            httpConnecting.close();
        }
        function1.invoke(r3);
    }
}
