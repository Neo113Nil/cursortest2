package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1943ly extends com.facebook.ads.redexgen.core.AbstractC0792Jb {
    public static java.lang.String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public com.facebook.ads.redexgen.core.HJ A00;
    public com.facebook.ads.redexgen.core.C1944lz A01;

    private int A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int i = (c04434v.A0l()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c04434v.A0g(4);
            java.lang.String[] strArr = A02;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[5];
            int charAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (charAt == blockSizeKey) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c04434v.A0S();
        }
        int result = com.facebook.ads.redexgen.core.HF.A00(c04434v, i);
        c04434v.A0f(0);
        return result;
    }

    public static boolean A01(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return c04434v.A07() >= 5 && c04434v.A0I() == 127 && c04434v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final long A09(com.facebook.ads.redexgen.core.C04434v c04434v) {
        if (!A02(c04434v.A0l())) {
            return -1L;
        }
        return A00(c04434v);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j, com.facebook.ads.redexgen.core.C0791Ja c0791Ja) {
        byte[] A0l = c04434v.A0l();
        com.facebook.ads.redexgen.core.HJ hj = this.A00;
        if (hj == null) {
            com.facebook.ads.redexgen.core.HJ hj2 = new com.facebook.ads.redexgen.core.HJ(A0l, 17);
            this.A00 = hj2;
            c0791Ja.A00 = hj2.A08(java.util.Arrays.copyOfRange(A0l, 9, c04434v.A0A()), null);
            return true;
        }
        if ((A0l[0] & Byte.MAX_VALUE) == 3) {
            com.facebook.ads.redexgen.core.HI A03 = com.facebook.ads.redexgen.core.HH.A03(c04434v);
            com.facebook.ads.redexgen.core.HJ streamMetadata = hj.A09(A03);
            this.A00 = streamMetadata;
            this.A01 = new com.facebook.ads.redexgen.core.C1944lz(streamMetadata, A03);
            return true;
        }
        if (!A02(A0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j);
            c0791Ja.A01 = this.A01;
        }
        com.facebook.ads.redexgen.core.C2196qI c2196qI = c0791Ja.A00;
        java.lang.String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2196qI);
        return false;
    }
}
