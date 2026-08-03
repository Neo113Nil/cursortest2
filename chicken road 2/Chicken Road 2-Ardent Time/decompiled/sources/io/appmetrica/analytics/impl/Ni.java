package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ni implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0677ro f4737a = new io.appmetrica.analytics.impl.C0677ro();

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(io.appmetrica.analytics.Revenue revenue) {
        io.appmetrica.analytics.impl.C0652qo c0652qo;
        io.appmetrica.analytics.impl.C0677ro c0677ro = this.f4737a;
        io.appmetrica.analytics.impl.Sf sf = new io.appmetrica.analytics.impl.Sf();
        java.lang.Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0652qo = new io.appmetrica.analytics.impl.C0652qo(sf, true, "");
        } else {
            c0652qo = new io.appmetrica.analytics.impl.C0652qo(sf, false, "Invalid quantity value " + num);
        }
        java.util.List<io.appmetrica.analytics.impl.C0652qo> asList = java.util.Arrays.asList(c0652qo);
        c0677ro.getClass();
        return c0677ro.a(asList);
    }
}
