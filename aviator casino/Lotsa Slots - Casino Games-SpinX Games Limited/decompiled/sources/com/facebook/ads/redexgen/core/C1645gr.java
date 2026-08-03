package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1645gr implements com.facebook.ads.redexgen.core.InterfaceC1028Sj {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"XX81oR58WpEsQKvqY2LExbYJLqP9XswE", "az8CKzVkexBjitPsCylcg2AVWlGeK3EI", "bGZ3", "xIFKC7mmnDHSKxOkrjRNDYdlMsmKF1A7", "XScWVG1X4Mc8JZxVJlT03KGo8WKkDIiE", "ymPwCIBu7cN5wKkxYqt2Z3a", "4biB1nxlWznGwE3vHvSlKad", "lswyJVFYW7lcf"};
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.AbstractC1026Sh> A00 = new java.util.HashMap();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[6].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[4] = "T1kvqoJ1cX6i4DSx7n80qqGN8Qg91HVj";
            strArr2[3] = "zM5VtNN21yuLINvrTPslJyIzIvAVUrXA";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{49, 42, com.google.common.base.Ascii.SYN, 49, 55, 44, 43, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1028Sj
    public final synchronized java.lang.String AIb() {
        java.lang.StringBuilder sb;
        sb = new java.lang.StringBuilder();
        java.util.Iterator<com.facebook.ads.redexgen.core.AbstractC1026Sh> it = this.A00.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A00(0, 8, 15));
        }
        return sb.toString();
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1028Sj
    public final synchronized void reset() {
        this.A00.clear();
    }
}
