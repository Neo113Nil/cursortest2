package androidx.constraintlayout.core.state;

/* loaded from: classes7.dex */
public class Transition implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    public static final int START = 0;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    int getInputFormats;
    final androidx.constraintlayout.core.state.CorePixelDp getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    private java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition>> unwrapAs = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.WidgetState> getValidOutputFormatsForInputhNQ4ISI = new java.util.HashMap<>();
    androidx.constraintlayout.core.motion.utils.TypedBundle getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.motion.utils.TypedBundle();
    private int getOutputMinFrameDurationlomOqCM = 0;
    private java.lang.String getOutputSizes = null;
    private androidx.constraintlayout.core.motion.utils.Easing getOutputStallDurationlomOqCM = null;
    private int getOutputSizeshNQ4ISI = 0;
    private int getOutputStallDuration = 400;
    private float isOutputSupportedForhNQ4ISI = 0.0f;
    androidx.constraintlayout.core.state.Transition.OnSwipe Camera2StreamConfigurationMap = null;

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public Transition(androidx.constraintlayout.core.state.CorePixelDp corePixelDp) {
        this.getInputSizeshNQ4ISI = corePixelDp;
    }

    public boolean hasOnSwipe() {
        return this.Camera2StreamConfigurationMap != null;
    }

    static class OnSwipe {
        java.lang.String CoroutineDebuggingKt;
        long _CREATION;
        java.lang.String getInputSizeshNQ4ISI;
        int getOutputFormats;
        java.lang.String getValidOutputFormatsForInputhNQ4ISI;
        androidx.constraintlayout.core.motion.utils.StopEngine isOutputSupportedFor;
        public static final java.lang.String[] getHighSpeedVideoSizes = {com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end"};
        static final float[][] getOutputMinFrameDuration = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final java.lang.String[] Camera2StreamConfigurationMap = {com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "clockwise", "anticlockwise"};
        public static final java.lang.String[] getHighSpeedVideoFpsRanges = {"velocity", "spring"};
        public static final java.lang.String[] getHighSpeedVideoSizesFor = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        static final float[][] getHighResolutionOutputSizeshNQ4ISI = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        boolean getOutputStallDurationlomOqCM = true;
        int getOutputSizes = 0;
        float getOutputMinFrameDurationlomOqCM = 1.0f;
        float getOutputSizeshNQ4ISI = 10.0f;
        int getInputFormats = 0;
        float toString = 4.0f;
        float unwrapAs = 1.2f;
        int isOutputSupportedForhNQ4ISI = 0;
        float accessartificialFrame = 1.0f;
        float coroutineBoundary = 400.0f;
        float coroutineCreation = 10.0f;

        /* renamed from: a, reason: collision with root package name */
        float f2722a = 0.01f;
        float getOutputStallDuration = 0.0f;
        int ArtificialStackFrames = 0;

        OnSwipe() {
        }
    }

    public boolean isFirstDownAccepted(float f, float f2) {
        androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = this.Camera2StreamConfigurationMap;
        if (onSwipe == null) {
            return false;
        }
        if (onSwipe.getValidOutputFormatsForInputhNQ4ISI == null) {
            return true;
        }
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(this.Camera2StreamConfigurationMap.getValidOutputFormatsForInputhNQ4ISI);
        if (widgetState == null) {
            java.lang.System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        androidx.constraintlayout.core.state.WidgetFrame frame = widgetState.getFrame(2);
        return f >= ((float) frame.left) && f < ((float) frame.right) && f2 >= ((float) frame.top) && f2 < ((float) frame.bottom);
    }

    public float dragToProgress(float f, int i, int i2, float f2, float f3) {
        float abs;
        float f4;
        java.util.Iterator<androidx.constraintlayout.core.state.Transition.WidgetState> it = this.getValidOutputFormatsForInputhNQ4ISI.values().iterator();
        androidx.constraintlayout.core.state.Transition.WidgetState next = it.hasNext() ? it.next() : null;
        androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = this.Camera2StreamConfigurationMap;
        if (onSwipe == null || next == null) {
            if (next != null) {
                return (-f3) / next.getOutputFormats;
            }
            return 1.0f;
        }
        if (onSwipe.getInputSizeshNQ4ISI != null) {
            androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI);
            float[] fArr = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap.getOutputSizes];
            float[] fArr2 = androidx.constraintlayout.core.state.Transition.OnSwipe.getOutputMinFrameDuration[this.Camera2StreamConfigurationMap.getOutputFormats];
            float[] fArr3 = new float[2];
            widgetState.interpolate(i, i2, f, this);
            widgetState.getHighSpeedVideoFpsRanges.getDpDt(f, fArr2[0], fArr2[1], fArr3);
            float f5 = fArr[0];
            abs = f5 != 0.0f ? (f2 * java.lang.Math.abs(f5)) / fArr3[0] : (f3 * java.lang.Math.abs(fArr[1])) / fArr3[1];
            f4 = this.Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM;
        } else {
            float[] fArr4 = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap.getOutputSizes];
            float f6 = next.getOutputFormats;
            float f7 = next.getOutputFormats;
            float f8 = fArr4[0];
            abs = f8 != 0.0f ? (f2 * java.lang.Math.abs(f8)) / f6 : (f3 * java.lang.Math.abs(fArr4[1])) / f7;
            f4 = this.Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM;
        }
        return abs * f4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (r1 > 0.5d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r1 > 0.5f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r15 > 0.0f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        if (r15 >= 1.0f) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTouchUp(float f, long j, float f2, float f3) {
        androidx.constraintlayout.core.motion.utils.SpringStopEngine springStopEngine;
        androidx.constraintlayout.core.motion.utils.StopLogicEngine stopLogicEngine;
        androidx.constraintlayout.core.motion.utils.StopLogicEngine.Decelerate decelerate;
        androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = this.Camera2StreamConfigurationMap;
        if (onSwipe != null) {
            androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(onSwipe.getInputSizeshNQ4ISI);
            float[] fArr = new float[2];
            float[] fArr2 = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap.getOutputSizes];
            float[] fArr3 = androidx.constraintlayout.core.state.Transition.OnSwipe.getOutputMinFrameDuration[this.Camera2StreamConfigurationMap.getOutputFormats];
            widgetState.getHighSpeedVideoFpsRanges.getDpDt(f, fArr3[0], fArr3[1], fArr);
            if (java.lang.Math.abs((fArr2[0] * fArr[0]) + (fArr2[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            float f4 = fArr2[0];
            float f5 = 0.0f;
            float f6 = f4 != 0.0f ? f2 / fArr[0] : f3 / fArr[1];
            float f7 = this.Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM;
            androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe2 = this.Camera2StreamConfigurationMap;
            float f8 = f6 * f7;
            float f9 = 0.001f * this.getOutputStallDuration;
            onSwipe2._CREATION = j;
            float abs = java.lang.Math.abs(f8);
            float f10 = onSwipe2.toString;
            if (abs > f10) {
                f8 = java.lang.Math.signum(f8) * f10;
            }
            float f11 = f8;
            float abs2 = (((java.lang.Math.abs(f11) * 0.5f) * f11) / onSwipe2.unwrapAs) + f;
            switch (onSwipe2.isOutputSupportedForhNQ4ISI) {
                case 3:
                    f5 = Float.NaN;
                    break;
                case 4:
                    f5 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, abs2));
                    break;
                case 5:
                    if (abs2 > 0.2f && abs2 < 0.8f) {
                        f5 = abs2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case 6:
                    f5 = 1.0f;
                    break;
            }
            onSwipe2.getOutputStallDuration = f5;
            if (f5 == f) {
                onSwipe2.isOutputSupportedFor = null;
                return;
            }
            if (onSwipe2.isOutputSupportedForhNQ4ISI == 4 && onSwipe2.getInputFormats == 0) {
                androidx.constraintlayout.core.motion.utils.StopEngine stopEngine = onSwipe2.isOutputSupportedFor;
                if (stopEngine instanceof androidx.constraintlayout.core.motion.utils.StopLogicEngine.Decelerate) {
                    decelerate = (androidx.constraintlayout.core.motion.utils.StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new androidx.constraintlayout.core.motion.utils.StopLogicEngine.Decelerate();
                    onSwipe2.isOutputSupportedFor = decelerate;
                }
                decelerate.config(f, onSwipe2.getOutputStallDuration, f11);
                return;
            }
            if (onSwipe2.getInputFormats == 0) {
                androidx.constraintlayout.core.motion.utils.StopEngine stopEngine2 = onSwipe2.isOutputSupportedFor;
                if (stopEngine2 instanceof androidx.constraintlayout.core.motion.utils.StopLogicEngine) {
                    stopLogicEngine = (androidx.constraintlayout.core.motion.utils.StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new androidx.constraintlayout.core.motion.utils.StopLogicEngine();
                    onSwipe2.isOutputSupportedFor = stopLogicEngine;
                }
                stopLogicEngine.config(f, onSwipe2.getOutputStallDuration, f11, f9, onSwipe2.unwrapAs, onSwipe2.toString);
                return;
            }
            androidx.constraintlayout.core.motion.utils.StopEngine stopEngine3 = onSwipe2.isOutputSupportedFor;
            if (stopEngine3 instanceof androidx.constraintlayout.core.motion.utils.SpringStopEngine) {
                springStopEngine = (androidx.constraintlayout.core.motion.utils.SpringStopEngine) stopEngine3;
            } else {
                springStopEngine = new androidx.constraintlayout.core.motion.utils.SpringStopEngine();
                onSwipe2.isOutputSupportedFor = springStopEngine;
            }
            springStopEngine.springConfig(f, onSwipe2.getOutputStallDuration, f11, onSwipe2.accessartificialFrame, onSwipe2.coroutineBoundary, onSwipe2.coroutineCreation, onSwipe2.f2722a, onSwipe2.ArtificialStackFrames);
        }
    }

    public float getTouchUpProgress(long j) {
        androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = this.Camera2StreamConfigurationMap;
        if (onSwipe != null) {
            return onSwipe.isOutputSupportedFor.isStopped() ? onSwipe.getOutputStallDuration : onSwipe.isOutputSupportedFor.getInterpolation((j - onSwipe._CREATION) * 1.0E-9f);
        }
        return 0.0f;
    }

    public boolean isTouchNotDone(float f) {
        androidx.constraintlayout.core.motion.utils.StopEngine stopEngine;
        androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = this.Camera2StreamConfigurationMap;
        return (onSwipe.isOutputSupportedForhNQ4ISI == 3 || (stopEngine = onSwipe.isOutputSupportedFor) == null || stopEngine.isStopped()) ? false : true;
    }

    static /* synthetic */ float getHighSpeedVideoSizes(java.lang.String str, float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str).get(f);
    }

    static /* synthetic */ float getHighSpeedVideoSizes(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("standard").get(f);
    }

    static /* synthetic */ float getHighSpeedVideoFpsRangesFor(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("accelerate").get(f);
    }

    static /* synthetic */ float getHighSpeedVideoFpsRanges(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("decelerate").get(f);
    }

    static /* synthetic */ float Camera2StreamConfigurationMap(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("linear").get(f);
    }

    static /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("anticipate").get(f);
    }

    public static androidx.constraintlayout.core.state.Interpolator getInterpolator(int i, final java.lang.String str) {
        switch (i) {
            case -1:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda0
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighSpeedVideoSizes(str, f);
                    }
                };
            case 0:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighSpeedVideoSizes(f);
                    }
                };
            case 1:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda2
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighSpeedVideoFpsRangesFor(f);
                    }
                };
            case 2:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda3
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighSpeedVideoFpsRanges(f);
                    }
                };
            case 3:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda4
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.Camera2StreamConfigurationMap(f);
                    }
                };
            case 4:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda7
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getInputFormats(f);
                    }
                };
            case 5:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda6
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighSpeedVideoSizesFor(f);
                    }
                };
            case 6:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda5
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.getHighResolutionOutputSizeshNQ4ISI(f);
                    }
                };
            default:
                return null;
        }
    }

    static /* synthetic */ float getHighSpeedVideoSizesFor(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("overshoot").get(f);
    }

    static /* synthetic */ float getInputFormats(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findPreviousPosition(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        while (i >= 0) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> hashMap = this.unwrapAs.get(java.lang.Integer.valueOf(i));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i--;
        }
        return null;
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findNextPosition(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        while (i <= 100) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> hashMap = this.unwrapAs.get(java.lang.Integer.valueOf(i));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i++;
        }
        return null;
    }

    public int getNumberKeyPositions(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> hashMap = this.unwrapAs.get(java.lang.Integer.valueOf(i2));
            if (hashMap != null && hashMap.get(widgetFrame.widget.stringId) != null) {
                i++;
            }
        }
        return i;
    }

    public androidx.constraintlayout.core.motion.Motion getMotion(java.lang.String str) {
        return getWidgetState(str, null, 0).getHighSpeedVideoFpsRanges;
    }

    public void fillKeyPositions(androidx.constraintlayout.core.state.WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> hashMap = this.unwrapAs.get(java.lang.Integer.valueOf(i2));
            if (hashMap != null && (keyPosition = hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i] = keyPosition.Camera2StreamConfigurationMap;
                fArr2[i] = keyPosition.getHighSpeedVideoFpsRanges;
                fArr3[i] = keyPosition.getHighSpeedVideoFpsRangesFor;
                i++;
            }
        }
    }

    public boolean hasPositionKeyframes() {
        return this.unwrapAs.size() > 0;
    }

    public void setTransitionProperties(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        typedBundle.applyDelta(this.getHighSpeedVideoFpsRangesFor);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 706) {
            return false;
        }
        this.isOutputSupportedForhNQ4ISI = f;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i != 705) {
            return false;
        }
        this.getOutputSizes = str;
        this.getOutputStallDurationlomOqCM = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str);
        return false;
    }

    public boolean isEmpty() {
        return this.getValidOutputFormatsForInputhNQ4ISI.isEmpty();
    }

    public void clear() {
        this.getValidOutputFormatsForInputhNQ4ISI.clear();
    }

    public boolean contains(java.lang.String str) {
        return this.getValidOutputFormatsForInputhNQ4ISI.containsKey(str);
    }

    public void addKeyPosition(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void addKeyAttribute(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyAttribute(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle, androidx.constraintlayout.core.motion.CustomVariable[] customVariableArr) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
    }

    public void addKeyCycle(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(java.lang.String str, int i, int i2, float f, float f2) {
        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
        typedBundle.add(510, 2);
        typedBundle.add(100, i);
        typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, f);
        typedBundle.add(507, f2);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition = new androidx.constraintlayout.core.state.Transition.KeyPosition(str, i, i2, f, f2);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> hashMap = this.unwrapAs.get(java.lang.Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
            this.unwrapAs.put(java.lang.Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    public void addCustomFloat(int i, java.lang.String str, java.lang.String str2, float f) {
        getWidgetState(str, null, i).getFrame(i).addCustomFloat(str2, f);
    }

    public void addCustomColor(int i, java.lang.String str, java.lang.String str2, int i2) {
        getWidgetState(str, null, i).getFrame(i).addCustomColor(str2, i2);
    }

    public int getInterpolatedWidth() {
        return this.getInputFormats;
    }

    public int getInterpolatedHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void updateFrom(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i) {
        boolean z = constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoSizesFor = z | (constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
        if (i == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.getOutputFormats = width;
            this.getInputFormats = width;
            int height = constraintWidgetContainer.getHeight();
            this.getOutputMinFrameDuration = height;
            this.getHighResolutionOutputSizeshNQ4ISI = height;
        } else {
            this.getHighSpeedVideoFpsRanges = constraintWidgetContainer.getWidth();
            this.getHighSpeedVideoSizes = constraintWidgetContainer.getHeight();
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        androidx.constraintlayout.core.state.Transition.WidgetState[] widgetStateArr = new androidx.constraintlayout.core.state.Transition.WidgetState[size];
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i2);
            androidx.constraintlayout.core.state.Transition.WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i);
            widgetStateArr[i2] = widgetState;
            widgetState.update(constraintWidget, i);
            java.lang.String animateRelativeTo = widgetState.getHighSpeedVideoFpsRanges.getAnimateRelativeTo();
            if (animateRelativeTo != null) {
                widgetState.setPathRelative(getWidgetState(animateRelativeTo, null, i));
            }
        }
        calcStagger();
    }

    public void interpolate(int i, int i2, float f) {
        if (this.getHighSpeedVideoSizesFor) {
            this.getInputFormats = (int) (this.getOutputFormats + 0.5f + ((this.getHighSpeedVideoFpsRanges - r0) * f));
            this.getHighResolutionOutputSizeshNQ4ISI = (int) (this.getOutputMinFrameDuration + 0.5f + ((this.getHighSpeedVideoSizes - r0) * f));
        }
        androidx.constraintlayout.core.motion.utils.Easing easing = this.getOutputStallDurationlomOqCM;
        if (easing != null) {
            f = (float) easing.get(f);
        }
        java.util.Iterator<java.lang.String> it = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
        while (it.hasNext()) {
            this.getValidOutputFormatsForInputhNQ4ISI.get(it.next()).interpolate(i, i2, f, this);
        }
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.getOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.getHighSpeedVideoSizes;
    }

    public float[] getPath(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(str);
        float[] fArr = new float[com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE];
        widgetState.getHighSpeedVideoFpsRanges.buildPath(fArr, 62);
        return fArr;
    }

    public int getKeyFrames(java.lang.String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.getValidOutputFormatsForInputhNQ4ISI.get(str).getHighSpeedVideoFpsRanges.buildKeyFrames(fArr, iArr, iArr2);
    }

    public androidx.constraintlayout.core.state.Transition.WidgetState getWidgetState(java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.getValidOutputFormatsForInputhNQ4ISI.get(str);
        if (widgetState == null) {
            widgetState = new androidx.constraintlayout.core.state.Transition.WidgetState();
            this.getHighSpeedVideoFpsRangesFor.applyDelta(widgetState.getHighSpeedVideoFpsRanges);
            widgetState.getInputFormats.updateMotion(widgetState.getHighSpeedVideoFpsRanges);
            this.getValidOutputFormatsForInputhNQ4ISI.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i);
            }
        }
        return widgetState;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).getOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).getHighSpeedVideoFpsRangesFor;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).getHighSpeedVideoSizes;
    }

    public androidx.constraintlayout.core.state.Interpolator getInterpolator() {
        return getInterpolator(this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes);
    }

    public int getAutoTransition() {
        return this.getOutputSizeshNQ4ISI;
    }

    public static class WidgetState {
        androidx.constraintlayout.core.motion.Motion getHighSpeedVideoFpsRanges;
        boolean getInputSizeshNQ4ISI = true;
        androidx.constraintlayout.core.motion.utils.KeyCache getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.motion.utils.KeyCache();
        int getOutputFormats = -1;
        int getHighSpeedVideoSizesFor = -1;
        androidx.constraintlayout.core.state.WidgetFrame getOutputSizeshNQ4ISI = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.state.WidgetFrame getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.state.WidgetFrame getHighSpeedVideoSizes = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.motion.MotionWidget getInputFormats = new androidx.constraintlayout.core.motion.MotionWidget(this.getOutputSizeshNQ4ISI);
        androidx.constraintlayout.core.motion.MotionWidget Camera2StreamConfigurationMap = new androidx.constraintlayout.core.motion.MotionWidget(this.getHighSpeedVideoFpsRangesFor);
        androidx.constraintlayout.core.motion.MotionWidget getOutputMinFrameDuration = new androidx.constraintlayout.core.motion.MotionWidget(this.getHighSpeedVideoSizes);

        public WidgetState() {
            androidx.constraintlayout.core.motion.Motion motion = new androidx.constraintlayout.core.motion.Motion(this.getInputFormats);
            this.getHighSpeedVideoFpsRanges = motion;
            motion.setStart(this.getInputFormats);
            this.getHighSpeedVideoFpsRanges.setEnd(this.Camera2StreamConfigurationMap);
        }

        public void setKeyPosition(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = new androidx.constraintlayout.core.motion.key.MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.getHighSpeedVideoFpsRanges.addKey(motionKeyPosition);
        }

        public void setKeyAttribute(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyAttributes motionKeyAttributes = new androidx.constraintlayout.core.motion.key.MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.getHighSpeedVideoFpsRanges.addKey(motionKeyAttributes);
        }

        public void setKeyAttribute(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle, androidx.constraintlayout.core.motion.CustomVariable[] customVariableArr) {
            androidx.constraintlayout.core.motion.key.MotionKeyAttributes motionKeyAttributes = new androidx.constraintlayout.core.motion.key.MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i = 0; i < customVariableArr.length; i++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i].getName(), customVariableArr[i]);
                }
            }
            this.getHighSpeedVideoFpsRanges.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyCycle motionKeyCycle = new androidx.constraintlayout.core.motion.key.MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.getHighSpeedVideoFpsRanges.addKey(motionKeyCycle);
        }

        public void update(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
            if (i == 0) {
                this.getOutputSizeshNQ4ISI.update(constraintWidget);
                androidx.constraintlayout.core.motion.MotionWidget motionWidget = this.getInputFormats;
                motionWidget.updateMotion(motionWidget);
                this.getHighSpeedVideoFpsRanges.setStart(this.getInputFormats);
                this.getInputSizeshNQ4ISI = true;
            } else if (i == 1) {
                this.getHighSpeedVideoFpsRangesFor.update(constraintWidget);
                this.getHighSpeedVideoFpsRanges.setEnd(this.Camera2StreamConfigurationMap);
                this.getInputSizeshNQ4ISI = true;
            }
            this.getHighSpeedVideoSizesFor = -1;
        }

        public androidx.constraintlayout.core.state.WidgetFrame getFrame(int i) {
            if (i == 0) {
                return this.getOutputSizeshNQ4ISI;
            }
            if (i == 1) {
                return this.getHighSpeedVideoFpsRangesFor;
            }
            return this.getHighSpeedVideoSizes;
        }

        public void interpolate(int i, int i2, float f, androidx.constraintlayout.core.state.Transition transition) {
            this.getOutputFormats = i2;
            this.getHighSpeedVideoSizesFor = i;
            if (this.getInputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.setup(i, i2, 1.0f, java.lang.System.nanoTime());
                this.getInputSizeshNQ4ISI = false;
            }
            androidx.constraintlayout.core.state.WidgetFrame.interpolate(i, i2, this.getHighSpeedVideoSizes, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, transition, f);
            this.getHighSpeedVideoSizes.interpolatedPos = f;
            this.getHighSpeedVideoFpsRanges.interpolate(this.getOutputMinFrameDuration, f, java.lang.System.nanoTime(), this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public void setPathRelative(androidx.constraintlayout.core.state.Transition.WidgetState widgetState) {
            this.getHighSpeedVideoFpsRanges.setupRelative(widgetState.getHighSpeedVideoFpsRanges);
        }
    }

    static class KeyPosition {
        float Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;

        KeyPosition(java.lang.String str, int i, int i2, float f, float f2) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.Camera2StreamConfigurationMap = f;
            this.getHighSpeedVideoFpsRanges = f2;
        }
    }

    public void calcStagger() {
        float f;
        float f2;
        float f3 = this.isOutputSupportedForhNQ4ISI;
        if (f3 != 0.0f) {
            boolean z = ((double) f3) < 0.0d;
            float abs = java.lang.Math.abs(f3);
            java.util.Iterator<java.lang.String> it = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
            do {
                f = Float.MAX_VALUE;
                f2 = -3.4028235E38f;
                if (!it.hasNext()) {
                    java.util.Iterator<java.lang.String> it2 = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
                    while (it2.hasNext()) {
                        androidx.constraintlayout.core.motion.Motion motion = this.getValidOutputFormatsForInputhNQ4ISI.get(it2.next()).getHighSpeedVideoFpsRanges;
                        float finalX = motion.getFinalX() + motion.getFinalY();
                        f = java.lang.Math.min(f, finalX);
                        f2 = java.lang.Math.max(f2, finalX);
                    }
                    java.util.Iterator<java.lang.String> it3 = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.core.motion.Motion motion2 = this.getValidOutputFormatsForInputhNQ4ISI.get(it3.next()).getHighSpeedVideoFpsRanges;
                        float finalX2 = motion2.getFinalX() + motion2.getFinalY();
                        float f4 = f2 - f;
                        float f5 = abs - (((finalX2 - f) * abs) / f4);
                        if (z) {
                            f5 = abs - (((f2 - finalX2) / f4) * abs);
                        }
                        motion2.setStaggerScale(1.0f / (1.0f - abs));
                        motion2.setStaggerOffset(f5);
                    }
                    return;
                }
            } while (java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI.get(it.next()).getHighSpeedVideoFpsRanges.getMotionStagger()));
            java.util.Iterator<java.lang.String> it4 = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
            while (it4.hasNext()) {
                float motionStagger = this.getValidOutputFormatsForInputhNQ4ISI.get(it4.next()).getHighSpeedVideoFpsRanges.getMotionStagger();
                if (!java.lang.Float.isNaN(motionStagger)) {
                    f = java.lang.Math.min(f, motionStagger);
                    f2 = java.lang.Math.max(f2, motionStagger);
                }
            }
            java.util.Iterator<java.lang.String> it5 = this.getValidOutputFormatsForInputhNQ4ISI.keySet().iterator();
            while (it5.hasNext()) {
                androidx.constraintlayout.core.motion.Motion motion3 = this.getValidOutputFormatsForInputhNQ4ISI.get(it5.next()).getHighSpeedVideoFpsRanges;
                float motionStagger2 = motion3.getMotionStagger();
                if (!java.lang.Float.isNaN(motionStagger2)) {
                    float f6 = 1.0f / (1.0f - abs);
                    float f7 = f2 - f;
                    float f8 = abs - (((motionStagger2 - f) * abs) / f7);
                    if (z) {
                        f8 = abs - (((f2 - motionStagger2) / f7) * abs);
                    }
                    motion3.setStaggerScale(f6);
                    motion3.setStaggerOffset(f8);
                }
            }
        }
    }
}
