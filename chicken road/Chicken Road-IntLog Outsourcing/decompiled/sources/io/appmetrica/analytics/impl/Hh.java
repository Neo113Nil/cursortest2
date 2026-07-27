package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hh implements InterfaceC0840n4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0634f5 f6881a;

    public Hh(InterfaceC0634f5 interfaceC0634f5) {
        this.f6881a = interfaceC0634f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0840n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fg a(Context context, C0763k5 c0763k5, X3 x32, C1073w4 c1073w4) {
        Gg gg;
        X4 x42 = new X4(x32.f7693b, x32.f7692a);
        Hg hg = new Hg(this.f6881a);
        synchronized (c0763k5) {
            gg = (Gg) c0763k5.a(x42, c1073w4, hg, c0763k5.f8602a);
        }
        return new Fg(context, gg);
    }
}
