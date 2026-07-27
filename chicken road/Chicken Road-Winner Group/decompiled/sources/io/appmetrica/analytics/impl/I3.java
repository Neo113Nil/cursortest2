package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I3 extends X7 {
    @Override // io.appmetrica.analytics.impl.X7
    public final boolean a(C0999z3 c0999z3, C0999z3 c0999z32) {
        if (AbstractC0711no.a(c0999z32.f8657a)) {
            return true;
        }
        if (AbstractC0711no.a(c0999z3.f8657a)) {
            return false;
        }
        Y7 y7 = c0999z3.f8658b;
        if (y7 == Y7.f6854c) {
            if (((Number) this.f6824a.a(y7)).intValue() >= ((Number) this.f6824a.a(c0999z32.f8658b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f6824a.a(y7)).intValue() > ((Number) this.f6824a.a(c0999z32.f8658b)).intValue()) {
            return true;
        }
        return false;
    }
}
