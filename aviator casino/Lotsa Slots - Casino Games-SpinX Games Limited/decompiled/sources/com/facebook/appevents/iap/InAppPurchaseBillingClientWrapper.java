package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseBillingClientWrapper.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0005()*+,B«\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001fJ\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001fH\u0002J(\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0&2\u0006\u0010#\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "", "context", "Landroid/content/Context;", "billingClient", "billingClientClazz", "Ljava/lang/Class;", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "queryPurchasesMethod", "Ljava/lang/reflect/Method;", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "inAppPurchaseSkuDetailsWrapper", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;)V", "historyPurchaseSet", "", "", "queryPurchase", "", "skuType", "querySkuRunnable", "Ljava/lang/Runnable;", "queryPurchaseHistory", "queryPurchaseHistoryRunnable", com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, "runnable", com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_QUERY_SKU_DETAILS_ASYNC, "skuIDs", "", com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_START_CONNECTION, "BillingClientStateListenerWrapper", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PurchaseHistoryResponseListenerWrapper", "PurchasesUpdatedListenerWrapper", "SkuDetailsResponseListenerWrapper", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseBillingClientWrapper {
    private static final java.lang.String CLASSNAME_BILLING_CLIENT = "com.android.billingclient.api.BillingClient";
    private static final java.lang.String CLASSNAME_BILLING_CLIENT_BUILDER = "com.android.billingclient.api.BillingClient$Builder";
    private static final java.lang.String CLASSNAME_BILLING_CLIENT_STATE_LISTENER = "com.android.billingclient.api.BillingClientStateListener";
    private static final java.lang.String CLASSNAME_PURCHASE = "com.android.billingclient.api.Purchase";
    private static final java.lang.String CLASSNAME_PURCHASES_RESULT = "com.android.billingclient.api.Purchase$PurchasesResult";
    private static final java.lang.String CLASSNAME_PURCHASE_HISTORY_RECORD = "com.android.billingclient.api.PurchaseHistoryRecord";
    private static final java.lang.String CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER = "com.android.billingclient.api.PurchaseHistoryResponseListener";
    private static final java.lang.String CLASSNAME_PURCHASE_UPDATED_LISTENER = "com.android.billingclient.api.PurchasesUpdatedListener";
    private static final java.lang.String CLASSNAME_SKU_DETAILS = "com.android.billingclient.api.SkuDetails";
    private static final java.lang.String CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER = "com.android.billingclient.api.SkuDetailsResponseListener";
    private static final java.lang.String IN_APP = "inapp";
    private static final java.lang.String METHOD_BUILD = "build";
    private static final java.lang.String METHOD_ENABLE_PENDING_PURCHASES = "enablePendingPurchases";
    private static final java.lang.String METHOD_GET_ORIGINAL_JSON = "getOriginalJson";
    private static final java.lang.String METHOD_GET_PURCHASE_LIST = "getPurchasesList";
    private static final java.lang.String METHOD_NEW_BUILDER = "newBuilder";
    private static final java.lang.String METHOD_ON_BILLING_SERVICE_DISCONNECTED = "onBillingServiceDisconnected";
    private static final java.lang.String METHOD_ON_BILLING_SETUP_FINISHED = "onBillingSetupFinished";
    private static final java.lang.String METHOD_ON_PURCHASE_HISTORY_RESPONSE = "onPurchaseHistoryResponse";
    private static final java.lang.String METHOD_ON_SKU_DETAILS_RESPONSE = "onSkuDetailsResponse";
    private static final java.lang.String METHOD_QUERY_PURCHASES = "queryPurchases";
    private static final java.lang.String METHOD_QUERY_PURCHASE_HISTORY_ASYNC = "queryPurchaseHistoryAsync";
    private static final java.lang.String METHOD_QUERY_SKU_DETAILS_ASYNC = "querySkuDetailsAsync";
    private static final java.lang.String METHOD_SET_LISTENER = "setListener";
    private static final java.lang.String METHOD_START_CONNECTION = "startConnection";
    private static final java.lang.String PACKAGE_NAME = "packageName";
    private static final java.lang.String PRODUCT_ID = "productId";
    private static com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper instance;
    private final java.lang.Object billingClient;
    private final java.lang.Class<?> billingClientClazz;
    private final android.content.Context context;
    private final java.lang.reflect.Method getOriginalJsonMethod;
    private final java.lang.reflect.Method getOriginalJsonPurchaseHistoryMethod;
    private final java.lang.reflect.Method getOriginalJsonSkuMethod;
    private final java.lang.reflect.Method getPurchaseListMethod;
    private final java.util.Set<java.lang.String> historyPurchaseSet;
    private final com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final java.lang.Class<?> purchaseClazz;
    private final java.lang.Class<?> purchaseHistoryRecordClazz;
    private final java.lang.Class<?> purchaseHistoryResponseListenerClazz;
    private final java.lang.Class<?> purchaseResultClazz;
    private final java.lang.reflect.Method queryPurchaseHistoryAsyncMethod;
    private final java.lang.reflect.Method queryPurchasesMethod;
    private final java.lang.reflect.Method querySkuDetailsAsyncMethod;
    private final java.lang.Class<?> skuDetailsClazz;
    private final java.lang.Class<?> skuDetailsResponseListenerClazz;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.Companion INSTANCE = new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.Companion(null);
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.atomic.AtomicBoolean isServiceConnected = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.Map<java.lang.String, org.json.JSONObject> purchaseDetailsMap = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.Map<java.lang.String, org.json.JSONObject> skuDetailsMap = new java.util.concurrent.ConcurrentHashMap();

    public /* synthetic */ InAppPurchaseBillingClientWrapper(android.content.Context context, java.lang.Object obj, java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.lang.Class cls4, java.lang.Class cls5, java.lang.Class cls6, java.lang.Class cls7, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4, java.lang.reflect.Method method5, java.lang.reflect.Method method6, java.lang.reflect.Method method7, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper);
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper getOrCreateInstance(android.content.Context context) {
        synchronized (com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
                return null;
            }
            try {
                return INSTANCE.getOrCreateInstance(context);
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
                return null;
            }
        }
    }

    private InAppPurchaseBillingClientWrapper(android.content.Context context, java.lang.Object obj, java.lang.Class<?> cls, java.lang.Class<?> cls2, java.lang.Class<?> cls3, java.lang.Class<?> cls4, java.lang.Class<?> cls5, java.lang.Class<?> cls6, java.lang.Class<?> cls7, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4, java.lang.reflect.Method method5, java.lang.reflect.Method method6, java.lang.reflect.Method method7, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        this.context = context;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper;
        this.historyPurchaseSet = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public static final /* synthetic */ android.content.Context access$getContext$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.context;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.reflect.Method access$getGetOriginalJsonPurchaseHistoryMethod$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonPurchaseHistoryMethod;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.reflect.Method access$getGetOriginalJsonSkuMethod$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonSkuMethod;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.Set access$getHistoryPurchaseSet$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.historyPurchaseSet;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$getInitialized$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return initialized;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper access$getInstance$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return instance;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.Map access$getPurchaseDetailsMap$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return purchaseDetailsMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.Class access$getPurchaseHistoryRecordClazz$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.purchaseHistoryRecordClazz;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.Class access$getSkuDetailsClazz$p(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.skuDetailsClazz;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.Map access$getSkuDetailsMap$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return skuDetailsMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$isServiceConnected$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            instance = inAppPurchaseBillingClientWrapper;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
        }
    }

    public static final /* synthetic */ void access$startConnection(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapper.startConnection();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
        }
    }

    public final void queryPurchaseHistory(java.lang.String skuType, final java.lang.Runnable queryPurchaseHistoryRunnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuType, "skuType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            queryPurchaseHistoryAsync(skuType, new java.lang.Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.m5134queryPurchaseHistory$lambda0(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: queryPurchaseHistory$lambda-0, reason: not valid java name */
    public static final void m5134queryPurchaseHistory$lambda0(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper this$0, java.lang.Runnable queryPurchaseHistoryRunnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.querySkuDetailsAsync("inapp", new java.util.ArrayList(this$0.historyPurchaseSet), queryPurchaseHistoryRunnable);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.class);
        }
    }

    public final void queryPurchase(java.lang.String skuType, java.lang.Runnable querySkuRunnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuType, "skuType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, "inapp");
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod2 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.purchaseResultClazz, this.getPurchaseListMethod, invokeMethod, new java.lang.Object[0]);
            java.util.List list = invokeMethod2 instanceof java.util.List ? (java.util.List) invokeMethod2 : null;
            if (list == null) {
                return;
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
                    java.lang.Object invokeMethod3 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.getOriginalJsonMethod, obj, new java.lang.Object[0]);
                    java.lang.String str = invokeMethod3 instanceof java.lang.String ? (java.lang.String) invokeMethod3 : null;
                    if (str != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        if (jSONObject.has("productId")) {
                            java.lang.String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            java.util.Map<java.lang.String, org.json.JSONObject> map = purchaseDetailsMap;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                querySkuDetailsAsync(skuType, arrayList, querySkuRunnable);
            } catch (org.json.JSONException unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void querySkuDetailsAsync(java.lang.String skuType, java.util.List<java.lang.String> skuIDs, java.lang.Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new java.lang.Class[]{this.skuDetailsResponseListenerClazz}, new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.SkuDetailsResponseListenerWrapper(this, runnable));
            java.lang.Object skuDetailsParams = this.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(skuType, skuIDs);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, skuDetailsParams, newProxyInstance);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void queryPurchaseHistoryAsync(java.lang.String skuType, java.lang.Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new java.lang.Class[]{this.purchaseHistoryResponseListenerClazz}, new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.PurchaseHistoryResponseListenerWrapper(this, runnable));
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, skuType, newProxyInstance);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startConnection() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
            if (cls == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(this.billingClientClazz, METHOD_START_CONNECTION, cls);
            if (method == null) {
                return;
            }
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.BillingClientStateListenerWrapper());
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, this.billingClient, newProxyInstance);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$BillingClientStateListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BillingClientStateListenerWrapper implements java.lang.reflect.InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method m, java.lang.Object[] args) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "m");
                if (kotlin.jvm.internal.Intrinsics.areEqual(m.getName(), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SETUP_FINISHED)) {
                    com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.isServiceConnected().set(true);
                } else {
                    java.lang.String name = m.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (kotlin.text.StringsKt.endsWith$default(name, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SERVICE_DISCONNECTED, false, 2, (java.lang.Object) null)) {
                        com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.isServiceConnected().set(false);
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchasesUpdatedListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PurchasesUpdatedListenerWrapper implements java.lang.reflect.InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method m, java.lang.Object[] args) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "m");
                return null;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J0\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0002\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchaseHistoryResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "getPurchaseHistoryRecord", "", "purchaseHistoryRecordList", "", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class PurchaseHistoryResponseListenerWrapper implements java.lang.reflect.InvocationHandler {
        private java.lang.Runnable runnable;
        final /* synthetic */ com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper this$0;

        public PurchaseHistoryResponseListenerWrapper(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper this$0, java.lang.Runnable runnable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = this$0;
            this.runnable = runnable;
        }

        public final java.lang.Runnable getRunnable() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void setRunnable(java.lang.Runnable runnable) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.runnable = runnable;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
                if (kotlin.jvm.internal.Intrinsics.areEqual(method.getName(), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                    java.lang.Object obj = args == null ? null : args[1];
                    if (obj != null && (obj instanceof java.util.List)) {
                        getPurchaseHistoryRecord((java.util.List) obj);
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        private final void getPurchaseHistoryRecord(java.util.List<?> purchaseHistoryRecordList) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                for (java.lang.Object obj : purchaseHistoryRecordList) {
                    try {
                        com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
                        java.lang.Object invokeMethod = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getPurchaseHistoryRecordClazz$p(this.this$0), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonPurchaseHistoryMethod$p(this.this$0), obj, new java.lang.Object[0]);
                        java.lang.String str = invokeMethod instanceof java.lang.String ? (java.lang.String) invokeMethod : null;
                        if (str != null) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                            jSONObject.put("packageName", com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getContext$p(this.this$0).getPackageName());
                            if (jSONObject.has("productId")) {
                                java.lang.String skuID = jSONObject.getString("productId");
                                com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getHistoryPurchaseSet$p(this.this$0).add(skuID);
                                java.util.Map<java.lang.String, org.json.JSONObject> purchaseDetailsMap = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getPurchaseDetailsMap();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                purchaseDetailsMap.put(skuID, jSONObject);
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$SkuDetailsResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "invoke", "", "proxy", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parseSkuDetails", "", "skuDetailsObjectList", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class SkuDetailsResponseListenerWrapper implements java.lang.reflect.InvocationHandler {
        private java.lang.Runnable runnable;
        final /* synthetic */ com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper this$0;

        public SkuDetailsResponseListenerWrapper(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper this$0, java.lang.Runnable runnable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = this$0;
            this.runnable = runnable;
        }

        public final java.lang.Runnable getRunnable() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void setRunnable(java.lang.Runnable runnable) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.runnable = runnable;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method m, java.lang.Object[] args) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "m");
                if (kotlin.jvm.internal.Intrinsics.areEqual(m.getName(), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_ON_SKU_DETAILS_RESPONSE)) {
                    java.lang.Object obj = args == null ? null : args[1];
                    if (obj != null && (obj instanceof java.util.List)) {
                        parseSkuDetails((java.util.List) obj);
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void parseSkuDetails(java.util.List<?> skuDetailsObjectList) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
                for (java.lang.Object obj : skuDetailsObjectList) {
                    try {
                        com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
                        java.lang.Object invokeMethod = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getSkuDetailsClazz$p(this.this$0), com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonSkuMethod$p(this.this$0), obj, new java.lang.Object[0]);
                        java.lang.String str = invokeMethod instanceof java.lang.String ? (java.lang.String) invokeMethod : null;
                        if (str != null) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                            if (jSONObject.has("productId")) {
                                java.lang.String skuID = jSONObject.getString("productId");
                                java.util.Map<java.lang.String, org.json.JSONObject> skuDetailsMap = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.INSTANCE.getSkuDetailsMap();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                skuDetailsMap.put(skuID, jSONObject);
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010.2\n\u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)¨\u00064"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$Companion;", "", "()V", "CLASSNAME_BILLING_CLIENT", "", "CLASSNAME_BILLING_CLIENT_BUILDER", "CLASSNAME_BILLING_CLIENT_STATE_LISTENER", "CLASSNAME_PURCHASE", "CLASSNAME_PURCHASES_RESULT", "CLASSNAME_PURCHASE_HISTORY_RECORD", "CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER", "CLASSNAME_PURCHASE_UPDATED_LISTENER", "CLASSNAME_SKU_DETAILS", "CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER", "IN_APP", "METHOD_BUILD", "METHOD_ENABLE_PENDING_PURCHASES", "METHOD_GET_ORIGINAL_JSON", "METHOD_GET_PURCHASE_LIST", "METHOD_NEW_BUILDER", "METHOD_ON_BILLING_SERVICE_DISCONNECTED", "METHOD_ON_BILLING_SETUP_FINISHED", "METHOD_ON_PURCHASE_HISTORY_RESPONSE", "METHOD_ON_SKU_DETAILS_RESPONSE", "METHOD_QUERY_PURCHASES", "METHOD_QUERY_PURCHASE_HISTORY_ASYNC", "METHOD_QUERY_SKU_DETAILS_ASYNC", "METHOD_SET_LISTENER", "METHOD_START_CONNECTION", "PACKAGE_NAME", "PRODUCT_ID", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.C3232q2.p, "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "isServiceConnected", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "purchaseDetailsMap", "", "Lorg/json/JSONObject;", "getPurchaseDetailsMap", "()Ljava/util/Map;", "skuDetailsMap", "getSkuDetailsMap", "createBillingClient", "context", "Landroid/content/Context;", "billingClientClazz", "Ljava/lang/Class;", "createInstance", "", "getOrCreateInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.concurrent.atomic.AtomicBoolean isServiceConnected() {
            return com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$isServiceConnected$cp();
        }

        public final java.util.Map<java.lang.String, org.json.JSONObject> getPurchaseDetailsMap() {
            return com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getPurchaseDetailsMap$cp();
        }

        public final java.util.Map<java.lang.String, org.json.JSONObject> getSkuDetailsMap() {
            return com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getSkuDetailsMap$cp();
        }

        @kotlin.jvm.JvmStatic
        public final synchronized com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper getOrCreateInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getInitialized$cp().get()) {
                return com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getInstance$cp();
            }
            createInstance(context);
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getInitialized$cp().set(true);
            return com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getInstance$cp();
        }

        private final void createInstance(android.content.Context context) {
            java.lang.Object createBillingClient;
            com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper orCreateInstance = com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.INSTANCE.getOrCreateInstance();
            if (orCreateInstance == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls2 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls3 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASES_RESULT);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils4 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls4 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils5 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls5 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RECORD);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils6 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls6 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils7 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls7 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
            if (cls == null || cls3 == null || cls2 == null || cls4 == null || cls6 == null || cls5 == null || cls7 == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils8 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASES, java.lang.String.class);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils9 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method2 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls3, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_GET_PURCHASE_LIST, new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils10 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method3 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls2, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils11 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method4 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls4, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils12 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method5 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls5, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils13 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method6 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_QUERY_SKU_DETAILS_ASYNC, orCreateInstance.getSkuDetailsParamsClazz(), cls6);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils14 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method7 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, java.lang.String.class, cls7);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null || (createBillingClient = createBillingClient(context, cls)) == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$setInstance$cp(new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper(context, createBillingClient, cls, cls3, cls2, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, orCreateInstance, null));
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper access$getInstance$cp = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.access$startConnection(access$getInstance$cp);
        }

        private final java.lang.Object createBillingClient(android.content.Context context, java.lang.Class<?> billingClientClazz) {
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT_BUILDER);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls2 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_UPDATED_LISTENER);
            if (cls == null || cls2 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(billingClientClazz, "newBuilder", android.content.Context.class);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils4 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method2 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, "enablePendingPurchases", new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils5 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method3 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_SET_LISTENER, cls2);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils6 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method4 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.METHOD_BUILD, new java.lang.Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils7 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(billingClientClazz, method, null, context);
            if (invokeMethod == null) {
                return null;
            }
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls2.getClassLoader(), new java.lang.Class[]{cls2}, new com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.PurchasesUpdatedListenerWrapper());
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils8 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod2 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(cls, method3, invokeMethod, newProxyInstance);
            if (invokeMethod2 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils9 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod3 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(cls, method2, invokeMethod2, new java.lang.Object[0]);
            if (invokeMethod3 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils10 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            return com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(cls, method4, invokeMethod3, new java.lang.Object[0]);
        }
    }
}
