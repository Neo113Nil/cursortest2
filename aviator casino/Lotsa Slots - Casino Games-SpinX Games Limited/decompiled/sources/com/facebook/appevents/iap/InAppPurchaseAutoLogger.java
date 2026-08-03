package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseAutoLogger.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseAutoLogger;", "", "()V", "BILLING_CLIENT_PURCHASE_NAME", "", "logPurchase", "", "startIapLogging", "context", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseAutoLogger {
    private static final java.lang.String BILLING_CLIENT_PURCHASE_NAME = "com.android.billingclient.api.Purchase";
    public static final com.facebook.appevents.iap.InAppPurchaseAutoLogger INSTANCE = new com.facebook.appevents.iap.InAppPurchaseAutoLogger();

    private InAppPurchaseAutoLogger() {
    }

    @kotlin.jvm.JvmStatic
    public static final void startIapLogging(android.content.Context context) {
        com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper orCreateInstance;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            if (com.facebook.appevents.iap.InAppPurchaseUtils.getClass(BILLING_CLIENT_PURCHASE_NAME) == null || (orCreateInstance = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getOrCreateInstance(context)) == null || !com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.isServiceConnected().get()) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseLoggerManager inAppPurchaseLoggerManager = com.facebook.appevents.iap.InAppPurchaseLoggerManager.INSTANCE;
            if (com.facebook.appevents.iap.InAppPurchaseLoggerManager.eligibleQueryPurchaseHistory()) {
                orCreateInstance.queryPurchaseHistory("inapp", new java.lang.Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.iap.InAppPurchaseAutoLogger.m5132startIapLogging$lambda0();
                    }
                });
            } else {
                orCreateInstance.queryPurchase("inapp", new java.lang.Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.iap.InAppPurchaseAutoLogger.m5133startIapLogging$lambda1();
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startIapLogging$lambda-0, reason: not valid java name */
    public static final void m5132startIapLogging$lambda0() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            INSTANCE.logPurchase();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startIapLogging$lambda-1, reason: not valid java name */
    public static final void m5133startIapLogging$lambda1() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            INSTANCE.logPurchase();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseAutoLogger.class);
        }
    }

    private final void logPurchase() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.iap.InAppPurchaseLoggerManager inAppPurchaseLoggerManager = com.facebook.appevents.iap.InAppPurchaseLoggerManager.INSTANCE;
            com.facebook.appevents.iap.InAppPurchaseLoggerManager.filterPurchaseLogging(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getPurchaseDetailsMap(), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getSkuDetailsMap());
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getPurchaseDetailsMap().clear();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
