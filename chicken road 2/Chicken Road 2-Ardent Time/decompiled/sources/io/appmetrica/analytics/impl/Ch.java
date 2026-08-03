package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ch implements io.appmetrica.analytics.impl.InterfaceC0373g4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y4 f4175a;

    public Ch(io.appmetrica.analytics.impl.Y4 y4) {
        this.f4175a = y4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0373g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ag a(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5, io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.Bg bg;
        io.appmetrica.analytics.impl.Q4 q4 = new io.appmetrica.analytics.impl.Q4(p3.f4809b, p3.f4808a);
        io.appmetrica.analytics.impl.Cg cg = new io.appmetrica.analytics.impl.Cg(this.f4175a);
        synchronized (c0297d5) {
            bg = (io.appmetrica.analytics.impl.Bg) c0297d5.a(q4, c0606p4, cg, c0297d5.f5694a);
        }
        return new io.appmetrica.analytics.impl.Ag(context, bg);
    }
}
