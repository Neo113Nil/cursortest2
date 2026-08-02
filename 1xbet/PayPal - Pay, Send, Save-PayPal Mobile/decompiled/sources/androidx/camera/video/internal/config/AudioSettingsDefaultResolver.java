package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/video/internal/config/AudioSettingsDefaultResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/audio/AudioSettings;", "Landroidx/camera/video/AudioSpec;", "audioSpec", "Landroid/util/Rational;", "captureToEncodeRatio", "<init>", "(Landroidx/camera/video/AudioSpec;Landroid/util/Rational;)V", "get", "()Landroidx/camera/video/internal/audio/AudioSettings;", "getHighSpeedVideoSizes", "Landroidx/camera/video/AudioSpec;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroid/util/Rational;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioSettingsDefaultResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.audio.AudioSettings> {
    private final android.util.Rational getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.video.AudioSpec getHighResolutionOutputSizeshNQ4ISI;

    public AudioSettingsDefaultResolver(androidx.camera.video.AudioSpec audioSpec, android.util.Rational rational) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
        this.getHighResolutionOutputSizeshNQ4ISI = audioSpec;
        this.getHighSpeedVideoFpsRanges = rational;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.audio.AudioSettings get() {
        int resolveAudioSource = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveAudioSource(this.getHighResolutionOutputSizeshNQ4ISI);
        int resolveAudioSourceFormat = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveAudioSourceFormat(this.getHighResolutionOutputSizeshNQ4ISI);
        int channelCount = this.getHighResolutionOutputSizeshNQ4ISI.getChannelCount();
        if (channelCount == -1) {
            androidx.camera.core.Logger.d("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            channelCount = 1;
        } else {
            androidx.camera.core.Logger.d("DefAudioResolver", "Using supplied AUDIO channel count: ".concat(java.lang.String.valueOf(channelCount)));
        }
        int sampleRate = this.getHighResolutionOutputSizeshNQ4ISI.getSampleRate();
        if (sampleRate == 0) {
            sampleRate = 44100;
        }
        androidx.camera.video.internal.config.CaptureEncodeRates resolveSampleRates$camera_video = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveSampleRates$camera_video(sampleRate, channelCount, resolveAudioSourceFormat, this.getHighSpeedVideoFpsRanges);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: ");
        sb.append(resolveSampleRates$camera_video.getCaptureRate());
        sb.append("Hz. Encode sample rate: ");
        sb.append(resolveSampleRates$camera_video.getEncodeRate());
        sb.append("Hz.");
        androidx.camera.core.Logger.d("DefAudioResolver", sb.toString());
        androidx.camera.video.internal.audio.AudioSettings build = androidx.camera.video.internal.audio.AudioSettings.builder().setAudioSource(resolveAudioSource).setAudioFormat(resolveAudioSourceFormat).setChannelCount(channelCount).setCaptureSampleRate(resolveSampleRates$camera_video.getCaptureRate()).setEncodeSampleRate(resolveSampleRates$camera_video.getEncodeRate()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
