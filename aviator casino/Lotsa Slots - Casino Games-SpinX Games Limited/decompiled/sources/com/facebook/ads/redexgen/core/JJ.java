package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class JJ implements com.facebook.ads.redexgen.core.InterfaceC1419dB {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass62 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 46, 88, com.google.common.base.Ascii.ESC, 10, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SO, 9, 52, com.google.common.base.Ascii.GS, 2, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FS};
    }

    static {
        A01();
    }

    public JJ(com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1419dB
    public final void AFU() {
        com.facebook.ads.redexgen.core.C1632ge context = com.facebook.ads.redexgen.core.T7.A00();
        if (context != null) {
            context.A08().ABC(A00(10, 8, 127), com.facebook.ads.redexgen.core.AbstractC1048Td.A2g, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 10, 108)));
        }
    }
}
