package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828sc implements InterfaceC0691n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0691n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0854tc a(Context context, C0614k5 c0614k5, X3 x3, C0924w4 c0924w4) {
        Gg gg;
        C0880uc c0880uc = new C0880uc(x3.f6818b, x3.f6817a);
        Hg hg = new Hg(new C0958xc());
        synchronized (c0614k5) {
            gg = (Gg) c0614k5.a(c0880uc, c0924w4, hg, c0614k5.f7683a);
        }
        return new C0854tc(context, gg);
    }
}
