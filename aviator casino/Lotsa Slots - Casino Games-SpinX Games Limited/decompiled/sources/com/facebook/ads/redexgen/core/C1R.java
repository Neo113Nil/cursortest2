package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1R, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1R extends com.facebook.ads.redexgen.core.C8T {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"W2LX5ghCjNUdHPD6UOG9gNVP2r8Jjr9N", "hy0Kd51hxMRklx2U40MO6uTjDebxbFFc", "3rXKYQ25IDS9XLMelMDoz8fDuc1jWejt", "VHZF6nyXCVj1GWlzSFxOxU8Mk9", "1hZxQPwvp7yuSjm13xBtOFGqAv7wvaBL", "2txr67moghbeiUbFZCBGyiXHK8tBuFWn", "gHf8B0vtrS2LcJp", "q573XCdkPfkFHQHQX29TvMro8DPY3qfe"};
    public static final java.util.regex.Pattern A07;
    public float A00;
    public float A01;
    public java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KC> A02;
    public final com.facebook.ads.redexgen.core.K7 A03;
    public final boolean A04;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A05 = new byte[]{85, 39, 48, 53, 39, 83, 107, 36, 38, 53, 38, 48, 39, 83, 107, 36, 38, 53, 39, 83, 107, 36, 38, 84, 53, 33, 82, 39, 83, 107, 36, 38, 75, 35, 52, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, 5, com.google.common.base.Ascii.NAK, 74, 75, 98, Byte.MAX_VALUE, 96, 108, 121, 55, 101, 93, 95, 70, 70, 95, 88, 81, com.google.common.base.Ascii.SYN, 17, 101, 66, 79, 90, 83, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.SYN, 90, 95, 88, 83, com.google.common.base.Ascii.SYN, 84, 83, 80, 89, 68, 83, com.google.common.base.Ascii.SYN, 17, 112, 89, 68, 91, 87, 66, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.SYN, 90, 95, 88, 83, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 37, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 6, 6, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 17, 86, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM, 17, 3, 19, 86, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 19, 86, com.google.common.base.Ascii.DC4, 19, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, 4, 19, 86, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 6, com.google.common.base.Ascii.SUB, 19, 2, 19, 86, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, 4, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ETB, 2, 76, 86, 53, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, 8, 1, 70, 2, com.google.common.base.Ascii.SI, 7, 10, 9, 1, 19, 3, 70, 10, com.google.common.base.Ascii.SI, 8, 3, 70, 17, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 70, 0, 3, 17, 3, com.google.common.base.Ascii.DC4, 70, 5, 9, 10, 19, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.NAK, 70, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 7, 8, 70, 0, 9, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, 7, com.google.common.base.Ascii.DC2, 92, 70, 66, 122, 120, 97, 97, 120, Byte.MAX_VALUE, 118, 49, 120, Byte.MAX_VALUE, 103, 112, 125, 120, 117, 49, 101, 120, 124, 120, Byte.MAX_VALUE, 118, 43, 49, 101, 69, 87, 114, 83, 85, 89, 82, 83, 68, 36, 3, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC2, 77, 45, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN, 88, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 66, 88, 40, 54, 5, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.GS, 7, 0, 46, 94, 86, 102, 119, 108, 117, 113, 37, 76, 107, 99, 106, 88, com.google.common.base.Ascii.CR, 0, 98, 118, 5, 34, 47, 58, 51, 37, com.google.common.base.Ascii.VT, 124, 113, 19, 7, 116, 83, 94, 75, 66, 84, 122, 7, 70, 85, 66, 7, 73, 72, 83, 7, 84, 82, 87, 87, 72, 85, 83, 66, 67, 75, 70, 36, 59, 48, 67, 100, 105, 124, 117, 99, 77, 92, 78, 5, 49, 108, 94, 5, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.DLE, 6, com.google.common.base.Ascii.CR, 94, 66, 79, 87, 92, 75, 93, 87, -72, -38};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0D(java.lang.String str, com.facebook.ads.redexgen.core.K7 k7, java.util.List<java.util.List<com.facebook.ads.redexgen.core.C2146pT>> list, java.util.List<java.lang.Long> list2) {
        java.lang.String A072 = A07(34, 9, 116);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(str.startsWith(A072));
        java.lang.String[] split = str.substring(A072.length()).split(A07(32, 1, 99), k7.A01);
        int length = split.length;
        int i = k7.A01;
        java.lang.String A073 = A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50);
        if (length != i) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A073, A07(143, 55, 98) + str);
            return;
        }
        long A04 = A04(split[k7.A02]);
        java.lang.String A074 = A07(198, 25, 21);
        if (A04 == -9223372036854775807L) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A073, A074 + str);
            return;
        }
        long A042 = A04(split[k7.A00]);
        if (A042 == -9223372036854775807L) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A073, A074 + str);
            return;
        }
        com.facebook.ads.redexgen.core.KC kc = (this.A02 == null || k7.A03 == -1) ? null : this.A02.get(split[k7.A03].trim());
        java.lang.String str2 = split[k7.A04];
        com.facebook.ads.redexgen.core.K9 A02 = com.facebook.ads.redexgen.core.K9.A02(str2);
        java.lang.String A043 = com.facebook.ads.redexgen.core.K9.A04(str2);
        java.lang.String A075 = A07(331, 2, 4);
        java.lang.String A076 = A07(0, 1, 91);
        com.facebook.ads.redexgen.core.C2146pT A062 = A06(A043.replace(A075, A076).replace(A07(335, 2, 52), A076).replace(A07(333, 2, 93), A07(353, 2, 126)), kc, A02, this.A01, this.A00);
        int A03 = A03(A042, list2, list);
        for (int A032 = A03(A04, list2, list); A032 < A03; A032++) {
            list.get(A032).add(A062);
        }
    }

    static {
        A09();
        A07 = java.util.regex.Pattern.compile(A07(1, 31, 11));
    }

    public C1R() {
        this(null);
    }

    public C1R(java.util.List<byte[]> list) {
        super(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50));
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            java.lang.String A0q = com.facebook.ads.redexgen.core.C5C.A0q(list.get(0));
            java.lang.String formatLine = A07(43, 7, 9);
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(A0q.startsWith(formatLine));
            this.A03 = (com.facebook.ads.redexgen.core.K7) com.facebook.ads.redexgen.core.AbstractC04203y.A01(com.facebook.ads.redexgen.core.K7.A00(A0q));
            A0A(new com.facebook.ads.redexgen.core.C04434v(list.get(1)));
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    public static float A00(int i) {
        switch (i) {
            case 0:
                return 0.05f;
            case 1:
                return 0.5f;
            case 2:
                return 0.95f;
            default:
                return -3.4028235E38f;
        }
    }

    public static int A01(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                if (A06[3].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                A06[6] = "Sg07jKGUv12uLKgMKKFA3fI9zPLxcTEi";
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                if (A06[3].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A06;
                strArr[5] = "bBVjASvxGIVEucqGKWBeREj1nHP5tR7K";
                strArr[4] = "afA0CT9VteApb4cGitBpBAxXonSmRtRK";
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r8.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r3 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9.add(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r0 = r3 - 1;
        r1 = new java.util.ArrayList(r9.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(long j, java.util.List<java.lang.Long> list, java.util.List<java.util.List<com.facebook.ads.redexgen.core.C2146pT>> list2) {
        int i = 0;
        int insertionIndex = list.size();
        int i2 = insertionIndex - 1;
        while (true) {
            if (i2 < 0) {
                break;
            }
            long longValue = list.get(i2).longValue();
            int i3 = A06[7].charAt(28);
            if (i3 == 116) {
                throw new java.lang.RuntimeException();
            }
            A06[7] = "L6yhcoI2CoUL0EEbj8PtMmDYbUY1DBiP";
            if (longValue == j) {
                return i2;
            }
            if (list.get(i2).longValue() < j) {
                i = i2 + 1;
                break;
            }
            i2--;
        }
    }

    public static long A04(java.lang.String str) {
        java.util.regex.Matcher matcher = A07.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (java.lang.Long.parseLong((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(1))) * 60 * 60 * 1000000) + (java.lang.Long.parseLong((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(2))) * 60 * 1000000) + (java.lang.Long.parseLong((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(3))) * 1000000) + (java.lang.Long.parseLong((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(4))) * 10000);
    }

    public static android.text.Layout.Alignment A05(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return null;
            case 1:
            case 4:
            case 7:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static com.facebook.ads.redexgen.core.C2146pT A06(java.lang.String str, com.facebook.ads.redexgen.core.KC kc, com.facebook.ads.redexgen.core.K9 k9, float f, float f2) {
        int i;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        com.facebook.ads.redexgen.core.C04103o A0G = new com.facebook.ads.redexgen.core.C04103o().A0G(spannableString);
        if (kc != null) {
            if (kc.A04 != null) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(kc.A04.intValue()), 0, spannableString.length(), 33);
            }
            if (kc.A02 == 3 && kc.A03 != null) {
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(kc.A03.intValue()), 0, spannableString.length(), 33);
            }
            if (kc.A00 != -3.4028235E38f) {
                if (A06[3].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A06;
                strArr[5] = "hamZaHHK5iJw0vPowwB4Xi3W6GQULYkl";
                strArr[4] = "AtQHcqF1nJuVU9oQ1sBsNKUnqzSBt8ub";
                if (f2 != -3.4028235E38f) {
                    A0G.A08(kc.A00 / f2, 1);
                }
            }
            if (kc.A06 && kc.A07) {
                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
            } else if (kc.A06) {
                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
            } else if (kc.A07) {
                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (kc.A09) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (kc.A08) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = k9.A00;
        if (A06[6].length() == 19) {
            throw new java.lang.RuntimeException();
        }
        A06[7] = "i2mc5u7bs2HiiqvdNfcyeR2hNUTbHa8c";
        if (i2 != -1) {
            i = k9.A00;
        } else if (kc != null) {
            i = kc.A01;
        } else {
            i = -1;
        }
        com.facebook.ads.redexgen.core.C04103o cue = A0G.A0F(A05(i));
        cue.A0A(A02(i)).A09(A01(i));
        if (k9.A01 != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            A0G.A04(k9.A01.x / f);
            A0G.A07(k9.A01.y / f2, 0);
        } else {
            A0G.A04(A00(A0G.A01()));
            A0G.A07(A00(A0G.A00()), 0);
        }
        return A0G.A0H();
    }

    public static java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KC> A08(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.facebook.ads.redexgen.core.K8 k8 = null;
        while (true) {
            java.lang.String A0T = c04434v.A0T();
            if (A0T == null || (c04434v.A07() != 0 && c04434v.A0B() == 91)) {
                break;
            }
            if (A0T.startsWith(A07(43, 7, 9))) {
                k8 = com.facebook.ads.redexgen.core.K8.A00(A0T);
            } else if (A0T.startsWith(A07(233, 6, 115))) {
                if (k8 == null) {
                    java.lang.String currentLine = A07(50, 46, 50) + A0T;
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), currentLine);
                } else {
                    com.facebook.ads.redexgen.core.KC A04 = com.facebook.ads.redexgen.core.KC.A04(A0T, k8);
                    if (A04 != null) {
                        linkedHashMap.put(A04.A05, A04);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void A0A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        while (true) {
            java.lang.String A0T = c04434v.A0T();
            if (A0T != null) {
                if (A07(266, 13, 1).equalsIgnoreCase(A0T)) {
                    A0B(c04434v);
                } else if (A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 12, 20).equalsIgnoreCase(A0T)) {
                    this.A02 = A08(c04434v);
                } else if (A07(279, 11, 82).equalsIgnoreCase(A0T)) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A06(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(290, 29, 35));
                } else if (A07(258, 8, 119).equalsIgnoreCase(A0T)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r5.equals(A07(345, 8, 31)) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r5.equals(A07(345, 8, 42)) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r5.equals(A07(337, 8, 113)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0B(com.facebook.ads.redexgen.core.C04434v c04434v) {
        while (true) {
            java.lang.String A0T = c04434v.A0T();
            if (A0T != null) {
                if (c04434v.A07() == 0 || c04434v.A0B() != 91) {
                    java.lang.String[] split = A0T.split(A07(33, 1, 29));
                    if (split.length == 2) {
                        char c = 0;
                        java.lang.String A01 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(split[0].trim());
                        java.lang.String currentLine = A06[7];
                        if (currentLine.charAt(28) != 't') {
                            java.lang.String[] strArr = A06;
                            strArr[5] = "TxjPtR6Me2tOCH56RvBuXVxOpTFPkhKs";
                            strArr[4] = "CGC80sv4xmOos6ad3yBESqJRjeXwJGgE";
                            switch (A01.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    java.lang.String currentLine2 = A06[0];
                                    if (currentLine2.charAt(2) == 'L') {
                                        A06[3] = "57knmpqjR0Ls81goizN6npBH6l";
                                        break;
                                    } else {
                                        java.lang.String[] strArr2 = A06;
                                        strArr2[5] = "y7TEYh3wOWaLWgkmzZBlA5JQj6rjOZZg";
                                        strArr2[4] = "3gq1Vhf6xja9YBkNvRBFSeYMsj86kNRf";
                                        break;
                                    }
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    this.A01 = java.lang.Float.parseFloat(split[1].trim());
                                    break;
                                case 1:
                                    try {
                                        this.A00 = java.lang.Float.parseFloat(split[1].trim());
                                        break;
                                    } catch (java.lang.NumberFormatException unused) {
                                        break;
                                    }
                            }
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void A0C(com.facebook.ads.redexgen.core.C04434v c04434v, java.util.List<java.util.List<com.facebook.ads.redexgen.core.C2146pT>> list, java.util.List<java.lang.Long> list2) {
        com.facebook.ads.redexgen.core.K7 k7 = this.A04 ? this.A03 : null;
        while (true) {
            java.lang.String A0T = c04434v.A0T();
            if (A0T != null) {
                if (A0T.startsWith(A07(43, 7, 9))) {
                    k7 = com.facebook.ads.redexgen.core.K7.A00(A0T);
                } else if (A0T.startsWith(A07(34, 9, 116))) {
                    if (k7 == null) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(96, 47, 114) + A0T);
                    } else {
                        A0D(A0T, k7, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8T
    public final com.facebook.ads.redexgen.core.InterfaceC0800Jj A0g(byte[] bArr, int i, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(bArr, i);
        if (!this.A04) {
            A0A(c04434v);
        }
        A0C(c04434v, arrayList, arrayList2);
        return new com.facebook.ads.redexgen.core.C1923le(arrayList, arrayList2);
    }
}
