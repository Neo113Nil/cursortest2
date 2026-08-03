package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0221a7 f5614a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0690sb f5615b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0716tb f5616c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Zb f5617d;

    public C0270c4(java.io.File file) {
        this.f5614a = new io.appmetrica.analytics.impl.C0221a7(file);
    }

    public final synchronized io.appmetrica.analytics.impl.Ha a(android.content.Context context) {
        io.appmetrica.analytics.impl.C0716tb c0716tb;
        c0716tb = this.f5616c;
        if (c0716tb == null) {
            c0716tb = new io.appmetrica.analytics.impl.C0716tb(c(context));
            this.f5616c = c0716tb;
        }
        return c0716tb;
    }

    public final synchronized io.appmetrica.analytics.impl.Ha b(android.content.Context context) {
        return c(context);
    }

    public final io.appmetrica.analytics.impl.Ha c(android.content.Context context) {
        io.appmetrica.analytics.impl.Zb zb;
        io.appmetrica.analytics.impl.C0690sb c0690sb = this.f5615b;
        if (c0690sb == null) {
            synchronized (this) {
                zb = this.f5617d;
                if (zb == null) {
                    io.appmetrica.analytics.impl.C0221a7 c0221a7 = this.f5614a;
                    java.lang.String a2 = new io.appmetrica.analytics.impl.Z6(c0221a7.f5468a, c0221a7.f5469b, true).a(context, new io.appmetrica.analytics.impl.N3());
                    io.appmetrica.analytics.impl.M6 m6 = io.appmetrica.analytics.impl.AbstractC0788w5.f7002c;
                    m6.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("preferences", io.appmetrica.analytics.impl.InterfaceC0710t5.f6842a);
                    io.appmetrica.analytics.impl.C0418hn c0418hn = m6.f4647c;
                    io.appmetrica.analytics.impl.W6 w6 = m6.f4645a;
                    io.appmetrica.analytics.impl.S6 s6 = w6.f5193c;
                    io.appmetrica.analytics.impl.T6 t6 = w6.f5194d;
                    io.appmetrica.analytics.impl.C0612pa c0612pa = new io.appmetrica.analytics.impl.C0612pa(false);
                    c0612pa.a(112, new io.appmetrica.analytics.impl.O3());
                    io.appmetrica.analytics.impl.C0495kn c0495kn = new io.appmetrica.analytics.impl.C0495kn("service database", hashMap);
                    c0418hn.getClass();
                    zb = new io.appmetrica.analytics.impl.Zb(context, a2, new io.appmetrica.analytics.impl.Y9(a2), new io.appmetrica.analytics.impl.C0443in(s6, t6, c0612pa, c0495kn));
                    this.f5617d = zb;
                }
            }
            c0690sb = new io.appmetrica.analytics.impl.C0690sb(zb);
            this.f5615b = c0690sb;
        }
        return c0690sb;
    }
}
