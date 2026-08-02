package androidx.core.graphics;

/* loaded from: classes7.dex */
public class BlendModeColorFilterCompat {
    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int i, androidx.core.graphics.BlendModeCompat blendModeCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = androidx.core.graphics.BlendModeUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(blendModeCompat);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                return androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl.getHighSpeedVideoSizes(i, highResolutionOutputSizeshNQ4ISI);
            }
            return null;
        }
        android.graphics.PorterDuff.Mode Camera2StreamConfigurationMap = androidx.core.graphics.BlendModeUtils.Camera2StreamConfigurationMap(blendModeCompat);
        if (Camera2StreamConfigurationMap != null) {
            return new android.graphics.PorterDuffColorFilter(i, Camera2StreamConfigurationMap);
        }
        return null;
    }

    private BlendModeColorFilterCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.ColorFilter getHighSpeedVideoSizes(int i, java.lang.Object obj) {
            return new android.graphics.BlendModeColorFilter(i, (android.graphics.BlendMode) obj);
        }
    }
}
