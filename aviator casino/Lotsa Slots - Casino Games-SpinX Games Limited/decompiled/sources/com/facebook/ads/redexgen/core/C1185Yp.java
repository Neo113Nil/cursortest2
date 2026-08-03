package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1185Yp extends android.view.View {
    public int A00;
    public android.graphics.Paint A01;
    public android.graphics.Paint A02;
    public android.graphics.Paint A03;
    public boolean A04;

    public C1185Yp(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, 60, true);
    }

    public C1185Yp(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i, boolean z) {
        super(c1636gi);
        this.A00 = i;
        this.A04 = z;
        if (z) {
            this.A02 = new android.graphics.Paint();
            this.A02.setColor(-3355444);
            this.A02.setStyle(android.graphics.Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new android.graphics.Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(android.graphics.Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new android.graphics.Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(android.graphics.Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public android.widget.RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f = com.facebook.ads.redexgen.core.XX.A02;
        float density = this.A00;
        int i = (int) (density * f);
        float density2 = this.A00;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i, (int) (density2 * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.A04) {
            canvas.isHardwareAccelerated();
            int min = java.lang.Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = min / 2;
            int edgeLength = i * 2;
            int i3 = edgeLength / 3;
            canvas.drawCircle(i, i2, i3, this.A02);
            int edgeLength2 = i3 - 2;
            canvas.drawCircle(i, i2, edgeLength2, this.A01);
            int centerY = min / 3;
            int centerX = min / 3;
            int edgeLength3 = centerY * 2;
            float f = edgeLength3;
            int edgeLength4 = centerX * 2;
            canvas.drawLine(centerY, centerX, f, edgeLength4, this.A03);
            int edgeLength5 = centerY * 2;
            int edgeLength6 = centerX * 2;
            canvas.drawLine(edgeLength5, centerX, centerY, edgeLength6, this.A03);
        }
        super.onDraw(canvas);
    }
}
