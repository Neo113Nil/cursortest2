package com.paypal.oslo.feature.identity.connect.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/utils/AnalyticsConstants;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "SCREEN_NAME", "MODULE_NAME", "FLOW_CONNECT", "FLOW_TYPE", "SHOWN", "EXIT", "TRIGGERED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "URL_COMPLETED", "FAILURE_OCCURRED", "LOAD_URL_TRIGGERED", "PAGE_LOAD", "REDIRECT_URL_RECEIVED", "WEBVIEW_SUCCESS", "CONNECT_DEEPLINK_TRIGGERED", "CONNECT_SCREEN_SHOWN", "CONNECT_SCREEN_DISMISSED", "GET_CONNECT_URL_TRIGGERED", "GET_CONNECT_URL_SUCCESSFULLY_COMPLETED", "GET_CONNECT_URL_FAILURE_OCCURRED", "CONNECT_WEBVIEW_SHOWN", "CONNECT_WEBVIEW_LOAD_URL_TRIGGERED", "CONNECT_WEBVIEW_PAGE_LOADED", "CONNECT_WEBVIEW_REDIRECT_URL_RECEIVED", "CONNECT_WEBVIEW_CLOSED", "CONNECT_WEBVIEW_SUCCESSFULLY_COMPLETED", "CONNECT_WEBVIEW_FAILURE_OCCURRED", "CONNECT_WEBVIEW_USER_CANCELED", "CONNECT_WEBVIEW_ERROR_URI", "CONNECT_REDIRECT_URI_PARAM", "USER_CANCELED", "ERROR_USER_CANCELED", "NA", "CONNECT_URL", "REDIRECT_URL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String CANCELED = "canceled";
    public static final java.lang.String CONNECT_DEEPLINK_TRIGGERED = "deeplink_triggered";
    public static final java.lang.String CONNECT_REDIRECT_URI_PARAM = "redirect_uri";
    public static final java.lang.String CONNECT_SCREEN_DISMISSED = "screen_exit";
    public static final java.lang.String CONNECT_SCREEN_SHOWN = "screen_shown";
    public static final java.lang.String CONNECT_URL = "connect_url";
    public static final java.lang.String CONNECT_WEBVIEW_CLOSED = "webview_exit";
    public static final java.lang.String CONNECT_WEBVIEW_ERROR_URI = "error_uri";
    public static final java.lang.String CONNECT_WEBVIEW_FAILURE_OCCURRED = "webview_failure_occurred";
    public static final java.lang.String CONNECT_WEBVIEW_LOAD_URL_TRIGGERED = "webview_load_url_triggered";
    public static final java.lang.String CONNECT_WEBVIEW_PAGE_LOADED = "webview_page_loaded";
    public static final java.lang.String CONNECT_WEBVIEW_REDIRECT_URL_RECEIVED = "webview_redirect_url_received";
    public static final java.lang.String CONNECT_WEBVIEW_SHOWN = "webview_shown";
    public static final java.lang.String CONNECT_WEBVIEW_SUCCESSFULLY_COMPLETED = "webview_successfully_completed";
    public static final java.lang.String CONNECT_WEBVIEW_USER_CANCELED = "webview_user_canceled";
    public static final java.lang.String ERROR_USER_CANCELED = "Connect Flow got terminated by user";
    public static final java.lang.String EXIT = "exit";
    public static final java.lang.String FAILURE_OCCURRED = "failure_occurred";
    public static final java.lang.String FLOW_CONNECT = "connect";
    public static final java.lang.String FLOW_TYPE = "deeplink";
    public static final java.lang.String GET_CONNECT_URL_FAILURE_OCCURRED = "url_failure_occurred";
    public static final java.lang.String GET_CONNECT_URL_SUCCESSFULLY_COMPLETED = "url_successfully_completed";
    public static final java.lang.String GET_CONNECT_URL_TRIGGERED = "url_triggered";
    public static final com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants INSTANCE = new com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants();
    public static final java.lang.String LOAD_URL_TRIGGERED = "load_url_triggered";
    public static final java.lang.String MODULE_NAME = "connect";
    public static final java.lang.String NA = "N/A";
    public static final java.lang.String PAGE_LOAD = "page_load";
    public static final java.lang.String PRODUCT = "identity";
    public static final java.lang.String REDIRECT_URL = "redirect_url";
    public static final java.lang.String REDIRECT_URL_RECEIVED = "redirect_url_received";
    public static final java.lang.String SCREEN_NAME = "inbound_connect";
    public static final java.lang.String SHOWN = "shown";
    public static final java.lang.String TRIGGERED = "triggered";
    public static final java.lang.String URL_COMPLETED = "url_completed";
    public static final java.lang.String USER_CANCELED = "user_canceled";
    public static final java.lang.String WEBVIEW_SUCCESS = "webview_success";

    private AnalyticsConstants() {
    }
}
