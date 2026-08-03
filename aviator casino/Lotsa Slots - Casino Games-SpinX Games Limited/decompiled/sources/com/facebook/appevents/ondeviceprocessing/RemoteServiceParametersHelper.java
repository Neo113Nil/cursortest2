package com.facebook.appevents.ondeviceprocessing;

/* compiled from: RemoteServiceParametersHelper.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceParametersHelper;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "buildEventsBundle", "Landroid/os/Bundle;", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "buildEventsJson", "Lorg/json/JSONArray;", "includeImplicitEvents", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteServiceParametersHelper {
    public static final com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper INSTANCE = new com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper();
    private static final java.lang.String TAG = "RemoteServiceWrapper";

    private RemoteServiceParametersHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildEventsBundle(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType eventType, java.lang.String applicationId, java.util.List<com.facebook.appevents.AppEvent> appEvents) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.core.app.NotificationCompat.CATEGORY_EVENT, eventType.getEventType());
            bundle.putString("app_id", applicationId);
            if (com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                org.json.JSONArray buildEventsJson = INSTANCE.buildEventsJson(appEvents, applicationId);
                if (buildEventsJson.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", buildEventsJson.toString());
            }
            return bundle;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper.class);
            return null;
        }
    }

    private final org.json.JSONArray buildEventsJson(java.util.List<com.facebook.appevents.AppEvent> appEvents, java.lang.String applicationId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List<com.facebook.appevents.AppEvent> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) appEvents);
            com.facebook.appevents.eventdeactivation.EventDeactivationManager eventDeactivationManager = com.facebook.appevents.eventdeactivation.EventDeactivationManager.INSTANCE;
            com.facebook.appevents.eventdeactivation.EventDeactivationManager.processEvents(mutableList);
            boolean includeImplicitEvents = includeImplicitEvents(applicationId);
            for (com.facebook.appevents.AppEvent appEvent : mutableList) {
                if (appEvent.isChecksumValid()) {
                    if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && includeImplicitEvents)) {
                        jSONArray.put(appEvent.getJsonObject());
                    }
                } else {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Event with invalid checksum: ", appEvent));
                }
            }
            return jSONArray;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean includeImplicitEvents(java.lang.String applicationId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(applicationId, false);
            if (queryAppSettings != null) {
                return queryAppSettings.getSupportsImplicitLogging();
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
