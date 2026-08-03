package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781vo extends io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle implements io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver {
    public C0781vo() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            a(io.appmetrica.analytics.impl.C0560na.k().e().registerStickyObserver(this));
        }
    }

    public final void a(io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState) {
        updateState(applicationState == io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState) {
        a(applicationState);
    }
}
