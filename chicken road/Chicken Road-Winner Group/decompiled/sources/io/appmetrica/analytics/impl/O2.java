package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O2 implements InterfaceC0892uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Object obj) {
        C0556ho[] c0556hoArr = ((C0633ko) obj).f7727a;
        return (c0556hoArr == null || c0556hoArr.length == 0) ? new C0840so(this, false, "attributes list is empty") : new C0840so(this, true, "");
    }
}
