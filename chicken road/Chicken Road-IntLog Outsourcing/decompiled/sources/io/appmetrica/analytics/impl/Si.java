package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Si implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final C1015to f7473a = new C1015to();

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Revenue revenue) {
        C0989so c0989so;
        C1015to c1015to = this.f7473a;
        Xf xf = new Xf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0989so = new C0989so(xf, true, "");
        } else {
            c0989so = new C0989so(xf, false, "Invalid quantity value " + num);
        }
        List<C0989so> asList = Arrays.asList(c0989so);
        c1015to.getClass();
        return c1015to.a(asList);
    }
}
