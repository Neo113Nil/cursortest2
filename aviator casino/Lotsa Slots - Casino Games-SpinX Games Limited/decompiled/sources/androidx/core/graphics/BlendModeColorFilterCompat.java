package androidx.core.graphics;

/* loaded from: classes.dex */
public class BlendModeColorFilterCompat {
    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int i, androidx.core.graphics.BlendModeCompat blendModeCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.Object obtainBlendModeFromCompat = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat);
            if (obtainBlendModeFromCompat != null) {
                return androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl.createBlendModeColorFilter(i, obtainBlendModeFromCompat);
            }
            return null;
        }
        android.graphics.PorterDuff.Mode obtainPorterDuffFromCompat = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(blendModeCompat);
        if (obtainPorterDuffFromCompat != null) {
            return new android.graphics.PorterDuffColorFilter(i, obtainPorterDuffFromCompat);
        }
        return null;
    }

    private BlendModeColorFilterCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.ColorFilter createBlendModeColorFilter(int i, java.lang.Object obj) {
            return new android.graphics.BlendModeColorFilter(i, (android.graphics.BlendMode) obj);
        }
    }
}
