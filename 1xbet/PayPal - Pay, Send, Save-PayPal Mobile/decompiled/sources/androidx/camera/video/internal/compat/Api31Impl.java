package androidx.camera.video.internal.compat;

/* loaded from: classes6.dex */
public final class Api31Impl {
    private Api31Impl() {
    }

    public static int getMinInputChannelCount(android.media.MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getMinInputChannelCount();
    }

    public static android.util.Range<java.lang.Integer>[] getInputChannelCountRanges(android.media.MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getInputChannelCountRanges();
    }

    public static void setContext(android.media.AudioRecord.Builder builder, android.content.Context context) {
        builder.setContext(context);
    }
}
