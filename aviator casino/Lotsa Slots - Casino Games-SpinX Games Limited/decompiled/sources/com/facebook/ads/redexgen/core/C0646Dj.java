package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0646Dj extends android.widget.TextView implements com.facebook.ads.redexgen.core.InterfaceC1524eu {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public com.facebook.ads.redexgen.core.C0673Ek A00;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4A> A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A04() {
        A02 = new byte[]{com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, 78, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, 78, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC2};
    }

    static {
        A04();
        A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);
    }

    public C0646Dj(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A01 = new com.facebook.ads.redexgen.core.C0647Dk(this);
        com.facebook.ads.redexgen.core.YB.A0V(this, com.facebook.ads.redexgen.core.YB.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String A02(long j) {
        if (j <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j);
        long minutes2 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        return java.lang.String.format(java.util.Locale.US, A01(0, 9, 23), java.lang.Long.valueOf(minutes), java.lang.Long.valueOf(minutes2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
