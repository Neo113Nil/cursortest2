package androidx.camera.video.internal.compat;

/* loaded from: classes6.dex */
public final class Api28Impl {
    private Api28Impl() {
    }

    public static android.util.Range<java.lang.Integer> getQualityRange(android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
