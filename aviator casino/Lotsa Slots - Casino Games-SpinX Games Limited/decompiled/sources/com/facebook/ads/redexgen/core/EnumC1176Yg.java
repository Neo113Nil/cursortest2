package com.facebook.ads.redexgen.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A08' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC1176Yg {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"V62FSpXyXg0rt4sPiNo", "6lq6AHOCdAk9akPwvyC", "nqUSJeC0aIJYgUKl2CPVEyh1brd6E0Ae", "x0NdoFH36D", "29PPikSq1e", "88nHmfXS0I", "EpErG0pNHZnmsJ1", "e2q5yIycFm4TxUxK8s9XbNDHLyuGtCe3"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC1176Yg[] A07;
    public static final com.facebook.ads.redexgen.core.EnumC1176Yg A08;
    public static final com.facebook.ads.redexgen.core.EnumC1176Yg A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final java.lang.Integer A03;
    public final boolean A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-33, -30, -15, -34, -35, -30, -24, -21, -35, -16};
    }

    static {
        java.lang.Integer num;
        java.lang.Integer num2;
        A01();
        num = com.facebook.ads.redexgen.core.C0950Pe.A0D;
        A08 = new com.facebook.ads.redexgen.core.EnumC1176Yg(A00(0, 5, 92), 0, num, -1, -15986668, 858468406, true);
        num2 = com.facebook.ads.redexgen.core.C0950Pe.A0E;
        A09 = new com.facebook.ads.redexgen.core.EnumC1176Yg(A00(5, 5, 95), 1, num2, Integer.MIN_VALUE, -1, 452984831, false);
        A07 = A02();
    }

    public EnumC1176Yg(java.lang.String str, int i, java.lang.Integer num, int i2, int i3, int i4, boolean z) {
        this.A03 = num;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = z;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.EnumC1176Yg[] A02() {
        return new com.facebook.ads.redexgen.core.EnumC1176Yg[]{A08, A09};
    }

    public static com.facebook.ads.redexgen.core.EnumC1176Yg valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.EnumC1176Yg) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.EnumC1176Yg.class, str);
    }

    public static com.facebook.ads.redexgen.core.EnumC1176Yg[] values() {
        com.facebook.ads.redexgen.core.EnumC1176Yg[] enumC1176YgArr = (com.facebook.ads.redexgen.core.EnumC1176Yg[]) A07.clone();
        if (A06[3].length() != 10) {
            throw new java.lang.RuntimeException();
        }
        A06[3] = "b4MYrm3ZFw";
        return enumC1176YgArr;
    }
}
