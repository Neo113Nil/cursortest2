package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class KO {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.KM A00(com.facebook.ads.redexgen.core.KM km, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map) {
        while (km != null) {
            com.facebook.ads.redexgen.core.KT A02 = A02(km.A04, km.A0H(), map);
            if (A02 != null && A02.A09() == 1) {
                return km;
            }
            km = km.A03;
        }
        return null;
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
            i4++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 88, 86, 93, 93, 86, 91, 84, com.google.common.base.Ascii.CR, 95, 98, 79, 102, 65, 82, 101, 97, com.google.common.base.Ascii.CR, 91, 92, 81, 82, com.google.common.base.Ascii.CR, 100, 86, 97, 85, 92, 98, 97, com.google.common.base.Ascii.CR, 82, 101, 78, 80, 97, 89, 102, com.google.common.base.Ascii.CR, 92, 91, 82, com.google.common.base.Ascii.CR, 97, 82, 101, 97, com.google.common.base.Ascii.CR, 80, 85, 86, 89, 81, com.google.common.base.Ascii.ESC, -10, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, -12, 7, com.google.common.base.Ascii.DLE, 6, 7, com.google.common.base.Ascii.DC4, -9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 73, com.google.common.base.Ascii.SO, -9, 74, 102, com.google.common.base.Ascii.RS, 48, -6, -5, 75, com.google.common.base.Ascii.EM};
    }

    static {
        A05();
    }

    public static com.facebook.ads.redexgen.core.KM A01(com.facebook.ads.redexgen.core.KM km, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(km);
        while (!arrayDeque.isEmpty()) {
            com.facebook.ads.redexgen.core.KM km2 = (com.facebook.ads.redexgen.core.KM) arrayDeque.pop();
            com.facebook.ads.redexgen.core.KT kt = km2.A04;
            java.lang.String[] A0H = km2.A0H();
            if (A01[6].length() != 8) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "prCmMBcG";
            com.facebook.ads.redexgen.core.KT A02 = A02(kt, A0H, map);
            if (A02 != null && A02.A09() == 3) {
                return km2;
            }
            for (int A0C = km2.A0C() - 1; A0C >= 0; A0C--) {
                arrayDeque.push(km2.A0D(A0C));
            }
        }
        return null;
    }

    public static com.facebook.ads.redexgen.core.KT A02(com.facebook.ads.redexgen.core.KT kt, java.lang.String[] strArr, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map) {
        int i = 0;
        if (kt == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                com.facebook.ads.redexgen.core.KT kt2 = new com.facebook.ads.redexgen.core.KT();
                int length = strArr.length;
                while (i < length) {
                    kt2.A0O(map.get(strArr[i]));
                    i++;
                }
                return kt2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                java.lang.String str = strArr[0];
                java.lang.String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new java.lang.RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return kt.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new java.lang.RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i < length3) {
                        com.facebook.ads.redexgen.core.KT kt3 = map.get(strArr[i]);
                        if (A01[5].length() != 27) {
                            throw new java.lang.RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        kt.A0O(kt3);
                        i++;
                    }
                    return kt;
                }
            }
        }
        return kt;
    }

    public static java.lang.String A04(java.lang.String str) {
        java.lang.String A03 = A03(1, 2, 53);
        java.lang.String A032 = A03(0, 1, 14);
        java.lang.String replaceAll = str.replaceAll(A03, A032);
        java.lang.String out = A03(4, 5, 69);
        java.lang.String replaceAll2 = replaceAll.replaceAll(out, A032);
        java.lang.String A033 = A03(3, 1, 6);
        java.lang.String replaceAll3 = replaceAll2.replaceAll(A032, A033);
        java.lang.String out2 = A03(77, 11, 123);
        return replaceAll3.replaceAll(out2, A033);
    }

    public static void A06(android.text.Spannable spannable, int i, int i2, com.facebook.ads.redexgen.core.KT kt, com.facebook.ads.redexgen.core.KM km, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map, int i3) {
        com.facebook.ads.redexgen.core.KM A012;
        com.facebook.ads.redexgen.core.KT A02;
        int i4;
        int i5;
        int i6;
        if (kt.A0A() != -1) {
            spannable.setSpan(new android.text.style.StyleSpan(kt.A0A()), i, i2, 33);
        }
        if (kt.A0b()) {
            spannable.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (kt.A0c()) {
            spannable.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (kt.A0a()) {
            com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.ForegroundColorSpan(kt.A06()), i, i2, 33);
        }
        boolean A0Z = kt.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (A0Z) {
                com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.BackgroundColorSpan(kt.A05()), i, i2, 33);
            }
            if (kt.A0W() != null) {
                com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.TypefaceSpan(kt.A0W()), i, i2, 33);
            }
            if (kt.A0D() != null) {
                com.facebook.ads.redexgen.core.KI ki = (com.facebook.ads.redexgen.core.KI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(kt.A0D());
                if (ki.A01 == -1) {
                    java.lang.String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        if (i3 == 2 || i3 == 1) {
                            i4 = 3;
                        } else {
                            i4 = 1;
                        }
                        i5 = 1;
                    }
                } else {
                    i4 = ki.A01;
                    i5 = ki.A00;
                }
                if (ki.A02 == -2) {
                    i6 = 1;
                } else {
                    i6 = ki.A02;
                }
                com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new com.facebook.ads.redexgen.core.C2141pO(i4, i5, i6), i, i2, 33);
            }
            switch (kt.A09()) {
                case 2:
                    com.facebook.ads.redexgen.core.KM A002 = A00(km, map);
                    if (A002 != null && (A012 = A01(A002, map)) != null) {
                        if (A012.A0C() == 1) {
                            com.facebook.ads.redexgen.core.KM containerNode = A012.A0D(0);
                            if (containerNode.A08 != null) {
                                com.facebook.ads.redexgen.core.KM containerNode2 = A012.A0D(0);
                                java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(containerNode2.A08);
                                com.facebook.ads.redexgen.core.KT A022 = A02(A012.A04, A012.A0H(), map);
                                int A08 = A022 != null ? A022.A08() : -1;
                                if (A08 == -1 && (A02 = A02(A002.A04, A002.A0H(), map)) != null) {
                                    A08 = A02.A08();
                                }
                                spannable.setSpan(new com.facebook.ads.redexgen.core.C2142pP(str, A08), i, i2, 33);
                                break;
                            }
                        }
                        com.facebook.ads.redexgen.core.AbstractC04284g.A06(A03(63, 14, 47), A03(9, 54, 122));
                        break;
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new com.facebook.ads.redexgen.core.KF(), i, i2, 33);
                    break;
            }
            if (kt.A0Y()) {
                com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new com.facebook.ads.redexgen.core.C2143pQ(), i, i2, 33);
            }
            switch (kt.A07()) {
                case 1:
                    com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.AbsoluteSizeSpan((int) kt.A03(), true), i, i2, 33);
                    return;
                case 2:
                    com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.RelativeSizeSpan(kt.A03()), i, i2, 33);
                    return;
                case 3:
                    com.facebook.ads.redexgen.core.AbstractC04153t.A00(spannable, new android.text.style.RelativeSizeSpan(kt.A03() / 100.0f), i, i2, 33);
                    return;
                default:
                    return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static void A07(android.text.SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
