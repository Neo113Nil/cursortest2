package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J0\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00020\u0004`\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker;", "", "()V", "BILLING_ACTIVITY_NAME", "", "SERVICE_INTERFACE_NAME", "TAG", "kotlin.jvm.PlatformType", "callbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "hasBillingActivity", "", "Ljava/lang/Boolean;", "hasBillingService", "inAppBillingObj", "intent", "Landroid/content/Intent;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "serviceConnection", "Landroid/content/ServiceConnection;", "initializeIfNotInitialized", "", "logPurchase", "context", "Landroid/content/Context;", org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isSubscription", "startIapLogging", "startTracking", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseActivityLifecycleTracker {
    private static final java.lang.String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
    private static final java.lang.String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
    private static android.app.Application.ActivityLifecycleCallbacks callbacks;
    private static java.lang.Boolean hasBillingActivity;
    private static java.lang.Boolean hasBillingService;
    private static java.lang.Object inAppBillingObj;
    private static android.content.Intent intent;
    private static android.content.ServiceConnection serviceConnection;
    public static final com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker INSTANCE = new com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker();
    private static final java.lang.String TAG = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.class.getCanonicalName();
    private static final java.util.concurrent.atomic.AtomicBoolean isTracking = new java.util.concurrent.atomic.AtomicBoolean(false);

    private InAppPurchaseActivityLifecycleTracker() {
    }

    @kotlin.jvm.JvmStatic
    public static final void startIapLogging() {
        com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = INSTANCE;
        inAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized();
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) hasBillingService, (java.lang.Object) false)) {
            return;
        }
        com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
        if (com.facebook.appevents.internal.AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
            inAppPurchaseActivityLifecycleTracker.startTracking();
        }
    }

    private final void initializeIfNotInitialized() {
        if (hasBillingService != null) {
            return;
        }
        com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.facebook.appevents.iap.InAppPurchaseUtils.getClass(SERVICE_INTERFACE_NAME) != null);
        hasBillingService = valueOf;
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) valueOf, (java.lang.Object) false)) {
            return;
        }
        com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
        hasBillingActivity = java.lang.Boolean.valueOf(com.facebook.appevents.iap.InAppPurchaseUtils.getClass(BILLING_ACTIVITY_NAME) != null);
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
        com.facebook.appevents.iap.InAppPurchaseEventManager.clearSkuDetailsCache();
        android.content.Intent intent2 = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        intent = intent2;
        serviceConnection = new android.content.ServiceConnection() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1
            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName name) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "service");
                com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.INSTANCE;
                com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager2 = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.inAppBillingObj = com.facebook.appevents.iap.InAppPurchaseEventManager.asInterface(com.facebook.FacebookSdk.getApplicationContext(), service);
            }
        };
        callbacks = new com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2();
    }

    private final void startTracking() {
        if (isTracking.compareAndSet(false, true)) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            if (applicationContext instanceof android.app.Application) {
                android.app.Application application = (android.app.Application) applicationContext;
                android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                if (activityLifecycleCallbacks == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                android.content.Intent intent2 = intent;
                if (intent2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("intent");
                    throw null;
                }
                android.content.ServiceConnection serviceConnection2 = serviceConnection;
                if (serviceConnection2 != null) {
                    applicationContext.bindService(intent2, serviceConnection2, 1);
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPurchase(android.content.Context context, java.util.ArrayList<java.lang.String> purchases, boolean isSubscription) {
        if (purchases.isEmpty()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = purchases.iterator();
        while (it.hasNext()) {
            java.lang.String purchase = it.next();
            try {
                java.lang.String sku = new org.json.JSONObject(purchase).getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sku, "sku");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList.add(sku);
            } catch (org.json.JSONException e) {
                android.util.Log.e(TAG, "Error parsing in-app purchase data.", e);
            }
        }
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : com.facebook.appevents.iap.InAppPurchaseEventManager.getSkuDetails(context, arrayList, inAppBillingObj, isSubscription).entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.String str = (java.lang.String) hashMap.get(key);
            if (str != null) {
                com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
                com.facebook.appevents.internal.AutomaticAnalyticsLogger.logPurchase(str, value, isSubscription);
            }
        }
    }
}
