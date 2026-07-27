package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741p2 implements InterfaceC0759pk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8041a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8042b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f8043c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f8044d = new CopyOnWriteArraySet();

    public final void a(int i3) {
        this.f8041a.remove(Integer.valueOf(i3));
        a();
    }

    public final void b(int i3) {
        this.f8042b.add(Integer.valueOf(i3));
        this.f8041a.remove(Integer.valueOf(i3));
        a();
    }

    public final void c(int i3) {
        this.f8041a.add(Integer.valueOf(i3));
        this.f8042b.remove(Integer.valueOf(i3));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f8043c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onDestroy() {
        if (this.f8043c == ApplicationState.VISIBLE) {
            this.f8043c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f8044d.add(applicationStateObserver);
        }
        return this.f8043c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f8041a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f8042b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f8043c != applicationState) {
            this.f8043c = applicationState;
            Iterator it = this.f8044d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f8043c);
            }
        }
    }
}
