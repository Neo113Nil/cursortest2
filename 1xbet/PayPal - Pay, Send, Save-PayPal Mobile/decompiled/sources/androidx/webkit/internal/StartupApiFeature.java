package androidx.webkit.internal;

/* loaded from: classes7.dex */
public abstract class StartupApiFeature {
    public static final java.lang.String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    private static final java.util.Set<androidx.webkit.internal.StartupApiFeature> getHighSpeedVideoSizes = new java.util.HashSet();
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public abstract boolean isSupportedByFramework();

    StartupApiFeature(java.lang.String str, java.lang.String str2) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        getHighSpeedVideoSizes.add(this);
    }

    public java.lang.String getPublicFeatureName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isSupported(android.content.Context context) {
        return isSupportedByFramework() || isSupportedByWebView(context);
    }

    public boolean isSupportedByWebView(android.content.Context context) {
        android.os.Bundle Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context);
        if (Camera2StreamConfigurationMap == null) {
            return false;
        }
        return Camera2StreamConfigurationMap.containsKey(this.Camera2StreamConfigurationMap);
    }

    public static java.util.Set<androidx.webkit.internal.StartupApiFeature> values() {
        return java.util.Collections.unmodifiableSet(getHighSpeedVideoSizes);
    }

    private static android.os.Bundle Camera2StreamConfigurationMap(android.content.Context context) {
        android.content.pm.PackageInfo currentWebViewPackage = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(currentWebViewPackage.packageName, METADATA_HOLDER_SERVICE_NAME);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            try {
                return androidx.webkit.internal.ApiHelperForTiramisu.dE_(context.getPackageManager(), componentName, androidx.webkit.internal.ApiHelperForTiramisu.dF_(640L)).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return getHighSpeedVideoFpsRangesFor(context, componentName, 640).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static android.content.pm.ServiceInfo getHighSpeedVideoFpsRangesFor(android.content.Context context, android.content.ComponentName componentName, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i);
    }

    public static class P extends androidx.webkit.internal.StartupApiFeature {
        P(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class NoFramework extends androidx.webkit.internal.StartupApiFeature {
        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        NoFramework(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }
}
