package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("DoNotStrip")
/* renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1961mG implements com.facebook.ads.redexgen.core.H9 {
    public static byte[] A0K;
    public static java.lang.String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final com.facebook.ads.redexgen.core.HD A0M;
    public static final com.facebook.ads.redexgen.core.IE A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public com.facebook.ads.androidx.media3.common.Metadata A06;
    public com.facebook.ads.redexgen.core.HA A07;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A08;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A09;
    public com.facebook.ads.redexgen.core.InterfaceC1960mF A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final com.facebook.ads.redexgen.core.C04434v A0F;
    public final com.facebook.ads.redexgen.core.HK A0G;
    public final com.facebook.ads.redexgen.core.HM A0H;
    public final com.facebook.ads.redexgen.core.HN A0I;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd A0J;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, Byte.MAX_VALUE, -45, -50, -50, Byte.MAX_VALUE, -52, -64, -51, -40, Byte.MAX_VALUE, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.mI
            @Override // com.facebook.ads.redexgen.core.HD
            public final com.facebook.ads.redexgen.core.H9[] A5N() {
                return com.facebook.ads.redexgen.core.C1961mG.A0G();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
                return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
            }
        };
        A0N = new com.facebook.ads.redexgen.core.IE() { // from class: com.facebook.ads.redexgen.X.mH
            @Override // com.facebook.ads.redexgen.core.IE
            public final boolean A6Q(int i, int i2, int i3, int i4, int i5) {
                return com.facebook.ads.redexgen.core.C1961mG.A0C(i, i2, i3, i4, i5);
            }
        };
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("DoNotStrip")
    public C1961mG() {
        this(0);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("DoNotStrip")
    public C1961mG(int i) {
        this(i, -9223372036854775807L);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("DoNotStrip")
    public C1961mG(int i, long j) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j;
        this.A0F = new com.facebook.ads.redexgen.core.C04434v(10);
        this.A0I = new com.facebook.ads.redexgen.core.HN();
        this.A0G = new com.facebook.ads.redexgen.core.HK();
        this.A02 = -9223372036854775807L;
        this.A0H = new com.facebook.ads.redexgen.core.HM();
        this.A0J = new com.facebook.ads.redexgen.core.C1988mt();
        this.A08 = this.A0J;
    }

    public static int A00(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        if (c04434v.A0A() >= i + 4) {
            c04434v.A0f(i);
            if (A0L[5].charAt(24) == 'i') {
                throw new java.lang.RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int A0C = c04434v.A0C();
            if (A0C == 1483304551 || A0C == 1231971951) {
                return A0C;
            }
        }
        if (c04434v.A0A() >= 40) {
            c04434v.A0f(36);
            return c04434v.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC1987ms, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC1987ms);
            this.A07.AJ7(this.A0A);
            this.A08.A6e(new com.facebook.ads.redexgen.core.C03872p().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC1987ms.A8n();
        } else if (this.A03 != 0) {
            long A8n = interfaceC1987ms.A8n();
            if (A8n < this.A03) {
                interfaceC1987ms.AK3((int) (this.A03 - A8n));
            }
        }
        return A02(interfaceC1987ms);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (this.A00 == 0) {
            interfaceC1987ms.AIl();
            if (A0E(interfaceC1987ms)) {
                return -1;
            }
            this.A0F.A0f(0);
            int A0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(A0C, sampleHeaderData)) {
                int sampleHeaderData2 = com.facebook.ads.redexgen.core.HO.A00(A0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(A0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A9H(interfaceC1987ms.A8n());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A9H(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof com.facebook.ads.redexgen.core.C05278b) {
                        com.facebook.ads.redexgen.core.C05278b c05278b = (com.facebook.ads.redexgen.core.C05278b) this.A0A;
                        long j = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long A03 = A03(j + sampleHeaderData4);
                        long A8n = interfaceC1987ms.A8n();
                        int sampleHeaderData5 = this.A0I.A02;
                        c05278b.A01(A03, A8n + sampleHeaderData5);
                        if (this.A0C && c05278b.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC1987ms.AK3(1);
            this.A01 = 0;
            return 0;
        }
        int AIp = this.A08.AIp(interfaceC1987ms, this.A00, true);
        if (AIp == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AIp;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIu(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new java.lang.RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j2 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j2 + bytesAppended3;
        this.A00 = 0;
        return 0;
    }

    private long A03(long j) {
        return this.A02 + ((1000000 * j) / this.A0I.A03);
    }

    public static long A04(com.facebook.ads.androidx.media3.common.Metadata metadata) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                com.facebook.ads.androidx.media3.common.Metadata.Entry A03 = metadata.A03(i);
                if ((A03 instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame) && ((com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame) ((com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame) A03)).A00.equals(A09(24, 4, 101))) {
                    return com.facebook.ads.redexgen.core.C5C.A0O(java.lang.Long.parseLong(((com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame) A03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private com.facebook.ads.redexgen.core.C05348i A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, boolean z) throws java.io.IOException {
        interfaceC1987ms.AGt(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new com.facebook.ads.redexgen.core.C05348i(interfaceC1987ms.A8O(), interfaceC1987ms.A8n(), this.A0I, z);
    }

    public static com.facebook.ads.redexgen.core.C8X A06(com.facebook.ads.androidx.media3.common.Metadata metadata, long j) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                com.facebook.ads.androidx.media3.common.Metadata.Entry entry = metadata.A03(i);
                if (entry instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame) {
                    return com.facebook.ads.redexgen.core.C8X.A01(j, (com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.facebook.ads.redexgen.core.InterfaceC1960mF A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        long durationUs;
        com.facebook.ads.redexgen.core.InterfaceC1960mF A08 = A08(interfaceC1987ms);
        com.facebook.ads.redexgen.core.InterfaceC1960mF seekFrameSeeker = A06(this.A06, interfaceC1987ms.A8n());
        if (this.A0B) {
            return new com.facebook.ads.redexgen.core.C8W();
        }
        com.facebook.ads.redexgen.core.InterfaceC1960mF interfaceC1960mF = null;
        if ((this.A0D & 4) != 0) {
            long j = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7t();
                j = seekFrameSeeker.A7j();
            } else if (A08 != null) {
                durationUs = A08.A7t();
                j = A08.A7j();
            } else {
                durationUs = A04(this.A06);
            }
            interfaceC1960mF = new com.facebook.ads.redexgen.core.C05278b(durationUs, interfaceC1987ms.A8n(), j);
        } else if (seekFrameSeeker != null) {
            interfaceC1960mF = seekFrameSeeker;
        } else if (A08 != null) {
            interfaceC1960mF = A08;
        }
        boolean z = true;
        java.lang.String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (interfaceC1960mF == null || (!interfaceC1960mF.AAj() && (this.A0D & 1) != 0)) {
            int i = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                java.lang.String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
            }
            return A05(interfaceC1987ms, z);
        }
        return interfaceC1960mF;
    }

    private com.facebook.ads.redexgen.core.InterfaceC1960mF A08(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(this.A0I.A02);
        interfaceC1987ms.AGt(c04434v.A0l(), 0, this.A0I.A02);
        int i = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i = 13;
        }
        int A00 = A00(c04434v, i);
        if (A00 == 1483304551 || A00 == 1231971951) {
            com.facebook.ads.redexgen.core.C8U A01 = com.facebook.ads.redexgen.core.C8U.A01(interfaceC1987ms.A8O(), interfaceC1987ms.A8n(), this.A0I, c04434v);
            if (A01 != null && !this.A0G.A03()) {
                interfaceC1987ms.AIl();
                interfaceC1987ms.A47(i + 141);
                com.facebook.ads.redexgen.core.C04434v frame = this.A0F;
                interfaceC1987ms.AGt(frame.A0l(), 0, 3);
                com.facebook.ads.redexgen.core.C04434v frame2 = this.A0F;
                frame2.A0f(0);
                com.facebook.ads.redexgen.core.HK hk = this.A0G;
                com.facebook.ads.redexgen.core.C04434v frame3 = this.A0F;
                hk.A04(frame3.A0K());
            }
            interfaceC1987ms.AK3(this.A0I.A02);
            if (A01 != null && !A01.AAj() && A00 == 1231971951) {
                com.facebook.ads.redexgen.core.C05348i A05 = A05(interfaceC1987ms, false);
                java.lang.String[] strArr = A0L;
                java.lang.String str = strArr[7];
                java.lang.String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return A05;
            }
            return A01;
        }
        if (A00 == 1447187017) {
            com.facebook.ads.redexgen.core.C8V A002 = com.facebook.ads.redexgen.core.C8V.A00(interfaceC1987ms.A8O(), interfaceC1987ms.A8n(), this.A0I, c04434v);
            interfaceC1987ms.AK3(this.A0I.A02);
            return A002;
        }
        interfaceC1987ms.AIl();
        return null;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i3 != 76 || i4 != 76 || (i5 != 84 && i != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    private boolean A0E(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        if (this.A0A != null) {
            long A7j = this.A0A.A7j();
            if (A7j != -1) {
                long dataEndPosition = interfaceC1987ms.A8i();
                if (dataEndPosition > A7j - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC1987ms.AGu(this.A0F.A0l(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private boolean A0F(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, boolean z) throws java.io.IOException {
        int candidateSynchronizedHeaderData;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int searchedBytes = 0;
        int headerData = z ? 32768 : 131072;
        interfaceC1987ms.AIl();
        if (interfaceC1987ms.A8n() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC1987ms, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            i3 = (int) interfaceC1987ms.A8i();
            if (!z) {
                interfaceC1987ms.AK3(i3);
            }
        }
        while (true) {
            if (A0E(interfaceC1987ms)) {
                if (i <= 0) {
                    throw new java.io.EOFException();
                }
            } else {
                this.A0F.A0f(0);
                int A0C = this.A0F.A0C();
                if ((i2 != 0 && !A0D(A0C, i2)) || (candidateSynchronizedHeaderData = com.facebook.ads.redexgen.core.HO.A00(A0C)) == -1) {
                    int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                    if (searchedBytes == headerData) {
                        if (z) {
                            return false;
                        }
                        throw com.facebook.ads.redexgen.core.C3K.A01(A09(0, 24, 51), null);
                    }
                    i = 0;
                    i2 = 0;
                    if (z) {
                        interfaceC1987ms.AIl();
                        int validFrameCount3 = i3 + candidateSynchronizedHeaderData2;
                        interfaceC1987ms.A47(validFrameCount3);
                    } else {
                        interfaceC1987ms.AK3(1);
                    }
                    searchedBytes = candidateSynchronizedHeaderData2;
                } else {
                    i++;
                    if (i == 1) {
                        this.A0I.A00(A0C);
                        i2 = A0C;
                    } else if (i == 4) {
                        break;
                    }
                    int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                    interfaceC1987ms.A47(validFrameCount4);
                }
            }
        }
        if (z) {
            interfaceC1987ms.AK3(i3 + searchedBytes);
        } else {
            interfaceC1987ms.AIl();
        }
        this.A01 = i2;
        if (A0L[5].charAt(24) == 105) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A0G() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1961mG()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A07 = ha;
        this.A09 = this.A07.AKS(0, 1);
        this.A08 = this.A09;
        this.A07.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        A0A();
        int A01 = A01(interfaceC1987ms);
        if (A01 == -1 && (this.A0A instanceof com.facebook.ads.redexgen.core.C05278b)) {
            long A03 = A03(this.A04);
            long durationUs = this.A0A.A7t();
            if (durationUs != A03) {
                ((com.facebook.ads.redexgen.core.C05278b) this.A0A).A00(A03);
                this.A07.AJ7(this.A0A);
            }
        }
        return A01;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j2;
        if ((this.A0A instanceof com.facebook.ads.redexgen.core.C05278b) && !((com.facebook.ads.redexgen.core.C05278b) this.A0A).A02(j2)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        return A0F(interfaceC1987ms, true);
    }
}
