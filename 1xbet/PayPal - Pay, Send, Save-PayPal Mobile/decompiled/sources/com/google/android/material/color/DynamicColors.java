package com.google.android.material.color;

/* loaded from: classes8.dex */
public class DynamicColors {
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {com.google.android.material.R.attr.dynamicColorThemeOverlay};
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final java.lang.String TAG;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    interface DeviceSupportCondition {
        boolean isSupported();
    }

    public interface OnAppliedCallback {
        void onApplied(android.app.Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(android.app.Activity activity, int i);
    }

    static {
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition = new com.google.android.material.color.DynamicColors.DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                return true;
            }
        };
        DEFAULT_DEVICE_SUPPORT_CONDITION = deviceSupportCondition;
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition2 = new com.google.android.material.color.DynamicColors.DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2
            private java.lang.Long version;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                if (this.version == null) {
                    try {
                        java.lang.reflect.Method declaredMethod = android.os.Build.class.getDeclaredMethod("getLong", java.lang.String.class);
                        declaredMethod.setAccessible(true);
                        this.version = java.lang.Long.valueOf(((java.lang.Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                    } catch (java.lang.Exception unused) {
                        this.version = -1L;
                    }
                }
                return this.version.longValue() >= 40100;
            }
        };
        SAMSUNG_DEVICE_SUPPORT_CONDITION = deviceSupportCondition2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fcnt", deviceSupportCondition);
        hashMap.put(com.adjust.sdk.Constants.REFERRER_API_GOOGLE, deviceSupportCondition);
        hashMap.put("hmd global", deviceSupportCondition);
        hashMap.put("infinix", deviceSupportCondition);
        hashMap.put("infinix mobility limited", deviceSupportCondition);
        hashMap.put("itel", deviceSupportCondition);
        hashMap.put("kyocera", deviceSupportCondition);
        hashMap.put("lenovo", deviceSupportCondition);
        hashMap.put("lge", deviceSupportCondition);
        hashMap.put("meizu", deviceSupportCondition);
        hashMap.put("motorola", deviceSupportCondition);
        hashMap.put(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.EmptyTaxId, deviceSupportCondition);
        hashMap.put("oneplus", deviceSupportCondition);
        hashMap.put("oppo", deviceSupportCondition);
        hashMap.put("realme", deviceSupportCondition);
        hashMap.put("robolectric", deviceSupportCondition);
        hashMap.put(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, deviceSupportCondition2);
        hashMap.put("sharp", deviceSupportCondition);
        hashMap.put("shift", deviceSupportCondition);
        hashMap.put("sony", deviceSupportCondition);
        hashMap.put("tcl", deviceSupportCondition);
        hashMap.put("tecno", deviceSupportCondition);
        hashMap.put("tecno mobile limited", deviceSupportCondition);
        hashMap.put(com.adjust.sdk.Constants.REFERRER_API_VIVO, deviceSupportCondition);
        hashMap.put("wingtech", deviceSupportCondition);
        hashMap.put(com.adjust.sdk.Constants.REFERRER_API_XIAOMI, deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("asus", deviceSupportCondition);
        hashMap2.put("jio", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = java.util.Collections.unmodifiableMap(hashMap2);
        TAG = "DynamicColors";
    }

    private DynamicColors() {
    }

    public static void applyToActivitiesIfAvailable(android.app.Application application) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, int i) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, int i, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(android.app.Application application, com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new com.google.android.material.color.DynamicColors.DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity, int i) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    public static void applyToActivityIfAvailable(android.app.Activity activity) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(android.app.Activity activity, com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
        int i;
        if (isDynamicColorAvailable()) {
            if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                i = 0;
            } else if (dynamicColorsOptions.getThemeOverlay() == 0) {
                i = getDefaultThemeOverlay(activity, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
            } else {
                i = dynamicColorsOptions.getThemeOverlay();
            }
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, i)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    com.google.android.material.color.utilities.SchemeContent schemeContent = new com.google.android.material.color.utilities.SchemeContent(com.google.android.material.color.utilities.Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !com.google.android.material.color.MaterialColors.isLightTheme(activity), getSystemContrast(activity));
                    com.google.android.material.color.ColorResourcesOverride colorResourcesOverride = com.google.android.material.color.ColorResourcesOverride.getInstance();
                    if (colorResourcesOverride == null || !colorResourcesOverride.applyIfPossible(activity, com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    com.google.android.material.color.ThemeUtils.applyThemeOverlay(activity, i);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context, int i) {
        return wrapContextIfAvailable(context, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context, com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int themeOverlay = dynamicColorsOptions.getThemeOverlay();
            if (themeOverlay == 0) {
                themeOverlay = getDefaultThemeOverlay(context, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
            }
            if (themeOverlay != 0) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    com.google.android.material.color.utilities.SchemeContent schemeContent = new com.google.android.material.color.utilities.SchemeContent(com.google.android.material.color.utilities.Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !com.google.android.material.color.MaterialColors.isLightTheme(context), getSystemContrast(context));
                    com.google.android.material.color.ColorResourcesOverride colorResourcesOverride = com.google.android.material.color.ColorResourcesOverride.getInstance();
                    if (colorResourcesOverride != null) {
                        return colorResourcesOverride.wrapContextIfPossible(context, com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
                    }
                }
                return new android.view.ContextThemeWrapper(context, themeOverlay);
            }
        }
        return context;
    }

    public static boolean isDynamicColorAvailable() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return true;
        }
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS.get(android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ROOT));
        if (deviceSupportCondition == null) {
            deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_BRANDS.get(android.os.Build.BRAND.toLowerCase(java.util.Locale.ROOT));
        }
        return deviceSupportCondition != null && deviceSupportCondition.isSupported();
    }

    private static int getDefaultThemeOverlay(android.content.Context context, int[] iArr) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    static class DynamicColorsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
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

        DynamicColorsActivityLifecycleCallbacks(com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
            this.dynamicColorsOptions = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.material.color.DynamicColors.applyToActivityIfAvailable(activity, this.dynamicColorsOptions);
        }
    }

    private static float getSystemContrast(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || android.os.Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }
}
