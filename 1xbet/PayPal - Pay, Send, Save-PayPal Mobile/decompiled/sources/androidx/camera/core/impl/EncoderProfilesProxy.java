package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    static int getRequiredAudioProfile(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? -1 : 39;
        }
        return 5;
    }

    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles();

    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final java.lang.String MEDIA_TYPE_NONE = "video/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface VideoEncoder {
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();

        public static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create(int i, java.lang.String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public android.util.Size getResolution() {
            return new android.util.Size(getWidth(), getHeight());
        }
    }

    public static abstract class AudioProfileProxy {
        public static final java.lang.String MEDIA_TYPE_NONE = "audio/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface AudioEncoder {
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();

        public static androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy create(int i, java.lang.String str, int i2, int i3, int i4, int i5) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy(i, str, i2, i3, i4, i5);
        }
    }

    public static abstract class ImmutableEncoderProfilesProxy implements androidx.camera.core.impl.EncoderProfilesProxy {
        public static androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy create(int i, int i2, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> list, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> list2) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i, i2, java.util.Collections.unmodifiableList(new java.util.ArrayList(list)), java.util.Collections.unmodifiableList(new java.util.ArrayList(list2)));
        }
    }

    static java.lang.String getVideoCodecMimeType(int i) {
        switch (i) {
            case 1:
                return androidx.media3.common.MimeTypes.VIDEO_H263;
            case 2:
                return "video/avc";
            case 3:
                return androidx.media3.common.MimeTypes.VIDEO_MP4V;
            case 4:
                return androidx.media3.common.MimeTypes.VIDEO_VP8;
            case 5:
                return androidx.media3.common.MimeTypes.VIDEO_H265;
            case 6:
                return androidx.media3.common.MimeTypes.VIDEO_VP9;
            case 7:
                return androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
            case 8:
                return androidx.media3.common.MimeTypes.VIDEO_AV1;
            default:
                return androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    static java.lang.String getAudioCodecMimeType(int i) {
        switch (i) {
            case 1:
                return androidx.media3.common.MimeTypes.AUDIO_AMR_NB;
            case 2:
                return androidx.media3.common.MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return androidx.media3.common.MimeTypes.AUDIO_VORBIS;
            case 7:
                return androidx.media3.common.MimeTypes.AUDIO_OPUS;
            default:
                return androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE;
        }
    }
}
