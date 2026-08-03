package com.facebook.appevents;

/* compiled from: AppEventCollection.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\tH\u0086\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/AppEventCollection;", "", "()V", "eventCount", "", "getEventCount", "()I", "stateMap", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "Lcom/facebook/appevents/SessionEventsState;", "addEvent", "", "accessTokenAppIdPair", "appEvent", "Lcom/facebook/appevents/AppEvent;", "addPersistedEvents", "persistedEvents", "Lcom/facebook/appevents/PersistedEvents;", "get", "getSessionEventsState", "accessTokenAppId", "keySet", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventCollection {
    private final java.util.HashMap<com.facebook.appevents.AccessTokenAppIdPair, com.facebook.appevents.SessionEventsState> stateMap = new java.util.HashMap<>();

    public final synchronized void addPersistedEvents(com.facebook.appevents.PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (java.util.Map.Entry<com.facebook.appevents.AccessTokenAppIdPair, java.util.List<com.facebook.appevents.AppEvent>> entry : persistedEvents.entrySet()) {
            com.facebook.appevents.SessionEventsState sessionEventsState = getSessionEventsState(entry.getKey());
            if (sessionEventsState != null) {
                java.util.Iterator<com.facebook.appevents.AppEvent> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sessionEventsState.addEvent(it.next());
                }
            }
        }
    }

    public final synchronized void addEvent(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppIdPair, com.facebook.appevents.AppEvent appEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        com.facebook.appevents.SessionEventsState sessionEventsState = getSessionEventsState(accessTokenAppIdPair);
        if (sessionEventsState != null) {
            sessionEventsState.addEvent(appEvent);
        }
    }

    public final synchronized java.util.Set<com.facebook.appevents.AccessTokenAppIdPair> keySet() {
        java.util.Set<com.facebook.appevents.AccessTokenAppIdPair> keySet;
        keySet = this.stateMap.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }

    public final synchronized com.facebook.appevents.SessionEventsState get(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppIdPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.stateMap.get(accessTokenAppIdPair);
    }

    public final synchronized int getEventCount() {
        int i;
        java.util.Iterator<com.facebook.appevents.SessionEventsState> it = this.stateMap.values().iterator();
        i = 0;
        while (it.hasNext()) {
            i += it.next().getAccumulatedEventCount();
        }
        return i;
    }

    private final synchronized com.facebook.appevents.SessionEventsState getSessionEventsState(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId) {
        com.facebook.appevents.SessionEventsState sessionEventsState = this.stateMap.get(accessTokenAppId);
        if (sessionEventsState == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(applicationContext);
            if (attributionIdentifiers != null) {
                sessionEventsState = new com.facebook.appevents.SessionEventsState(attributionIdentifiers, com.facebook.appevents.AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext));
            }
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, sessionEventsState);
        return sessionEventsState;
    }
}
