package com.facebook.appevents.internal;

/* compiled from: AppEventsLoggerUtility.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "()V", "API_ACTIVITY_TYPE_TO_STRING", "", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "getJSONObjectForGraphAPICall", "Lorg/json/JSONObject;", "activityType", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "limitEventUsage", "", "context", "Landroid/content/Context;", "GraphAPIActivityType", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsLoggerUtility {
    public static final com.facebook.appevents.internal.AppEventsLoggerUtility INSTANCE = new com.facebook.appevents.internal.AppEventsLoggerUtility();
    private static final java.util.Map<com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType, java.lang.String> API_ACTIVITY_TYPE_TO_STRING = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), kotlin.TuplesKt.to(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    private AppEventsLoggerUtility() {
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType activityType, com.facebook.internal.AttributionIdentifiers attributionIdentifiers, java.lang.String anonymousAppDeviceGUID, boolean limitEventUsage, android.content.Context context) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "activityType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        java.lang.String userID = com.facebook.appevents.AppEventsLogger.INSTANCE.getUserID();
        if (userID != null) {
            jSONObject.put("app_user_id", userID);
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.setAppEventAttributionParameters(jSONObject, attributionIdentifiers, anonymousAppDeviceGUID, limitEventUsage, context);
        try {
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.setAppEventExtendedDeviceInfoParameters(jSONObject, context);
        } catch (java.lang.Exception e) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        org.json.JSONObject dataProcessingOptions = com.facebook.internal.Utility.getDataProcessingOptions();
        if (dataProcessingOptions != null) {
            java.util.Iterator<java.lang.String> keys = dataProcessingOptions.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject.put(next, dataProcessingOptions.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }

    /* compiled from: AppEventsLoggerUtility.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType[] valuesCustom() {
            com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType[] valuesCustom = values();
            return (com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }
}
