package com.facebook.appevents.eventdeactivation;

/* compiled from: EventDeactivationManager.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0002J&\u0010\u000e\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager;", "", "()V", "deprecatedEvents", "", "", "deprecatedParamFilters", "", "Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "enabled", "", com.ironsource.mediationsdk.metadata.a.j, "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "processDeprecatedParameters", "parameters", "", com.ironsource.X3.i.j0, "processEvents", "events", "Lcom/facebook/appevents/AppEvent;", "DeprecatedParamFilter", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class EventDeactivationManager {
    private static boolean enabled;
    public static final com.facebook.appevents.eventdeactivation.EventDeactivationManager INSTANCE = new com.facebook.appevents.eventdeactivation.EventDeactivationManager();
    private static final java.util.List<com.facebook.appevents.eventdeactivation.EventDeactivationManager.DeprecatedParamFilter> deprecatedParamFilters = new java.util.ArrayList();
    private static final java.util.Set<java.lang.String> deprecatedEvents = new java.util.HashSet();

    private EventDeactivationManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.eventdeactivation.EventDeactivationManager.class)) {
            return;
        }
        try {
            com.facebook.appevents.eventdeactivation.EventDeactivationManager eventDeactivationManager = INSTANCE;
            enabled = true;
            eventDeactivationManager.initialize();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.eventdeactivation.EventDeactivationManager.class);
        }
    }

    private final synchronized void initialize() {
        com.facebook.internal.FetchedAppSettings queryAppSettings;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return;
        }
        if (queryAppSettings == null) {
            return;
        }
        java.lang.String restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting();
        if (restrictiveDataSetting != null && restrictiveDataSetting.length() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(restrictiveDataSetting);
            deprecatedParamFilters.clear();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String key = keys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        java.util.Set<java.lang.String> set = deprecatedEvents;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        set.add(key);
                    } else {
                        org.json.JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        com.facebook.appevents.eventdeactivation.EventDeactivationManager.DeprecatedParamFilter deprecatedParamFilter = new com.facebook.appevents.eventdeactivation.EventDeactivationManager.DeprecatedParamFilter(key, new java.util.ArrayList());
                        if (optJSONArray != null) {
                            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                            deprecatedParamFilter.setDeprecateParams(com.facebook.internal.Utility.convertJSONArrayToList(optJSONArray));
                        }
                        deprecatedParamFilters.add(deprecatedParamFilter);
                    }
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processEvents(java.util.List<com.facebook.appevents.AppEvent> events) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.eventdeactivation.EventDeactivationManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "events");
            if (enabled) {
                java.util.Iterator<com.facebook.appevents.AppEvent> it = events.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.eventdeactivation.EventDeactivationManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processDeprecatedParameters(java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.eventdeactivation.EventDeactivationManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(parameters.keySet());
                for (com.facebook.appevents.eventdeactivation.EventDeactivationManager.DeprecatedParamFilter deprecatedParamFilter : new java.util.ArrayList(deprecatedParamFilters)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deprecatedParamFilter.getEventName(), eventName)) {
                        for (java.lang.String str : arrayList) {
                            if (deprecatedParamFilter.getDeprecateParams().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.eventdeactivation.EventDeactivationManager.class);
        }
    }

    /* compiled from: EventDeactivationManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "", com.ironsource.X3.i.j0, "", "deprecateParams", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDeprecateParams", "()Ljava/util/List;", "setDeprecateParams", "(Ljava/util/List;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DeprecatedParamFilter {
        private java.util.List<java.lang.String> deprecateParams;
        private java.lang.String eventName;

        public DeprecatedParamFilter(java.lang.String eventName, java.util.List<java.lang.String> deprecateParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.eventName = eventName;
            this.deprecateParams = deprecateParams;
        }

        public final java.util.List<java.lang.String> getDeprecateParams() {
            return this.deprecateParams;
        }

        public final java.lang.String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.deprecateParams = list;
        }

        public final void setEventName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.eventName = str;
        }
    }
}
