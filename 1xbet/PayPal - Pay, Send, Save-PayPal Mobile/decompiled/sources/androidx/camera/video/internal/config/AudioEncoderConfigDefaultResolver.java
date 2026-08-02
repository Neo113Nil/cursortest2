package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Landroidx/camera/video/internal/config/AudioEncoderConfigDefaultResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "audioProfile", "Landroidx/camera/core/impl/Timebase;", "inputTimeBase", "Landroidx/camera/video/AudioSpec;", "audioSpec", "Landroidx/camera/video/internal/audio/AudioSettings;", "audioSettings", "<init>", "(Ljava/lang/String;ILandroidx/camera/core/impl/Timebase;Landroidx/camera/video/AudioSpec;Landroidx/camera/video/internal/audio/AudioSettings;)V", "get", "()Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/Timebase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/video/AudioSpec;", "Landroidx/camera/video/internal/audio/AudioSettings;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioEncoderConfigDefaultResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.AudioEncoderConfig> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Timebase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final androidx.camera.video.AudioSpec getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.video.internal.audio.AudioSettings getHighResolutionOutputSizeshNQ4ISI;

    public AudioEncoderConfigDefaultResolver(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, androidx.camera.video.AudioSpec audioSpec, androidx.camera.video.internal.audio.AudioSettings audioSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSettings, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = timebase;
        this.getHighSpeedVideoFpsRangesFor = audioSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = audioSettings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.encoder.AudioEncoderConfig get() {
        int bitrate = this.getHighSpeedVideoFpsRangesFor.getBitrate();
        if (bitrate == 0) {
            androidx.camera.core.Logger.d("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
            bitrate = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.scaleBitrate(156000, this.getHighResolutionOutputSizeshNQ4ISI.getChannelCount(), 2, this.getHighResolutionOutputSizeshNQ4ISI.getEncodeSampleRate(), 48000);
        }
        androidx.camera.video.internal.encoder.AudioEncoderConfig build = androidx.camera.video.internal.encoder.AudioEncoderConfig.builder().setMimeType(this.getHighSpeedVideoSizes).setProfile(this.getHighSpeedVideoFpsRanges).setInputTimebase(this.Camera2StreamConfigurationMap).setChannelCount(this.getHighResolutionOutputSizeshNQ4ISI.getChannelCount()).setCaptureSampleRate(this.getHighResolutionOutputSizeshNQ4ISI.getCaptureSampleRate()).setEncodeSampleRate(this.getHighResolutionOutputSizeshNQ4ISI.getEncodeSampleRate()).setBitrate(bitrate).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
