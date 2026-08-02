package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,"}, d2 = {"Lcom/zettle/sdk/commons/network/Service;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Api", "ApiAuthenticated", "Authorization", "CardPayment", "CardReaderConfiguration", "OrchestratorPayment", "CardRefund", "CardDeferred", "CashRegister", "Checkout", "DocumentUpload", "GiftCard", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Inventory", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants.KEY_SEARCH_FILTER_TYPE_INVOICES, "Layout", "Location", "Logging", "MerchantReports", "OAUTH2", "PayByLink", "Portal", "ProductLibrary", "Purchase", com.ingo.sdk.kotlin.common.analytics.IScreenNames.Registration, "RegistrationWeb", "SamsungAttestation", "Site", "Subscription", "Tracking", "Translations", "WebShop", "SDKSupport", "PayPalAPI", "PayPalWWW"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum Service {
    Api(com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY),
    ApiAuthenticated("API_AUTHENTICATED"),
    Authorization(com.izettle.android.auth.repository.BaseUriRepositoryImpl.OAUTH_SERVICE_KEY),
    CardPayment("CARD_PAYMENT"),
    CardReaderConfiguration("CARD_READER_CONFIGURATION"),
    OrchestratorPayment("ORCHESTRATOR_ORDERS"),
    CardRefund("CARD_REFUND"),
    CardDeferred("DEFERRED_CARD_PAYMENT"),
    CashRegister("CASH_REGISTER_SERVICE"),
    Checkout("CHECKOUT_SERVICE"),
    DocumentUpload("DOCUMENT_UPLOAD_SERVICE"),
    GiftCard("GIFTCARD_SERVICE"),
    Image("IMAGE_SERVICE"),
    Inventory("INVENTORY_SERVICE"),
    Invoice("INVOICE_SERVICE"),
    Layout("LAYOUT_SERVICE"),
    Location("LOCATION_SERVICE"),
    Logging("LOGGING_SERVICE"),
    MerchantReports("MERCHANT_REPORTS"),
    OAUTH2(com.izettle.android.auth.repository.BaseUriRepositoryImpl.OAUTH2_SERVICE_KEY),
    PayByLink("PAYBYLINK_SERVICE"),
    Portal("PORTAL"),
    ProductLibrary("PRODUCT_LIBRARY_SERVICE"),
    Purchase("PURCHASE_SERVICE"),
    Registration("REGISTRATION_SERVICE"),
    RegistrationWeb("REGISTRATION_WEB"),
    SamsungAttestation("SAMSUNG_ATTESTATION"),
    Site("SITE"),
    Subscription("SUBSCRIPTION_SERVICE"),
    Tracking("TRACKING"),
    Translations("TRANSLATIONS"),
    WebShop("WEBSHOP_SERVICE"),
    SDKSupport("PAYMENTS_SDK_SUPPORT"),
    PayPalAPI("PAYPAL_API"),
    PayPalWWW("PAYPAL_WWW");

    private final java.lang.String key;

    Service(java.lang.String str) {
        this.key = str;
    }

    public final java.lang.String getKey() {
        return this.key;
    }
}
