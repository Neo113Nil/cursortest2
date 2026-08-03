package com.facebook.appevents;

/* compiled from: AppEventsLogger.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0004-./0B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\"\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0088\u0001\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001a\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J$\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u0014J\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "context", "Landroid/content/Context;", "applicationId", "", "accessToken", "Lcom/facebook/AccessToken;", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "getApplicationId", "()Ljava/lang/String;", "loggerImpl", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "flush", "", "isValidForAccessToken", "", "logEvent", com.ironsource.X3.i.j0, "parameters", "Landroid/os/Bundle;", "valueToSum", "", "logProductItem", "itemID", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "condition", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "description", "imageLink", "link", "title", "priceAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "gtin", "mpn", "brand", "logPurchase", "purchaseAmount", "logPushNotificationOpen", "payload", "action", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "FlushBehavior", "ProductAvailability", "ProductCondition", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsLogger {
    public static final java.lang.String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
    public static final java.lang.String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
    public static final java.lang.String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.AppEventsLogger.Companion INSTANCE = new com.facebook.appevents.AppEventsLogger.Companion(null);
    private static final java.lang.String TAG = com.facebook.appevents.AppEventsLogger.class.getCanonicalName();
    private final com.facebook.appevents.AppEventsLoggerImpl loggerImpl;

    public /* synthetic */ AppEventsLogger(android.content.Context context, java.lang.String str, com.facebook.AccessToken accessToken, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    @kotlin.jvm.JvmStatic
    public static final void activateApp(android.app.Application application) {
        INSTANCE.activateApp(application);
    }

    @kotlin.jvm.JvmStatic
    public static final void activateApp(android.app.Application application, java.lang.String str) {
        INSTANCE.activateApp(application, str);
    }

    @kotlin.jvm.JvmStatic
    public static final void augmentWebView(android.webkit.WebView webView, android.content.Context context) {
        INSTANCE.augmentWebView(webView, context);
    }

    @kotlin.jvm.JvmStatic
    public static final void clearUserData() {
        INSTANCE.clearUserData();
    }

    @kotlin.jvm.JvmStatic
    public static final void clearUserID() {
        INSTANCE.clearUserID();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAnonymousAppDeviceGUID(android.content.Context context) {
        return INSTANCE.getAnonymousAppDeviceGUID(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
        return INSTANCE.getFlushBehavior();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUserData() {
        return INSTANCE.getUserData();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUserID() {
        return INSTANCE.getUserID();
    }

    @kotlin.jvm.JvmStatic
    public static final void initializeLib(android.content.Context context, java.lang.String str) {
        INSTANCE.initializeLib(context, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context) {
        return INSTANCE.newLogger(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, com.facebook.AccessToken accessToken) {
        return INSTANCE.newLogger(context, accessToken);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, java.lang.String str) {
        return INSTANCE.newLogger(context, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, java.lang.String str, com.facebook.AccessToken accessToken) {
        return INSTANCE.newLogger(context, str, accessToken);
    }

    @kotlin.jvm.JvmStatic
    public static final void onContextStop() {
        INSTANCE.onContextStop();
    }

    @kotlin.jvm.JvmStatic
    public static final void setFlushBehavior(com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehavior) {
        INSTANCE.setFlushBehavior(flushBehavior);
    }

    @kotlin.jvm.JvmStatic
    public static final void setInstallReferrer(java.lang.String str) {
        INSTANCE.setInstallReferrer(str);
    }

    @kotlin.jvm.JvmStatic
    public static final void setPushNotificationsRegistrationId(java.lang.String str) {
        INSTANCE.setPushNotificationsRegistrationId(str);
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        INSTANCE.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserID(java.lang.String str) {
        INSTANCE.setUserID(str);
    }

    private AppEventsLogger(android.content.Context context, java.lang.String str, com.facebook.AccessToken accessToken) {
        this.loggerImpl = new com.facebook.appevents.AppEventsLoggerImpl(context, str, accessToken);
    }

    /* compiled from: AppEventsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.AppEventsLogger.FlushBehavior[] valuesCustom() {
            com.facebook.appevents.AppEventsLogger.FlushBehavior[] valuesCustom = values();
            return (com.facebook.appevents.AppEventsLogger.FlushBehavior[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppEventsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "", "(Ljava/lang/String;I)V", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "AVALIABLE_FOR_ORDER", "DISCONTINUED", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.AppEventsLogger.ProductAvailability[] valuesCustom() {
            com.facebook.appevents.AppEventsLogger.ProductAvailability[] valuesCustom = values();
            return (com.facebook.appevents.AppEventsLogger.ProductAvailability[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppEventsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "", "(Ljava/lang/String;I)V", "NEW", "REFURBISHED", "USED", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.AppEventsLogger.ProductCondition[] valuesCustom() {
            com.facebook.appevents.AppEventsLogger.ProductCondition[] valuesCustom = values();
            return (com.facebook.appevents.AppEventsLogger.ProductCondition[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public final void logEvent(java.lang.String eventName) {
        this.loggerImpl.logEvent(eventName);
    }

    public final void logEvent(java.lang.String eventName, double valueToSum) {
        this.loggerImpl.logEvent(eventName, valueToSum);
    }

    public final void logEvent(java.lang.String eventName, android.os.Bundle parameters) {
        this.loggerImpl.logEvent(eventName, parameters);
    }

    public final void logEvent(java.lang.String eventName, double valueToSum, android.os.Bundle parameters) {
        this.loggerImpl.logEvent(eventName, valueToSum, parameters);
    }

    public final void logPurchase(java.math.BigDecimal purchaseAmount, java.util.Currency currency) {
        this.loggerImpl.logPurchase(purchaseAmount, currency);
    }

    public final void logPurchase(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        this.loggerImpl.logPurchase(purchaseAmount, currency, parameters);
    }

    public final void logPushNotificationOpen(android.os.Bundle payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.loggerImpl.logPushNotificationOpen(payload, null);
    }

    public final void logPushNotificationOpen(android.os.Bundle payload, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.loggerImpl.logPushNotificationOpen(payload, action);
    }

    public final void logProductItem(java.lang.String itemID, com.facebook.appevents.AppEventsLogger.ProductAvailability availability, com.facebook.appevents.AppEventsLogger.ProductCondition condition, java.lang.String description, java.lang.String imageLink, java.lang.String link, java.lang.String title, java.math.BigDecimal priceAmount, java.util.Currency currency, java.lang.String gtin, java.lang.String mpn, java.lang.String brand, android.os.Bundle parameters) {
        this.loggerImpl.logProductItem(itemID, availability, condition, description, imageLink, link, title, priceAmount, currency, gtin, mpn, brand, parameters);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final boolean isValidForAccessToken(com.facebook.AccessToken accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return this.loggerImpl.isValidForAccessToken(accessToken);
    }

    public final java.lang.String getApplicationId() {
        return this.loggerImpl.getApplicationId();
    }

    /* compiled from: AppEventsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007J\b\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\b\u0010\u001f\u001a\u00020\nH\u0007J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0017H\u0007J\u0012\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0007Jl\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$Companion;", "", "()V", "ACTION_APP_EVENTS_FLUSHED", "", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "TAG", "kotlin.jvm.PlatformType", "activateApp", "", "application", "Landroid/app/Application;", "applicationId", "augmentWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "clearUserData", "clearUserID", "getAnonymousAppDeviceGUID", "getFlushBehavior", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getUserData", "getUserID", "initializeLib", "newLogger", "Lcom/facebook/appevents/AppEventsLogger;", "accessToken", "Lcom/facebook/AccessToken;", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", com.adjust.sdk.Constants.REFERRER, "setPushNotificationsRegistrationId", "registrationId", "setUserData", "email", "firstName", "lastName", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE, "dateOfBirth", "gender", "city", "state", "zip", "country", "setUserID", "userID", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void activateApp(android.app.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.activateApp(application, null);
        }

        @kotlin.jvm.JvmStatic
        public final void activateApp(android.app.Application application, java.lang.String applicationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.activateApp(application, applicationId);
        }

        @kotlin.jvm.JvmStatic
        public final void initializeLib(android.content.Context context, java.lang.String applicationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.initializeLib(context, applicationId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.facebook.appevents.AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, com.facebook.AccessToken accessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.facebook.appevents.AppEventsLogger(context, null, accessToken, 0 == true ? 1 : 0);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, java.lang.String applicationId, com.facebook.AccessToken accessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.facebook.appevents.AppEventsLogger(context, applicationId, accessToken, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger newLogger(android.content.Context context, java.lang.String applicationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.facebook.appevents.AppEventsLogger(context, applicationId, null, 0 == true ? 1 : 0);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
            return com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        @kotlin.jvm.JvmStatic
        public final void setFlushBehavior(com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehavior) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.setFlushBehavior(flushBehavior);
        }

        @kotlin.jvm.JvmStatic
        public final void onContextStop() {
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.onContextStop();
        }

        @kotlin.jvm.JvmStatic
        public final void setPushNotificationsRegistrationId(java.lang.String registrationId) {
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.setPushNotificationsRegistrationId(registrationId);
        }

        @kotlin.jvm.JvmStatic
        public final void augmentWebView(android.webkit.WebView webView, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.augmentWebView(webView, context);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getUserID() {
            com.facebook.appevents.AnalyticsUserIDStore analyticsUserIDStore = com.facebook.appevents.AnalyticsUserIDStore.INSTANCE;
            return com.facebook.appevents.AnalyticsUserIDStore.getUserID();
        }

        @kotlin.jvm.JvmStatic
        public final void setUserID(java.lang.String userID) {
            com.facebook.appevents.AnalyticsUserIDStore analyticsUserIDStore = com.facebook.appevents.AnalyticsUserIDStore.INSTANCE;
            com.facebook.appevents.AnalyticsUserIDStore.setUserID(userID);
        }

        @kotlin.jvm.JvmStatic
        public final void clearUserID() {
            com.facebook.appevents.AnalyticsUserIDStore analyticsUserIDStore = com.facebook.appevents.AnalyticsUserIDStore.INSTANCE;
            com.facebook.appevents.AnalyticsUserIDStore.setUserID(null);
        }

        @kotlin.jvm.JvmStatic
        public final void setUserData(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String phone, java.lang.String dateOfBirth, java.lang.String gender, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country) {
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            com.facebook.appevents.UserDataStore.setUserDataAndHash(email, firstName, lastName, phone, dateOfBirth, gender, city, state, zip, country);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getUserData() {
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            return com.facebook.appevents.UserDataStore.getHashedUserData$facebook_core_release();
        }

        @kotlin.jvm.JvmStatic
        public final void clearUserData() {
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            com.facebook.appevents.UserDataStore.clear();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getAnonymousAppDeviceGUID(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getAnonymousAppDeviceGUID(context);
        }

        @kotlin.jvm.JvmStatic
        public final void setInstallReferrer(java.lang.String referrer) {
            com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.setInstallReferrer(referrer);
        }
    }
}
