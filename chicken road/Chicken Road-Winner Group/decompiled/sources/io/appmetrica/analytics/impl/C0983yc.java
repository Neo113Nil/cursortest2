package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983yc extends C0588j5 {
    public C0983yc(Context context, X4 x4, C0898v4 c0898v4, AbstractC0408c5 abstractC0408c5, C0605jm c0605jm, InterfaceC0678mh interfaceC0678mh, ICommonExecutor iCommonExecutor, int i3, C0733ok c0733ok, Mb mb, InterfaceC1005z9 interfaceC1005z9) {
        super(context, x4, c0898v4, abstractC0408c5, c0605jm, interfaceC0678mh, iCommonExecutor, i3, mb, interfaceC1005z9);
    }

    public final C0884ug a(C0932wc c0932wc) {
        C0804re c0804re = new C0804re(c0932wc);
        Objects.requireNonNull(c0932wc);
        return new C0884ug(c0804re, new C0906vc(c0932wc), c0932wc);
    }

    @Override // io.appmetrica.analytics.impl.C0588j5
    public final InterfaceC0955x9 a(C9 c9, S6 s6, Vg vg, C0898v4 c0898v4, X4 x4, C0392bf c0392bf) {
        return this.f7599l.a(c9, s6, vg, c0898v4, x4, c0392bf).a();
    }
}
