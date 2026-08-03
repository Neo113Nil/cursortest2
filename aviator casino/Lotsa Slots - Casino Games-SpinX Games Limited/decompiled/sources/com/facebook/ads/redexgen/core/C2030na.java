package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2030na implements com.facebook.ads.redexgen.core.InterfaceC0743Hd {
    public static byte[] A0Y;
    public static java.lang.String[] A0Z = {"85R60pw", "bhfqNyhgsMMcgxDZV18ZYvPWnAETveJ8", "tBTQ49uE8lCvjdowyQOxeOaVlddkkQsD", "cRYvTCVhA9B6pxggP4HMUODB0FrVm2He", "qWsUB7mYWdY8z", "PljQg4leV4XdGi9pMhsrxdm25IT3iHNc", "UH2NGYtrpmiPe", "fmnhpkR"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public android.net.Uri A0A;
    public com.facebook.ads.redexgen.core.C2196qI A0B;
    public com.facebook.ads.redexgen.core.C2196qI A0C;
    public com.facebook.ads.redexgen.core.C2196qI A0D;
    public com.facebook.ads.redexgen.core.InterfaceC05629s A0E;
    public com.facebook.ads.redexgen.core.DP A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final com.facebook.ads.redexgen.core.A1 A0T;
    public final com.facebook.ads.redexgen.core.A6 A0U;
    public final com.facebook.ads.redexgen.core.DL A0V;
    public final com.facebook.ads.redexgen.core.DN A0W = new com.facebook.ads.redexgen.core.DN();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public com.facebook.ads.redexgen.core.C0741Hb[] A0S = new com.facebook.ads.redexgen.core.C0741Hb[this.A01];
    public final com.facebook.ads.redexgen.core.C0641De<com.facebook.ads.redexgen.core.DO> A0X = new com.facebook.ads.redexgen.core.C0641De<>(new com.facebook.ads.redexgen.core.AnonymousClass49() { // from class: com.facebook.ads.redexgen.X.nb
        @Override // com.facebook.ads.redexgen.core.AnonymousClass49
        public final void A39(java.lang.Object obj) {
            ((com.facebook.ads.redexgen.core.DO) obj).A01.AHb();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(com.facebook.ads.redexgen.core.C04996z c04996z, com.facebook.ads.redexgen.core.C2117p0 c2117p0, boolean z, boolean z2, com.facebook.ads.redexgen.core.DN dn) {
        c2117p0.A04 = false;
        if (!A0K()) {
            if (!z2 && !this.A0G) {
                if (this.A0D == null || (!z && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0D), c04996z);
                return -5;
            }
            c2117p0.A02(4);
            return -4;
        }
        com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A0X.A01(A0O()).A00;
        if (z || c2196qI != this.A0B) {
            A0H(c2196qI, c04996z);
            return -5;
        }
        int A00 = A00(this.A03);
        if (!A0L(A00)) {
            c2117p0.A04 = true;
            return -3;
        }
        c2117p0.A02(this.A0N[A00]);
        c2117p0.A01 = this.A0R[A00];
        if (c2117p0.A01 < this.A09) {
            c2117p0.A00(Integer.MIN_VALUE);
        }
        dn.A00 = this.A0O[A00];
        dn.A01 = this.A0Q[A00];
        dn.A02 = this.A0S[A00];
        return -4;
    }

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0Y, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0E() {
        A0Y = new byte[]{35, 74, 57, 70, 70, kotlin.io.encoding.Base64.padSymbol, 56, kotlin.io.encoding.Base64.padSymbol, 66, 59, -12, 73, 66, 57, 76, 68, 57, 55, 72, 57, 56, -12, 66, 67, 66, 1, 71, 77, 66, 55, -12, 71, 53, 65, 68, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 57, -12, 58, 67, 70, -12, 58, 67, 70, 65, 53, 72, com.google.common.base.Ascii.SO, -12, -62, -48, -36, -33, -37, -44, -64, -28, -44, -28, -44};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j, int i, long j2, int i2, com.facebook.ads.redexgen.core.C0741Hb c0741Hb) {
        if (this.A02 > 0) {
            int A00 = A00(this.A02 - 1);
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A0Q[A00] + ((long) this.A0O[A00]) <= j2);
        }
        this.A0G = (536870912 & i) != 0;
        this.A07 = java.lang.Math.max(this.A07, j);
        int A002 = A00(this.A02);
        this.A0R[A002] = j;
        this.A0Q[A002] = j2;
        this.A0O[A002] = i2;
        this.A0N[A002] = i;
        this.A0S[A002] = c0741Hb;
        this.A0P[A002] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new com.facebook.ads.redexgen.core.DO((com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0D), this.A0U != null ? this.A0U.AH3(this.A0T, this.A0D) : com.facebook.ads.redexgen.core.A5.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            com.facebook.ads.redexgen.core.C0741Hb[] c0741HbArr = new com.facebook.ads.redexgen.core.C0741Hb[i3];
            int i4 = this.A01 - this.A04;
            java.lang.System.arraycopy(this.A0Q, this.A04, jArr, 0, i4);
            java.lang.System.arraycopy(this.A0R, this.A04, jArr2, 0, i4);
            java.lang.System.arraycopy(this.A0N, this.A04, iArr2, 0, i4);
            java.lang.System.arraycopy(this.A0O, this.A04, iArr3, 0, i4);
            java.lang.System.arraycopy(this.A0S, this.A04, c0741HbArr, 0, i4);
            java.lang.System.arraycopy(this.A0P, this.A04, iArr, 0, i4);
            int i5 = this.A04;
            java.lang.System.arraycopy(this.A0Q, 0, jArr, i4, i5);
            java.lang.System.arraycopy(this.A0R, 0, jArr2, i4, i5);
            java.lang.System.arraycopy(this.A0N, 0, iArr2, i4, i5);
            java.lang.System.arraycopy(this.A0O, 0, iArr3, i4, i5);
            java.lang.System.arraycopy(this.A0S, 0, c0741HbArr, i4, i5);
            java.lang.System.arraycopy(this.A0P, 0, iArr, i4, i5);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c0741HbArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i3;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final /* synthetic */ int AIp(com.facebook.ads.redexgen.core.InterfaceC03762c interfaceC03762c, int i, boolean z) {
        return com.facebook.ads.redexgen.core.AbstractC0740Ha.A00(this, interfaceC03762c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final /* synthetic */ void AIr(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        com.facebook.ads.redexgen.core.AbstractC0740Ha.A01(this, c04434v, i);
    }

    static {
        A0E();
    }

    public C2030na(com.facebook.ads.redexgen.core.F0 f0, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.A1 a1) {
        this.A0U = a6;
        this.A0T = a1;
        this.A0V = new com.facebook.ads.redexgen.core.DL(f0);
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int relativeIndex = this.A01;
        if (i2 < relativeIndex) {
            return i2;
        }
        int relativeIndex2 = this.A01;
        return i2 - relativeIndex2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if ((r0 & 1) != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.A0R[i] <= j; i4++) {
            if (z) {
                int sampleCountToTarget = this.A0N[i];
            }
            i3 = i4;
            if (this.A0R[i] == j) {
                break;
            }
            i++;
            int sampleCountToTarget2 = this.A01;
            if (i == sampleCountToTarget2) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(long j) {
        int i = this.A02;
        int count = this.A02;
        int A00 = A00(count - 1);
        while (i > count && this.A0R[A00] >= j) {
            i--;
            A00--;
            if (A00 == -1) {
                int i2 = this.A01;
                java.lang.String[] strArr = A0Z;
                java.lang.String str = strArr[5];
                java.lang.String str2 = strArr[2];
                int relativeSampleIndex = str.charAt(3);
                int count2 = str2.charAt(3);
                if (relativeSampleIndex != count2) {
                    throw new java.lang.RuntimeException();
                }
                A0Z[1] = "AmG8zl9kQR5zaFQB0ENdPerRnzM6g9Ua";
                A00 = i2 - 1;
            }
        }
        return i;
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return java.lang.Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i) {
        this.A06 = java.lang.Math.max(this.A06, A08(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i2 = relativeLastDiscardIndex - 1;
            long j = this.A0Q[i2];
            int relativeLastDiscardIndex2 = this.A0O[i2];
            return j + relativeLastDiscardIndex2;
        }
        return this.A0Q[this.A04];
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A07(int i) {
        boolean z;
        int discardCount;
        int A0P = A0P() - i;
        boolean z2 = false;
        if (A0P >= 0) {
            int i2 = this.A02;
            int discardCount2 = this.A03;
            if (A0P <= i2 - discardCount2) {
                z = true;
                com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
                int discardCount3 = this.A02;
                this.A02 = discardCount3 - A0P;
                long j = this.A06;
                int discardCount4 = this.A02;
                this.A07 = java.lang.Math.max(j, A08(discardCount4));
                if (A0P == 0) {
                    boolean z3 = this.A0G;
                    java.lang.String[] strArr = A0Z;
                    java.lang.String str = strArr[0];
                    java.lang.String str2 = strArr[7];
                    int length = str.length();
                    int discardCount5 = str2.length();
                    if (length != discardCount5) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0Z;
                    strArr2[4] = "9q2py6RZjKVKU";
                    strArr2[6] = "N5i42TN5jvK54";
                    if (z3) {
                        z2 = true;
                    }
                }
                this.A0G = z2;
                this.A0X.A03(i);
                discardCount = this.A02;
                if (discardCount == 0) {
                    int discardCount6 = this.A02;
                    int relativeLastWriteIndex = A00(discardCount6 - 1);
                    long j2 = this.A0Q[relativeLastWriteIndex];
                    int discardCount7 = this.A0O[relativeLastWriteIndex];
                    return j2 + discardCount7;
                }
                return 0L;
            }
        }
        z = false;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        int discardCount32 = this.A02;
        this.A02 = discardCount32 - A0P;
        long j3 = this.A06;
        int discardCount42 = this.A02;
        this.A07 = java.lang.Math.max(j3, A08(discardCount42));
        if (A0P == 0) {
        }
        this.A0G = z2;
        this.A0X.A03(i);
        discardCount = this.A02;
        if (discardCount == 0) {
        }
    }

    private long A08(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long j = Long.MIN_VALUE;
        int A00 = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = java.lang.Math.max(j, this.A0R[A00]);
            int i3 = this.A0N[A00];
            if ((i3 & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        return j;
    }

    private synchronized long A09(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0R[this.A04]) {
            int A01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (A01 == -1) {
                return -1L;
            }
            return A06(A01);
        }
        return -1L;
    }

    private final com.facebook.ads.redexgen.core.C2196qI A0A(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (this.A08 != 0 && c2196qI.A0M != Long.MAX_VALUE) {
            return c2196qI.A07().A0s(c2196qI.A0M + this.A08).A14();
        }
        return c2196qI;
    }

    public static com.facebook.ads.redexgen.core.C2030na A0B(com.facebook.ads.redexgen.core.F0 f0, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.A1 a1) {
        return new com.facebook.ads.redexgen.core.C2030na(f0, (com.facebook.ads.redexgen.core.A6) com.facebook.ads.redexgen.core.AbstractC04203y.A01(a6), (com.facebook.ads.redexgen.core.A1) com.facebook.ads.redexgen.core.AbstractC04203y.A01(a1));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AHc(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C04996z c04996z) {
        com.facebook.ads.redexgen.core.C2196qI c2196qI2;
        boolean z = this.A0B == null;
        com.facebook.ads.androidx.media3.common.DrmInitData newDrmInitData = z ? null : this.A0B.A0O;
        this.A0B = c2196qI;
        com.facebook.ads.androidx.media3.common.DrmInitData oldDrmInitData = c2196qI.A0O;
        if (this.A0U != null) {
            c2196qI2 = c2196qI.A08(this.A0U.A7W(c2196qI));
        } else {
            c2196qI2 = c2196qI;
        }
        c04996z.A00 = c2196qI2;
        c04996z.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z) {
            boolean A1E = com.facebook.ads.redexgen.core.C5C.A1E(newDrmInitData, oldDrmInitData);
            java.lang.String[] strArr = A0Z;
            if (strArr[5].charAt(3) != strArr[2].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Z;
            strArr2[5] = "kvzQNhfSOapIkFZHH0bucpMR2mlOE4Ro";
            strArr2[2] = "pNWQqJuQrvmashmvXYzFnQ0x9nljUjVN";
            if (A1E) {
                return;
            }
        }
        if (android.os.Looper.myLooper() == null) {
            return;
        }
        com.facebook.ads.redexgen.core.InterfaceC05629s interfaceC05629s = this.A0E;
        this.A0E = this.A0U.A3C(this.A0T, c2196qI);
        c04996z.A01 = this.A0E;
        if (interfaceC05629s != null) {
            interfaceC05629s.AHc(this.A0T);
        }
    }

    private final void A0J(boolean z) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z) {
            this.A0C = null;
            this.A0D = null;
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i) {
        return this.A0E == null || this.A0E.A9A() == 4 || ((this.A0N[i] & 1073741824) == 0 && this.A0E.AH1());
    }

    private synchronized boolean A0M(long j) {
        boolean z = true;
        if (this.A02 == 0) {
            if (j <= this.A06) {
                z = false;
            }
            return z;
        }
        if (A05() >= j) {
            return false;
        }
        int A02 = A02(j);
        int retainCount = this.A00;
        A07(retainCount + A02);
        return true;
    }

    private synchronized boolean A0N(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        this.A0L = false;
        if (com.facebook.ads.redexgen.core.C5C.A1E(c2196qI, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(c2196qI)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = c2196qI;
        }
        this.A0J = com.facebook.ads.redexgen.core.C3J.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j, boolean z) {
        int A00 = A00(this.A03);
        if (A0K() && j >= this.A0R[A00]) {
            if (j > this.A07 && z) {
                int i = this.A02;
                int relativeReadIndex = this.A03;
                return i - relativeReadIndex;
            }
            int i2 = this.A02;
            int relativeReadIndex2 = this.A03;
            int offset = A01(A00, i2 - relativeReadIndex2, j, true);
            if (offset == -1) {
                return 0;
            }
            return offset;
        }
        return 0;
    }

    public final int A0R(com.facebook.ads.redexgen.core.C04996z c04996z, com.facebook.ads.redexgen.core.C2117p0 c2117p0, int i, boolean z) {
        int A03 = A03(c04996z, c2117p0, (i & 2) != 0, z, this.A0W);
        if (A03 == -4 && !c2117p0.A05()) {
            int result = i & 1;
            boolean z2 = result != 0;
            int result2 = i & 4;
            if (result2 == 0) {
                if (z2) {
                    this.A0V.A0E(c2117p0, this.A0W);
                } else {
                    this.A0V.A0F(c2117p0, this.A0W);
                }
            }
            if (!z2) {
                int result3 = this.A03;
                this.A03 = result3 + 1;
            }
        }
        return A03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized com.facebook.ads.redexgen.core.C2196qI A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws java.io.IOException {
        if (this.A0E == null || this.A0E.A9A() != 1) {
        } else {
            throw ((com.facebook.ads.redexgen.core.C05609q) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0E.A80()));
        }
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    public final synchronized void A0a(int i) {
        boolean z;
        if (i >= 0) {
            if (this.A03 + i <= this.A02) {
                z = true;
                com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
                this.A03 += i;
            }
        }
        z = false;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        this.A03 += i;
    }

    public final void A0b(long j) {
        this.A09 = j;
    }

    public final void A0c(long j, boolean z, boolean z2) {
        this.A0V.A0C(A09(j, z, z2));
    }

    public final void A0d(com.facebook.ads.redexgen.core.DP dp) {
        this.A0F = dp;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j, boolean z) {
        A0F();
        int A00 = A00(this.A03);
        if (!A0K() || j < this.A0R[A00] || (j > this.A07 && !z)) {
            return false;
        }
        int i = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(A00, i - relativeReadIndex, j, true);
        if (offset == -1) {
            return false;
        }
        this.A09 = j;
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return true;
    }

    public final synchronized boolean A0g(boolean z) {
        boolean z2 = true;
        if (!A0K()) {
            if (!z && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z2 = false;
            }
            return z2;
        }
        if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        }
        return A0L(A00(this.A03));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void A6e(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        com.facebook.ads.redexgen.core.C2196qI A0A = A0A(c2196qI);
        this.A0K = false;
        this.A0C = c2196qI;
        boolean upstreamFormatChanged = A0N(A0A);
        if (this.A0F != null && upstreamFormatChanged) {
            this.A0F.AGL(A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final int AIq(com.facebook.ads.redexgen.core.InterfaceC03762c interfaceC03762c, int i, boolean z, int i2) throws java.io.IOException {
        return this.A0V.A08(interfaceC03762c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void AIs(com.facebook.ads.redexgen.core.C04434v c04434v, int i, int i2) {
        this.A0V.A0D(c04434v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    public final void AIu(long j, int i, int i2, int flags, com.facebook.ads.redexgen.core.C0741Hb c0741Hb) {
        int i3 = i;
        if (this.A0K) {
            A6e((com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A0C));
        }
        boolean z = (i3 & 1) != 0;
        if (this.A0M) {
            if (!z) {
                return;
            } else {
                this.A0M = false;
            }
        }
        long j2 = j + this.A08;
        if (this.A0J) {
            if (j2 < this.A09) {
                return;
            }
            if ((i3 & 1) == 0) {
                if (!this.A0H) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0C(50, 11, 13), A0C(0, 50, 114) + this.A0D);
                    this.A0H = true;
                }
                i3 |= 1;
            }
        }
        if (this.A0I) {
            if (z) {
                boolean A0M = A0M(j2);
                java.lang.String[] strArr = A0Z;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[7];
                int length = str.length();
                int flags2 = str2.length();
                if (length == flags2) {
                    A0Z[3] = "Q9ljdKDjpshc47nqlMYBFO0YDotnOqX8";
                    if (!A0M) {
                        return;
                    } else {
                        this.A0I = false;
                    }
                }
                throw new java.lang.RuntimeException();
            }
            return;
        }
        long A09 = this.A0V.A09();
        if (A0Z[1].charAt(24) == 'n') {
            A0Z[3] = "281h4YOhy96mUgaRFHojQOWi7hgLUzVm";
            A0G(j2, i3, (A09 - i2) - flags, i2, c0741Hb);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0743Hd
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AKf(android.net.Uri uri) {
        this.A0A = uri;
    }
}
