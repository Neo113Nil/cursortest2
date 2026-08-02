package androidx.transition;

/* loaded from: classes7.dex */
class GhostViewPlatform implements androidx.transition.GhostView {
    private static boolean Camera2StreamConfigurationMap;
    private static boolean getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static java.lang.Class<?> getHighSpeedVideoFpsRangesFor;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;
    private static boolean getInputFormats;
    private final android.view.View getOutputFormats;

    @Override // androidx.transition.GhostView
    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.ViewGroup viewGroup, android.view.View view) {
    }

    private GhostViewPlatform(android.view.View view) {
        this.getOutputFormats = view;
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int i) {
        this.getOutputFormats.setVisibility(i);
    }

    static androidx.transition.GhostView getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        if (!Camera2StreamConfigurationMap) {
            try {
                if (!getHighResolutionOutputSizeshNQ4ISI) {
                    try {
                        getHighSpeedVideoFpsRangesFor = java.lang.Class.forName("android.view.GhostView");
                    } catch (java.lang.ClassNotFoundException unused) {
                    }
                    getHighResolutionOutputSizeshNQ4ISI = true;
                }
                java.lang.reflect.Method declaredMethod = getHighSpeedVideoFpsRangesFor.getDeclaredMethod("addGhost", android.view.View.class, android.view.ViewGroup.class, android.graphics.Matrix.class);
                getHighSpeedVideoFpsRanges = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            Camera2StreamConfigurationMap = true;
        }
        java.lang.reflect.Method method = getHighSpeedVideoFpsRanges;
        if (method != null) {
            try {
                return new androidx.transition.GhostViewPlatform((android.view.View) method.invoke(null, view, viewGroup, matrix));
            } catch (java.lang.IllegalAccessException unused3) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        return null;
    }

    static void getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (!getInputFormats) {
            try {
                if (!getHighResolutionOutputSizeshNQ4ISI) {
                    try {
                        getHighSpeedVideoFpsRangesFor = java.lang.Class.forName("android.view.GhostView");
                    } catch (java.lang.ClassNotFoundException unused) {
                    }
                    getHighResolutionOutputSizeshNQ4ISI = true;
                }
                java.lang.reflect.Method declaredMethod = getHighSpeedVideoFpsRangesFor.getDeclaredMethod("removeGhost", android.view.View.class);
                getHighSpeedVideoSizes = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            getInputFormats = true;
        }
        java.lang.reflect.Method method = getHighSpeedVideoSizes;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (java.lang.IllegalAccessException unused3) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }
}
