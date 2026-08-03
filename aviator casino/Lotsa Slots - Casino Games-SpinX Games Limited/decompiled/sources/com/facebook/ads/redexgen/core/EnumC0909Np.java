package com.facebook.ads.redexgen.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
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
/* renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC0909Np {
    public static byte[] A01;
    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC0909Np[] A02;
    public static final com.facebook.ads.redexgen.core.EnumC0909Np A03;
    public static final com.facebook.ads.redexgen.core.EnumC0909Np A04;
    public static final com.facebook.ads.redexgen.core.EnumC0909Np A05;
    public final java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, 5, 7, -6, -8, -10, -8, -3, -6, com.google.common.base.Ascii.SI, -3, -6, com.google.common.base.Ascii.SO, 1, -3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ETB, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        java.lang.String A012 = A01(27, 16, 101);
        A05 = new com.facebook.ads.redexgen.core.EnumC0909Np(A012, 0, A012);
        java.lang.String A013 = A01(13, 14, 98);
        A04 = new com.facebook.ads.redexgen.core.EnumC0909Np(A013, 1, A013);
        java.lang.String A014 = A01(0, 13, 12);
        A03 = new com.facebook.ads.redexgen.core.EnumC0909Np(A014, 2, A014);
        A02 = A03();
    }

    public EnumC0909Np(java.lang.String str, int i, java.lang.String str2) {
        this.A00 = str2;
    }

    public static com.facebook.ads.redexgen.core.EnumC0909Np A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.EnumC0909Np enumC0909Np : values()) {
            if (enumC0909Np.A00.equalsIgnoreCase(str)) {
                return enumC0909Np;
            }
        }
        return A03;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.EnumC0909Np[] A03() {
        return new com.facebook.ads.redexgen.core.EnumC0909Np[]{A05, A04, A03};
    }

    public static com.facebook.ads.redexgen.core.EnumC0909Np valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.EnumC0909Np) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.EnumC0909Np.class, str);
    }

    public static com.facebook.ads.redexgen.core.EnumC0909Np[] values() {
        return (com.facebook.ads.redexgen.core.EnumC0909Np[]) A02.clone();
    }
}
