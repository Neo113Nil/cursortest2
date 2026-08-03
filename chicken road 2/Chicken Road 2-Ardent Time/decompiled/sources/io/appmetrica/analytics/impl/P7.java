package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4829a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage f4830b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R7 f4831c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0264bo f4832d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Im f4833e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ui f4834f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Si f4835g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0867z6 f4836h;

    /* renamed from: i, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Q7 f4837i;

    public P7(android.content.Context context, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage protobufStateStorage, io.appmetrica.analytics.impl.R7 r7, io.appmetrica.analytics.impl.InterfaceC0264bo interfaceC0264bo, io.appmetrica.analytics.impl.Im im, io.appmetrica.analytics.impl.Ui ui, io.appmetrica.analytics.impl.Si si, io.appmetrica.analytics.impl.InterfaceC0867z6 interfaceC0867z6, io.appmetrica.analytics.impl.Q7 q7) {
        this.f4829a = context;
        this.f4830b = protobufStateStorage;
        this.f4831c = r7;
        this.f4832d = interfaceC0264bo;
        this.f4833e = im;
        this.f4834f = ui;
        this.f4835g = si;
        this.f4836h = interfaceC0867z6;
        this.f4837i = q7;
    }

    public final synchronized io.appmetrica.analytics.impl.Q7 a() {
        return this.f4837i;
    }

    public final synchronized boolean b(io.appmetrica.analytics.impl.T7 t7) {
        try {
            boolean z2 = false;
            if (t7.a() == io.appmetrica.analytics.impl.S7.f4953b) {
                return false;
            }
            if (t7.equals(this.f4837i.b())) {
                return false;
            }
            java.util.List list = (java.util.List) this.f4832d.invoke(this.f4837i.a(), t7);
            boolean z3 = list != null;
            if (list == null) {
                list = this.f4837i.a();
            }
            if (this.f4831c.a(t7, this.f4837i.b())) {
                z2 = true;
            } else {
                t7 = (io.appmetrica.analytics.impl.T7) this.f4837i.b();
            }
            if (z2 || z3) {
                io.appmetrica.analytics.impl.Q7 q7 = this.f4837i;
                io.appmetrica.analytics.impl.Q7 q72 = (io.appmetrica.analytics.impl.Q7) this.f4833e.invoke(t7, list);
                this.f4837i = q72;
                this.f4830b.save(q72);
                io.appmetrica.analytics.impl.AbstractC0362fj.a("Update distribution data: %s -> %s", q7, this.f4837i);
            }
            return z2;
        } finally {
        }
    }

    public final synchronized io.appmetrica.analytics.impl.T7 c() {
        try {
            if (!this.f4835g.a()) {
                io.appmetrica.analytics.impl.T7 t7 = (io.appmetrica.analytics.impl.T7) this.f4834f.invoke();
                this.f4835g.b();
                if (t7 != null) {
                    b(t7);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.impl.T7) this.f4837i.b();
    }

    public final io.appmetrica.analytics.impl.T7 a(io.appmetrica.analytics.impl.T7 t7) {
        io.appmetrica.analytics.impl.T7 c2;
        this.f4836h.a(this.f4829a);
        synchronized (this) {
            b(t7);
            c2 = c();
        }
        return c2;
    }

    public final io.appmetrica.analytics.impl.T7 b() {
        this.f4836h.a(this.f4829a);
        return c();
    }
}
