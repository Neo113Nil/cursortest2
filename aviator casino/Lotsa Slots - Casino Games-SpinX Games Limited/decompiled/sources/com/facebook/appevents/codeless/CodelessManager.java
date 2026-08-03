package com.facebook.appevents.codeless;

/* compiled from: CodelessManager.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0007J\r\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\bH\u0001¢\u0006\u0002\b!R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/appevents/codeless/CodelessManager;", "", "()V", "deviceSessionID", "", "isAppIndexingEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCheckingSession", "", "isCodelessEnabled", "sensorManager", "Landroid/hardware/SensorManager;", "viewIndexer", "Lcom/facebook/appevents/codeless/ViewIndexer;", "viewIndexingTrigger", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "checkCodelessSession", "", "applicationId", "disable", com.ironsource.mediationsdk.metadata.a.j, "getCurrentDeviceSessionID", "getCurrentDeviceSessionID$facebook_core_release", "getIsAppIndexingEnabled", "getIsAppIndexingEnabled$facebook_core_release", "isDebugOnEmulator", "onActivityDestroyed", "activity", "Landroid/app/Activity;", "onActivityPaused", "onActivityResumed", "updateAppIndexing", "appIndexingEnabled", "updateAppIndexing$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CodelessManager {
    private static java.lang.String deviceSessionID;
    private static volatile boolean isCheckingSession;
    private static android.hardware.SensorManager sensorManager;
    private static com.facebook.appevents.codeless.ViewIndexer viewIndexer;
    public static final com.facebook.appevents.codeless.CodelessManager INSTANCE = new com.facebook.appevents.codeless.CodelessManager();
    private static final com.facebook.appevents.codeless.ViewIndexingTrigger viewIndexingTrigger = new com.facebook.appevents.codeless.ViewIndexingTrigger();
    private static final java.util.concurrent.atomic.AtomicBoolean isCodelessEnabled = new java.util.concurrent.atomic.AtomicBoolean(true);
    private static final java.util.concurrent.atomic.AtomicBoolean isAppIndexingEnabled = new java.util.concurrent.atomic.AtomicBoolean(false);

    private final boolean isDebugOnEmulator() {
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this);
        return false;
    }

    private CodelessManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityResumed(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            if (isCodelessEnabled.get()) {
                com.facebook.appevents.codeless.CodelessMatcher.INSTANCE.getInstance().add(activity);
                android.content.Context applicationContext = activity.getApplicationContext();
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                final java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
                com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
                final com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (appSettingsWithoutQuery == null ? null : java.lang.Boolean.valueOf(appSettingsWithoutQuery.getCodelessEventsEnabled())), (java.lang.Object) true) || INSTANCE.isDebugOnEmulator()) {
                    android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    android.hardware.Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    com.facebook.appevents.codeless.ViewIndexer viewIndexer2 = new com.facebook.appevents.codeless.ViewIndexer(activity);
                    viewIndexer = viewIndexer2;
                    com.facebook.appevents.codeless.ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                    viewIndexingTrigger2.setOnShakeListener(new com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener() { // from class: com.facebook.appevents.codeless.CodelessManager$$ExternalSyntheticLambda0
                        @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
                        public final void onShake() {
                            com.facebook.appevents.codeless.CodelessManager.m5121onActivityResumed$lambda0(com.facebook.internal.FetchedAppSettings.this, applicationId);
                        }
                    });
                    sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                    if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        viewIndexer2.schedule();
                    }
                }
                com.facebook.appevents.codeless.CodelessManager codelessManager = INSTANCE;
                if (!codelessManager.isDebugOnEmulator() || isAppIndexingEnabled.get()) {
                    return;
                }
                codelessManager.checkCodelessSession(applicationId);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-0, reason: not valid java name */
    public static final void m5121onActivityResumed$lambda0(com.facebook.internal.FetchedAppSettings fetchedAppSettings, java.lang.String appId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z = fetchedAppSettings != null && fetchedAppSettings.getCodelessEventsEnabled();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            boolean codelessSetupEnabled = com.facebook.FacebookSdk.getCodelessSetupEnabled();
            if (z && codelessSetupEnabled) {
                INSTANCE.checkCodelessSession(appId);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityPaused(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            if (isCodelessEnabled.get()) {
                com.facebook.appevents.codeless.CodelessMatcher.INSTANCE.getInstance().remove(activity);
                com.facebook.appevents.codeless.ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.unschedule();
                }
                android.hardware.SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 == null) {
                    return;
                }
                sensorManager2.unregisterListener(viewIndexingTrigger);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityDestroyed(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.facebook.appevents.codeless.CodelessMatcher.INSTANCE.getInstance().destroy(activity);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    private final void checkCodelessSession(final java.lang.String applicationId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.codeless.CodelessManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.codeless.CodelessManager.m5120checkCodelessSession$lambda1(applicationId);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCodelessSession$lambda-1, reason: not valid java name */
    public static final void m5120checkCodelessSession$lambda1(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(com.facebook.FacebookSdk.getApplicationContext());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(android.os.Build.MODEL != null ? android.os.Build.MODEL : "");
            if ((attributionIdentifiers == null ? null : attributionIdentifiers.getAndroidAdvertiserId()) != null) {
                jSONArray.put(attributionIdentifiers.getAndroidAdvertiserId());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            jSONArray.put(com.facebook.appevents.internal.AppEventUtility.isEmulator() ? "1" : "0");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Locale currentLocale = com.facebook.internal.Utility.getCurrentLocale();
            jSONArray.put(currentLocale.getLanguage() + '_' + ((java.lang.Object) currentLocale.getCountry()));
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
            bundle.putString(com.facebook.appevents.codeless.internal.Constants.DEVICE_SESSION_ID, getCurrentDeviceSessionID$facebook_core_release());
            bundle.putString(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray2);
            com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            boolean z = true;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s/app_indexing_session", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            org.json.JSONObject graphObject = companion.newPostRequestWithBundle(null, format, bundle, null).executeAndWait().getGraphObject();
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (graphObject == null || !graphObject.optBoolean(com.facebook.appevents.codeless.internal.Constants.APP_INDEXING_ENABLED, false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (!atomicBoolean.get()) {
                deviceSessionID = null;
            } else {
                com.facebook.appevents.codeless.ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.schedule();
                }
            }
            isCheckingSession = false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCurrentDeviceSessionID$facebook_core_release() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = java.util.UUID.randomUUID().toString();
            }
            java.lang.String str = deviceSessionID;
            if (str != null) {
                return str;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getIsAppIndexingEnabled$facebook_core_release() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void updateAppIndexing$facebook_core_release(boolean appIndexingEnabled) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessManager.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessManager.class);
        }
    }
}
