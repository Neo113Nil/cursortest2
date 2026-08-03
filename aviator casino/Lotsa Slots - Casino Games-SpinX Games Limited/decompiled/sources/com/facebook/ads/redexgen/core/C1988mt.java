package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1988mt implements com.facebook.ads.redexgen.core.InterfaceC0743Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final /* synthetic */ int AIp(com.facebook.ads.redexgen.core.InterfaceC03762c interfaceC03762c, int i, boolean z) {
        return com.facebook.ads.redexgen.core.AbstractC0740Ha.A00(this, interfaceC03762c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final /* synthetic */ void AIr(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        com.facebook.ads.redexgen.core.AbstractC0740Ha.A01(this, c04434v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void A6e(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final int AIq(com.facebook.ads.redexgen.core.InterfaceC03762c interfaceC03762c, int i, boolean z, int i2) throws java.io.IOException {
        int bytesSkipped = interfaceC03762c.read(this.A00, 0, java.lang.Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void AIs(com.facebook.ads.redexgen.core.C04434v c04434v, int i, int i2) {
        c04434v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void AIu(long j, int i, int i2, int i3, com.facebook.ads.redexgen.core.C0741Hb c0741Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(android.net.Uri uri) {
    }
}
