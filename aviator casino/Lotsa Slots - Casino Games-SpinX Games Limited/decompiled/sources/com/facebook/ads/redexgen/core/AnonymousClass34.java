package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.34, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass34 extends com.facebook.ads.redexgen.core.ED {
    public final android.graphics.Paint A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.VI A02;
    public final com.facebook.ads.redexgen.core.EA A03;
    public final com.facebook.ads.redexgen.core.E4 A04;
    public final com.facebook.ads.redexgen.core.E2 A05;
    public final com.facebook.ads.redexgen.core.C1548fI A06;

    public AnonymousClass34(com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z, com.facebook.ads.redexgen.core.VI vi) {
        super(c1636gi);
        this.A04 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.3A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.AnonymousClass34.this.A06;
                c1548fI.setChecked(true);
            }
        };
        this.A05 = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.39
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.AnonymousClass34.this.A06;
                c1548fI.setChecked(false);
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.38
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C1548fI c1548fI;
                c1548fI = com.facebook.ads.redexgen.core.AnonymousClass34.this.A06;
                c1548fI.setChecked(true);
            }
        };
        this.A02 = vi;
        this.A01 = c1636gi;
        this.A06 = new com.facebook.ads.redexgen.core.C1548fI(c1636gi, z);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.widget.RelativeLayout.LayoutParams btnLayout = new android.widget.RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new android.graphics.Paint();
        this.A00.setStyle(android.graphics.Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
        addView(this.A06);
        setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        android.view.View.OnClickListener clickListener = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1545fF(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = java.lang.Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
