package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132yc extends C0737j5 {
    public C1132yc(Context context, X4 x42, C1047v4 c1047v4, AbstractC0557c5 abstractC0557c5, C0754jm c0754jm, InterfaceC0827mh interfaceC0827mh, ICommonExecutor iCommonExecutor, int i2, C0882ok c0882ok, Mb mb, InterfaceC1154z9 interfaceC1154z9) {
        super(context, x42, c1047v4, abstractC0557c5, c0754jm, interfaceC0827mh, iCommonExecutor, i2, mb, interfaceC1154z9);
    }

    public final C1033ug a(C1081wc c1081wc) {
        C0953re c0953re = new C0953re(c1081wc);
        Objects.requireNonNull(c1081wc);
        return new C1033ug(c0953re, new C1055vc(c1081wc), c1081wc);
    }

    @Override // io.appmetrica.analytics.impl.C0737j5
    public final InterfaceC1104x9 a(C9 c9, S6 s6, Vg vg, C1047v4 c1047v4, X4 x42, C0541bf c0541bf) {
        return this.f8513l.a(c9, s6, vg, c1047v4, x42, c0541bf).a();
    }
}
