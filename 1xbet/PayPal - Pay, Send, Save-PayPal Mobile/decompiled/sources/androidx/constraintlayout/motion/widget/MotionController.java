package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class MotionController {
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
    androidx.constraintlayout.core.motion.utils.CurveFit Camera2StreamConfigurationMap;
    android.view.View _BOUNDARY;
    private int[] _CREATION;
    private java.lang.String[] b;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> d;
    float getHighResolutionOutputSizeshNQ4ISI;
    java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;
    java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> getOutputMinFrameDuration;
    int[] getOutputMinFrameDurationlomOqCM;
    double[] getOutputSizes;
    double[] getOutputSizeshNQ4ISI;
    androidx.constraintlayout.motion.widget.KeyTrigger[] getOutputStallDuration;
    androidx.constraintlayout.core.motion.utils.CurveFit[] toString;
    android.graphics.Rect accessartificialFrame = new android.graphics.Rect();
    boolean getInputSizeshNQ4ISI = false;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME = -1;
    androidx.constraintlayout.motion.widget.MotionPaths coroutineCreation = new androidx.constraintlayout.motion.widget.MotionPaths();
    androidx.constraintlayout.motion.widget.MotionPaths getOutputFormats = new androidx.constraintlayout.motion.widget.MotionPaths();
    androidx.constraintlayout.motion.widget.MotionConstrainedPoint ArtificialStackFrames = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    androidx.constraintlayout.motion.widget.MotionConstrainedPoint getHighSpeedVideoSizesFor = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    float isOutputSupportedForhNQ4ISI = Float.NaN;
    float getValidOutputFormatsForInputhNQ4ISI = 0.0f;
    float CoroutineDebuggingKt = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private int f2726a = 4;
    private float[] release = new float[4];
    java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> unwrapAs = new java.util.ArrayList<>();
    float[] coroutineBoundary = new float[1];
    java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getOutputStallDurationlomOqCM = new java.util.ArrayList<>();
    private int c = androidx.constraintlayout.motion.widget.Key.UNSET;
    private int AMEXKernela = androidx.constraintlayout.motion.widget.Key.UNSET;
    private android.view.View exchange = null;
    private int AMEXKernel = androidx.constraintlayout.motion.widget.Key.UNSET;
    private float kernelVersion = Float.NaN;
    private android.view.animation.Interpolator init = null;
    boolean isOutputSupportedFor = false;

    public int getTransformPivotTarget() {
        return this.AMEXKernela;
    }

    public void setTransformPivotTarget(int i) {
        this.AMEXKernela = i;
        this.exchange = null;
    }

    MotionController(android.view.View view) {
        setView(view);
    }

    public float getStartX() {
        return this.coroutineCreation.isOutputSupportedFor;
    }

    public float getStartY() {
        return this.coroutineCreation.toString;
    }

    public float getFinalX() {
        return this.getOutputFormats.isOutputSupportedFor;
    }

    public float getFinalY() {
        return this.getOutputFormats.toString;
    }

    public float getStartWidth() {
        return this.coroutineCreation.unwrapAs;
    }

    public float getStartHeight() {
        return this.coroutineCreation.getOutputFormats;
    }

    public float getFinalWidth() {
        return this.getOutputFormats.unwrapAs;
    }

    public float getFinalHeight() {
        return this.getOutputFormats.getOutputFormats;
    }

    public int getAnimateRelativeTo() {
        return this.coroutineCreation.getHighSpeedVideoFpsRangesFor;
    }

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController motionController) {
        this.coroutineCreation.getHighResolutionOutputSizeshNQ4ISI(motionController, motionController.coroutineCreation);
        this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI(motionController, motionController.getOutputFormats);
    }

    public float getCenterX() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getCenterY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.toString[0].getPos(d, dArr);
        this.toString[0].getSlope(d, dArr2);
        float f = 0.0f;
        java.util.Arrays.fill(fArr2, 0.0f);
        androidx.constraintlayout.motion.widget.MotionPaths motionPaths = this.coroutineCreation;
        int[] iArr = this.getOutputMinFrameDurationlomOqCM;
        float f2 = motionPaths.isOutputSupportedFor;
        float f3 = motionPaths.toString;
        float f4 = motionPaths.unwrapAs;
        float f5 = motionPaths.getOutputFormats;
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
        androidx.constraintlayout.motion.widget.MotionController motionController = motionPaths.getOutputSizes;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
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

    public void remeasure() {
        this.getInputSizeshNQ4ISI = true;
    }

    final void getHighSpeedVideoFpsRangesFor(float[] fArr, int i) {
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap = this.getHighSpeedVideoFpsRanges;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap2 = this.getHighSpeedVideoFpsRanges;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap3 = this.getOutputMinFrameDuration;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap4 = this.getOutputMinFrameDuration;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f3 = i2 * f2;
            float f4 = this.CoroutineDebuggingKt;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = java.lang.Math.min((f3 - f6) * f4, f);
                }
            }
            float f7 = f3;
            double d = f7;
            androidx.constraintlayout.core.motion.utils.Easing easing = this.coroutineCreation.getHighSpeedVideoSizesFor;
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.unwrapAs.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.MotionPaths next = it.next();
                if (next.getHighSpeedVideoSizesFor != null) {
                    if (next.isOutputSupportedForhNQ4ISI < f7) {
                        easing = next.getHighSpeedVideoSizesFor;
                        f5 = next.isOutputSupportedForhNQ4ISI;
                    } else if (java.lang.Float.isNaN(f8)) {
                        f8 = next.isOutputSupportedForhNQ4ISI;
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
            this.toString[0].getPos(d2, this.getOutputSizeshNQ4ISI);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.Camera2StreamConfigurationMap;
            if (curveFit != null) {
                double[] dArr = this.getOutputSizeshNQ4ISI;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.coroutineCreation.Camera2StreamConfigurationMap(d2, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, fArr, i3);
            if (viewOscillator != null) {
                fArr[i3] = fArr[i3] + viewOscillator.get(f7);
            } else if (viewSpline != null) {
                fArr[i3] = fArr[i3] + viewSpline.get(f7);
            }
            if (viewOscillator2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + viewOscillator2.get(f7);
            } else if (viewSpline2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + viewSpline2.get(f7);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    final int getHighResolutionOutputSizeshNQ4ISI(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.toString[0].getTimePoints();
        if (iArr != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.unwrapAs.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().getOutputMinFrameDuration;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.toString[0].getPos(timePoints[i3], this.getOutputSizeshNQ4ISI);
            this.coroutineCreation.Camera2StreamConfigurationMap(timePoints[i3], this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    final float getHighResolutionOutputSizeshNQ4ISI(int i, float f, float f2) {
        float f3 = this.getOutputFormats.isOutputSupportedFor - this.coroutineCreation.isOutputSupportedFor;
        float f4 = this.getOutputFormats.toString - this.coroutineCreation.toString;
        float f5 = this.coroutineCreation.isOutputSupportedFor;
        float f6 = this.coroutineCreation.unwrapAs / 2.0f;
        float f7 = this.coroutineCreation.toString;
        float f8 = this.coroutineCreation.getOutputFormats / 2.0f;
        float hypot = (float) java.lang.Math.hypot(f3, f4);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f9 = f - (f5 + f6);
        float f10 = f2 - (f7 + f8);
        if (((float) java.lang.Math.hypot(f9, f10)) == 0.0f) {
            return 0.0f;
        }
        float f11 = (f9 * f3) + (f10 * f4);
        if (i == 0) {
            return f11 / hypot;
        }
        if (i == 1) {
            return (float) java.lang.Math.sqrt((hypot * hypot) - (f11 * f11));
        }
        if (i == 2) {
            return f9 / f3;
        }
        if (i == 3) {
            return f10 / f3;
        }
        if (i == 4) {
            return f9 / f4;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f10 / f4;
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key key) {
        this.getOutputStallDurationlomOqCM.add(key);
    }

    public void setPathMotionArc(int i) {
        this.c = i;
    }

    public void setup(int i, int i2, float f, long j) {
        java.util.ArrayList arrayList;
        char c;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute;
        androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2;
        java.lang.Integer num;
        androidx.constraintlayout.motion.utils.ViewSpline makeSpline2;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute3;
        new java.util.HashSet();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        if (this.c != androidx.constraintlayout.motion.widget.Key.UNSET) {
            this.coroutineCreation.getInputFormats = this.c;
        }
        androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint = this.ArtificialStackFrames;
        androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint2 = this.getHighSpeedVideoSizesFor;
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.Camera2StreamConfigurationMap, motionConstrainedPoint2.Camera2StreamConfigurationMap)) {
            hashSet2.add("alpha");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getHighSpeedVideoFpsRanges, motionConstrainedPoint2.getHighSpeedVideoFpsRanges)) {
            hashSet2.add("elevation");
        }
        int i3 = motionConstrainedPoint.isOutputSupportedFor;
        int i4 = motionConstrainedPoint2.isOutputSupportedFor;
        if (i3 != i4 && motionConstrainedPoint.coroutineBoundary == 0 && (i3 == 0 || i4 == 0)) {
            hashSet2.add("alpha");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getOutputMinFrameDurationlomOqCM, motionConstrainedPoint2.getOutputMinFrameDurationlomOqCM)) {
            hashSet2.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(motionConstrainedPoint.getHighSpeedVideoSizesFor) || !java.lang.Float.isNaN(motionConstrainedPoint2.getHighSpeedVideoSizesFor)) {
            hashSet2.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(motionConstrainedPoint.getInputSizeshNQ4ISI) || !java.lang.Float.isNaN(motionConstrainedPoint2.getInputSizeshNQ4ISI)) {
            hashSet2.add("progress");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getOutputSizeshNQ4ISI, motionConstrainedPoint2.getOutputSizeshNQ4ISI)) {
            hashSet2.add("rotationX");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.CoroutineDebuggingKt, motionConstrainedPoint2.CoroutineDebuggingKt)) {
            hashSet2.add("rotationY");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getInputFormats, motionConstrainedPoint2.getInputFormats)) {
            hashSet2.add(androidx.constraintlayout.motion.widget.Key.PIVOT_X);
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getOutputMinFrameDuration, motionConstrainedPoint2.getOutputMinFrameDuration)) {
            hashSet2.add(androidx.constraintlayout.motion.widget.Key.PIVOT_Y);
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getOutputStallDuration, motionConstrainedPoint2.getOutputStallDuration)) {
            hashSet2.add("scaleX");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getOutputStallDurationlomOqCM, motionConstrainedPoint2.getOutputStallDurationlomOqCM)) {
            hashSet2.add("scaleY");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.isOutputSupportedForhNQ4ISI, motionConstrainedPoint2.isOutputSupportedForhNQ4ISI)) {
            hashSet2.add("translationX");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.getValidOutputFormatsForInputhNQ4ISI, motionConstrainedPoint2.getValidOutputFormatsForInputhNQ4ISI)) {
            hashSet2.add("translationY");
        }
        if (androidx.constraintlayout.motion.widget.MotionConstrainedPoint.getHighSpeedVideoFpsRangesFor(motionConstrainedPoint.unwrapAs, motionConstrainedPoint2.unwrapAs)) {
            hashSet2.add("translationZ");
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList2 = this.getOutputStallDurationlomOqCM;
        char c2 = 1;
        if (arrayList2 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.Key next = it.next();
                if (next instanceof androidx.constraintlayout.motion.widget.KeyPosition) {
                    androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) next;
                    androidx.constraintlayout.motion.widget.MotionPaths motionPaths = new androidx.constraintlayout.motion.widget.MotionPaths(i, i2, keyPosition, this.coroutineCreation, this.getOutputFormats);
                    int binarySearch = java.util.Collections.binarySearch(this.unwrapAs, motionPaths);
                    if (binarySearch == 0) {
                        float f2 = motionPaths.getOutputMinFrameDurationlomOqCM;
                    }
                    this.unwrapAs.add((-binarySearch) - 1, motionPaths);
                    if (keyPosition.getOutputSizes != androidx.constraintlayout.motion.widget.Key.UNSET) {
                        this.getARTIFICIAL_FRAME_PACKAGE_NAME = keyPosition.getOutputSizes;
                    }
                } else if (next instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof androidx.constraintlayout.motion.widget.KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((androidx.constraintlayout.motion.widget.KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i5 = 0;
        if (arrayList != null) {
            this.getOutputStallDuration = (androidx.constraintlayout.motion.widget.KeyTrigger[]) arrayList.toArray(new androidx.constraintlayout.motion.widget.KeyTrigger[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
            java.util.Iterator<java.lang.String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                java.lang.String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    android.util.SparseArray sparseArray = new android.util.SparseArray();
                    java.lang.String str = next2.split(",")[c2];
                    java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it3 = this.getOutputStallDurationlomOqCM.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.motion.widget.Key next3 = it3.next();
                        if (next3.Camera2StreamConfigurationMap != null && (constraintAttribute3 = next3.Camera2StreamConfigurationMap.get(str)) != null) {
                            sparseArray.append(next3.getHighResolutionOutputSizeshNQ4ISI, constraintAttribute3);
                        }
                    }
                    makeSpline2 = androidx.constraintlayout.motion.utils.ViewSpline.makeCustomSpline(next2, (android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute>) sparseArray);
                } else {
                    makeSpline2 = androidx.constraintlayout.motion.utils.ViewSpline.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.getHighSpeedVideoFpsRanges.put(next2, makeSpline2);
                }
                c2 = 1;
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList3 = this.getOutputStallDurationlomOqCM;
            if (arrayList3 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    androidx.constraintlayout.motion.widget.Key next4 = it4.next();
                    if (next4 instanceof androidx.constraintlayout.motion.widget.KeyAttributes) {
                        next4.addValues(this.getHighSpeedVideoFpsRanges);
                    }
                }
            }
            this.ArtificialStackFrames.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, 0);
            this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, 100);
            for (java.lang.String str2 : this.getHighSpeedVideoFpsRanges.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.motion.utils.ViewSpline viewSpline = this.getHighSpeedVideoFpsRanges.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.d == null) {
                this.d = new java.util.HashMap<>();
            }
            java.util.Iterator<java.lang.String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                java.lang.String next5 = it5.next();
                if (!this.d.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                        java.lang.String str3 = next5.split(",")[1];
                        java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it6 = this.getOutputStallDurationlomOqCM.iterator();
                        while (it6.hasNext()) {
                            androidx.constraintlayout.motion.widget.Key next6 = it6.next();
                            if (next6.Camera2StreamConfigurationMap != null && (constraintAttribute2 = next6.Camera2StreamConfigurationMap.get(str3)) != null) {
                                sparseArray2.append(next6.getHighResolutionOutputSizeshNQ4ISI, constraintAttribute2);
                            }
                        }
                        makeSpline = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(next5, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.d.put(next5, makeSpline);
                    }
                }
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList4 = this.getOutputStallDurationlomOqCM;
            if (arrayList4 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    androidx.constraintlayout.motion.widget.Key next7 = it7.next();
                    if (next7 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                        ((androidx.constraintlayout.motion.widget.KeyTimeCycle) next7).addTimeValues(this.d);
                    }
                }
            }
            for (java.lang.String str4 : this.d.keySet()) {
                this.d.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = this.unwrapAs.size();
        int i6 = size + 2;
        androidx.constraintlayout.motion.widget.MotionPaths[] motionPathsArr = new androidx.constraintlayout.motion.widget.MotionPaths[i6];
        motionPathsArr[0] = this.coroutineCreation;
        motionPathsArr[size + 1] = this.getOutputFormats;
        if (this.unwrapAs.size() > 0 && this.getARTIFICIAL_FRAME_PACKAGE_NAME == -1) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it8 = this.unwrapAs.iterator();
        int i7 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i7] = it8.next();
            i7++;
        }
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (java.lang.String str5 : this.getOutputFormats.getHighSpeedVideoSizes.keySet()) {
            if (this.coroutineCreation.getHighSpeedVideoSizes.containsKey(str5) && !hashSet2.contains("CUSTOM,".concat(java.lang.String.valueOf(str5)))) {
                hashSet4.add(str5);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) hashSet4.toArray(new java.lang.String[0]);
        this.b = strArr;
        this._CREATION = new int[strArr.length];
        int i8 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.b;
            if (i8 >= strArr2.length) {
                break;
            }
            java.lang.String str6 = strArr2[i8];
            this._CREATION[i8] = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= i6) {
                    break;
                }
                if (motionPathsArr[i9].getHighSpeedVideoSizes.containsKey(str6) && (constraintAttribute = motionPathsArr[i9].getHighSpeedVideoSizes.get(str6)) != null) {
                    int[] iArr = this._CREATION;
                    iArr[i8] = iArr[i8] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i9++;
            }
            i8++;
        }
        boolean z = motionPathsArr[0].getInputFormats != androidx.constraintlayout.motion.widget.Key.UNSET;
        int length = this.b.length + 18;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < i6; i10++) {
            androidx.constraintlayout.motion.widget.MotionPaths motionPaths2 = motionPathsArr[i10];
            androidx.constraintlayout.motion.widget.MotionPaths motionPaths3 = motionPathsArr[i10 - 1];
            boolean highSpeedVideoFpsRanges = androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges(motionPaths2.isOutputSupportedFor, motionPaths3.isOutputSupportedFor);
            boolean highSpeedVideoFpsRanges2 = androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges(motionPaths2.toString, motionPaths3.toString);
            zArr[0] = androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges(motionPaths2.getOutputMinFrameDurationlomOqCM, motionPaths3.getOutputMinFrameDurationlomOqCM) | zArr[0];
            boolean z2 = highSpeedVideoFpsRanges2 | highSpeedVideoFpsRanges | z;
            zArr[1] = zArr[1] | z2;
            zArr[2] = z2 | zArr[2];
            zArr[3] = zArr[3] | androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges(motionPaths2.unwrapAs, motionPaths3.unwrapAs);
            zArr[4] = zArr[4] | androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges(motionPaths2.getOutputFormats, motionPaths3.getOutputFormats);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        this.getOutputMinFrameDurationlomOqCM = new int[i11];
        int max = java.lang.Math.max(2, i11);
        this.getOutputSizeshNQ4ISI = new double[max];
        this.getOutputSizes = new double[max];
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                this.getOutputMinFrameDurationlomOqCM[i13] = i14;
                i13++;
            }
        }
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i6, this.getOutputMinFrameDurationlomOqCM.length);
        double[] dArr2 = new double[i6];
        int i15 = 0;
        while (i15 < i6) {
            androidx.constraintlayout.motion.widget.MotionPaths motionPaths4 = motionPathsArr[i15];
            double[] dArr3 = dArr[i15];
            int[] iArr2 = this.getOutputMinFrameDurationlomOqCM;
            java.util.HashSet<java.lang.String> hashSet5 = hashSet3;
            double[][] dArr4 = dArr;
            float[] fArr = {motionPaths4.getOutputMinFrameDurationlomOqCM, motionPaths4.isOutputSupportedFor, motionPaths4.toString, motionPaths4.unwrapAs, motionPaths4.getOutputFormats, motionPaths4.getInputSizeshNQ4ISI};
            int i16 = 0;
            for (int i17 : iArr2) {
                if (i17 < 6) {
                    dArr3[i16] = fArr[r14];
                    i16++;
                }
            }
            dArr2[i15] = motionPathsArr[i15].isOutputSupportedForhNQ4ISI;
            i15++;
            hashSet3 = hashSet5;
            dArr = dArr4;
        }
        double[][] dArr5 = dArr;
        java.util.HashSet<java.lang.String> hashSet6 = hashSet3;
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.getOutputMinFrameDurationlomOqCM;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges.length) {
                java.lang.String str7 = androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDurationlomOqCM[i18]];
                for (int i19 = 0; i19 < i6; i19++) {
                    double d = dArr5[i19][i18];
                }
            }
            i18++;
        }
        this.toString = new androidx.constraintlayout.core.motion.utils.CurveFit[this.b.length + 1];
        int i20 = 0;
        while (true) {
            java.lang.String[] strArr3 = this.b;
            if (i20 >= strArr3.length) {
                break;
            }
            java.lang.String str8 = strArr3[i20];
            int i21 = i5;
            int i22 = i21;
            double[] dArr6 = null;
            double[][] dArr7 = null;
            while (i21 < i6) {
                if (motionPathsArr[i21].getHighSpeedVideoSizes.containsKey(str8)) {
                    if (dArr7 == null) {
                        dArr6 = new double[i6];
                        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute4 = motionPathsArr[i21].getHighSpeedVideoSizes.get(str8);
                        dArr7 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i6, constraintAttribute4 == null ? i5 : constraintAttribute4.numberOfInterpolatedValues());
                    }
                    dArr6[i22] = motionPathsArr[i21].isOutputSupportedForhNQ4ISI;
                    androidx.constraintlayout.motion.widget.MotionPaths motionPaths5 = motionPathsArr[i21];
                    double[] dArr8 = dArr7[i22];
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute5 = motionPaths5.getHighSpeedVideoSizes.get(str8);
                    if (constraintAttribute5 != null) {
                        if (constraintAttribute5.numberOfInterpolatedValues() == 1) {
                            dArr8[i5] = constraintAttribute5.getValueToInterpolate();
                        } else {
                            int numberOfInterpolatedValues = constraintAttribute5.numberOfInterpolatedValues();
                            float[] fArr2 = new float[numberOfInterpolatedValues];
                            constraintAttribute5.getValuesToInterpolate(fArr2);
                            int i23 = i5;
                            int i24 = i23;
                            while (i23 < numberOfInterpolatedValues) {
                                dArr8[i24] = fArr2[i23];
                                i23++;
                                i24++;
                                numberOfInterpolatedValues = numberOfInterpolatedValues;
                                fArr2 = fArr2;
                            }
                        }
                    }
                    i22++;
                }
                i21++;
                i5 = 0;
            }
            i20++;
            this.toString[i20] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.getARTIFICIAL_FRAME_PACKAGE_NAME, java.util.Arrays.copyOf(dArr6, i22), (double[][]) java.util.Arrays.copyOf(dArr7, i22));
            i5 = 0;
        }
        this.toString[0] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.getARTIFICIAL_FRAME_PACKAGE_NAME, dArr2, dArr5);
        if (motionPathsArr[0].getInputFormats != androidx.constraintlayout.motion.widget.Key.UNSET) {
            int[] iArr4 = new int[i6];
            double[] dArr9 = new double[i6];
            double[][] dArr10 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i6, 2);
            for (int i25 = 0; i25 < i6; i25++) {
                iArr4[i25] = motionPathsArr[i25].getInputFormats;
                dArr9[i25] = motionPathsArr[i25].isOutputSupportedForhNQ4ISI;
                dArr10[i25][0] = motionPathsArr[i25].isOutputSupportedFor;
                dArr10[i25][1] = motionPathsArr[i25].toString;
            }
            this.Camera2StreamConfigurationMap = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(iArr4, dArr9, dArr10);
        }
        this.getOutputMinFrameDuration = new java.util.HashMap<>();
        if (this.getOutputStallDurationlomOqCM != null) {
            java.util.Iterator<java.lang.String> it9 = hashSet6.iterator();
            float f3 = Float.NaN;
            while (it9.hasNext()) {
                java.lang.String next8 = it9.next();
                androidx.constraintlayout.motion.utils.ViewOscillator makeSpline3 = androidx.constraintlayout.motion.utils.ViewOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && java.lang.Float.isNaN(f3)) {
                        float[] fArr3 = new float[2];
                        double d2 = 0.0d;
                        double d3 = 0.0d;
                        float f4 = 0.0f;
                        int i26 = 100;
                        int i27 = 0;
                        while (i27 < i26) {
                            float f5 = i27 * 0.01010101f;
                            double d4 = f5;
                            androidx.constraintlayout.core.motion.utils.Easing easing = this.coroutineCreation.getHighSpeedVideoSizesFor;
                            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it10 = this.unwrapAs.iterator();
                            float f6 = 0.0f;
                            float f7 = Float.NaN;
                            while (it10.hasNext()) {
                                androidx.constraintlayout.motion.widget.MotionPaths next9 = it10.next();
                                if (next9.getHighSpeedVideoSizesFor != null) {
                                    if (next9.isOutputSupportedForhNQ4ISI < f5) {
                                        androidx.constraintlayout.core.motion.utils.Easing easing2 = next9.getHighSpeedVideoSizesFor;
                                        f6 = next9.isOutputSupportedForhNQ4ISI;
                                        easing = easing2;
                                    } else if (java.lang.Float.isNaN(f7)) {
                                        f7 = next9.isOutputSupportedForhNQ4ISI;
                                    }
                                }
                            }
                            if (easing != null) {
                                if (java.lang.Float.isNaN(f7)) {
                                    f7 = 1.0f;
                                }
                                d4 = (((float) easing.get((f5 - f6) / r12)) * (f7 - f6)) + f6;
                            }
                            this.toString[0].getPos(d4, this.getOutputSizeshNQ4ISI);
                            int i28 = i26;
                            this.coroutineCreation.Camera2StreamConfigurationMap(d4, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, fArr3, 0);
                            if (i27 > 0) {
                                c = 0;
                                f4 += (float) java.lang.Math.hypot(d3 - fArr3[1], d2 - fArr3[0]);
                            } else {
                                c = 0;
                            }
                            i27++;
                            i26 = i28;
                            d2 = fArr3[c];
                            d3 = fArr3[1];
                        }
                        f3 = f4;
                    }
                    makeSpline3.setType(next8);
                    this.getOutputMinFrameDuration.put(next8, makeSpline3);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it11 = this.getOutputStallDurationlomOqCM.iterator();
            while (it11.hasNext()) {
                androidx.constraintlayout.motion.widget.Key next10 = it11.next();
                if (next10 instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    ((androidx.constraintlayout.motion.widget.KeyCycle) next10).addCycleValues(this.getOutputMinFrameDuration);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.utils.ViewOscillator> it12 = this.getOutputMinFrameDuration.values().iterator();
            while (it12.hasNext()) {
                it12.next().setup(f3);
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" start: x: ");
        sb.append(this.coroutineCreation.isOutputSupportedFor);
        sb.append(" y: ");
        sb.append(this.coroutineCreation.toString);
        sb.append(" end: x: ");
        sb.append(this.getOutputFormats.isOutputSupportedFor);
        sb.append(" y: ");
        sb.append(this.getOutputFormats.toString);
        return sb.toString();
    }

    private void getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        float x = (int) this._BOUNDARY.getX();
        float y = (int) this._BOUNDARY.getY();
        float width = this._BOUNDARY.getWidth();
        float height = this._BOUNDARY.getHeight();
        motionPaths.isOutputSupportedFor = x;
        motionPaths.toString = y;
        motionPaths.unwrapAs = width;
        motionPaths.getOutputFormats = height;
    }

    public void setView(android.view.View view) {
        this._BOUNDARY = view;
        this.getInputFormats = view.getId();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            this.getHighSpeedVideoSizes = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public android.view.View getView() {
        return this._BOUNDARY;
    }

    public void setStartState(androidx.constraintlayout.motion.utils.ViewState viewState, android.view.View view, int i, int i2, int i3) {
        this.coroutineCreation.isOutputSupportedForhNQ4ISI = 0.0f;
        this.coroutineCreation.getOutputMinFrameDurationlomOqCM = 0.0f;
        android.graphics.Rect rect = new android.graphics.Rect();
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
        androidx.constraintlayout.motion.widget.MotionPaths motionPaths = this.coroutineCreation;
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        motionPaths.isOutputSupportedFor = f;
        motionPaths.toString = f2;
        motionPaths.unwrapAs = width;
        motionPaths.getOutputFormats = height;
        androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint = this.ArtificialStackFrames;
        float f3 = viewState.rotation;
        float f4 = rect.left;
        float f5 = rect.top;
        float width2 = rect.width();
        float height2 = rect.height();
        motionConstrainedPoint.ArtificialStackFrames = f4;
        motionConstrainedPoint.accessartificialFrame = f5;
        motionConstrainedPoint.coroutineCreation = width2;
        motionConstrainedPoint.getHighSpeedVideoSizes = height2;
        motionConstrainedPoint.getHighResolutionOutputSizeshNQ4ISI(view);
        motionConstrainedPoint.getInputFormats = Float.NaN;
        motionConstrainedPoint.getOutputMinFrameDuration = Float.NaN;
        if (i == 1) {
            motionConstrainedPoint.getOutputMinFrameDurationlomOqCM = f3 - 90.0f;
        } else if (i == 2) {
            motionConstrainedPoint.getOutputMinFrameDurationlomOqCM = f3 + 90.0f;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(android.graphics.Rect rect, android.graphics.Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left;
            int i5 = rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - (((i4 + i5) + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i6 = rect.left;
            int i7 = rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = ((i6 + i7) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i8 = rect.left + rect.right;
            int i9 = rect.top;
            int i10 = rect.bottom;
            rect2.left = ((rect.height() / 2) + rect.top) - (i8 / 2);
            rect2.top = i3 - ((i8 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i11 = rect.left;
        int i12 = rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = ((i11 + i12) - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    final void getHighSpeedVideoFpsRanges(android.graphics.Rect rect, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i, int i2) {
        android.view.animation.Interpolator loadInterpolator;
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            getHighSpeedVideoFpsRangesFor(rect, this.accessartificialFrame, i3, i, i2);
        }
        this.coroutineCreation.isOutputSupportedForhNQ4ISI = 0.0f;
        this.coroutineCreation.getOutputMinFrameDurationlomOqCM = 0.0f;
        getHighSpeedVideoFpsRanges(this.coroutineCreation);
        androidx.constraintlayout.motion.widget.MotionPaths motionPaths = this.coroutineCreation;
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        motionPaths.isOutputSupportedFor = f;
        motionPaths.toString = f2;
        motionPaths.unwrapAs = width;
        motionPaths.getOutputFormats = height;
        androidx.constraintlayout.widget.ConstraintSet.Constraint parameters = constraintSet.getParameters(this.getInputFormats);
        this.coroutineCreation.getHighSpeedVideoFpsRangesFor(parameters);
        this.isOutputSupportedForhNQ4ISI = parameters.motion.mMotionStagger;
        this.ArtificialStackFrames.getHighResolutionOutputSizeshNQ4ISI(rect, constraintSet, i3, this.getInputFormats);
        this.AMEXKernela = parameters.transform.transformPivotTarget;
        this.AMEXKernel = parameters.motion.mQuantizeMotionSteps;
        this.kernelVersion = parameters.motion.mQuantizeMotionPhase;
        android.content.Context context = this._BOUNDARY.getContext();
        int i4 = parameters.motion.mQuantizeInterpolatorType;
        java.lang.String str = parameters.motion.mQuantizeInterpolatorString;
        int i5 = parameters.motion.mQuantizeInterpolatorID;
        if (i4 == -2) {
            loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, i5);
        } else if (i4 == -1) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str);
            loadInterpolator = new android.view.animation.Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f3) {
                    return (float) androidx.constraintlayout.core.motion.utils.Easing.this.get(f3);
                }
            };
        } else if (i4 == 0) {
            loadInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
        } else if (i4 == 1) {
            loadInterpolator = new android.view.animation.AccelerateInterpolator();
        } else if (i4 == 2) {
            loadInterpolator = new android.view.animation.DecelerateInterpolator();
        } else if (i4 == 4) {
            loadInterpolator = new android.view.animation.BounceInterpolator();
        } else {
            loadInterpolator = i4 != 5 ? null : new android.view.animation.OvershootInterpolator();
        }
        this.init = loadInterpolator;
    }

    final void Camera2StreamConfigurationMap(android.graphics.Rect rect, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            getHighSpeedVideoFpsRangesFor(rect, this.accessartificialFrame, i3, i, i2);
            rect = this.accessartificialFrame;
        }
        this.getOutputFormats.isOutputSupportedForhNQ4ISI = 1.0f;
        this.getOutputFormats.getOutputMinFrameDurationlomOqCM = 1.0f;
        getHighSpeedVideoFpsRanges(this.getOutputFormats);
        androidx.constraintlayout.motion.widget.MotionPaths motionPaths = this.getOutputFormats;
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        motionPaths.isOutputSupportedFor = f;
        motionPaths.toString = f2;
        motionPaths.unwrapAs = width;
        motionPaths.getOutputFormats = height;
        this.getOutputFormats.getHighSpeedVideoFpsRangesFor(constraintSet.getParameters(this.getInputFormats));
        this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI(rect, constraintSet, i3, this.getInputFormats);
    }

    final float getHighResolutionOutputSizeshNQ4ISI(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.CoroutineDebuggingKt;
            if (f3 != 1.0d) {
                float f4 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = java.lang.Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.Easing easing = this.coroutineCreation.getHighSpeedVideoSizesFor;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.unwrapAs.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionPaths next = it.next();
            if (next.getHighSpeedVideoSizesFor != null) {
                if (next.isOutputSupportedForhNQ4ISI < f) {
                    easing = next.getHighSpeedVideoSizesFor;
                    f2 = next.isOutputSupportedForhNQ4ISI;
                } else if (java.lang.Float.isNaN(f5)) {
                    f5 = next.isOutputSupportedForhNQ4ISI;
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

    final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
        androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate pathRotate;
        boolean z;
        float f2;
        int i;
        double d;
        androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate pathRotate2;
        float f3;
        double d2;
        float f4;
        boolean z2;
        float f5;
        androidx.constraintlayout.motion.widget.MotionPaths motionPaths;
        float f6;
        androidx.constraintlayout.motion.widget.MotionController motionController = this;
        android.view.View view2 = view;
        float highResolutionOutputSizeshNQ4ISI = motionController.getHighResolutionOutputSizeshNQ4ISI(f, (float[]) null);
        if (motionController.AMEXKernel != androidx.constraintlayout.motion.widget.Key.UNSET) {
            float f7 = 1.0f / motionController.AMEXKernel;
            float floor = (float) java.lang.Math.floor(highResolutionOutputSizeshNQ4ISI / f7);
            float f8 = (highResolutionOutputSizeshNQ4ISI % f7) / f7;
            if (!java.lang.Float.isNaN(motionController.kernelVersion)) {
                f8 = (f8 + motionController.kernelVersion) % 1.0f;
            }
            android.view.animation.Interpolator interpolator = motionController.init;
            if (interpolator != null) {
                f6 = interpolator.getInterpolation(f8);
            } else {
                f6 = ((double) f8) > 0.5d ? 1.0f : 0.0f;
            }
            highResolutionOutputSizeshNQ4ISI = (f6 * f7) + (floor * f7);
        }
        float f9 = highResolutionOutputSizeshNQ4ISI;
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap = motionController.getHighSpeedVideoFpsRanges;
        if (hashMap != null) {
            java.util.Iterator<androidx.constraintlayout.motion.utils.ViewSpline> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view2, f9);
            }
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> hashMap2 = motionController.d;
        if (hashMap2 != null) {
            pathRotate = null;
            boolean z3 = false;
            for (androidx.constraintlayout.motion.utils.ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) {
                    pathRotate = (androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z3 |= viewTimeCycle.setProperty(view, f9, j, keyCache);
                }
            }
            z = z3;
        } else {
            pathRotate = null;
            z = false;
        }
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = motionController.toString;
        if (curveFitArr != null) {
            double d3 = f9;
            curveFitArr[0].getPos(d3, motionController.getOutputSizeshNQ4ISI);
            motionController.toString[0].getSlope(d3, motionController.getOutputSizes);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = motionController.Camera2StreamConfigurationMap;
            if (curveFit != null) {
                double[] dArr = motionController.getOutputSizeshNQ4ISI;
                if (dArr.length > 0) {
                    curveFit.getPos(d3, dArr);
                    motionController.Camera2StreamConfigurationMap.getSlope(d3, motionController.getOutputSizes);
                }
            }
            if (motionController.isOutputSupportedFor) {
                d = d3;
                pathRotate2 = pathRotate;
                f3 = f9;
            } else {
                androidx.constraintlayout.motion.widget.MotionPaths motionPaths2 = motionController.coroutineCreation;
                int[] iArr = motionController.getOutputMinFrameDurationlomOqCM;
                double[] dArr2 = motionController.getOutputSizeshNQ4ISI;
                double[] dArr3 = motionController.getOutputSizes;
                boolean z4 = motionController.getInputSizeshNQ4ISI;
                float f10 = motionPaths2.isOutputSupportedFor;
                float f11 = motionPaths2.toString;
                float f12 = motionPaths2.unwrapAs;
                float f13 = motionPaths2.getOutputFormats;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (motionPaths2.getValidOutputFormatsForInputhNQ4ISI.length <= iArr[iArr.length - 1]) {
                        int i2 = iArr[iArr.length - 1] + 1;
                        motionPaths2.getValidOutputFormatsForInputhNQ4ISI = new double[i2];
                        motionPaths2.getOutputStallDurationlomOqCM = new double[i2];
                    }
                } else {
                    f4 = f10;
                }
                pathRotate2 = pathRotate;
                java.util.Arrays.fill(motionPaths2.getValidOutputFormatsForInputhNQ4ISI, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    double[] dArr4 = motionPaths2.getValidOutputFormatsForInputhNQ4ISI;
                    int i4 = iArr[i3];
                    dArr4[i4] = dArr2[i3];
                    motionPaths2.getOutputStallDurationlomOqCM[i4] = dArr3[i3];
                }
                float f14 = f12;
                f3 = f9;
                float f15 = 0.0f;
                float f16 = 0.0f;
                float f17 = 0.0f;
                int i5 = 0;
                float f18 = Float.NaN;
                float f19 = f4;
                float f20 = 0.0f;
                while (true) {
                    double[] dArr5 = motionPaths2.getValidOutputFormatsForInputhNQ4ISI;
                    z2 = z4;
                    f5 = f17;
                    if (i5 >= dArr5.length) {
                        break;
                    }
                    if (java.lang.Double.isNaN(dArr5[i5])) {
                        motionPaths = motionPaths2;
                    } else {
                        float f21 = (float) (java.lang.Double.isNaN(motionPaths2.getValidOutputFormatsForInputhNQ4ISI[i5]) ? 0.0d : motionPaths2.getValidOutputFormatsForInputhNQ4ISI[i5] + 0.0d);
                        motionPaths = motionPaths2;
                        float f22 = (float) motionPaths2.getOutputStallDurationlomOqCM[i5];
                        if (i5 == 1) {
                            f15 = f22;
                            f19 = f21;
                        } else if (i5 == 2) {
                            f16 = f22;
                            f11 = f21;
                        } else if (i5 == 3) {
                            f17 = f22;
                            f14 = f21;
                            i5++;
                            motionPaths2 = motionPaths;
                            z4 = z2;
                        } else if (i5 == 4) {
                            f20 = f22;
                            f13 = f21;
                        } else if (i5 == 5) {
                            f18 = f21;
                        }
                    }
                    f17 = f5;
                    i5++;
                    motionPaths2 = motionPaths;
                    z4 = z2;
                }
                androidx.constraintlayout.motion.widget.MotionController motionController2 = motionPaths2.getOutputSizes;
                if (motionController2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motionController2.getCenter(d3, fArr, fArr2);
                    float f23 = fArr[0];
                    float f24 = fArr[1];
                    float f25 = fArr2[0];
                    float f26 = fArr2[1];
                    d = d3;
                    double d4 = f19;
                    double d5 = f11;
                    float f27 = f18;
                    float sin = (float) ((f23 + (java.lang.Math.sin(d5) * d4)) - (f14 / 2.0f));
                    float cos = (float) ((f24 - (java.lang.Math.cos(d5) * d4)) - (f13 / 2.0f));
                    double d6 = f15;
                    double d7 = f16;
                    float sin2 = (float) (f25 + (java.lang.Math.sin(d5) * d6) + (java.lang.Math.cos(d5) * d4 * d7));
                    float cos2 = (float) ((f26 - (d6 * java.lang.Math.cos(d5))) + (java.lang.Math.sin(d5) * d4 * d7));
                    if (dArr3.length >= 2) {
                        dArr3[0] = sin2;
                        dArr3[1] = cos2;
                    }
                    if (java.lang.Float.isNaN(f27)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (f27 + java.lang.Math.toDegrees(java.lang.Math.atan2(cos2, sin2))));
                    }
                    f11 = cos;
                    f19 = sin;
                } else {
                    view2 = view;
                    d = d3;
                    if (!java.lang.Float.isNaN(f18)) {
                        view2.setRotation(f18 + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(f16 + (f20 / 2.0f), f15 + (f5 / 2.0f)))) + 0.0f);
                    }
                }
                if (view2 instanceof androidx.constraintlayout.motion.widget.FloatLayout) {
                    ((androidx.constraintlayout.motion.widget.FloatLayout) view2).layout(f19, f11, f14 + f19, f13 + f11);
                } else {
                    float f28 = f19 + 0.5f;
                    int i6 = (int) f28;
                    float f29 = f11 + 0.5f;
                    int i7 = (int) f29;
                    int i8 = (int) (f28 + f14);
                    int i9 = (int) (f29 + f13);
                    int i10 = i8 - i6;
                    int i11 = i9 - i7;
                    if (i10 != view.getMeasuredWidth() || i11 != view.getMeasuredHeight() || z2) {
                        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i10, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                    view2.layout(i6, i7, i8, i9);
                }
                motionController = this;
                motionController.getInputSizeshNQ4ISI = false;
            }
            if (motionController.AMEXKernela != androidx.constraintlayout.motion.widget.Key.UNSET) {
                if (motionController.exchange == null) {
                    motionController.exchange = ((android.view.View) view.getParent()).findViewById(motionController.AMEXKernela);
                }
                if (motionController.exchange != null) {
                    float top = (r1.getTop() + motionController.exchange.getBottom()) / 2.0f;
                    float left = (motionController.exchange.getLeft() + motionController.exchange.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = view.getLeft();
                        float top2 = view.getTop();
                        view2.setPivotX(left - left2);
                        view2.setPivotY(top - top2);
                    }
                }
            }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap3 = motionController.getHighSpeedVideoFpsRanges;
            if (hashMap3 != null) {
                for (androidx.constraintlayout.motion.utils.ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) {
                        double[] dArr6 = motionController.getOutputSizes;
                        if (dArr6.length > 1) {
                            d2 = d;
                            ((androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) viewSpline).setPathRotate(view, f3, dArr6[0], dArr6[1]);
                            d = d2;
                        }
                    }
                    d2 = d;
                    d = d2;
                }
            }
            double d8 = d;
            if (pathRotate2 != null) {
                double[] dArr7 = motionController.getOutputSizes;
                i = 1;
                z = pathRotate2.setPathRotate(view, keyCache, f3, j, dArr7[0], dArr7[1]) | z;
            } else {
                i = 1;
            }
            int i12 = i;
            while (true) {
                androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr2 = motionController.toString;
                if (i12 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i12].getPos(d8, motionController.release);
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(motionController.coroutineCreation.getHighSpeedVideoSizes.get(motionController.b[i12 - 1]), view2, motionController.release);
                i12++;
            }
            if (motionController.ArtificialStackFrames.coroutineBoundary == 0) {
                if (f3 <= 0.0f) {
                    view2.setVisibility(motionController.ArtificialStackFrames.isOutputSupportedFor);
                } else if (f3 >= 1.0f) {
                    view2.setVisibility(motionController.getHighSpeedVideoSizesFor.isOutputSupportedFor);
                } else if (motionController.getHighSpeedVideoSizesFor.isOutputSupportedFor != motionController.ArtificialStackFrames.isOutputSupportedFor) {
                    view2.setVisibility(0);
                }
            }
            if (motionController.getOutputStallDuration != null) {
                int i13 = 0;
                while (true) {
                    androidx.constraintlayout.motion.widget.KeyTrigger[] keyTriggerArr = motionController.getOutputStallDuration;
                    if (i13 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i13].conditionallyFire(f3, view2);
                    i13++;
                }
            }
            f2 = f3;
        } else {
            f2 = f9;
            i = 1;
            float f30 = motionController.coroutineCreation.isOutputSupportedFor + ((motionController.getOutputFormats.isOutputSupportedFor - motionController.coroutineCreation.isOutputSupportedFor) * f2) + 0.5f;
            int i14 = (int) f30;
            float f31 = motionController.coroutineCreation.toString + ((motionController.getOutputFormats.toString - motionController.coroutineCreation.toString) * f2) + 0.5f;
            int i15 = (int) f31;
            int i16 = (int) (f30 + motionController.coroutineCreation.unwrapAs + ((motionController.getOutputFormats.unwrapAs - motionController.coroutineCreation.unwrapAs) * f2));
            int i17 = (int) (f31 + motionController.coroutineCreation.getOutputFormats + ((motionController.getOutputFormats.getOutputFormats - motionController.coroutineCreation.getOutputFormats) * f2));
            if (motionController.getOutputFormats.unwrapAs != motionController.coroutineCreation.unwrapAs || motionController.getOutputFormats.getOutputFormats != motionController.coroutineCreation.getOutputFormats || motionController.getInputSizeshNQ4ISI) {
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i16 - i14, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i17 - i15, 1073741824));
                motionController.getInputSizeshNQ4ISI = false;
            }
            view2.layout(i14, i15, i16, i17);
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap4 = motionController.getOutputMinFrameDuration;
        if (hashMap4 != null) {
            for (androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) {
                    double[] dArr8 = motionController.getOutputSizes;
                    ((androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f2, dArr8[0], dArr8[i]);
                } else {
                    viewOscillator.setProperty(view2, f2);
                }
            }
        }
        return z;
    }

    final void getHighSpeedVideoSizes(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(f, this.coroutineBoundary);
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.toString;
        int i = 0;
        if (curveFitArr != null) {
            double d = highResolutionOutputSizeshNQ4ISI;
            curveFitArr[0].getSlope(d, this.getOutputSizes);
            this.toString[0].getPos(d, this.getOutputSizeshNQ4ISI);
            float f4 = this.coroutineBoundary[0];
            while (true) {
                dArr = this.getOutputSizes;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.Camera2StreamConfigurationMap;
            if (curveFit != null) {
                double[] dArr2 = this.getOutputSizeshNQ4ISI;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.Camera2StreamConfigurationMap.getSlope(d, this.getOutputSizes);
                    androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRangesFor(f2, f3, fArr, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes, this.getOutputSizeshNQ4ISI);
                    return;
                }
                return;
            }
            androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRangesFor(f2, f3, fArr, this.getOutputMinFrameDurationlomOqCM, dArr, this.getOutputSizeshNQ4ISI);
            return;
        }
        float f5 = this.getOutputFormats.isOutputSupportedFor - this.coroutineCreation.isOutputSupportedFor;
        float f6 = this.getOutputFormats.toString - this.coroutineCreation.toString;
        float f7 = this.getOutputFormats.unwrapAs;
        float f8 = this.coroutineCreation.unwrapAs;
        float f9 = this.getOutputFormats.getOutputFormats;
        float f10 = this.coroutineCreation.getOutputFormats;
        fArr[0] = ((1.0f - f2) * f5) + (((f7 - f8) + f5) * f2);
        fArr[1] = ((1.0f - f3) * f6) + (((f9 - f10) + f6) * f3);
    }

    public int getDrawPath() {
        int i = this.coroutineCreation.Camera2StreamConfigurationMap;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            i = java.lang.Math.max(i, it.next().Camera2StreamConfigurationMap);
        }
        return java.lang.Math.max(i, this.getOutputFormats.Camera2StreamConfigurationMap);
    }

    public void setDrawPath(int i) {
        this.coroutineCreation.Camera2StreamConfigurationMap = i;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = this.getOutputStallDurationlomOqCM.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.Key next = it.next();
            iArr[i] = next.getHighResolutionOutputSizeshNQ4ISI + (next.mType * 1000);
            double d = next.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
            this.toString[0].getPos(d, this.getOutputSizeshNQ4ISI);
            this.coroutineCreation.Camera2StreamConfigurationMap(d, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = this.getOutputStallDurationlomOqCM.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.Key next = it.next();
            if (next.mType == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = next.mType;
                iArr[i3 + 2] = next.getHighResolutionOutputSizeshNQ4ISI;
                double d = next.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
                this.toString[0].getPos(d, this.getOutputSizeshNQ4ISI);
                this.coroutineCreation.Camera2StreamConfigurationMap(d, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, fArr, 0);
                iArr[i3 + 3] = java.lang.Float.floatToIntBits(fArr[0]);
                int i4 = i3 + 4;
                iArr[i4] = java.lang.Float.floatToIntBits(fArr[1]);
                if (next instanceof androidx.constraintlayout.motion.widget.KeyPosition) {
                    androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) next;
                    iArr[i3 + 5] = keyPosition.getOutputStallDurationlomOqCM;
                    iArr[i3 + 6] = java.lang.Float.floatToIntBits(keyPosition.getOutputStallDuration);
                    i4 = i3 + 7;
                    iArr[i4] = java.lang.Float.floatToIntBits(keyPosition.getOutputMinFrameDurationlomOqCM);
                }
                int i5 = i4 + 1;
                iArr[i3] = i5 - i3;
                i2++;
                i3 = i5;
            }
        }
        return i2;
    }
}
