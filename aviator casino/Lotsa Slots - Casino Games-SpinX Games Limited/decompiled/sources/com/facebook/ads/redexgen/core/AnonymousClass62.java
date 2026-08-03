package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass62 extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC0783Is {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public com.facebook.ads.redexgen.core.C1581fp A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.Y2 A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1409d1 A06;
    public final com.facebook.ads.redexgen.core.C1420dC A07;
    public final java.lang.String A08;
    public final boolean A09;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 43, 58, 55, 59, 48, kotlin.io.encoding.Base64.padSymbol, 59, com.google.common.base.Ascii.DLE, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 4, com.google.common.base.Ascii.FF, 56, com.google.common.base.Ascii.DC4, 8, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, 4, 2, 90, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 66, 81, 117, 80, 112, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 85, 118, 65, 90, 80, 88, 81, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CR, 2, 7, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.SYN, 9, 5, com.google.common.base.Ascii.ETB, 52, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 5};
    }

    static {
        A02();
    }

    public AnonymousClass62(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1409d1 interfaceC1409d1, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, java.lang.String str, int i, com.facebook.ads.redexgen.core.Y2 y2) {
        super(c1636gi);
        this.A03 = c1636gi;
        this.A04 = va;
        this.A02 = abstractC1801jd;
        this.A08 = str;
        this.A06 = interfaceC1409d1;
        this.A01 = i;
        com.facebook.ads.redexgen.core.C1420dC preloadedDynamicWebViewController = com.facebook.ads.redexgen.core.AbstractC1421dD.A02(abstractC1801jd.A1D());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new com.facebook.ads.redexgen.core.C1420dC(this.A03, abstractC1801jd, va, i);
            com.facebook.ads.redexgen.core.AbstractC1421dD.A03(abstractC1801jd, this.A07);
            this.A09 = false;
        }
        if (y2 != null) {
            this.A05 = y2;
            this.A07.A0Z(y2);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new com.facebook.ads.redexgen.core.JJ(this));
        this.A07.A0a(interfaceC1409d1);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(c1636gi)) {
            c1636gi.A0B().AKp(this.A07.A0O(), abstractC1801jd.A2E(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A66();
            this.A07.A0X();
        } else {
            this.A03.A0F().A67();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ADm(this);
                    }
                    if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A03)) {
                        com.facebook.ads.redexgen.core.VM A0B2 = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new java.lang.RuntimeException();
                        }
                        A0B[5] = "";
                        A0B2.ADb();
                    }
                } else {
                    AKD();
                }
            }
        }
        A08();
    }

    private final void A04() {
        com.facebook.ads.redexgen.core.C1420dC.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(android.content.Intent intent, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        intent.putExtra(A01(157, 8, 110), com.facebook.ads.redexgen.core.WK.A07);
        intent.putExtra(A01(130, 18, 58), abstractC1801jd);
        intent.addFlags(268435456);
    }

    private final void A06(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        com.facebook.ads.internal.util.activity.AdActivityIntent A05 = com.facebook.ads.redexgen.core.C1140Wu.A05(this.A03);
        A05(A05, abstractC1801jd);
        try {
            com.facebook.ads.redexgen.core.C1140Wu.A0B(this.A03, A05);
        } catch (java.lang.Exception e) {
            this.A03.A08().ABC(A01(107, 11, 42), com.facebook.ads.redexgen.core.AbstractC1048Td.A0D, new com.facebook.ads.redexgen.core.C1049Te(e));
            android.util.Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.C1315bV c1315bV = new com.facebook.ads.redexgen.core.C1315bV(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A2A());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A01(118, 12, 105), A01(148, 9, 96));
        c1315bV.A05(this.A02.A2E(), str, hashMap);
    }

    public final void A08() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9f() {
        A07(this.A02.A29().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9g(java.lang.String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9k() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AAm() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.JF(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AE0() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AE4() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AEu(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AFz() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGX(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGZ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGo(java.lang.String str) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AKD() {
        if (this.A06 != null) {
            this.A06.ADm(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void close() {
    }

    public com.facebook.ads.redexgen.core.VA getAdEventManager() {
        return this.A04;
    }

    public com.facebook.ads.redexgen.core.C1420dC getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A00 = c1581fp;
        this.A07.A0e(c1581fp);
    }
}
