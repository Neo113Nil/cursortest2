package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GV extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
            if (A02[5].length() != 5) {
                throw new java.lang.RuntimeException();
            }
            A02[2] = "VyWbJGKy3Ebs7lO";
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 1, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 7, 72, 6, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, 72, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 9, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 72, com.google.common.base.Ascii.CAN, 4, 9, 17, 1, 6, com.google.common.base.Ascii.SI};
    }

    static {
        A01();
    }

    public GV(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0F;
        if (!z) {
            this.A00.A0Q(A00(0, 27, 102));
        }
    }
}
