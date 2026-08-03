package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    public static final com.moloco.sdk.internal.client_metrics_data.e b = new com.moloco.sdk.internal.client_metrics_data.e("SDKInit", 0, "sdk_init_time");
    public static final com.moloco.sdk.internal.client_metrics_data.e c = new com.moloco.sdk.internal.client_metrics_data.e("SDKPerformInitAttempt", 1, "sdk_perform_init_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e d = new com.moloco.sdk.internal.client_metrics_data.e("SDKInitHttpRequest", 2, "sdk_init_request_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e e = new com.moloco.sdk.internal.client_metrics_data.e("SDKInitCacheRead", 3, "sdk_init_cache_read_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e f = new com.moloco.sdk.internal.client_metrics_data.e("SDKInitCacheWrite", 4, "sdk_init_cache_write_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e g = new com.moloco.sdk.internal.client_metrics_data.e("SDKInitCacheClear", 5, "sdk_init_cache_clear_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e h = new com.moloco.sdk.internal.client_metrics_data.e("CreateAd", 6, "create_ad_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e i = new com.moloco.sdk.internal.client_metrics_data.e("CreateAdAwaitAdFactory", 7, "create_ad_await_ad_factory_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e j = new com.moloco.sdk.internal.client_metrics_data.e("LoadAd", 8, "load_ad_time");
    public static final com.moloco.sdk.internal.client_metrics_data.e k = new com.moloco.sdk.internal.client_metrics_data.e("NativePrepareAd", 9, "native_ad_load_prepare_time");
    public static final com.moloco.sdk.internal.client_metrics_data.e l = new com.moloco.sdk.internal.client_metrics_data.e("BidTokenFetch", 10, "bid_token_fetch_time");
    public static final com.moloco.sdk.internal.client_metrics_data.e m = new com.moloco.sdk.internal.client_metrics_data.e("ServerBidTokenFetch", 11, "sbt_fetch_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e n = new com.moloco.sdk.internal.client_metrics_data.e("ServerBidTokenApiFetchTime", 12, "sbt_api_fetch_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e o = new com.moloco.sdk.internal.client_metrics_data.e("ClientBidTokenBuild", 13, "bid_token_build_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e p = new com.moloco.sdk.internal.client_metrics_data.e("LoadToShow", 14, "load_to_show_time");
    public static final com.moloco.sdk.internal.client_metrics_data.e q = new com.moloco.sdk.internal.client_metrics_data.e("CreateToLoad", 15, "ad_create_to_load_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e r = new com.moloco.sdk.internal.client_metrics_data.e("WebviewLoadAd", 16, "webview_load_ad_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e s = new com.moloco.sdk.internal.client_metrics_data.e("WebviewEventHandled", 17, "webview_event_handled_time_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e t = new com.moloco.sdk.internal.client_metrics_data.e("WebviewEventHandlerLatency", 18, "webview_event_handler_latency_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e u = new com.moloco.sdk.internal.client_metrics_data.e("WebviewPageLoadLatency", 19, "webview_page_load_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e v = new com.moloco.sdk.internal.client_metrics_data.e("WebviewRequiredContentLoadLatency", 20, "webview_required_content_load_ms");
    public static final com.moloco.sdk.internal.client_metrics_data.e w = new com.moloco.sdk.internal.client_metrics_data.e("VastShowFileNotExistsLoadToShow", 21, "vast_show_file_not_exists_load_to_show_ms");
    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.e[] x;
    public static final /* synthetic */ kotlin.enums.EnumEntries y;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6943a;

    static {
        com.moloco.sdk.internal.client_metrics_data.e[] a2 = a();
        x = a2;
        y = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public e(java.lang.String str, int i2, java.lang.String str2) {
        this.f6943a = str2;
    }

    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.e[] a() {
        return new com.moloco.sdk.internal.client_metrics_data.e[]{b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.client_metrics_data.e> b() {
        return y;
    }

    public static com.moloco.sdk.internal.client_metrics_data.e valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.client_metrics_data.e) java.lang.Enum.valueOf(com.moloco.sdk.internal.client_metrics_data.e.class, str);
    }

    public static com.moloco.sdk.internal.client_metrics_data.e[] values() {
        return (com.moloco.sdk.internal.client_metrics_data.e[]) x.clone();
    }

    public final java.lang.String c() {
        return this.f6943a;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f6943a;
    }
}
