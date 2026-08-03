package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KX {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"WgUeKuj9wfEgVxNwMhsYWmskS6gvsk4u", "lY3t8mYoNwyGRU5cssOmtzsYdTPyfvrC", "tzc0Un4Rz02llsU2wRoiLNj111WzmA0w", "wjCansXDTCdJlU5xzgIWdtLXD8W6m4ff", "dSf2E5RYsrIqqVu4QtCEIfuVexQKgaAl", "hprG2SUWJwqzwErLsBPmt0UTVTrRmWBo", "Dvzgny", "YcbZLjapWumuyxPaIgpkq7v611"};
    public static final java.util.regex.Pattern A04;
    public static final java.util.regex.Pattern A05;
    public final com.facebook.ads.redexgen.core.C04434v A00 = new com.facebook.ads.redexgen.core.C04434v();
    public final java.lang.StringBuilder A01 = new java.lang.StringBuilder();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{8, 90, 83, com.google.common.base.Ascii.ETB, 57, 121, 34, 34, 123, 109, 125, 106, 96, 71, 95, 72, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 77, 9, 79, 70, 71, 93, 4, 90, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 83, 76, 19, 9, com.google.common.base.Ascii.SO, 95, 109, 106, 126, 124, 124, 75, 123, 123, 88, 105, 122, 123, 109, 122, 36, 86, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 63, 38, 32, 42, 44, 116, 107, 97, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 107, com.google.common.base.Ascii.DC4, 99, 96, 107, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 44, 90, 90, 77, 72, 41, 66, 95, 75, 47, 88, 46, 92, 91, 77, 41, 66, 95, 75, 47, 89, 91, 90, 2, 10, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, 87, 91, 86, 39, 42, 42, 19, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, 3, com.google.common.base.Ascii.RS, 4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, 92, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, 3, 93, 80, 83, 91, 52, 56, 59, 56, 37, 6, com.google.common.base.Ascii.VT, 5, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 17, 116, 124, 51, 58, 59, 33, 120, 51, 52, 56, 60, 57, 44, 100, 109, 108, 118, 47, 113, 107, 120, 103, 111, 102, 103, 125, 36, 122, 125, 112, 101, 108, 40, 33, 32, 58, 99, 57, 43, 39, 41, 38, 58, 101, 120, 109, 96, 101, 111, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 119, Byte.MAX_VALUE, 124, 123, 108, 119, 35, 126, 97, 125, 103, 122, 103, 97, 96, 42, 59, 38, 42, 115, kotlin.io.encoding.Base64.padSymbol, 49, 51, 60, 55, 48, 59, 115, 43, 46, 44, 55, 57, 54, 42, 69, 84, 73, 69, com.google.common.base.Ascii.FS, 85, 84, 82, 94, 67, 80, 69, 88, 94, 95, 117, 110, 100, 101, 114, com.google.common.base.Ascii.DC2, 9, 3, 2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 9, 2, 37, 115};
    }

    static {
        A07();
        A05 = java.util.regex.Pattern.compile(A01(49, 19, 56));
        A04 = java.util.regex.Pattern.compile(A01(68, 32, 3));
    }

    public static char A00(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        return (char) c04434v.A0l()[i];
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int limit = c04434v.A09();
        int A0A = c04434v.A0A();
        char c = 0;
        while (limit < A0A && c == 0) {
            int i = limit + 1;
            int position = c04434v.A0l()[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c04434v.A09();
        java.lang.String trim = c04434v.A0W((limit - 1) - position2).trim();
        int limit3 = A03[6].length();
        if (limit3 == 22) {
            throw new java.lang.RuntimeException();
        }
        A03[6] = "T";
        return trim;
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.C04434v c04434v, java.lang.StringBuilder sb) {
        sb.setLength(0);
        int A09 = c04434v.A09();
        int A0A = c04434v.A0A();
        boolean z = false;
        while (A09 < A0A && !z) {
            int position = c04434v.A0l()[A09];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A09++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        int position2 = c04434v.A09();
        c04434v.A0g(A09 - position2);
        return sb.toString();
    }

    public static java.lang.String A04(com.facebook.ads.redexgen.core.C04434v c04434v, java.lang.StringBuilder sb) {
        A09(c04434v);
        if (c04434v.A07() == 0) {
            return null;
        }
        java.lang.String A032 = A03(c04434v, sb);
        java.lang.String A01 = A01(0, 0, 111);
        if (!A01.equals(A032)) {
            return A032;
        }
        java.lang.String identifier = A01 + ((char) c04434v.A0I());
        return identifier;
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C04434v c04434v, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = false;
        while (!z) {
            int A09 = c04434v.A09();
            java.lang.String token = A04(c04434v, sb);
            if (token == null) {
                return null;
            }
            if (A01(252, 1, 127).equals(token) || A01(11, 1, 32).equals(token)) {
                c04434v.A0f(A09);
                z = true;
            } else {
                sb2.append(token);
            }
        }
        java.lang.String token2 = sb2.toString();
        java.lang.String[] strArr = A03;
        if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "H7IbVoVWHhMCEaN9uIz63JDuRBiIUDdu";
        return token2;
    }

    public static java.lang.String A06(com.facebook.ads.redexgen.core.C04434v c04434v, java.lang.StringBuilder sb) {
        A09(c04434v);
        if (c04434v.A07() < 5) {
            return null;
        }
        java.lang.String A0W = c04434v.A0W(5);
        java.lang.String cueSelector = A01(6, 5, 105);
        if (!cueSelector.equals(A0W)) {
            return null;
        }
        int A09 = c04434v.A09();
        java.lang.String token = A04(c04434v, sb);
        if (token == null) {
            return null;
        }
        java.lang.String cueSelector2 = A01(251, 1, 47);
        if (cueSelector2.equals(token)) {
            c04434v.A0f(A09);
            java.lang.String cueSelector3 = A01(0, 0, 111);
            return cueSelector3;
        }
        java.lang.String str = null;
        java.lang.String cueSelector4 = A01(3, 1, 78);
        if (cueSelector4.equals(token)) {
            str = A02(c04434v);
        }
        java.lang.String target = A04(c04434v, sb);
        if (A03[1].charAt(23) == '0') {
            throw new java.lang.RuntimeException();
        }
        A03[2] = "kXJ9Slail85MSzeGoJKC016PF6DECpEt";
        java.lang.String cueSelector5 = A01(4, 1, 97);
        if (cueSelector5.equals(target)) {
            return str;
        }
        return null;
    }

    public static void A08(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.lang.String line;
        do {
            line = c04434v.A0T();
        } while (!android.text.TextUtils.isEmpty(line));
    }

    public static void A09(com.facebook.ads.redexgen.core.C04434v c04434v) {
        boolean skipping = true;
        while (c04434v.A07() > 0 && skipping) {
            boolean A0E = A0E(c04434v);
            java.lang.String[] strArr = A03;
            if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "0TKGD6osFOak97huLTwvjNDJFBkvRURl";
            if (!A0E) {
                boolean skipping2 = A0D(c04434v);
                if (!skipping2) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.C0818Kb c0818Kb, java.lang.StringBuilder sb) {
        A09(c04434v);
        java.lang.String A032 = A03(c04434v, sb);
        java.lang.String A01 = A01(0, 0, 111);
        if (A01.equals(A032)) {
            return;
        }
        java.lang.String property = A03[7];
        if (property.length() != 9) {
            java.lang.String[] strArr = A03;
            strArr[5] = "0USPULEwqSqheHB8AwvifNHGUwFlc4Dk";
            strArr[0] = "K61Ol0RKHiZGAookV7xLX0vZAqBJUPJk";
            java.lang.String A012 = A01(5, 1, 50);
            java.lang.String property2 = A04(c04434v, sb);
            if (!A012.equals(property2)) {
                return;
            }
            A09(c04434v);
            java.lang.String token = A05(c04434v, sb);
            if (token == null || A01.equals(token)) {
                return;
            }
            int A09 = c04434v.A09();
            java.lang.String A042 = A04(c04434v, sb);
            java.lang.String property3 = A01(11, 1, 32);
            if (!property3.equals(A042)) {
                java.lang.String property4 = A01(252, 1, 127);
                if (property4.equals(A042)) {
                    c04434v.A0f(A09);
                } else {
                    return;
                }
            }
            java.lang.String property5 = A01(123, 5, 38);
            if (property5.equals(A032)) {
                c0818Kb.A0C(com.facebook.ads.redexgen.core.AnonymousClass47.A00(token));
                return;
            }
            java.lang.String property6 = A01(103, 16, 0);
            if (property6.equals(A032)) {
                c0818Kb.A0B(com.facebook.ads.redexgen.core.AnonymousClass47.A00(token));
                return;
            }
            java.lang.String property7 = A01(189, 13, 127);
            boolean z = true;
            if (property7.equals(A032)) {
                java.lang.String property8 = A01(183, 4, 12);
                if (property8.equals(token)) {
                    c0818Kb.A0E(1);
                    return;
                }
                java.lang.String property9 = A01(237, 5, 113);
                if (!property9.equals(token)) {
                    return;
                }
                c0818Kb.A0E(2);
                return;
            }
            java.lang.String[] strArr2 = A03;
            java.lang.String str = strArr2[5];
            java.lang.String value = strArr2[0];
            int position = str.charAt(6);
            if (position != value.charAt(6)) {
                A03[7] = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ;
                java.lang.String property10 = A01(202, 20, 47);
                if (property10.equals(A032)) {
                    java.lang.String property11 = A01(100, 3, 55);
                    if (!property11.equals(token)) {
                        java.lang.String property12 = A01(128, 6, 19);
                        if (!token.startsWith(property12)) {
                            z = false;
                        }
                    }
                    c0818Kb.A0H(z);
                    return;
                }
                java.lang.String property13 = A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 15, 64);
                boolean equals = property13.equals(A032);
                int position2 = A03[1].charAt(23);
                if (position2 == 48) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr3 = A03;
                strArr3[5] = "yV6z32KBYC5kRTQJBEYXfmL3n0QpULhq";
                strArr3[0] = "ddMdMWLPn2YWu0ZxAW3O28brDgrMgVms";
                if (equals) {
                    java.lang.String property14 = A01(242, 9, 22);
                    if (!property14.equals(token)) {
                        return;
                    }
                    c0818Kb.A0J(true);
                    return;
                }
                java.lang.String property15 = A01(136, 11, 36);
                if (property15.equals(A032)) {
                    c0818Kb.A0F(token);
                    return;
                }
                java.lang.String property16 = A01(166, 11, 63);
                if (property16.equals(A032)) {
                    java.lang.String property17 = A01(119, 4, 78);
                    if (!property17.equals(token)) {
                        return;
                    }
                    c0818Kb.A0G(true);
                    return;
                }
                java.lang.String property18 = A01(156, 10, 120);
                if (property18.equals(A032)) {
                    java.lang.String property19 = A01(177, 6, 125);
                    if (!property19.equals(token)) {
                        return;
                    }
                    c0818Kb.A0I(true);
                    return;
                }
                java.lang.String property20 = A01(147, 9, 115);
                if (!property20.equals(A032)) {
                    return;
                }
                A0C(token, c0818Kb);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private void A0B(com.facebook.ads.redexgen.core.C0818Kb c0818Kb, java.lang.String str) {
        if (A01(0, 0, 111).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            java.util.regex.Matcher matcher = A05.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c0818Kb.A0N((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        java.lang.String[] A1O = com.facebook.ads.redexgen.core.C5C.A1O(str, A01(47, 2, 9));
        java.lang.String str2 = A1O[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c0818Kb.A0M(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c0818Kb.A0L(str2.substring(voiceStartIndex));
        } else {
            c0818Kb.A0M(str2);
        }
        int voiceStartIndex2 = A1O.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A1O.length;
            c0818Kb.A0O((java.lang.String[]) com.facebook.ads.redexgen.core.C5C.A1J(A1O, 1, voiceStartIndex3));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0C(java.lang.String str, com.facebook.ads.redexgen.core.C0818Kb c0818Kb) {
        char c;
        java.util.regex.Matcher matcher = A04.matcher(com.facebook.ads.redexgen.core.AbstractC1831k7.A01(str));
        if (!matcher.matches()) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A01(32, 15, 121), A01(12, 20, 88) + str + A01(1, 2, 12));
            return;
        }
        java.lang.String str2 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals(A01(0, 1, 92))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3240:
                if (str2.equals(A01(134, 2, 96))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3592:
                if (str2.equals(A01(187, 2, 118))) {
                    c = 0;
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
                c0818Kb.A0D(1);
                break;
            case 1:
                c0818Kb.A0D(2);
                break;
            case 2:
                if (A03[6].length() != 22) {
                    A03[3] = "l0BGY6Ka6m0f3MeGwvnWH7AIpst7Q8cB";
                    c0818Kb.A0D(3);
                    break;
                } else {
                    throw new java.lang.RuntimeException();
                }
            default:
                throw new java.lang.IllegalStateException();
        }
        c0818Kb.A0A(java.lang.Float.parseFloat((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(matcher.group(1))));
    }

    public static boolean A0D(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int position = c04434v.A09();
        int limit = c04434v.A0A();
        byte[] A0l = c04434v.A0l();
        if (position + 2 > limit) {
            return false;
        }
        int i = position + 1;
        if (A0l[position] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (A0l[i] == 42) {
            while (i2 + 1 < limit) {
                int i3 = i2 + 1;
                char skippedChar = (char) A0l[i2];
                if (skippedChar == '*') {
                    char skippedChar2 = A0l[i3];
                    if (skippedChar2 == '/') {
                        limit = i3 + 1;
                        i2 = limit;
                    }
                }
                i2 = i3;
            }
            c04434v.A0g(limit - c04434v.A09());
            return true;
        }
        return false;
    }

    public static boolean A0E(com.facebook.ads.redexgen.core.C04434v c04434v) {
        switch (A00(c04434v, c04434v.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c04434v.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C0818Kb> A0F(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.lang.String selector;
        this.A01.setLength(0);
        int A09 = c04434v.A09();
        A08(c04434v);
        com.facebook.ads.redexgen.core.C04434v c04434v2 = this.A00;
        byte[] A0l = c04434v.A0l();
        int initialInputPosition = c04434v.A09();
        c04434v2.A0j(A0l, initialInputPosition);
        this.A00.A0f(A09);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String selector2 = A06(this.A00, this.A01);
            if (selector2 == null) {
                return arrayList;
            }
            if (!A01(251, 1, 47).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            com.facebook.ads.redexgen.core.C0818Kb c0818Kb = new com.facebook.ads.redexgen.core.C0818Kb();
            A0B(c0818Kb, selector2);
            java.lang.String str = null;
            boolean z = false;
            while (true) {
                selector = A01(252, 1, 127);
                if (z) {
                    break;
                }
                int A092 = this.A00.A09();
                str = A04(this.A00, this.A01);
                z = str == null || selector.equals(str);
                if (!z) {
                    this.A00.A0f(A092);
                    A0A(this.A00, c0818Kb, this.A01);
                }
            }
            if (selector.equals(str)) {
                arrayList.add(c0818Kb);
            }
        }
    }
}
