package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0852Wh {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1428hy A02;
    public final C1153dL A03;
    public final Wf A04;

    public C0852Wh(C1153dL c1153dL, AbstractC1428hy abstractC1428hy, Wf wf) {
        this.A03 = c1153dL;
        this.A04 = wf;
        this.A02 = abstractC1428hy;
    }

    public static C0852Wh A00(C1153dL c1153dL, AbstractC1428hy abstractC1428hy, Wf wf) {
        Object creativeAsCtaLoggingHelper = c1153dL.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C0852Wh(c1153dL, abstractC1428hy, wf);
            c1153dL.A0P(creativeAsCtaLoggingHelper);
        }
        return (C0852Wh) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C1153dL c1153dL) {
        return U7.A1b(c1153dL) && WN.A0I(c1153dL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0851Wg A02(AbstractC1428hy abstractC1428hy) {
        if (U7.A1h(this.A03)) {
            r4 = abstractC1428hy.A1W() && A01(this.A03);
            return new C0851Wg(r4, r4);
        }
        boolean A1W = abstractC1428hy.A1W();
        if (A1W) {
            boolean A01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
        }
        r4 = false;
        return new C0851Wg(A1W, r4);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
