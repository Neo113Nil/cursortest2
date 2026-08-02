package com.microblink.blinkid.view;

/* loaded from: classes.dex */
public abstract class CameraViewGroup extends com.microblink.blinkid.view.BaseCameraView {
    private boolean Camera2StreamConfigurationMap;
    private com.microblink.blinkid.secured.IIIlIllllI getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.secured.lllIllIIll getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    /* loaded from: classes10.dex */
    public class CameraViewGroupOrientationChangeListener extends com.microblink.blinkid.view.BaseCameraView.BaseOrientationChangeListener {
        final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraViewGroupOrientationChangeListener(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
            super();
            this.getHighResolutionOutputSizeshNQ4ISI = recognizerRunnerView;
        }

        @Override // com.microblink.blinkid.view.BaseCameraView.BaseOrientationChangeListener, com.microblink.blinkid.hardware.orientation.OrientationChangeListener
        public void onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
            super.onOrientationChange(orientation);
            if (this.getHighResolutionOutputSizeshNQ4ISI.llIIlIlIIl(orientation)) {
                if (((com.microblink.blinkid.view.CameraViewGroup) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges != null) {
                    ((com.microblink.blinkid.view.CameraViewGroup) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges.setOrientation(orientation);
                }
                java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.llIIlIIIll.iterator();
                while (it.hasNext()) {
                    ((com.microblink.blinkid.hardware.orientation.OrientationChangeListener) it.next()).onOrientationChange(orientation);
                }
            }
        }
    }

    public CameraViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizes = 250;
        this.Camera2StreamConfigurationMap = false;
        if (attributeSet != null) {
            this.getHighSpeedVideoFpsRangesFor = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "mb_animateRotation", false);
            this.getHighSpeedVideoSizes = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "mb_animationDuration", this.getHighSpeedVideoSizes);
        }
        getHighSpeedVideoFpsRanges(context);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    protected com.microblink.blinkid.hardware.orientation.OrientationChangeListener IllIIIIllI() {
        return new com.microblink.blinkid.view.BaseCameraView.BaseOrientationChangeListener();
    }

    public void addChildView(android.view.View view, boolean z) {
        if (z) {
            this.getHighSpeedVideoFpsRanges.addView(view);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (this.Camera2StreamConfigurationMap) {
            addView(view, (android.view.ViewGroup.LayoutParams) null);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.microblink.blinkid.view.CameraViewGroup.LayoutParams;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public void create() {
        this.Camera2StreamConfigurationMap = false;
        super.create();
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = this.getHighSpeedVideoFpsRanges.dispatchTouchEvent(motionEvent);
        com.microblink.blinkid.util.Log.v(this, "Rotatable view responded: {}", java.lang.Boolean.valueOf(dispatchTouchEvent));
        if (dispatchTouchEvent) {
            return true;
        }
        boolean dispatchTouchEvent2 = this.getHighResolutionOutputSizeshNQ4ISI.dispatchTouchEvent(motionEvent);
        com.microblink.blinkid.util.Log.v(this, "Fixed view responded: {}", java.lang.Boolean.valueOf(dispatchTouchEvent2));
        return dispatchTouchEvent2 || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.microblink.blinkid.view.CameraViewGroup.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.microblink.blinkid.view.CameraViewGroup.LayoutParams(getContext(), attributeSet);
    }

    public final int getRotationAnimationDuration() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setAnimateRotation(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges.setAnimateRotation(z);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final void setInitialOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        super.setInitialOrientation(orientation);
        this.getHighSpeedVideoFpsRanges.setInitialOrientation(getInitialOrientation());
    }

    public final void setRotationAnimationDuration(int i) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges.setAnimationDuration(i);
    }

    public final boolean shouldAnimateRotation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context) {
        setBackgroundColor(0);
        com.microblink.blinkid.secured.IIIlIllllI iIIlIllllI = new com.microblink.blinkid.secured.IIIlIllllI(context);
        this.getHighResolutionOutputSizeshNQ4ISI = iIIlIllllI;
        iIIlIllllI.setBackgroundColor(0);
        this.getHighResolutionOutputSizeshNQ4ISI.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        this.getHighResolutionOutputSizeshNQ4ISI.setVisibility(0);
        if (getInitialOrientation() == null) {
            this.IlIlllllII = com.microblink.blinkid.hardware.orientation.Orientation.fromActivityInfoCode(this.IIlIIIllIl);
        }
        com.microblink.blinkid.secured.lllIllIIll lllilliill = new com.microblink.blinkid.secured.lllIllIIll(context, this.IIlIIIllIl, getInitialOrientation(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = lllilliill;
        lllilliill.setBackgroundColor(0);
        this.getHighSpeedVideoFpsRanges.setVisibility(0);
        addView(this.getHighResolutionOutputSizeshNQ4ISI);
        addView(this.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap = true;
    }

    public void addChildView(android.view.View view, boolean z, int i) {
        if (z) {
            this.getHighSpeedVideoFpsRanges.addView(view, i);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        if (this.Camera2StreamConfigurationMap) {
            addView(view, i, (android.view.ViewGroup.LayoutParams) null);
        } else {
            super.addView(view, i);
        }
    }

    /* loaded from: classes10.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            if (attributeSet != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "mb_rotatable", false);
            }
        }

        public boolean isRotatable() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public void setRotatable(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            if (layoutParams instanceof com.microblink.blinkid.view.CameraViewGroup.LayoutParams) {
                this.getHighResolutionOutputSizeshNQ4ISI = ((com.microblink.blinkid.view.CameraViewGroup.LayoutParams) layoutParams).getHighResolutionOutputSizeshNQ4ISI;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.Camera2StreamConfigurationMap) {
            if (layoutParams == null) {
                layoutParams = new com.microblink.blinkid.view.CameraViewGroup.LayoutParams(-1, -1);
            }
            if (layoutParams instanceof com.microblink.blinkid.view.CameraViewGroup.LayoutParams) {
                if (((com.microblink.blinkid.view.CameraViewGroup.LayoutParams) layoutParams).isRotatable()) {
                    this.getHighSpeedVideoFpsRanges.addView(view, i);
                    return;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.addView(view, i);
                    return;
                }
            }
            throw new java.lang.RuntimeException("BaseCameraView.LayoutParams are only allowed type of params");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public void llIIlIlIIl(android.content.res.Configuration configuration) {
        super.llIIlIlIIl(configuration);
        this.getHighSpeedVideoFpsRanges.setHostActivityOrientation(this.IIlIIIllIl);
        this.getHighSpeedVideoFpsRanges.dispatchConfigurationChanged(configuration);
        this.getHighResolutionOutputSizeshNQ4ISI.dispatchConfigurationChanged(configuration);
        if (lIlIIIIlIl()) {
            this.IllIIlIIII.onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation.fromActivityInfoCode(this.IIlIIIllIl));
        }
    }

    public CameraViewGroup(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizes = 250;
        this.Camera2StreamConfigurationMap = false;
        getHighSpeedVideoFpsRanges(context);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.Camera2StreamConfigurationMap) {
            if (layoutParams == null) {
                layoutParams = new com.microblink.blinkid.view.CameraViewGroup.LayoutParams(-1, -1);
            }
            if (layoutParams instanceof com.microblink.blinkid.view.CameraViewGroup.LayoutParams) {
                if (((com.microblink.blinkid.view.CameraViewGroup.LayoutParams) layoutParams).isRotatable()) {
                    this.getHighSpeedVideoFpsRanges.addView(view);
                    return;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.addView(view);
                    return;
                }
            }
            throw new java.lang.RuntimeException("BaseCameraView.LayoutParams are only allowed type of params");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, int i2) {
        if (!this.Camera2StreamConfigurationMap) {
            super.addView(view, i, i2);
            return;
        }
        throw new java.lang.RuntimeException("addView method has been disabled in CameraView. Please use addChildView(View, boolean).");
    }
}
