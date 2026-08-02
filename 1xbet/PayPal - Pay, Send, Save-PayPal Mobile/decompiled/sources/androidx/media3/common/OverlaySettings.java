package androidx.media3.common;

/* loaded from: classes7.dex */
public interface OverlaySettings {
    public static final float DEFAULT_ALPHA_SCALE = 1.0f;
    public static final android.util.Pair<java.lang.Float, java.lang.Float> DEFAULT_BACKGROUND_FRAME_ANCHOR;
    public static final float DEFAULT_HDR_LUMINANCE_MULTIPLIER = 1.0f;
    public static final android.util.Pair<java.lang.Float, java.lang.Float> DEFAULT_OVERLAY_FRAME_ANCHOR;
    public static final float DEFAULT_ROTATION_DEGREES = 0.0f;
    public static final android.util.Pair<java.lang.Float, java.lang.Float> DEFAULT_SCALE;

    default float getAlphaScale() {
        return 1.0f;
    }

    default float getHdrLuminanceMultiplier() {
        return 1.0f;
    }

    default float getRotationDegrees() {
        return 0.0f;
    }

    static {
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        DEFAULT_BACKGROUND_FRAME_ANCHOR = android.util.Pair.create(valueOf, valueOf);
        DEFAULT_OVERLAY_FRAME_ANCHOR = android.util.Pair.create(valueOf, valueOf);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        DEFAULT_SCALE = android.util.Pair.create(valueOf2, valueOf2);
    }

    default android.util.Pair<java.lang.Float, java.lang.Float> getBackgroundFrameAnchor() {
        return DEFAULT_BACKGROUND_FRAME_ANCHOR;
    }

    default android.util.Pair<java.lang.Float, java.lang.Float> getOverlayFrameAnchor() {
        return DEFAULT_OVERLAY_FRAME_ANCHOR;
    }

    default android.util.Pair<java.lang.Float, java.lang.Float> getScale() {
        return DEFAULT_SCALE;
    }
}
