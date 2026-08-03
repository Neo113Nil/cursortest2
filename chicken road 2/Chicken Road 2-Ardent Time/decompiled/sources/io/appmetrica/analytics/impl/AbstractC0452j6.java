package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0452j6 implements io.appmetrica.analytics.impl.Fa {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0427i6 f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.ICrashTransformer f6161b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M9 f6162c;

    public AbstractC0452j6(io.appmetrica.analytics.impl.InterfaceC0427i6 interfaceC0427i6, io.appmetrica.analytics.ICrashTransformer iCrashTransformer, io.appmetrica.analytics.impl.M9 m9) {
        this.f6160a = interfaceC0427i6;
        this.f6161b = iCrashTransformer;
        this.f6162c = m9;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(java.lang.Throwable th, io.appmetrica.analytics.impl.V v2) {
        if (this.f6160a.a(th)) {
            io.appmetrica.analytics.ICrashTransformer iCrashTransformer = this.f6161b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                io.appmetrica.analytics.impl.Qn a2 = io.appmetrica.analytics.impl.Tn.a(th, v2, null, (java.lang.String) this.f6162c.f4654b.a(), (java.lang.Boolean) this.f6162c.f4655c.a());
                io.appmetrica.analytics.impl.C0355fc c0355fc = (io.appmetrica.analytics.impl.C0355fc) ((io.appmetrica.analytics.impl.Bh) this).f4130d;
                c0355fc.f5246a.a().a(c0355fc.f5885b).a(a2);
            }
        }
    }

    public final io.appmetrica.analytics.impl.InterfaceC0427i6 b() {
        return this.f6160a;
    }

    public final io.appmetrica.analytics.ICrashTransformer a() {
        return this.f6161b;
    }
}
