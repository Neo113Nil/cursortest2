package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/analytics/GdpAnalyticsClient;", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "Lcom/izettle/android/net/HttpClient;", "client", "", "url", "authToken", "<init>", "(Lcom/izettle/android/net/HttpClient;Ljava/lang/String;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", "events", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "request", "(Ljava/util/List;Lcom/zettle/sdk/commons/network/NetworkClient$Callback;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/izettle/android/net/HttpClient;", "getHighSpeedVideoFpsRanges", "", "maxBatchSize", com.visa.cbp.getEncExpo.warmup, "getMaxBatchSize", "()I", "tag", "getTag", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GdpAnalyticsClient implements com.zettle.sdk.analytics.AnalyticsClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.GdpAnalyticsClient.Companion INSTANCE = new com.zettle.sdk.analytics.GdpAnalyticsClient.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.izettle.android.net.HttpClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int maxBatchSize;
    private final java.lang.String tag;

    public GdpAnalyticsClient(com.izettle.android.net.HttpClient httpClient, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = httpClient;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.tag = "gdp";
        this.maxBatchSize = 100;
    }

    @Override // com.zettle.sdk.analytics.AnalyticsClient
    public final java.lang.String getTag() {
        return this.tag;
    }

    @Override // com.zettle.sdk.analytics.AnalyticsClient
    public final int getMaxBatchSize() {
        return this.maxBatchSize;
    }

    @Override // com.zettle.sdk.analytics.AnalyticsClient
    public final void request(java.util.List<? extends org.json.JSONObject> events, com.zettle.sdk.commons.network.NetworkClient.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            jSONArray = jSONArray.put((org.json.JSONObject) it.next());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "");
        }
        final org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("events", jSONArray);
        com.izettle.android.net.Request build = new com.izettle.android.net.Request.Builder().method(com.izettle.android.net.HttpMethod.POST).url(com.izettle.android.net.HttpUrl.INSTANCE.parse(this.getHighSpeedVideoSizes)).body(new com.izettle.android.net.RequestBody(jSONObject) { // from class: com.zettle.sdk.analytics.GdpAnalyticsClient$request$body$1
            final /* synthetic */ org.json.JSONObject Camera2StreamConfigurationMap;
            private final long contentLength;
            private final com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_JSON();

            {
                this.Camera2StreamConfigurationMap = jSONObject;
                this.contentLength = jSONObject.toString().length();
            }

            @Override // com.izettle.android.net.RequestBody
            public final com.izettle.android.net.ContentType getContentType() {
                return this.contentType;
            }

            @Override // com.izettle.android.net.RequestBody
            public final long getContentLength() {
                return this.contentLength;
            }

            @Override // com.izettle.android.net.RequestBody
            public final java.io.InputStream getInputStream() {
                java.lang.String jSONObject2 = this.Camera2StreamConfigurationMap.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                byte[] bytes = jSONObject2.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                return new java.io.ByteArrayInputStream(bytes);
            }
        }).header("Authorization", this.Camera2StreamConfigurationMap).header("User-Agent", "Android SDK/2.46.1").build();
        com.zettle.sdk.analytics.CallbackWrapper callbackWrapper = new com.zettle.sdk.analytics.CallbackWrapper(callback);
        this.getHighSpeedVideoFpsRanges.executeRequestAsync(build, new com.zettle.sdk.analytics.GdpAnalyticsClient$request$1(callbackWrapper), new com.zettle.sdk.analytics.GdpAnalyticsClient$request$2(callbackWrapper));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/GdpAnalyticsClient$Companion;", "", "<init>", "()V", "", "isDebug", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "create", "(Z)Lcom/zettle/sdk/analytics/AnalyticsClient;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.analytics.AnalyticsClient create(boolean isDebug) {
            java.lang.String str;
            com.zettle.sdk.commons.util.Log gdpClient = com.zettle.sdk.analytics.GdpKt.getGdpClient(com.zettle.sdk.commons.util.Log.INSTANCE);
            if (isDebug) {
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(gdpClient, "[GDP] build is Debug, using TEST gdp token", null, 2, null);
                str = "X3qoVlksZMumi4z34wZuvZUglzqXVYQG";
            } else {
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(gdpClient, "[GDP] build is release, using BuildConfig gdp token", null, 2, null);
                str = "null";
            }
            if (str.length() == 0) {
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(gdpClient, "[GDP] no token found. Abort", null, 2, null);
                throw new java.lang.IllegalStateException("No GDP token found");
            }
            byte[] bytes = "ANDROID:".concat(str).getBytes(kotlin.text.Charsets.ISO_8859_1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new com.zettle.sdk.analytics.GdpAnalyticsClient(com.izettle.android.net.HttpClientKt.httpClient(new kotlin.jvm.functions.Function1<com.izettle.android.net.HttpClient.Builder, kotlin.Unit>() { // from class: com.zettle.sdk.analytics.GdpAnalyticsClient$Companion$create$client$1
                public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.HttpClient.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setCookiesStorage(new com.zettle.sdk.commons.network.InMemoryCookieJar());
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.HttpClient.Builder builder) {
                    getHighResolutionOutputSizeshNQ4ISI(builder);
                    return kotlin.Unit.INSTANCE;
                }
            }), isDebug ? "https://tracking.izettletest.com/events" : "https://tracking.izettle.com/events", "Basic ".concat(java.lang.String.valueOf(android.util.Base64.encodeToString(bytes, 2))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
