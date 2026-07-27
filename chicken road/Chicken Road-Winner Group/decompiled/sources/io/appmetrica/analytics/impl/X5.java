package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X5 extends A4 {
    public X5(String str, double d3) {
        super(2, str, Double.valueOf(d3), new C0957xb(), new C1000z4(new Nb(new C0846t4(100))));
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C0556ho c0556ho) {
        C0607jo c0607jo = c0556ho.f7466d;
        c0607jo.f7674c = ((Double) this.f).doubleValue() + c0607jo.f7674c;
    }
}
