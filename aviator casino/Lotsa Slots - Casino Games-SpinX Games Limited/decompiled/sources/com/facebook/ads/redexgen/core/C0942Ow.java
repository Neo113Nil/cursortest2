package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0942Ow extends com.facebook.ads.redexgen.core.AbstractC1299bF {
    public final android.widget.TextView A00;
    public final android.widget.TextView A01;
    public static final int A02 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 36.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);

    public C0942Ow(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        super(c1636gi, null, i, c0894Na, z, str, va, interfaceC1177Yh, c1581fp, y2, c0900Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i), new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private android.widget.LinearLayout A00(int i) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, com.facebook.ads.redexgen.core.AbstractC1299bF.A0B);
        linearLayout.addView(this.A00, com.facebook.ads.redexgen.core.AbstractC1299bF.A0B);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new android.widget.LinearLayout.LayoutParams(i, i));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private android.widget.TextView A01(int i, int i2, boolean z) {
        android.widget.TextView textView = new android.widget.TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.YB.A0a(textView, z, i2);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0l(int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public void setInfo(com.facebook.ads.redexgen.core.NY ny, com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        super.setInfo(ny, c0896Nc, str, str2, interfaceC1151Xh, interfaceC1314bU);
        this.A01.setText(ny.A0G());
        this.A00.setText(ny.A0F());
        if (android.text.TextUtils.isEmpty(c0896Nc.A04())) {
            com.facebook.ads.redexgen.core.YB.A0H(this.A08);
        }
    }
}
