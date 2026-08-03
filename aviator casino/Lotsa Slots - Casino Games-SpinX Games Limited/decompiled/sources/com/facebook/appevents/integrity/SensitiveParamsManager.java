package com.facebook.appevents.integrity;

/* compiled from: SensitiveParamsManager.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/integrity/SensitiveParamsManager;", "", "()V", "DEFAULT_SENSITIVE_PARAMS_KEY", "", "SENSITIVE_PARAMS_KEY", "defaultSensitiveParameters", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "enabled", "", "sensitiveParameters", "", "disable", "", com.ironsource.mediationsdk.metadata.a.j, "loadSensitiveParameters", "processFilterSensitiveParams", "parameters", com.ironsource.X3.i.j0, "shouldFilterOut", "parameterKey", "sensitiveParamsForEvent", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SensitiveParamsManager {
    private static final java.lang.String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";
    private static final java.lang.String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static boolean enabled;
    public static final com.facebook.appevents.integrity.SensitiveParamsManager INSTANCE = new com.facebook.appevents.integrity.SensitiveParamsManager();
    private static java.util.HashSet<java.lang.String> defaultSensitiveParameters = new java.util.HashSet<>();
    private static java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> sensitiveParameters = new java.util.HashMap();

    private SensitiveParamsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> map;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.SensitiveParamsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadSensitiveParameters();
            java.util.HashSet<java.lang.String> hashSet = defaultSensitiveParameters;
            if ((hashSet != null && !hashSet.isEmpty()) || ((map = sensitiveParameters) != null && !map.isEmpty())) {
                enabled = true;
                return;
            }
            enabled = false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.SensitiveParamsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.SensitiveParamsManager.class)) {
            return;
        }
        try {
            enabled = false;
            sensitiveParameters = new java.util.HashMap();
            defaultSensitiveParameters = new java.util.HashSet<>();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.SensitiveParamsManager.class);
        }
    }

    private final void loadSensitiveParameters() {
        int length;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            int i = 0;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            try {
                defaultSensitiveParameters = new java.util.HashSet<>();
                sensitiveParameters = new java.util.HashMap();
                org.json.JSONArray sensitiveParams = queryAppSettings.getSensitiveParams();
                if (sensitiveParams == null || sensitiveParams.length() == 0 || (length = sensitiveParams.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject jSONObject = sensitiveParams.getJSONObject(i);
                    boolean has = jSONObject.has(com.ironsource.X3.i.W);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        java.lang.String sensitiveParamsScope = jSONObject.getString(com.ironsource.X3.i.W);
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (sensitiveParamsScope != null && jSONArray != null) {
                            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                            java.util.HashSet<java.lang.String> convertJSONArrayToHashSet = com.facebook.internal.Utility.convertJSONArrayToHashSet(jSONArray);
                            if (convertJSONArrayToHashSet != null) {
                                if (sensitiveParamsScope.equals(DEFAULT_SENSITIVE_PARAMS_KEY)) {
                                    defaultSensitiveParameters = convertJSONArrayToHashSet;
                                } else {
                                    java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> map = sensitiveParameters;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                    map.put(sensitiveParamsScope, convertJSONArrayToHashSet);
                                }
                            }
                        }
                    }
                    if (i2 >= length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processFilterSensitiveParams(java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.SensitiveParamsManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                java.util.HashSet<java.lang.String> hashSet = defaultSensitiveParameters;
                if ((hashSet == null || hashSet.isEmpty()) && !sensitiveParameters.containsKey(eventName)) {
                    return;
                }
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                try {
                    java.util.HashSet<java.lang.String> hashSet2 = sensitiveParameters.get(eventName);
                    for (java.lang.String str : new java.util.ArrayList(parameters.keySet())) {
                        if (INSTANCE.shouldFilterOut(str, hashSet2)) {
                            parameters.remove(str);
                            jSONArray.put(str);
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                if (jSONArray.length() > 0) {
                    parameters.put(SENSITIVE_PARAMS_KEY, jSONArray.toString());
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.SensitiveParamsManager.class);
        }
    }

    private final boolean shouldFilterOut(java.lang.String parameterKey, java.util.HashSet<java.lang.String> sensitiveParamsForEvent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!defaultSensitiveParameters.contains(parameterKey)) {
                java.util.HashSet<java.lang.String> hashSet = sensitiveParamsForEvent;
                if (hashSet != null && !hashSet.isEmpty()) {
                    if (!sensitiveParamsForEvent.contains(parameterKey)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
