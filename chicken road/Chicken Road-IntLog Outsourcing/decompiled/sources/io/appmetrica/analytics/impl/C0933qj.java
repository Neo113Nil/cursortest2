package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933qj implements InterfaceC0840n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0840n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0829mj a(Context context, C0763k5 c0763k5, X3 x32, C1073w4 c1073w4) {
        Gg gg;
        X4 x42 = new X4(x32.f7693b, x32.f7692a);
        synchronized (c0763k5) {
            gg = (Gg) c0763k5.f8602a.get(x42.toString());
        }
        return new C0829mj(gg);
    }
}
