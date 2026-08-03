package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3L, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3L extends com.facebook.ads.redexgen.core.ED implements android.view.View.OnClickListener {
    public final com.facebook.ads.redexgen.core.EA A00;
    public final com.facebook.ads.redexgen.core.E4 A01;
    public final com.facebook.ads.redexgen.core.E2 A02;
    public final com.facebook.ads.redexgen.core.E0 A03;
    public final com.facebook.ads.redexgen.core.C1548fI A04;

    public C3L(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, null);
    }

    public C3L(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet) {
        this(c1636gi, attributeSet, 0);
    }

    public C3L(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i) {
        super(c1636gi, attributeSet, i);
        this.A03 = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.3R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.C3L.this.setVisibility(0);
            }
        };
        this.A01 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.3Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.C3L.this.A04;
                c1548fI.setChecked(true);
            }
        };
        this.A02 = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.3O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.C3L.this.A04;
                c1548fI.setChecked(false);
            }
        };
        this.A00 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.3M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.C3L.this.A04;
                c1548fI.setChecked(true);
            }
        };
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new com.facebook.ads.redexgen.core.C1548fI(c1636gi);
        this.A04.setChecked(true);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.C0673Ek videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A07 || videoView.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A05 || videoView.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06) {
                videoView.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 11);
            } else if (videoView.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A0A) {
                videoView.A0i(true, 7);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(java.lang.String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(java.lang.String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
