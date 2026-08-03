package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZO implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Rngvbb3vMR3b56rBexb50Rjom5JamLMR", "BOyMrOLOVyOlAA7tdLfD", "PSvH7Ca0GqwbJXrw1OxZU20X4aHcam0S", "dzm7VVMnrqblx5opBv2tkfICkL24O513", "rKXY71", "THxRt8Yss0BlXBXFFRIVlNUaizFLAmop", "EnNQl89tpWVbcex4LtQ2YfadlOVOSM9k", "1aWdi1c8aZwiTk2zvtk8Xc2vTbtrER0G"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.MI A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{0, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 2, com.google.common.base.Ascii.GS, 51, 4, 17, 51, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, 19, com.google.common.base.Ascii.ESC};
    }

    static {
        A01();
    }

    public ZO(com.facebook.ads.redexgen.core.MI mi) {
        this.A00 = mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1177Yh = this.A00.A06;
            interfaceC1177Yh.A4j(A00(0, 15, 86));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A02;
            if (strArr[7].charAt(31) == strArr[5].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "qnEa0qqxoU4sFli1HS9Y3SbmuU3eBkbM";
            strArr2[0] = "NnijgEsxsjK8xKe1vFUOE7dsdCVZHTLh";
        }
    }
}
