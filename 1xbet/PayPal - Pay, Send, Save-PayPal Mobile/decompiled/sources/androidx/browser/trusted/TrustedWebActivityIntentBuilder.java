package androidx.browser.trusted;

/* loaded from: classes6.dex */
public class TrustedWebActivityIntentBuilder {
    public static final java.lang.String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final java.lang.String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final java.lang.String EXTRA_DISPLAY_OVERRIDE = "androidx.browser.trusted.extra.DISPLAY_OVERRIDE";
    public static final java.lang.String EXTRA_FILE_HANDLING_DATA = "androidx.browser.trusted.extra.FILE_HANDLING_DATA";
    public static final java.lang.String EXTRA_LAUNCH_HANDLER_CLIENT_MODE = "androidx.browser.trusted.extra.LAUNCH_HANDLER_CLIENT_MODE";
    public static final java.lang.String EXTRA_ORIGINAL_LAUNCH_URL = "androidx.browser.trusted.extra.ORIGINAL_LAUNCH_URL";
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final java.lang.String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final java.lang.String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final java.lang.String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    private java.util.List<androidx.browser.trusted.TrustedWebActivityDisplayMode> getHighSpeedVideoFpsRanges;
    private java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private androidx.browser.trusted.FileHandlingData getHighSpeedVideoSizes;
    private androidx.browser.trusted.sharing.ShareData getHighSpeedVideoSizesFor;
    private androidx.browser.trusted.sharing.ShareTarget getInputFormats;
    private android.net.Uri getInputSizeshNQ4ISI;
    private android.os.Bundle getOutputSizeshNQ4ISI;
    private final android.net.Uri getOutputStallDurationlomOqCM;
    private final androidx.browser.customtabs.CustomTabsIntent.Builder getHighResolutionOutputSizeshNQ4ISI = new androidx.browser.customtabs.CustomTabsIntent.Builder();
    private int getOutputMinFrameDuration = 0;
    private androidx.browser.trusted.TrustedWebActivityDisplayMode Camera2StreamConfigurationMap = new androidx.browser.trusted.TrustedWebActivityDisplayMode.DefaultMode();
    private int getOutputFormats = 0;

    public TrustedWebActivityIntentBuilder(android.net.Uri uri) {
        this.getOutputStallDurationlomOqCM = uri;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setToolbarColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setToolbarColor(i);
        return this;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setNavigationBarColor(i);
        return this;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarDividerColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setNavigationBarDividerColor(i);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorScheme(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setColorScheme(i);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorSchemeParams(int i, androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.getHighResolutionOutputSizeshNQ4ISI.setColorSchemeParams(i, customTabColorSchemeParams);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.getHighResolutionOutputSizeshNQ4ISI.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(java.util.List<java.lang.String> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setSplashScreenParams(android.os.Bundle bundle) {
        this.getOutputSizeshNQ4ISI = bundle;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setShareParams(androidx.browser.trusted.sharing.ShareTarget shareTarget, androidx.browser.trusted.sharing.ShareData shareData) {
        this.getInputFormats = shareTarget;
        this.getHighSpeedVideoSizesFor = shareData;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setFileHandlingData(androidx.browser.trusted.FileHandlingData fileHandlingData) {
        this.getHighSpeedVideoSizes = fileHandlingData;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDisplayMode(androidx.browser.trusted.TrustedWebActivityDisplayMode trustedWebActivityDisplayMode) {
        this.Camera2StreamConfigurationMap = trustedWebActivityDisplayMode;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDisplayOverrideList(java.util.List<androidx.browser.trusted.TrustedWebActivityDisplayMode> list) {
        if (list == null) {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            return this;
        }
        this.getHighSpeedVideoFpsRanges = list;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setScreenOrientation(int i) {
        this.getOutputFormats = i;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setOriginalLaunchUrl(android.net.Uri uri) {
        this.getInputSizeshNQ4ISI = uri;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setLaunchHandlerClientMode(int i) {
        this.getOutputMinFrameDuration = i;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntent build(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        if (customTabsSession == null) {
            throw new java.lang.NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setSession(customTabsSession);
        android.content.Intent intent = this.getHighResolutionOutputSizeshNQ4ISI.build().intent;
        intent.setData(this.getOutputStallDurationlomOqCM);
        intent.putExtra(androidx.browser.customtabs.TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            intent.putExtra(EXTRA_ADDITIONAL_TRUSTED_ORIGINS, new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor));
        }
        android.os.Bundle bundle = this.getOutputSizeshNQ4ISI;
        if (bundle != null) {
            intent.putExtra(EXTRA_SPLASH_SCREEN_PARAMS, bundle);
        }
        java.util.List<android.net.Uri> emptyList = java.util.Collections.emptyList();
        androidx.browser.trusted.sharing.ShareTarget shareTarget = this.getInputFormats;
        if (shareTarget != null && this.getHighSpeedVideoSizesFor != null) {
            intent.putExtra(EXTRA_SHARE_TARGET, shareTarget.toBundle());
            intent.putExtra(EXTRA_SHARE_DATA, this.getHighSpeedVideoSizesFor.toBundle());
            if (this.getHighSpeedVideoSizesFor.uris != null) {
                emptyList = this.getHighSpeedVideoSizesFor.uris;
            }
        }
        java.util.List<android.net.Uri> emptyList2 = java.util.Collections.emptyList();
        androidx.browser.trusted.FileHandlingData fileHandlingData = this.getHighSpeedVideoSizes;
        if (fileHandlingData != null) {
            intent.putExtra(EXTRA_FILE_HANDLING_DATA, fileHandlingData.toBundle());
            if (this.getHighSpeedVideoSizes.uris != null) {
                emptyList2 = this.getHighSpeedVideoSizes.uris;
            }
        }
        intent.putExtra(EXTRA_DISPLAY_MODE, this.Camera2StreamConfigurationMap.toBundle());
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.browser.trusted.TrustedWebActivityDisplayMode> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            intent.putExtra(EXTRA_DISPLAY_OVERRIDE, arrayList);
        }
        intent.putExtra(EXTRA_SCREEN_ORIENTATION, this.getOutputFormats);
        android.net.Uri uri = this.getInputSizeshNQ4ISI;
        if (uri != null) {
            intent.putExtra(EXTRA_ORIGINAL_LAUNCH_URL, uri);
        }
        intent.putExtra(EXTRA_LAUNCH_HANDLER_CLIENT_MODE, this.getOutputMinFrameDuration);
        return new androidx.browser.trusted.TrustedWebActivityIntent(intent, emptyList, emptyList2);
    }

    public androidx.browser.customtabs.CustomTabsIntent buildCustomTabsIntent() {
        return this.getHighResolutionOutputSizeshNQ4ISI.build();
    }

    public android.net.Uri getUri() {
        return this.getOutputStallDurationlomOqCM;
    }

    public androidx.browser.trusted.TrustedWebActivityDisplayMode getDisplayMode() {
        return this.Camera2StreamConfigurationMap;
    }
}
