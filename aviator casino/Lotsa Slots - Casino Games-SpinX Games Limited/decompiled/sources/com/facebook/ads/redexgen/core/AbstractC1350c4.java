package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.c4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1350c4 {
    public static java.lang.String[] A00 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static com.facebook.ads.redexgen.core.AbstractC1349c3 A00(com.facebook.ads.redexgen.core.C1353c7 c1353c7, android.os.Bundle bundle, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC1349c3 ku;
        c1353c7.A06().A0H().A00(false);
        com.facebook.ads.redexgen.core.NR A29 = c1353c7.A05().A29();
        double A002 = com.facebook.ads.redexgen.core.AbstractC1340bu.A00(A29);
        boolean isWatchAndBrowse = c1353c7.A05().A29().A0T();
        boolean A06 = com.facebook.ads.redexgen.core.AbstractC1340bu.A06(c1353c7.A00(), c1353c7.A01(), A002);
        com.facebook.ads.redexgen.core.AbstractC0888Mt A003 = com.facebook.ads.redexgen.core.C0889Mu.A00(c1353c7.A06(), c1353c7.A07(), "", com.facebook.ads.redexgen.core.XB.A00(c1353c7.A05().A29().A0J().A05()), new java.util.HashMap(), c1353c7.A05().A2A());
        boolean z2 = !android.text.TextUtils.isEmpty(A29.A0H().A09());
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(c1353c7.A06())) {
            com.facebook.ads.redexgen.core.C1636gi A062 = c1353c7.A06();
            java.lang.String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            A062.A0B().AKn(c1353c7.A02(), c1353c7.A05().A2E(), z2);
        }
        if (isWatchAndBrowse && (A003 instanceof com.facebook.ads.redexgen.core.AnonymousClass84)) {
            ku = A01(c1353c7) ? new com.facebook.ads.redexgen.core.C0799Ji(c1353c7) : new com.facebook.ads.redexgen.core.KE(c1353c7);
        } else if (z2) {
            ku = new com.facebook.ads.redexgen.core.C6H(c1353c7);
        } else {
            if (c1353c7.A05().A1c()) {
                return new com.facebook.ads.redexgen.core.C0819Kc(c1353c7);
            }
            if (c1353c7.A05().A1j()) {
                ku = new com.facebook.ads.redexgen.core.C6K(c1353c7);
            } else if (com.facebook.ads.redexgen.core.C1086Up.A2i(c1353c7.A06())) {
                ku = new com.facebook.ads.redexgen.core.C6J(c1353c7, A06);
            } else if (A06) {
                ku = new com.facebook.ads.redexgen.core.KZ(c1353c7, c1353c7.A00() == 2);
            } else {
                ku = new com.facebook.ads.redexgen.core.KU(c1353c7, com.facebook.ads.redexgen.core.AbstractC1340bu.A04(A002));
            }
        }
        if (z) {
            ku.A1H(A29, c1353c7.A05().A2E(), A002, bundle);
        }
        return ku;
    }

    public static boolean A01(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        if (!c1353c7.A05().A1y()) {
            boolean A1c = c1353c7.A05().A1c();
            java.lang.String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!A1c) {
                return false;
            }
        }
        return true;
    }
}
