package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes.dex */
public interface ApplicationStateProvider {
    io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState getCurrentState();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState registerStickyObserver(io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver applicationStateObserver);
}
