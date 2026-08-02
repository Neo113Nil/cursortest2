package com.paypal.oslo.core.telemetry.analytics.schema;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b5\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue$telemetry_release", "()Ljava/lang/String;", "APPLICATION", "PEER_TO_PEER", "POOL", "FUNDRAISE", "GIVING", "MOBILE_CHECKOUT", "PACKAGE_TRACKING", "REWARDS", "MOBILE_BALANCE", "MOBILE_CONSUMER_DEBIT_CARD", "MOBILE_BUSINESS_DEBIT_CARD", "MOBILE_SAVINGS", "MOBILE_WALLET", "MOBILE_NFC_WALLET", "QR_CODE", "IDENTITY", "MOBILE_RISK", "MOBILE_ONBOARDING", "PRODUCT_PROVISIONING", "CONSUMER_PRIVACY", "MOBILE_NOTIFICATIONS", "SEARCH_AND_INTELLIGENCE", "HELP", "CRYPTOCURRENCY", "MOBILE_XOOM", "HOME_FEED", "MOBILE_ADS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_INVOICE_SOURCE, "SUBSCRIPTIONS", "SETTINGS", "PROFILE", "ACCOUNT_SWITCH", "NAVIGATION", "MOBILE_REVOLVING_CREDIT", "BUY_NOW_PAY_LATER", "MOBILE_REQUEST_PAYMENTS", "MOBILE_CUSTOMER_DIRECTORY", "BUSINESS_INVENTORY", "TAX_AND_DOCUMENTS", "PRODUCT_ONBOARDING", "NOTIFICATIONS", "ADS", "REVOLVING_CREDIT", "CUSTOMER_DIRECTORY", "CONSUMER_DEBIT_CARD", "BUSINESS_DEBIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Product {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product ACCOUNT_SWITCH;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product ACTIVITY;

    @kotlin.Deprecated(message = "Use MOBILE_ADS instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_ADS", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product ADS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product APPLICATION;

    @kotlin.Deprecated(message = "Use MOBILE_BUSINESS_DEBIT_CARD instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_BUSINESS_DEBIT_CARD", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product BUSINESS_INVENTORY;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product BUY_NOW_PAY_LATER;

    @kotlin.Deprecated(message = "Use MOBILE_CONSUMER_DEBIT_CARD instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_CONSUMER_DEBIT_CARD", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product CONSUMER_PRIVACY;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product CRYPTOCURRENCY;

    @kotlin.Deprecated(message = "Use MOBILE_CUSTOMER_DIRECTORY instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_CUSTOMER_DIRECTORY", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product CUSTOMER_DIRECTORY;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.Product[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product FUNDRAISE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product GIVING;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product HELP;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product HOME_FEED;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product IDENTITY;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_ADS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_BALANCE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_CHECKOUT;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_CUSTOMER_DIRECTORY;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_NFC_WALLET;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_NOTIFICATIONS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_ONBOARDING;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_REQUEST_PAYMENTS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_REVOLVING_CREDIT;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_RISK;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_SAVINGS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_WALLET;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product MOBILE_XOOM;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product NAVIGATION;

    @kotlin.Deprecated(message = "Use MOBILE_NOTIFICATIONS instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_NOTIFICATIONS", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product NOTIFICATIONS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product PACKAGE_TRACKING;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product PEER_TO_PEER;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product POOL;

    @kotlin.Deprecated(message = "Use PRODUCT_PROVISIONING instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.PRODUCT_PROVISIONING", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT_ONBOARDING;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT_PROVISIONING;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product PROFILE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product QR_CODE;

    @kotlin.Deprecated(message = "Use MOBILE_REVOLVING_CREDIT instead", replaceWith = @kotlin.ReplaceWith(expression = "Product.MOBILE_REVOLVING_CREDIT", imports = {}))
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product REVOLVING_CREDIT;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product REWARDS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product SEARCH_AND_INTELLIGENCE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product SETTINGS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product SUBSCRIPTIONS;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.Product TAX_AND_DOCUMENTS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private Product(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    /* renamed from: getValue$telemetry_release, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.schema.Product product = new com.paypal.oslo.core.telemetry.analytics.schema.Product("APPLICATION", 0, "paypal_mobile");
        APPLICATION = product;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product2 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("PEER_TO_PEER", 1, "peer_to_peer");
        PEER_TO_PEER = product2;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product3 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("POOL", 2, "pool");
        POOL = product3;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product4 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("FUNDRAISE", 3, "fundraise");
        FUNDRAISE = product4;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product5 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("GIVING", 4, "giving");
        GIVING = product5;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product6 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_CHECKOUT", 5, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT);
        MOBILE_CHECKOUT = product6;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product7 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("PACKAGE_TRACKING", 6, "package_tracking");
        PACKAGE_TRACKING = product7;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product8 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("REWARDS", 7, "rewards");
        REWARDS = product8;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product9 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_BALANCE", 8, "mobile_balance");
        MOBILE_BALANCE = product9;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product10 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_CONSUMER_DEBIT_CARD", 9, "mobile_consumer_debit_card");
        MOBILE_CONSUMER_DEBIT_CARD = product10;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product11 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_BUSINESS_DEBIT_CARD", 10, "mobile_business_debit_card");
        MOBILE_BUSINESS_DEBIT_CARD = product11;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product12 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_SAVINGS", 11, "mobile_savings");
        MOBILE_SAVINGS = product12;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product13 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_WALLET", 12, "mobile_wallet");
        MOBILE_WALLET = product13;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product14 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_NFC_WALLET", 13, "mobile_nfc_wallet");
        MOBILE_NFC_WALLET = product14;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product15 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("QR_CODE", 14, "qr_code");
        QR_CODE = product15;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product16 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("IDENTITY", 15, "identity");
        IDENTITY = product16;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product17 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_RISK", 16, "mobile_risk");
        MOBILE_RISK = product17;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product18 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_ONBOARDING", 17, "mobile_onboarding");
        MOBILE_ONBOARDING = product18;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product19 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("PRODUCT_PROVISIONING", 18, "product_provisioning");
        PRODUCT_PROVISIONING = product19;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product20 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("CONSUMER_PRIVACY", 19, "consumer_privacy");
        CONSUMER_PRIVACY = product20;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product21 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_NOTIFICATIONS", 20, "mobile_notifications");
        MOBILE_NOTIFICATIONS = product21;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product22 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("SEARCH_AND_INTELLIGENCE", 21, "search_and_intelligence");
        SEARCH_AND_INTELLIGENCE = product22;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product23 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("HELP", 22, "help");
        HELP = product23;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product24 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("CRYPTOCURRENCY", 23, "cryptocurrency");
        CRYPTOCURRENCY = product24;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product25 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_XOOM", 24, "mobile_xoom");
        MOBILE_XOOM = product25;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product26 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("HOME_FEED", 25, "home_feed");
        HOME_FEED = product26;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product27 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_ADS", 26, "mobile_ads");
        MOBILE_ADS = product27;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product28 = new com.paypal.oslo.core.telemetry.analytics.schema.Product(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_INVOICE_SOURCE, 27, "activity");
        ACTIVITY = product28;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product29 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("SUBSCRIPTIONS", 28, "subscriptions");
        SUBSCRIPTIONS = product29;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product30 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("SETTINGS", 29, "settings");
        SETTINGS = product30;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product31 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("PROFILE", 30, "profile");
        PROFILE = product31;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product32 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("ACCOUNT_SWITCH", 31, "account_switch");
        ACCOUNT_SWITCH = product32;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product33 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("NAVIGATION", 32, "navigation");
        NAVIGATION = product33;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product34 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_REVOLVING_CREDIT", 33, "mobile_revolving_credit");
        MOBILE_REVOLVING_CREDIT = product34;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product35 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("BUY_NOW_PAY_LATER", 34, "buy_now_pay_later");
        BUY_NOW_PAY_LATER = product35;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product36 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_REQUEST_PAYMENTS", 35, "mobile_request_payments");
        MOBILE_REQUEST_PAYMENTS = product36;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product37 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("MOBILE_CUSTOMER_DIRECTORY", 36, "mobile_customer_directory");
        MOBILE_CUSTOMER_DIRECTORY = product37;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product38 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("BUSINESS_INVENTORY", 37, "business_inventory");
        BUSINESS_INVENTORY = product38;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product39 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("TAX_AND_DOCUMENTS", 38, "tax_and_documents");
        TAX_AND_DOCUMENTS = product39;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product40 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("PRODUCT_ONBOARDING", 39, "product_onboarding");
        PRODUCT_ONBOARDING = product40;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product41 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("NOTIFICATIONS", 40, "notifications");
        NOTIFICATIONS = product41;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product42 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("ADS", 41, "ads");
        ADS = product42;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product43 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("REVOLVING_CREDIT", 42, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.DEFAULT_DOWNLOAD_SOURCE);
        REVOLVING_CREDIT = product43;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product44 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("CUSTOMER_DIRECTORY", 43, "customer_directory");
        CUSTOMER_DIRECTORY = product44;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product45 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("CONSUMER_DEBIT_CARD", 44, "consumer_debit_card");
        CONSUMER_DEBIT_CARD = product45;
        com.paypal.oslo.core.telemetry.analytics.schema.Product product46 = new com.paypal.oslo.core.telemetry.analytics.schema.Product("BUSINESS_DEBIT_CARD", 45, "business_debit_card");
        BUSINESS_DEBIT_CARD = product46;
        com.paypal.oslo.core.telemetry.analytics.schema.Product[] productArr = {product, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12, product13, product14, product15, product16, product17, product18, product19, product20, product21, product22, product23, product24, product25, product26, product27, product28, product29, product30, product31, product32, product33, product34, product35, product36, product37, product38, product39, product40, product41, product42, product43, product44, product45, product46};
        Camera2StreamConfigurationMap = productArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(productArr);
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.Product[] values() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.Product[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.Product valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.analytics.schema.Product) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.analytics.schema.Product.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.analytics.schema.Product> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
