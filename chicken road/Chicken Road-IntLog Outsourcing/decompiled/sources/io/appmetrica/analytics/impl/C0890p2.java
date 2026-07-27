package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890p2 implements InterfaceC0908pk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8976a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8977b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f8978c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f8979d = new CopyOnWriteArraySet();

    public final void a(int i2) {
        this.f8976a.remove(Integer.valueOf(i2));
        a();
    }

    public final void b(int i2) {
        this.f8977b.add(Integer.valueOf(i2));
        this.f8976a.remove(Integer.valueOf(i2));
        a();
    }

    public final void c(int i2) {
        this.f8976a.add(Integer.valueOf(i2));
        this.f8977b.remove(Integer.valueOf(i2));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f8978c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onDestroy() {
        if (this.f8978c == ApplicationState.VISIBLE) {
            this.f8978c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f8979d.add(applicationStateObserver);
        }
        return this.f8978c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f8976a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f8977b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f8978c != applicationState) {
            this.f8978c = applicationState;
            Iterator it = this.f8979d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f8978c);
            }
        }
    }
}
