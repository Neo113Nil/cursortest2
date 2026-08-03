package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseManager.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "()V", "GOOGLE_BILLINGCLIENT_VERSION", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enableAutoLogging", "", "startTracking", "usingBillingLib2Plus", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseManager {
    private static final java.lang.String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    public static final com.facebook.appevents.iap.InAppPurchaseManager INSTANCE = new com.facebook.appevents.iap.InAppPurchaseManager();
    private static final java.util.concurrent.atomic.AtomicBoolean enabled = new java.util.concurrent.atomic.AtomicBoolean(false);

    private InAppPurchaseManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enableAutoLogging() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseManager.class)) {
            return;
        }
        try {
            enabled.set(true);
            startTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void startTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                if (INSTANCE.usingBillingLib2Plus()) {
                    com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
                    if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.IapLoggingLib2)) {
                        com.facebook.appevents.iap.InAppPurchaseAutoLogger inAppPurchaseAutoLogger = com.facebook.appevents.iap.InAppPurchaseAutoLogger.INSTANCE;
                        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                        com.facebook.appevents.iap.InAppPurchaseAutoLogger.startIapLogging(com.facebook.FacebookSdk.getApplicationContext());
                        return;
                    }
                }
                com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.INSTANCE;
                com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.startIapLogging();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseManager.class);
        }
    }

    private final boolean usingBillingLib2Plus() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            java.lang.String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
            if (string == null) {
                return false;
            }
            return java.lang.Integer.parseInt((java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{"."}, false, 3, 2, (java.lang.Object) null).get(0)) >= 2;
        } catch (java.lang.Exception unused) {
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
