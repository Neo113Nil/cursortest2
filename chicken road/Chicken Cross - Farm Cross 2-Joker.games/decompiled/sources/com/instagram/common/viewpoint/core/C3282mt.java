package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3282mt implements InterfaceC2037Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final /* synthetic */ int AIp(InterfaceC16702c interfaceC16702c, int i, boolean z) {
        return AbstractC2034Ha.A00(this, interfaceC16702c, i, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final /* synthetic */ void AIr(C17374v c17374v, int i) {
        AbstractC2034Ha.A01(this, c17374v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final void A6e(C3490qI c3490qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final int AIq(InterfaceC16702c interfaceC16702c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC16702c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final void AIs(C17374v c17374v, int i, int i2) {
        c17374v.A0g(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    public final void AIu(long j, int i, int i2, int i3, C2035Hb c2035Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2037Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
