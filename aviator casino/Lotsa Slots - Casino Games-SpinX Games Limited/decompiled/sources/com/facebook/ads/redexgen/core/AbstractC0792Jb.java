package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0792Jb {
    public static java.lang.String[] A0D = {"XeH1UKKuz1EDpBeQKhAXaKjrjZgsodJU", "Qh9sfVWsiKdbMkoZ0Fly5mM08PFSskfX", "g5Vgu", "IbV76iHRvjKg6MHaSQGzPOhr6f1ApNQX", "p6vckuBwU2Q2AllMmzSrbAD", "CWShENYx4MqsFhdcA74Ut20lXSF9FxoW", "efy3JamC8vBQUYLSbDR2yGzuJR", "AxMKck"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public com.facebook.ads.redexgen.core.HA A06;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A07;
    public com.facebook.ads.redexgen.core.JY A08;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.JW A0C = new com.facebook.ads.redexgen.core.JW();
    public com.facebook.ads.redexgen.core.C0791Ja A09 = new com.facebook.ads.redexgen.core.C0791Ja();

    public abstract long A09(com.facebook.ads.redexgen.core.C04434v c04434v);

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j, com.facebook.ads.redexgen.core.C0791Ja c0791Ja) throws java.io.IOException;

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (A03(interfaceC1987ms)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                this.A07.A6e(this.A09.A00);
                this.A0A = true;
            }
            com.facebook.ads.redexgen.core.JY jy = this.A09.A01;
            java.lang.String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            A0D[7] = "ikA5IIIrIRBN8L1z";
            if (jy != null) {
                this.A08 = this.A09.A01;
            } else if (interfaceC1987ms.A8O() == -1) {
                this.A08 = new com.facebook.ads.redexgen.core.C1939lu();
            } else {
                com.facebook.ads.redexgen.core.JX A02 = this.A0C.A02();
                this.A08 = new com.facebook.ads.redexgen.core.C1945m0(this, this.A04, interfaceC1987ms.A8O(), A02.A01 + A02.A00, A02.A05, (A02.A04 & 4) != 0);
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r5 >= r18.A05) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r2 = r18.A02;
        r12 = A05(r2);
        r18.A07.AIr(r8, r8.A0A());
        r18.A07.AIu(r12, 1, r8.A0A(), 0, null);
        r18.A05 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r5 >= r18.A05) goto L26;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        long AHN = this.A08.AHN(interfaceC1987ms);
        if (AHN >= 0) {
            hv.A00 = AHN;
            return 1;
        }
        if (AHN < -1) {
            if (A0D[1].charAt(30) != 'f') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0D;
            strArr[2] = "VTxPX";
            strArr[6] = "vg288hyM3d7P0eFgaD3UTrluSy";
            long position = -(2 + AHN);
            A0A(position);
        }
        if (!this.A0B) {
            this.A06.AJ7((com.facebook.ads.redexgen.core.HY) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A08.A5Z()));
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC1987ms)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        com.facebook.ads.redexgen.core.C04434v A01 = this.A0C.A01();
        long A09 = A09(A01);
        if (A09 >= 0) {
            long j = this.A02 + A09;
            java.lang.String[] strArr2 = A0D;
            if (strArr2[2].length() != strArr2[6].length()) {
                A0D[0] = "EPgFULMjpXPDE9er32WaoAxqXEcFdYah";
            }
        }
        this.A02 += A09;
        return 0;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A02() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A07);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean A03(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        while (true) {
            com.facebook.ads.redexgen.core.JW jw = this.A0C;
            java.lang.String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                break;
            }
            A0D[7] = "RUb6h5R55PuDixsZqq";
            if (!jw.A05(interfaceC1987ms)) {
                this.A01 = 3;
                return false;
            }
            this.A03 = interfaceC1987ms.A8n() - this.A04;
            if (A0C(this.A0C.A01(), this.A04, this.A09)) {
                long A8n = interfaceC1987ms.A8n();
                if (A0D[7].length() == 17) {
                    break;
                }
                A0D[0] = "MjaWWlFxdP245keDLyVkXHL1D0C1Hazn";
                this.A04 = A8n;
            } else {
                return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public final int A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        A02();
        switch (this.A01) {
            case 0:
                return A00(interfaceC1987ms);
            case 1:
                interfaceC1987ms.AK3((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC1987ms, hv);
            case 3:
                return -1;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final long A05(long j) {
        return (1000000 * j) / this.A00;
    }

    public final long A06(long j) {
        return (this.A00 * j) / 1000000;
    }

    public final void A07(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            A0B(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A06(j2);
            ((com.facebook.ads.redexgen.core.JY) com.facebook.ads.redexgen.core.C5C.A0f(this.A08)).AKC(this.A05);
            this.A01 = 2;
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        this.A06 = ha;
        this.A07 = interfaceC0743Hd;
        A0B(true);
    }

    public void A0A(long j) {
        this.A02 = j;
    }

    public void A0B(boolean z) {
        if (z) {
            this.A09 = new com.facebook.ads.redexgen.core.C0791Ja();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
