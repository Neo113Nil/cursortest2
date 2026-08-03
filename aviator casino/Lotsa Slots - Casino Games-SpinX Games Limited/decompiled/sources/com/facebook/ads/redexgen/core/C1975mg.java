package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1975mg implements com.facebook.ads.redexgen.core.H9 {
    public static java.lang.String[] A0E = {"CA5tgyD1ft6jPQScHcEKxijdDn8CpaAj", "rrvFpoycxrr9C", "qEVAWkTuIpwlYdd7u09", "zGu", "r98", "bvJEUCblPMa4rVVBIUxYNVrIzXUNKtA9", "0YPJWJVAuNzanCV2KA", "Ww61LKXhC9Y0aL9N3LYwjUph3RiaOuui"};
    public static final com.facebook.ads.redexgen.core.HD A0F = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.mh
        @Override // com.facebook.ads.redexgen.core.HD
        public final com.facebook.ads.redexgen.core.H9[] A5N() {
            return com.facebook.ads.redexgen.core.C1975mg.A09();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
            return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public com.facebook.ads.androidx.media3.common.Metadata A05;
    public com.facebook.ads.redexgen.core.HA A06;
    public com.facebook.ads.redexgen.core.HJ A07;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A08;
    public com.facebook.ads.redexgen.core.C1977mi A09;
    public final com.facebook.ads.redexgen.core.C04434v A0A;
    public final com.facebook.ads.redexgen.core.HE A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public C1975mg() {
        this(0);
    }

    public C1975mg(int i) {
        this.A0D = new byte[42];
        this.A0A = new com.facebook.ads.redexgen.core.C04434v(new byte[32768], 0);
        this.A0C = (i & 1) != 0;
        this.A0B = new com.facebook.ads.redexgen.core.HE();
        this.A03 = 0;
    }

    private int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A08);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07);
        if (this.A09 != null && this.A09.A09()) {
            return this.A09.A06(interfaceC1987ms, hv);
        }
        long j = this.A04;
        if (A0E[2].length() == 19) {
            A0E[2] = "5vsaEOzV8f26KwvJg69";
            if (j == -1) {
                this.A04 = com.facebook.ads.redexgen.core.HF.A01(interfaceC1987ms, this.A07);
                return 0;
            }
            int A0A = this.A0A.A0A();
            java.lang.String[] strArr = A0E;
            if (strArr[6].length() != strArr[1].length()) {
                java.lang.String[] strArr2 = A0E;
                strArr2[6] = "dF6ALNUNBXQAeyaZgj";
                strArr2[1] = "WrJkmBjBZcK3S";
                boolean z = false;
                if (A0A < 32768) {
                    int currentLimit = 32768 - A0A;
                    int read = interfaceC1987ms.read(this.A0A.A0l(), A0A, currentLimit);
                    z = read == -1;
                    if (!z) {
                        this.A0A.A0e(A0A + read);
                    } else {
                        int currentLimit2 = this.A0A.A07();
                        if (currentLimit2 == 0) {
                            A03();
                            return -1;
                        }
                    }
                }
                int A09 = this.A0A.A09();
                int i = this.A00;
                int currentLimit3 = this.A02;
                if (i < currentLimit3) {
                    com.facebook.ads.redexgen.core.C04434v c04434v = this.A0A;
                    int i2 = this.A02;
                    int currentLimit4 = this.A00;
                    int i3 = i2 - currentLimit4;
                    int currentLimit5 = this.A0A.A07();
                    c04434v.A0g(java.lang.Math.min(i3, currentLimit5));
                }
                long A01 = A01(this.A0A, z);
                int A092 = this.A0A.A09() - A09;
                this.A0A.A0f(A09);
                this.A08.AIr(this.A0A, A092);
                int currentLimit6 = this.A00;
                this.A00 = currentLimit6 + A092;
                if (A01 != -1) {
                    A03();
                    java.lang.String[] strArr3 = A0E;
                    java.lang.String str = strArr3[6];
                    java.lang.String str2 = strArr3[1];
                    int length = str.length();
                    int currentLimit7 = str2.length();
                    if (length != currentLimit7) {
                        java.lang.String[] strArr4 = A0E;
                        strArr4[3] = "m1G";
                        strArr4[4] = "pgV";
                        this.A00 = 0;
                        this.A04 = A01;
                    }
                }
                if (this.A0A.A07() < 16) {
                    int A07 = this.A0A.A07();
                    java.lang.System.arraycopy(this.A0A.A0l(), this.A0A.A09(), this.A0A.A0l(), 0, A07);
                    this.A0A.A0f(0);
                    this.A0A.A0e(A07);
                }
                return 0;
            }
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0034 */
    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A01(com.facebook.ads.redexgen.core.C04434v c04434v, boolean z) {
        boolean z2;
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07);
        int A09 = c04434v.A09();
        while (A09 <= frameOffset - 16) {
            c04434v.A0f(A09);
            if (com.facebook.ads.redexgen.core.HF.A07(c04434v, this.A07, this.A01, this.A0B)) {
                c04434v.A0f(A09);
                return this.A0B.A00;
            }
            A09++;
        }
        if (z) {
            while (A09 <= r1 - frameOffset) {
                c04434v.A0f(A09);
                try {
                    z2 = com.facebook.ads.redexgen.core.HF.A07(c04434v, this.A07, this.A01, this.A0B);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                int A092 = c04434v.A09();
                int frameOffset = c04434v.A0A();
                if (A092 > frameOffset) {
                    z2 = false;
                }
                if (z2) {
                    c04434v.A0f(A09);
                    return this.A0B.A00;
                }
                A09++;
            }
            int frameOffset2 = c04434v.A0A();
            c04434v.A0f(frameOffset2);
        } else {
            c04434v.A0f(A09);
        }
        java.lang.String[] strArr = A0E;
        java.lang.String str = strArr[3];
        java.lang.String str2 = strArr[4];
        int length = str.length();
        int frameOffset3 = str2.length();
        if (length != frameOffset3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0E;
        strArr2[7] = "ocsB3wUrjHvCq2LiV7qRqPCVLxbY4c1N";
        strArr2[5] = "pwt2z55mSaXVkRisABTZleFgLF4gxvRK";
        return -1L;
    }

    private com.facebook.ads.redexgen.core.HY A02(long j, long j2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07);
        if (this.A07.A0A != null) {
            return new com.facebook.ads.redexgen.core.C1984mp(this.A07, j);
        }
        if (j2 != -1 && this.A07.A09 > 0) {
            this.A09 = new com.facebook.ads.redexgen.core.C1977mi(this.A07, this.A01, j, j2);
            return this.A09.A07();
        }
        return new com.facebook.ads.redexgen.core.C1982mn(this.A07.A06());
    }

    private void A03() {
        ((com.facebook.ads.redexgen.core.InterfaceC0743Hd) com.facebook.ads.redexgen.core.C5C.A0f(this.A08)).AIu((this.A04 * 1000000) / ((com.facebook.ads.redexgen.core.HJ) com.facebook.ads.redexgen.core.C5C.A0f(this.A07)).A07, 1, this.A00, 0, null);
    }

    private void A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        this.A01 = com.facebook.ads.redexgen.core.HH.A00(interfaceC1987ms);
        ((com.facebook.ads.redexgen.core.HA) com.facebook.ads.redexgen.core.C5C.A0f(this.A06)).AJ7(A02(interfaceC1987ms.A8n(), interfaceC1987ms.A8O()));
        this.A03 = 5;
    }

    private void A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        interfaceC1987ms.AGt(this.A0D, 0, this.A0D.length);
        interfaceC1987ms.AIl();
        this.A03 = 2;
    }

    private void A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        this.A05 = com.facebook.ads.redexgen.core.HH.A02(interfaceC1987ms, !this.A0C);
        this.A03 = 1;
    }

    private void A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        boolean z = false;
        com.facebook.ads.redexgen.core.HG metadataHolder = new com.facebook.ads.redexgen.core.HG(this.A07);
        while (!z) {
            z = com.facebook.ads.redexgen.core.HH.A0B(interfaceC1987ms, metadataHolder);
            this.A07 = (com.facebook.ads.redexgen.core.HJ) com.facebook.ads.redexgen.core.C5C.A0f(metadataHolder.A00);
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07);
        this.A02 = java.lang.Math.max(this.A07.A06, 6);
        ((com.facebook.ads.redexgen.core.InterfaceC0743Hd) com.facebook.ads.redexgen.core.C5C.A0f(this.A08)).A6e(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.HH.A09(interfaceC1987ms);
        this.A03 = 3;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A09() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1975mg()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A06 = ha;
        this.A08 = ha.AKS(0, 1);
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        switch (this.A03) {
            case 0:
                A06(interfaceC1987ms);
                return 0;
            case 1:
                A05(interfaceC1987ms);
                return 0;
            case 2:
                A08(interfaceC1987ms);
                return 0;
            case 3:
                A07(interfaceC1987ms);
                return 0;
            case 4:
                A04(interfaceC1987ms);
                return 0;
            case 5:
                return A00(interfaceC1987ms, hv);
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        if (j == 0) {
            this.A03 = 0;
        } else {
            com.facebook.ads.redexgen.core.C1977mi c1977mi = this.A09;
            if (A0E[2].length() != 19) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[3] = "FHi";
            strArr[4] = "3pT";
            if (c1977mi != null) {
                this.A09.A08(j2);
            }
        }
        this.A04 = j2 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0d(0);
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.HH.A01(interfaceC1987ms, false);
        return com.facebook.ads.redexgen.core.HH.A0A(interfaceC1987ms);
    }
}
