package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e"}, d2 = {"Landroidx/camera/video/internal/config/AudioEncoderConfigAudioProfileResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "audioProfile", "Landroidx/camera/core/impl/Timebase;", "inputTimebase", "Landroidx/camera/video/AudioSpec;", "audioSpec", "Landroidx/camera/video/internal/audio/AudioSettings;", "audioSettings", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "audioProfileProxy", "<init>", "(Ljava/lang/String;ILandroidx/camera/core/impl/Timebase;Landroidx/camera/video/AudioSpec;Landroidx/camera/video/internal/audio/AudioSettings;Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;)V", "get", "()Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "getInputFormats", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/Timebase;", "Landroidx/camera/video/AudioSpec;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/video/internal/audio/AudioSettings;", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioEncoderConfigAudioProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.AudioEncoderConfig> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getInputSizeshNQ4ISI;
    private final androidx.camera.video.internal.audio.AudioSettings getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.video.AudioSpec getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.Timebase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public AudioEncoderConfigAudioProfileResolver(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, androidx.camera.video.AudioSpec audioSpec, androidx.camera.video.internal.audio.AudioSettings audioSettings, androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioProfileProxy, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = timebase;
        this.getHighSpeedVideoSizes = audioSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = audioSettings;
        this.getInputSizeshNQ4ISI = audioProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.encoder.AudioEncoderConfig get() {
        int bitrate = this.getHighSpeedVideoSizes.getBitrate();
        if (bitrate == 0) {
            androidx.camera.core.Logger.d("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
            bitrate = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.scaleBitrate(this.getInputSizeshNQ4ISI.getBitrate(), this.getHighResolutionOutputSizeshNQ4ISI.getChannelCount(), this.getInputSizeshNQ4ISI.getChannels(), this.getHighResolutionOutputSizeshNQ4ISI.getEncodeSampleRate(), this.getInputSizeshNQ4ISI.getSampleRate());
        }
        androidx.camera.video.internal.encoder.AudioEncoderConfig build = androidx.camera.video.internal.encoder.AudioEncoderConfig.builder().setMimeType(this.Camera2StreamConfigurationMap).setProfile(this.getHighSpeedVideoFpsRanges).setInputTimebase(this.getHighSpeedVideoFpsRangesFor).setChannelCount(this.getHighResolutionOutputSizeshNQ4ISI.getChannelCount()).setCaptureSampleRate(this.getHighResolutionOutputSizeshNQ4ISI.getCaptureSampleRate()).setEncodeSampleRate(this.getHighResolutionOutputSizeshNQ4ISI.getEncodeSampleRate()).setBitrate(bitrate).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
