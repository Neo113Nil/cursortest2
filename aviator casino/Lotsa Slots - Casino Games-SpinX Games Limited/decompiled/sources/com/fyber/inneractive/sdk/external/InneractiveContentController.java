package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface InneractiveContentController<EventsListenerT extends com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener> {

    public interface EventsListener {
    }

    void destroy();

    com.fyber.inneractive.sdk.external.InneractiveAdSpot getAdSpot();

    void setEventsListener(EventsListenerT eventslistenert);
}
