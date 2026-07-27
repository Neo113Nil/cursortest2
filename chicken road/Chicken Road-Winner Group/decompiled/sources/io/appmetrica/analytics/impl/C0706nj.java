package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706nj implements InterfaceC0691n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0691n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0680mj a(Context context, C0614k5 c0614k5, X3 x3, C0924w4 c0924w4) {
        Gg gg;
        C0880uc c0880uc = new C0880uc(x3.f6818b, x3.f6817a);
        synchronized (c0614k5) {
            gg = (Gg) c0614k5.f7683a.get(c0880uc.toString());
        }
        return new C0680mj(gg);
    }
}
