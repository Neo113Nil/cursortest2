package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#"}, d2 = {"Landroidx/camera/video/internal/config/VideoEncoderConfigVideoProfileResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Landroidx/camera/core/impl/Timebase;", "inputTimebase", "Landroidx/camera/video/VideoSpec;", "videoSpec", "Landroid/util/Size;", "surfaceSize", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "videoProfile", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroid/util/Range;", "", "expectedFrameRateRange", "<init>", "(Ljava/lang/String;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/VideoSpec;Landroid/util/Size;Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;Landroidx/camera/core/DynamicRange;Landroid/util/Range;)V", "get", "()Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/Timebase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Landroidx/camera/video/VideoSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/util/Size;", "getInputFormats", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "Landroidx/camera/core/DynamicRange;", "Landroid/util/Range;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoEncoderConfigVideoProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.VideoEncoderConfig> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.core.DynamicRange getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.util.Range<java.lang.Integer> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Timebase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final android.util.Size getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.video.VideoSpec Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getHighSpeedVideoFpsRangesFor;

    public VideoEncoderConfigVideoProfileResolver(java.lang.String str, androidx.camera.core.impl.Timebase timebase, androidx.camera.video.VideoSpec videoSpec, android.util.Size size, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoProfileProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = timebase;
        this.Camera2StreamConfigurationMap = videoSpec;
        this.getHighSpeedVideoSizes = size;
        this.getHighSpeedVideoFpsRangesFor = videoProfileProxy;
        this.getInputFormats = dynamicRange;
        this.getInputSizeshNQ4ISI = range;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.encoder.VideoEncoderConfig get() {
        androidx.camera.video.internal.config.CaptureEncodeRates resolveFrameRates$camera_video = androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.resolveFrameRates$camera_video(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        sb.append(resolveFrameRates$camera_video.getCaptureRate());
        sb.append("fps. Encode frame rate = ");
        sb.append(resolveFrameRates$camera_video.getEncodeRate());
        sb.append("fps.");
        androidx.camera.core.Logger.d("VidEncVdPrflRslvr", sb.toString());
        int bitrate = this.Camera2StreamConfigurationMap.getBitrate();
        if (bitrate == 0) {
            androidx.camera.core.Logger.d("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
            bitrate = androidx.camera.video.internal.config.VideoConfigUtil.scaleBitrate(this.getHighSpeedVideoFpsRangesFor.getBitrate(), this.getInputFormats.getBitDepth(), this.getHighSpeedVideoFpsRangesFor.getBitDepth(), resolveFrameRates$camera_video.getEncodeRate(), this.getHighSpeedVideoFpsRangesFor.getFrameRate(), this.getHighSpeedVideoSizes.getWidth(), this.getHighSpeedVideoFpsRangesFor.getWidth(), this.getHighSpeedVideoSizes.getHeight(), this.getHighSpeedVideoFpsRangesFor.getHeight());
        }
        int profile = this.getHighSpeedVideoFpsRangesFor.getProfile();
        androidx.camera.video.internal.encoder.VideoEncoderConfig build = androidx.camera.video.internal.encoder.VideoEncoderConfig.builder().setMimeType(this.getHighSpeedVideoFpsRanges).setInputTimebase(this.getHighResolutionOutputSizeshNQ4ISI).setResolution(this.getHighSpeedVideoSizes).setBitrate(bitrate).setCaptureFrameRate(resolveFrameRates$camera_video.getCaptureRate()).setEncodeFrameRate(resolveFrameRates$camera_video.getEncodeRate()).setProfile(profile).setDataSpace(androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.mimeAndProfileToEncoderDataSpace(this.getHighSpeedVideoFpsRanges, profile)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
