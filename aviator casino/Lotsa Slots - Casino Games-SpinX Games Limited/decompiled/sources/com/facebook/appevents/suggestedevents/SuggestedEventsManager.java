package com.facebook.appevents.suggestedevents;

/* compiled from: SuggestedEventsManager.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0002J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0014J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventsManager;", "", "()V", "ELIGIBLE_EVENTS_KEY", "", "PRODUCTION_EVENTS_KEY", "eligibleEvents", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "productionEvents", com.ironsource.mediationsdk.metadata.a.j, "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "isEligibleEvents", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "isEligibleEvents$facebook_core_release", "isEnabled", "isProductionEvents", "isProductionEvents$facebook_core_release", "populateEventsFromRawJsonString", "rawSuggestedEventSetting", "populateEventsFromRawJsonString$facebook_core_release", "trackActivity", "activity", "Landroid/app/Activity;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SuggestedEventsManager {
    private static final java.lang.String ELIGIBLE_EVENTS_KEY = "eligible_for_prediction_events";
    private static final java.lang.String PRODUCTION_EVENTS_KEY = "production_events";
    public static final com.facebook.appevents.suggestedevents.SuggestedEventsManager INSTANCE = new com.facebook.appevents.suggestedevents.SuggestedEventsManager();
    private static final java.util.concurrent.atomic.AtomicBoolean enabled = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.Set<java.lang.String> productionEvents = new java.util.LinkedHashSet();
    private static final java.util.Set<java.lang.String> eligibleEvents = new java.util.LinkedHashSet();

    private SuggestedEventsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void enable() {
        synchronized (com.facebook.appevents.suggestedevents.SuggestedEventsManager.class) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
                return;
            }
            try {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.suggestedevents.SuggestedEventsManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.suggestedevents.SuggestedEventsManager.m5150enable$lambda0();
                    }
                });
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enable$lambda-0, reason: not valid java name */
    public static final void m5150enable$lambda0() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
            return;
        }
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            INSTANCE.initialize();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
        }
    }

    private final void initialize() {
        java.lang.String suggestedEventsSetting;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null || (suggestedEventsSetting = queryAppSettings.getSuggestedEventsSetting()) == null) {
                return;
            }
            populateEventsFromRawJsonString$facebook_core_release(suggestedEventsSetting);
            if ((!productionEvents.isEmpty()) || (!eligibleEvents.isEmpty())) {
                com.facebook.appevents.ml.ModelManager modelManager = com.facebook.appevents.ml.ModelManager.INSTANCE;
                java.io.File ruleFile = com.facebook.appevents.ml.ModelManager.getRuleFile(com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                if (ruleFile == null) {
                    return;
                }
                com.facebook.appevents.suggestedevents.FeatureExtractor featureExtractor = com.facebook.appevents.suggestedevents.FeatureExtractor.INSTANCE;
                com.facebook.appevents.suggestedevents.FeatureExtractor.initialize(ruleFile);
                com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                android.app.Activity currentActivity = com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentActivity();
                if (currentActivity != null) {
                    trackActivity(currentActivity);
                }
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void populateEventsFromRawJsonString$facebook_core_release(java.lang.String rawSuggestedEventSetting) {
        org.json.JSONArray jSONArray;
        int length;
        org.json.JSONArray jSONArray2;
        int length2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(rawSuggestedEventSetting);
            int i = 0;
            if (jSONObject.has(PRODUCTION_EVENTS_KEY) && (length2 = (jSONArray2 = jSONObject.getJSONArray(PRODUCTION_EVENTS_KEY)).length()) > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    java.util.Set<java.lang.String> set = productionEvents;
                    java.lang.String string = jSONArray2.getString(i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i3 >= length2) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (!jSONObject.has(ELIGIBLE_EVENTS_KEY) || (length = (jSONArray = jSONObject.getJSONArray(ELIGIBLE_EVENTS_KEY)).length()) <= 0) {
                return;
            }
            while (true) {
                int i4 = i + 1;
                java.util.Set<java.lang.String> set2 = eligibleEvents;
                java.lang.String string2 = jSONArray.getString(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i4 >= length) {
                    return;
                } else {
                    i = i4;
                }
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void trackActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (enabled.get()) {
                    com.facebook.appevents.suggestedevents.FeatureExtractor featureExtractor = com.facebook.appevents.suggestedevents.FeatureExtractor.INSTANCE;
                    if (com.facebook.appevents.suggestedevents.FeatureExtractor.isInitialized() && (!productionEvents.isEmpty() || !eligibleEvents.isEmpty())) {
                        com.facebook.appevents.suggestedevents.ViewObserver.INSTANCE.startTrackingActivity(activity);
                        return;
                    }
                }
                com.facebook.appevents.suggestedevents.ViewObserver.INSTANCE.stopTrackingActivity(activity);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
            return false;
        }
        try {
            return enabled.get();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isProductionEvents$facebook_core_release(java.lang.String event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            return productionEvents.contains(event);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEligibleEvents$facebook_core_release(java.lang.String event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventsManager.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            return eligibleEvents.contains(event);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventsManager.class);
            return false;
        }
    }
}
