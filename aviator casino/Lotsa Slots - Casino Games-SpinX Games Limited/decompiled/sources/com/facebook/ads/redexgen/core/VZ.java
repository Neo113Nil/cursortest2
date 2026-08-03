package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements com.facebook.ads.redexgen.core.InterfaceC1034Sp {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1818ju A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UK A01;
    public final /* synthetic */ boolean A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{com.google.common.base.Ascii.FS, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public VZ(com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.redexgen.core.C1818ju c1818ju, boolean z) {
        this.A01 = uk;
        this.A00 = c1818ju;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADL() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        long j;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.CACHE_FAILURE_ERROR;
        java.lang.String A00 = A00(0, 27, 111);
        c1636gi = this.A01.A0g;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi.A0F();
        j = this.A01.A00;
        A0F.A3N(com.facebook.ads.redexgen.core.Y1.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC1066Tv = this.A01.A0I;
        if (interfaceC1066Tv != null) {
            interfaceC1066Tv2 = this.A01.A0I;
            interfaceC1066Tv2.ADp(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADT() {
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv;
        com.facebook.ads.redexgen.core.VW vw;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        boolean A0r;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv3;
        com.facebook.ads.redexgen.core.C05067g c05067g;
        com.facebook.ads.redexgen.core.C05067g c05067g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c05067g = this.A01.A0B;
            if (c05067g != null) {
                c05067g2 = this.A01.A0B;
                c05067g2.A0L();
            }
        }
        interfaceC1066Tv = this.A01.A0I;
        if (interfaceC1066Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(com.facebook.ads.redexgen.core.VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1066Tv3 = this.A01.A0I;
                    interfaceC1066Tv3.AEq();
                }
            }
            if (this.A02) {
                com.facebook.ads.redexgen.core.UK uk = this.A01;
                java.lang.String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    java.lang.String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1636gi = uk.A0g;
                    if (com.facebook.ads.redexgen.core.C1086Up.A1s(c1636gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        com.facebook.ads.redexgen.core.UK uk2 = this.A01;
                        c1636gi2 = this.A01.A0g;
                        uk2.A0P = com.facebook.ads.redexgen.core.AbstractC1421dD.A01(c1636gi2, this.A01.A13(), 4, new com.facebook.ads.redexgen.core.C1112Vr(this));
                        return;
                    } else {
                        com.facebook.ads.redexgen.core.UK uk3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC1066Tv2 = uk3.A0I;
                            interfaceC1066Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
    }
}
