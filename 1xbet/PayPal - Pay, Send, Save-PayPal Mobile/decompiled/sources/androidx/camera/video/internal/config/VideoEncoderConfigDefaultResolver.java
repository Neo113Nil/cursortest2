package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 "}, d2 = {"Landroidx/camera/video/internal/config/VideoEncoderConfigDefaultResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Landroidx/camera/core/impl/Timebase;", "inputTimebase", "Landroidx/camera/video/VideoSpec;", "videoSpec", "Landroid/util/Size;", "surfaceSize", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroid/util/Range;", "", "expectedFrameRateRange", "<init>", "(Ljava/lang/String;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/VideoSpec;Landroid/util/Size;Landroidx/camera/core/DynamicRange;Landroid/util/Range;)V", "get", "()Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/Timebase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Landroidx/camera/video/VideoSpec;", "getHighSpeedVideoSizesFor", "Landroid/util/Size;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/DynamicRange;", "Landroid/util/Range;", "getInputFormats", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoEncoderConfigDefaultResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.VideoEncoderConfig> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.DynamicRange getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Timebase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.util.Range<java.lang.Integer> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final android.util.Size Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.video.VideoSpec getHighSpeedVideoFpsRanges;
    private static final android.util.Size Camera2StreamConfigurationMap = new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);

    public VideoEncoderConfigDefaultResolver(java.lang.String str, androidx.camera.core.impl.Timebase timebase, androidx.camera.video.VideoSpec videoSpec, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = timebase;
        this.getHighSpeedVideoFpsRanges = videoSpec;
        this.Camera2StreamConfigurationMap = size;
        this.getHighSpeedVideoFpsRangesFor = dynamicRange;
        this.getInputFormats = range;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.encoder.VideoEncoderConfig get() {
        androidx.camera.video.internal.config.CaptureEncodeRates resolveFrameRates$camera_video = androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.resolveFrameRates$camera_video(this.getHighSpeedVideoFpsRanges, this.getInputFormats);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        sb.append(resolveFrameRates$camera_video.getCaptureRate());
        sb.append("fps. Encode frame rate = ");
        sb.append(resolveFrameRates$camera_video.getEncodeRate());
        sb.append("fps.");
        androidx.camera.core.Logger.d("VidEncCfgDefaultRslvr", sb.toString());
        int bitrate = this.getHighSpeedVideoFpsRanges.getBitrate();
        if (bitrate == 0) {
            androidx.camera.core.Logger.d("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
            int bitDepth = this.getHighSpeedVideoFpsRangesFor.getBitDepth();
            int encodeRate = resolveFrameRates$camera_video.getEncodeRate();
            int width = this.Camera2StreamConfigurationMap.getWidth();
            android.util.Size size = Camera2StreamConfigurationMap;
            bitrate = androidx.camera.video.internal.config.VideoConfigUtil.scaleBitrate(14000000, bitDepth, 8, encodeRate, 30, width, size.getWidth(), this.Camera2StreamConfigurationMap.getHeight(), size.getHeight());
        }
        int dynamicRangeToCodecProfileLevelForMime = androidx.camera.video.internal.utils.DynamicRangeUtil.dynamicRangeToCodecProfileLevelForMime(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        androidx.camera.video.internal.encoder.VideoEncoderConfig build = androidx.camera.video.internal.encoder.VideoEncoderConfig.builder().setMimeType(this.getHighSpeedVideoSizes).setInputTimebase(this.getHighResolutionOutputSizeshNQ4ISI).setResolution(this.Camera2StreamConfigurationMap).setBitrate(bitrate).setCaptureFrameRate(resolveFrameRates$camera_video.getCaptureRate()).setEncodeFrameRate(resolveFrameRates$camera_video.getEncodeRate()).setProfile(dynamicRangeToCodecProfileLevelForMime).setDataSpace(androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.mimeAndProfileToEncoderDataSpace(this.getHighSpeedVideoSizes, dynamicRangeToCodecProfileLevelForMime)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
