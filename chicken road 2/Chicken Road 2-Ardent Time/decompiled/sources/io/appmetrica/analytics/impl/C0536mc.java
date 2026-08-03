package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536mc extends io.appmetrica.analytics.impl.AbstractC0342f {
    public C0536mc(android.content.Context context, io.appmetrica.analytics.impl.Bg bg) {
        super(context, bg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0342f
    public final void b(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        boolean booleanValue = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(c0606p4.f6630b.f6554b, java.lang.Boolean.FALSE)).booleanValue();
        io.appmetrica.analytics.impl.Kb m2 = io.appmetrica.analytics.impl.C0560na.f6484I.m();
        m2.a(booleanValue);
        m2.a(c0606p4.f6630b.f6555c);
        java.lang.Boolean bool = c0606p4.f6630b.f6566n;
        if (bool != null) {
            io.appmetrica.analytics.impl.C0560na.f6484I.c().b(bool.booleanValue());
        }
        this.f5866b.a(p5, c0606p4);
    }
}
