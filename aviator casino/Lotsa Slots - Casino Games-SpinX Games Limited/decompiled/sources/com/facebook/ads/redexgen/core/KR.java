package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KR implements com.facebook.ads.redexgen.core.InterfaceC1274aq {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, kotlin.io.encoding.Base64.padSymbol, 59, 53, 72, kotlin.io.encoding.Base64.padSymbol, 67, 66, 51, kotlin.io.encoding.Base64.padSymbol, 53, 54};
    }

    public KR(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF7(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.M3 m32;
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        c1265ah = this.A00.A0H;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah, 8);
        abstractC1801jd = this.A00.A0E;
        if (abstractC1801jd.A1l()) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                abstractC1801jd2 = this.A00.A0E;
                java.lang.String A14 = abstractC1801jd2.A14();
                if (!android.text.TextUtils.isEmpty(A14)) {
                    m32 = this.A00.A0I;
                    m32.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF9(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        boolean z;
        int i;
        this.A00.A0T = true;
        c1265ah = this.A00.A0H;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah, 0);
        this.A00.setUrlToBrowser(str);
        z = this.A00.A0R;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0R = true;
                this.A00.A0h(A00(0, 19, 108));
            }
        }
        com.facebook.ads.redexgen.core.KE.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFY(int i) {
        boolean z;
        z = this.A00.A0T;
        if (z) {
            this.A00.setBrowserProgressBarValue(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFb(java.lang.String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFe() {
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        c1353c7 = this.A00.A0J;
        c1353c7.A0C().ADJ(14);
    }
}
