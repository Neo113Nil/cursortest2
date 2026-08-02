package androidx.camera.core.impl.compat;

/* loaded from: classes6.dex */
class EncoderProfilesProxyCompatBaseImpl {
    public static androidx.camera.core.impl.EncoderProfilesProxy getHighSpeedVideoSizes(android.media.CamcorderProfile camcorderProfile) {
        return androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, Camera2StreamConfigurationMap(camcorderProfile), getHighResolutionOutputSizeshNQ4ISI(camcorderProfile));
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getHighResolutionOutputSizeshNQ4ISI(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(camcorderProfile.videoCodec, androidx.camera.core.impl.EncoderProfilesProxy.getVideoCodecMimeType(camcorderProfile.videoCodec), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> Camera2StreamConfigurationMap(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(camcorderProfile.audioCodec, androidx.camera.core.impl.EncoderProfilesProxy.getAudioCodecMimeType(camcorderProfile.audioCodec), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, androidx.camera.core.impl.EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private EncoderProfilesProxyCompatBaseImpl() {
    }
}
