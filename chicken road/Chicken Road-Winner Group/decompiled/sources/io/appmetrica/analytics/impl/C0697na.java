package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697na extends H4 {
    public C0697na(E4 e4) {
        super(e4);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b4) {
        Bundle bundle = w5.f6786m;
        C0465eb c0465eb = bundle != null ? (C0465eb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c0465eb != null) {
            if (c0465eb.f7235d) {
                C0898v4 c0898v4 = b4.f5751b.f5885d.f5912a;
                Boolean bool = c0898v4.f8485n;
                Boolean bool2 = c0898v4.f8480i;
                C0878ua.f8414H.c().c(bool != null ? bool.booleanValue() : true);
                C0878ua.f8414H.h().b(bool2);
            }
        }
        this.f6009a.a(c0465eb);
        return false;
    }
}
