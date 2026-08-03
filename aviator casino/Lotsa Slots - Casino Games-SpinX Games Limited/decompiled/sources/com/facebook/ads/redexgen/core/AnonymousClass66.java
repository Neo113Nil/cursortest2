package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass66 extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi, com.facebook.ads.redexgen.core.InterfaceC0783Is {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public com.facebook.ads.redexgen.core.C0998Re A00;
    public com.facebook.ads.redexgen.core.InterfaceC1004Rk A01;
    public com.facebook.ads.redexgen.core.InterfaceC1426dI A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.VA A08;
    public final com.facebook.ads.redexgen.core.VI A09;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0A;
    public final com.facebook.ads.redexgen.core.Y2 A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0C;
    public final com.facebook.ads.redexgen.core.ZU A0D;
    public final com.facebook.ads.redexgen.core.C1412d4 A0E;
    public final com.facebook.ads.redexgen.core.C1420dC A0F;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A0G;
    public final com.facebook.ads.redexgen.core.C1581fp A0H;

    public static java.lang.String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{com.google.common.base.Ascii.CAN, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, com.google.common.base.Ascii.CAN, 38, 35, com.google.common.base.Ascii.CAN, 46, 41, 35, 34, 63, 46, 37, 44, 36, 35, 40, 41, com.google.common.base.Ascii.DC2, 44, 41, com.google.common.base.Ascii.DC2, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, com.google.common.base.Ascii.US, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public AnonymousClass66(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.ZU zu, int i) {
        super(c1636gi);
        this.A01 = new com.facebook.ads.redexgen.core.C0795Je(this);
        this.A0G = new com.facebook.ads.redexgen.core.C0794Jd(this);
        this.A03 = true;
        this.A07 = c1636gi;
        this.A08 = va;
        this.A0C = interfaceC1177Yh;
        this.A06 = abstractC1801jd;
        this.A0D = zu;
        com.facebook.ads.redexgen.core.C1420dC A02 = com.facebook.ads.redexgen.core.AbstractC1421dD.A02(abstractC1801jd.A1D());
        if (A02 == null) {
            this.A0F = new com.facebook.ads.redexgen.core.C1420dC(this.A07, abstractC1801jd, va, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new com.facebook.ads.redexgen.core.JU(this));
        com.facebook.ads.redexgen.core.YB.A0G(1003, this.A0F.A0O());
        if (this.A06.A1U()) {
            this.A0E = new com.facebook.ads.redexgen.core.C1412d4(this.A07, this.A08, this.A06, new com.facebook.ads.redexgen.core.C1042Sx(this.A07), this.A09, this.A0C, this.A0D, new com.facebook.ads.redexgen.core.JT(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1408d0(this));
            addView(this.A0E, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        android.view.ViewGroup mediaView = getMediaView();
        this.A0H = new com.facebook.ads.redexgen.core.C1581fp(mediaView, 1, new java.lang.ref.WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0m());
        this.A0H.A0X(this.A06.A0n());
        this.A0F.A0e(this.A0H);
        this.A0A = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0A.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        setBackgroundColor(0);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(c1636gi)) {
            c1636gi.A0B().AKp(mediaView, abstractC1801jd.A2E(), false, false, true);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean A2L = abstractC1801jd.A2L();
            java.lang.String A0B = A0B(68, 18, 20);
            java.lang.String A0B2 = A0B(36, 16, 107);
            java.lang.String A0B3 = A0B(52, 16, 97);
            java.lang.String A0B4 = A0B(26, 10, 1);
            if (A2L) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0r());
            } else if (com.facebook.ads.redexgen.core.XC.A05(abstractC1801jd.A0z())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, this.A06.A0r());
            }
            this.A0F.A0j(jSONObject);
        } catch (org.json.JSONException unused) {
            this.A0F.A0M().A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        com.facebook.ads.redexgen.core.C1459dq A0F = new com.facebook.ads.redexgen.core.Cdo(this.A07, this.A06.A29().A0I(), this.A06.A2C()).A0A(this.A06.A28().A01()).A0F();
        addView(A0F, new android.widget.FrameLayout.LayoutParams(-1, -1));
        A0F.A04(new com.facebook.ads.redexgen.core.JK(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0F().A66();
            this.A0F.A0X();
        } else {
            this.A07.A0F().A67();
            if (this.A0F.A0k()) {
                AKD();
                if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A07)) {
                    this.A07.A0B().ADb();
                }
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            com.facebook.ads.redexgen.core.C1420dC c1420dC = this.A0F;
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new java.lang.RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            android.view.ViewGroup parent = c1420dC.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A0C.A45(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (this.A06.A1V()) {
            this.A0A.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A03);
        }
    }

    private void A0F(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.C1315bV c1315bV = new com.facebook.ads.redexgen.core.C1315bV(this.A07, this.A0D.A7M(), this.A0H, this.A0B, this.A08, this.A06.A2A(), this.A0C);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A0B(86, 12, 108), A0B(98, 9, 19));
        c1315bV.A05(this.A06.A2E(), str, hashMap);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9f() {
        A0F(this.A06.A29().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9g(java.lang.String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void A9k() {
        this.A0C.A4j(this.A0D.A6l());
        com.facebook.ads.redexgen.core.C1504ea serverSideRewardHandler = new com.facebook.ads.redexgen.core.C1504ea(this.A07, this.A0D, this.A06.A1G(), this.A0C);
        serverSideRewardHandler.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AAm() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.JN(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        com.facebook.ads.redexgen.core.C1420dC.A0B().incrementAndGet();
        c0998Re.A0A(this.A01);
        this.A00 = c0998Re;
        A0E();
        if (this.A06.A29().A0W()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AE0() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AE4() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AEu(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0T(z);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AFz() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGX(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGZ(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AGo(java.lang.String str) {
        java.lang.String urlString = this.A06.A2F(str);
        if (urlString == null) {
            return;
        }
        com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), this.A07, com.facebook.ads.redexgen.core.XB.A00(urlString), this.A06.A2E());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void AKD() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0783Is
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A07.A0F().AB0();
        this.A00.finish(4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A06.A2E();
    }

    private android.view.ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A07)) {
            this.A07.A0B().AKU(getMediaView());
        }
        com.facebook.ads.redexgen.core.C1412d4 c1412d4 = this.A0E;
        java.lang.String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new java.lang.RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (c1412d4 != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.AB7(this.A06.A2E(), new com.facebook.ads.redexgen.core.C1293b9().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        com.facebook.ads.redexgen.core.AbstractC1421dD.A04(this.A06.A1D());
        com.facebook.ads.redexgen.core.C1420dC.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }

    public void setRtfActionsJavascriptListener(com.facebook.ads.redexgen.core.InterfaceC1426dI interfaceC1426dI) {
        this.A02 = interfaceC1426dI;
    }
}
