package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class IllIIIllII extends android.view.SurfaceView implements com.microblink.blinkid.view.surface.ICameraView {
    public float IIlIIIllIl;
    public int IlIllIlIIl;
    public int IlIllIlllI;
    public final android.os.Handler IlIlllllII;
    public int IllIIIIllI;
    public int IllIIIllII;
    public android.view.GestureDetector IllIIlIIII;
    public android.view.ScaleGestureDetector lIIIIIlIlI;
    public com.microblink.blinkid.secured.lIllIIlIIl lIIIIIllll;
    public com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener lIlIIIIlIl;
    public int llIIIlllll;
    public com.microblink.blinkid.view.CameraAspectMode llIIlIIlll;
    public int llIIlIlIIl;
    public android.view.SurfaceHolder.Callback lllIIIlIlI;
    public int lllIlIlIIl;

    public IllIIIllII(android.content.Context context) {
        super(context);
        this.llIIlIlIIl = 0;
        this.IlIllIlIIl = 0;
        this.IllIIIllII = 0;
        this.llIIIlllll = 0;
        this.IllIIIIllI = 1;
        this.llIIlIIlll = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT;
        this.IIlIIIllIl = 1.0f;
        this.IlIllIlllI = -1;
        this.lllIlIlIIl = -1;
        this.IlIlllllII = new android.os.Handler();
        this.IllIIlIIII = new android.view.GestureDetector(context, new com.microblink.blinkid.view.surface.llIIlIlIIl(this));
        this.lIIIIIlIlI = new android.view.ScaleGestureDetector(context, new com.microblink.blinkid.view.surface.IlIllIlIIl(this));
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
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IllIIIIllI, fArr);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IllIIIIllI, fArr2);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IllIIIIllI, fArr3);
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IllIIIIllI, fArr4);
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
        if (this.llIIlIIlll == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL) {
            int i = this.lllIlIlIIl;
            round += i;
            round3 += i;
            int i2 = this.IlIllIlllI;
            round2 += i2;
            round4 += i2;
        }
        return new android.graphics.Rect(round, round2, round3, round4);
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void dispose() {
        this.lIlIIIIlIl = null;
        this.lIIIIIllll = null;
        this.lllIIIlIlI = null;
        this.IllIIlIIII = null;
        this.lIIIIIlIlI = null;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final android.view.View getView() {
        return this;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleHeight() {
        return this.llIIIlllll;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final int getVisibleWidth() {
        return this.IllIIIllII;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void installCallback(com.microblink.blinkid.secured.IlIllllllI ilIllllllI) {
        this.lllIIIlIlI = ilIllllllI.IllIIIIllI().llIIlIlIIl();
        getHolder().addCallback(this.lllIIIlIlI);
        getHolder().setType(3);
        if (ilIllllllI instanceof com.microblink.blinkid.secured.lIllIIlIIl) {
            this.lIIIIIllll = (com.microblink.blinkid.secured.lIllIIlIIl) ilIllllllI;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.lllIlIlIIl = i;
        this.IlIllIlllI = i2;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.llIIlIlIIl;
        if (i4 == 0 || (i3 = this.IlIllIlIIl) == 0) {
            setMeasuredDimension(size, size2);
            this.IllIIIllII = size;
            this.llIIIlllll = size2;
            return;
        }
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
            i4 = this.IlIllIlIIl;
            i3 = this.llIIlIlIIl;
            com.microblink.blinkid.util.Log.d(this, "Activity is in portrait mode, preview size used for layouting is {}x{}", java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i3));
        }
        if (this.llIIlIIlll != com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
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
            float f = this.IIlIIIllIl;
            setMeasuredDimension((int) (size * f), (int) (size2 * f));
            return;
        }
        com.microblink.blinkid.util.Log.d(this, "Measuring size in ASPECT_FIT mode", new java.lang.Object[0]);
        int i7 = size * i3;
        int i8 = size2 * i4;
        if (i7 > i8) {
            com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) > height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
            this.IllIIIllII = i8 / i3;
            this.llIIIlllll = size2;
        } else {
            com.microblink.blinkid.util.Log.d(this, "width*previewHeight ({}*{}) <= height*previewWidth ({}*{})", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i4));
            this.llIIIlllll = i7 / i4;
            this.IllIIIllII = size;
        }
        float f2 = this.IllIIIllII;
        float f3 = this.IIlIIIllIl;
        setMeasuredDimension((int) (f2 * f3), (int) (this.llIIIlllll * f3));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.lIlIIIIlIl == null) {
            return false;
        }
        return this.IllIIlIIII.onTouchEvent(motionEvent) || this.lIIIIIlIlI.onTouchEvent(motionEvent);
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void removeCallback() {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
        this.llIIlIIlll = cameraAspectMode;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setCameraViewEventListener(com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener) {
        this.lIlIIIIlIl = cameraViewEventListener;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setDeviceNaturalOrientationLandscape(boolean z) {
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setHostActivityOrientation(int i) {
        this.IllIIIIllI = i;
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewSize(int i, int i2) {
        this.IlIllIlIIl = i2;
        this.llIIlIlIIl = i;
        this.IlIlllllII.post(new com.microblink.blinkid.secured.IIllIllIII(this));
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setPreviewZoomScale(float f) {
        this.IIlIIIllIl = f;
        requestLayout();
    }

    @Override // com.microblink.blinkid.view.surface.ICameraView
    public final void setRotation(int i) {
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.lIIIIIllll;
        if (lilliiliil != null) {
            lilliiliil.IlIllIlIIl(i);
        }
    }
}
