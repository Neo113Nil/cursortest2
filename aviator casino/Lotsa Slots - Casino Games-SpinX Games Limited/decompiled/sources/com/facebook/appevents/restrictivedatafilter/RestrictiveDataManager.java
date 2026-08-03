package com.facebook.appevents.restrictivedatafilter;

/* compiled from: RestrictiveDataManager.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J&\u0010\u0019\u001a\u00020\u00122\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager;", "", "()V", "PROCESS_EVENT_NAME", "", "REPLACEMENT_STRING", "RESTRICTIVE_PARAM", "RESTRICTIVE_PARAM_KEY", "TAG", "kotlin.jvm.PlatformType", "enabled", "", "restrictedEvents", "", "restrictiveParamFilters", "", "Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", com.ironsource.mediationsdk.metadata.a.j, "", "getMatchedRuleType", com.ironsource.X3.i.j0, "paramKey", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "isRestrictedEvent", "processEvent", "processParameters", "parameters", "", "RestrictiveParamFilter", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RestrictiveDataManager {
    private static final java.lang.String PROCESS_EVENT_NAME = "process_event_name";
    private static final java.lang.String REPLACEMENT_STRING = "_removed_";
    private static final java.lang.String RESTRICTIVE_PARAM = "restrictive_param";
    private static final java.lang.String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static boolean enabled;
    public static final com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager INSTANCE = new com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager();
    private static final java.lang.String TAG = com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class.getCanonicalName();
    private static final java.util.List<com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.RestrictiveParamFilter> restrictiveParamFilters = new java.util.ArrayList();
    private static final java.util.Set<java.lang.String> restrictedEvents = new java.util.concurrent.CopyOnWriteArraySet();

    private RestrictiveDataManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class)) {
            return;
        }
        try {
            com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager restrictiveDataManager = INSTANCE;
            enabled = true;
            restrictiveDataManager.initialize();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class);
        }
    }

    private final void initialize() {
        java.lang.String restrictiveDataSetting;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings != null && (restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting()) != null && restrictiveDataSetting.length() != 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(restrictiveDataSetting);
                restrictiveParamFilters.clear();
                restrictedEvents.clear();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String key = keys.next();
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.RestrictiveParamFilter restrictiveParamFilter = new com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.RestrictiveParamFilter(key, new java.util.HashMap());
                        if (optJSONObject != null) {
                            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                            restrictiveParamFilter.setRestrictiveParams(com.facebook.internal.Utility.convertJSONObjectToStringMap(optJSONObject));
                            restrictiveParamFilters.add(restrictiveParamFilter);
                        }
                        if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                            restrictedEvents.add(restrictiveParamFilter.getEventName());
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String processEvent(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            return enabled ? INSTANCE.isRestrictedEvent(eventName) ? REPLACEMENT_STRING : eventName : eventName;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processParameters(java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.lang.String str : new java.util.ArrayList(parameters.keySet())) {
                    java.lang.String matchedRuleType = INSTANCE.getMatchedRuleType(eventName, str);
                    if (matchedRuleType != null) {
                        hashMap.put(str, matchedRuleType);
                        parameters.remove(str);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                        parameters.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.class);
        }
    }

    private final java.lang.String getMatchedRuleType(java.lang.String eventName, java.lang.String paramKey) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            try {
                for (com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.RestrictiveParamFilter restrictiveParamFilter : new java.util.ArrayList(restrictiveParamFilters)) {
                    if (restrictiveParamFilter != null && kotlin.jvm.internal.Intrinsics.areEqual(eventName, restrictiveParamFilter.getEventName())) {
                        for (java.lang.String str : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(paramKey, str)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(str);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "getMatchedRuleType failed", e);
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean isRestrictedEvent(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* compiled from: RestrictiveDataManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", "", com.ironsource.X3.i.j0, "", "restrictiveParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "getRestrictiveParams", "()Ljava/util/Map;", "setRestrictiveParams", "(Ljava/util/Map;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class RestrictiveParamFilter {
        private java.lang.String eventName;
        private java.util.Map<java.lang.String, java.lang.String> restrictiveParams;

        public RestrictiveParamFilter(java.lang.String eventName, java.util.Map<java.lang.String, java.lang.String> restrictiveParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.eventName = eventName;
            this.restrictiveParams = restrictiveParams;
        }

        public final java.lang.String getEventName() {
            return this.eventName;
        }

        public final void setEventName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.eventName = str;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setRestrictiveParams(java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }
}
