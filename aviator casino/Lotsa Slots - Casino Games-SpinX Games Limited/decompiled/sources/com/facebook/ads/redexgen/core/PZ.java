package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class PZ extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0G;
    public static final java.lang.String A0H;
    public static final int A0I;
    public long A00;
    public long A01;
    public java.lang.String A02;
    public boolean A03;
    public java.lang.String A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A06;
    public final android.widget.LinearLayout A07;
    public final com.facebook.ads.redexgen.core.C0998Re A08;
    public final com.facebook.ads.redexgen.core.C1636gi A09;
    public final com.facebook.ads.redexgen.core.VA A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0B;
    public final com.facebook.ads.redexgen.core.C1265ah A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC1274aq A0D;
    public final com.facebook.ads.redexgen.core.M3 A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC1279av A0F;

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0E() {
        A0G = new byte[]{90, 112, 112, 125, 112, com.google.common.base.Ascii.DC4, 63, kotlin.io.encoding.Base64.padSymbol, 112, 19, 63, 62, 36, 53, 62, 36, 112, com.google.common.base.Ascii.FS, 63, 49, 52, 53, 52, 112, 4, 57, kotlin.io.encoding.Base64.padSymbol, 53, 106, 112, 48, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 118, 85, 91, 94, com.google.common.base.Ascii.SUB, 124, 83, 84, 83, 73, 82, com.google.common.base.Ascii.SUB, 110, 83, 87, 95, 0, com.google.common.base.Ascii.SUB, 95, 117, 117, 120, 117, com.google.common.base.Ascii.EM, 58, 52, 49, 117, 6, 33, 52, 39, 33, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, 45, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SUB, 95, 58, 17, com.google.common.base.Ascii.ESC, 95, 43, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, 69, 95, 109, 71, 71, 74, 71, 52, 4, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 71, 53, 2, 6, 3, com.google.common.base.Ascii.RS, 71, 51, com.google.common.base.Ascii.SO, 10, 2, 93, 71, 87, 125, 125, 112, 125, com.google.common.base.Ascii.SO, 56, 46, 46, 52, 50, 51, 125, com.google.common.base.Ascii.ESC, 52, 51, 52, 46, 53, 125, 9, 52, 48, 56, 103, 125, 42, com.google.common.base.Ascii.SUB, 48, 48, kotlin.io.encoding.Base64.padSymbol, 48, 88, 113, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, 37, 125, 115, 126, 113, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, 37, 44, 35, 41, 33, 40, 63, com.google.common.base.Ascii.EM, 36, 32, 40};
    }

    static {
        A0E();
        A0H = com.facebook.ads.redexgen.core.PZ.class.getSimpleName();
        A0I = com.facebook.ads.redexgen.core.XV.A0A;
    }

    public PZ(com.facebook.ads.redexgen.core.C0998Re c0998Re, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, boolean z) {
        super(c1636gi);
        com.facebook.ads.redexgen.core.M3 m3;
        this.A06 = new com.facebook.ads.redexgen.core.C0948Pc(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A08 = c0998Re;
        this.A0A = va;
        this.A0B = interfaceC1177Yh;
        this.A09 = c1636gi;
        if (c1636gi.A0E() == null) {
            c1636gi.A0F().A9v();
        }
        this.A0D = A0F();
        if (com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(c1636gi) || c1636gi.A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(c1636gi, this.A0D);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(c1636gi, c1636gi.A0E(), this.A0D);
        }
        this.A0E = m3;
        this.A0F = A0C(z);
        this.A07 = (android.widget.LinearLayout) this.A0F;
        this.A07.setId(android.view.View.generateViewId());
        this.A0F.setListener(new com.facebook.ads.redexgen.core.C0947Pb(this));
        this.A0E.setBrowserNavigationListener(this.A0F.getBrowserNavigationListener());
        this.A0C = new com.facebook.ads.redexgen.core.C1265ah(c1636gi, null, android.R.attr.progressBarStyleHorizontal);
        A0G();
        c0998Re.A0A(this.A06);
    }

    private com.facebook.ads.redexgen.core.InterfaceC1279av A0C(boolean z) {
        if (z) {
            return new com.facebook.ads.redexgen.core.M8(this.A09, this.A0E, false);
        }
        return new com.facebook.ads.redexgen.core.M6(this.A09, this.A0E);
    }

    public com.facebook.ads.redexgen.core.InterfaceC1274aq A0F() {
        return new com.facebook.ads.redexgen.core.C0946Pa(this);
    }

    public void A0G() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A07.setPadding(com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b);
        this.A0B.A45(this.A07, layoutParams);
        android.widget.RelativeLayout.LayoutParams webViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A07.getId());
        webViewParams.addRule(12);
        this.A0B.A45(this.A0E, webViewParams);
        android.widget.RelativeLayout.LayoutParams webViewParams2 = new android.widget.RelativeLayout.LayoutParams(-1, A0I);
        webViewParams2.addRule(3, this.A07.getId());
        this.A0C.setProgress(0);
        this.A0B.A45(this.A0C, webViewParams2);
    }

    public void A0H() {
        this.A08.finish(1);
    }

    public void A0I(java.lang.String str) {
    }

    public void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        if (this.A01 < 0) {
            this.A01 = java.lang.System.currentTimeMillis();
        }
        java.lang.String A0D = A0D(231, 11, 97);
        java.lang.String A0D2 = A0D(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 11, 26);
        java.lang.String url = A0D(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(A0D2);
            this.A00 = intent.getLongExtra(A0D, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(A0D2);
            this.A00 = bundle.getLong(A0D, -1L);
        }
        java.lang.String A0D3 = this.A02 != null ? this.A02 : A0D(199, 11, 51);
        this.A0F.setUrl(A0D3);
        this.A0E.loadUrl(A0D3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            com.facebook.ads.redexgen.core.C1268ak A07 = new com.facebook.ads.redexgen.core.C1267aj(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(java.lang.System.currentTimeMillis()).A07();
            this.A0A.AB5(this.A04, A07.A02());
            if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                java.lang.String str = A0D(169, 30, 15) + java.lang.System.currentTimeMillis() + A0D(149, 20, 60) + A07.A01 + A0D(53, 22, 121) + A07.A03 + A0D(75, 24, 83) + A07.A04 + A0D(0, 30, 124) + A07.A00 + A0D(99, 24, 75) + A07.A05 + A0D(30, 23, 22) + A07.A02 + A0D(123, 26, 113) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
        bundle.putString(A0D(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A0B(this.A06);
        com.facebook.ads.redexgen.core.AbstractC1288b4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }
}
