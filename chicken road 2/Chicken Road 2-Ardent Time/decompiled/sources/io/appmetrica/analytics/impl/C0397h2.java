package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397h2 extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f6019b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Xj f6020c;

    public C0397h2(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, x4.u(), io.appmetrica.analytics.impl.Xj.c());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
        if (!this.f6019b.c() && !this.f6019b.d()) {
            if (((io.appmetrica.analytics.impl.C0489kh) x4.f5265k.a()).f6285e) {
                this.f6020c.b();
            }
            io.appmetrica.analytics.impl.M8 m8 = this.f4907a.f5266l;
            if (m8.f4652c == null) {
                m8.a();
            }
            io.appmetrica.analytics.impl.O8 o8 = m8.f4652c;
            o8.getClass();
            o8.f4765b = new java.util.HashSet();
            o8.f4767d = 0;
            io.appmetrica.analytics.impl.O8 o82 = m8.f4652c;
            o82.f4764a = true;
            io.appmetrica.analytics.impl.R8 r8 = m8.f4651b;
            io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper = r8.f4899c;
            io.appmetrica.analytics.impl.Q8 q8 = r8.f4898b;
            r8.f4897a.getClass();
            iBinaryDataHelper.insert("event_hashes", q8.toByteArray((io.appmetrica.analytics.impl.Q8) io.appmetrica.analytics.impl.P8.a(o82)));
        }
        return false;
    }

    public C0397h2(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.Xj xj) {
        super(x4);
        this.f6019b = c0833xo;
        this.f6020c = xj;
    }
}
