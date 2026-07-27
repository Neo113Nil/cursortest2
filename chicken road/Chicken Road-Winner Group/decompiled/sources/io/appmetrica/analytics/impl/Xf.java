package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xf implements InterfaceC0892uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C0840so(this, true, "");
        }
        return new C0840so(this, false, "Invalid quantity value " + num);
    }
}
