package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public abstract class CC implements com.facebook.ads.redexgen.core.InterfaceC1867kj<java.lang.Character> {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"hclkFSbi6Vg1BfvH0wmaDr4dbn73", "G9lpasi9RBaNNLModxK5K8gUTz14LheK", "Gftcr", "paUG0VLHuMGB0YhbqyP1Nk9wNO1yz", "Gk6etbpP6dMkcTEXSV9xUYuIVF", "di9Lt", "", "3ewjDWS3ktgbM1wBomSiDURsX5cxFOtv"};

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -63, -62, -61, -60, -59, -58};
    }

    public abstract boolean A09(char c);

    static {
        A07();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1C] */
    public static com.facebook.ads.redexgen.core.C1C A02(final char match) {
        return new com.facebook.ads.redexgen.core.C2S(match) { // from class: com.facebook.ads.redexgen.X.1C
            public static byte[] A01;
            public static java.lang.String[] A02 = {"9yE19", "zOI7IBt", "QcxtIsV3beme0fSshBZEiAbzAb", "54lX5AjhAsj9h7", "50Stt6", "IBfS2nVlEcQ7MYOv0zA4iOMcJ", "2Gh0ygEYZnFezhOBR", "xA0qoezlN6x4dJxmGj9eAbu4w6XV572R"};
            public final char A00;

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
                    if (A02[2].length() != 26) {
                        throw new java.lang.RuntimeException();
                    }
                    A02[1] = "Dls36CWZuql1";
                    copyOfRange[i4] = b;
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                byte[] bArr = {55, 57, com.google.common.base.Ascii.EM, 50, 59, 40, com.google.common.base.Ascii.ETB, 59, 46, 57, 50, 63, 40, 116, 51, 41, 114, 125};
                if (A02[1].length() == 27) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[0] = "urSdB";
                strArr[6] = "hh6CYTzAaza6NCd4D";
                A01 = bArr;
            }

            static {
                A01();
            }

            {
                this.A00 = match;
            }

            @Override // com.facebook.ads.redexgen.core.CC
            public final boolean A09(char c) {
                return c == this.A00;
            }

            public final java.lang.String toString() {
                java.lang.String A04;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(A00(2, 16, 41));
                A04 = com.facebook.ads.redexgen.core.CC.A04(this.A00);
                return append.append(A04).append(A00(0, 2, 99)).toString();
            }
        };
    }

    public static com.facebook.ads.redexgen.core.CC A03() {
        com.facebook.ads.redexgen.core.CC cc = com.facebook.ads.redexgen.core.C0v.A01;
        if (A01[1].charAt(7) == 'R') {
            throw new java.lang.RuntimeException();
        }
        A01[1] = "RCT2CzV9IWXJqUHkaSW8fbkoFpPJrj9F";
        return cc;
    }

    public static java.lang.String A04(char c) {
        java.lang.String A06 = A06(0, 16, 115);
        char[] cArr = {'\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        int i = 0;
        while (A01[7].charAt(17) != '8') {
            A01[3] = "qYlA5j1UP55Q3fDxlHttfnhdcQNgK";
            if (i < 4) {
                cArr[5 - i] = A06.charAt(c & 15);
                c = (char) (c >> 4);
                i++;
            } else {
                java.lang.String hex = java.lang.String.copyValueOf(cArr);
                return hex;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public int A08(java.lang.CharSequence sequence, int start) {
        int length = sequence.length();
        com.facebook.ads.redexgen.core.AbstractC1866ki.A01(start, length);
        while (start < length) {
            char charAt = sequence.charAt(start);
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[5];
            int i = str.length();
            int length2 = str2.length();
            if (i != length2) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "6mJi9OgqL4fnjCQ1IPpC8dqdRNdbhMMp";
            if (A09(charAt)) {
                return start;
            }
            start++;
        }
        return -1;
    }

    @java.lang.Deprecated
    public boolean A0A(java.lang.Character character) {
        return A09(character.charValue());
    }
}
