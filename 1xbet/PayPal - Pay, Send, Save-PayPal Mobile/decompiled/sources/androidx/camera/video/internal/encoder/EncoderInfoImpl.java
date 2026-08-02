package androidx.camera.video.internal.encoder;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\r8\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/video/internal/encoder/EncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/EncoderInfo;", "Landroid/media/MediaCodecInfo;", "mediaCodecInfo", "", "mime", "<init>", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroid/media/MediaCodecInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "codecCapabilities", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "getCodecCapabilities", "()Landroid/media/MediaCodecInfo$CodecCapabilities;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EncoderInfoImpl implements androidx.camera.video.internal.encoder.EncoderInfo {
    private final android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.media.MediaCodecInfo getHighResolutionOutputSizeshNQ4ISI;

    public EncoderInfoImpl(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCodecInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mediaCodecInfo;
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(capabilitiesForType, "");
            this.codecCapabilities = capabilitiesForType;
        } catch (java.lang.RuntimeException e) {
            throw new androidx.camera.video.internal.encoder.InvalidConfigException("Unable to get CodecCapabilities for mime: ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    protected final android.media.MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        return this.codecCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public java.lang.String getName() {
        java.lang.String name2 = this.getHighResolutionOutputSizeshNQ4ISI.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }
}
