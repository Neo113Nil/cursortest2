package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.q7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2185q7 implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final com.facebook.ads.redexgen.core.C2190qC A00;

    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.AW A01;
    public final com.facebook.ads.redexgen.core.C2188qA A02;
    public final com.facebook.ads.redexgen.core.AnonymousClass32 A03;

    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.C2187q9 A04;
    public final com.facebook.ads.redexgen.core.C2180q2 A05;
    public final java.lang.String A06;
    public static java.lang.String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final com.facebook.ads.redexgen.core.C2185q7 A09 = new com.facebook.ads.redexgen.core.C03922u().A05();
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2185q7> A08 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.C2185q7 A00;
            A00 = com.facebook.ads.redexgen.core.C2185q7.A00(bundle);
            return A00;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C2185q7 A00(android.os.Bundle bundle) {
        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(bundle.getString(A02(0), ""));
        android.os.Bundle bundle2 = bundle.getBundle(A02(1));
        com.facebook.ads.redexgen.core.C2188qA A6f = bundle2 == null ? com.facebook.ads.redexgen.core.C2188qA.A07 : com.facebook.ads.redexgen.core.C2188qA.A06.A6f(bundle2);
        android.os.Bundle bundle3 = bundle.getBundle(A02(2));
        com.facebook.ads.redexgen.core.C2180q2 A6f2 = bundle3 == null ? com.facebook.ads.redexgen.core.C2180q2.A0Z : com.facebook.ads.redexgen.core.C2180q2.A0Y.A6f(bundle3);
        android.os.Bundle bundle4 = bundle.getBundle(A02(3));
        return new com.facebook.ads.redexgen.core.C2185q7(str, bundle4 == null ? com.facebook.ads.redexgen.core.AW.A00 : com.facebook.ads.redexgen.core.C2190qC.A05.A6f(bundle4), null, A6f, A6f2);
    }

    public C2185q7(java.lang.String str, com.facebook.ads.redexgen.core.AW aw, com.facebook.ads.redexgen.core.C2187q9 c2187q9, com.facebook.ads.redexgen.core.C2188qA c2188qA, com.facebook.ads.redexgen.core.C2180q2 c2180q2) {
        this.A06 = str;
        this.A03 = c2187q9;
        this.A04 = c2187q9;
        this.A02 = c2188qA;
        this.A05 = c2180q2;
        this.A00 = aw;
        this.A01 = aw;
    }

    public static java.lang.String A02(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C2185q7)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2185q7 c2185q7 = (com.facebook.ads.redexgen.core.C2185q7) obj;
        if (com.facebook.ads.redexgen.core.C5C.A1E(this.A06, c2185q7.A06)) {
            com.facebook.ads.redexgen.core.C2190qC c2190qC = this.A00;
            com.facebook.ads.redexgen.core.C2190qC c2190qC2 = c2185q7.A00;
            java.lang.String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c2190qC.equals(c2190qC2) && com.facebook.ads.redexgen.core.C5C.A1E(this.A03, c2185q7.A03) && com.facebook.ads.redexgen.core.C5C.A1E(this.A02, c2185q7.A02) && com.facebook.ads.redexgen.core.C5C.A1E(this.A05, c2185q7.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int hashCode = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        com.facebook.ads.redexgen.core.C2190qC c2190qC = this.A00;
        java.lang.String[] strArr = A07;
        java.lang.String str = strArr[4];
        java.lang.String str2 = strArr[3];
        int charAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (charAt != result3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c2190qC.hashCode();
        return ((hashCode + result4) * 31) + this.A05.hashCode();
    }
}
