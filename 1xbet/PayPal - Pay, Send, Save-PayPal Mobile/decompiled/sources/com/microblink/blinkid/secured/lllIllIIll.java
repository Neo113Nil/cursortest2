package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIllIIll extends android.view.ViewGroup {
    public com.microblink.blinkid.hardware.orientation.Orientation IlIllIlIIl;
    public int IllIIIIllI;
    public com.microblink.blinkid.hardware.orientation.Orientation IllIIIllII;
    public int lIlIIIIlIl;
    public boolean llIIIlllll;
    public final android.graphics.Matrix llIIlIlIIl;

    public lllIllIIll(android.content.Context context, int i, com.microblink.blinkid.hardware.orientation.Orientation orientation, boolean z, int i2) {
        super(context);
        this.llIIlIlIIl = new android.graphics.Matrix();
        com.microblink.blinkid.hardware.orientation.Orientation orientation2 = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT;
        this.IlIllIlIIl = orientation2;
        this.IllIIIllII = orientation2;
        this.llIIIlllll = true;
        this.IllIIIIllI = 500;
        this.lIlIIIIlIl = 1;
        setClipChildren(false);
        this.lIlIIIIlIl = i;
        this.IllIIIllII = orientation;
        this.IlIllIlIIl = llIIlIlIIl(orientation);
        this.llIIIlllll = z;
        this.IllIIIIllI = i2;
        if (isInEditMode()) {
            return;
        }
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        float[] fArr = {obtain.getRawX(), obtain.getRawY()};
        com.microblink.blinkid.util.Log.d(this, "Tap coordinate: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        com.microblink.blinkid.util.Log.d(this, "Location on screen: ({}, {})", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        float f = fArr[0] - iArr[0];
        fArr[0] = f;
        float f2 = fArr[1] - iArr[1];
        fArr[1] = f2;
        com.microblink.blinkid.util.Log.d(this, "View-normalized tap coordinate: ({}, {})", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
        this.llIIlIlIIl.mapPoints(fArr);
        com.microblink.blinkid.util.Log.d(this, "Mapped tap coordinate: ({} {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        obtain.setLocation(fArr[0], fArr[1]);
        return super.dispatchTouchEvent(obtain);
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        int ordinal = orientation.ordinal();
        int i = this.lIlIIIIlIl;
        com.microblink.blinkid.hardware.orientation.Orientation orientation2 = com.microblink.blinkid.hardware.orientation.Orientation.values()[(ordinal + (i != 0 ? i != 8 ? i != 9 ? 0 : 2 : 1 : 3)) % 4];
        com.microblink.blinkid.util.Log.d(this, "Normalized orientation {} to {}", orientation, orientation2);
        return orientation2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        com.microblink.blinkid.util.Log.d(this, "Rotatable view group ({} childs) layouting to: top: {} bottom: {}, left: {}, right: {} (changed: {}) ", java.lang.Integer.valueOf(childCount), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3), java.lang.Boolean.valueOf(z));
        int width = getWidth();
        int height = getHeight();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(getChildDrawingOrder(childCount, i5));
            if (this.IlIllIlIIl.isHorizontal()) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824));
                com.microblink.blinkid.util.Log.i(this, "Horizontal layouting child {} to: top: {} bottom: {}, left: {}, right: {}", java.lang.Integer.valueOf(i5), 0, java.lang.Integer.valueOf(width), 0, java.lang.Integer.valueOf(height));
                childAt.layout(0, 0, height, width);
            } else {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                com.microblink.blinkid.util.Log.i(this, "Vertical layouting child {} to: top: {} bottom: {}, left: {}, right: {}", java.lang.Integer.valueOf(i5), 0, java.lang.Integer.valueOf(height), 0, java.lang.Integer.valueOf(width));
                childAt.layout(0, 0, width, height);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int resolveSize = android.view.View.resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = android.view.View.resolveSize(getSuggestedMinimumHeight(), i2);
        if (this.IlIllIlIIl.isHorizontal()) {
            resolveSize2 = resolveSize;
            resolveSize = resolveSize2;
        }
        com.microblink.blinkid.util.Log.d(this, "Measured dimension: {}x{}", java.lang.Integer.valueOf(resolveSize), java.lang.Integer.valueOf(resolveSize2));
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.microblink.blinkid.util.Log.d(this, "[RotatableViewGroup] size changed from {}x{} to {}x{}", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (i == i3 && i2 == i4) {
            return;
        }
        com.microblink.blinkid.secured.IIlIIllIll llIIlIlIIl = llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT, this.IlIllIlIIl);
        if (llIIlIlIIl != null) {
            llIIlIlIIl.setFillEnabled(true);
            llIIlIlIIl.setDuration(0L);
            llIIlIlIIl.setFillAfter(true);
            llIIlIlIIl.setFillBefore(true);
            setLayoutAnimation(new android.view.animation.LayoutAnimationController(llIIlIlIIl));
            startLayoutAnimation();
        }
        llIIlIlIIl();
    }

    public final void setAnimateRotation(boolean z) {
        this.llIIIlllll = z;
    }

    public final void setAnimationDuration(int i) {
        this.IllIIIIllI = i;
    }

    public final void setHostActivityOrientation(int i) {
        this.lIlIIIIlIl = i;
        setOrientation(this.IllIIIllII);
    }

    public final void setInitialOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.IllIIIllII = orientation;
        this.IlIllIlIIl = llIIlIlIIl(orientation);
    }

    public final void setOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        invalidate();
        this.IllIIIllII = orientation;
        com.microblink.blinkid.hardware.orientation.Orientation llIIlIlIIl = llIIlIlIIl(orientation);
        com.microblink.blinkid.secured.IIlIIllIll llIIlIlIIl2 = llIIlIlIIl(this.IlIllIlIIl, llIIlIlIIl);
        if (llIIlIlIIl2 != null) {
            llIIlIlIIl2.setFillAfter(true);
            if (this.llIIIlllll) {
                llIIlIlIIl2.setDuration(this.IllIIIIllI);
            } else {
                llIIlIlIIl2.setDuration(0L);
            }
            setLayoutAnimation(new android.view.animation.LayoutAnimationController(llIIlIlIIl2));
            startLayoutAnimation();
        } else {
            requestLayout();
        }
        this.IlIllIlIIl = llIIlIlIIl;
        llIIlIlIIl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Set orientation: ");
        sb.append(this.IlIllIlIIl);
        com.microblink.blinkid.util.Log.d(this, sb.toString(), new java.lang.Object[0]);
    }

    public final com.microblink.blinkid.secured.IIlIIllIll llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.hardware.orientation.Orientation orientation2) {
        com.microblink.blinkid.util.Log.d(this, "Creating animation from {} to {}", orientation, orientation2);
        com.microblink.blinkid.util.Log.d(this, "Width: {},  heigth: {}", java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()));
        com.microblink.blinkid.hardware.orientation.Orientation orientation3 = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT;
        if (orientation == orientation3) {
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
                return new com.microblink.blinkid.secured.IIlIIllIll(0.0f, 90.0f, getWidth(), getHeight(), true);
            }
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                return new com.microblink.blinkid.secured.IIlIIllIll(0.0f, -90.0f, getWidth(), getHeight(), true);
            }
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                return new com.microblink.blinkid.secured.IIlIIllIll(0.0f, 180.0f, getWidth(), getHeight(), false);
            }
            return null;
        }
        com.microblink.blinkid.hardware.orientation.Orientation orientation4 = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
        if (orientation == orientation4) {
            if (orientation2 == orientation3) {
                return new com.microblink.blinkid.secured.IIlIIllIll(90.0f, 0.0f, getWidth(), getHeight(), false);
            }
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                return new com.microblink.blinkid.secured.IIlIIllIll(90.0f, 180.0f, getWidth(), getHeight(), false);
            }
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                return new com.microblink.blinkid.secured.IIlIIllIll(90.0f, -90.0f, getWidth(), getHeight(), true);
            }
            return null;
        }
        com.microblink.blinkid.hardware.orientation.Orientation orientation5 = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE;
        if (orientation == orientation5) {
            if (orientation2 == orientation4) {
                return new com.microblink.blinkid.secured.IIlIIllIll(180.0f, 90.0f, getWidth(), getHeight(), true);
            }
            if (orientation2 == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                return new com.microblink.blinkid.secured.IIlIIllIll(180.0f, 270.0f, getWidth(), getHeight(), true);
            }
            if (orientation2 == orientation3) {
                return new com.microblink.blinkid.secured.IIlIIllIll(180.0f, 0.0f, getWidth(), getHeight(), false);
            }
            return null;
        }
        if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
            if (orientation2 == orientation3) {
                return new com.microblink.blinkid.secured.IIlIIllIll(-90.0f, 0.0f, getWidth(), getHeight(), false);
            }
            if (orientation2 == orientation5) {
                return new com.microblink.blinkid.secured.IIlIIllIll(270.0f, 180.0f, getWidth(), getHeight(), false);
            }
            if (orientation2 == orientation4) {
                return new com.microblink.blinkid.secured.IIlIIllIll(-90.0f, 90.0f, getWidth(), getHeight(), true);
            }
        }
        return null;
    }

    public final void llIIlIlIIl() {
        int width = getWidth();
        int height = getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        com.microblink.blinkid.hardware.orientation.Orientation orientation = this.IlIllIlIIl;
        if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
            matrix.preTranslate(width, 0.0f);
            matrix.preRotate(90.0f);
        } else if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
            matrix.preTranslate(0.0f, height);
            matrix.preRotate(-90.0f);
        } else if (orientation != com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT && orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
            matrix.preTranslate(width, height);
            matrix.preRotate(180.0f);
        }
        matrix.invert(this.llIIlIlIIl);
    }
}
