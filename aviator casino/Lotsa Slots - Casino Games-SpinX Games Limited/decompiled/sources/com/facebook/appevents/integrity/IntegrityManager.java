package com.facebook.appevents.integrity;

/* compiled from: IntegrityManager.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001c\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/integrity/IntegrityManager;", "", "()V", "INTEGRITY_TYPE_ADDRESS", "", "INTEGRITY_TYPE_HEALTH", "INTEGRITY_TYPE_NONE", "RESTRICTIVE_ON_DEVICE_PARAMS_KEY", "enabled", "", "isSampleEnabled", com.ironsource.mediationsdk.metadata.a.j, "", "getIntegrityPredictionResult", "textFeature", "processParameters", "parameters", "", "shouldFilter", "input", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class IntegrityManager {
    public static final com.facebook.appevents.integrity.IntegrityManager INSTANCE = new com.facebook.appevents.integrity.IntegrityManager();
    public static final java.lang.String INTEGRITY_TYPE_ADDRESS = "address";
    public static final java.lang.String INTEGRITY_TYPE_HEALTH = "health";
    public static final java.lang.String INTEGRITY_TYPE_NONE = "none";
    private static final java.lang.String RESTRICTIVE_ON_DEVICE_PARAMS_KEY = "_onDeviceParams";
    private static boolean enabled;
    private static boolean isSampleEnabled;

    private IntegrityManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.IntegrityManager.class)) {
            return;
        }
        try {
            enabled = true;
            com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            isSampleEnabled = com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey("FBSDKFeatureIntegritySample", com.facebook.FacebookSdk.getApplicationId(), false);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.IntegrityManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processParameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.IntegrityManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!enabled || parameters.isEmpty()) {
                return;
            }
            try {
                java.util.List<java.lang.String> list = kotlin.collections.CollectionsKt.toList(parameters.keySet());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (java.lang.String str : list) {
                    java.lang.String str2 = parameters.get(str);
                    if (str2 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    java.lang.String str3 = str2;
                    com.facebook.appevents.integrity.IntegrityManager integrityManager = INSTANCE;
                    if (integrityManager.shouldFilter(str) || integrityManager.shouldFilter(str3)) {
                        parameters.remove(str);
                        if (!isSampleEnabled) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put(RESTRICTIVE_ON_DEVICE_PARAMS_KEY, jSONObject2);
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.IntegrityManager.class);
        }
    }

    private final boolean shouldFilter(java.lang.String input) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return !kotlin.jvm.internal.Intrinsics.areEqual("none", getIntegrityPredictionResult(input));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final java.lang.String getIntegrityPredictionResult(java.lang.String textFeature) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            com.facebook.appevents.ml.ModelManager modelManager = com.facebook.appevents.ml.ModelManager.INSTANCE;
            java.lang.String[] predict = com.facebook.appevents.ml.ModelManager.predict(com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new java.lang.String[]{textFeature});
            if (predict == null) {
                return "none";
            }
            java.lang.String str = predict[0];
            return str == null ? "none" : str;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
