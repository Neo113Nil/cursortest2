package m2;

import T2.E;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.m;
import r2.InterfaceC2348a;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2086c extends AbstractC2087d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f17982h = m.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final E f17983g;

    public AbstractC2086c(Context context, InterfaceC2348a interfaceC2348a) {
        super(context, interfaceC2348a);
        this.f17983g = new E(6, this);
    }

    @Override // m2.AbstractC2087d
    public final void d() {
        m.d().a(f17982h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f17985b.registerReceiver(this.f17983g, f());
    }

    @Override // m2.AbstractC2087d
    public final void e() {
        m.d().a(f17982h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f17985b.unregisterReceiver(this.f17983g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
