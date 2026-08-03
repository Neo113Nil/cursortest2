package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0719Gf implements com.facebook.ads.redexgen.core.InterfaceC1170Ya {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0718Ge A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        if (A02[0].charAt(1) == '2') {
            throw new java.lang.RuntimeException();
        }
        A02[3] = "dLINtRlzHu";
        A01 = new byte[]{117, 109, 111, 118};
    }

    static {
        A01();
    }

    public C0719Gf(com.facebook.ads.redexgen.core.C0718Ge c0718Ge) {
        this.A00 = c0718Ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1170Ya
    public final void ACl(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij;
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij2;
        if (abstractC1171Yb.getToolbarActionMode() == 8) {
            abstractC0775Ij = this.A00.A04;
            if (abstractC0775Ij != null) {
                vi = this.A00.A0F;
                vi.A04(com.facebook.ads.redexgen.core.VH.A0Y, null);
                abstractC0775Ij2 = this.A00.A04;
                abstractC0775Ij2.A1D(A00(0, 4, 95));
                this.A00.A0G();
                return;
            }
        }
        this.A00.A0E();
    }
}
