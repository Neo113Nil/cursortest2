package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class MediaCodecDefaultDataSpaceQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRanges() {
        return true;
    }

    public androidx.camera.video.internal.encoder.VideoEncoderDataSpace getSuggestedDataSpace() {
        return androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_SRGB;
    }
}
