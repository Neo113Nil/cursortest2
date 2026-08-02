package androidx.camera.core.impl.compat;

/* loaded from: classes6.dex */
class EncoderProfilesProxyCompatApi31Impl {
    public static androidx.camera.core.impl.EncoderProfilesProxy T_(android.media.EncoderProfiles encoderProfiles) {
        return androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), getHighSpeedVideoFpsRangesFor(encoderProfiles.getAudioProfiles()), Camera2StreamConfigurationMap(encoderProfiles.getVideoProfiles()));
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> Camera2StreamConfigurationMap(java.util.List<android.media.EncoderProfiles.VideoProfile> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return arrayList;
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getHighSpeedVideoFpsRangesFor(java.util.List<android.media.EncoderProfiles.AudioProfile> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    private EncoderProfilesProxyCompatApi31Impl() {
    }
}
