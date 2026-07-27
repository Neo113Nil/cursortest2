package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public abstract class Hd implements InterfaceC0530go, InterfaceC0792r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6029b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0892uo f6030c;

    /* renamed from: d, reason: collision with root package name */
    public final R2 f6031d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f6032e = PublicLogger.getAnonymousInstance();

    public Hd(int i3, String str, InterfaceC0892uo interfaceC0892uo, R2 r22) {
        this.f6029b = i3;
        this.f6028a = str;
        this.f6030c = interfaceC0892uo;
        this.f6031d = r22;
    }

    public final C0556ho a() {
        C0556ho c0556ho = new C0556ho();
        c0556ho.f7464b = this.f6029b;
        c0556ho.f7463a = this.f6028a.getBytes();
        c0556ho.f7466d = new C0607jo();
        c0556ho.f7465c = new C0581io();
        return c0556ho;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0530go
    public abstract /* synthetic */ void a(C0504fo c0504fo);

    public final R2 b() {
        return this.f6031d;
    }

    public final String c() {
        return this.f6028a;
    }

    public final InterfaceC0892uo d() {
        return this.f6030c;
    }

    public final int e() {
        return this.f6029b;
    }

    public final boolean f() {
        C0840so a3 = this.f6030c.a(this.f6028a);
        if (a3.f8320a) {
            return true;
        }
        this.f6032e.warning("Attribute " + this.f6028a + " of type " + ((String) Qn.f6488a.get(this.f6029b)) + " is skipped because " + a3.f8321b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.f6032e = publicLogger;
    }
}
