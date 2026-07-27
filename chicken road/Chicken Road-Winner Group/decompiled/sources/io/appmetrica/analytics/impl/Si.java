package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Si implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final C0866to f6604a = new C0866to();

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Revenue revenue) {
        C0840so c0840so;
        C0866to c0866to = this.f6604a;
        Xf xf = new Xf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0840so = new C0840so(xf, true, "");
        } else {
            c0840so = new C0840so(xf, false, "Invalid quantity value " + num);
        }
        List<C0840so> asList = Arrays.asList(c0840so);
        c0866to.getClass();
        return c0866to.a(asList);
    }
}
