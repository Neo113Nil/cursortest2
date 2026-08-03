package com.facebook.ads.androidx.media3.extractor;

/* loaded from: assets/audience_network/classes2.dex */
public final class DefaultExtractorsFactory implements com.facebook.ads.redexgen.core.HD {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"XjRCK", "YKKzt2Kz2K7V0l18n", "uXpf", "oBPf3SXxcwKIIjUAiSrSO2O", "bGsaI0", "ItuqzfwzHHPicVJR9bxtDiYARBCa2uxZ", "TYxjAZ909gRPDezWj", "NTeqQWiGfYp1zE0qSPlL6iBK546ff9Um"};
    public static final com.facebook.ads.redexgen.core.H5 A0F;
    public static final com.facebook.ads.redexgen.core.H5 A0G;
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 1;
    public int A09 = 112800;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList with List")
    public java.util.List<com.facebook.ads.redexgen.core.C2196qI> A0A = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(new com.facebook.ads.redexgen.core.C2196qI[0]);
    public boolean A0B;
    public boolean A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{74, 86, 84, com.google.common.base.Ascii.NAK, 77, 72, 74, 76, 73, 86, 86, 82, com.google.common.base.Ascii.NAK, 72, 75, 90, com.google.common.base.Ascii.NAK, 72, 85, 75, 89, 86, 80, 75, 95, com.google.common.base.Ascii.NAK, 84, 76, 75, 80, 72, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, 75, 76, 74, 86, 75, 76, 89, com.google.common.base.Ascii.NAK, 84, 80, 75, 80, com.google.common.base.Ascii.NAK, 52, 80, 75, 80, 44, 95, 91, 89, 72, 74, 91, 86, 89, -6, 6, 4, -59, -3, -8, -6, -4, -7, 6, 6, 2, -59, -8, -5, 10, -59, -2, 6, 6, -2, 3, -4, -59, -8, 5, -5, 9, 6, 0, -5, -59, -4, com.google.common.base.Ascii.SI, 6, 7, 3, -8, com.google.common.base.Ascii.DLE, -4, 9, -55, -59, -4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, -59, -3, 3, -8, -6, -59, -35, 3, -8, -6, -36, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 9, -8, -6, com.google.common.base.Ascii.VT, 6, 9, com.google.common.base.Ascii.ESC, 39, 37, -26, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 39, 39, 35, -26, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, 43, -26, com.google.common.base.Ascii.US, 39, 39, com.google.common.base.Ascii.US, 36, com.google.common.base.Ascii.GS, -26, com.google.common.base.Ascii.EM, 38, com.google.common.base.Ascii.FS, 42, 39, 33, com.google.common.base.Ascii.FS, -26, com.google.common.base.Ascii.GS, 48, 39, 40, 36, com.google.common.base.Ascii.EM, 49, com.google.common.base.Ascii.GS, 42, -22, -26, com.google.common.base.Ascii.GS, 48, 44, -26, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, -26, -2, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 4, 33, com.google.common.base.Ascii.SUB, 42, com.google.common.base.Ascii.EM, 42, 49, 82, 92, 42, 95, 74, 82, 85, 74, 75, 85, 78};
    }

    static {
        A05();
        A0H = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
        A0F = new com.facebook.ads.redexgen.core.H5(new com.facebook.ads.redexgen.core.H4() { // from class: com.facebook.ads.redexgen.X.mw
            @Override // com.facebook.ads.redexgen.core.H4
            public final java.lang.reflect.Constructor A7R() {
                java.lang.reflect.Constructor A01;
                A01 = com.facebook.ads.androidx.media3.extractor.DefaultExtractorsFactory.A01();
                return A01;
            }
        });
        A0G = new com.facebook.ads.redexgen.core.H5(new com.facebook.ads.redexgen.core.H4() { // from class: com.facebook.ads.redexgen.X.mv
            @Override // com.facebook.ads.redexgen.core.H4
            public final java.lang.reflect.Constructor A7R() {
                java.lang.reflect.Constructor A02;
                A02 = com.facebook.ads.androidx.media3.extractor.DefaultExtractorsFactory.A02();
                return A02;
            }
        });
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public DefaultExtractorsFactory() {
    }

    public static java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.H9> A01() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        boolean isFlacNativeLibraryAvailable = java.lang.Boolean.TRUE.equals(java.lang.Class.forName(A00(124, 63, 62)).getMethod(A00(187, 11, 111), new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
        if (!isFlacNativeLibraryAvailable) {
            return null;
        }
        return java.lang.Class.forName(A00(59, 65, 29)).asSubclass(com.facebook.ads.redexgen.core.H9.class).getConstructor(java.lang.Integer.TYPE);
    }

    public static java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.H9> A02() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
        return java.lang.Class.forName(A00(0, 59, 109)).asSubclass(com.facebook.ads.redexgen.core.H9.class).getConstructor(new java.lang.Class[0]);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Removed AVI and JPEG extractors")
    private void A06(int i, java.util.List<com.facebook.ads.redexgen.core.H9> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new com.facebook.ads.redexgen.core.C1916lX());
                return;
            case 1:
                list.add(new com.facebook.ads.redexgen.core.C1913lU());
                return;
            case 2:
                int i3 = (this.A0C ? 1 : 0) | this.A00;
                java.lang.String[] strArr = A0E;
                if (strArr[2].length() == strArr[0].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0E;
                strArr2[5] = "0JYW4ys9S4cBRo9bfKNpoispKPkvAlfn";
                strArr2[7] = "ESM27VzyBHwJIaBfhIrCniRSUGwbmbgc";
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new com.facebook.ads.redexgen.core.C1910lR(i2 | i3));
                return;
            case 3:
                int i4 = (this.A0C ? 1 : 0) | this.A01;
                boolean z = this.A0B;
                java.lang.String[] strArr3 = A0E;
                if (strArr3[2].length() != strArr3[0].length()) {
                    java.lang.String[] strArr4 = A0E;
                    strArr4[6] = "88SSgZrekVuE3ZpEu";
                    strArr4[1] = "yFmqseBd895DxKzOE";
                    if (!z) {
                        i2 = 0;
                    }
                    list.add(new com.facebook.ads.redexgen.core.C1980ml(i2 | i4));
                    return;
                }
                throw new java.lang.RuntimeException();
            case 4:
                com.facebook.ads.redexgen.core.H9 flacExtractor = A0F.A03(java.lang.Integer.valueOf(this.A02));
                if (flacExtractor != null) {
                    list.add(flacExtractor);
                    return;
                } else {
                    list.add(new com.facebook.ads.redexgen.core.C1975mg(this.A02));
                    return;
                }
            case 5:
                list.add(new com.facebook.ads.redexgen.core.C1972md());
                return;
            case 6:
                list.add(new com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor(this.A04));
                return;
            case 7:
                int i5 = (this.A0C ? 1 : 0) | this.A05;
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new com.facebook.ads.redexgen.core.C1961mG(i2 | i5));
                return;
            case 8:
                list.add(new com.facebook.ads.redexgen.core.C1947m2().A01(this.A03));
                list.add(new com.facebook.ads.redexgen.core.C1948m3(this.A06));
                return;
            case 9:
                list.add(new com.facebook.ads.redexgen.core.C1941lw());
                return;
            case 10:
                list.add(new com.facebook.ads.redexgen.core.C1893lA());
                return;
            case 11:
                list.add(new com.facebook.ads.redexgen.core.C1886l3(this.A08, new com.facebook.ads.redexgen.core.AnonymousClass53(0L), new com.facebook.ads.redexgen.core.C1908lP(this.A07, this.A0A), this.A09));
                return;
            case 12:
                list.add(new com.facebook.ads.redexgen.core.C1882kz());
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                com.facebook.ads.redexgen.core.H9 midiExtractor = A0G.A03(new java.lang.Object[0]);
                if (midiExtractor == null) {
                    return;
                }
                list.add(midiExtractor);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.HD
    public final synchronized com.facebook.ads.redexgen.core.H9[] A5N() {
        return A5O(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    @Override // com.facebook.ads.redexgen.core.HD
    public final synchronized com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders) {
        java.util.List<com.facebook.ads.androidx.media3.extractor.Extractor> extractors;
        extractors = new java.util.ArrayList<>(A0H.length);
        int fileType = com.facebook.ads.redexgen.core.AbstractC03822k.A02(responseHeaders);
        if (fileType != -1) {
            A06(fileType, extractors);
        }
        int A00 = com.facebook.ads.redexgen.core.AbstractC03822k.A00(uri);
        if (A00 != -1 && A00 != fileType) {
            A06(A00, extractors);
        }
        for (int responseHeadersInferredFileType : A0H) {
            if (responseHeadersInferredFileType != fileType && responseHeadersInferredFileType != A00) {
                A06(responseHeadersInferredFileType, extractors);
            }
        }
        return (com.facebook.ads.redexgen.core.H9[]) extractors.toArray(new com.facebook.ads.redexgen.core.H9[extractors.size()]);
    }
}
