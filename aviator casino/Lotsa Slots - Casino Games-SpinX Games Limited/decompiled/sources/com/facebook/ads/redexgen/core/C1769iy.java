package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1769iy implements com.facebook.ads.redexgen.core.NC {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05097j A00;
    public final /* synthetic */ java.lang.Runnable A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, com.google.common.base.Ascii.FS, 6, com.google.common.base.Ascii.ETB, 0, 1, 6, com.google.common.base.Ascii.ESC, 6, com.google.common.base.Ascii.ESC, 19, com.google.common.base.Ascii.RS, 82, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, 2, 0, com.google.common.base.Ascii.ETB, 1, 1, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 82, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ESC, 0, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 63, 48, 1, 63, kotlin.io.encoding.Base64.padSymbol, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1769iy(com.facebook.ads.redexgen.core.C05097j c05097j, java.lang.Runnable runnable) {
        this.A00 = c05097j;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEC(com.facebook.ads.redexgen.core.C1823jz c1823jz, java.lang.String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !android.text.TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                android.content.Intent intent = new android.content.Intent(A00(85, 26, 62));
                intent.setData(com.facebook.ads.redexgen.core.XB.A00(str));
                com.facebook.ads.redexgen.core.C1140Wu.A0D(this.A00.A0B, intent);
            } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
                java.lang.Throwable cause = e.getCause();
                java.lang.Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), com.facebook.ads.redexgen.core.AbstractC1048Td.A04, new com.facebook.ads.redexgen.core.C1049Te(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AED(com.facebook.ads.redexgen.core.C1823jz c1823jz) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEE(com.facebook.ads.redexgen.core.C1823jz c1823jz) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEF(com.facebook.ads.redexgen.core.C1823jz c1823jz) {
        if (c1823jz != this.A00.A00) {
            return;
        }
        if (c1823jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, 121), com.facebook.ads.redexgen.core.AbstractC1048Td.A0X, new com.facebook.ads.redexgen.core.C1049Te(A00(8, 37, 54)));
            AEG(c1823jz, com.facebook.ads.AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c1823jz;
        this.A00.A0L();
        this.A00.A07.A0F(c1823jz);
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEG(com.facebook.ads.redexgen.core.C1823jz c1823jz, com.facebook.ads.AdError adError) {
        if (c1823jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c1823jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new com.facebook.ads.redexgen.core.C1108Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEH(com.facebook.ads.redexgen.core.C1823jz c1823jz) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
