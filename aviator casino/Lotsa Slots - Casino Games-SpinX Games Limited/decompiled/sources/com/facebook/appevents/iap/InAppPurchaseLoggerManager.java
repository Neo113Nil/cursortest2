package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseLoggerManager.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\rH\u0001¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJC\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0001¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0007J2\u0010 \u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\r2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007J\u001c\u0010!\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseLoggerManager;", "", "()V", "CACHE_CLEAR_TIME_LIMIT_SEC", "", com.facebook.appevents.iap.InAppPurchaseLoggerManager.LAST_CLEARED_TIME, "", com.facebook.appevents.iap.InAppPurchaseLoggerManager.LAST_QUERY_PURCHASE_HISTORY_TIME, "PRODUCT_DETAILS_STORE", com.facebook.appevents.iap.InAppPurchaseLoggerManager.PURCHASE_DETAILS_SET, "PURCHASE_IN_CACHE_INTERVAL", "PURCHASE_TIME", "cachedPurchaseMap", "", "", "cachedPurchaseSet", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "cacheDeDupPurchase", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "cacheDeDupPurchase$facebook_core_release", "clearOutdatedProductInfoInCache", "", "clearOutdatedProductInfoInCache$facebook_core_release", "constructLoggingReadyMap", "skuDetailsMap", "constructLoggingReadyMap$facebook_core_release", "eligibleQueryPurchaseHistory", "", "filterPurchaseLogging", "logPurchases", "readPurchaseCache", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseLoggerManager {
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    private static final java.lang.String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final java.lang.String LAST_QUERY_PURCHASE_HISTORY_TIME = "LAST_QUERY_PURCHASE_HISTORY_TIME";
    private static final java.lang.String PRODUCT_DETAILS_STORE = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final java.lang.String PURCHASE_DETAILS_SET = "PURCHASE_DETAILS_SET";
    private static final int PURCHASE_IN_CACHE_INTERVAL = 86400;
    private static final java.lang.String PURCHASE_TIME = "purchaseTime";
    private static android.content.SharedPreferences sharedPreferences;
    public static final com.facebook.appevents.iap.InAppPurchaseLoggerManager INSTANCE = new com.facebook.appevents.iap.InAppPurchaseLoggerManager();
    private static final java.util.Set<java.lang.String> cachedPurchaseSet = new java.util.concurrent.CopyOnWriteArraySet();
    private static final java.util.Map<java.lang.String, java.lang.Long> cachedPurchaseMap = new java.util.concurrent.ConcurrentHashMap();

    private InAppPurchaseLoggerManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void readPurchaseCache() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences2 = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences3 = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences2.contains(LAST_CLEARED_TIME)) {
                sharedPreferences2.edit().clear().apply();
                sharedPreferences3.edit().clear().apply();
            }
            com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences4 = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences4, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            sharedPreferences = sharedPreferences4;
            java.util.Set<java.lang.String> set = cachedPurchaseSet;
            if (sharedPreferences4 != null) {
                java.util.Set<java.lang.String> stringSet = sharedPreferences4.getStringSet(PURCHASE_DETAILS_SET, new java.util.HashSet());
                if (stringSet == null) {
                    stringSet = new java.util.HashSet<>();
                }
                set.addAll(stringSet);
                java.util.Iterator<java.lang.String> it = set.iterator();
                while (it.hasNext()) {
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{";"}, false, 2, 2, (java.lang.Object) null);
                    cachedPurchaseMap.put(split$default.get(0), java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) split$default.get(1))));
                }
                clearOutdatedProductInfoInCache$facebook_core_release();
                return;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void filterPurchaseLogging(java.util.Map<java.lang.String, org.json.JSONObject> purchaseDetailsMap, java.util.Map<java.lang.String, ? extends org.json.JSONObject> skuDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            com.facebook.appevents.iap.InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
            inAppPurchaseLoggerManager.readPurchaseCache();
            inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(purchaseDetailsMap), skuDetailsMap));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseLoggerManager.class);
        }
    }

    private final void logPurchases(java.util.Map<java.lang.String, java.lang.String> purchaseDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : purchaseDetailsMap.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (key != null && value != null) {
                    com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
                    com.facebook.appevents.internal.AutomaticAnalyticsLogger.logPurchase(key, value, false);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final java.util.Map<java.lang.String, org.json.JSONObject> cacheDeDupPurchase$facebook_core_release(java.util.Map<java.lang.String, org.json.JSONObject> purchaseDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            for (java.util.Map.Entry entry : kotlin.collections.MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                org.json.JSONObject jSONObject = (org.json.JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        java.lang.String string = jSONObject.getString("purchaseToken");
                        if (cachedPurchaseMap.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            java.util.Set<java.lang.String> set = cachedPurchaseSet;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append((java.lang.Object) string);
                            sb.append(';');
                            sb.append(currentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            sharedPreferences2.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).apply();
            return new java.util.HashMap(purchaseDetailsMap);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void clearOutdatedProductInfoInCache$facebook_core_release() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences2.getLong(LAST_CLEARED_TIME, 0L);
            if (j == 0) {
                android.content.SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
            }
            if (currentTimeMillis - j > com.inmobi.media.core.config.models.TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                for (java.util.Map.Entry entry : kotlin.collections.MapsKt.toMap(cachedPurchaseMap).entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    long longValue = ((java.lang.Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        cachedPurchaseSet.remove(str + ';' + longValue);
                        cachedPurchaseMap.remove(str);
                    }
                }
                android.content.SharedPreferences sharedPreferences4 = sharedPreferences;
                if (sharedPreferences4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
                sharedPreferences4.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean eligibleQueryPurchaseHistory() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseLoggerManager.class)) {
            return false;
        }
        try {
            INSTANCE.readPurchaseCache();
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences2.getLong(LAST_QUERY_PURCHASE_HISTORY_TIME, 0L);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            android.content.SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 != null) {
                sharedPreferences3.edit().putLong(LAST_QUERY_PURCHASE_HISTORY_TIME, currentTimeMillis).apply();
                return true;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseLoggerManager.class);
            return false;
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> constructLoggingReadyMap$facebook_core_release(java.util.Map<java.lang.String, ? extends org.json.JSONObject> purchaseDetailsMap, java.util.Map<java.lang.String, ? extends org.json.JSONObject> skuDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, ? extends org.json.JSONObject> entry : purchaseDetailsMap.entrySet()) {
                java.lang.String key = entry.getKey();
                org.json.JSONObject value = entry.getValue();
                org.json.JSONObject jSONObject = skuDetailsMap.get(key);
                if (value != null && value.has(PURCHASE_TIME)) {
                    try {
                        if (currentTimeMillis - (value.getLong(PURCHASE_TIME) / 1000) <= 86400 && jSONObject != null) {
                            java.lang.String jSONObject2 = value.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "purchaseDetail.toString()");
                            java.lang.String jSONObject3 = jSONObject.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
