package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1882kz implements com.facebook.ads.redexgen.core.H9 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final com.facebook.ads.redexgen.core.HD A09;
    public com.facebook.ads.redexgen.core.HA A04;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A05;
    public com.facebook.ads.redexgen.core.LL A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, 39, 50, 39, 102, 35, 62, 37, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, 33, 50, 46, 124, 102, 39, com.google.common.base.Ascii.FS, 1, 7, 2, 2, com.google.common.base.Ascii.GS, 0, 6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 82, 37, 51, 36, 82, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 0, com.google.common.base.Ascii.US, 19, 6, 82, 6, com.google.common.base.Ascii.VT, 2, com.google.common.base.Ascii.ETB, 72, 82, Byte.MAX_VALUE, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 95, com.google.common.base.Ascii.ETB, 71, 65, 65, 93, 17, com.google.common.base.Ascii.FS, 17, 7, Byte.MAX_VALUE, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 115, 114, Byte.MAX_VALUE, 105, 55, 35, 50, 63, 57, 121, 36, 55, 33};
    }

    static {
        A03();
        A09 = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.l2
            @Override // com.facebook.ads.redexgen.core.HD
            public final com.facebook.ads.redexgen.core.H9[] A5N() {
                return com.facebook.ads.redexgen.core.C1882kz.A08();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
                return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
            }
        };
    }

    private int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A02 != -1);
        return ((com.facebook.ads.redexgen.core.LL) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AIt(interfaceC1987ms, this.A02 - interfaceC1987ms.A8n()) ? -1 : 0;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A05);
    }

    private void A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(interfaceC1987ms.A8n() == 0);
        int i = this.A00;
        if (A08[5].length() != 13) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i != -1) {
            interfaceC1987ms.AK3(this.A00);
            this.A01 = 4;
        } else {
            if (com.facebook.ads.redexgen.core.LP.A06(interfaceC1987ms)) {
                interfaceC1987ms.AK3((int) (interfaceC1987ms.A8i() - interfaceC1987ms.A8n()));
                this.A01 = 1;
                return;
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A01(58, 42, 8), null);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.LN wavFormat = com.facebook.ads.redexgen.core.LP.A02(interfaceC1987ms);
        if (wavFormat.A03 == 17) {
            this.A06 = new com.facebook.ads.redexgen.core.C1884l1(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new com.facebook.ads.redexgen.core.C1883l0(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new com.facebook.ads.redexgen.core.C1883l0(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int A00 = com.facebook.ads.redexgen.core.AbstractC0751Hl.A00(wavFormat.A03, wavFormat.A01);
            if (A00 != 0) {
                this.A06 = new com.facebook.ads.redexgen.core.C1883l0(this.A04, this.A05, wavFormat, A01(142, 9, 116), A00);
            } else {
                throw com.facebook.ads.redexgen.core.C3K.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        this.A03 = com.facebook.ads.redexgen.core.LP.A00(interfaceC1987ms);
        this.A01 = 2;
    }

    private void A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        android.util.Pair<java.lang.Long, java.lang.Long> A01 = com.facebook.ads.redexgen.core.LP.A01(interfaceC1987ms);
        this.A00 = ((java.lang.Long) A01.first).intValue();
        long longValue = ((java.lang.Long) A01.second).longValue();
        if (this.A03 != -1) {
            java.lang.String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (longValue == 4294967295L) {
                longValue = this.A03;
            }
        }
        this.A02 = this.A00 + longValue;
        long A8O = interfaceC1987ms.A8O();
        if (A8O != -1 && this.A02 > A8O) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + A8O);
            this.A02 = A8O;
        }
        ((com.facebook.ads.redexgen.core.LL) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AA8(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A08() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1882kz()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A04 = ha;
        this.A05 = ha.AKS(0, 1);
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC1987ms);
                return 0;
            case 1:
                A06(interfaceC1987ms);
                if (A08[5].length() != 13) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC1987ms);
                return 0;
            case 3:
                A07(interfaceC1987ms);
                return 0;
            case 4:
                return A00(interfaceC1987ms);
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AIk(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        return com.facebook.ads.redexgen.core.LP.A06(interfaceC1987ms);
    }
}
