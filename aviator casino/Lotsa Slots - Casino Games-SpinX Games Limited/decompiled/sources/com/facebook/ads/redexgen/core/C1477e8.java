package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1477e8 extends android.widget.FrameLayout {
    public static final int A08 = com.facebook.ads.redexgen.core.XV.A0b;
    public com.facebook.ads.redexgen.core.C04786e A00;
    public com.facebook.ads.redexgen.core.C0683Eu A01;
    public com.facebook.ads.redexgen.core.C4L A02;
    public com.facebook.ads.redexgen.core.C0642Df A03;
    public com.facebook.ads.redexgen.core.C3S A04;
    public com.facebook.ads.redexgen.core.AnonymousClass34 A05;
    public final com.facebook.ads.redexgen.core.C1636gi A06;
    public final com.facebook.ads.redexgen.core.VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(com.facebook.ads.redexgen.core.VA va, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        A02();
        this.A02 = new com.facebook.ads.redexgen.core.C4L(this.A06, va, this.A00, str, null, map);
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A06)) {
            this.A01 = new com.facebook.ads.redexgen.core.C0683Eu(this.A06, va, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1477e8(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VI vi) {
        super(c1636gi);
        this.A07 = vi;
        this.A06 = c1636gi;
        setUpView(c1636gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(com.facebook.ads.redexgen.core.UN un) {
        getEventBus().A05(un);
    }

    public final void A05(com.facebook.ads.redexgen.core.EnumC1523et enumC1523et) {
        A0e(enumC1523et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public com.facebook.ads.redexgen.core.C0673Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(java.lang.String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        A0Y();
        this.A04 = new com.facebook.ads.redexgen.core.C3S(c1636gi);
        A0f(this.A04);
        this.A03 = new com.facebook.ads.redexgen.core.C0642Df(c1636gi, this.A07);
        A0f(new com.facebook.ads.redexgen.core.C04123q(c1636gi));
        A0f(this.A03);
        this.A05 = new com.facebook.ads.redexgen.core.AnonymousClass34(c1636gi, true, this.A07);
        A0f(this.A05);
        A0f(new com.facebook.ads.redexgen.core.C0644Dh(this.A05, com.facebook.ads.redexgen.core.EnumC1539f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A00 = new com.facebook.ads.redexgen.core.C0673Ek(c1636gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = android.view.View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = android.view.View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1476e7(this));
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        setUpVideo(c1636gi);
        setUpPlugins(c1636gi);
    }

    public void setVideoURI(java.lang.String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
