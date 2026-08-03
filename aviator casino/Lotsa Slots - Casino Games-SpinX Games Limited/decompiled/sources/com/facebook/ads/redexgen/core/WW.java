package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class WW implements com.facebook.ads.redexgen.core.VA {
    public static com.facebook.ads.redexgen.core.VA A03;
    public static byte[] A04;
    public static final java.lang.String A05;
    public static volatile boolean A06;
    public final com.facebook.ads.redexgen.core.C1632ge A00;
    public final com.facebook.ads.redexgen.core.UR A01;
    public final com.facebook.ads.redexgen.core.V9 A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, 7, 3, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 87, 3, com.google.common.base.Ascii.CAN, 87, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, 87, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, 87, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 1, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF};
    }

    static {
        A03();
        A05 = com.facebook.ads.redexgen.core.WW.class.getSimpleName();
        A06 = false;
    }

    public WW(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.V8 dispatchCallback;
        this.A00 = c1632ge;
        if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0T(c1632ge)) {
            this.A01 = com.facebook.ads.redexgen.core.UP.A00(c1632ge);
            dispatchCallback = com.facebook.ads.redexgen.core.VF.A00(c1632ge, this.A01);
        } else {
            com.facebook.ads.redexgen.core.AnonymousClass71 A01 = com.facebook.ads.redexgen.core.UP.A01(c1632ge);
            dispatchCallback = com.facebook.ads.redexgen.core.VF.A01(c1632ge, A01);
            this.A01 = A01;
        }
        this.A02 = new com.facebook.ads.redexgen.core.Wm(c1632ge, dispatchCallback);
        com.facebook.ads.redexgen.core.YG.A08.execute(new com.facebook.ads.redexgen.core.WY(this));
        A04(c1632ge);
    }

    public static synchronized com.facebook.ads.redexgen.core.VA A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.VA va;
        synchronized (com.facebook.ads.redexgen.core.WW.class) {
            if (A03 == null) {
                A03 = new com.facebook.ads.redexgen.core.WW(c1632ge);
            }
            va = A03;
        }
        return va;
    }

    public static synchronized void A04(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        synchronized (com.facebook.ads.redexgen.core.WW.class) {
            if (A06) {
                return;
            }
            c1632ge.A04().ACn();
            A06 = true;
        }
    }

    private void A05(com.facebook.ads.redexgen.core.V7 v7) {
        if (!v7.A0A()) {
            android.util.Log.e(A05, A02(7, 29, 55) + v7.A06() + A02(0, 7, 82));
        } else {
            A06(v7);
            this.A01.AL6(v7, new com.facebook.ads.redexgen.core.WX(this, v7));
        }
    }

    private void A06(com.facebook.ads.redexgen.core.V7 v7) {
        switch (v7.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(new java.lang.Exception(A02(36, 5, 86)));
                c1049Te.A05(1);
                try {
                    c1049Te.A07(new org.json.JSONObject().put(A02(48, 4, 41), v7.A06().toString()));
                } catch (org.json.JSONException unused) {
                }
                this.A00.A08().ABD(A02(41, 7, 112), com.facebook.ads.redexgen.core.AbstractC1048Td.A1H, c1049Te);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AB3(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AB5(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AB6(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A07).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AB7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A08).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABB(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABF(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABJ(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0D).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABK(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABL(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0F).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABM(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0K).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABn(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0H).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABp(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0J).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABq(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data, java.lang.String str2, com.facebook.ads.redexgen.core.VC vc) {
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(vc).A02(com.facebook.ads.redexgen.core.VD.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABr(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.V7 adEvent = new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABx(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0N).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ABy(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0O).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AC0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0P).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AC3(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A04).A02(com.facebook.ads.redexgen.core.VD.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AC8(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0Q).A06(com.facebook.ads.redexgen.core.VK.A0A(str, com.facebook.ads.redexgen.core.VH.A0o)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AC9(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void ACB(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(com.facebook.ads.redexgen.core.VC.A05).A02(com.facebook.ads.redexgen.core.VD.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.VA
    public final void AGz(java.lang.String str) {
        new com.facebook.ads.redexgen.core.AsyncTaskC1607gF(this.A00).execute(str);
    }
}
