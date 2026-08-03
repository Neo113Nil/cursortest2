package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0826Kj {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"Tlnn5cKjLaIjRpnStB3TtMXpCr", "3ektkjDKhO", "UADsPGxQMgbdHUVZTw2T7TudB6ybNpUs", "wMkteQxfp4DsqI2DXiVAWfh1RT3", "vTGkM2prP14EX1TDx6P9XqiD0Fmww", "sal8paYv5RRrD9uY6TWNX8GISo", "qTpYd1bjPJIA7eigqjtgMToqdlzi", "UsOSpCey7qyyyJdYXs2GK2q4qSEth0kx"};
    public final int A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.util.Set<java.lang.String> A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{2, 73, 59};
        if (A05[2].charAt(0) == 'K') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A05;
        strArr[6] = "WMYi1W8Xbtf0WzjxHgJrZE6ARrtq";
        strArr[1] = "r4jVis15Qe";
    }

    static {
        A03();
    }

    public C0826Kj(java.lang.String str, int i, java.lang.String str2, java.util.Set<java.lang.String> classes) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static com.facebook.ads.redexgen.core.C0826Kj A00() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        java.lang.String A02 = A02(0, 0, 5);
        return new com.facebook.ads.redexgen.core.C0826Kj(A02, 0, A02, emptySet);
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C0826Kj A01(java.lang.String str, int i) {
        java.lang.String trim;
        java.lang.String trim2 = str.trim();
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(!trim2.isEmpty());
        int indexOf = trim2.indexOf(A02(0, 1, 24));
        if (indexOf == -1) {
            trim = A02(0, 0, 5);
        } else {
            trim = trim2.substring(indexOf).trim();
            trim2 = trim2.substring(0, indexOf);
        }
        java.lang.String[] A1O = com.facebook.ads.redexgen.core.C5C.A1O(trim2, A02(1, 2, 47));
        java.lang.String str2 = A1O[0];
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 1; i2 < voiceStartIndex; i2++) {
            hashSet.add(A1O[i2]);
        }
        return new com.facebook.ads.redexgen.core.C0826Kj(str2, i, trim, hashSet);
    }
}
