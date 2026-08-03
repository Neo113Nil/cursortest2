package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class XS {
    public static java.lang.String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final android.os.Handler A01 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.XQ A04;

    public XS(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.XQ xq) {
        this.A03 = c1636gi;
        this.A04 = xq;
        this.A02 = abstractC1801jd;
    }

    public static com.facebook.ads.redexgen.core.XS A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.XQ xq) {
        java.lang.Object creativeAsCtaLoggingHelper = c1636gi.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new com.facebook.ads.redexgen.core.XS(c1636gi, abstractC1801jd, xq);
            c1636gi.A0P(creativeAsCtaLoggingHelper);
        }
        return (com.facebook.ads.redexgen.core.XS) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        return com.facebook.ads.redexgen.core.C1086Up.A1g(c1636gi) && com.facebook.ads.redexgen.core.X6.A0I(c1636gi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.XR A02(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (com.facebook.ads.redexgen.core.C1086Up.A1m(this.A03)) {
            r4 = abstractC1801jd.A1e() && A01(this.A03);
            return new com.facebook.ads.redexgen.core.XR(r4, r4);
        }
        boolean A1e = abstractC1801jd.A1e();
        if (A1e) {
            boolean A01 = A01(this.A03);
            java.lang.String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
        }
        r4 = false;
        return new com.facebook.ads.redexgen.core.XR(A1e, r4);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
