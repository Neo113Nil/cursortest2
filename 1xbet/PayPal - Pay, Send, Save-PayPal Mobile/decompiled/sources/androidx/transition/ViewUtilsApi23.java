package androidx.transition;

/* loaded from: classes3.dex */
class ViewUtilsApi23 extends androidx.transition.ViewUtilsApi22 {
    private static boolean Camera2StreamConfigurationMap = true;

    ViewUtilsApi23() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void Camera2StreamConfigurationMap(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            super.Camera2StreamConfigurationMap(view, i);
        } else if (Camera2StreamConfigurationMap) {
            try {
                androidx.transition.ViewUtilsApi23.Api29Impl.getHighSpeedVideoFpsRanges(view, i);
            } catch (java.lang.NoSuchMethodError unused) {
                Camera2StreamConfigurationMap = false;
            }
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, int i) {
            view.setTransitionVisibility(i);
        }
    }
}
