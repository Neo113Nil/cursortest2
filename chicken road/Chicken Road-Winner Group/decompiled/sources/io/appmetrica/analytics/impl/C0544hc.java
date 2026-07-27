package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544hc implements InterfaceC0691n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0691n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B4 a(Context context, C0614k5 c0614k5, X3 x3, C0924w4 c0924w4) {
        E4 e4;
        C4 c4 = new C4(x3.f6818b);
        F4 f4 = new F4();
        synchronized (c0614k5) {
            e4 = (E4) c0614k5.a(c4, c0924w4, f4, c0614k5.f7684b);
        }
        return new B4(context, e4, c0924w4);
    }
}
