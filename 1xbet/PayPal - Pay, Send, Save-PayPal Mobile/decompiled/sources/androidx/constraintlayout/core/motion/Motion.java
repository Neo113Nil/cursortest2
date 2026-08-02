package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
public class Motion implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    double[] Camera2StreamConfigurationMap;
    private androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] accessartificialFrame;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> c;
    float getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.core.motion.utils.CurveFit getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    androidx.constraintlayout.core.motion.utils.CurveFit[] getHighSpeedVideoSizesFor;
    androidx.constraintlayout.core.motion.Motion getInputSizeshNQ4ISI;
    private java.lang.String[] getOutputMinFrameDurationlomOqCM;
    private int[] getOutputSizes;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> getOutputStallDuration;
    androidx.constraintlayout.core.motion.MotionWidget getOutputStallDurationlomOqCM;
    private double[] getValidOutputFormatsForInputhNQ4ISI;
    private int[] isOutputSupportedFor;
    public java.lang.String mId;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> toString;
    androidx.constraintlayout.core.motion.utils.Rect getInputFormats = new androidx.constraintlayout.core.motion.utils.Rect();
    private int getOutputSizeshNQ4ISI = 0;

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.MotionPaths f2720a = new androidx.constraintlayout.core.motion.MotionPaths();
    private androidx.constraintlayout.core.motion.MotionPaths unwrapAs = new androidx.constraintlayout.core.motion.MotionPaths();
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint kernelVersion = new androidx.constraintlayout.core.motion.MotionConstrainedPoint();
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint isOutputSupportedForhNQ4ISI = new androidx.constraintlayout.core.motion.MotionConstrainedPoint();
    float getHighSpeedVideoFpsRanges = Float.NaN;
    float getOutputMinFrameDuration = 0.0f;
    float getOutputFormats = 1.0f;
    private int ArtificialStackFrames = 4;
    private float[] d = new float[4];
    private java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> coroutineBoundary = new java.util.ArrayList<>();
    private float[] AMEXKernela = new float[1];
    private java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> CoroutineDebuggingKt = new java.util.ArrayList<>();
    private int _BOUNDARY = -1;
    private int AMEXKernel = -1;
    private androidx.constraintlayout.core.motion.MotionWidget init = null;
    private int b = -1;
    private float _CREATION = Float.NaN;
    private androidx.constraintlayout.core.motion.utils.DifferentialInterpolator getARTIFICIAL_FRAME_PACKAGE_NAME = null;
    private boolean coroutineCreation = false;

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public int getTransformPivotTarget() {
        return this.AMEXKernel;
    }

    public void setTransformPivotTarget(int i) {
        this.AMEXKernel = i;
        this.init = null;
    }

    public androidx.constraintlayout.core.motion.MotionPaths getKeyFrame(int i) {
        return this.coroutineBoundary.get(i);
    }

    public Motion(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        setView(motionWidget);
    }

    public float getStartX() {
        return this.f2720a.unwrapAs;
    }

    public float getStartY() {
        return this.f2720a.isOutputSupportedFor;
    }

    public float getFinalX() {
        return this.unwrapAs.unwrapAs;
    }

    public float getFinalY() {
        return this.unwrapAs.isOutputSupportedFor;
    }

    public float getStartWidth() {
        return this.f2720a.isOutputSupportedForhNQ4ISI;
    }

    public float getStartHeight() {
        return this.f2720a.getInputFormats;
    }

    public float getFinalWidth() {
        return this.unwrapAs.isOutputSupportedForhNQ4ISI;
    }

    public float getFinalHeight() {
        return this.unwrapAs.getInputFormats;
    }

    public java.lang.String getAnimateRelativeTo() {
        return this.f2720a.Camera2StreamConfigurationMap;
    }

    public void setupRelative(androidx.constraintlayout.core.motion.Motion motion) {
        this.getInputSizeshNQ4ISI = motion;
    }

    public float getCenterX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getCenterY() {
        return this.getHighSpeedVideoSizes;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.getHighSpeedVideoSizesFor[0].getPos(d, dArr);
        this.getHighSpeedVideoSizesFor[0].getSlope(d, dArr2);
        float f = 0.0f;
        java.util.Arrays.fill(fArr2, 0.0f);
        androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.f2720a;
        int[] iArr = this.isOutputSupportedFor;
        float f2 = motionPaths.unwrapAs;
        float f3 = motionPaths.isOutputSupportedFor;
        float f4 = motionPaths.isOutputSupportedForhNQ4ISI;
        float f5 = motionPaths.getInputFormats;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f10;
            } else if (i2 == 2) {
                f3 = f9;
                f8 = f10;
            } else if (i2 == 3) {
                f4 = f9;
                f6 = f10;
            } else if (i2 == 4) {
                f5 = f9;
                f7 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f6 / 2.0f) + f;
        float f13 = (f7 / 2.0f) + f8;
        androidx.constraintlayout.core.motion.Motion motion = motionPaths.getOutputSizes;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            float sin = (float) ((f14 + (java.lang.Math.sin(d3) * d2)) - (f4 / 2.0f));
            float cos = (float) ((f15 - (java.lang.Math.cos(d3) * d2)) - (f5 / 2.0f));
            double d4 = f;
            double d5 = f8;
            float sin2 = (float) (f16 + (java.lang.Math.sin(d3) * d4) + (java.lang.Math.cos(d3) * d5));
            float cos2 = (float) ((f17 - (d4 * java.lang.Math.cos(d3))) + (java.lang.Math.sin(d3) * d5));
            f2 = sin;
            f3 = cos;
            f13 = cos2;
            f12 = sin2;
            f11 = 2.0f;
        }
        fArr[0] = f2 + (f4 / f11) + 0.0f;
        fArr[1] = f3 + (f5 / f11) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public void buildPath(float[] fArr, int i) {
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap = this.getOutputStallDuration;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap2 = this.getOutputStallDuration;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> hashMap3 = this.toString;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> hashMap4 = this.toString;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f3 = i2 * f2;
            float f4 = this.getOutputFormats;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.getOutputMinFrameDuration;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = java.lang.Math.min((f3 - f6) * f4, f);
                }
            }
            float f7 = f3;
            double d = f7;
            androidx.constraintlayout.core.motion.utils.Easing easing = this.f2720a.getHighSpeedVideoSizesFor;
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.coroutineBoundary.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                androidx.constraintlayout.core.motion.MotionPaths next = it.next();
                if (next.getHighSpeedVideoSizesFor != null) {
                    if (next.toString < f7) {
                        easing = next.getHighSpeedVideoSizesFor;
                        f5 = next.toString;
                    } else if (java.lang.Float.isNaN(f8)) {
                        f8 = next.toString;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) easing.get((f7 - f5) / r16)) * (f8 - f5)) + f5;
            }
            double d2 = d;
            this.getHighSpeedVideoSizesFor[0].getPos(d2, this.Camera2StreamConfigurationMap);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.getHighSpeedVideoFpsRangesFor;
            if (curveFit != null) {
                double[] dArr = this.Camera2StreamConfigurationMap;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f2720a.getHighSpeedVideoSizes(d2, this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, fArr, i3);
            if (keyCycleOscillator != null) {
                fArr[i3] = fArr[i3] + keyCycleOscillator.get(f7);
            } else if (splineSet != null) {
                fArr[i3] = fArr[i3] + splineSet.get(f7);
            }
            if (keyCycleOscillator2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + keyCycleOscillator2.get(f7);
            } else if (splineSet2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + splineSet2.get(f7);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.getHighSpeedVideoSizesFor[0].getTimePoints();
        if (iArr != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.coroutineBoundary.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().getInputSizeshNQ4ISI;
                i++;
            }
        }
        if (iArr2 != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it2 = this.coroutineBoundary.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().getOutputSizeshNQ4ISI * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < timePoints.length; i4++) {
            this.getHighSpeedVideoSizesFor[0].getPos(timePoints[i4], this.Camera2StreamConfigurationMap);
            this.f2720a.getHighSpeedVideoSizes(timePoints[i4], this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.getHighSpeedVideoSizesFor[0].getPos(getHighSpeedVideoFpsRanges(f, null), this.Camera2StreamConfigurationMap);
        androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.f2720a;
        int[] iArr = this.isOutputSupportedFor;
        double[] dArr = this.Camera2StreamConfigurationMap;
        float f2 = motionPaths.unwrapAs;
        float f3 = motionPaths.isOutputSupportedFor;
        float f4 = motionPaths.isOutputSupportedForhNQ4ISI;
        float f5 = motionPaths.getInputFormats;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        androidx.constraintlayout.core.motion.Motion motion = motionPaths.getOutputSizes;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = motionPaths.getOutputSizes.getCenterY();
            double d = f2;
            double d2 = f3;
            float sin = (float) ((centerX + (java.lang.Math.sin(d2) * d)) - (f4 / 2.0f));
            f3 = (float) ((centerY - (d * java.lang.Math.cos(d2))) - (f5 / 2.0f));
            f2 = sin;
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        float f9 = f2 + 0.0f;
        fArr[i] = f9;
        float f10 = f3 + 0.0f;
        fArr[i + 1] = f10;
        float f11 = f7 + 0.0f;
        fArr[i + 2] = f11;
        fArr[i + 3] = f10;
        fArr[i + 4] = f11;
        float f12 = f8 + 0.0f;
        fArr[i + 5] = f12;
        fArr[i + 6] = f9;
        fArr[i + 7] = f12;
    }

    public void addKey(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        this.CoroutineDebuggingKt.add(motionKey);
    }

    public void setPathMotionArc(int i) {
        this._BOUNDARY = i;
    }

    public void setup(int i, int i2, float f, long j) {
        java.util.ArrayList arrayList;
        char c;
        java.lang.String str;
        androidx.constraintlayout.core.motion.CustomVariable customVariable;
        androidx.constraintlayout.core.motion.utils.SplineSet makeSpline;
        androidx.constraintlayout.core.motion.CustomVariable customVariable2;
        java.lang.Integer num;
        androidx.constraintlayout.core.motion.utils.SplineSet makeSpline2;
        androidx.constraintlayout.core.motion.CustomVariable customVariable3;
        new java.util.HashSet();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        androidx.constraintlayout.core.motion.Motion motion = this.getInputSizeshNQ4ISI;
        if (motion != null) {
            this.f2720a.setupRelative(motion, motion.f2720a);
            androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.unwrapAs;
            androidx.constraintlayout.core.motion.Motion motion2 = this.getInputSizeshNQ4ISI;
            motionPaths.setupRelative(motion2, motion2.unwrapAs);
        }
        if (this._BOUNDARY != -1 && this.f2720a.getOutputFormats == -1) {
            this.f2720a.getOutputFormats = this._BOUNDARY;
        }
        androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint = this.kernelVersion;
        androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint2 = this.isOutputSupportedForhNQ4ISI;
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getHighSpeedVideoFpsRangesFor, motionConstrainedPoint2.getHighSpeedVideoFpsRangesFor)) {
            hashSet2.add("alpha");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getHighSpeedVideoFpsRanges, motionConstrainedPoint2.getHighSpeedVideoFpsRanges)) {
            hashSet2.add("translationZ");
        }
        int i3 = motionConstrainedPoint.isOutputSupportedFor;
        int i4 = motionConstrainedPoint2.isOutputSupportedFor;
        if (i3 != i4 && motionConstrainedPoint.coroutineCreation == 0 && (i3 == 4 || i4 == 4)) {
            hashSet2.add("alpha");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getOutputMinFrameDurationlomOqCM, motionConstrainedPoint2.getOutputMinFrameDurationlomOqCM)) {
            hashSet2.add("rotationZ");
        }
        if (!java.lang.Float.isNaN(motionConstrainedPoint.getOutputFormats) || !java.lang.Float.isNaN(motionConstrainedPoint2.getOutputFormats)) {
            hashSet2.add("pathRotate");
        }
        if (!java.lang.Float.isNaN(motionConstrainedPoint.getInputSizeshNQ4ISI) || !java.lang.Float.isNaN(motionConstrainedPoint2.getInputSizeshNQ4ISI)) {
            hashSet2.add("progress");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getOutputStallDuration, motionConstrainedPoint2.getOutputStallDuration)) {
            hashSet2.add("rotationX");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.CoroutineDebuggingKt, motionConstrainedPoint2.CoroutineDebuggingKt)) {
            hashSet2.add("rotationY");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getHighSpeedVideoSizesFor, motionConstrainedPoint2.getHighSpeedVideoSizesFor)) {
            hashSet2.add("pivotX");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getInputFormats, motionConstrainedPoint2.getInputFormats)) {
            hashSet2.add("pivotY");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getOutputStallDurationlomOqCM, motionConstrainedPoint2.getOutputStallDurationlomOqCM)) {
            hashSet2.add("scaleX");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getOutputSizeshNQ4ISI, motionConstrainedPoint2.getOutputSizeshNQ4ISI)) {
            hashSet2.add("scaleY");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.toString, motionConstrainedPoint2.toString)) {
            hashSet2.add("translationX");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.unwrapAs, motionConstrainedPoint2.unwrapAs)) {
            hashSet2.add("translationY");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getValidOutputFormatsForInputhNQ4ISI, motionConstrainedPoint2.getValidOutputFormatsForInputhNQ4ISI)) {
            hashSet2.add("translationZ");
        }
        if (androidx.constraintlayout.core.motion.MotionConstrainedPoint.getHighSpeedVideoFpsRanges(motionConstrainedPoint.getHighSpeedVideoFpsRanges, motionConstrainedPoint2.getHighSpeedVideoFpsRanges)) {
            hashSet2.add("elevation");
        }
        java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList2 = this.CoroutineDebuggingKt;
        if (arrayList2 != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                androidx.constraintlayout.core.motion.key.MotionKey next = it.next();
                if (next instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition) {
                    androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) next;
                    androidx.constraintlayout.core.motion.MotionPaths motionPaths2 = new androidx.constraintlayout.core.motion.MotionPaths(i, i2, motionKeyPosition, this.f2720a, this.unwrapAs);
                    java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it2 = this.coroutineBoundary.iterator();
                    androidx.constraintlayout.core.motion.MotionPaths motionPaths3 = null;
                    while (it2.hasNext()) {
                        androidx.constraintlayout.core.motion.MotionPaths next2 = it2.next();
                        if (motionPaths2.getOutputSizeshNQ4ISI == next2.getOutputSizeshNQ4ISI) {
                            motionPaths3 = next2;
                        }
                    }
                    if (motionPaths3 != null) {
                        this.coroutineBoundary.remove(motionPaths3);
                    }
                    int binarySearch = java.util.Collections.binarySearch(this.coroutineBoundary, motionPaths2);
                    if (binarySearch == 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(" KeyPath position \"");
                        sb.append(motionPaths2.getOutputSizeshNQ4ISI);
                        sb.append("\" outside of range");
                        androidx.constraintlayout.core.motion.utils.Utils.loge("MotionController", sb.toString());
                    }
                    this.coroutineBoundary.add((-binarySearch) - 1, motionPaths2);
                    if (motionKeyPosition.mCurveFit != -1) {
                        this.getOutputSizeshNQ4ISI = motionKeyPosition.mCurveFit;
                    }
                } else if (next instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof androidx.constraintlayout.core.motion.key.MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((androidx.constraintlayout.core.motion.key.MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.accessartificialFrame = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger[]) arrayList.toArray(new androidx.constraintlayout.core.motion.key.MotionKeyTrigger[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.getOutputStallDuration = new java.util.HashMap<>();
            java.util.Iterator<java.lang.String> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                java.lang.String next3 = it3.next();
                if (next3.startsWith("CUSTOM,")) {
                    androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar();
                    java.lang.String str2 = next3.split(",")[1];
                    java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it4 = this.CoroutineDebuggingKt.iterator();
                    while (it4.hasNext()) {
                        androidx.constraintlayout.core.motion.key.MotionKey next4 = it4.next();
                        if (next4.mCustom != null && (customVariable3 = next4.mCustom.get(str2)) != null) {
                            customVar.append(next4.mFramePosition, customVariable3);
                        }
                    }
                    makeSpline2 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(next3, customVar);
                } else {
                    makeSpline2 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(next3, j);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next3);
                    this.getOutputStallDuration.put(next3, makeSpline2);
                }
            }
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList3 = this.CoroutineDebuggingKt;
            if (arrayList3 != null) {
                java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    androidx.constraintlayout.core.motion.key.MotionKey next5 = it5.next();
                    if (next5 instanceof androidx.constraintlayout.core.motion.key.MotionKeyAttributes) {
                        next5.addValues(this.getOutputStallDuration);
                    }
                }
            }
            this.kernelVersion.getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration, 0);
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration, 100);
            for (java.lang.String str3 : this.getOutputStallDuration.keySet()) {
                int intValue = (!hashMap.containsKey(str3) || (num = hashMap.get(str3)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.core.motion.utils.SplineSet splineSet = this.getOutputStallDuration.get(str3);
                if (splineSet != null) {
                    splineSet.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.c == null) {
                this.c = new java.util.HashMap<>();
            }
            java.util.Iterator<java.lang.String> it6 = hashSet.iterator();
            while (it6.hasNext()) {
                java.lang.String next6 = it6.next();
                if (!this.c.containsKey(next6)) {
                    if (next6.startsWith("CUSTOM,")) {
                        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar2 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar();
                        java.lang.String str4 = next6.split(",")[1];
                        java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it7 = this.CoroutineDebuggingKt.iterator();
                        while (it7.hasNext()) {
                            androidx.constraintlayout.core.motion.key.MotionKey next7 = it7.next();
                            if (next7.mCustom != null && (customVariable2 = next7.mCustom.get(str4)) != null) {
                                customVar2.append(next7.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(next6, customVar2);
                    } else {
                        makeSpline = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(next6, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next6);
                    }
                }
            }
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList4 = this.CoroutineDebuggingKt;
            if (arrayList4 != null) {
                java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    androidx.constraintlayout.core.motion.key.MotionKey next8 = it8.next();
                    if (next8 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) {
                        ((androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) next8).addTimeValues(this.c);
                    }
                }
            }
            for (java.lang.String str5 : this.c.keySet()) {
                this.c.get(str5).setup(hashMap.containsKey(str5) ? hashMap.get(str5).intValue() : 0);
            }
        }
        int size = this.coroutineBoundary.size();
        int i5 = size + 2;
        androidx.constraintlayout.core.motion.MotionPaths[] motionPathsArr = new androidx.constraintlayout.core.motion.MotionPaths[i5];
        motionPathsArr[0] = this.f2720a;
        motionPathsArr[size + 1] = this.unwrapAs;
        if (this.coroutineBoundary.size() > 0 && this.getOutputSizeshNQ4ISI == androidx.constraintlayout.core.motion.key.MotionKey.UNSET) {
            this.getOutputSizeshNQ4ISI = 0;
        }
        java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it9 = this.coroutineBoundary.iterator();
        int i6 = 1;
        while (it9.hasNext()) {
            motionPathsArr[i6] = it9.next();
            i6++;
        }
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (java.lang.String str6 : this.unwrapAs.getHighSpeedVideoFpsRanges.keySet()) {
            if (this.f2720a.getHighSpeedVideoFpsRanges.containsKey(str6) && !hashSet2.contains("CUSTOM,".concat(java.lang.String.valueOf(str6)))) {
                hashSet4.add(str6);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) hashSet4.toArray(new java.lang.String[0]);
        this.getOutputMinFrameDurationlomOqCM = strArr;
        this.getOutputSizes = new int[strArr.length];
        int i7 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.getOutputMinFrameDurationlomOqCM;
            if (i7 >= strArr2.length) {
                break;
            }
            java.lang.String str7 = strArr2[i7];
            this.getOutputSizes[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= i5) {
                    break;
                }
                if (motionPathsArr[i8].getHighSpeedVideoFpsRanges.containsKey(str7) && (customVariable = motionPathsArr[i8].getHighSpeedVideoFpsRanges.get(str7)) != null) {
                    int[] iArr = this.getOutputSizes;
                    iArr[i7] = iArr[i7] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z = motionPathsArr[0].getOutputFormats != -1;
        int length = this.getOutputMinFrameDurationlomOqCM.length + 18;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < i5; i9++) {
            androidx.constraintlayout.core.motion.MotionPaths motionPaths4 = motionPathsArr[i9];
            androidx.constraintlayout.core.motion.MotionPaths motionPaths5 = motionPathsArr[i9 - 1];
            boolean highSpeedVideoSizes = androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(motionPaths4.unwrapAs, motionPaths5.unwrapAs);
            boolean highSpeedVideoSizes2 = androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(motionPaths4.isOutputSupportedFor, motionPaths5.isOutputSupportedFor);
            zArr[0] = androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(motionPaths4.getOutputSizeshNQ4ISI, motionPaths5.getOutputSizeshNQ4ISI) | zArr[0];
            zArr[1] = zArr[1] | (highSpeedVideoSizes || highSpeedVideoSizes2 || z);
            zArr[2] = zArr[2] | (highSpeedVideoSizes || highSpeedVideoSizes2 || z);
            zArr[3] = zArr[3] | androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(motionPaths4.isOutputSupportedForhNQ4ISI, motionPaths5.isOutputSupportedForhNQ4ISI);
            zArr[4] = zArr[4] | androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(motionPaths4.getInputFormats, motionPaths5.getInputFormats);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.isOutputSupportedFor = new int[i10];
        int max = java.lang.Math.max(2, i10);
        this.Camera2StreamConfigurationMap = new double[max];
        this.getValidOutputFormatsForInputhNQ4ISI = new double[max];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.isOutputSupportedFor[i12] = i13;
                i12++;
            }
        }
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i5, this.isOutputSupportedFor.length);
        double[] dArr2 = new double[i5];
        int i14 = 0;
        while (i14 < i5) {
            androidx.constraintlayout.core.motion.MotionPaths motionPaths6 = motionPathsArr[i14];
            double[] dArr3 = dArr[i14];
            int[] iArr2 = this.isOutputSupportedFor;
            java.util.HashSet<java.lang.String> hashSet5 = hashSet3;
            float[] fArr = {motionPaths6.getOutputSizeshNQ4ISI, motionPaths6.unwrapAs, motionPaths6.isOutputSupportedFor, motionPaths6.isOutputSupportedForhNQ4ISI, motionPaths6.getInputFormats, motionPaths6.getOutputMinFrameDuration};
            int i15 = 0;
            for (int i16 : iArr2) {
                if (i16 < 6) {
                    dArr3[i15] = fArr[r13];
                    i15++;
                }
            }
            dArr2[i14] = motionPathsArr[i14].toString;
            i14++;
            hashSet3 = hashSet5;
        }
        java.util.HashSet<java.lang.String> hashSet6 = hashSet3;
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.isOutputSupportedFor;
            if (i17 >= iArr3.length) {
                break;
            }
            if (iArr3[i17] < androidx.constraintlayout.core.motion.MotionPaths.getHighResolutionOutputSizeshNQ4ISI.length) {
                java.lang.String str8 = androidx.constraintlayout.core.motion.MotionPaths.getHighResolutionOutputSizeshNQ4ISI[this.isOutputSupportedFor[i17]];
                for (int i18 = 0; i18 < i5; i18++) {
                    double d = dArr[i18][i17];
                }
            }
            i17++;
        }
        this.getHighSpeedVideoSizesFor = new androidx.constraintlayout.core.motion.utils.CurveFit[this.getOutputMinFrameDurationlomOqCM.length + 1];
        int i19 = 0;
        while (true) {
            java.lang.String[] strArr3 = this.getOutputMinFrameDurationlomOqCM;
            if (i19 >= strArr3.length) {
                break;
            }
            java.lang.String str9 = strArr3[i19];
            int i20 = 0;
            int i21 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i20 < i5) {
                if (motionPathsArr[i20].getHighSpeedVideoFpsRanges.containsKey(str9)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i5];
                        androidx.constraintlayout.core.motion.CustomVariable customVariable4 = motionPathsArr[i20].getHighSpeedVideoFpsRanges.get(str9);
                        dArr5 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i5, customVariable4 == null ? 0 : customVariable4.numberOfInterpolatedValues());
                    }
                    dArr4[i21] = motionPathsArr[i20].toString;
                    androidx.constraintlayout.core.motion.MotionPaths motionPaths7 = motionPathsArr[i20];
                    double[] dArr6 = dArr5[i21];
                    androidx.constraintlayout.core.motion.CustomVariable customVariable5 = motionPaths7.getHighSpeedVideoFpsRanges.get(str9);
                    if (customVariable5 != null) {
                        if (customVariable5.numberOfInterpolatedValues() == 1) {
                            dArr6[0] = customVariable5.getValueToInterpolate();
                        } else {
                            int numberOfInterpolatedValues = customVariable5.numberOfInterpolatedValues();
                            customVariable5.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
                            int i22 = 0;
                            int i23 = 0;
                            while (i22 < numberOfInterpolatedValues) {
                                dArr6[i23] = r14[i22];
                                i22++;
                                i23++;
                                str9 = str9;
                                dArr4 = dArr4;
                                dArr5 = dArr5;
                            }
                        }
                    }
                    str = str9;
                    i21++;
                    dArr4 = dArr4;
                    dArr5 = dArr5;
                } else {
                    str = str9;
                }
                i20++;
                str9 = str;
            }
            i19++;
            this.getHighSpeedVideoSizesFor[i19] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.getOutputSizeshNQ4ISI, java.util.Arrays.copyOf(dArr4, i21), (double[][]) java.util.Arrays.copyOf(dArr5, i21));
        }
        this.getHighSpeedVideoSizesFor[0] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.getOutputSizeshNQ4ISI, dArr2, dArr);
        if (motionPathsArr[0].getOutputFormats != -1) {
            int[] iArr4 = new int[i5];
            double[] dArr7 = new double[i5];
            double[][] dArr8 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i5, 2);
            for (int i24 = 0; i24 < i5; i24++) {
                iArr4[i24] = motionPathsArr[i24].getOutputFormats;
                dArr7[i24] = motionPathsArr[i24].toString;
                dArr8[i24][0] = motionPathsArr[i24].unwrapAs;
                dArr8[i24][1] = motionPathsArr[i24].isOutputSupportedFor;
            }
            this.getHighSpeedVideoFpsRangesFor = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(iArr4, dArr7, dArr8);
        }
        this.toString = new java.util.HashMap<>();
        if (this.CoroutineDebuggingKt != null) {
            java.util.Iterator<java.lang.String> it10 = hashSet6.iterator();
            float f2 = Float.NaN;
            while (it10.hasNext()) {
                java.lang.String next9 = it10.next();
                androidx.constraintlayout.core.motion.utils.KeyCycleOscillator makeWidgetCycle = androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.makeWidgetCycle(next9);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && java.lang.Float.isNaN(f2)) {
                        float[] fArr2 = new float[2];
                        double d2 = 0.0d;
                        double d3 = 0.0d;
                        float f3 = 0.0f;
                        int i25 = 100;
                        int i26 = 0;
                        while (i26 < i25) {
                            float f4 = i26 * 0.01010101f;
                            double d4 = f4;
                            androidx.constraintlayout.core.motion.utils.Easing easing = this.f2720a.getHighSpeedVideoSizesFor;
                            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it11 = this.coroutineBoundary.iterator();
                            float f5 = 0.0f;
                            float f6 = Float.NaN;
                            while (it11.hasNext()) {
                                androidx.constraintlayout.core.motion.MotionPaths next10 = it11.next();
                                if (next10.getHighSpeedVideoSizesFor != null) {
                                    if (next10.toString < f4) {
                                        androidx.constraintlayout.core.motion.utils.Easing easing2 = next10.getHighSpeedVideoSizesFor;
                                        f5 = next10.toString;
                                        easing = easing2;
                                    } else if (java.lang.Float.isNaN(f6)) {
                                        f6 = next10.toString;
                                    }
                                }
                            }
                            if (easing != null) {
                                if (java.lang.Float.isNaN(f6)) {
                                    f6 = 1.0f;
                                }
                                d4 = (((float) easing.get((f4 - f5) / r21)) * (f6 - f5)) + f5;
                            }
                            this.getHighSpeedVideoSizesFor[0].getPos(d4, this.Camera2StreamConfigurationMap);
                            int i27 = i25;
                            int i28 = i26;
                            this.f2720a.getHighSpeedVideoSizes(d4, this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, fArr2, 0);
                            if (i28 > 0) {
                                c = 0;
                                f3 += (float) java.lang.Math.hypot(d3 - fArr2[1], d2 - fArr2[0]);
                            } else {
                                c = 0;
                            }
                            i26 = i28 + 1;
                            i25 = i27;
                            d2 = fArr2[c];
                            d3 = fArr2[1];
                        }
                        f2 = f3;
                    }
                    makeWidgetCycle.setType(next9);
                    this.toString.put(next9, makeWidgetCycle);
                }
            }
            java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it12 = this.CoroutineDebuggingKt.iterator();
            while (it12.hasNext()) {
                androidx.constraintlayout.core.motion.key.MotionKey next11 = it12.next();
                if (next11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle) {
                    ((androidx.constraintlayout.core.motion.key.MotionKeyCycle) next11).addCycleValues(this.toString);
                }
            }
            java.util.Iterator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> it13 = this.toString.values().iterator();
            while (it13.hasNext()) {
                it13.next().setup(f2);
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" start: x: ");
        sb.append(this.f2720a.unwrapAs);
        sb.append(" y: ");
        sb.append(this.f2720a.isOutputSupportedFor);
        sb.append(" end: x: ");
        sb.append(this.unwrapAs.unwrapAs);
        sb.append(" y: ");
        sb.append(this.unwrapAs.isOutputSupportedFor);
        return sb.toString();
    }

    public void setView(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.getOutputStallDurationlomOqCM = motionWidget;
    }

    public androidx.constraintlayout.core.motion.MotionWidget getView() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setStart(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.f2720a.toString = 0.0f;
        this.f2720a.getOutputSizeshNQ4ISI = 0.0f;
        androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.f2720a;
        float x = motionWidget.getX();
        float y = motionWidget.getY();
        float width = motionWidget.getWidth();
        float height = motionWidget.getHeight();
        motionPaths.unwrapAs = x;
        motionPaths.isOutputSupportedFor = y;
        motionPaths.isOutputSupportedForhNQ4ISI = width;
        motionPaths.getInputFormats = height;
        this.f2720a.applyParameters(motionWidget);
        androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint = this.kernelVersion;
        float x2 = motionWidget.getX();
        float y2 = motionWidget.getY();
        float width2 = motionWidget.getWidth();
        float height2 = motionWidget.getHeight();
        motionConstrainedPoint.ArtificialStackFrames = x2;
        motionConstrainedPoint.accessartificialFrame = y2;
        motionConstrainedPoint.coroutineBoundary = width2;
        motionConstrainedPoint.Camera2StreamConfigurationMap = height2;
        motionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionWidget);
        androidx.constraintlayout.core.motion.utils.TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setEnd(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.unwrapAs.toString = 1.0f;
        this.unwrapAs.getOutputSizeshNQ4ISI = 1.0f;
        androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.unwrapAs;
        float x = this.getOutputStallDurationlomOqCM.getX();
        float y = this.getOutputStallDurationlomOqCM.getY();
        float width = this.getOutputStallDurationlomOqCM.getWidth();
        float height = this.getOutputStallDurationlomOqCM.getHeight();
        motionPaths.unwrapAs = x;
        motionPaths.isOutputSupportedFor = y;
        motionPaths.isOutputSupportedForhNQ4ISI = width;
        motionPaths.getInputFormats = height;
        androidx.constraintlayout.core.motion.MotionPaths motionPaths2 = this.unwrapAs;
        float left = motionWidget.getLeft();
        float top = motionWidget.getTop();
        float width2 = motionWidget.getWidth();
        float height2 = motionWidget.getHeight();
        motionPaths2.unwrapAs = left;
        motionPaths2.isOutputSupportedFor = top;
        motionPaths2.isOutputSupportedForhNQ4ISI = width2;
        motionPaths2.getInputFormats = height2;
        this.unwrapAs.applyParameters(motionWidget);
        androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint = this.isOutputSupportedForhNQ4ISI;
        float x2 = motionWidget.getX();
        float y2 = motionWidget.getY();
        float width3 = motionWidget.getWidth();
        float height3 = motionWidget.getHeight();
        motionConstrainedPoint.ArtificialStackFrames = x2;
        motionConstrainedPoint.accessartificialFrame = y2;
        motionConstrainedPoint.coroutineBoundary = width3;
        motionConstrainedPoint.Camera2StreamConfigurationMap = height3;
        motionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionWidget);
    }

    public void setStartState(androidx.constraintlayout.core.motion.utils.ViewState viewState, androidx.constraintlayout.core.motion.MotionWidget motionWidget, int i, int i2, int i3) {
        this.f2720a.toString = 0.0f;
        this.f2720a.getOutputSizeshNQ4ISI = 0.0f;
        androidx.constraintlayout.core.motion.utils.Rect rect = new androidx.constraintlayout.core.motion.utils.Rect();
        if (i == 1) {
            int i4 = viewState.left;
            int i5 = viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - (((i4 + i5) + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i == 2) {
            int i6 = viewState.left;
            int i7 = viewState.right;
            rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = ((i6 + i7) - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        androidx.constraintlayout.core.motion.MotionPaths motionPaths = this.f2720a;
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        motionPaths.unwrapAs = f;
        motionPaths.isOutputSupportedFor = f2;
        motionPaths.isOutputSupportedForhNQ4ISI = width;
        motionPaths.getInputFormats = height;
        androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint = this.kernelVersion;
        float f3 = viewState.rotation;
        float f4 = rect.left;
        float f5 = rect.top;
        float width2 = rect.width();
        float height2 = rect.height();
        motionConstrainedPoint.ArtificialStackFrames = f4;
        motionConstrainedPoint.accessartificialFrame = f5;
        motionConstrainedPoint.coroutineBoundary = width2;
        motionConstrainedPoint.Camera2StreamConfigurationMap = height2;
        motionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionWidget);
        motionConstrainedPoint.getHighSpeedVideoSizesFor = Float.NaN;
        motionConstrainedPoint.getInputFormats = Float.NaN;
        if (i == 1) {
            motionConstrainedPoint.getOutputMinFrameDurationlomOqCM = f3 - 90.0f;
        } else if (i == 2) {
            motionConstrainedPoint.getOutputMinFrameDurationlomOqCM = f3 + 90.0f;
        }
    }

    private float getHighSpeedVideoFpsRanges(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.getOutputFormats;
            if (f3 != 1.0d) {
                float f4 = this.getOutputMinFrameDuration;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = java.lang.Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.Easing easing = this.f2720a.getHighSpeedVideoSizesFor;
        java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.coroutineBoundary.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.MotionPaths next = it.next();
            if (next.getHighSpeedVideoSizesFor != null) {
                if (next.toString < f) {
                    easing = next.getHighSpeedVideoSizesFor;
                    f2 = next.toString;
                } else if (java.lang.Float.isNaN(f5)) {
                    f5 = next.toString;
                }
            }
        }
        if (easing != null) {
            float f6 = (java.lang.Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f6;
            f = (((float) easing.get(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    public boolean interpolate(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        double d2;
        androidx.constraintlayout.core.motion.MotionPaths motionPaths;
        float f6;
        androidx.constraintlayout.core.motion.Motion motion = this;
        androidx.constraintlayout.core.motion.MotionWidget motionWidget2 = motionWidget;
        float highSpeedVideoFpsRanges = motion.getHighSpeedVideoFpsRanges(f, null);
        int i = motion.b;
        if (i != -1) {
            float f7 = 1.0f / i;
            float floor = (float) java.lang.Math.floor(highSpeedVideoFpsRanges / f7);
            float f8 = (highSpeedVideoFpsRanges % f7) / f7;
            if (!java.lang.Float.isNaN(motion._CREATION)) {
                f8 = (f8 + motion._CREATION) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator differentialInterpolator = motion.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (differentialInterpolator != null) {
                f6 = differentialInterpolator.getInterpolation(f8);
            } else {
                f6 = ((double) f8) > 0.5d ? 1.0f : 0.0f;
            }
            highSpeedVideoFpsRanges = (f6 * f7) + (floor * f7);
        }
        float f9 = highSpeedVideoFpsRanges;
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap = motion.getOutputStallDuration;
        if (hashMap != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.utils.SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f9);
            }
        }
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = motion.getHighSpeedVideoSizesFor;
        if (curveFitArr != null) {
            double d3 = f9;
            curveFitArr[0].getPos(d3, motion.Camera2StreamConfigurationMap);
            motion.getHighSpeedVideoSizesFor[0].getSlope(d3, motion.getValidOutputFormatsForInputhNQ4ISI);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = motion.getHighSpeedVideoFpsRangesFor;
            if (curveFit != null) {
                double[] dArr = motion.Camera2StreamConfigurationMap;
                if (dArr.length > 0) {
                    curveFit.getPos(d3, dArr);
                    motion.getHighSpeedVideoFpsRangesFor.getSlope(d3, motion.getValidOutputFormatsForInputhNQ4ISI);
                }
            }
            if (motion.coroutineCreation) {
                d = d3;
                f2 = f9;
            } else {
                androidx.constraintlayout.core.motion.MotionPaths motionPaths2 = motion.f2720a;
                int[] iArr = motion.isOutputSupportedFor;
                double[] dArr2 = motion.Camera2StreamConfigurationMap;
                double[] dArr3 = motion.getValidOutputFormatsForInputhNQ4ISI;
                float f10 = motionPaths2.unwrapAs;
                float f11 = motionPaths2.isOutputSupportedFor;
                float f12 = motionPaths2.isOutputSupportedForhNQ4ISI;
                float f13 = motionPaths2.getInputFormats;
                if (iArr.length != 0 && motionPaths2.getValidOutputFormatsForInputhNQ4ISI.length <= iArr[iArr.length - 1]) {
                    int i2 = iArr[iArr.length - 1] + 1;
                    motionPaths2.getValidOutputFormatsForInputhNQ4ISI = new double[i2];
                    motionPaths2.getOutputStallDurationlomOqCM = new double[i2];
                }
                java.util.Arrays.fill(motionPaths2.getValidOutputFormatsForInputhNQ4ISI, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    double[] dArr4 = motionPaths2.getValidOutputFormatsForInputhNQ4ISI;
                    int i4 = iArr[i3];
                    dArr4[i4] = dArr2[i3];
                    motionPaths2.getOutputStallDurationlomOqCM[i4] = dArr3[i3];
                }
                float f14 = f11;
                float f15 = f12;
                f2 = f9;
                float f16 = Float.NaN;
                float f17 = f13;
                float f18 = 0.0f;
                float f19 = 0.0f;
                int i5 = 0;
                float f20 = 0.0f;
                float f21 = f10;
                float f22 = 0.0f;
                while (true) {
                    double[] dArr5 = motionPaths2.getValidOutputFormatsForInputhNQ4ISI;
                    f3 = f20;
                    f4 = f22;
                    if (i5 >= dArr5.length) {
                        break;
                    }
                    if (java.lang.Double.isNaN(dArr5[i5])) {
                        d2 = d3;
                        motionPaths = motionPaths2;
                    } else {
                        d2 = d3;
                        float f23 = (float) (java.lang.Double.isNaN(motionPaths2.getValidOutputFormatsForInputhNQ4ISI[i5]) ? 0.0d : motionPaths2.getValidOutputFormatsForInputhNQ4ISI[i5] + 0.0d);
                        motionPaths = motionPaths2;
                        float f24 = (float) motionPaths2.getOutputStallDurationlomOqCM[i5];
                        if (i5 == 1) {
                            f18 = f24;
                            f21 = f23;
                        } else if (i5 == 2) {
                            f19 = f24;
                            f14 = f23;
                        } else if (i5 == 3) {
                            f15 = f23;
                            f20 = f3;
                            f22 = f24;
                            i5++;
                            motionPaths2 = motionPaths;
                            d3 = d2;
                        } else if (i5 == 4) {
                            f20 = f24;
                            f17 = f23;
                            f22 = f4;
                            i5++;
                            motionPaths2 = motionPaths;
                            d3 = d2;
                        } else if (i5 == 5) {
                            f16 = f23;
                        }
                    }
                    f20 = f3;
                    f22 = f4;
                    i5++;
                    motionPaths2 = motionPaths;
                    d3 = d2;
                }
                d = d3;
                androidx.constraintlayout.core.motion.Motion motion2 = motionPaths2.getOutputSizes;
                if (motion2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motion2.getCenter(d, fArr, fArr2);
                    float f25 = fArr[0];
                    float f26 = fArr[1];
                    float f27 = fArr2[0];
                    float f28 = fArr2[1];
                    double d4 = f21;
                    float f29 = f16;
                    double d5 = f14;
                    f5 = f15;
                    float sin = (float) ((f25 + (java.lang.Math.sin(d5) * d4)) - (f15 / 2.0f));
                    float cos = (float) ((f26 - (java.lang.Math.cos(d5) * d4)) - (f17 / 2.0f));
                    double d6 = f18;
                    double d7 = f19;
                    float sin2 = (float) (f27 + (java.lang.Math.sin(d5) * d6) + (java.lang.Math.cos(d5) * d4 * d7));
                    float cos2 = (float) ((f28 - (d6 * java.lang.Math.cos(d5))) + (java.lang.Math.sin(d5) * d4 * d7));
                    if (dArr3.length >= 2) {
                        dArr3[0] = sin2;
                        dArr3[1] = cos2;
                    }
                    if (java.lang.Float.isNaN(f29)) {
                        motionWidget2 = motionWidget;
                    } else {
                        motionWidget2 = motionWidget;
                        motionWidget2.setRotationZ((float) (f29 + java.lang.Math.toDegrees(java.lang.Math.atan2(cos2, sin2))));
                    }
                    f21 = sin;
                    f14 = cos;
                } else {
                    f5 = f15;
                    float f30 = f16;
                    if (!java.lang.Float.isNaN(f30)) {
                        motionWidget2.setRotationZ(((float) (f30 + java.lang.Math.toDegrees(java.lang.Math.atan2(f19 + (f3 / 2.0f), f18 + (f4 / 2.0f))))) + 0.0f);
                    }
                }
                float f31 = f21 + 0.5f;
                float f32 = f14 + 0.5f;
                motionWidget2.layout((int) f31, (int) f32, (int) (f31 + f5), (int) (f32 + f17));
            }
            motion = this;
            if (motion.AMEXKernel != -1) {
                if (motion.init == null) {
                    motion.init = motionWidget.getParent().findViewById(motion.AMEXKernel);
                }
                if (motion.init != null) {
                    float top = (r1.getTop() + motion.init.getBottom()) / 2.0f;
                    float left = (motion.init.getLeft() + motion.init.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        float left2 = motionWidget.getLeft();
                        float top2 = motionWidget.getTop();
                        motionWidget2.setPivotX(left - left2);
                        motionWidget2.setPivotY(top - top2);
                    }
                }
            }
            int i6 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr2 = motion.getHighSpeedVideoSizesFor;
                if (i6 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i6].getPos(d, motion.d);
                motion.f2720a.getHighSpeedVideoFpsRanges.get(motion.getOutputMinFrameDurationlomOqCM[i6 - 1]).setInterpolatedValue(motionWidget2, motion.d);
                i6++;
            }
            if (motion.kernelVersion.coroutineCreation == 0) {
                if (f2 <= 0.0f) {
                    motionWidget2.setVisibility(motion.kernelVersion.isOutputSupportedFor);
                } else if (f2 >= 1.0f) {
                    motionWidget2.setVisibility(motion.isOutputSupportedForhNQ4ISI.isOutputSupportedFor);
                } else if (motion.isOutputSupportedForhNQ4ISI.isOutputSupportedFor != motion.kernelVersion.isOutputSupportedFor) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (motion.accessartificialFrame != null) {
                int i7 = 0;
                while (true) {
                    androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] motionKeyTriggerArr = motion.accessartificialFrame;
                    if (i7 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i7].conditionallyFire(f2, motionWidget2);
                    i7++;
                }
            }
            f9 = f2;
        } else {
            float f33 = motion.f2720a.unwrapAs + ((motion.unwrapAs.unwrapAs - motion.f2720a.unwrapAs) * f9) + 0.5f;
            float f34 = motion.f2720a.isOutputSupportedFor + ((motion.unwrapAs.isOutputSupportedFor - motion.f2720a.isOutputSupportedFor) * f9) + 0.5f;
            motionWidget2.layout((int) f33, (int) f34, (int) (f33 + motion.f2720a.isOutputSupportedForhNQ4ISI + ((motion.unwrapAs.isOutputSupportedForhNQ4ISI - motion.f2720a.isOutputSupportedForhNQ4ISI) * f9)), (int) (f34 + motion.f2720a.getInputFormats + ((motion.unwrapAs.getInputFormats - motion.f2720a.getInputFormats) * f9)));
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> hashMap2 = motion.toString;
        if (hashMap2 == null) {
            return false;
        }
        for (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
            if (keyCycleOscillator instanceof androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) {
                double[] dArr6 = motion.getValidOutputFormatsForInputhNQ4ISI;
                ((androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f9, dArr6[0], dArr6[1]);
            } else {
                keyCycleOscillator.setProperty(motionWidget2, f9);
            }
        }
        return false;
    }

    public void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(f, this.AMEXKernela);
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.getHighSpeedVideoSizesFor;
        int i = 0;
        if (curveFitArr != null) {
            double d = highSpeedVideoFpsRanges;
            curveFitArr[0].getSlope(d, this.getValidOutputFormatsForInputhNQ4ISI);
            this.getHighSpeedVideoSizesFor[0].getPos(d, this.Camera2StreamConfigurationMap);
            float f4 = this.AMEXKernela[0];
            while (true) {
                dArr = this.getValidOutputFormatsForInputhNQ4ISI;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.getHighSpeedVideoFpsRangesFor;
            if (curveFit != null) {
                double[] dArr2 = this.Camera2StreamConfigurationMap;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.getHighSpeedVideoFpsRangesFor.getSlope(d, this.getValidOutputFormatsForInputhNQ4ISI);
                    androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(f2, f3, fArr, this.isOutputSupportedFor, this.getValidOutputFormatsForInputhNQ4ISI);
                    return;
                }
                return;
            }
            androidx.constraintlayout.core.motion.MotionPaths.getHighSpeedVideoSizes(f2, f3, fArr, this.isOutputSupportedFor, dArr);
            return;
        }
        float f5 = this.unwrapAs.unwrapAs - this.f2720a.unwrapAs;
        float f6 = this.unwrapAs.isOutputSupportedFor - this.f2720a.isOutputSupportedFor;
        float f7 = this.unwrapAs.isOutputSupportedForhNQ4ISI;
        float f8 = this.f2720a.isOutputSupportedForhNQ4ISI;
        float f9 = this.unwrapAs.getInputFormats;
        float f10 = this.f2720a.getInputFormats;
        fArr[0] = ((1.0f - f2) * f5) + (((f7 - f8) + f5) * f2);
        fArr[1] = ((1.0f - f3) * f6) + (((f9 - f10) + f6) * f3);
    }

    public int getDrawPath() {
        int i = this.f2720a.getHighSpeedVideoSizes;
        java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.coroutineBoundary.iterator();
        while (it.hasNext()) {
            i = java.lang.Math.max(i, it.next().getHighSpeedVideoSizes);
        }
        return java.lang.Math.max(i, this.unwrapAs.getHighSpeedVideoSizes);
    }

    public void setDrawPath(int i) {
        this.f2720a.getHighSpeedVideoSizes = i;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it = this.CoroutineDebuggingKt.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.MotionKey next = it.next();
            iArr[i] = next.mFramePosition + (next.mType * 1000);
            double d = next.mFramePosition / 100.0f;
            this.getHighSpeedVideoSizesFor[0].getPos(d, this.Camera2StreamConfigurationMap);
            this.f2720a.getHighSpeedVideoSizes(d, this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        java.util.Iterator<androidx.constraintlayout.core.motion.key.MotionKey> it = this.CoroutineDebuggingKt.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.MotionKey next = it.next();
            if (next.mType == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = next.mType;
                iArr[i3 + 2] = next.mFramePosition;
                double d = next.mFramePosition / 100.0f;
                this.getHighSpeedVideoSizesFor[0].getPos(d, this.Camera2StreamConfigurationMap);
                this.f2720a.getHighSpeedVideoSizes(d, this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, fArr, 0);
                iArr[i3 + 3] = java.lang.Float.floatToIntBits(fArr[0]);
                int i4 = i3 + 4;
                iArr[i4] = java.lang.Float.floatToIntBits(fArr[1]);
                if (next instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition) {
                    androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) next;
                    iArr[i3 + 5] = motionKeyPosition.mPositionType;
                    iArr[i3 + 6] = java.lang.Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i4 = i3 + 7;
                    iArr[i4] = java.lang.Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i5 = i4 + 1;
                iArr[i3] = i5 - i3;
                i2++;
                i3 = i5;
            }
        }
        return i2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 509) {
            setPathMotionArc(i2);
            return true;
        }
        if (i != 610) {
            return i == 704;
        }
        this.b = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (602 == i) {
            this._CREATION = f;
            return true;
        }
        if (600 != i) {
            return false;
        }
        this.getHighSpeedVideoFpsRanges = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (705 == i || 611 == i) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.constraintlayout.core.motion.utils.DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
                float Camera2StreamConfigurationMap;

                @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
                public float getInterpolation(float f) {
                    this.Camera2StreamConfigurationMap = f;
                    return (float) androidx.constraintlayout.core.motion.utils.Easing.this.get(f);
                }

                @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
                public float getVelocity() {
                    return (float) androidx.constraintlayout.core.motion.utils.Easing.this.getDiff(this.Camera2StreamConfigurationMap);
                }
            };
            return true;
        }
        if (605 != i) {
            return false;
        }
        this.f2720a.Camera2StreamConfigurationMap = str;
        return true;
    }

    public void setStaggerScale(float f) {
        this.getOutputFormats = f;
    }

    public void setStaggerOffset(float f) {
        this.getOutputMinFrameDuration = f;
    }

    public float getMotionStagger() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setIdString(java.lang.String str) {
        this.mId = str;
        this.f2720a.mId = str;
    }
}
