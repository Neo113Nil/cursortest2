package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hh implements InterfaceC0691n4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0485f5 f6034a;

    public Hh(InterfaceC0485f5 interfaceC0485f5) {
        this.f6034a = interfaceC0485f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0691n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fg a(Context context, C0614k5 c0614k5, X3 x3, C0924w4 c0924w4) {
        Gg gg;
        X4 x4 = new X4(x3.f6818b, x3.f6817a);
        Hg hg = new Hg(this.f6034a);
        synchronized (c0614k5) {
            gg = (Gg) c0614k5.a(x4, c0924w4, hg, c0614k5.f7683a);
        }
        return new Fg(context, gg);
    }
}
