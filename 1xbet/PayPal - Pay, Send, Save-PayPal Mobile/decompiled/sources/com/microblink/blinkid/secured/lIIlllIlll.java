package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIlllIlll extends android.view.View implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public int IIlIIIllIl;
    public final com.microblink.blinkid.secured.IIIlllIIII IlIIlIIIII;
    public int IlIIlllIIl;
    public double IlIllIlIIl;
    public com.microblink.blinkid.geometry.Quadrilateral IlIllIlllI;
    public com.microblink.blinkid.secured.IIIlllIIll IlIlllllII;
    public int IllIIIIllI;
    public int IllIIIllII;
    public int IllIIlIIII;
    public boolean lIIIIIlIlI;
    public long lIIIIIllll;
    public int lIlIIIIlIl;
    public com.microblink.blinkid.view.OnSizeChangedListener lIllIIlIIl;
    public boolean lIlllIlIlI;
    public int llIIIlllll;
    public android.animation.ValueAnimator llIIlIIIll;
    public int llIIlIIlll;
    public double llIIlIlIIl;
    public boolean llIllIIlll;
    public com.microblink.blinkid.geometry.Quadrilateral lllIIIlIlI;
    public com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener lllIIlIIlI;
    public int lllIlIlIIl;
    public final android.os.Handler lllllIlIll;

    public lIIlllIlll(android.content.Context context, com.microblink.blinkid.secured.IIIlllIIll iIIlllIIll, double d, double d2, int i) {
        super(context);
        this.llIIlIlIIl = 0.11d;
        this.IlIllIlIIl = 0.11d;
        this.IllIIIllII = -1;
        this.llIIIlllll = -1;
        this.IllIIIIllI = -1;
        this.lIlIIIIlIl = -1;
        this.llIIlIIlll = -1;
        this.IIlIIIllIl = -1;
        this.lIIIIIllll = 500L;
        this.lllIIIlIlI = new com.microblink.blinkid.geometry.Quadrilateral();
        this.IlIllIlllI = new com.microblink.blinkid.geometry.Quadrilateral();
        this.IlIlllllII = null;
        this.llIIlIIIll = null;
        this.IlIIlllIIl = 1;
        this.llIllIIlll = false;
        this.lllllIlIll = new android.os.Handler();
        this.lIlllIlIlI = true;
        this.IlIIlIIIII = new com.microblink.blinkid.secured.IIIlllIIII(this);
        llIIlIlIIl(iIIlllIIll, d, d2, i);
    }

    public final com.microblink.blinkid.secured.IIIlllIIll getQuadDrawer() {
        return this.IlIlllllII;
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.IIIlllIIll iIIlllIIll, double d, double d2, int i) {
        this.IlIlllllII = iIIlllIIll;
        this.IlIllIlIIl = d2;
        this.llIIlIlIIl = d;
        this.lllIlIlIIl = getResources().getColor(com.microblink.blinkid.library.R.color.mb_default_frame);
        this.IllIIlIIII = getResources().getColor(com.microblink.blinkid.library.R.color.mb_recognized_frame);
        setBackgroundColor(0);
        this.IlIIlllIIl = i;
        if (isInEditMode()) {
            return;
        }
        setLayerType(2, iIIlllIIll.llIIlIlIIl());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.lllIIIlIlI = (com.microblink.blinkid.geometry.Quadrilateral) valueAnimator.getAnimatedValue();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        boolean z = this.IIlIIIllIl <= 0;
        if (this.IllIIIllII == -1) {
            this.IllIIIllII = getWidth();
        }
        if (this.llIIIlllll == -1) {
            this.llIIIlllll = getHeight();
        }
        int i = this.IllIIIllII;
        int i2 = (int) ((1.0d - this.llIIlIlIIl) * i);
        int i3 = this.llIIIlllll;
        int i4 = (i3 - ((int) ((1.0d - this.IlIllIlIIl) * i3))) / 2;
        this.IllIIIIllI = i4;
        int i5 = (i - i2) / 2;
        this.lIlIIIIlIl = i5;
        int i6 = i - i5;
        this.llIIlIIlll = i6;
        int i7 = i3 - i4;
        this.IIlIIIllIl = i7;
        int i8 = this.IlIIlllIIl;
        if (i8 == 8 || i8 == 9) {
            this.IllIIIIllI = i7;
            this.IIlIIIllIl = i4;
            this.lIlIIIIlIl = i6;
            this.llIIlIIlll = i5;
        }
        if (z) {
            this.lllIIIlIlI.setMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, i8);
            this.lllIIIlIlI.setColor(this.lllIlIlIIl);
            this.lllIIIlIlI.setIsDefaultQuad(true);
            if (this.llIllIIlll) {
                this.lllIIIlIlI.mirror(this.IllIIIllII, this.llIIIlllll, this.IlIIlllIIl);
            }
            this.IlIllIlllI.setMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, this.IlIIlllIIl);
            this.IlIllIlllI.setColor(this.lllIlIlIIl);
            this.IlIllIlllI.setIsDefaultQuad(true);
            if (this.llIllIIlll) {
                this.IlIllIlllI.mirror(this.IllIIIllII, this.llIIIlllll, this.IlIIlllIIl);
            }
        } else if (this.lllIIIlIlI.isDefaultQuad() && !this.lllIIIlIlI.matchesMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, this.IlIIlllIIl)) {
            this.lllIIIlIlI.setMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, this.IlIIlllIIl);
            this.lllIIIlIlI.setColor(this.lllIlIlIIl);
            this.lllIIIlIlI.setIsDefaultQuad(true);
            if (this.llIllIIlll) {
                this.lllIIIlIlI.mirror(this.IllIIIllII, this.llIIIlllll, this.IlIIlllIIl);
            }
            this.IlIllIlllI.setMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, this.IlIIlllIIl);
            this.IlIllIlllI.setColor(this.lllIlIlIIl);
            this.IlIllIlllI.setIsDefaultQuad(true);
            if (this.llIllIIlll) {
                this.IlIllIlllI.mirror(this.IllIIIllII, this.llIIIlllll, this.IlIIlllIIl);
            }
        }
        this.IlIlllllII.llIIlIlIIl(this.lllIIIlIlI, canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.IllIIIllII = getWidth();
        int height = getHeight();
        this.llIIIlllll = height;
        com.microblink.blinkid.util.Log.d(this, "QuadView layouting to size: {}x{}", java.lang.Integer.valueOf(this.IllIIIllII), java.lang.Integer.valueOf(height));
        com.microblink.blinkid.view.OnSizeChangedListener onSizeChangedListener = this.lIllIIlIIl;
        if (onSizeChangedListener != null) {
            onSizeChangedListener.onSizeChanged(this.IllIIIllII, this.llIIIlllll);
        }
    }

    public final void setAnimationDuration(long j) {
        this.lIIIIIllll = j;
    }

    public final void setAnimationListener(com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener) {
        this.lllIIlIIlI = quadViewAnimationListener;
    }

    public final void setDefaultQuadColor(int i) {
        this.lllIlIlIIl = i;
    }

    public final void setDetectedQuadColor(int i) {
        this.IllIIlIIII = i;
    }

    public final void setHostActivityOrientation(int i) {
        int i2 = this.IlIIlllIIl;
        boolean z = true;
        if (((i2 != 1 && i2 != 9) || (i != 0 && i != 8)) && ((i2 != 0 && i2 != 8) || (i != 1 && i != 9))) {
            z = false;
        }
        this.IlIIlllIIl = i;
        if (z) {
            double d = this.IlIllIlIIl;
            this.IlIllIlIIl = this.llIIlIlIIl;
            this.llIIlIlIIl = d;
        }
    }

    public final void setMirrored(boolean z) {
        this.llIllIIlll = z;
    }

    public final void setMovable(boolean z) {
        this.lIlllIlIlI = z;
    }

    public final void setOnSizeChangedListener(com.microblink.blinkid.view.OnSizeChangedListener onSizeChangedListener) {
        this.lIllIIlIIl = onSizeChangedListener;
    }

    public final boolean llIIlIlIIl() {
        android.animation.ValueAnimator valueAnimator = this.llIIlIIIll;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    public final void llIIlIlIIl(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
        if (detectionStatus != com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS && (detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.FAILED || !this.lIIIIIlIlI)) {
            this.IlIllIlllI.setColor(this.lllIlIlIIl);
        } else {
            this.IlIllIlllI.setColor(this.IllIIlIIII);
        }
        if (this.IllIIIIllI != this.IIlIIIllIl) {
            this.lllllIlIll.post(new com.microblink.blinkid.secured.lllIlIIIII(this));
        }
    }

    public final void llIIlIlIIl(double d, double d2) {
        this.llIIlIlIIl = d;
        this.IlIllIlIIl = d2;
        if (this.IllIIIIllI != this.IIlIIIllIl) {
            int i = this.IllIIIllII;
            int i2 = this.llIIIlllll;
            int i3 = (i2 - ((int) ((1.0d - d2) * i2))) / 2;
            this.IllIIIIllI = i3;
            int i4 = (i - ((int) ((1.0d - d) * i))) / 2;
            this.lIlIIIIlIl = i4;
            int i5 = i - i4;
            this.llIIlIIlll = i5;
            int i6 = i2 - i3;
            this.IIlIIIllIl = i6;
            int i7 = this.IlIIlllIIl;
            if (i7 == 8 || i7 == 9) {
                this.IllIIIIllI = i6;
                this.IIlIIIllIl = i3;
                this.lIlIIIIlIl = i5;
                this.llIIlIIlll = i4;
            }
            this.IlIllIlllI.setMargins(this.IllIIIIllI, this.IIlIIIllIl, this.lIlIIIIlIl, this.llIIlIIlll, i7);
            this.IlIllIlllI.setIsDefaultQuad(true);
            if (this.llIllIIlll) {
                this.IlIllIlllI.mirror(this.IllIIIllII, this.llIIIlllll, this.IlIIlllIIl);
            }
            this.lllIIIlIlI.setIsDefaultQuad(false);
            this.lllllIlIll.post(new com.microblink.blinkid.secured.lllIlIIIII(this));
        }
    }
}
