package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1473e4 extends android.widget.LinearLayout {
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 32.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public android.widget.TextView A00;
    public android.widget.TextView A01;
    public com.facebook.ads.redexgen.core.C1330bk A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    public C1473e4(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A03 = c1636gi;
        A00(c1636gi);
    }

    private final void A00(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        setGravity(16);
        this.A02 = new com.facebook.ads.redexgen.core.C1330bk(c1636gi);
        this.A02.setFullCircleCorners(true);
        android.widget.LinearLayout.LayoutParams pageImageViewParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        android.widget.LinearLayout pageInfoView = new android.widget.LinearLayout(c1636gi);
        pageInfoView.setOrientation(1);
        this.A00 = new android.widget.TextView(c1636gi);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        com.facebook.ads.redexgen.core.YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new android.widget.TextView(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm) {
        com.facebook.ads.redexgen.core.LM lm = new com.facebook.ads.redexgen.core.LM(this.A02, this.A03);
        lm.A05(A04, A04);
        lm.A07(c0906Nm.A01());
        this.A00.setText(c0906Nm.A02());
        this.A01.setText(c0906Nm.A03());
    }
}
