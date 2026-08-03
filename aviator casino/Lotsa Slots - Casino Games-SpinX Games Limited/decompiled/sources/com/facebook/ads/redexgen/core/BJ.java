package com.facebook.ads.redexgen.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
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
/* loaded from: assets/audience_network/classes2.dex */
public abstract class BJ implements com.facebook.ads.redexgen.core.InterfaceC1847kO<java.util.Map.Entry<?, ?>, java.lang.Object> {
    public static byte[] A00;
    public static final /* synthetic */ com.facebook.ads.redexgen.core.BJ[] A01;
    public static final com.facebook.ads.redexgen.core.BJ A02;
    public static final com.facebook.ads.redexgen.core.BJ A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final java.lang.String A012 = A01(0, 3, 56);
        final int i = 0;
        A02 = new com.facebook.ads.redexgen.core.BJ(A012, i) { // from class: com.facebook.ads.redexgen.X.2H
            {
                com.facebook.ads.redexgen.core.BL bl = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC1847kO
            @javax.annotation.CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object A4B(java.util.Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final java.lang.String A013 = A01(3, 5, 110);
        final int i2 = 1;
        A03 = new com.facebook.ads.redexgen.core.BJ(A013, i2) { // from class: com.facebook.ads.redexgen.X.2G
            {
                com.facebook.ads.redexgen.core.BL bl = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC1847kO
            @javax.annotation.CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object A4B(java.util.Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public BJ(java.lang.String $enum$name, int $enum$ordinal) {
    }

    public /* synthetic */ BJ(java.lang.String str, int i, com.facebook.ads.redexgen.core.BL bl) {
        this(str, i);
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.BJ[] A03() {
        return new com.facebook.ads.redexgen.core.BJ[]{A02, A03};
    }

    public static com.facebook.ads.redexgen.core.BJ valueOf(java.lang.String name) {
        return (com.facebook.ads.redexgen.core.BJ) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.BJ.class, name);
    }

    public static com.facebook.ads.redexgen.core.BJ[] values() {
        return (com.facebook.ads.redexgen.core.BJ[]) A01.clone();
    }
}
