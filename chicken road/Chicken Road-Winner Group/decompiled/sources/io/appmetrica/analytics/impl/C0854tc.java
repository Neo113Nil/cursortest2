package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854tc extends AbstractC0479f {
    public C0854tc(Context context, Gg gg) {
        super(context, gg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0479f
    public final void b(W5 w5, C0924w4 c0924w4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0924w4.f8541b.f8474b, Boolean.FALSE)).booleanValue();
        Rb m3 = C0878ua.f8414H.m();
        m3.a(booleanValue);
        m3.a(c0924w4.f8541b.f8475c);
        Boolean bool = c0924w4.f8541b.f8485n;
        if (bool != null) {
            C0878ua.f8414H.c().b(bool.booleanValue());
        }
        this.f7265b.a(w5, c0924w4);
    }
}
