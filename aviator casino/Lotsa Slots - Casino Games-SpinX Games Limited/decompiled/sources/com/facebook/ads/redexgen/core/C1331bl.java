package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1331bl extends android.widget.RelativeLayout {
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final float[] A05 = {A04, A04, A04, A04, A04, A04, A04, A04};
    public boolean A00;
    public float[] A01;
    public final android.graphics.Path A02;
    public final android.graphics.RectF A03;

    public C1331bl(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new android.graphics.Path();
        this.A03 = new android.graphics.RectF();
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
    }

    private float[] getRadiiForCircularImage() {
        int radiusForCircle = java.lang.Math.min(getWidth(), getHeight()) / 2;
        return new float[]{radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle};
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        this.A02.addRoundRect(this.A03, this.A00 ? getRadiiForCircularImage() : this.A01, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.A00 = z;
    }

    public void setRadius(int i) {
        int densityAdjustedRadius = (int) (i * com.facebook.ads.redexgen.core.XX.A02);
        this.A01 = new float[]{densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
