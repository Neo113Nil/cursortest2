package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0735Gv {
    public static byte[] A06;
    public static java.lang.String[] A07 = {com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final java.lang.String A04;
    public final java.util.List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0735Gv A00(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C3K {
        try {
            c04434v.A0g(4);
            int A0I = (c04434v.A0I() & 3) + 1;
            if (A0I == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int A0I2 = c04434v.A0I() & 31;
            for (int i = 0; i < A0I2; i++) {
                arrayList.add(A03(c04434v));
            }
            int A0I3 = c04434v.A0I();
            java.lang.String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i2 = 0; i2 < A0I3; i2++) {
                arrayList.add(A03(c04434v));
            }
            int i3 = -1;
            int i4 = -1;
            float f = 1.0f;
            java.lang.String str = null;
            if (A0I2 > 0) {
                com.facebook.ads.redexgen.core.HR A09 = com.facebook.ads.redexgen.core.HS.A09((byte[]) arrayList.get(0), A0I, ((byte[]) arrayList.get(0)).length);
                i3 = A09.A0A;
                i4 = A09.A03;
                f = A09.A00;
                str = com.facebook.ads.redexgen.core.AnonymousClass46.A01(A09.A08, A09.A01, A09.A04);
            }
            return new com.facebook.ads.redexgen.core.C0735Gv(arrayList, A0I, i3, i4, f, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.facebook.ads.redexgen.core.C3K.A01(A01(0, 24, 51), e);
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 30);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C0735Gv(java.util.List<byte[]> initializationData, int i, int i2, int i3, float f, java.lang.String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A04 = str;
    }

    public static byte[] A03(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0M = c04434v.A0M();
        int offset = c04434v.A09();
        c04434v.A0g(A0M);
        return com.facebook.ads.redexgen.core.AnonymousClass46.A07(c04434v.A0l(), offset, A0M);
    }
}
