package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1980ml implements com.facebook.ads.redexgen.core.H9 {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"nCYubXqvd8ypcUhOSOVlYAWiNtNg5aTx", "kK9obhnzrC8LOV4nIDjH0fRMkLxjM4hw", "y066yKC5U0", "cE1K3Th7x6hTx4uAy2DDcaRqLgqPomcW", "7FhRQrMCUcKubfGBASNqeIg", "2Nytx4SBEfNcp68myMLwYRuSH7vsFm1u", "ZlttTssTlgjvAvH32uYzHDtT6TE9W794", "80ncat3y6qUdob6xQVasiz6qbkfE4w7J"};
    public static final com.facebook.ads.redexgen.core.HD A0H;
    public static final int A0I;
    public static final byte[] A0J;
    public static final byte[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public com.facebook.ads.redexgen.core.HA A07;
    public com.facebook.ads.redexgen.core.HY A08;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final byte[] A0E;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-115, -45, -33, -50, -38, -46, -115, -31, -26, -35, -46, -115, -120, -122, -90, -78, -73, 111, -53, -55, -23, -11, -6, -43, -1, -22, -78, -15, com.google.common.base.Ascii.GS, 35, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC2, -50, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 34, -50, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, -50, -17, -5, 0, -50, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, 19, 32, -36, com.google.common.base.Ascii.FS, 63, 63, 56, 58, 52, 63, -13, com.google.common.base.Ascii.DC4, 32, 37, -13, com.google.common.base.Ascii.ETB, 60, 68, 47, 58, 55, 50, -18, 62, 47, 50, 50, 55, 60, 53, -18, 48, 55, 66, 65, -18, 52, kotlin.io.encoding.Base64.padSymbol, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -18, 52, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 47, 59, 51, -18, 54, 51, 47, 50, 51, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -18, -40, -52, -35, -56, -26, -6, -23, -18, -12, -76, -72, -20, -11, -11, -46, -26, -43, -38, -32, -96, -46, -34, -29, -98, -24, -45};
    }

    static {
        A08();
        A0H = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.mm
            @Override // com.facebook.ads.redexgen.core.HD
            public final com.facebook.ads.redexgen.core.H9[] A5N() {
                return com.facebook.ads.redexgen.core.C1980ml.A0F();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
                return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
            }
        };
        A0L = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0M = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0J = com.facebook.ads.redexgen.core.C5C.A1G(A05(12, 6, 14));
        A0K = com.facebook.ads.redexgen.core.C5C.A1G(A05(18, 9, 81));
        A0I = A0M[8];
    }

    public C1980ml() {
        this(0);
    }

    public C1980ml(int i) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = new byte[1];
        this.A02 = -1;
    }

    private int A00(int i) throws com.facebook.ads.redexgen.core.C3K {
        if (!A0B(i)) {
            throw com.facebook.ads.redexgen.core.C3K.A01(A05(53, 12, 124) + (this.A0C ? A05(105, 2, 47) : A05(103, 2, 51)) + A05(0, 12, 22) + i, null);
        }
        boolean z = this.A0C;
        if (A0G[4].length() != 23) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[3] = "XAVUjCRC3hebivW774juK0oqwk2i4xqh";
        strArr[7] = "ZJ3GnAAJbhmZqGnHED8y3IWqixRJo44l";
        return z ? A0M[i] : A0L[i];
    }

    public static int A01(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    private int A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        interfaceC1987ms.AIl();
        interfaceC1987ms.AGt(this.A0E, 0, 1);
        byte b = this.A0E[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A05(65, 38, 119) + ((int) b), null);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int A03(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A02(interfaceC1987ms);
                this.A00 = this.A01;
                if (this.A02 == -1) {
                    this.A05 = interfaceC1987ms.A8n();
                    this.A02 = this.A01;
                }
                if (this.A02 == this.A01) {
                    this.A03++;
                }
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int AIp = this.A09.AIp(interfaceC1987ms, this.A00, true);
        if (AIp == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AIp;
        if (A0G[5].charAt(6) != 'S') {
            throw new java.lang.RuntimeException();
        }
        A0G[4] = "CzfhB3PuIPzemLKFV0N6DKx";
        if (this.A00 > 0) {
            return 0;
        }
        this.A09.AIu(this.A06 + this.A04, 1, this.A01, 0, null);
        this.A04 += 20000;
        return 0;
    }

    private com.facebook.ads.redexgen.core.C1991mx A04(long j, boolean z) {
        return new com.facebook.ads.redexgen.core.C1991mx(j, this.A05, A01(this.A02, 20000L), this.A02, z);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A06() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A09);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private void A07() {
        if (!this.A0A) {
            this.A0A = true;
            java.lang.String mimeType = this.A0C ? A05(117, 12, 26) : A05(107, 10, 46);
            this.A09.A6e(new com.facebook.ads.redexgen.core.C03872p().A11(mimeType).A0h(A0I).A0b(1).A0m(this.A0C ? 16000 : 8000).A14());
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void A09(long j, int i) {
        if (this.A0B) {
            return;
        }
        if ((this.A0D & 1) == 0 || j == -1 || (this.A02 != -1 && this.A02 != this.A01)) {
            this.A08 = new com.facebook.ads.redexgen.core.C1982mn(-9223372036854775807L);
            this.A07.AJ7(this.A08);
            this.A0B = true;
        } else {
            if (this.A03 < 20 && i != -1) {
                return;
            }
            this.A08 = A04(j, (this.A0D & 2) != 0);
            this.A07.AJ7(this.A08);
            this.A0B = true;
        }
    }

    private boolean A0A(int i) {
        return !this.A0C && (i < 12 || i > 14);
    }

    private boolean A0B(int i) {
        return i >= 0 && i <= 15 && (A0C(i) || A0A(i));
    }

    private boolean A0C(int i) {
        return this.A0C && (i < 10 || i > 13);
    }

    private boolean A0D(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (A0E(interfaceC1987ms, A0J)) {
            this.A0C = false;
            interfaceC1987ms.AK3(A0J.length);
            return true;
        }
        if (!A0E(interfaceC1987ms, A0K)) {
            return false;
        }
        this.A0C = true;
        interfaceC1987ms.AK3(A0K.length);
        return true;
    }

    public static boolean A0E(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, byte[] bArr) throws java.io.IOException {
        interfaceC1987ms.AIl();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC1987ms.AGt(bArr2, 0, bArr.length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A0F() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1980ml()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A07 = ha;
        this.A09 = ha.AKS(0, 1);
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        A06();
        if (interfaceC1987ms.A8n() != 0 || A0D(interfaceC1987ms)) {
            A07();
            int A03 = A03(interfaceC1987ms);
            A09(interfaceC1987ms.A8O(), A03);
            return A03;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A05(27, 26, 87), null);
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        if (j != 0) {
            boolean z = this.A08 instanceof com.facebook.ads.redexgen.core.C1991mx;
            if (A0G[1].charAt(14) != '4') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0G;
            strArr[3] = "NQLxubHlf0cB1xHoee3lgwNqGMjiyHKA";
            strArr[7] = "Tv4bI2EMm7rGcVq8cNVXYB9qzgEcyYlQ";
            if (z) {
                this.A06 = ((com.facebook.ads.redexgen.core.C1991mx) this.A08).A02(j);
                return;
            }
        }
        this.A06 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        return A0D(interfaceC1987ms);
    }
}
