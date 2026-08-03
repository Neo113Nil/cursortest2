package com.facebook.appevents;

/* compiled from: SessionEventsState.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bJ0\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "accumulatedEventCount", "", "getAccumulatedEventCount", "()I", "accumulatedEvents", "", "Lcom/facebook/appevents/AppEvent;", "eventsToPersist", "", "getEventsToPersist", "()Ljava/util/List;", "inFlightEvents", "numSkippedEventsDueToFullBuffer", "accumulatePersistedEvents", "", "events", "addEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "clearInFlightAndStats", "moveToAccumulated", "", "populateRequest", "request", "Lcom/facebook/GraphRequest;", "applicationContext", "Landroid/content/Context;", "includeImplicitEvents", "limitEventUsage", "numSkipped", "Lorg/json/JSONArray;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionEventsState {
    private java.util.List<com.facebook.appevents.AppEvent> accumulatedEvents;
    private final java.lang.String anonymousAppDeviceGUID;
    private final com.facebook.internal.AttributionIdentifiers attributionIdentifiers;
    private final java.util.List<com.facebook.appevents.AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;
    private static final java.lang.String TAG = "SessionEventsState";
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;

    public SessionEventsState(com.facebook.internal.AttributionIdentifiers attributionIdentifiers, java.lang.String anonymousAppDeviceGUID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = anonymousAppDeviceGUID;
        this.accumulatedEvents = new java.util.ArrayList();
        this.inFlightEvents = new java.util.ArrayList();
    }

    public final synchronized void addEvent(com.facebook.appevents.AppEvent event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(event);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized int getAccumulatedEventCount() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized void clearInFlightAndStats(boolean moveToAccumulated) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (moveToAccumulated) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final int populateRequest(com.facebook.GraphRequest request, android.content.Context applicationContext, boolean includeImplicitEvents, boolean limitEventUsage) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                int i = this.numSkippedEventsDueToFullBuffer;
                com.facebook.appevents.eventdeactivation.EventDeactivationManager eventDeactivationManager = com.facebook.appevents.eventdeactivation.EventDeactivationManager.INSTANCE;
                com.facebook.appevents.eventdeactivation.EventDeactivationManager.processEvents(this.accumulatedEvents);
                this.inFlightEvents.addAll(this.accumulatedEvents);
                this.accumulatedEvents.clear();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.facebook.appevents.AppEvent appEvent : this.inFlightEvents) {
                    if (appEvent.isChecksumValid()) {
                        if (includeImplicitEvents || !appEvent.isImplicit()) {
                            jSONArray.put(appEvent.getJsonObject());
                        }
                    } else {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.logd(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Event with invalid checksum: ", appEvent));
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                populateRequest(request, applicationContext, i, jSONArray, limitEventUsage);
                return jSONArray.length();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized java.util.List<com.facebook.appevents.AppEvent> getEventsToPersist() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.List<com.facebook.appevents.AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new java.util.ArrayList();
            return list;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final synchronized void accumulatePersistedEvents(java.util.List<com.facebook.appevents.AppEvent> events) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "events");
            this.accumulatedEvents.addAll(events);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void populateRequest(com.facebook.GraphRequest request, android.content.Context applicationContext, int numSkipped, org.json.JSONArray events, boolean limitEventUsage) {
        org.json.JSONObject jSONObject;
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                com.facebook.appevents.internal.AppEventsLoggerUtility appEventsLoggerUtility = com.facebook.appevents.internal.AppEventsLoggerUtility.INSTANCE;
                jSONObject = com.facebook.appevents.internal.AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, limitEventUsage, applicationContext);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", numSkipped);
                }
            } catch (org.json.JSONException unused) {
                jSONObject = new org.json.JSONObject();
            }
            request.setGraphObject(jSONObject);
            android.os.Bundle parameters = request.getParameters();
            java.lang.String jSONArray = events.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "events.toString()");
            parameters.putString("custom_events", jSONArray);
            request.setTag(jSONArray);
            request.setParameters(parameters);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
