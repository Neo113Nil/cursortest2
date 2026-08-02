package com.instagram.common.viewpoint.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1510jQ implements InterfaceC0559Ks<File> {
    @Override // com.instagram.common.viewpoint.core.InterfaceC0559Ks
    public final C0558Kr<File> A3p(File file, LA la) {
        if (file.exists()) {
            return new C0558Kr<>(true, file);
        }
        return new C0558Kr<>(false, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0559Ks
    public final void A55(File file, LA la) {
    }
}
