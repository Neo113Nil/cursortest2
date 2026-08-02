package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0500Il implements InterfaceC0937Zo {
    public final WeakReference<C5Q> A00;

    public C0500Il(C5Q c5q) {
        this.A00 = new WeakReference<>(c5q);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
    public final void ADT(C0936Zn c0936Zn) {
        C5Q c5q = this.A00.get();
        if (c5q != null) {
            c5q.A06 = c0936Zn.A00() != null;
            c5q.A02();
        }
    }
}
