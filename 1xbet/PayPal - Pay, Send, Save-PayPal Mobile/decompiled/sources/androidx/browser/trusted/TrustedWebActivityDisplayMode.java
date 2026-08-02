package androidx.browser.trusted;

/* loaded from: classes6.dex */
public interface TrustedWebActivityDisplayMode {
    public static final java.lang.String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    android.os.Bundle toBundle();

    static androidx.browser.trusted.TrustedWebActivityDisplayMode fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(KEY_ID);
        if (i == 1) {
            return androidx.browser.trusted.TrustedWebActivityDisplayMode.ImmersiveMode.getHighSpeedVideoFpsRangesFor(bundle);
        }
        if (i == 2) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.BrowserMode();
        }
        if (i == 3) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.MinimalUiMode();
        }
        if (i == 4) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.TabbedMode();
        }
        if (i == 5) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.WindowControlsOverlayMode();
        }
        return new androidx.browser.trusted.TrustedWebActivityDisplayMode.DefaultMode();
    }

    public static class DefaultMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 0);
            return bundle;
        }
    }

    public static class ImmersiveMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        public static final java.lang.String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final java.lang.String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
        private final boolean Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        public ImmersiveMode(boolean z, int i) {
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoSizes = i;
        }

        static androidx.browser.trusted.TrustedWebActivityDisplayMode getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.ImmersiveMode(bundle.getBoolean(KEY_STICKY), bundle.getInt(KEY_CUTOUT_MODE));
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 1);
            bundle.putBoolean(KEY_STICKY, this.Camera2StreamConfigurationMap);
            bundle.putInt(KEY_CUTOUT_MODE, this.getHighSpeedVideoSizes);
            return bundle;
        }

        public boolean isSticky() {
            return this.Camera2StreamConfigurationMap;
        }

        public int layoutInDisplayCutoutMode() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public static class BrowserMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 2);
            return bundle;
        }
    }

    public static class MinimalUiMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 3);
            return bundle;
        }
    }

    public static final class TabbedMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 4);
            return bundle;
        }
    }

    public static final class WindowControlsOverlayMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 5);
            return bundle;
        }
    }
}
