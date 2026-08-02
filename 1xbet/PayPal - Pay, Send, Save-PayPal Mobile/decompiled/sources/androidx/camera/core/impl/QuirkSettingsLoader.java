package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class QuirkSettingsLoader implements androidx.arch.core.util.Function<android.content.Context, androidx.camera.core.impl.QuirkSettings> {
    public static final java.lang.String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final java.lang.String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final java.lang.String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";

    @Override // androidx.arch.core.util.Function
    public androidx.camera.core.impl.QuirkSettings apply(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.camera.core.impl.QuirkSettingsLoader.MetadataHolderService.class), 640).metaData;
            if (bundle == null) {
                androidx.camera.core.Logger.w("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                return null;
            }
            boolean z = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
            java.lang.String[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context, bundle, KEY_QUIRK_FORCE_ENABLED);
            java.lang.String[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(context, bundle, KEY_QUIRK_FORCE_DISABLED);
            androidx.camera.core.Logger.d("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
            androidx.camera.core.Logger.d("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = ".concat(java.lang.String.valueOf(z)));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("  KEY_QUIRK_FORCE_ENABLED = ");
            sb.append(java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI));
            androidx.camera.core.Logger.d("QuirkSettingsLoader", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("  KEY_QUIRK_FORCE_DISABLED = ");
            sb2.append(java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI2));
            androidx.camera.core.Logger.d("QuirkSettingsLoader", sb2.toString());
            return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z).forceEnableQuirks(getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI)).forceDisableQuirks(getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI2)).build();
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            androidx.camera.core.Logger.d("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }

    private static java.lang.String[] getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.os.Bundle bundle, java.lang.String str) {
        if (!bundle.containsKey(str)) {
            return new java.lang.String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            androidx.camera.core.Logger.w("QuirkSettingsLoader", "Resource ID not found for key: ".concat(java.lang.String.valueOf(str)));
            return new java.lang.String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (android.content.res.Resources.NotFoundException e) {
            androidx.camera.core.Logger.w("QuirkSettingsLoader", "Quirk class names resource not found: ".concat(java.lang.String.valueOf(i)), e);
            return new java.lang.String[0];
        }
    }

    private static java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : strArr) {
            java.lang.Class<? extends androidx.camera.core.impl.Quirk> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                hashSet.add(highResolutionOutputSizeshNQ4ISI);
            }
        }
        return hashSet;
    }

    private static java.lang.Class<? extends androidx.camera.core.impl.Quirk> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            java.lang.Class cls = java.lang.Class.forName(str);
            if (androidx.camera.core.impl.Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" does not implement the Quirk interface.");
            androidx.camera.core.Logger.w("QuirkSettingsLoader", sb.toString());
            return null;
        } catch (java.lang.ClassNotFoundException e) {
            androidx.camera.core.Logger.w("QuirkSettingsLoader", "Class not found: ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }

    public static class MetadataHolderService extends android.app.Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
        }

        @Override // android.app.Service, android.content.ContextWrapper
        public void attachBaseContext(android.content.Context context) {
            super.attachBaseContext(context);
        }
    }
}
