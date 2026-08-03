package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3S extends com.facebook.ads.redexgen.core.ED {
    public static java.lang.String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4K> A02;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.E3> A03;

    public C3S(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, false);
    }

    public C3S(com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z) {
        super(c1636gi);
        android.widget.ImageView.ScaleType scaleType;
        int color;
        this.A03 = new com.facebook.ads.redexgen.core.C0639Dc(this);
        this.A02 = new com.facebook.ads.redexgen.core.C0638Db(this);
        this.A01 = c1636gi;
        this.A00 = new android.widget.ImageView(c1636gi);
        if (!z) {
            scaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
            color = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        } else {
            scaleType = android.widget.ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        com.facebook.ads.redexgen.core.YB.A0N(this.A00, color);
        this.A00.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            com.facebook.ads.redexgen.core.UM<com.facebook.ads.redexgen.core.UN, com.facebook.ads.redexgen.core.UL> eventBus = getVideoView().getEventBus();
            com.facebook.ads.redexgen.core.UN[] unArr = new com.facebook.ads.redexgen.core.UN[2];
            java.lang.String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            unArr[0] = this.A03;
            unArr[1] = this.A02;
            eventBus.A03(unArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(java.lang.String str) {
        setImage(str, null);
    }

    public void setImage(java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1292b8 interfaceC1292b8) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        com.facebook.ads.redexgen.core.LM downloadImageTask = new com.facebook.ads.redexgen.core.LM(this.A00, this.A01).A04();
        if (interfaceC1292b8 != null) {
            downloadImageTask.A06(interfaceC1292b8);
        }
        downloadImageTask.A07(str);
    }
}
