package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514lg {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f6363a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0566ng f6364b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6365c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0807wo f6366d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f6367e;

    public C0514lg(android.content.Context context, io.appmetrica.analytics.impl.C0807wo c0807wo) {
        this.f6367e = context;
        this.f6366d = c0807wo;
        this.f6364b = c0807wo.b();
        this.f6365c = c0807wo.c();
    }

    public final void a() {
        if (this.f6365c) {
            return;
        }
        android.content.Context context = this.f6367e;
        io.appmetrica.analytics.impl.Oa a2 = io.appmetrica.analytics.impl.C0773vg.a(context, io.appmetrica.analytics.impl.C0560na.f6484I.f6495d.a());
        io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg = (io.appmetrica.analytics.impl.InterfaceC0695sg) ((h1.C0175g) new io.appmetrica.analytics.impl.C0333eg(this, new io.appmetrica.analytics.impl.C0773vg(a2), new io.appmetrica.analytics.impl.C0871za(context), new io.appmetrica.analytics.impl.C0799wg(context)).f5850f).a();
        try {
            a2.a(interfaceC0695sg);
        } catch (java.lang.Throwable th) {
            interfaceC0695sg.a(th);
        }
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0618pg c0618pg) {
        this.f6363a.add(c0618pg);
        if (this.f6365c) {
            c0618pg.a(this.f6364b);
        }
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        java.util.Iterator it = this.f6363a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.C0618pg) it.next()).a(c0566ng);
        }
    }
}
