package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class V7 {
    public static byte[] A07;
    public final double A00;
    public final double A01 = java.lang.System.currentTimeMillis() / 1000.0d;
    public final com.facebook.ads.redexgen.core.VC A02;
    public final com.facebook.ads.redexgen.core.VD A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public final java.util.Map<java.lang.String, java.lang.String> A06;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.util.Map<java.lang.String, java.lang.String> A01(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static void A02() {
        A07 = new byte[]{36, 43, 36, 41, 42, 34, 107, 118, 109, 99, 109, 106, 101, 104, 91, 103, 104, 109, 97, 106, 112, 91, 112, 107, 111, 97, 106, 75, 80, 87, 77, 84, 92, 103, 81, 86, 91, 84, 77, 92, 93, 103, 81, 86, 103, 94, 77, 86, 86, 93, 84};
    }

    public V7(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, double d, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, com.facebook.ads.redexgen.core.VC vc, com.facebook.ads.redexgen.core.VD vd, boolean z) {
        this.A05 = str;
        this.A00 = d;
        this.A04 = str2;
        this.A02 = vc;
        this.A03 = vd;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(A00(27, 24, 18), java.lang.String.valueOf(z));
        }
        java.lang.String A01 = com.facebook.ads.redexgen.core.VK.A01(str);
        if (!android.text.TextUtils.isEmpty(A01) && (z || vd == com.facebook.ads.redexgen.core.VD.A0C)) {
            hashMap.put(A00(6, 21, 46), A01);
        }
        if (A0B()) {
            java.util.Map<java.lang.String, java.lang.String> extraData = t8.A04().A6w();
            hashMap.put(A00(0, 6, 111), com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(extraData));
        }
        java.util.Map<java.lang.String, java.lang.String> extraData2 = A01(hashMap);
        this.A06 = extraData2;
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.VC A05() {
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.VD A06() {
        return this.A03;
    }

    public final java.lang.String A07() {
        return this.A04;
    }

    public final java.lang.String A08() {
        return this.A05;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !android.text.TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        return this.A02 == com.facebook.ads.redexgen.core.VC.A05;
    }
}
