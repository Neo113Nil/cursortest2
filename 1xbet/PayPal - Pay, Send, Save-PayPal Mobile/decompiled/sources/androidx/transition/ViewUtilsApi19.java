package androidx.transition;

/* loaded from: classes3.dex */
class ViewUtilsApi19 {
    private static boolean Camera2StreamConfigurationMap = false;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private static java.lang.reflect.Field getHighSpeedVideoFpsRanges;
    private static boolean getHighSpeedVideoFpsRangesFor;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;
    private float[] getInputSizeshNQ4ISI;

    public void Camera2StreamConfigurationMap(android.view.View view) {
    }

    public void getHighSpeedVideoSizes(android.view.View view) {
    }

    ViewUtilsApi19() {
    }

    public void getHighSpeedVideoSizes(android.view.View view, float f) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            try {
                androidx.transition.ViewUtilsApi19.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(view, f);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }
        view.setAlpha(f);
    }

    public float getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            try {
                return androidx.transition.ViewUtilsApi19.Api29Impl.getHighSpeedVideoFpsRangesFor(view);
            } catch (java.lang.NoSuchMethodError unused) {
                getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }
        return view.getAlpha();
    }

    public void getHighSpeedVideoSizes(android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            getHighSpeedVideoSizes((android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void getHighSpeedVideoFpsRanges(android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            getHighSpeedVideoFpsRanges((android.view.View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.getInputSizeshNQ4ISI;
        if (fArr == null) {
            fArr = new float[9];
            this.getInputSizeshNQ4ISI = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) java.lang.Math.sqrt(1.0f - (f * f))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.atan2(f, sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    public void getHighSpeedVideoFpsRangesFor(android.view.View view, int i, int i2, int i3, int i4) {
        getHighSpeedVideoSizes();
        java.lang.reflect.Method method = getHighSpeedVideoSizes;
        if (method != null) {
            try {
                method.invoke(view, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    public void Camera2StreamConfigurationMap(android.view.View view, int i) {
        if (!getHighSpeedVideoFpsRangesFor) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                getHighSpeedVideoFpsRanges = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            getHighSpeedVideoFpsRangesFor = true;
        }
        java.lang.reflect.Field field = getHighSpeedVideoFpsRanges;
        if (field != null) {
            try {
                getHighSpeedVideoFpsRanges.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        if (Camera2StreamConfigurationMap) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setFrame", java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            getHighSpeedVideoSizes = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        Camera2StreamConfigurationMap = true;
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, float f) {
            view.setTransitionAlpha(f);
        }

        static float getHighSpeedVideoFpsRangesFor(android.view.View view) {
            return view.getTransitionAlpha();
        }
    }
}
