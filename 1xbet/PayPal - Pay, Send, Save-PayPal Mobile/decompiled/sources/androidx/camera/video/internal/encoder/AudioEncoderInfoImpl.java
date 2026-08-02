package androidx.camera.video.internal.encoder;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/video/internal/encoder/AudioEncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/EncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/AudioEncoderInfo;", "Landroid/media/MediaCodecInfo;", "codecInfo", "", "mime", "<init>", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V", "Landroid/media/MediaCodecInfo$AudioCapabilities;", "getHighSpeedVideoFpsRanges", "Landroid/media/MediaCodecInfo$AudioCapabilities;", "Camera2StreamConfigurationMap", "Landroid/util/Range;", "", "getBitrateRange", "()Landroid/util/Range;", "bitrateRange"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioEncoderInfoImpl extends androidx.camera.video.internal.encoder.EncoderInfoImpl implements androidx.camera.video.internal.encoder.AudioEncoderInfo {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.media.MediaCodecInfo.AudioCapabilities Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEncoderInfoImpl(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        super(mediaCodecInfo, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCodecInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = getCodecCapabilities().getAudioCapabilities();
        kotlin.jvm.internal.Intrinsics.checkNotNull(audioCapabilities);
        this.Camera2StreamConfigurationMap = audioCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    public final android.util.Range<java.lang.Integer> getBitrateRange() {
        android.util.Range<java.lang.Integer> bitrateRange = this.Camera2StreamConfigurationMap.getBitrateRange();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitrateRange, "");
        return bitrateRange;
    }
}
