package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
@kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.m5128onActivityResumed$lambda0();
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-0, reason: not valid java name */
    public static final void m5128onActivityResumed$lambda0() {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
        obj = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, com.facebook.appevents.iap.InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj), false);
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager2 = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
        obj2 = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, com.facebook.appevents.iap.InAppPurchaseEventManager.getPurchasesSubs(applicationContext, obj2), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            bool = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.hasBillingActivity;
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) true) && kotlin.jvm.internal.Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.m5129onActivityStopped$lambda1();
                    }
                });
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityStopped$lambda-1, reason: not valid java name */
    public static final void m5129onActivityStopped$lambda1() {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
        obj = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        java.util.ArrayList<java.lang.String> purchasesInapp = com.facebook.appevents.iap.InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj);
        if (purchasesInapp.isEmpty()) {
            com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager2 = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
            obj2 = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
            purchasesInapp = com.facebook.appevents.iap.InAppPurchaseEventManager.getPurchaseHistoryInapp(applicationContext, obj2);
        }
        com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, purchasesInapp, false);
    }
}
