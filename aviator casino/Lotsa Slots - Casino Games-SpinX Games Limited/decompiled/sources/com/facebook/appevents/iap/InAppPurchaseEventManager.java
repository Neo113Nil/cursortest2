package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseEventManager.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020,H\u0007J0\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/H\u0002J\u001e\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u0004H\u0002J\u001e\u00103\u001a\u0004\u0018\u00010\"2\n\u00104\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u00105\u001a\u00020\u0004H\u0002J0\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\u0006\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J*\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007J2\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J*\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007JF\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010'\u001a\u00020(2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020AH\u0007JF\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010'\u001a\u00020(2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020AH\u0002J\u000e\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\u0004JA\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\u00012\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010HH\u0002¢\u0006\u0002\u0010IJ\"\u0010J\u001a\u00020A2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J,\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040L2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/H\u0002J\u001c\u0010M\u001a\u00020,2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R2\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001ej\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f` X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"` X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0015*\u0004\u0018\u00010$0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0015*\u0004\u0018\u00010$0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseEventManager;", "", "()V", "AS_INTERFACE", "", "CACHE_CLEAR_TIME_LIMIT_SEC", "", com.facebook.appevents.iap.InAppPurchaseEventManager.DETAILS_LIST, "GET_PURCHASES", "GET_PURCHASE_HISTORY", "GET_SKU_DETAILS", "INAPP", com.facebook.appevents.iap.InAppPurchaseEventManager.INAPP_CONTINUATION_TOKEN, com.facebook.appevents.iap.InAppPurchaseEventManager.INAPP_PURCHASE_DATA_LIST, "IN_APP_BILLING_SERVICE", "IN_APP_BILLING_SERVICE_STUB", "IS_BILLING_SUPPORTED", com.facebook.appevents.iap.InAppPurchaseEventManager.ITEM_ID_LIST, com.facebook.appevents.iap.InAppPurchaseEventManager.LAST_CLEARED_TIME, "MAX_QUERY_PURCHASE_NUM", "PACKAGE_NAME", "kotlin.jvm.PlatformType", "PURCHASE_EXPIRE_TIME_SEC", "PURCHASE_INAPP_STORE", "PURCHASE_STOP_QUERY_TIME_SEC", com.facebook.appevents.iap.InAppPurchaseEventManager.RESPONSE_CODE, "SKU_DETAILS_STORE", "SKU_DETAIL_EXPIRE_TIME_SEC", "SUBSCRIPTION", "classMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "methodMap", "Ljava/lang/reflect/Method;", "purchaseInappSharedPrefs", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", com.facebook.appevents.iap.InAppPurchaseEventManager.AS_INTERFACE, "context", "Landroid/content/Context;", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "Landroid/os/IBinder;", "clearSkuDetailsCache", "", "filterPurchases", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, "getClass", "className", "getMethod", "classObj", "methodName", com.facebook.appevents.iap.InAppPurchaseEventManager.GET_PURCHASE_HISTORY, "inAppBillingObj", "type", "getPurchaseHistoryInapp", com.facebook.appevents.iap.InAppPurchaseEventManager.GET_PURCHASES, "getPurchasesInapp", "getPurchasesSubs", com.facebook.appevents.iap.InAppPurchaseEventManager.GET_SKU_DETAILS, "", "skuList", "isSubscription", "", "getSkuDetailsFromGoogle", "hasFreeTrialPeirod", "skuDetail", "invokeMethod", "obj", "args", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", com.facebook.appevents.iap.InAppPurchaseEventManager.IS_BILLING_SUPPORTED, "readSkuDetailsFromCache", "", "writeSkuDetailsToCache", "skuDetailsMap", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseEventManager {
    private static final java.lang.String AS_INTERFACE = "asInterface";
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    private static final java.lang.String DETAILS_LIST = "DETAILS_LIST";
    private static final java.lang.String GET_PURCHASES = "getPurchases";
    private static final java.lang.String GET_PURCHASE_HISTORY = "getPurchaseHistory";
    private static final java.lang.String GET_SKU_DETAILS = "getSkuDetails";
    private static final java.lang.String INAPP = "inapp";
    private static final java.lang.String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    private static final java.lang.String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final java.lang.String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
    private static final java.lang.String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final java.lang.String IS_BILLING_SUPPORTED = "isBillingSupported";
    private static final java.lang.String ITEM_ID_LIST = "ITEM_ID_LIST";
    private static final java.lang.String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final int MAX_QUERY_PURCHASE_NUM = 30;
    private static final java.lang.String PACKAGE_NAME;
    private static final int PURCHASE_EXPIRE_TIME_SEC = 86400;
    private static final java.lang.String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
    private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
    private static final java.lang.String RESPONSE_CODE = "RESPONSE_CODE";
    private static final java.lang.String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
    private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
    private static final java.lang.String SUBSCRIPTION = "subs";
    private static final android.content.SharedPreferences purchaseInappSharedPrefs;
    private static final android.content.SharedPreferences skuDetailSharedPrefs;
    public static final com.facebook.appevents.iap.InAppPurchaseEventManager INSTANCE = new com.facebook.appevents.iap.InAppPurchaseEventManager();
    private static final java.util.HashMap<java.lang.String, java.lang.reflect.Method> methodMap = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Class<?>> classMap = new java.util.HashMap<>();

    private InAppPurchaseEventManager() {
    }

    static {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        PACKAGE_NAME = com.facebook.FacebookSdk.getApplicationContext().getPackageName();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        skuDetailSharedPrefs = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(SKU_DETAILS_STORE, 0);
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        purchaseInappSharedPrefs = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(PURCHASE_INAPP_STORE, 0);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Object asInterface(android.content.Context context, android.os.IBinder service) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return INSTANCE.invokeMethod(context, IN_APP_BILLING_SERVICE_STUB, AS_INTERFACE, null, new java.lang.Object[]{service});
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> getSkuDetails(android.content.Context context, java.util.ArrayList<java.lang.String> skuList, java.lang.Object inAppBillingObj, boolean isSubscription) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuList, "skuList");
            java.util.Map<java.lang.String, java.lang.String> readSkuDetailsFromCache = INSTANCE.readSkuDetailsFromCache(skuList);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator<java.lang.String> it = skuList.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (!readSkuDetailsFromCache.containsKey(next)) {
                    arrayList.add(next);
                }
            }
            readSkuDetailsFromCache.putAll(INSTANCE.getSkuDetailsFromGoogle(context, arrayList, inAppBillingObj, isSubscription));
            return readSkuDetailsFromCache;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
            return null;
        }
    }

    private final java.util.Map<java.lang.String, java.lang.String> getSkuDetailsFromGoogle(android.content.Context context, java.util.ArrayList<java.lang.String> skuList, java.lang.Object inAppBillingObj, boolean isSubscription) {
        int size;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.Map<java.lang.String, java.lang.String> linkedHashMap = new java.util.LinkedHashMap<>();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList(ITEM_ID_LIST, skuList);
                java.lang.Object[] objArr = new java.lang.Object[4];
                int i = 0;
                objArr[0] = 3;
                objArr[1] = PACKAGE_NAME;
                objArr[2] = isSubscription ? "subs" : "inapp";
                objArr[3] = bundle;
                java.lang.Object invokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, GET_SKU_DETAILS, inAppBillingObj, objArr);
                if (invokeMethod != null) {
                    android.os.Bundle bundle2 = (android.os.Bundle) invokeMethod;
                    if (bundle2.getInt(RESPONSE_CODE) == 0) {
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList(DETAILS_LIST);
                        if (stringArrayList != null && skuList.size() == stringArrayList.size() && skuList.size() - 1 >= 0) {
                            while (true) {
                                int i2 = i + 1;
                                java.lang.String str = skuList.get(i);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "skuList[i]");
                                java.lang.String str2 = stringArrayList.get(i);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i2 > size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        writeSkuDetailsToCache(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.util.Map<java.lang.String, java.lang.String> readSkuDetailsFromCache(java.util.ArrayList<java.lang.String> skuList) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            java.util.Iterator<java.lang.String> it = skuList.iterator();
            while (it.hasNext()) {
                java.lang.String sku = it.next();
                java.lang.String string = skuDetailSharedPrefs.getString(sku, null);
                if (string != null) {
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{";"}, false, 2, 2, (java.lang.Object) null);
                    if (currentTimeMillis - java.lang.Long.parseLong((java.lang.String) split$default.get(0)) < 43200) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void writeSkuDetailsToCache(java.util.Map<java.lang.String, java.lang.String> skuDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            android.content.SharedPreferences.Editor edit = skuDetailSharedPrefs.edit();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : skuDetailsMap.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isBillingSupported(android.content.Context context, java.lang.Object inAppBillingObj, java.lang.String type) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            java.lang.Object invokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, IS_BILLING_SUPPORTED, inAppBillingObj, new java.lang.Object[]{3, PACKAGE_NAME, type});
            if (invokeMethod != null) {
                return ((java.lang.Integer) invokeMethod).intValue() == 0;
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.ArrayList<java.lang.String> getPurchasesInapp(android.content.Context context, java.lang.Object inAppBillingObj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, inAppBillingObj, "inapp"));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.ArrayList<java.lang.String> getPurchasesSubs(android.content.Context context, java.lang.Object inAppBillingObj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, inAppBillingObj, "subs"));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:28:0x0064 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.ArrayList<java.lang.String> getPurchases(android.content.Context context, java.lang.Object inAppBillingObj, java.lang.String type) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (inAppBillingObj != null && isBillingSupported(context, inAppBillingObj, type)) {
                java.lang.String str = null;
                int i = 0;
                do {
                    java.lang.Object invokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, GET_PURCHASES, inAppBillingObj, new java.lang.Object[]{3, PACKAGE_NAME, type, str});
                    if (invokeMethod != null) {
                        android.os.Bundle bundle = (android.os.Bundle) invokeMethod;
                        if (bundle.getInt(RESPONSE_CODE) == 0) {
                            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST);
                            if (stringArrayList == null) {
                                break;
                            }
                            i += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            str = bundle.getString(INAPP_CONTINUATION_TOKEN);
                            if (i < 30) {
                                break;
                            }
                        }
                    }
                    str = null;
                    if (i < 30) {
                    }
                } while (str != null);
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean hasFreeTrialPeirod(java.lang.String skuDetail) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                java.lang.String optString = new org.json.JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (org.json.JSONException unused) {
                return false;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.ArrayList<java.lang.String> getPurchaseHistoryInapp(android.content.Context context, java.lang.Object inAppBillingObj) {
        com.facebook.appevents.iap.InAppPurchaseEventManager inAppPurchaseEventManager;
        java.lang.Class<?> cls;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            return (inAppBillingObj == null || (cls = (inAppPurchaseEventManager = INSTANCE).getClass(context, IN_APP_BILLING_SERVICE)) == null || inAppPurchaseEventManager.getMethod(cls, GET_PURCHASE_HISTORY) == null) ? arrayList : inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchaseHistory(context, inAppBillingObj, "inapp"));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
            return null;
        }
    }

    private final java.util.ArrayList<java.lang.String> getPurchaseHistory(android.content.Context context, java.lang.Object inAppBillingObj, java.lang.String type) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (isBillingSupported(context, inAppBillingObj, type)) {
                java.lang.String str = null;
                int i = 0;
                boolean z = false;
                do {
                    java.lang.Object invokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, GET_PURCHASE_HISTORY, inAppBillingObj, new java.lang.Object[]{6, PACKAGE_NAME, type, str, new android.os.Bundle()});
                    if (invokeMethod != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                        android.os.Bundle bundle = (android.os.Bundle) invokeMethod;
                        if (bundle.getInt(RESPONSE_CODE) == 0 && (stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST)) != null) {
                            java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.String next = it.next();
                                if (currentTimeMillis - (new org.json.JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str = bundle.getString(INAPP_CONTINUATION_TOKEN);
                            if (i < 30 || str == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str = null;
                    if (i < 30) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.util.ArrayList<java.lang.String> filterPurchases(java.util.ArrayList<java.lang.String> purchases) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            android.content.SharedPreferences.Editor edit = purchaseInappSharedPrefs.edit();
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            java.util.Iterator<java.lang.String> it = purchases.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(next);
                    java.lang.String string = jSONObject.getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j = jSONObject.getLong("purchaseTime");
                    java.lang.String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !kotlin.jvm.internal.Intrinsics.areEqual(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList.add(next);
                    }
                } catch (org.json.JSONException unused) {
                }
            }
            edit.apply();
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final java.lang.reflect.Method getMethod(java.lang.Class<?> classObj, java.lang.String methodName) {
        java.lang.Class[] clsArr;
        java.lang.reflect.Method declaredMethod$facebook_core_release;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> hashMap = methodMap;
            java.lang.reflect.Method method = hashMap.get(methodName);
            if (method != null) {
                return method;
            }
            switch (methodName.hashCode()) {
                case -1801122596:
                    if (!methodName.equals(GET_PURCHASES)) {
                        clsArr = null;
                        break;
                    } else {
                        java.lang.Class TYPE = java.lang.Integer.TYPE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new java.lang.Class[]{TYPE, java.lang.String.class, java.lang.String.class, java.lang.String.class};
                        break;
                    }
                case -1450694211:
                    if (!methodName.equals(IS_BILLING_SUPPORTED)) {
                        clsArr = null;
                        break;
                    } else {
                        java.lang.Class TYPE2 = java.lang.Integer.TYPE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                        clsArr = new java.lang.Class[]{TYPE2, java.lang.String.class, java.lang.String.class};
                        break;
                    }
                case -1123215065:
                    if (!methodName.equals(AS_INTERFACE)) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new java.lang.Class[]{android.os.IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!methodName.equals(GET_PURCHASE_HISTORY)) {
                        clsArr = null;
                        break;
                    } else {
                        java.lang.Class TYPE3 = java.lang.Integer.TYPE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                        clsArr = new java.lang.Class[]{TYPE3, java.lang.String.class, java.lang.String.class, java.lang.String.class, android.os.Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!methodName.equals(GET_SKU_DETAILS)) {
                        clsArr = null;
                        break;
                    } else {
                        java.lang.Class TYPE4 = java.lang.Integer.TYPE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                        clsArr = new java.lang.Class[]{TYPE4, java.lang.String.class, java.lang.String.class, android.os.Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
                declaredMethod$facebook_core_release = com.facebook.appevents.iap.InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(classObj, methodName, null);
            } else {
                com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
                declaredMethod$facebook_core_release = com.facebook.appevents.iap.InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(classObj, methodName, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            }
            if (declaredMethod$facebook_core_release != null) {
                hashMap.put(methodName, declaredMethod$facebook_core_release);
            }
            return declaredMethod$facebook_core_release;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.lang.Class<?> getClass(android.content.Context context, java.lang.String className) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.HashMap<java.lang.String, java.lang.Class<?>> hashMap = classMap;
            java.lang.Class<?> cls = hashMap.get(className);
            if (cls != null) {
                return cls;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> classFromContext$facebook_core_release = com.facebook.appevents.iap.InAppPurchaseUtils.getClassFromContext$facebook_core_release(context, className);
            if (classFromContext$facebook_core_release != null) {
                hashMap.put(className, classFromContext$facebook_core_release);
            }
            return classFromContext$facebook_core_release;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.lang.Object invokeMethod(android.content.Context context, java.lang.String className, java.lang.String methodName, java.lang.Object obj, java.lang.Object[] args) {
        java.lang.reflect.Method method;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.lang.Class<?> cls = getClass(context, className);
            if (cls == null || (method = getMethod(cls, methodName)) == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            return com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(cls, method, obj, java.util.Arrays.copyOf(args, args.length));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void clearSkuDetailsCache() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseEventManager.class)) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            android.content.SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j = sharedPreferences.getLong(LAST_CLEARED_TIME, 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
            } else if (currentTimeMillis - j > CACHE_CLEAR_TIME_LIMIT_SEC) {
                sharedPreferences.edit().clear().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseEventManager.class);
        }
    }
}
