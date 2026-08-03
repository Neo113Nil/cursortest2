package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class JL {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final com.facebook.ads.redexgen.core.C1873kp A05;
    public static final com.facebook.ads.redexgen.core.C1873kp A06;
    public int A01;
    public final java.util.List<com.facebook.ads.redexgen.core.JI> A02 = new java.util.ArrayList();
    public int A00 = 0;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new java.lang.RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{45, 10, com.google.common.base.Ascii.DC2, 5, 8, com.google.common.base.Ascii.CR, 0, 68, 55, 33, 34, 68, 10, 5, 9, 1, 56, 7, 4, com.google.common.base.Ascii.FS, 38, 4, com.google.common.base.Ascii.US, 2, 4, 5, 52, 47, 10, com.google.common.base.Ascii.US, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, 120, 125, 104, Byte.MAX_VALUE, 82, 94, 97, 98, 122, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, com.google.common.base.Ascii.DC4, 17, 4, 19, 62, 50, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SYN, 44, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 62, 37, 4, 7, com.google.common.base.Ascii.CR, 8, 2, 10, 4, 19, 8, com.google.common.base.Ascii.SI, 6, 62, 46, com.google.common.base.Ascii.SI, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, java.util.List<com.facebook.ads.androidx.media3.common.Metadata.Entry> list) throws java.io.IOException {
        long A8n = interfaceC1987ms.A8n();
        int A8O = (int) ((interfaceC1987ms.A8O() - interfaceC1987ms.A8n()) - this.A01);
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(A8O);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, A8O);
        for (int i = 0; i < this.A02.size(); i++) {
            com.facebook.ads.redexgen.core.JI ji = this.A02.get(i);
            c04434v.A0f((int) (ji.A02 - A8n));
            c04434v.A0g(4);
            int A0E = c04434v.A0E();
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int A00 = A00(c04434v.A0W(A0E));
            int i2 = ji.A01 - (A0E + 8);
            switch (A00) {
                case 2192:
                    list.add(A01(c04434v, i2));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    break;
                default:
                    throw new java.lang.IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = com.facebook.ads.redexgen.core.C1873kp.A02(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        A05 = com.facebook.ads.redexgen.core.C1873kp.A02(io.ktor.util.date.GMTDateParser.ANY);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(java.lang.String str) throws com.facebook.ads.redexgen.core.C3K {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals(A02(16, 15, 81))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332107749:
                if (str.equals(A02(104, 26, 40))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1251387154:
                if (str.equals(A02(51, 21, 55))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -830665521:
                if (str.equals(A02(72, 32, 91))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1760745220:
                if (str.equals(A02(31, 20, 52))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2816;
            case 2:
                return 2817;
            case 3:
                return 2819;
            case 4:
                return 2820;
            default:
                throw com.facebook.ads.redexgen.core.C3K.A01(A02(0, 16, 94), null);
        }
    }

    public static com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData A01(com.facebook.ads.redexgen.core.C04434v c04434v, int i) throws com.facebook.ads.redexgen.core.C3K {
        java.util.List<com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> segments = new java.util.ArrayList<>();
        java.lang.String dataString = c04434v.A0W(i);
        java.util.List<java.lang.String> A062 = A05.A06(dataString);
        for (int i2 = 0; i2 < A062.size(); i2++) {
            java.util.List<java.lang.String> A063 = A06.A06(A062.get(i2));
            if (A063.size() == 3) {
                try {
                    long parseLong = java.lang.Long.parseLong(A063.get(0));
                    long startTimeMs = java.lang.Long.parseLong(A063.get(1));
                    segments.add(new com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment(parseLong, startTimeMs, 1 << (java.lang.Integer.parseInt(A063.get(2)) - 1)));
                } catch (java.lang.NumberFormatException e) {
                    throw com.facebook.ads.redexgen.core.C3K.A01(null, e);
                }
            } else {
                throw com.facebook.ads.redexgen.core.C3K.A01(null, null);
            }
        }
        return new com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData(segments);
    }

    private void A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(8);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, 8);
        this.A01 = c04434v.A0E() + 8;
        if (c04434v.A0C() != 1397048916) {
            hv.A00 = 0L;
        } else {
            hv.A00 = interfaceC1987ms.A8n() - (this.A01 - 12);
            this.A00 = 2;
        }
    }

    private void A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        long A8O = interfaceC1987ms.A8O();
        int i = (this.A01 - 12) - 8;
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(i);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c04434v.A0g(2);
            int i3 = c04434v.A0a();
            switch (i3) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    long streamLength = this.A01;
                    long j = A8O - streamLength;
                    long streamLength2 = c04434v.A0E();
                    int size = c04434v.A0E();
                    this.A02.add(new com.facebook.ads.redexgen.core.JI(i3, j - streamLength2, size));
                    break;
                default:
                    c04434v.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            hv.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        hv.A00 = streamLength3;
    }

    public final int A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv, java.util.List<com.facebook.ads.androidx.media3.common.Metadata.Entry> slowMotionMetadataEntries) throws java.io.IOException {
        long j = 0;
        switch (this.A00) {
            case 0:
                long A8O = interfaceC1987ms.A8O();
                if (A8O != -1 && A8O >= 8) {
                    j = A8O - 8;
                }
                hv.A00 = j;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC1987ms, hv);
                return 1;
            case 2:
                A05(interfaceC1987ms, hv);
                return 1;
            case 3:
                A06(interfaceC1987ms, slowMotionMetadataEntries);
                hv.A00 = 0L;
                return 1;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
