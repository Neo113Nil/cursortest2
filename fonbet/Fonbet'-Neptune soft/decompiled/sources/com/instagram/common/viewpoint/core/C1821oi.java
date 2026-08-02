package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1821oi implements C1S {
    public final C1825om A00;

    @Deprecated
    public final C02769r A01;
    public final C1823ok A02;
    public final C2Q A03;

    @Deprecated
    public final C1822oj A04;
    public final C1819og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C1821oi A09 = new C2I().A05();
    public static final C1R<C1821oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C1821oi A00;
            A00 = C1821oi.A00(bundle);
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
    public static C1821oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C1823ok A6X = bundle2 == null ? C1823ok.A07 : C1823ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C1819og A6X2 = bundle3 == null ? C1819og.A0Z : C1819og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C1821oi(str, bundle4 == null ? C02769r.A00 : C1825om.A05.A6X(bundle4), null, A6X, A6X2);
    }

    public C1821oi(String str, C02769r c02769r, C1822oj c1822oj, C1823ok c1823ok, C1819og c1819og) {
        this.A06 = str;
        this.A03 = c1822oj;
        this.A04 = c1822oj;
        this.A02 = c1823ok;
        this.A05 = c1819og;
        this.A00 = c02769r;
        this.A01 = c02769r;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1821oi)) {
            return false;
        }
        C1821oi c1821oi = (C1821oi) obj;
        if (AbstractC01424a.A1E(this.A06, c1821oi.A06)) {
            C1825om c1825om = this.A00;
            C1825om c1825om2 = c1821oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c1825om.equals(c1825om2) && AbstractC01424a.A1E(this.A03, c1821oi.A03) && AbstractC01424a.A1E(this.A02, c1821oi.A02) && AbstractC01424a.A1E(this.A05, c1821oi.A05)) {
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
        C1825om c1825om = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int charAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (charAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c1825om.hashCode();
        return ((hashCode + result4) * 31) + this.A05.hashCode();
    }
}
