package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/analytics/HerdAnalyticsClient;", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "Lcom/izettle/android/net/HttpClient;", "client", "", "url", "<init>", "(Lcom/izettle/android/net/HttpClient;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", "events", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "request", "(Ljava/util/List;Lcom/zettle/sdk/commons/network/NetworkClient$Callback;)V", "getHighSpeedVideoSizes", "Lcom/izettle/android/net/HttpClient;", "getHighResolutionOutputSizeshNQ4ISI", "", "maxBatchSize", com.visa.cbp.getEncExpo.warmup, "getMaxBatchSize", "()I", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HerdAnalyticsClient implements com.zettle.sdk.analytics.AnalyticsClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.HerdAnalyticsClient.Companion INSTANCE = new com.zettle.sdk.analytics.HerdAnalyticsClient.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.izettle.android.net.HttpClient getHighResolutionOutputSizeshNQ4ISI;
    private final int maxBatchSize;
    private final java.lang.String tag;

    public HerdAnalyticsClient(com.izettle.android.net.HttpClient httpClient, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = httpClient;
        this.getHighSpeedVideoFpsRanges = str;
        this.tag = "herd";
        this.maxBatchSize = 1;
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
        final org.json.JSONObject jSONObject = (org.json.JSONObject) kotlin.collections.CollectionsKt.first((java.util.List) events);
        com.izettle.android.net.Request build = new com.izettle.android.net.Request.Builder().method(com.izettle.android.net.HttpMethod.POST).url(com.izettle.android.net.HttpUrl.INSTANCE.parse(this.getHighSpeedVideoFpsRanges)).body(new com.izettle.android.net.RequestBody(jSONObject) { // from class: com.zettle.sdk.analytics.HerdAnalyticsClient$request$body$1
            private final long contentLength;
            private final com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_JSON();
            final /* synthetic */ org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = jSONObject;
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
                java.lang.String jSONObject2 = this.getHighResolutionOutputSizeshNQ4ISI.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                byte[] bytes = jSONObject2.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                return new java.io.ByteArrayInputStream(bytes);
            }
        }).build();
        com.zettle.sdk.analytics.CallbackWrapper callbackWrapper = new com.zettle.sdk.analytics.CallbackWrapper(callback);
        this.getHighResolutionOutputSizeshNQ4ISI.executeRequestAsync(build, new com.zettle.sdk.analytics.HerdAnalyticsClient$request$1(callbackWrapper), new com.zettle.sdk.analytics.HerdAnalyticsClient$request$2(callbackWrapper));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/HerdAnalyticsClient$Companion;", "", "<init>", "()V", "", "isDebug", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "create", "(Z)Lcom/zettle/sdk/analytics/AnalyticsClient;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.analytics.AnalyticsClient create(boolean isDebug) {
            return new com.zettle.sdk.analytics.HerdAnalyticsClient(com.izettle.android.net.HttpClientKt.httpClient(new kotlin.jvm.functions.Function1<com.izettle.android.net.HttpClient.Builder, kotlin.Unit>() { // from class: com.zettle.sdk.analytics.HerdAnalyticsClient$Companion$create$client$1
                public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.HttpClient.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setCookiesStorage(new com.zettle.sdk.commons.network.InMemoryCookieJar());
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.HttpClient.Builder builder) {
                    getHighSpeedVideoFpsRanges(builder);
                    return kotlin.Unit.INSTANCE;
                }
            }), isDebug ? "https://herd.izettletest.com/attemptreport" : "https://herd.izettle.com/attemptreport");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
