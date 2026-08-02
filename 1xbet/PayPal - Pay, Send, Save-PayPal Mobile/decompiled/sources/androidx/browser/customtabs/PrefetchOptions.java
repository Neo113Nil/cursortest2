package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public final class PrefetchOptions {
    public final boolean requiresAnonymousIpWhenCrossOrigin;
    public final android.net.Uri sourceOrigin;

    PrefetchOptions(boolean z, android.net.Uri uri) {
        this.requiresAnonymousIpWhenCrossOrigin = z;
        this.sourceOrigin = uri;
    }

    final android.os.Bundle getHighSpeedVideoFpsRangesFor() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN", this.requiresAnonymousIpWhenCrossOrigin);
        android.net.Uri uri = this.sourceOrigin;
        if (uri != null) {
            bundle.putParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN", uri);
        }
        return bundle;
    }

    static androidx.browser.customtabs.PrefetchOptions getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
        android.net.Uri uri;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            uri = (android.net.Uri) androidx.browser.customtabs.Api33Impl.getHighSpeedVideoFpsRanges(bundle, "androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN", android.net.Uri.class);
        } else {
            uri = (android.net.Uri) bundle.getParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN");
        }
        return new androidx.browser.customtabs.PrefetchOptions(bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN"), uri);
    }

    public static final class Builder {
        private boolean Camera2StreamConfigurationMap;
        private android.net.Uri getHighSpeedVideoFpsRanges;

        public final androidx.browser.customtabs.PrefetchOptions.Builder setRequiresAnonymousIpWhenCrossOrigin(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public final androidx.browser.customtabs.PrefetchOptions.Builder setSourceOrigin(android.net.Uri uri) {
            this.getHighSpeedVideoFpsRanges = uri;
            return this;
        }

        public final androidx.browser.customtabs.PrefetchOptions build() {
            return new androidx.browser.customtabs.PrefetchOptions(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
    }
}
