package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class A3 extends io.appmetrica.analytics.impl.R7 {
    @Override // io.appmetrica.analytics.impl.R7
    public final boolean a(io.appmetrica.analytics.impl.C0656r3 c0656r3, io.appmetrica.analytics.impl.C0656r3 c0656r32) {
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(c0656r32.f6715a)) {
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(c0656r3.f6715a)) {
                return false;
            }
            io.appmetrica.analytics.impl.S7 s7 = c0656r3.f6716b;
            if (s7 == io.appmetrica.analytics.impl.S7.f4954c) {
                if (((java.lang.Number) this.f4896a.a(s7)).intValue() < ((java.lang.Number) this.f4896a.a(c0656r32.f6716b)).intValue()) {
                    return false;
                }
            } else if (((java.lang.Number) this.f4896a.a(s7)).intValue() <= ((java.lang.Number) this.f4896a.a(c0656r32.f6716b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
