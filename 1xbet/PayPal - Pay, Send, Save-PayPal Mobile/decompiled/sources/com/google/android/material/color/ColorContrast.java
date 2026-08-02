package com.google.android.material.color;

/* loaded from: classes8.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(android.app.Application application, com.google.android.material.color.ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(android.app.Activity activity, com.google.android.material.color.ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        if (!isContrastAvailable() || (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) == 0) {
            return;
        }
        com.google.android.material.color.ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context, com.google.android.material.color.ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        return (!isContrastAvailable() || (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions)) == 0) ? context : new android.view.ContextThemeWrapper(context, contrastThemeOverlayResourceId);
    }

    public static boolean isContrastAvailable() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getContrastThemeOverlayResourceId(android.content.Context context, com.google.android.material.color.ColorContrastOptions colorContrastOptions) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getSystemService("uimode");
        if (!isContrastAvailable() || uiModeManager == null) {
            return 0;
        }
        float contrast = uiModeManager.getContrast();
        int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
        int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
        if (contrast >= 0.6666667f) {
            return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
        }
        if (contrast < MEDIUM_CONTRAST_THRESHOLD) {
            return 0;
        }
        if (mediumContrastThemeOverlay == 0) {
        }
    }

    static class ColorContrastActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final java.util.Set<android.app.Activity> activitiesInStack = new java.util.LinkedHashSet();
        private final com.google.android.material.color.ColorContrastOptions colorContrastOptions;
        private android.app.UiModeManager.ContrastChangeListener contrastChangeListener;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }

        ColorContrastActivityLifecycleCallbacks(com.google.android.material.color.ColorContrastOptions colorContrastOptions) {
            this.colorContrastOptions = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
            android.app.UiModeManager uiModeManager = (android.app.UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new android.app.UiModeManager.ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.1
                    @Override // android.app.UiModeManager.ContrastChangeListener
                    public void onContrastChanged(float f) {
                        java.util.Iterator it = com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.this.activitiesInStack.iterator();
                        while (it.hasNext()) {
                            ((android.app.Activity) it.next()).recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(androidx.core.content.ContextCompat.getMainExecutor(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                com.google.android.material.color.ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            this.activitiesInStack.remove(activity);
            android.app.UiModeManager uiModeManager = (android.app.UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.contrastChangeListener == null || !this.activitiesInStack.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
            this.contrastChangeListener = null;
        }
    }
}
