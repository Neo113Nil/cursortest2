package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class HM {
    public final com.facebook.ads.redexgen.core.C04434v A00 = new com.facebook.ads.redexgen.core.C04434v(10);

    public final com.facebook.ads.androidx.media3.common.Metadata A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.IE ie) throws java.io.IOException {
        int tagLength = 0;
        com.facebook.ads.androidx.media3.common.Metadata metadata = null;
        while (true) {
            try {
                interfaceC1987ms.AGt(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int A0H = this.A00.A0H();
                int framesLength = A0H + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    java.lang.System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC1987ms.AGt(bArr, 10, A0H);
                    metadata = new com.facebook.ads.redexgen.core.C9U(ie).A0S(bArr, framesLength);
                } else {
                    interfaceC1987ms.A47(A0H);
                }
                tagLength += framesLength;
            } catch (java.io.EOFException unused) {
            }
        }
        interfaceC1987ms.AIl();
        interfaceC1987ms.A47(tagLength);
        return metadata;
    }
}
