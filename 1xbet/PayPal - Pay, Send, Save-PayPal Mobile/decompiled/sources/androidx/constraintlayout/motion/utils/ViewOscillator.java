package androidx.constraintlayout.motion.utils;

/* loaded from: classes7.dex */
public abstract class ViewOscillator extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
    public abstract void setProperty(android.view.View view, float f);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.constraintlayout.motion.utils.ViewOscillator makeSpline(java.lang.String str) {
        char c;
        if (str.startsWith("CUSTOM")) {
            return new androidx.constraintlayout.motion.utils.ViewOscillator.CustomSet();
        }
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
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\r';
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
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationXset();
            case 1:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationYset();
            case 2:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationXset();
            case 3:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationYset();
            case 4:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationZset();
            case 5:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ProgressSet();
            case 6:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ScaleXset();
            case 7:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ScaleYset();
            case '\b':
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            case '\t':
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationSet();
            case '\n':
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ElevationSet();
            case 11:
                return new androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet();
            case '\f':
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            case '\r':
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            default:
                return null;
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setElevation(get(f));
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setAlpha(get(f));
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setRotation(get(f));
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setRotationX(get(f));
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setRotationY(get(f));
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
        }

        public void setPathRotate(android.view.View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setScaleX(get(f));
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setScaleY(get(f));
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    static class CustomSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        float[] Camera2StreamConfigurationMap = new float[1];
        protected androidx.constraintlayout.widget.ConstraintAttribute getHighResolutionOutputSizeshNQ4ISI;

        CustomSet() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setCustom(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.constraintlayout.widget.ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            this.Camera2StreamConfigurationMap[0] = get(f);
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.getHighResolutionOutputSizeshNQ4ISI, view, this.Camera2StreamConfigurationMap);
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        boolean getHighSpeedVideoSizes = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float f) {
            java.lang.reflect.Method method;
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(f));
                return;
            }
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                this.getHighSpeedVideoSizes = true;
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
