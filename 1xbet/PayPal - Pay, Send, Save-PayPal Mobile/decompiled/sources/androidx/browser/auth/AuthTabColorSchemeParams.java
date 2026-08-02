package androidx.browser.auth;

/* loaded from: classes5.dex */
public final class AuthTabColorSchemeParams {
    final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Integer getHighSpeedVideoFpsRanges;
    final java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* synthetic */ AuthTabColorSchemeParams(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, byte b) {
        this(num, num2, num3);
    }

    AuthTabColorSchemeParams(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.getHighSpeedVideoFpsRangesFor = num;
        this.getHighSpeedVideoFpsRanges = num2;
        this.getHighResolutionOutputSizeshNQ4ISI = num3;
    }

    public final java.lang.Integer getToolbarColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.Integer getNavigationBarColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.Integer getNavigationBarDividerColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final android.os.Bundle getHighSpeedVideoFpsRanges() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
        if (num != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        java.lang.Integer num2 = this.getHighSpeedVideoFpsRanges;
        if (num2 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num2.intValue());
        }
        java.lang.Integer num3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (num3 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num3.intValue());
        }
        return bundle;
    }

    static androidx.browser.auth.AuthTabColorSchemeParams getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle(0);
        }
        return new androidx.browser.auth.AuthTabColorSchemeParams((java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    public static final class Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Integer getHighSpeedVideoSizes;

        public final androidx.browser.auth.AuthTabColorSchemeParams.Builder setToolbarColor(int i) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i | (-16777216));
            return this;
        }

        public final androidx.browser.auth.AuthTabColorSchemeParams.Builder setNavigationBarColor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i | (-16777216));
            return this;
        }

        public final androidx.browser.auth.AuthTabColorSchemeParams.Builder setNavigationBarDividerColor(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        public final androidx.browser.auth.AuthTabColorSchemeParams build() {
            return new androidx.browser.auth.AuthTabColorSchemeParams(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, (byte) 0);
        }
    }
}
