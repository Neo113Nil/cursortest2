package androidx.transition;

/* loaded from: classes3.dex */
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static boolean Camera2StreamConfigurationMap = true;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private static boolean getHighSpeedVideoFpsRanges = true;

    ViewUtilsApi21() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoSizes(android.view.View view, android.graphics.Matrix matrix) {
        if (Camera2StreamConfigurationMap) {
            try {
                androidx.transition.ViewUtilsApi21.Api29Impl.Camera2StreamConfigurationMap(view, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                Camera2StreamConfigurationMap = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoFpsRanges(android.view.View view, android.graphics.Matrix matrix) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            try {
                androidx.transition.ViewUtilsApi21.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(view, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
        if (getHighSpeedVideoFpsRanges) {
            try {
                androidx.transition.ViewUtilsApi21.Api29Impl.getHighSpeedVideoFpsRanges(view, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                getHighSpeedVideoFpsRanges = false;
            }
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.graphics.Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, android.graphics.Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }
    }
}
