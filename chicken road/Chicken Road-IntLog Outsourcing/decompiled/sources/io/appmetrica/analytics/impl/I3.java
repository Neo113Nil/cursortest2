package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I3 extends X7 {
    @Override // io.appmetrica.analytics.impl.X7
    public final boolean a(C1148z3 c1148z3, C1148z3 c1148z32) {
        if (!AbstractC0860no.a(c1148z32.f9617a)) {
            if (AbstractC0860no.a(c1148z3.f9617a)) {
                return false;
            }
            Y7 y7 = c1148z3.f9618b;
            if (y7 == Y7.f7730c) {
                if (((Number) this.f7699a.a(y7)).intValue() < ((Number) this.f7699a.a(c1148z32.f9618b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f7699a.a(y7)).intValue() <= ((Number) this.f7699a.a(c1148z32.f9618b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
