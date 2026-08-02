package com.paypal.oslo.feature.inappcheckout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/Constants;", "", "<init>", "()V", "", "UNKNOWN", "Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_CONTINGENCY, "UNKNOWN_CONTINGENCY_ERROR_DESCRIPTION", "FB_INSTAGRAM", "DISCLAIMER_PAYMENT_METHODS_LINK_ID", "ADD_CARD_LINK_ID", "CONTACT_US_LINK_ID", "PPDC_BALANCE_LOGO_URL", "", "DEFAULT_API_RETRY_ATTEMPTS", com.visa.cbp.getEncExpo.warmup, "DEFAULT_MAX_RETRIES", "API_CALL", "ERROR_GRAPHQL_ERROR", "ERROR_NETWORK_ERROR", com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_FUNDING_SELECTION_ERROR, "ERROR_FUNDING_SELECTION_DESCRIPTION_PREFIX", com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_API_ERROR, "HTTP_SERVER_ERROR_MIN", "HTTP_SERVER_ERROR_MAX", "", "SHOW_RETURN_TO_MERCHANT_BUTTON_DELAY_MILLIS", "J", "X_PAY_PAL_PAYER_ID", "WEB_VIEW_HTTP_HEADER_KEY_INTEGRATION_ARTIFACT", "WEB_VIEW_HTTP_HEADER_VALUE_MERCHANT_UPGRADE", "WEB_VIEW_HTTP_HEADER_VALUE_NO_MERCHANT_UPGRADE", "WEB_VIEW_SOURCE", "WEB_VIEW_USER_AGENT_SUFFIX", "INVALID_CONTENT", "INVALID_CONTENT_DESCRIPTION", "PAYPAL_CREDIT_TERMS_SOURCE", "MERCHANT_PATH_MU", "MERCHANT_PATH_NOMU"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Constants {
    public static final int $stable = 0;
    public static final java.lang.String ADD_CARD_LINK_ID = "add_card";
    public static final java.lang.String API_CALL = "API call";
    public static final java.lang.String CONTACT_US_LINK_ID = "contact_us_link";
    public static final int DEFAULT_API_RETRY_ATTEMPTS = 2;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final java.lang.String DISCLAIMER_PAYMENT_METHODS_LINK_ID = "DisclaimerLinkId";
    public static final java.lang.String ERROR_FUNDING_SELECTION_DESCRIPTION_PREFIX = "A funding selection error occurred: ";
    public static final java.lang.String ERROR_GRAPHQL_ERROR = "GRAPHQL_ERROR";
    public static final java.lang.String ERROR_NETWORK_ERROR = "NETWORK_ERROR";
    public static final java.lang.String FB_INSTAGRAM = "fbInstagram";
    public static final int HTTP_SERVER_ERROR_MAX = 599;
    public static final int HTTP_SERVER_ERROR_MIN = 500;
    public static final com.paypal.oslo.feature.inappcheckout.Constants INSTANCE = new com.paypal.oslo.feature.inappcheckout.Constants();
    public static final java.lang.String INVALID_CONTENT = "INVALID_CONTENT";
    public static final java.lang.String INVALID_CONTENT_DESCRIPTION = "The content received is invalid or malformed.";
    public static final java.lang.String MERCHANT_PATH_MU = "mu";
    public static final java.lang.String MERCHANT_PATH_NOMU = "nomu";
    public static final java.lang.String PAYPAL_CREDIT_TERMS_SOURCE = "PAYPAL_CREDIT_TERMS";
    public static final java.lang.String PPDC_BALANCE_LOGO_URL = "https://www.paypalobjects.com/ucs/card/ppdc/us/cons-debit-card-medium.png";
    public static final long SHOW_RETURN_TO_MERCHANT_BUTTON_DELAY_MILLIS = 3000;
    public static final java.lang.String UNKNOWN = "UNKNOWN";
    public static final java.lang.String UNKNOWN_API_ERROR = "UNKNOWN_API_ERROR";
    public static final java.lang.String UNKNOWN_CONTINGENCY = "UNKNOWN_CONTINGENCY";
    public static final java.lang.String UNKNOWN_CONTINGENCY_ERROR_DESCRIPTION = "An unknown contingency has occurred";
    public static final java.lang.String UNKNOWN_FUNDING_SELECTION_ERROR = "UNKNOWN_FUNDING_SELECTION_ERROR";
    public static final java.lang.String WEB_VIEW_HTTP_HEADER_KEY_INTEGRATION_ARTIFACT = "x-native-app-integration-artifact";
    public static final java.lang.String WEB_VIEW_HTTP_HEADER_VALUE_MERCHANT_UPGRADE = "pp-venice";
    public static final java.lang.String WEB_VIEW_HTTP_HEADER_VALUE_NO_MERCHANT_UPGRADE = "pp-venice-nmu";
    public static final java.lang.String WEB_VIEW_SOURCE = "inapp-checkout-screen";
    public static final java.lang.String WEB_VIEW_USER_AGENT_SUFFIX = "appswitch-paypalmobile";
    public static final java.lang.String X_PAY_PAL_PAYER_ID = "X-PayPal-Payer-Id";

    private Constants() {
    }
}
