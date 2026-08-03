package com.facebook.appevents.ondeviceprocessing;

/* compiled from: OnDeviceProcessingManager.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager;", "", "()V", "ALLOWED_IMPLICIT_EVENTS", "", "", "isEventEligibleForOnDeviceProcessing", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AppEvent;", "isOnDeviceProcessingEnabled", "sendCustomEventAsync", "", "applicationId", "sendInstallEventAsync", "preferencesName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OnDeviceProcessingManager {
    public static final com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager INSTANCE = new com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager();
    private static final java.util.Set<java.lang.String> ALLOWED_IMPLICIT_EVENTS = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.facebook.appevents.AppEventsConstants.EVENT_NAME_PURCHASED, com.facebook.appevents.AppEventsConstants.EVENT_NAME_START_TRIAL, com.facebook.appevents.AppEventsConstants.EVENT_NAME_SUBSCRIBE});

    private OnDeviceProcessingManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isOnDeviceProcessingEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class)) {
            return false;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getLimitEventAndDataUsage(applicationContext)) {
                return false;
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isDataProcessingRestricted()) {
                return false;
            }
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper remoteServiceWrapper = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.INSTANCE;
            return com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.isServiceAvailable();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void sendInstallEventAsync(final java.lang.String applicationId, final java.lang.String preferencesName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            final android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            if (applicationContext == null || applicationId == null || preferencesName == null) {
                return;
            }
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.m5149sendInstallEventAsync$lambda0(applicationContext, preferencesName, applicationId);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendInstallEventAsync$lambda-0, reason: not valid java name */
    public static final void m5149sendInstallEventAsync$lambda0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(stringPlus, 0L) == 0) {
                com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper remoteServiceWrapper = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.INSTANCE;
                com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.sendInstallEvent(str2);
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(stringPlus, java.lang.System.currentTimeMillis());
                edit.apply();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void sendCustomEventAsync(final java.lang.String applicationId, final com.facebook.appevents.AppEvent event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            if (INSTANCE.isEventEligibleForOnDeviceProcessing(event)) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.m5148sendCustomEventAsync$lambda1(applicationId, event);
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendCustomEventAsync$lambda-1, reason: not valid java name */
    public static final void m5148sendCustomEventAsync$lambda1(java.lang.String applicationId, com.facebook.appevents.AppEvent event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "$event");
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper remoteServiceWrapper = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.INSTANCE;
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.sendCustomEvents(applicationId, kotlin.collections.CollectionsKt.listOf(event));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class);
        }
    }

    private final boolean isEventEligibleForOnDeviceProcessing(com.facebook.appevents.AppEvent event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return (event.isImplicit() ^ true) || (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName()));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
