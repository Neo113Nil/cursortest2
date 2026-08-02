package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public abstract class VideoValidatedEncoderProfilesProxy implements androidx.camera.core.impl.EncoderProfilesProxy {
    public abstract androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile();

    public abstract androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile();

    public static androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy from(androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy) {
        return create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), encoderProfilesProxy.getVideoProfiles());
    }

    public static androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy create(int i, int i2, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> list, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> list2) {
        androidx.core.util.Preconditions.checkArgument(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy(i, i2, java.util.Collections.unmodifiableList(new java.util.ArrayList(list)), java.util.Collections.unmodifiableList(new java.util.ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }
}
