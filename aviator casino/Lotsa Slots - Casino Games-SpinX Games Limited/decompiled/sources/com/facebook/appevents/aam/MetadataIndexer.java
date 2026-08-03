package com.facebook.appevents.aam;

/* compiled from: MetadataIndexer.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/aam/MetadataIndexer;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "enabled", "", com.ironsource.mediationsdk.metadata.a.j, "", "onActivityResumed", "activity", "Landroid/app/Activity;", "updateRules", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataIndexer {
    public static final com.facebook.appevents.aam.MetadataIndexer INSTANCE = new com.facebook.appevents.aam.MetadataIndexer();
    private static final java.lang.String TAG = com.facebook.appevents.aam.MetadataIndexer.class.getCanonicalName();
    private static boolean enabled;

    private MetadataIndexer() {
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityResumed(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataIndexer.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (enabled && !com.facebook.appevents.aam.MetadataRule.INSTANCE.getRules().isEmpty()) {
                    com.facebook.appevents.aam.MetadataViewObserver.INSTANCE.startTrackingActivity(activity);
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataIndexer.class);
        }
    }

    private final void updateRules() {
        java.lang.String rawAamRules;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null || (rawAamRules = queryAppSettings.getRawAamRules()) == null) {
                return;
            }
            com.facebook.appevents.aam.MetadataRule.INSTANCE.updateRules(rawAamRules);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataIndexer.class)) {
            return;
        }
        try {
            try {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.aam.MetadataIndexer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.aam.MetadataIndexer.m5108enable$lambda0();
                    }
                });
            } catch (java.lang.Exception e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataIndexer.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enable$lambda-0, reason: not valid java name */
    public static final void m5108enable$lambda0() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataIndexer.class)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.internal.AttributionIdentifiers.INSTANCE.isTrackingLimited(com.facebook.FacebookSdk.getApplicationContext())) {
                return;
            }
            INSTANCE.updateRules();
            enabled = true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataIndexer.class);
        }
    }
}
