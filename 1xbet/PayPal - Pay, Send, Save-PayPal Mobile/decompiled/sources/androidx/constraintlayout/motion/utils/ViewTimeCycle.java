package androidx.constraintlayout.motion.utils;

/* loaded from: classes7.dex */
public abstract class ViewTimeCycle extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
    public abstract boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache);

    public float get(float f, long j, android.view.View view, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
        this.mCurveFit.getPos(f, this.mCache);
        float f2 = this.mCache[1];
        if (f2 == 0.0f) {
            this.mContinue = false;
            return this.mCache[2];
        }
        if (java.lang.Float.isNaN(this.mLastCycle)) {
            this.mLastCycle = keyCache.getFloatValue(view, this.mType, 0);
            if (java.lang.Float.isNaN(this.mLastCycle)) {
                this.mLastCycle = 0.0f;
            }
        }
        this.mLastCycle = (float) ((this.mLastCycle + (((j - this.mLastTime) * 1.0E-9d) * f2)) % 1.0d);
        keyCache.setFloatValue(view, this.mType, 0, this.mLastCycle);
        this.mLastTime = j;
        float f3 = this.mCache[0];
        float calcWave = calcWave(this.mLastCycle);
        float f4 = this.mCache[2];
        this.mContinue = (f3 == 0.0f && f2 == 0.0f) ? false : true;
        return (calcWave * f3) + f4;
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
        return new androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet(str, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline(java.lang.String str, long j) {
        char c;
        androidx.constraintlayout.motion.utils.ViewTimeCycle rotationXset;
        str.hashCode();
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationXset();
                break;
            case 1:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationYset();
                break;
            case 2:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationXset();
                break;
            case 3:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationYset();
                break;
            case 4:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationZset();
                break;
            case 5:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ProgressSet();
                break;
            case 6:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ScaleXset();
                break;
            case 7:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ScaleYset();
                break;
            case '\b':
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationSet();
                break;
            case '\t':
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ElevationSet();
                break;
            case '\n':
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate();
                break;
            case 11:
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j);
        return rotationXset;
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setElevation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setAlpha(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setRotation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setRotationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setRotationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            return this.mContinue;
        }

        public boolean setPathRotate(android.view.View view, androidx.constraintlayout.core.motion.utils.KeyCache keyCache, float f, long j, double d, double d2) {
            view.setRotation(get(f, j, view, keyCache) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
            return this.mContinue;
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setScaleX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setScaleY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setTranslationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setTranslationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            view.setTranslationZ(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        float[] Camera2StreamConfigurationMap;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        android.util.SparseArray<float[]> getHighSpeedVideoFpsRangesFor = new android.util.SparseArray<>();

        public CustomSet(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
            this.getHighSpeedVideoFpsRanges = str.split(",")[1];
            this.getHighResolutionOutputSizeshNQ4ISI = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
            int numberOfInterpolatedValues = this.getHighResolutionOutputSizeshNQ4ISI.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = numberOfInterpolatedValues + 2;
            this.Camera2StreamConfigurationMap = new float[i2];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.getHighResolutionOutputSizeshNQ4ISI.keyAt(i3);
                androidx.constraintlayout.widget.ConstraintAttribute valueAt = this.getHighResolutionOutputSizeshNQ4ISI.valueAt(i3);
                float[] valueAt2 = this.getHighSpeedVideoFpsRangesFor.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.Camera2StreamConfigurationMap);
                int i4 = 0;
                while (true) {
                    if (i4 < this.Camera2StreamConfigurationMap.length) {
                        dArr2[i3][i4] = r7[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("Wrong call for custom attribute");
        }

        public void setPoint(int i, androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.getHighResolutionOutputSizeshNQ4ISI.append(i, constraintAttribute);
            this.getHighSpeedVideoFpsRangesFor.append(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.Camera2StreamConfigurationMap);
            float[] fArr = this.Camera2StreamConfigurationMap;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = this.mLastTime;
            if (java.lang.Float.isNaN(this.mLastCycle)) {
                this.mLastCycle = keyCache.getFloatValue(view, this.getHighSpeedVideoFpsRanges, 0);
                if (java.lang.Float.isNaN(this.mLastCycle)) {
                    this.mLastCycle = 0.0f;
                }
            }
            this.mLastCycle = (float) ((this.mLastCycle + (((j - j2) * 1.0E-9d) * f2)) % 1.0d);
            this.mLastTime = j;
            float calcWave = calcWave(this.mLastCycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.Camera2StreamConfigurationMap[i]) != 0.0d;
                this.mCache[i] = (this.Camera2StreamConfigurationMap[i] * calcWave) + f3;
            }
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.getHighResolutionOutputSizeshNQ4ISI.valueAt(0), view, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        boolean getHighSpeedVideoFpsRangesFor = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            java.lang.reflect.Method method;
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(f, j, view, keyCache));
            } else {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
                } catch (java.lang.NoSuchMethodException unused) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, java.lang.Float.valueOf(get(f, j, view, keyCache)));
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                    }
                }
            }
            return this.mContinue;
        }
    }
}
