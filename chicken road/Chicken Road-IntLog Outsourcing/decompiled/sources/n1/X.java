package n1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class X implements m1.i, m1.j {

    /* renamed from: a, reason: collision with root package name */
    public final m1.e f11354a;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11355e;

    /* renamed from: f, reason: collision with root package name */
    public C1297A f11356f;

    public X(m1.e eVar, boolean z) {
        this.f11354a = eVar;
        this.f11355e = z;
    }

    @Override // m1.i
    public final void onConnected(Bundle bundle) {
        o1.u.h(this.f11356f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f11356f.onConnected(bundle);
    }

    @Override // m1.j
    public final void onConnectionFailed(l1.b bVar) {
        boolean z = this.f11355e;
        o1.u.h(this.f11356f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C1297A c1297a = this.f11356f;
        m1.e eVar = this.f11354a;
        c1297a.f11277a.lock();
        try {
            c1297a.f11287n.x(bVar, eVar, z);
        } finally {
            c1297a.f11277a.unlock();
        }
    }

    @Override // m1.i
    public final void onConnectionSuspended(int i2) {
        o1.u.h(this.f11356f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f11356f.onConnectionSuspended(i2);
    }
}
