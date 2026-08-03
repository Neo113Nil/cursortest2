package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1910lR implements com.facebook.ads.redexgen.core.H9 {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final com.facebook.ads.redexgen.core.HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public com.facebook.ads.redexgen.core.HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final com.facebook.ads.redexgen.core.C04424u A08;
    public final com.facebook.ads.redexgen.core.C04434v A09;
    public final com.facebook.ads.redexgen.core.C04434v A0A;
    public final com.facebook.ads.redexgen.core.C1909lQ A0B;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{39, com.google.common.base.Ascii.VT, 6, com.google.common.base.Ascii.FF, 5, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 74, 43, 46, 62, 57, 74, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 7};
    }

    static {
        A04();
        A0E = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.facebook.ads.redexgen.core.HD
            public final com.facebook.ads.redexgen.core.H9[] A5N() {
                return com.facebook.ads.redexgen.core.C1910lR.A07();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
                return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
            }
        };
    }

    public C1910lR() {
        this(0);
    }

    public C1910lR(int i) {
        this.A07 = (i & 2) != 0 ? i | 1 : i;
        this.A0B = new com.facebook.ads.redexgen.core.C1909lQ(true);
        this.A09 = new com.facebook.ads.redexgen.core.C04434v(2048);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new com.facebook.ads.redexgen.core.C04434v(10);
        this.A08 = new com.facebook.ads.redexgen.core.C04424u(this.A0A.A0l());
    }

    public static int A00(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    private int A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        int i = 0;
        while (true) {
            interfaceC1987ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i += firstFramePosition;
            interfaceC1987ms.A47(length);
        }
        interfaceC1987ms.AIl();
        interfaceC1987ms.A47(i);
        if (this.A01 == -1) {
            this.A01 = i;
        }
        return i;
    }

    private com.facebook.ads.redexgen.core.C1991mx A02(long j, boolean z) {
        return new com.facebook.ads.redexgen.core.C1991mx(j, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void A05(long j, boolean z) {
        if (this.A05) {
            return;
        }
        boolean z2 = (this.A07 & 1) != 0 && this.A00 > 0;
        java.lang.String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z2 && this.A0B.A0J() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.A0B.A0J() == -9223372036854775807L) {
            this.A03.AJ7(new com.facebook.ads.redexgen.core.C1982mn(-9223372036854775807L));
        } else {
            this.A03.AJ7(A02(j, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    private void A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC1987ms.AIl();
        if (interfaceC1987ms.A8n() == 0) {
            A01(interfaceC1987ms);
        }
        int currentFrameSize = 0;
        long j = 0;
        while (true) {
            try {
                if (!interfaceC1987ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (com.facebook.ads.redexgen.core.C1909lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC1987ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    int A04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (A04 > 6) {
                            j += A04;
                            currentFrameSize++;
                            if (currentFrameSize == 1000 || !interfaceC1987ms.A48(A04 - 6, true)) {
                                break;
                            }
                        } else {
                            this.A04 = true;
                            throw com.facebook.ads.redexgen.core.C3K.A01(A03(0, 21, 88), null);
                        }
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (java.io.EOFException unused) {
            }
        }
        interfaceC1987ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j / currentFrameSize);
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A07() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1910lR()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A03 = ha;
        this.A0B.A5c(ha, new com.facebook.ads.redexgen.core.LG(0, 1));
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A03);
        long A8O = interfaceC1987ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || A8O == -1)) ? false : true) {
            A06(interfaceC1987ms);
        }
        int bytesRead = interfaceC1987ms.read(this.A09.A0l(), 0, 2048);
        boolean z = bytesRead == -1;
        A05(A8O, z);
        if (z) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        int headerPosition;
        int A01 = A01(interfaceC1987ms);
        int i = A01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC1987ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!com.facebook.ads.redexgen.core.C1909lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i++;
                interfaceC1987ms.AIl();
                interfaceC1987ms.A47(i);
            } else {
                syncBytes++;
                java.lang.String[] strArr = A0D;
                java.lang.String str = strArr[2];
                java.lang.String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new java.lang.RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC1987ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                com.facebook.ads.redexgen.core.C04424u c04424u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new java.lang.RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c04424u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i++;
                    interfaceC1987ms.AIl();
                    interfaceC1987ms.A47(i);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC1987ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i - A01;
        } while (headerPosition < 8192);
        return false;
    }
}
