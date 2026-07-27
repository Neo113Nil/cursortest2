package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Zb implements Wb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6898a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6899b = C0878ua.k().x().c();

    /* renamed from: c, reason: collision with root package name */
    public Mn f6900c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6901d;

    public final void a(Toggle toggle) {
        Mn mn = new Mn(toggle);
        this.f6900c = mn;
        mn.f6304c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Mn mn = this.f6900c;
        if (mn != null) {
            mn.f6303b.b(obj);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z3) {
        this.f6899b.execute(new com.startapp.sdk.adsbase.n(this, z3, 1));
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z3) {
        this.f6899b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(Zb.this, locationControllerObserver, z3);
            }
        });
    }

    public static final void a(Zb zb, LocationControllerObserver locationControllerObserver, boolean z3) {
        zb.f6898a.add(locationControllerObserver);
        if (z3) {
            if (zb.f6901d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Zb zb, boolean z3) {
        if (zb.f6901d != z3) {
            zb.f6901d = z3;
            o2.l lVar = z3 ? Xb.f6825a : Yb.f6863a;
            Iterator it = zb.f6898a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Mn mn = this.f6900c;
        if (mn != null) {
            mn.f6303b.a(obj);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z3) {
        Mn mn = this.f6900c;
        if (mn != null) {
            mn.f6302a.a(z3);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }
}
