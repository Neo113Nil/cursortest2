package androidx.constraintlayout.motion.utils;

/* loaded from: classes7.dex */
public abstract class ViewSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
    public abstract void setProperty(android.view.View view, float f);

    public static androidx.constraintlayout.motion.utils.ViewSpline makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
        return new androidx.constraintlayout.motion.utils.ViewSpline.CustomSet(str, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.constraintlayout.motion.utils.ViewSpline makeSpline(java.lang.String str) {
        char c;
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
            case -797520672:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.WAVE_VARIES_BY)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -760884510:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_X)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -760884509:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_Y)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return new androidx.constraintlayout.motion.utils.ViewSpline.AlphaSet();
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setElevation(get(f));
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setAlpha(get(f));
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setRotation(get(f));
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setRotationX(get(f));
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setRotationY(get(f));
        }
    }

    static class PivotXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setPivotX(get(f));
        }
    }

    static class PivotYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setPivotY(get(f));
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
        }

        public void setPathRotate(android.view.View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setScaleX(get(f));
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setScaleY(get(f));
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> Camera2StreamConfigurationMap;
        float[] getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoSizes;

        public CustomSet(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
            this.getHighSpeedVideoSizes = str.split(",")[1];
            this.Camera2StreamConfigurationMap = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.Camera2StreamConfigurationMap.size();
            int numberOfInterpolatedValues = this.Camera2StreamConfigurationMap.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.getHighSpeedVideoFpsRanges = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.Camera2StreamConfigurationMap.keyAt(i2);
                androidx.constraintlayout.widget.ConstraintAttribute valueAt = this.Camera2StreamConfigurationMap.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.getHighSpeedVideoFpsRanges);
                int i3 = 0;
                while (true) {
                    if (i3 < this.getHighSpeedVideoFpsRanges.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("call of custom attribute setPoint");
        }

        public void setPoint(int i, androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute) {
            this.Camera2StreamConfigurationMap.append(i, constraintAttribute);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            this.mCurveFit.getPos(f, this.getHighSpeedVideoFpsRanges);
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.Camera2StreamConfigurationMap.valueAt(0), view, this.getHighSpeedVideoFpsRanges);
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        boolean Camera2StreamConfigurationMap = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float f) {
            java.lang.reflect.Method method;
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(f));
                return;
            }
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                this.Camera2StreamConfigurationMap = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, java.lang.Float.valueOf(get(f)));
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                }
            }
        }
    }
}
