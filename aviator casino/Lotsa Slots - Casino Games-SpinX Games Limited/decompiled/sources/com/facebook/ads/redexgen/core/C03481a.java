package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03481a extends com.facebook.ads.redexgen.core.AbstractC05559j {
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public com.facebook.ads.redexgen.core.C9l A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.EU> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A0F;
    public final com.facebook.ads.redexgen.core.F6 A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C03481a(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") com.facebook.ads.redexgen.core.C2159pg c2159pg, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i, com.facebook.ads.redexgen.core.F6 f6, int i2, long j, long j2, long j3, int i3, int i4, float f, float f2, long j4, java.util.List<com.facebook.ads.redexgen.core.EU> list, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45) {
        super(c2159pg, iArr, i);
        if (j3 < j) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A03(0, 22, 43), A03(22, 90, 50));
            j3 = j;
        }
        this.A0G = f6;
        this.A0D = i2;
        this.A08 = j * 1000;
        this.A0E = j2 * 1000;
        this.A09 = 1000 * j3;
        this.A07 = i3;
        this.A06 = i4;
        this.A0C = f;
        this.A05 = f2;
        this.A0B = com.facebook.ads.redexgen.core.BP.A05(list);
        this.A0A = j4;
        this.A0F = anonymousClass45;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.Integer> */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.EU>> A00(com.facebook.ads.redexgen.core.C0674El[] c0674ElArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < c0674ElArr.length; i++) {
            if (c0674ElArr[i] != null && c0674ElArr[i].A02.length > 1) {
                com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
                A01.A04(new com.facebook.ads.redexgen.core.EU(0L, 0L));
                arrayList.add(A01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] A06 = A06(c0674ElArr);
        int length = A06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[A06.length];
            for (int i2 = 0; i2 < A06.length; i2++) {
                int length2 = A06[i2].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new java.lang.RuntimeException();
                }
                A0I[7] = "x";
                jArr[i2] = length2 == 0 ? 0L : A06[i2][0];
                java.lang.String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    java.lang.String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            com.facebook.ads.redexgen.core.BP<java.lang.Integer> A02 = A02(A06);
            for (int i3 = 0; i3 < A02.size(); i3++) {
                int intValue = A02.get(i3).intValue();
                int i4 = iArr[intValue] + 1;
                iArr[intValue] = i4;
                jArr[intValue] = A06[intValue][i4];
                A05(arrayList, jArr);
            }
            for (int i5 = 0; i5 < c0674ElArr.length; i5++) {
                if (arrayList.get(i5) != null) {
                    jArr[i5] = jArr[i5] * 2;
                }
            }
            A05(arrayList, jArr);
            com.facebook.ads.redexgen.core.C2K A012 = com.facebook.ads.redexgen.core.BP.A01();
            int i6 = 0;
            while (true) {
                int size = arrayList.size();
                java.lang.String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    java.lang.String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i6 >= size) {
                        break;
                    }
                    com.facebook.ads.redexgen.core.C2K c2k = (com.facebook.ads.redexgen.core.C2K) arrayList.get(i6);
                    A012.A04(c2k != null ? com.facebook.ads.redexgen.core.BP.A03() : c2k.A05());
                    i6++;
                } else {
                    java.lang.String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i6 >= size) {
                        break;
                    }
                    com.facebook.ads.redexgen.core.C2K c2k2 = (com.facebook.ads.redexgen.core.C2K) arrayList.get(i6);
                    A012.A04(c2k2 != null ? com.facebook.ads.redexgen.core.BP.A03() : c2k2.A05());
                    i6++;
                }
            }
            return A012.A05();
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q3 != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static com.facebook.ads.redexgen.core.BP<java.lang.Integer> A02(long[][] jArr) {
        com.facebook.ads.redexgen.core.InterfaceC2181q3 A00 = com.facebook.ads.redexgen.core.AbstractC2183q5.A02().A03().A00();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                double[] logBitrates = new double[jArr[i].length];
                int i2 = 0;
                while (true) {
                    double d = 0.0d;
                    if (i2 >= jArr[i].length) {
                        break;
                    }
                    if (jArr[i][i2] != -1) {
                        d = java.lang.Math.log(jArr[i][i2]);
                    }
                    logBitrates[i2] = d;
                    i2++;
                }
                double d2 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i3 = 0;
                for (int i4 = 1; i3 < logBitrates.length - i4; i4 = 1) {
                    A00.AHE(java.lang.Double.valueOf(d2 == 0.0d ? 1.0d : (((logBitrates[i3] + logBitrates[i3 + 1]) * 0.5d) - logBitrates[0]) / d2), java.lang.Integer.valueOf(i));
                    i3++;
                }
            }
        }
        return com.facebook.ads.redexgen.core.BP.A05(A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(java.util.List<com.facebook.ads.redexgen.core.C2K<com.facebook.ads.redexgen.core.EU>> list, long[] jArr) {
        long j = 0;
        int i = 0;
        while (true) {
            if (i < jArr.length) {
                long j2 = jArr[i];
                java.lang.String[] strArr = A0I;
                if (strArr[5].length() != strArr[2].length()) {
                    break;
                }
                A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
                j += j2;
                i++;
            } else {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.facebook.ads.redexgen.core.C2K<com.facebook.ads.redexgen.core.EU> c2k = list.get(i2);
                    if (A0I[0].charAt(10) != 'x') {
                        A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
                        if (c2k != null) {
                            c2k.A04(new com.facebook.ads.redexgen.core.EU(j, jArr[i2]));
                        }
                    }
                }
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static long[][] A06(com.facebook.ads.redexgen.core.C0674El[] c0674ElArr) {
        long j;
        long[] jArr;
        long[][] jArr2 = new long[c0674ElArr.length][];
        for (int i = 0; i < c0674ElArr.length; i++) {
            com.facebook.ads.redexgen.core.C0674El c0674El = c0674ElArr[i];
            if (c0674El == null) {
                jArr2[i] = new long[0];
            } else {
                long[] jArr3 = new long[c0674El.A02.length];
                java.lang.String[] strArr = A0I;
                java.lang.String str = strArr[6];
                java.lang.String str2 = strArr[3];
                int i2 = str.charAt(18);
                if (i2 == str2.charAt(18)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i] = jArr3;
                for (int i3 = 0; i3 < c0674El.A02.length; i3++) {
                    int j2 = c0674El.A01.A08(c0674El.A02[i3]).A05;
                    int i4 = A0I[7].length();
                    if (i4 != 11) {
                        java.lang.String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j = j2;
                        jArr = jArr2[i];
                        if (j != -1) {
                            jArr[i3] = j;
                        }
                        j = 0;
                        jArr[i3] = j;
                    } else {
                        j = j2;
                        jArr = jArr2[i];
                        if (j != -1) {
                            jArr[i3] = j;
                        }
                        j = 0;
                        jArr[i3] = j;
                    }
                }
                java.util.Arrays.sort(jArr2[i]);
            }
        }
        return jArr2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05559j, com.facebook.ads.redexgen.core.InterfaceC2008nE
    public final void A5x() {
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05559j, com.facebook.ads.redexgen.core.InterfaceC2008nE
    public final void A6K() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2008nE
    public final int A93() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05559j, com.facebook.ads.redexgen.core.InterfaceC2008nE
    public final void AFJ(float f) {
        this.A01 = f;
    }
}
