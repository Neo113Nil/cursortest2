package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1317bX extends android.view.View {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"6CPTD", "fXgP9xh", "ib2e4in6DthWL0Q8yAPc5xfntbPyX", "G2AJONpeKHBBwjt4Sz8dsS7zReejT0Uv", "ehyeN", "WBwJl6", "LCSmLTdRFMhZrs9WeNkLEUS62n49AyUU", "TtqxlXaAwuHndX0DwnqxXM3nrIfVxGxz"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public float A00;
    public int A01;
    public int A02;
    public android.animation.ObjectAnimator A03;
    public android.graphics.Bitmap A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final android.graphics.Paint A08;
    public final android.graphics.Paint A09;
    public final android.graphics.Paint A0A;
    public final android.graphics.Paint A0B;
    public final android.graphics.RectF A0C;
    public final android.graphics.RectF A0D;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0F;
            if (strArr[5].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "SahMn6yRzkp23Kmva3Z5gQPUDBgZr";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
            i4++;
        }
    }

    public static void A01() {
        A0E = new byte[]{96, 98, Byte.MAX_VALUE, 119, 98, 117, 99, 99};
    }

    static {
        A01();
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 5.0f);
        A0H = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0I = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
    }

    public C1317bX(com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z) {
        super(c1636gi);
        this.A07 = android.content.res.Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A06 = android.content.res.Resources.getSystem().getDisplayMetrics().density * 2.0f;
        this.A00 = 0.0f;
        this.A03 = null;
        this.A02 = -1;
        this.A05 = z;
        this.A0C = new android.graphics.RectF();
        this.A0D = new android.graphics.RectF();
        this.A08 = new android.graphics.Paint(1);
        this.A08.setStyle(android.graphics.Paint.Style.STROKE);
        this.A08.setStrokeWidth(!this.A05 ? this.A07 : this.A06);
        this.A09 = new android.graphics.Paint(1);
        this.A09.setStyle(android.graphics.Paint.Style.STROKE);
        this.A09.setStrokeWidth(!this.A05 ? this.A07 : this.A06);
        this.A0A = new android.graphics.Paint(1);
        this.A0B = new android.graphics.Paint();
        this.A0B.setAntiAlias(true);
        this.A0B.setColor(-1);
        this.A0B.setTextSize(A0I);
        this.A01 = !this.A05 ? A0G : A0H;
    }

    public final void A02(float f, int i) {
        this.A02 = i;
        setProgressWithAnimation(f);
    }

    public final void A03(int i, int i2, int i3, boolean z) {
        this.A08.setColor(i);
        this.A09.setColor(i2);
        if (z) {
            this.A0A.setColorFilter(new android.graphics.PorterDuffColorFilter(com.facebook.ads.redexgen.core.P3.A02(i2, i3), android.graphics.PorterDuff.Mode.SRC_ATOP));
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        if (this.A03 != null) {
            this.A03.cancel();
            this.A03 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A0C, 0.0f, 360.0f, false, this.A08);
        canvas.drawArc(this.A0C, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A09);
        if (this.A04 != null) {
            canvas.drawBitmap(this.A04, new android.graphics.Rect(0, 0, this.A04.getWidth(), this.A04.getHeight()), this.A0D, this.A0A);
        }
        if (this.A02 >= 0) {
            java.lang.String str = this.A02 + A00(0, 0, 8);
            float f = this.A0C.left;
            float f2 = this.A0C.right;
            float sweepAngle = this.A0C.left;
            float f3 = f + ((f2 - sweepAngle) / 2.0f);
            float sweepAngle2 = this.A0B.measureText(str);
            float f4 = f3 - (sweepAngle2 / 2.0f);
            float f5 = this.A0C.top;
            float sweepAngle3 = A0H;
            float f6 = f5 + sweepAngle3;
            float f7 = this.A0C.bottom;
            float sweepAngle4 = this.A0C.top;
            canvas.drawText(str, f4, f6 + ((f7 - sweepAngle4) / 2.0f), this.A0B);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = java.lang.Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        float f = !this.A05 ? this.A07 : this.A06;
        android.graphics.RectF rectF = this.A0C;
        int min2 = getPaddingLeft();
        float f2 = (f / 2.0f) + 0.0f + min2;
        int min3 = getPaddingTop();
        float f3 = (f / 2.0f) + 0.0f + min3;
        int min4 = getPaddingRight();
        float f4 = (min - (f / 2.0f)) - min4;
        float strokeWidth = min;
        int min5 = getPaddingBottom();
        rectF.set(f2, f3, f4, (strokeWidth - (f / 2.0f)) - min5);
        int i3 = this.A01;
        android.graphics.RectF rectF2 = this.A0D;
        float f5 = this.A0C.left + i3;
        float f6 = this.A0C.top + i3;
        float f7 = this.A0C.right - i3;
        float strokeWidth2 = this.A0C.bottom;
        rectF2.set(f5, f6, f7, strokeWidth2 - i3);
    }

    public void setImage(com.facebook.ads.redexgen.core.YM ym) {
        this.A04 = ym == null ? null : com.facebook.ads.redexgen.core.YN.A01(ym);
        invalidate();
    }

    public void setImagePadding(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.A00 = java.lang.Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        this.A03 = android.animation.ObjectAnimator.ofFloat(this, A00(0, 8, 107), f);
        this.A03.setDuration(400L);
        this.A03.setInterpolator(new android.view.animation.LinearInterpolator());
        this.A03.start();
    }
}
