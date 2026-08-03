package com.unity3d.services.analytics;

/* loaded from: classes5.dex */
public class UnityAnalytics {
    protected static org.json.JSONArray eventQueue = new org.json.JSONArray();

    private enum AnalyticsEventType {
        POSTEVENT
    }

    private static org.json.JSONObject createItemAcquired(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currency_type", acquisitionType.toString());
        hashMap.put("transaction_context", str);
        hashMap.put(com.ironsource.C3300u.l, f);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, str2);
        hashMap.put("balance", f2);
        hashMap.put("item_type", str3);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, str4);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID, str5);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", 1533594423477L);
        hashMap2.put("name", "item_acquired");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("type", "analytics.custom.v1");
        hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap2);
        return new org.json.JSONObject(hashMap3);
    }

    private static org.json.JSONObject createItemSpent(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currency_type", acquisitionType.toString());
        hashMap.put("transaction_context", str);
        hashMap.put(com.ironsource.C3300u.l, f);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, str2);
        hashMap.put("balance", f2);
        hashMap.put("item_type", str3);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, str4);
        hashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID, str5);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        hashMap2.put("name", "item_spent");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("type", "analytics.custom.v1");
        hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap2);
        return new org.json.JSONObject(hashMap3);
    }

    private static org.json.JSONObject createLevelFail(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("level_index", str);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        hashMap2.put("name", "level_fail");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("type", "analytics.custom.v1");
        hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap2);
        return new org.json.JSONObject(hashMap3);
    }

    private static org.json.JSONObject createLevelUp(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("new_level_index", str);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        hashMap2.put("name", com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("type", "analytics.custom.v1");
        hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap2);
        return new org.json.JSONObject(hashMap3);
    }

    private static org.json.JSONObject createAdComplete(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("rewarded", bool);
        hashMap.put("network", str);
        hashMap.put(com.google.ads.mediation.facebook.FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str2);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        hashMap2.put("name", "ad_complete");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("type", "analytics.custom.v1");
        hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap2);
        return new org.json.JSONObject(hashMap3);
    }

    private static org.json.JSONObject createIapTransaction(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        hashMap.put("productid", str);
        hashMap.put(com.ironsource.C3300u.l, f);
        hashMap.put("currency", str2);
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_PROMO, bool);
        hashMap.put("receipt", str3);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("type", "analytics.transaction.v1");
        hashMap2.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, hashMap);
        return new org.json.JSONObject(hashMap2);
    }

    public static void onItemAcquired(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        postEvent(createItemAcquired(str, f, str2, f2, str3, str4, str5, acquisitionType));
    }

    public static void onItemSpent(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        postEvent(createItemSpent(str, f, str2, f2, str3, str4, str5, acquisitionType));
    }

    public static void onLevelFail(java.lang.String str) {
        postEvent(createLevelFail(str));
    }

    public static void onLevelUp(java.lang.String str) {
        postEvent(createLevelUp(str));
    }

    public static void onAdComplete(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        postEvent(createAdComplete(str, str2, bool));
    }

    public static void onIapTransaction(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3) {
        postEvent(createIapTransaction(str, f, str2, bool, str3));
    }

    public static void onEvent(org.json.JSONObject jSONObject) {
        postEvent(jSONObject);
    }

    private static synchronized void postEvent(org.json.JSONObject jSONObject) {
        synchronized (com.unity3d.services.analytics.UnityAnalytics.class) {
            if (eventQueue.length() < 200) {
                eventQueue.put(jSONObject);
            }
            com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
            if (currentApp != null) {
                boolean sendEvent = currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ANALYTICS, com.unity3d.services.analytics.UnityAnalytics.AnalyticsEventType.POSTEVENT, eventQueue.toString());
                java.lang.Boolean.valueOf(sendEvent).getClass();
                if (sendEvent) {
                    eventQueue = new org.json.JSONArray();
                }
            }
        }
    }
}
