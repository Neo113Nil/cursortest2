package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC0937Zo {
    public final WeakReference<C01755h> A00;

    public K0(C01755h c01755h) {
        this.A00 = new WeakReference<>(c01755h);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
    public final void ADT(C0936Zn c0936Zn) {
        C01755h c01755h = this.A00.get();
        if (c01755h != null) {
            c01755h.A04 = c0936Zn.A00() != null;
            c01755h.A02();
        }
    }
}
