package com.paypal.oslo.feature.inappcheckout.features.analytics.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsImpressionEvent;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutAnalyticsImpressionEvent extends com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsEvent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.Companion(null);
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent APPSWITCH_DEEPLINK_URL_RECEIVED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("modxo_app_switch_deeplink_url_received");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent INBOUND_LINK_RESOLVED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("link_resolved");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent OUTBOUND_LINK_RESOLVED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("link_resolved");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_AUTH_FLOW_INITIATED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_auth_flow_initiated");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent AUTH_CODE_EXCHANGE_COMPLETED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("auth_code_exchange_completed");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent GET_TOKEN_STATUS = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("get_token_status");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent GET_TOKEN_FAILED_TRY_AGAIN_SHOWN = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("get_token_failed_try_again_shown");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent NON_RECOVERABLE_ERROR_SCREEN_SHOWN = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("non_recoverable_error_shown");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_CANCEL_CLICKED_ON_RYP = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_cancel_clicked_on_ryp");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_COMPLETE_XO = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_complete_xo");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent REDIRECT_TO_MERCHANT_APP_INITIATED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("redirect_to_merchant_app_initiated");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_LAUNCH_XO = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_launch_xo");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_LAUNCH_XO_ERROR = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_launch_xo_error");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent ON_BUTTON_FORWARD_PRESSED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("webview_bottom_button_forward_pressed");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent ON_BUTTON_BACKWARD_PRESSED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("webview_bottom_button_backward_pressed");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent SWITCH_TO_CONSUMER_APP_SUCCESS = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.SWITCH_TO_CONSUMER_APP_SUCCESS);
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent SWITCH_TO_CONSUMER_APP_FAILURE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("switch_to_consumer_app_failure");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent USER_CLOSED_CONSUMER_APP = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("user_closed_consumer_app");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_BACKGROUNDED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_backgrounded");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent CONSUMER_APP_FOREGROUNDED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_foregrounded");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent USER_CLICK_BACK = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("USER_CLICKED_BACK");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent FRAGMENT_DESTROYED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_fragment_destroyed");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent REDIRECT_TO_MERCHANT_INITIATED_AUTO = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("redirect_to_merchant_app_initiated_auto");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent SAVE_CANCEL_CHECKOUT_EXPERIENCE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("consumer_app_experience_user_action_cancelled");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_UNKNOWN = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_unknown");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK__MU_ECS = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_mu_ecs");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_MU_VA = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_mu_va");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_MU_BILLING = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_mu_billing");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_NO_MU_ECS = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_no_mu_ecs");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_NO_MU_VA = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_no_mu_va");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_WEB_FALLBACK_NO_MU_BILLING = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_web_fallback_no_mu_billing");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_NON_FALLBACK_NATIVE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_version_gating_redirected_to_native");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent VERSION_GATING_NON_FALLBACK_WEBVIEW = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_version_gating_redirected_to_webview");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent APP_SWITCH_ELMO_EXPERIMENT = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("app_switch_inappcheckout_experiments");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent READY_TO_LOAD_APPROVAL_URL = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("ready_to_load_approval_url");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent HOME_BACKGROUND_TIMEOUT = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent("home_background_timeout");

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001a\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsImpressionEvent$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsImpressionEvent;", "APPSWITCH_DEEPLINK_URL_RECEIVED", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsImpressionEvent;", "getAPPSWITCH_DEEPLINK_URL_RECEIVED", "()Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsImpressionEvent;", "INBOUND_LINK_RESOLVED", "getINBOUND_LINK_RESOLVED", "OUTBOUND_LINK_RESOLVED", "getOUTBOUND_LINK_RESOLVED", "CONSUMER_APP_AUTH_FLOW_INITIATED", "getCONSUMER_APP_AUTH_FLOW_INITIATED", "AUTH_CODE_EXCHANGE_COMPLETED", "getAUTH_CODE_EXCHANGE_COMPLETED", "GET_TOKEN_STATUS", "getGET_TOKEN_STATUS", "GET_TOKEN_FAILED_TRY_AGAIN_SHOWN", "getGET_TOKEN_FAILED_TRY_AGAIN_SHOWN", "NON_RECOVERABLE_ERROR_SCREEN_SHOWN", "getNON_RECOVERABLE_ERROR_SCREEN_SHOWN", "CONSUMER_APP_CANCEL_CLICKED_ON_RYP", "getCONSUMER_APP_CANCEL_CLICKED_ON_RYP", "CONSUMER_APP_COMPLETE_XO", "getCONSUMER_APP_COMPLETE_XO", "REDIRECT_TO_MERCHANT_APP_INITIATED", "getREDIRECT_TO_MERCHANT_APP_INITIATED", "CONSUMER_APP_LAUNCH_XO", "getCONSUMER_APP_LAUNCH_XO", "CONSUMER_APP_LAUNCH_XO_ERROR", "getCONSUMER_APP_LAUNCH_XO_ERROR", "ON_BUTTON_FORWARD_PRESSED", "getON_BUTTON_FORWARD_PRESSED", "ON_BUTTON_BACKWARD_PRESSED", "getON_BUTTON_BACKWARD_PRESSED", "SWITCH_TO_CONSUMER_APP_SUCCESS", "getSWITCH_TO_CONSUMER_APP_SUCCESS", "SWITCH_TO_CONSUMER_APP_FAILURE", "getSWITCH_TO_CONSUMER_APP_FAILURE", "USER_CLOSED_CONSUMER_APP", "getUSER_CLOSED_CONSUMER_APP", "CONSUMER_APP_BACKGROUNDED", "getCONSUMER_APP_BACKGROUNDED", "CONSUMER_APP_FOREGROUNDED", "getCONSUMER_APP_FOREGROUNDED", "USER_CLICK_BACK", "getUSER_CLICK_BACK", "FRAGMENT_DESTROYED", "getFRAGMENT_DESTROYED", "REDIRECT_TO_MERCHANT_INITIATED_AUTO", "getREDIRECT_TO_MERCHANT_INITIATED_AUTO", "SAVE_CANCEL_CHECKOUT_EXPERIENCE", "getSAVE_CANCEL_CHECKOUT_EXPERIENCE", "VERSION_GATING_WEB_FALLBACK_UNKNOWN", "getVERSION_GATING_WEB_FALLBACK_UNKNOWN", "VERSION_GATING_WEB_FALLBACK__MU_ECS", "getVERSION_GATING_WEB_FALLBACK__MU_ECS", "VERSION_GATING_WEB_FALLBACK_MU_VA", "getVERSION_GATING_WEB_FALLBACK_MU_VA", "VERSION_GATING_WEB_FALLBACK_MU_BILLING", "getVERSION_GATING_WEB_FALLBACK_MU_BILLING", "VERSION_GATING_WEB_FALLBACK_NO_MU_ECS", "getVERSION_GATING_WEB_FALLBACK_NO_MU_ECS", "VERSION_GATING_WEB_FALLBACK_NO_MU_VA", "getVERSION_GATING_WEB_FALLBACK_NO_MU_VA", "VERSION_GATING_WEB_FALLBACK_NO_MU_BILLING", "getVERSION_GATING_WEB_FALLBACK_NO_MU_BILLING", "VERSION_GATING_NON_FALLBACK_NATIVE", "getVERSION_GATING_NON_FALLBACK_NATIVE", "VERSION_GATING_NON_FALLBACK_WEBVIEW", "getVERSION_GATING_NON_FALLBACK_WEBVIEW", "APP_SWITCH_ELMO_EXPERIMENT", "getAPP_SWITCH_ELMO_EXPERIMENT", "READY_TO_LOAD_APPROVAL_URL", "getREADY_TO_LOAD_APPROVAL_URL", "HOME_BACKGROUND_TIMEOUT", "getHOME_BACKGROUND_TIMEOUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getAPPSWITCH_DEEPLINK_URL_RECEIVED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.APPSWITCH_DEEPLINK_URL_RECEIVED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getINBOUND_LINK_RESOLVED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INBOUND_LINK_RESOLVED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getOUTBOUND_LINK_RESOLVED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.OUTBOUND_LINK_RESOLVED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_AUTH_FLOW_INITIATED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_AUTH_FLOW_INITIATED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getAUTH_CODE_EXCHANGE_COMPLETED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.AUTH_CODE_EXCHANGE_COMPLETED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getGET_TOKEN_STATUS() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.GET_TOKEN_STATUS;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getGET_TOKEN_FAILED_TRY_AGAIN_SHOWN() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.GET_TOKEN_FAILED_TRY_AGAIN_SHOWN;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getNON_RECOVERABLE_ERROR_SCREEN_SHOWN() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.NON_RECOVERABLE_ERROR_SCREEN_SHOWN;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_CANCEL_CLICKED_ON_RYP() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_CANCEL_CLICKED_ON_RYP;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_COMPLETE_XO() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_COMPLETE_XO;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getREDIRECT_TO_MERCHANT_APP_INITIATED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.REDIRECT_TO_MERCHANT_APP_INITIATED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_LAUNCH_XO() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_LAUNCH_XO;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_LAUNCH_XO_ERROR() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_LAUNCH_XO_ERROR;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getON_BUTTON_FORWARD_PRESSED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.ON_BUTTON_FORWARD_PRESSED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getON_BUTTON_BACKWARD_PRESSED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.ON_BUTTON_BACKWARD_PRESSED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getSWITCH_TO_CONSUMER_APP_SUCCESS() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.SWITCH_TO_CONSUMER_APP_SUCCESS;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getSWITCH_TO_CONSUMER_APP_FAILURE() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.SWITCH_TO_CONSUMER_APP_FAILURE;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getUSER_CLOSED_CONSUMER_APP() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.USER_CLOSED_CONSUMER_APP;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_BACKGROUNDED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_BACKGROUNDED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getCONSUMER_APP_FOREGROUNDED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.CONSUMER_APP_FOREGROUNDED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getUSER_CLICK_BACK() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.USER_CLICK_BACK;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getFRAGMENT_DESTROYED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.FRAGMENT_DESTROYED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getREDIRECT_TO_MERCHANT_INITIATED_AUTO() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.REDIRECT_TO_MERCHANT_INITIATED_AUTO;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getSAVE_CANCEL_CHECKOUT_EXPERIENCE() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.SAVE_CANCEL_CHECKOUT_EXPERIENCE;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_UNKNOWN() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_UNKNOWN;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK__MU_ECS() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK__MU_ECS;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_MU_VA() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_MU_VA;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_MU_BILLING() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_MU_BILLING;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_NO_MU_ECS() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_NO_MU_ECS;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_NO_MU_VA() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_NO_MU_VA;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_WEB_FALLBACK_NO_MU_BILLING() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_WEB_FALLBACK_NO_MU_BILLING;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_NON_FALLBACK_NATIVE() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_NON_FALLBACK_NATIVE;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getVERSION_GATING_NON_FALLBACK_WEBVIEW() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.VERSION_GATING_NON_FALLBACK_WEBVIEW;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getAPP_SWITCH_ELMO_EXPERIMENT() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.APP_SWITCH_ELMO_EXPERIMENT;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getREADY_TO_LOAD_APPROVAL_URL() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.READY_TO_LOAD_APPROVAL_URL;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent getHOME_BACKGROUND_TIMEOUT() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.HOME_BACKGROUND_TIMEOUT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CheckoutAnalyticsImpressionEvent(java.lang.String str) {
        super(str, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.INSTANCE.getImpression());
    }
}
