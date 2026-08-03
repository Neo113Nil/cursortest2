package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC0643Dg extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1524eu, android.view.View.OnClickListener {
    public com.facebook.ads.redexgen.core.C0673Ek A00;
    public final com.facebook.ads.redexgen.core.EA A01;
    public final com.facebook.ads.redexgen.core.E4 A02;
    public final com.facebook.ads.redexgen.core.E2 A03;
    public final com.facebook.ads.redexgen.core.E0 A04;
    public final com.facebook.ads.redexgen.core.C1548fI A05;
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);

    public ViewOnClickListenerC0643Dg(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A04 = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.3a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg.this.setVisibility(0);
            }
        };
        this.A02 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.3Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg.this.A05;
                c1548fI.setChecked(true);
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.3Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg.this.A05;
                c1548fI.setChecked(false);
            }
        };
        this.A01 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.3X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg.this.A05;
                c1548fI.setChecked(true);
            }
        };
        com.facebook.ads.redexgen.core.YB.A0V(this, com.facebook.ads.redexgen.core.YB.A06(855638016, A06));
        this.A05 = new com.facebook.ads.redexgen.core.C1548fI(c1636gi, true);
        this.A05.setChecked(true);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A07 || this.A00.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A05 || this.A00.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06) {
                this.A00.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 11);
            } else if (this.A00.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A0A) {
                this.A00.A0i(true, 7);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(java.lang.String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(java.lang.String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
