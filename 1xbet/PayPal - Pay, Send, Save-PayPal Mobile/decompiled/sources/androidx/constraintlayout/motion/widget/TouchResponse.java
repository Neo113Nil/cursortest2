package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
class TouchResponse {
    int ArtificialStackFrames;
    float Camera2StreamConfigurationMap;
    float CoroutineDebuggingKt;
    float _CREATION;

    /* renamed from: a, reason: collision with root package name */
    float f2728a;
    float accessartificialFrame;
    int b;
    private int c;
    int[] coroutineBoundary;
    float coroutineCreation;
    float getARTIFICIAL_FRAME_PACKAGE_NAME;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    float[] getHighSpeedVideoSizes;
    float getHighSpeedVideoSizesFor;
    int getInputFormats;
    boolean getInputSizeshNQ4ISI;
    float getOutputFormats;
    float getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    float getOutputSizes;
    final androidx.constraintlayout.motion.widget.MotionLayout getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    float getOutputStallDurationlomOqCM;
    float getValidOutputFormatsForInputhNQ4ISI;
    private int init;
    float isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    private int kernelVersion;
    float toString;
    int unwrapAs;
    private static final float[][] d = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] _BOUNDARY = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    TouchResponse(android.content.Context context, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.init = 0;
        this.kernelVersion = 0;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.ArtificialStackFrames = -1;
        this.b = -1;
        this.c = -1;
        this.f2728a = 0.5f;
        this.coroutineCreation = 0.5f;
        this.getOutputStallDurationlomOqCM = 0.5f;
        this.isOutputSupportedFor = 0.5f;
        this.unwrapAs = -1;
        this.getInputSizeshNQ4ISI = false;
        this._CREATION = 0.0f;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = 1.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoSizes = new float[2];
        this.coroutineBoundary = new int[2];
        this.getOutputSizes = 4.0f;
        this.getOutputFormats = 1.2f;
        this.getOutputStallDuration = true;
        this.Camera2StreamConfigurationMap = 1.0f;
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = 10.0f;
        this.getValidOutputFormatsForInputhNQ4ISI = 10.0f;
        this.toString = 1.0f;
        this.CoroutineDebuggingKt = Float.NaN;
        this.accessartificialFrame = Float.NaN;
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputSizeshNQ4ISI = motionLayout;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorId) {
                this.ArtificialStackFrames = obtainStyledAttributes.getResourceId(index, this.ArtificialStackFrames);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = obtainStyledAttributes.getInt(index, this.init);
                this.init = i2;
                float[] fArr = d[i2];
                this.coroutineCreation = fArr[0];
                this.f2728a = fArr[1];
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_dragDirection) {
                int i3 = obtainStyledAttributes.getInt(index, this.kernelVersion);
                this.kernelVersion = i3;
                float[][] fArr2 = _BOUNDARY;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this._CREATION = fArr3[0];
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = fArr3[1];
                } else {
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = Float.NaN;
                    this._CREATION = Float.NaN;
                    this.getInputSizeshNQ4ISI = true;
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_maxVelocity) {
                this.getOutputSizes = obtainStyledAttributes.getFloat(index, this.getOutputSizes);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_maxAcceleration) {
                this.getOutputFormats = obtainStyledAttributes.getFloat(index, this.getOutputFormats);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.getOutputStallDuration = obtainStyledAttributes.getBoolean(index, this.getOutputStallDuration);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_dragScale) {
                this.Camera2StreamConfigurationMap = obtainStyledAttributes.getFloat(index, this.Camera2StreamConfigurationMap);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_dragThreshold) {
                this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getFloat(index, this.getHighSpeedVideoFpsRangesFor);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchRegionId) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_onTouchUp) {
                this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getInt(index, this.getOutputMinFrameDurationlomOqCM);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_nestedScrollFlags) {
                this.getInputFormats = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_limitBoundsTo) {
                this.c = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_rotationCenterId) {
                this.unwrapAs = obtainStyledAttributes.getResourceId(index, this.unwrapAs);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_springDamping) {
                this.getValidOutputFormatsForInputhNQ4ISI = obtainStyledAttributes.getFloat(index, this.getValidOutputFormatsForInputhNQ4ISI);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_springMass) {
                this.toString = obtainStyledAttributes.getFloat(index, this.toString);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_springStiffness) {
                this.CoroutineDebuggingKt = obtainStyledAttributes.getFloat(index, this.CoroutineDebuggingKt);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_springStopThreshold) {
                this.accessartificialFrame = obtainStyledAttributes.getFloat(index, this.accessartificialFrame);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_springBoundary) {
                this.isOutputSupportedForhNQ4ISI = obtainStyledAttributes.getInt(index, this.isOutputSupportedForhNQ4ISI);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_autoCompleteMode) {
                this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoFpsRanges);
            }
        }
        obtainStyledAttributes.recycle();
    }

    TouchResponse(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, androidx.constraintlayout.motion.widget.OnSwipe onSwipe) {
        this.init = 0;
        this.kernelVersion = 0;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.ArtificialStackFrames = -1;
        this.b = -1;
        this.c = -1;
        this.f2728a = 0.5f;
        this.coroutineCreation = 0.5f;
        this.getOutputStallDurationlomOqCM = 0.5f;
        this.isOutputSupportedFor = 0.5f;
        this.unwrapAs = -1;
        this.getInputSizeshNQ4ISI = false;
        this._CREATION = 0.0f;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = 1.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoSizes = new float[2];
        this.coroutineBoundary = new int[2];
        this.getOutputSizes = 4.0f;
        this.getOutputFormats = 1.2f;
        this.getOutputStallDuration = true;
        this.Camera2StreamConfigurationMap = 1.0f;
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = 10.0f;
        this.getValidOutputFormatsForInputhNQ4ISI = 10.0f;
        this.toString = 1.0f;
        this.CoroutineDebuggingKt = Float.NaN;
        this.accessartificialFrame = Float.NaN;
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputSizeshNQ4ISI = motionLayout;
        this.ArtificialStackFrames = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.init = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = d[touchAnchorSide];
            this.coroutineCreation = fArr[0];
            this.f2728a = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.kernelVersion = dragDirection;
        float[][] fArr2 = _BOUNDARY;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this._CREATION = fArr3[0];
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = fArr3[1];
        } else {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = Float.NaN;
            this._CREATION = Float.NaN;
            this.getInputSizeshNQ4ISI = true;
        }
        this.getOutputSizes = onSwipe.getMaxVelocity();
        this.getOutputFormats = onSwipe.getMaxAcceleration();
        this.getOutputStallDuration = onSwipe.getMoveWhenScrollAtTop();
        this.Camera2StreamConfigurationMap = onSwipe.getDragScale();
        this.getHighSpeedVideoFpsRangesFor = onSwipe.getDragThreshold();
        this.b = onSwipe.getTouchRegionId();
        this.getOutputMinFrameDurationlomOqCM = onSwipe.getOnTouchUp();
        this.getInputFormats = onSwipe.getNestedScrollFlags();
        this.c = onSwipe.getLimitBoundsTo();
        this.unwrapAs = onSwipe.getRotationCenterId();
        this.isOutputSupportedForhNQ4ISI = onSwipe.getSpringBoundary();
        this.getValidOutputFormatsForInputhNQ4ISI = onSwipe.getSpringDamping();
        this.toString = onSwipe.getSpringMass();
        this.CoroutineDebuggingKt = onSwipe.getSpringStiffness();
        this.accessartificialFrame = onSwipe.getSpringStopThreshold();
        this.getHighSpeedVideoFpsRanges = onSwipe.getAutoCompleteMode();
    }

    public final void getHighSpeedVideoFpsRanges(boolean z) {
        if (z) {
            float[][] fArr = _BOUNDARY;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = d;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = _BOUNDARY;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = d;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = d[this.init];
        this.coroutineCreation = fArr5[0];
        this.f2728a = fArr5[1];
        int i = this.kernelVersion;
        float[][] fArr6 = _BOUNDARY;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this._CREATION = fArr7[0];
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = fArr7[1];
    }

    final void getHighSpeedVideoSizes() {
        android.view.View view;
        int i = this.ArtificialStackFrames;
        if (i != -1) {
            view = this.getOutputSizeshNQ4ISI.findViewById(i);
            if (view == null) {
                androidx.constraintlayout.motion.widget.Debug.getName(this.getOutputSizeshNQ4ISI.getContext(), this.ArtificialStackFrames);
            }
        } else {
            view = null;
        }
        if (view instanceof androidx.core.widget.NestedScrollView) {
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new androidx.core.widget.NestedScrollView.OnScrollChangeListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(androidx.core.widget.NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                }
            });
        }
    }

    final android.graphics.RectF Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.graphics.RectF rectF) {
        android.view.View findViewById;
        int i = this.b;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    final android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI(android.view.ViewGroup viewGroup, android.graphics.RectF rectF) {
        android.view.View findViewById;
        int i = this.c;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public java.lang.String toString() {
        if (java.lang.Float.isNaN(this._CREATION)) {
            return androidx.constraintlayout.motion.widget.Key.ROTATION;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this._CREATION);
        sb.append(" , ");
        sb.append(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        return sb.toString();
    }
}
