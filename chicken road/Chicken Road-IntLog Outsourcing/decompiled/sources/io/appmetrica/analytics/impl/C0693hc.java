package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693hc implements InterfaceC0840n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0840n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B4 a(Context context, C0763k5 c0763k5, X3 x32, C1073w4 c1073w4) {
        E4 e42;
        C4 c42 = new C4(x32.f7693b);
        F4 f42 = new F4();
        synchronized (c0763k5) {
            e42 = (E4) c0763k5.a(c42, c1073w4, f42, c0763k5.f8603b);
        }
        return new B4(context, e42, c1073w4);
    }
}
