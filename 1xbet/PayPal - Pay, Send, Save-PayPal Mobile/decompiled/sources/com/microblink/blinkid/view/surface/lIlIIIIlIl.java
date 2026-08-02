package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class lIlIIIIlIl extends android.view.TextureView implements com.microblink.blinkid.view.surface.ICameraView {
    public int IIlIIIllIl;
    public int IlIllIlIIl;
    public int IlIllIlllI;
    public final android.view.GestureDetector IlIlllllII;
    public float IllIIIIllI;
    public int IllIIIllII;
    public boolean IllIIlIIII;
    public final android.os.Handler lIIIIIlIlI;
    public com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener lIIIIIllll;
    public int lIlIIIIlIl;
    public com.microblink.blinkid.view.CameraAspectMode llIIIlllll;
    public final android.view.ScaleGestureDetector llIIlIIIll;
    public int llIIlIIlll;
    public int llIIlIlIIl;
    public int lllIIIlIlI;
    public boolean lllIlIlIIl;

    public lIlIIIIlIl(android.content.Context context) {
        super(context);
        this.llIIlIlIIl = 0;
        this.IlIllIlIIl = 0;
        this.IllIIIllII = 0;
        this.llIIIlllll = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT;
        this.IllIIIIllI = 1.0f;
        this.lIlIIIIlIl = 0;
        this.llIIlIIlll = 0;
        this.IIlIIIllIl = 1;
        this.lllIIIlIlI = -1;
        this.IlIllIlllI = -1;
        this.lllIlIlIIl = false;
        this.IllIIlIIII = false;
        this.lIIIIIlIlI = new android.os.Handler();
        this.IlIlllllII = new android.view.GestureDetector(context, new com.microblink.blinkid.view.surface.llIIIlllll(this));
        this.llIIlIIIll = new android.view.ScaleGestureDetector(context, new com.microblink.blinkid.view.surface.IllIIIIllI(this));
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
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IIlIIIllIl, fArr);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IIlIIIllIl, fArr2);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IIlIIIllIl, fArr3);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IIlIIIllIl, fArr4);
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
        int round = java.lang.Math.round(java.lang.Math.min(fArr[0], java.lang.Math.min(fArr2[0], java.lang.Math.min(fArr3[0], f5))));
        int round2 = java.lang.Math.round(java.lang.Math.min(fArr[1], java.lang.Math.min(fArr2[1], java.lang.Math.min(fArr3[1], fArr4[1]))));
        int round3 = java.lang.Math.round(java.lang.Math.max(fArr[0], java.lang.Math.max(fArr2[0], java.lang.Math.max(fArr3[0], fArr4[0]))));
        int round4 = java.lang.Math.round(java.lang.Math.max(fArr[1], java.lang.Math.max(fArr2[1], java.lang.Math.max(fArr3[1], fArr4[1]))));
        if (this.llIIIlllll == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL) {
            int i = this.IlIllIlllI;
            round += i;
            round3 += i;
            int i2 = this.lllIIIlIlI;
            round2 += i2;
            round4 += i2;
        }
        return new android.graphics.Rect(round, round2, round3, round4);
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void dispose() {
        this.lIIIIIllll = null;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final android.view.View getView() {
        return this;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleHeight() {
        return this.llIIlIIlll;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleWidth() {
        return this.lIlIIIIlIl;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void installCallback(com.microblink.blinkid.secured.IlIllllllI ilIllllllI) {
        setSurfaceTextureListener(ilIllllllI.IllIIIIllI().IlIllIlIIl());
        this.lllIlIlIIl = ilIllllllI instanceof com.microblink.blinkid.secured.IlIIIlIIIl;
    }

    public final void llIIlIlIIl() {
        int size = android.view.View.MeasureSpec.getSize(getMeasuredWidth());
        int size2 = android.view.View.MeasureSpec.getSize(getMeasuredHeight());
        if (this.IlIllIlIIl <= 0 || this.IllIIIllII <= 0) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = size;
        float f2 = size2;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (!this.lllIlIlIIl || this.IllIIlIIII) {
            if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
                matrix.postScale(f2 / f, f / f2, centerX, centerY);
            }
            matrix.postRotate(this.llIIlIlIIl, centerX, centerY);
        } else {
            if (!com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
                matrix.postScale(f2 / f, f / f2, centerX, centerY);
            }
            matrix.postRotate(this.llIIlIlIIl - 90, centerX, centerY);
        }
        setTransform(matrix);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            throw new java.lang.RuntimeException("Camera texture view works only on hardware accelerated windows!");
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.IlIllIlllI = i;
        this.lllIIIlIlI = i2;
        llIIlIlIIl();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.IlIllIlIIl;
        if (i4 == 0 || (i3 = this.IllIIIllII) == 0) {
            setMeasuredDimension(size, size2);
            this.lIlIIIIlIl = size;
            this.llIIlIIlll = size2;
            return;
        }
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
            i4 = this.IllIIIllII;
            i3 = this.IlIllIlIIl;
            com.microblink.blinkid.util.Log.d(this, "Activity is in portrait mode, preview size used for layouting is {}x{}", java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i3));
        }
        if (this.llIIIlllll != com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
            com.microblink.blinkid.util.Log.d(this, "Measuring size in ASPECT_FILL mode", new java.lang.Object[0]);
            int i5 = size * i3;
            int i6 = size2 * i4;
            if (i5 < i6) {
                com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) > height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
                size = i6 / i3;
            } else {
                com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) <= height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
                size2 = i5 / i4;
            }
            com.microblink.blinkid.util.Log.d(this, "Measured dimension: {}x{}", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
            float f = this.IllIIIIllI;
            setMeasuredDimension((int) (size * f), (int) (size2 * f));
            return;
        }
        com.microblink.blinkid.util.Log.d(this, "Measuring size in ASPECT_FIT mode", new java.lang.Object[0]);
        int i7 = size * i3;
        int i8 = size2 * i4;
        if (i7 > i8) {
            com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) > height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
            this.lIlIIIIlIl = i8 / i3;
            this.llIIlIIlll = size2;
        } else {
            com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) <= height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
            this.llIIlIIlll = i7 / i4;
            this.lIlIIIIlIl = size;
        }
        com.microblink.blinkid.util.Log.d(this, "Measured dimension: {}x{}", java.lang.Integer.valueOf(this.lIlIIIIlIl), java.lang.Integer.valueOf(this.llIIlIIlll));
        float f2 = this.lIlIIIIlIl;
        float f3 = this.IllIIIIllI;
        setMeasuredDimension((int) (f2 * f3), (int) (this.llIIlIIlll * f3));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.lIIIIIllll == null) {
            return false;
        }
        return this.IlIlllllII.onTouchEvent(motionEvent) || this.llIIlIIIll.onTouchEvent(motionEvent);
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void removeCallback() {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
        this.llIIIlllll = cameraAspectMode;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setCameraViewEventListener(com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener) {
        this.lIIIIIllll = cameraViewEventListener;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setDeviceNaturalOrientationLandscape(boolean z) {
        this.IllIIlIIII = z;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setHostActivityOrientation(int i) {
        this.IIlIIIllIl = i;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewSize(int i, int i2) {
        this.IllIIIllII = i2;
        this.IlIllIlIIl = i;
        this.lIIIIIlIlI.post(new com.microblink.blinkid.secured.llllllllll(this));
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewZoomScale(float f) {
        this.IllIIIIllI = f;
        requestLayout();
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setRotation(int i) {
        this.llIIlIlIIl = i;
        if (this.IllIIIllII <= 0 || this.IlIllIlIIl <= 0) {
            return;
        }
        this.lIIIIIlIlI.post(new com.microblink.blinkid.secured.lIIIllIIlI(this));
    }
}
