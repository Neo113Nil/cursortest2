package androidx.webkit;

/* loaded from: classes7.dex */
public class ProcessGlobalConfig {
    public static final int UI_THREAD_STARTUP_MODE_ASYNC = 3;

    @java.lang.Deprecated
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_LONG_TASKS = 3;

    @java.lang.Deprecated
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_SHORT_TASKS = 3;

    @java.lang.Deprecated
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_VERY_SHORT_TASKS = 3;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_WITHOUT_MULTI_PROCESS_STARTUP = 4;
    public static final int UI_THREAD_STARTUP_MODE_DEFAULT = -1;
    public static final int UI_THREAD_STARTUP_MODE_SYNC = 0;
    java.lang.String Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges = -1;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Boolean getHighSpeedVideoSizes;
    private static final java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Object>> sProcessGlobalConfig = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();
    private static boolean getInputSizeshNQ4ISI = false;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface UiThreadStartupMode {
    }

    public androidx.webkit.ProcessGlobalConfig setDataDirectorySuffix(android.content.Context context, java.lang.String str) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (str.equals("")) {
            throw new java.lang.IllegalArgumentException("Suffix cannot be an empty string");
        }
        if (str.indexOf(java.io.File.separatorChar) >= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suffix ");
            sb.append(str);
            sb.append(" contains a path separator");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        return this;
    }

    public androidx.webkit.ProcessGlobalConfig setDirectoryBasePaths(android.content.Context context, java.io.File file, java.io.File file2) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (!file.isAbsolute()) {
            throw new java.lang.IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if (!file2.isAbsolute()) {
            throw new java.lang.IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = file.getAbsolutePath();
        this.Camera2StreamConfigurationMap = file2.getAbsolutePath();
        return this;
    }

    public androidx.webkit.ProcessGlobalConfig setPartitionedCookiesEnabled(android.content.Context context, boolean z) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.getHighSpeedVideoSizes = java.lang.Boolean.valueOf(z);
        return this;
    }

    @java.lang.Deprecated
    public androidx.webkit.ProcessGlobalConfig setUiThreadStartupMode(android.content.Context context, int i) {
        androidx.webkit.internal.StartupApiFeature.NoFramework noFramework = androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE;
        if (i == 4 || !noFramework.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    public androidx.webkit.ProcessGlobalConfig setUiThreadStartupModeV2(android.content.Context context, int i) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    public static void apply(androidx.webkit.ProcessGlobalConfig processGlobalConfig) {
        synchronized (getHighSpeedVideoSizesFor) {
            if (getInputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            getInputSizeshNQ4ISI = true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (getHighSpeedVideoFpsRanges()) {
            throw new java.lang.IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
        }
        if (processGlobalConfig.getHighSpeedVideoFpsRangesFor != null) {
            if (androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupportedByFramework()) {
                androidx.webkit.internal.ApiHelperForP.setDataDirectorySuffix(processGlobalConfig.getHighSpeedVideoFpsRangesFor);
            } else {
                hashMap.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.getHighSpeedVideoFpsRangesFor);
            }
        }
        java.lang.String str = processGlobalConfig.getHighResolutionOutputSizeshNQ4ISI;
        if (str != null) {
            hashMap.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        java.lang.String str2 = processGlobalConfig.Camera2StreamConfigurationMap;
        if (str2 != null) {
            hashMap.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        java.lang.Boolean bool = processGlobalConfig.getHighSpeedVideoSizes;
        if (bool != null) {
            hashMap.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.CONFIGURE_PARTITIONED_COOKIES, bool);
        }
        int i = processGlobalConfig.getHighSpeedVideoFpsRanges;
        if (i != -1) {
            hashMap.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE, java.lang.Integer.valueOf(i));
        }
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(sProcessGlobalConfig, null, hashMap)) {
            throw new java.lang.RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
    }

    private static boolean getHighSpeedVideoFpsRanges() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            return declaredField.get(null) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
