package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.b[] e0;
    public static final /* synthetic */ kotlin.enums.EnumEntries f0;
    public final java.lang.String g0;

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.client_metrics_data.b f6940a = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitAttempt", 0, "sdk_init_attempt");
    public static final com.moloco.sdk.internal.client_metrics_data.b b = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitSuccess", 1, "sdk_init_success");
    public static final com.moloco.sdk.internal.client_metrics_data.b c = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitFailure", 2, "sdk_init_failure");
    public static final com.moloco.sdk.internal.client_metrics_data.b d = new com.moloco.sdk.internal.client_metrics_data.b("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt");
    public static final com.moloco.sdk.internal.client_metrics_data.b e = new com.moloco.sdk.internal.client_metrics_data.b("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt");
    public static final com.moloco.sdk.internal.client_metrics_data.b f = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitCacheRead", 5, "sdk_init_cache_read");
    public static final com.moloco.sdk.internal.client_metrics_data.b g = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitCacheWrite", 6, "sdk_init_cache_write");
    public static final com.moloco.sdk.internal.client_metrics_data.b h = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitCacheClear", 7, "sdk_init_cache_clear");
    public static final com.moloco.sdk.internal.client_metrics_data.b i = new com.moloco.sdk.internal.client_metrics_data.b("SDKInitFailureDifferentAppKey", 8, "sdk_init_failure_different_app_key");
    public static final com.moloco.sdk.internal.client_metrics_data.b j = new com.moloco.sdk.internal.client_metrics_data.b("CreateAd", 9, "create_ad");
    public static final com.moloco.sdk.internal.client_metrics_data.b k = new com.moloco.sdk.internal.client_metrics_data.b("LoadAdAttempt", 10, "load_ad_attempted");
    public static final com.moloco.sdk.internal.client_metrics_data.b l = new com.moloco.sdk.internal.client_metrics_data.b("LoadAdSuccess", 11, "load_ad_success");
    public static final com.moloco.sdk.internal.client_metrics_data.b m = new com.moloco.sdk.internal.client_metrics_data.b("LoadAdFailed", 12, "load_ad_failed");
    public static final com.moloco.sdk.internal.client_metrics_data.b n = new com.moloco.sdk.internal.client_metrics_data.b("NativeAdLoadAdAttempted", 13, "native_ad_load_attempted");
    public static final com.moloco.sdk.internal.client_metrics_data.b o = new com.moloco.sdk.internal.client_metrics_data.b("NativeLoadAd", 14, "native_ad_load");
    public static final com.moloco.sdk.internal.client_metrics_data.b p = new com.moloco.sdk.internal.client_metrics_data.b("BidTokenGetRequest", 15, "bid_token_get_request");
    public static final com.moloco.sdk.internal.client_metrics_data.b q = new com.moloco.sdk.internal.client_metrics_data.b("BidTokenGetResponse", 16, "bid_token_get_response");
    public static final com.moloco.sdk.internal.client_metrics_data.b r = new com.moloco.sdk.internal.client_metrics_data.b("BidTokenFetch", 17, "bid_token_fetch");
    public static final com.moloco.sdk.internal.client_metrics_data.b s = new com.moloco.sdk.internal.client_metrics_data.b("BidTokenDurationTimeoutOneSecond", 18, "bid_token_duration_crossed_1s");
    public static final com.moloco.sdk.internal.client_metrics_data.b t = new com.moloco.sdk.internal.client_metrics_data.b("BidTokenDurationTimeoutThreeSecond", 19, "bid_token_duration_crossed_3s");
    public static final com.moloco.sdk.internal.client_metrics_data.b u = new com.moloco.sdk.internal.client_metrics_data.b("ServerBidTokenFetch", 20, "sbt_fetch");
    public static final com.moloco.sdk.internal.client_metrics_data.b v = new com.moloco.sdk.internal.client_metrics_data.b("ServerBidTokenCached", 21, "sbt_cached");
    public static final com.moloco.sdk.internal.client_metrics_data.b w = new com.moloco.sdk.internal.client_metrics_data.b("ServerBidTokenApiFetch", 22, "sbt_api_fetch");
    public static final com.moloco.sdk.internal.client_metrics_data.b x = new com.moloco.sdk.internal.client_metrics_data.b("ServerBidTokenAsyncRefresh", 23, "sbt_async_fetch");
    public static final com.moloco.sdk.internal.client_metrics_data.b y = new com.moloco.sdk.internal.client_metrics_data.b("ClientBidTokenBuild", 24, "bid_token_build");
    public static final com.moloco.sdk.internal.client_metrics_data.b z = new com.moloco.sdk.internal.client_metrics_data.b("ClientBidTokenCached", 25, "cbt_cached");
    public static final com.moloco.sdk.internal.client_metrics_data.b A = new com.moloco.sdk.internal.client_metrics_data.b("ShowAdAttempt", 26, "show_ad_attempted");
    public static final com.moloco.sdk.internal.client_metrics_data.b B = new com.moloco.sdk.internal.client_metrics_data.b("ShowAdSuccess", 27, "show_ad_success");
    public static final com.moloco.sdk.internal.client_metrics_data.b C = new com.moloco.sdk.internal.client_metrics_data.b("ShowAdFailed", 28, "show_ad_failed");
    public static final com.moloco.sdk.internal.client_metrics_data.b D = new com.moloco.sdk.internal.client_metrics_data.b("AdClicked", 29, "ad_clicked");
    public static final com.moloco.sdk.internal.client_metrics_data.b E = new com.moloco.sdk.internal.client_metrics_data.b("AdClickedDeduped", 30, "ad_clicked_deduped");
    public static final com.moloco.sdk.internal.client_metrics_data.b F = new com.moloco.sdk.internal.client_metrics_data.b("CrashDetected", 31, "crash_detected");
    public static final com.moloco.sdk.internal.client_metrics_data.b G = new com.moloco.sdk.internal.client_metrics_data.b("WebviewLoadAd", 32, "webview_load_ad");
    public static final com.moloco.sdk.internal.client_metrics_data.b H = new com.moloco.sdk.internal.client_metrics_data.b("WebviewHtmlAdError", 33, "webview_html_ad_error");
    public static final com.moloco.sdk.internal.client_metrics_data.b I = new com.moloco.sdk.internal.client_metrics_data.b("WebviewHtmlAdRetryAttempt", 34, "webview_html_ad_retry_attempt");
    public static final com.moloco.sdk.internal.client_metrics_data.b J = new com.moloco.sdk.internal.client_metrics_data.b("WebviewHtmlAdIgnoredError", 35, "webview_html_ad_ignored_error");
    public static final com.moloco.sdk.internal.client_metrics_data.b K = new com.moloco.sdk.internal.client_metrics_data.b("WebviewEventHandled", 36, "webview_event_handled");
    public static final com.moloco.sdk.internal.client_metrics_data.b L = new com.moloco.sdk.internal.client_metrics_data.b("WebviewEventMultipleHandlers", 37, "webview_event_multiple_handlers");
    public static final com.moloco.sdk.internal.client_metrics_data.b M = new com.moloco.sdk.internal.client_metrics_data.b("WebviewPageLoadStart", 38, "webview_page_load_start");
    public static final com.moloco.sdk.internal.client_metrics_data.b N = new com.moloco.sdk.internal.client_metrics_data.b("WebviewPageLoadEnd", 39, "webview_page_load_end");
    public static final com.moloco.sdk.internal.client_metrics_data.b O = new com.moloco.sdk.internal.client_metrics_data.b("WebviewPageLoadFinishCallback", 40, "webview_page_load_finish_callback");
    public static final com.moloco.sdk.internal.client_metrics_data.b P = new com.moloco.sdk.internal.client_metrics_data.b("WebviewRequiredContentLoaded", 41, "webview_required_content_loaded");
    public static final com.moloco.sdk.internal.client_metrics_data.b Q = new com.moloco.sdk.internal.client_metrics_data.b("StoreLaunchStarted", 42, "store_launch_started");
    public static final com.moloco.sdk.internal.client_metrics_data.b R = new com.moloco.sdk.internal.client_metrics_data.b("StoreLaunchComplete", 43, "store_launch_complete");
    public static final com.moloco.sdk.internal.client_metrics_data.b S = new com.moloco.sdk.internal.client_metrics_data.b("TemplateBridgeNotifyReadyInvoked", 44, "template_bridge_notify_ready_invoked");
    public static final com.moloco.sdk.internal.client_metrics_data.b T = new com.moloco.sdk.internal.client_metrics_data.b("TemplateBridgeNotifyReadyCompleted", 45, "template_bridge_notify_ready_completed");
    public static final com.moloco.sdk.internal.client_metrics_data.b U = new com.moloco.sdk.internal.client_metrics_data.b("TemplateBridgeViewVisibleInvoked", 46, "template_bridge_view_visible_invoked");
    public static final com.moloco.sdk.internal.client_metrics_data.b V = new com.moloco.sdk.internal.client_metrics_data.b("TemplateBridgeViewVisibleCompleted", 47, "template_bridge_view_visible_completed");
    public static final com.moloco.sdk.internal.client_metrics_data.b W = new com.moloco.sdk.internal.client_metrics_data.b("FullscreenWebviewActivityOnCreate", 48, "fullscreen_webview_activity_create");
    public static final com.moloco.sdk.internal.client_metrics_data.b X = new com.moloco.sdk.internal.client_metrics_data.b("RewardIssued", 49, "reward_issued");
    public static final com.moloco.sdk.internal.client_metrics_data.b Y = new com.moloco.sdk.internal.client_metrics_data.b("UnknownCreativeType", 50, "unknown_creative_type");
    public static final com.moloco.sdk.internal.client_metrics_data.b Z = new com.moloco.sdk.internal.client_metrics_data.b("WebViewNotAvailable", 51, "webview_not_available");
    public static final com.moloco.sdk.internal.client_metrics_data.b a0 = new com.moloco.sdk.internal.client_metrics_data.b("VastShowFileNotExists", 52, "vast_show_file_not_exists");
    public static final com.moloco.sdk.internal.client_metrics_data.b b0 = new com.moloco.sdk.internal.client_metrics_data.b("SoftwareRenderingDetected", 53, "software_rendering_detected");
    public static final com.moloco.sdk.internal.client_metrics_data.b c0 = new com.moloco.sdk.internal.client_metrics_data.b("ExoPlayerError", 54, "exoplayer_error");
    public static final com.moloco.sdk.internal.client_metrics_data.b d0 = new com.moloco.sdk.internal.client_metrics_data.b("AdHidden", 55, "ad_hidden");

    static {
        com.moloco.sdk.internal.client_metrics_data.b[] a2 = a();
        e0 = a2;
        f0 = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public b(java.lang.String str, int i2, java.lang.String str2) {
        this.g0 = str2;
    }

    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.b[] a() {
        return new com.moloco.sdk.internal.client_metrics_data.b[]{f6940a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.client_metrics_data.b> b() {
        return f0;
    }

    public static com.moloco.sdk.internal.client_metrics_data.b valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.client_metrics_data.b) java.lang.Enum.valueOf(com.moloco.sdk.internal.client_metrics_data.b.class, str);
    }

    public static com.moloco.sdk.internal.client_metrics_data.b[] values() {
        return (com.moloco.sdk.internal.client_metrics_data.b[]) e0.clone();
    }

    public final java.lang.String c() {
        return this.g0;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.g0;
    }
}
