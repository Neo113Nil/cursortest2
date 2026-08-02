package androidx.browser.customtabs;

/* loaded from: classes5.dex */
public final class CustomTabColorSchemeParams {
    public final java.lang.Integer navigationBarColor;
    public final java.lang.Integer navigationBarDividerColor;
    public final java.lang.Integer secondaryToolbarColor;
    public final java.lang.Integer toolbarColor;

    CustomTabColorSchemeParams(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.navigationBarColor = num3;
        this.navigationBarDividerColor = num4;
    }

    final android.os.Bundle Camera2StreamConfigurationMap() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Integer num = this.toolbarColor;
        if (num != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        java.lang.Integer num2 = this.secondaryToolbarColor;
        if (num2 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        java.lang.Integer num3 = this.navigationBarColor;
        if (num3 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        java.lang.Integer num4 = this.navigationBarDividerColor;
        if (num4 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }

    static androidx.browser.customtabs.CustomTabColorSchemeParams getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle(0);
        }
        return new androidx.browser.customtabs.CustomTabColorSchemeParams((java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    /* loaded from: classes6.dex */
    public static final class Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Integer getHighSpeedVideoFpsRangesFor;
        private java.lang.Integer getHighSpeedVideoSizes;

        public final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setToolbarColor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i | (-16777216));
            return this;
        }

        public final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setSecondaryToolbarColor(int i) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarColor(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i | (-16777216));
            return this;
        }

        public final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarDividerColor(int i) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabColorSchemeParams build() {
            return new androidx.browser.customtabs.CustomTabColorSchemeParams(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
