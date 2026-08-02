package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/statsig/androidsdk/HttpUtils;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpUtils {
    public static final /* synthetic */ java.lang.String CONNECTION_HEADER_CLOSE = "CLOSE";
    public static final /* synthetic */ java.lang.String CONNECTION_HEADER_KEY = "CONNECTION";
    public static final /* synthetic */ java.lang.String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    public static final /* synthetic */ java.lang.String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    public static final /* synthetic */ java.lang.String CONTENT_TYPE_HEADER_VALUE = "application/json; charset=UTF-8";
    public static final /* synthetic */ java.lang.String ENCODING_GZIP = "gzip";
    public static final /* synthetic */ java.lang.String STATSIG_API_HEADER_KEY = "STATSIG-API-KEY";
    public static final /* synthetic */ java.lang.String STATSIG_CLIENT_TIME_HEADER_KEY = "STATSIG-CLIENT-TIME";
    public static final /* synthetic */ java.lang.String STATSIG_EVENT_COUNT = "STATSIG-EVENT-COUNT";
    public static final /* synthetic */ java.lang.String STATSIG_SDK_TYPE_KEY = "STATSIG-SDK-TYPE";
    public static final /* synthetic */ java.lang.String STATSIG_SDK_VERSION_KEY = "STATSIG-SDK-VERSION";
    public static final /* synthetic */ java.lang.String STATSIG_STABLE_ID_HEADER_KEY = "STATSIG-STABLE-ID";
    public static final java.lang.String TAG = "statsig::Http";
    private static /* synthetic */ java.lang.String dohEndpointOverride;
    private static /* synthetic */ okhttp3.OkHttpClient okHttpClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.HttpUtils.Companion INSTANCE = new com.statsig.androidsdk.HttpUtils.Companion(null);
    private static final /* synthetic */ int[] RETRY_CODES = {408, 500, 502, 503, 504, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL, 524, 599};
    private static final /* synthetic */ okhttp3.MediaType JSON_MEDIA_TYPE = okhttp3.MediaType.INSTANCE.get("application/json; charset=utf-8");
    private static /* synthetic */ java.lang.String exceptionUrlString = "https://prodregistryv2.org/v1/rgstr_e";

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u001b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010'\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0014\u0010)\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0014\u0010*\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b*\u0010\u0015R\u0014\u0010+\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b+\u0010\u0015R*\u0010,\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b,\u0010\u0015\u0012\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R*\u00105\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b:\u0010\u0003\u001a\u0004\b7\u0010\u0010\"\u0004\b8\u00109"}, d2 = {"Lcom/statsig/androidsdk/HttpUtils$Companion;", "", "<init>", "()V", "", "Lokhttp3/Interceptor;", "interceptors", "", "addInterceptors$android_sdk_release", "(Ljava/util/List;)V", "Landroid/app/Application;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "Lokhttp3/OkHttpClient;", "buildHttpClient", "(Landroid/app/Application;)Lokhttp3/OkHttpClient;", "getHttpClient$android_sdk_release", "()Lokhttp3/OkHttpClient;", "maybeInitializeHttpClient", "(Landroid/app/Application;)V", "", "CONNECTION_HEADER_CLOSE", "Ljava/lang/String;", "CONNECTION_HEADER_KEY", "CONTENT_ENCODING_HEADER_KEY", "CONTENT_TYPE_HEADER_KEY", "CONTENT_TYPE_HEADER_VALUE", "ENCODING_GZIP", "Lokhttp3/MediaType;", "JSON_MEDIA_TYPE", "Lokhttp3/MediaType;", "getJSON_MEDIA_TYPE$android_sdk_release", "()Lokhttp3/MediaType;", "", "RETRY_CODES", "[I", "getRETRY_CODES$android_sdk_release", "()[I", "STATSIG_API_HEADER_KEY", "STATSIG_CLIENT_TIME_HEADER_KEY", "STATSIG_EVENT_COUNT", "STATSIG_SDK_TYPE_KEY", "STATSIG_SDK_VERSION_KEY", "STATSIG_STABLE_ID_HEADER_KEY", "TAG", "dohEndpointOverride", "getDohEndpointOverride", "()Ljava/lang/String;", "setDohEndpointOverride", "(Ljava/lang/String;)V", "getDohEndpointOverride$annotations", "exceptionUrlString", "getExceptionUrlString$android_sdk_release", "setExceptionUrlString$android_sdk_release", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "getOkHttpClient$annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getDohEndpointOverride$annotations() {
        }

        public static /* synthetic */ void getOkHttpClient$annotations() {
        }

        private Companion() {
        }

        public final int[] getRETRY_CODES$android_sdk_release() {
            return com.statsig.androidsdk.HttpUtils.RETRY_CODES;
        }

        public final okhttp3.MediaType getJSON_MEDIA_TYPE$android_sdk_release() {
            return com.statsig.androidsdk.HttpUtils.JSON_MEDIA_TYPE;
        }

        public final java.lang.String getExceptionUrlString$android_sdk_release() {
            return com.statsig.androidsdk.HttpUtils.exceptionUrlString;
        }

        public final void setExceptionUrlString$android_sdk_release(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.statsig.androidsdk.HttpUtils.exceptionUrlString = str;
        }

        public final okhttp3.OkHttpClient getOkHttpClient() {
            return com.statsig.androidsdk.HttpUtils.okHttpClient;
        }

        public final void setOkHttpClient(okhttp3.OkHttpClient okHttpClient) {
            com.statsig.androidsdk.HttpUtils.okHttpClient = okHttpClient;
        }

        public final /* synthetic */ okhttp3.OkHttpClient getHttpClient$android_sdk_release() {
            if (getOkHttpClient() != null) {
                okhttp3.OkHttpClient okHttpClient = getOkHttpClient();
                kotlin.jvm.internal.Intrinsics.checkNotNull(okHttpClient);
                return okHttpClient;
            }
            setOkHttpClient(buildHttpClient(null));
            okhttp3.OkHttpClient okHttpClient2 = getOkHttpClient();
            kotlin.jvm.internal.Intrinsics.checkNotNull(okHttpClient2);
            return okHttpClient2;
        }

        public final /* synthetic */ void maybeInitializeHttpClient(android.app.Application app2) {
            if (getOkHttpClient() == null) {
                setOkHttpClient(buildHttpClient(app2));
            }
        }

        public final java.lang.String getDohEndpointOverride() {
            return com.statsig.androidsdk.HttpUtils.dohEndpointOverride;
        }

        public final void setDohEndpointOverride(java.lang.String str) {
            com.statsig.androidsdk.HttpUtils.dohEndpointOverride = str;
        }

        static /* synthetic */ okhttp3.OkHttpClient buildHttpClient$default(com.statsig.androidsdk.HttpUtils.Companion companion, android.app.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = null;
            }
            return companion.buildHttpClient(application);
        }

        private final okhttp3.OkHttpClient buildHttpClient(android.app.Application app2) {
            okhttp3.Cache cache;
            if (app2 != null) {
                cache = new okhttp3.Cache(new java.io.File(app2.getCacheDir(), "statsig_http_cache_".concat(java.lang.String.valueOf(app2.getApplicationInfo().processName))), 52428800L);
            } else {
                cache = null;
            }
            okhttp3.OkHttpClient.Builder cache2 = new okhttp3.OkHttpClient.Builder().cache(cache);
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            java.time.Duration ofSeconds = java.time.Duration.ofSeconds(kotlin.time.Duration.m23956getInWholeSecondsimpl(kotlin.time.DurationKt.toDuration(500, kotlin.time.DurationUnit.MILLISECONDS)), kotlin.time.Duration.m23958getNanosecondsComponentimpl(r1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofSeconds, "");
            okhttp3.OkHttpClient build = cache2.connectTimeout(ofSeconds).retryOnConnectionFailure(false).build();
            java.lang.String dohEndpointOverride = getDohEndpointOverride();
            if (dohEndpointOverride == null) {
                dohEndpointOverride = com.statsig.androidsdk.DnsTxtQueryKt.DNS_QUERY_ENDPOINT;
            }
            okhttp3.OkHttpClient.Builder dns = build.newBuilder().dns(new com.statsig.androidsdk.DohDnsWithSystemFallback(new okhttp3.dnsoverhttps.DnsOverHttps.Builder().client(build).url(okhttp3.HttpUrl.INSTANCE.get(dohEndpointOverride)).build(), null, 2, null));
            kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
            java.time.Duration ofSeconds2 = java.time.Duration.ofSeconds(kotlin.time.Duration.m23956getInWholeSecondsimpl(kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS)), kotlin.time.Duration.m23958getNanosecondsComponentimpl(r0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofSeconds2, "");
            return dns.connectTimeout(ofSeconds2).build();
        }

        public final void addInterceptors$android_sdk_release(java.util.List<? extends okhttp3.Interceptor> interceptors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "");
            if (interceptors.isEmpty() || getOkHttpClient() == null) {
                return;
            }
            okhttp3.OkHttpClient okHttpClient = com.statsig.androidsdk.HttpUtils.INSTANCE.getOkHttpClient();
            kotlin.jvm.internal.Intrinsics.checkNotNull(okHttpClient);
            okhttp3.OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            java.util.Iterator<T> it = interceptors.iterator();
            while (it.hasNext()) {
                newBuilder.addInterceptor((okhttp3.Interceptor) it.next());
            }
            com.statsig.androidsdk.HttpUtils.INSTANCE.setOkHttpClient(newBuilder.build());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
