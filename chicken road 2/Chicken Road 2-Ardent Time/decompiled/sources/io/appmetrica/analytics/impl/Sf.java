package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sf implements io.appmetrica.analytics.impl.InterfaceC0703so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new io.appmetrica.analytics.impl.C0652qo(this, true, "");
        }
        return new io.appmetrica.analytics.impl.C0652qo(this, false, "Invalid quantity value " + num);
    }
}
