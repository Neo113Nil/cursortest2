package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xf implements InterfaceC1041uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C0989so(this, true, "");
        }
        return new C0989so(this, false, "Invalid quantity value " + num);
    }
}
