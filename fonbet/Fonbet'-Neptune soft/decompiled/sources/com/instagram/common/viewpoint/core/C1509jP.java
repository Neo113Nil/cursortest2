package com.instagram.common.viewpoint.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1509jP implements InterfaceC0559Ks<String> {
    @Override // com.instagram.common.viewpoint.core.InterfaceC0559Ks
    public final C0558Kr<String> A3p(File file, LA la) {
        String A05 = LB.A05(file);
        return new C0558Kr<>(A05 != null, A05);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0559Ks
    public final void A55(File file, LA la) {
    }
}
