package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sb implements io.appmetrica.analytics.impl.Pb, io.appmetrica.analytics.coreapi.internal.control.ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4959a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4960b = io.appmetrica.analytics.impl.C0560na.k().w().b();

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Kn f4961c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4962d;

    public final void a(io.appmetrica.analytics.coreapi.internal.control.Toggle toggle) {
        io.appmetrica.analytics.impl.Kn kn = new io.appmetrica.analytics.impl.Kn(toggle);
        this.f4961c = kn;
        kn.f4559c.registerObserver(this, true);
    }

    public final void b(java.lang.Object obj) {
        io.appmetrica.analytics.impl.Kn kn = this.f4961c;
        if (kn != null) {
            kn.f4558b.b(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z2) {
        this.f4960b.execute(new java.lang.Runnable() { // from class: io.appmetrica.analytics.impl.Po
            @Override // java.lang.Runnable
            public final void run() {
                io.appmetrica.analytics.impl.Sb.a(io.appmetrica.analytics.impl.Sb.this, z2);
            }
        });
    }

    public final void a(final io.appmetrica.analytics.locationapi.internal.LocationControllerObserver locationControllerObserver, final boolean z2) {
        this.f4960b.execute(new java.lang.Runnable() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // java.lang.Runnable
            public final void run() {
                io.appmetrica.analytics.impl.Sb.a(io.appmetrica.analytics.impl.Sb.this, locationControllerObserver, z2);
            }
        });
    }

    public static final void a(io.appmetrica.analytics.impl.Sb sb, io.appmetrica.analytics.locationapi.internal.LocationControllerObserver locationControllerObserver, boolean z2) {
        sb.f4959a.add(locationControllerObserver);
        if (z2) {
            if (sb.f4962d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(io.appmetrica.analytics.impl.Sb sb, boolean z2) {
        if (sb.f4962d != z2) {
            sb.f4962d = z2;
            s1.l lVar = z2 ? io.appmetrica.analytics.impl.Qb.f4861a : io.appmetrica.analytics.impl.Rb.f4903a;
            java.util.Iterator it = sb.f4959a.iterator();
            while (it.hasNext()) {
                lVar.invoke((io.appmetrica.analytics.locationapi.internal.LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(java.lang.Object obj) {
        io.appmetrica.analytics.impl.Kn kn = this.f4961c;
        if (kn != null) {
            kn.f4558b.a(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z2) {
        io.appmetrica.analytics.impl.Kn kn = this.f4961c;
        if (kn != null) {
            kn.f4557a.a(z2);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }
}
