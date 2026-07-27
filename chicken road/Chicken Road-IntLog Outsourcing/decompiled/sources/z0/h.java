package z0;

import C0.k;
import android.content.Context;
import android.net.ConnectivityManager;
import s0.s;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f12459f;

    /* renamed from: g, reason: collision with root package name */
    public final g f12460g;

    public h(Context context, B4.i iVar) {
        super(context, iVar);
        Object systemService = this.f12453b.getSystemService("connectivity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f12459f = (ConnectivityManager) systemService;
        this.f12460g = new g(this);
    }

    @Override // z0.e
    public final Object a() {
        return i.a(this.f12459f);
    }

    @Override // z0.e
    public final void d() {
        try {
            s.d().a(i.f12461a, "Registering network callback");
            k.a(this.f12459f, this.f12460g);
        } catch (IllegalArgumentException e3) {
            s.d().c(i.f12461a, "Received exception while registering network callback", e3);
        } catch (SecurityException e6) {
            s.d().c(i.f12461a, "Received exception while registering network callback", e6);
        }
    }

    @Override // z0.e
    public final void e() {
        try {
            s.d().a(i.f12461a, "Unregistering network callback");
            C0.i.c(this.f12459f, this.f12460g);
        } catch (IllegalArgumentException e3) {
            s.d().c(i.f12461a, "Received exception while unregistering network callback", e3);
        } catch (SecurityException e6) {
            s.d().c(i.f12461a, "Received exception while unregistering network callback", e6);
        }
    }
}
