package androidx.core.graphics;

/* loaded from: classes7.dex */
public final class PaintCompat {
    public static boolean hasGlyph(android.graphics.Paint paint, java.lang.String str) {
        return paint.hasGlyph(str);
    }

    public static boolean setBlendMode(android.graphics.Paint paint, androidx.core.graphics.BlendModeCompat blendModeCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.graphics.PaintCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(paint, blendModeCompat != null ? androidx.core.graphics.BlendModeUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat != null) {
            android.graphics.PorterDuff.Mode Camera2StreamConfigurationMap = androidx.core.graphics.BlendModeUtils.Camera2StreamConfigurationMap(blendModeCompat);
            paint.setXfermode(Camera2StreamConfigurationMap != null ? new android.graphics.PorterDuffXfermode(Camera2StreamConfigurationMap) : null);
            return Camera2StreamConfigurationMap != null;
        }
        paint.setXfermode(null);
        return true;
    }

    private PaintCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Paint paint, java.lang.Object obj) {
            paint.setBlendMode((android.graphics.BlendMode) obj);
        }
    }
}
