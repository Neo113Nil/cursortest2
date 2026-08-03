package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveAnalyticsUtil {
    public static java.util.Map<java.lang.String, java.lang.Object> getCommonEventData(java.lang.String str, java.lang.String str2, long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.helpshift.util.Utils.isEmpty(str)) {
            hashMap.put("nId", str);
        }
        if (!com.helpshift.util.Utils.isEmpty(str2)) {
            hashMap.put("aId", str2);
        }
        if (j != 0) {
            hashMap.put("td", java.lang.Long.valueOf(j));
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getCommonEventData(com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification) {
        if (proactiveInappNotification == null) {
            return new java.util.HashMap();
        }
        return getCommonEventData(proactiveInappNotification.notificationId, proactiveInappNotification.analyticsId, proactiveInappNotification.deliveryTime);
    }

    public static void addPriority(int i, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (i == -1) {
            return;
        }
        map.put("p", java.lang.Integer.valueOf(i));
    }

    public static void addViewTime(long j, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (j == 0) {
            return;
        }
        map.put("tv", java.lang.Long.valueOf(j));
    }

    public static void addActionType(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        map.put("ca", str);
    }

    public static void addIsForegroundEventType(java.util.Map<java.lang.String, java.lang.Object> map, boolean z) {
        map.put("if", java.lang.Boolean.valueOf(z));
    }

    /* renamed from: com.helpshift.proactive.ProactiveAnalyticsUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType;

        static {
            int[] iArr = new int[com.helpshift.proactive.ProactiveInAppDismissType.values().length];
            $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType = iArr;
            try {
                iArr[com.helpshift.proactive.ProactiveInAppDismissType.AUTO_DISMISS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType[com.helpshift.proactive.ProactiveInAppDismissType.SWIPE_DISMISS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType[com.helpshift.proactive.ProactiveInAppDismissType.CROSS_BUTTON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType[com.helpshift.proactive.ProactiveInAppDismissType.OUTSIDE_CLICK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType[com.helpshift.proactive.ProactiveInAppDismissType.NAVIGATE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static void addDismissType(com.helpshift.proactive.ProactiveInAppDismissType proactiveInAppDismissType, java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.String str;
        int i = com.helpshift.proactive.ProactiveAnalyticsUtil.AnonymousClass1.$SwitchMap$com$helpshift$proactive$ProactiveInAppDismissType[proactiveInAppDismissType.ordinal()];
        if (i == 1) {
            str = "auto";
        } else if (i == 2) {
            str = "slide";
        } else if (i == 3) {
            str = "close";
        } else if (i == 4) {
            str = "outsideTap";
        } else if (i == 5) {
            str = "navigate";
        } else {
            str = "unknown";
        }
        map.put(com.ironsource.M6.w0, str);
    }

    public static void sendInAppEventToAnalytics(com.helpshift.analytics.HSAnalyticsEventDM hSAnalyticsEventDM, java.lang.String str, long j, java.util.Map<java.lang.String, java.lang.Object> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("t", str);
        jSONObject.put("ts", j);
        jSONObject.put("d", new org.json.JSONObject(map));
        hSAnalyticsEventDM.sendInAppEventToServer(jSONObject);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getBackgroundEventData(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, long j) {
        java.lang.String lastProactiveNotificationData = hSPersistentStorage.getLastProactiveNotificationData();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("al", java.lang.Long.valueOf(j));
        if (com.helpshift.util.Utils.isNotEmpty(lastProactiveNotificationData) && com.helpshift.util.JsonUtils.isValidJsonString(lastProactiveNotificationData)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(lastProactiveNotificationData);
            if (java.lang.System.currentTimeMillis() > jSONObject.optLong(com.helpshift.proactive.InAppViewConstants.EXPIRY)) {
                hSPersistentStorage.storeLastProactiveNotificationData("");
                return hashMap;
            }
            java.lang.String optString = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID);
            java.lang.String optString2 = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID);
            long optLong = jSONObject.optLong(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME);
            hashMap.put("p_nId", optString);
            hashMap.put("p_aId", optString2);
            hashMap.put("p_td", java.lang.Long.valueOf(optLong));
        }
        return hashMap;
    }
}
