package com.facebook.appevents.internal;

/* compiled from: AutomaticAnalyticsLogger.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J.\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger;", "", "()V", "APP_EVENTS_IF_AUTO_LOG_SUBS", "", "TAG", "kotlin.jvm.PlatformType", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "getPurchaseLoggingParameters", "Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE, "skuDetails", "extraParameter", "", "isImplicitPurchaseLoggingEnabled", "", "logActivateAppEvent", "", "logActivityTimeSpentEvent", "activityName", "timeSpentInSeconds", "", "logPurchase", "isSubscription", "PurchaseLoggingParameters", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AutomaticAnalyticsLogger {
    private static final java.lang.String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final com.facebook.appevents.internal.AutomaticAnalyticsLogger INSTANCE = new com.facebook.appevents.internal.AutomaticAnalyticsLogger();
    private static final java.lang.String TAG = com.facebook.appevents.internal.AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger;

    private AutomaticAnalyticsLogger() {
    }

    static {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(com.facebook.FacebookSdk.getApplicationContext());
    }

    @kotlin.jvm.JvmStatic
    public static final void logActivateAppEvent() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            if (applicationContext instanceof android.app.Application) {
                com.facebook.appevents.AppEventsLogger.INSTANCE.activateApp((android.app.Application) applicationContext, applicationId);
            } else {
                android.util.Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void logActivityTimeSpentEvent(java.lang.String activityName, long timeSpentInSeconds) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
        com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(applicationId, false);
        if (queryAppSettings == null || !queryAppSettings.getAutomaticLoggingEnabled() || timeSpentInSeconds <= 0) {
            return;
        }
        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger2 = new com.facebook.appevents.InternalAppEventsLogger(applicationContext);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putCharSequence(com.facebook.appevents.internal.Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, activityName);
        internalAppEventsLogger2.logEvent(com.facebook.appevents.internal.Constants.AA_TIME_SPENT_EVENT_NAME, timeSpentInSeconds, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final void logPurchase(java.lang.String purchase, java.lang.String skuDetails, boolean isSubscription) {
        com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters purchaseLoggingParameters;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchase, "purchase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = INSTANCE;
        if (isImplicitPurchaseLoggingEnabled() && (purchaseLoggingParameters = automaticAnalyticsLogger.getPurchaseLoggingParameters(purchase, skuDetails)) != null) {
            if (isSubscription) {
                com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                if (com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_IF_AUTO_LOG_SUBS, com.facebook.FacebookSdk.getApplicationId(), false)) {
                    if (com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(skuDetails)) {
                        str = com.facebook.appevents.AppEventsConstants.EVENT_NAME_START_TRIAL;
                    } else {
                        str = com.facebook.appevents.AppEventsConstants.EVENT_NAME_SUBSCRIBE;
                    }
                    internalAppEventsLogger.logEventImplicitly(str, purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
                    return;
                }
            }
            internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isImplicitPurchaseLoggingEnabled() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
        com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
        if (appSettingsWithoutQuery != null) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled()) {
                return true;
            }
        }
        return false;
    }

    private final com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters getPurchaseLoggingParameters(java.lang.String purchase, java.lang.String skuDetails) {
        return getPurchaseLoggingParameters(purchase, skuDetails, new java.util.HashMap());
    }

    private final com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters getPurchaseLoggingParameters(java.lang.String purchase, java.lang.String skuDetails, java.util.Map<java.lang.String, java.lang.String> extraParameter) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(purchase);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(skuDetails);
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PRODUCT_ID, jSONObject.getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID));
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PURCHASE_TIME, jSONObject.getString("purchaseTime"));
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PURCHASE_TOKEN, jSONObject.getString("purchaseToken"));
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PACKAGE_NAME, jSONObject.optString("packageName"));
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PRODUCT_TITLE, jSONObject2.optString("title"));
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PRODUCT_DESCRIPTION, jSONObject2.optString("description"));
            java.lang.String optString = jSONObject2.optString("type");
            bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_PRODUCT_TYPE, optString);
            if (kotlin.jvm.internal.Intrinsics.areEqual(optString, "subs")) {
                bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_SUBSCRIPTION_AUTORENEWING, java.lang.Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_SUBSCRIPTION_PERIOD, jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_FREE_TRIAL_PERIOD, jSONObject2.optString("freeTrialPeriod"));
                java.lang.String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence(com.facebook.appevents.internal.Constants.IAP_INTRO_PRICE_CYCLES, introductoryPriceCycles);
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraParameter.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            java.util.Currency currency = java.util.Currency.getInstance(jSONObject2.getString("price_currency_code"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters(bigDecimal, currency, bundle);
        } catch (org.json.JSONException e) {
            android.util.Log.e(TAG, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* compiled from: AutomaticAnalyticsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "param", "Landroid/os/Bundle;", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getParam", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "getPurchaseAmount", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class PurchaseLoggingParameters {
        private java.util.Currency currency;
        private android.os.Bundle param;
        private java.math.BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle param) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "currency");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param, "param");
            this.purchaseAmount = purchaseAmount;
            this.currency = currency;
            this.param = param;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public final android.os.Bundle getParam() {
            return this.param;
        }

        public final java.math.BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(java.util.Currency currency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "<set-?>");
            this.currency = currency;
        }

        public final void setParam(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.param = bundle;
        }

        public final void setPurchaseAmount(java.math.BigDecimal bigDecimal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }
    }
}
