package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/video/internal/config/AudioSettingsAudioProfileResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/audio/AudioSettings;", "Landroidx/camera/video/AudioSpec;", "audioSpec", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "audioProfile", "Landroid/util/Rational;", "captureToEncodeRatio", "<init>", "(Landroidx/camera/video/AudioSpec;Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;Landroid/util/Rational;)V", "get", "()Landroidx/camera/video/internal/audio/AudioSettings;", "Camera2StreamConfigurationMap", "Landroidx/camera/video/AudioSpec;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroid/util/Rational;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioSettingsAudioProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.audio.AudioSettings> {
    private final androidx.camera.video.AudioSpec Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getHighSpeedVideoSizes;
    private final android.util.Rational getHighSpeedVideoFpsRangesFor;

    public AudioSettingsAudioProfileResolver(androidx.camera.video.AudioSpec audioSpec, androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, android.util.Rational rational) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioProfileProxy, "");
        this.Camera2StreamConfigurationMap = audioSpec;
        this.getHighSpeedVideoSizes = audioProfileProxy;
        this.getHighSpeedVideoFpsRangesFor = rational;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final androidx.camera.video.internal.audio.AudioSettings get() {
        int resolveAudioSource = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveAudioSource(this.Camera2StreamConfigurationMap);
        int resolveAudioSourceFormat = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveAudioSourceFormat(this.Camera2StreamConfigurationMap);
        int channelCount = this.Camera2StreamConfigurationMap.getChannelCount();
        int channels = this.getHighSpeedVideoSizes.getChannels();
        if (channelCount == -1) {
            androidx.camera.core.Logger.d("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: ".concat(java.lang.String.valueOf(channels)));
            channelCount = channels;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ");
            sb.append(channels);
            sb.append(", Resolved Channel Count: ");
            sb.append(channelCount);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.camera.core.Logger.d("AudioSrcAdPrflRslvr", sb.toString());
        }
        int sampleRate = this.Camera2StreamConfigurationMap.getSampleRate();
        int sampleRate2 = this.getHighSpeedVideoSizes.getSampleRate();
        if (sampleRate == 0) {
            sampleRate = sampleRate2;
        }
        androidx.camera.video.internal.config.CaptureEncodeRates resolveSampleRates$camera_video = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.resolveSampleRates$camera_video(sampleRate, channelCount, resolveAudioSourceFormat, this.getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: ");
        sb2.append(resolveSampleRates$camera_video.getCaptureRate());
        sb2.append("Hz. Encode sample rate: ");
        sb2.append(resolveSampleRates$camera_video.getEncodeRate());
        sb2.append("Hz. [AudioProfile sample rate: ");
        sb2.append(sampleRate2);
        sb2.append("Hz]");
        androidx.camera.core.Logger.d("AudioSrcAdPrflRslvr", sb2.toString());
        androidx.camera.video.internal.audio.AudioSettings build = androidx.camera.video.internal.audio.AudioSettings.builder().setAudioSource(resolveAudioSource).setAudioFormat(resolveAudioSourceFormat).setChannelCount(channelCount).setCaptureSampleRate(resolveSampleRates$camera_video.getCaptureRate()).setEncodeSampleRate(resolveSampleRates$camera_video.getEncodeRate()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
