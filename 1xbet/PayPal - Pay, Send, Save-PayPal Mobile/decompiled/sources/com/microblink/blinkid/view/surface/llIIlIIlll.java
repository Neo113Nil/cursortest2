package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class llIIlIIlll extends android.view.View implements com.microblink.blinkid.view.surface.ICameraView {
    public int IIlIIIllIl;
    public android.graphics.Paint IlIllIlIIl;
    public float IlIllIlllI;
    public int IllIIIIllI;
    public android.graphics.Paint IllIIIllII;
    public int lIIIIIllll;
    public int lIlIIIIlIl;
    public android.graphics.Paint llIIIlllll;
    public final int llIIlIIlll;
    public int llIIlIlIIl;
    public com.microblink.blinkid.view.CameraAspectMode lllIIIlIlI;

    public llIIlIIlll(android.content.Context context, com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
        super(context);
        this.llIIlIlIIl = 1;
        this.IllIIIIllI = 1920;
        this.lIlIIIIlIl = 1080;
        this.IIlIIIllIl = 0;
        this.lIIIIIllll = 0;
        this.IlIllIlllI = 1.0f;
        this.llIIlIIlll = context.getResources().getConfiguration().orientation;
        this.lllIIIlIlI = cameraAspectMode;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.IlIllIlIIl = paint;
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.IlIllIlIIl.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.IlIllIlIIl.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.IlIllIlIIl.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
        setBackgroundColor(android.graphics.Color.argb(255, 128, 59, 100));
        android.graphics.Paint paint2 = new android.graphics.Paint(this.IlIllIlIIl);
        this.IllIIIllII = paint2;
        paint2.setColor(-1);
        android.graphics.Paint paint3 = new android.graphics.Paint(this.IlIllIlIIl);
        this.llIIIlllll = paint3;
        paint3.setTextSize(125.0f);
        this.llIIIlllll.setColor(-16776961);
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final android.graphics.Rect convertRectangleToActualRect(android.graphics.RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float[] fArr = {f, f2};
        float f3 = rectF.right;
        float[] fArr2 = {f3, f2};
        float f4 = rectF.bottom;
        float[] fArr3 = {f, f4};
        float[] fArr4 = {f3, f4};
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.llIIlIlIIl, fArr);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.llIIlIlIIl, fArr2);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.llIIlIlIIl, fArr3);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.llIIlIlIIl, fArr4);
        float size = android.view.View.MeasureSpec.getSize(getMeasuredWidth());
        float size2 = android.view.View.MeasureSpec.getSize(getMeasuredHeight());
        fArr[0] = fArr[0] * size;
        fArr[1] = fArr[1] * size2;
        float size3 = android.view.View.MeasureSpec.getSize(getMeasuredWidth());
        float size4 = android.view.View.MeasureSpec.getSize(getMeasuredHeight());
        fArr2[0] = fArr2[0] * size3;
        fArr2[1] = fArr2[1] * size4;
        float size5 = android.view.View.MeasureSpec.getSize(getMeasuredWidth());
        float size6 = android.view.View.MeasureSpec.getSize(getMeasuredHeight());
        fArr3[0] = fArr3[0] * size5;
        fArr3[1] = fArr3[1] * size6;
        float size7 = android.view.View.MeasureSpec.getSize(getMeasuredWidth());
        float size8 = android.view.View.MeasureSpec.getSize(getMeasuredHeight());
        float f5 = fArr4[0] * size7;
        fArr4[0] = f5;
        fArr4[1] = fArr4[1] * size8;
        return new android.graphics.Rect(java.lang.Math.round(java.lang.Math.min(fArr[0], java.lang.Math.min(fArr2[0], java.lang.Math.min(fArr3[0], f5)))), java.lang.Math.round(java.lang.Math.min(fArr[1], java.lang.Math.min(fArr2[1], java.lang.Math.min(fArr3[1], fArr4[1])))), java.lang.Math.round(java.lang.Math.max(fArr[0], java.lang.Math.max(fArr2[0], java.lang.Math.max(fArr3[0], fArr4[0])))), java.lang.Math.round(java.lang.Math.max(fArr[1], java.lang.Math.max(fArr2[1], java.lang.Math.max(fArr3[1], fArr4[1])))));
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void dispose() {
        this.IlIllIlIIl = null;
        this.IllIIIllII = null;
        this.llIIIlllll = null;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final android.view.View getView() {
        return this;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleHeight() {
        return this.lIIIIIllll;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleWidth() {
        return this.IIlIIIllIl;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void installCallback(com.microblink.blinkid.secured.IlIllllllI ilIllllllI) {
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.lllIIIlIlI == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
            width = this.IIlIIIllIl;
            height = this.lIIIIIllll;
        }
        int round = java.lang.Math.round(width / 50.0f);
        int round2 = java.lang.Math.round(height / 50.0f);
        float f = 0.0f;
        boolean z = true;
        for (int i = 0; i < round2 + 1; i++) {
            float f2 = 0.0f;
            int i2 = 0;
            while (i2 < round + 1) {
                if (z) {
                    if (i2 % 2 != 0) {
                        paint = this.IllIIIllII;
                    }
                    paint = this.IlIllIlIIl;
                } else {
                    if (i2 % 2 == 0) {
                        paint = this.IllIIIllII;
                    }
                    paint = this.IlIllIlIIl;
                }
                float f3 = f2 + 50.0f;
                canvas.drawRect(f2, f, f3, f + 50.0f, paint);
                i2++;
                f2 = f3;
            }
            f += 50.0f;
            z = !z;
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.lllIIIlIlI == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
            width2 = this.IIlIIIllIl;
            height2 = this.lIIIIIllll;
        }
        canvas.drawText("Camera", (width2 - this.llIIIlllll.measureText("Camera")) / 2.0f, (height2 / 2.0f) + 62.5f, this.llIIIlllll);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i3 = this.IllIIIIllI;
        int i4 = this.lIlIIIIlIl;
        if (this.llIIlIIlll != 1) {
            i4 = i3;
            i3 = i4;
        }
        if (this.lllIIIlIlI != com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
            int i5 = size * i3;
            int i6 = size2 * i4;
            if (i5 < i6) {
                size = i6 / i3;
            } else {
                size2 = i5 / i4;
            }
            float f = this.IlIllIlllI;
            setMeasuredDimension((int) (size * f), (int) (size2 * f));
            return;
        }
        int i7 = size * i3;
        int i8 = size2 * i4;
        if (i7 > i8) {
            this.IIlIIIllIl = i8 / i3;
            this.lIIIIIllll = size2;
        } else {
            this.lIIIIIllll = i7 / i4;
            this.IIlIIIllIl = size;
        }
        float f2 = this.IIlIIIllIl;
        float f3 = this.IlIllIlllI;
        setMeasuredDimension((int) (f2 * f3), (int) (this.lIIIIIllll * f3));
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void removeCallback() {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
        this.lllIIIlIlI = cameraAspectMode;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setCameraViewEventListener(com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener) {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setDeviceNaturalOrientationLandscape(boolean z) {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setHostActivityOrientation(int i) {
        this.llIIlIlIIl = i;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewSize(int i, int i2) {
        this.IllIIIIllI = i;
        this.lIlIIIIlIl = i2;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewZoomScale(float f) {
        this.IlIllIlllI = f;
        requestLayout();
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setRotation(int i) {
    }
}
