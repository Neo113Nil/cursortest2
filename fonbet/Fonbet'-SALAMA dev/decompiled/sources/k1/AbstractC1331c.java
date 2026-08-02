package k1;

import A1.L0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d1.n;
import p1.InterfaceC1533a;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1331c extends AbstractC1332d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f14661h = n.g("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final L0 f14662g;

    public AbstractC1331c(Context context, InterfaceC1533a interfaceC1533a) {
        super(context, interfaceC1533a);
        this.f14662g = new L0(this, 5);
    }

    @Override // k1.AbstractC1332d
    public final void d() {
        n.d().b(f14661h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f14665b.registerReceiver(this.f14662g, f());
    }

    @Override // k1.AbstractC1332d
    public final void e() {
        n.d().b(f14661h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f14665b.unregisterReceiver(this.f14662g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
