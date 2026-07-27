package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public abstract class Hd implements InterfaceC0679go, InterfaceC0941r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6876b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1041uo f6877c;

    /* renamed from: d, reason: collision with root package name */
    public final R2 f6878d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f6879e = PublicLogger.getAnonymousInstance();

    public Hd(int i2, String str, InterfaceC1041uo interfaceC1041uo, R2 r22) {
        this.f6876b = i2;
        this.f6875a = str;
        this.f6877c = interfaceC1041uo;
        this.f6878d = r22;
    }

    public final C0705ho a() {
        C0705ho c0705ho = new C0705ho();
        c0705ho.f8370b = this.f6876b;
        c0705ho.f8369a = this.f6875a.getBytes();
        c0705ho.f8372d = new C0756jo();
        c0705ho.f8371c = new C0730io();
        return c0705ho;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0679go
    public abstract /* synthetic */ void a(C0653fo c0653fo);

    public final R2 b() {
        return this.f6878d;
    }

    public final String c() {
        return this.f6875a;
    }

    public final InterfaceC1041uo d() {
        return this.f6877c;
    }

    public final int e() {
        return this.f6876b;
    }

    public final boolean f() {
        C0989so a6 = this.f6877c.a(this.f6875a);
        if (a6.f9268a) {
            return true;
        }
        this.f6879e.warning("Attribute " + this.f6875a + " of type " + ((String) Qn.f7350a.get(this.f6876b)) + " is skipped because " + a6.f9269b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.f6879e = publicLogger;
    }
}
