package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends com.facebook.ads.redexgen.core.AbstractC1199Zd {
    public static java.lang.String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public final android.widget.RelativeLayout A00;
    public final com.facebook.ads.redexgen.core.C0926Og A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;

    public ME(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, com.facebook.ads.redexgen.core.C0906Nm c0906Nm, com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi, va, str, c0906Nm, interfaceC1178Yi, interfaceC1177Yh);
        this.A02 = c1636gi;
        this.A01 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        this.A00 = new android.widget.RelativeLayout(getContext());
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.YB.A0N(this.A00, -1728053248);
        if (com.facebook.ads.redexgen.core.C1086Up.A2b(c1636gi)) {
            this.A00.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.ME.this.A0T(view);
                }
            });
        }
    }

    public static android.widget.RelativeLayout.LayoutParams A00(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.Explode());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0O() {
        com.facebook.ads.redexgen.core.C0930Ok A0A = this.A01.A0A();
        com.facebook.ads.redexgen.core.C1214Zs c1214Zs = new com.facebook.ads.redexgen.core.C1214Zs(this.A02);
        c1214Zs.setInfo(com.facebook.ads.redexgen.core.YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1214Zs.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1205Zj(this));
        com.facebook.ads.redexgen.core.C0930Ok A0B = this.A01.A0B();
        com.facebook.ads.redexgen.core.C1214Zs c1214Zs2 = new com.facebook.ads.redexgen.core.C1214Zs(this.A02);
        c1214Zs2.setInfo(com.facebook.ads.redexgen.core.YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1214Zs2.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1206Zk(this));
        com.facebook.ads.redexgen.core.C1214Zs c1214Zs3 = new com.facebook.ads.redexgen.core.C1214Zs(this.A02);
        c1214Zs3.setInfo(com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1214Zs3.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1207Zl(this));
        android.widget.LinearLayout.LayoutParams itemParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        com.facebook.ads.redexgen.core.YB.A0N(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c1214Zs, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c1214Zs2, itemParams);
        }
        linearLayout.addView(c1214Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0P() {
        this.A00.removeAllViews();
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0Q(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        java.lang.String A0E;
        int i;
        java.lang.String str;
        if (enumC0928Oi == com.facebook.ads.redexgen.core.EnumC0928Oi.A05) {
            return;
        }
        boolean z = enumC0928Oi == com.facebook.ads.redexgen.core.EnumC0928Oi.A06;
        com.facebook.ads.redexgen.core.C1196Za c1196Za = new com.facebook.ads.redexgen.core.C1196Za(this.A02, this.A0D);
        if (z) {
            com.facebook.ads.redexgen.core.C0926Og c0926Og = this.A01;
            if (A03[4].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c0926Og.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        com.facebook.ads.redexgen.core.C1196Za A0D = c1196Za.A0H(A0E).A0G(this.A01.A0D()).A0E(c0930Ok.A04()).A0D(z ? com.facebook.ads.redexgen.core.YM.REPORT_AD : com.facebook.ads.redexgen.core.YM.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        com.facebook.ads.redexgen.core.C1196Za A0C = A0D.A0C(i);
        if (this.A0C != null) {
            com.facebook.ads.redexgen.core.C0906Nm c0906Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                str = c0906Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c0906Nm.A01();
            }
        } else {
            str = "";
        }
        com.facebook.ads.redexgen.core.C1197Zb adHiddenView = A0C.A0F(str).A0L();
        com.facebook.ads.redexgen.core.YB.A0N(adHiddenView, -1);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c0930Ok, enumC0928Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0R(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        java.lang.String A0H;
        boolean z = enumC0928Oi == com.facebook.ads.redexgen.core.EnumC0928Oi.A06;
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A02;
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf = this.A0D;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        com.facebook.ads.redexgen.core.C1217Zv c1217Zv = new com.facebook.ads.redexgen.core.C1217Zv(c1636gi, c0930Ok, interfaceC1201Zf, A0H, z ? com.facebook.ads.redexgen.core.YM.REPORT_AD : com.facebook.ads.redexgen.core.YM.HIDE_AD);
        c1217Zv.setClickable(true);
        com.facebook.ads.redexgen.core.YB.A0N(c1217Zv, -1);
        c1217Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        android.widget.RelativeLayout relativeLayout = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1217Zv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(android.view.View view) {
        this.A0D.A54();
    }
}
