package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1068Tx {
    public static byte[] A0F;
    public static final com.facebook.ads.internal.protocol.AdPlacementType A0G;
    public static final java.lang.String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public com.facebook.ads.internal.protocol.AdPlacementType A0B;
    public boolean A0D;

    @javax.annotation.Nullable
    public java.util.List<com.facebook.ads.internal.dto.AdCookieData> A0C = null;
    public final long A0E = java.lang.System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C1068Tx(java.util.Map<java.lang.String, java.lang.String> map) {
        char c;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = 10000;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 37))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 14))) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 32))) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 26))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 14))) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (key.equals(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 4, 34))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 71))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 858630459:
                    if (key.equals(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 24, 119))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 79))) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 46))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 41))) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 88))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 52))) {
                        c = 7;
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
                    this.A0B = com.facebook.ads.internal.protocol.AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = java.lang.Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case '\b':
                    this.A00 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case '\t':
                    this.A08 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case '\n':
                    this.A09 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case '\f':
                    try {
                        this.A07 = java.lang.Integer.parseInt(entry.getValue());
                        break;
                    } catch (java.lang.NumberFormatException unused) {
                        this.A07 = 200;
                        break;
                    }
            }
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{67, 65, 67, 72, 69, 65, 66, 76, 69, 93, 90, 66, 85, 88, 93, 80, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 91, 90, 107, 80, 65, 70, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 91, 90, 107, 93, 90, 107, 71, 81, 87, 91, 90, 80, 71, 4, 0, 7, 54, com.google.common.base.Ascii.US, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, 8, com.google.common.base.Ascii.VT, 0, 5, 0, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, 54, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, 10, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.GS, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, 6, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.ESC, 19, com.google.common.base.Ascii.CAN, 2, 41, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.US, 17, com.google.common.base.Ascii.RS, 2, 106, 118, 123, 121, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 69, 109, 115, 126, 110, 114, 114, 101, 102, 114, 101, 115, 104, 121, 110, 109, 121, 110, 120, 99, 84, Byte.MAX_VALUE, 99, 121, 110, 120, 99, 100, 103, 111, 124, 107, Byte.MAX_VALUE, 123, 107, 125, 122, 81, 122, 103, 99, 107, 97, 123, 122, 120, 117, 124, 105, com.google.common.base.Ascii.ETB, 8, 5, 4, com.google.common.base.Ascii.SO, 62, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.FF, 4, 62, 17, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, 8, com.google.common.base.Ascii.SI, 6, 62, 8, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, 4, 19, com.google.common.base.Ascii.ETB, 0, com.google.common.base.Ascii.CR, 113, 110, 98, 112, 102, 101, 110, 107, 110, 115, 126, 88, 100, 111, 98, 100, 108, 88, 110, 105, 110, 115, 110, 102, 107, 88, 99, 98, 107, 102, 126, 86, 73, 69, 87, 65, 66, 73, 76, 73, 84, 89, Byte.MAX_VALUE, 67, 72, 69, 67, 75, Byte.MAX_VALUE, 73, 78, 84, 69, 82, 86, 65, 76, 47, 48, 60, 46, 56, 59, 48, 53, 48, 45, 32, 6, 58, 49, 60, 58, 50, 6, 45, 48, 58, 50, 60, 43};
    }

    static {
        A02();
        A0H = com.facebook.ads.redexgen.core.C1068Tx.class.getSimpleName();
        A0G = com.facebook.ads.internal.protocol.AdPlacementType.UNKNOWN;
    }

    @javax.annotation.Nullable
    public static com.facebook.ads.redexgen.core.C1068Tx A00(@javax.annotation.Nullable org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        java.util.HashMap hashMap = new java.util.HashMap();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, java.lang.String.valueOf(jSONObject.opt(next)));
        }
        return new com.facebook.ads.redexgen.core.C1068Tx(hashMap);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final com.facebook.ads.internal.protocol.AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
