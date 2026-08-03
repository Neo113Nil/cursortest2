package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371g2 implements io.appmetrica.analytics.impl.InterfaceC0518lk, io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f5955a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f5956b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState f5957c = io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f5958d = new java.util.concurrent.CopyOnWriteArraySet();

    public final void a(int i2) {
        this.f5955a.remove(java.lang.Integer.valueOf(i2));
        a();
    }

    public final void b(int i2) {
        this.f5956b.add(java.lang.Integer.valueOf(i2));
        this.f5955a.remove(java.lang.Integer.valueOf(i2));
        a();
    }

    public final void c(int i2) {
        this.f5955a.add(java.lang.Integer.valueOf(i2));
        this.f5956b.remove(java.lang.Integer.valueOf(i2));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState getCurrentState() {
        return this.f5957c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onDestroy() {
        if (this.f5957c == io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.VISIBLE) {
            this.f5957c = io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState registerStickyObserver(io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f5958d.add(applicationStateObserver);
        }
        return this.f5957c;
    }

    public final void a() {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState = io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.UNKNOWN;
        if (!this.f5955a.isEmpty()) {
            applicationState = io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.VISIBLE;
        } else if (!this.f5956b.isEmpty()) {
            applicationState = io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.BACKGROUND;
        }
        if (this.f5957c != applicationState) {
            this.f5957c = applicationState;
            java.util.Iterator it = this.f5958d.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f5957c);
            }
        }
    }
}
