package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003tc extends AbstractC0628f {
    public C1003tc(Context context, Gg gg) {
        super(context, gg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0628f
    public final void b(W5 w5, C1073w4 c1073w4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c1073w4.f9498b.f9427b, Boolean.FALSE)).booleanValue();
        Rb m6 = C1027ua.f9366H.m();
        m6.a(booleanValue);
        m6.a(c1073w4.f9498b.f9428c);
        Boolean bool = c1073w4.f9498b.f9439n;
        if (bool != null) {
            C1027ua.f9366H.c().b(bool.booleanValue());
        }
        this.f8160b.a(w5, c1073w4);
    }
}
