package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001f \u001eB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012"}, d2 = {"Landroidx/camera/video/MediaSpec;", "", "Landroidx/camera/video/VideoSpec;", "videoSpec", "Landroidx/camera/video/AudioSpec;", "audioSpec", "", "outputFormat", "<init>", "(Landroidx/camera/video/VideoSpec;Landroidx/camera/video/AudioSpec;I)V", "Landroidx/camera/video/MediaSpec$Builder;", "toBuilder", "()Landroidx/camera/video/MediaSpec$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/video/VideoSpec;", "getVideoSpec", "()Landroidx/camera/video/VideoSpec;", "Landroidx/camera/video/AudioSpec;", "getAudioSpec", "()Landroidx/camera/video/AudioSpec;", com.visa.cbp.getEncExpo.warmup, "getOutputFormat", "Companion", "Builder", "OutputFormat"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MediaSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.MediaSpec.Companion INSTANCE = new androidx.camera.video.MediaSpec.Companion(null);
    public static final int OUTPUT_FORMAT_MPEG_4 = 0;
    public static final int OUTPUT_FORMAT_UNSPECIFIED = -1;
    public static final int OUTPUT_FORMAT_WEBM = 1;
    private final androidx.camera.video.AudioSpec audioSpec;
    private final int outputFormat;
    private final androidx.camera.video.VideoSpec videoSpec;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/video/MediaSpec$OutputFormat;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface OutputFormat {
    }

    public MediaSpec(androidx.camera.video.VideoSpec videoSpec, androidx.camera.video.AudioSpec audioSpec, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
        this.videoSpec = videoSpec;
        this.audioSpec = audioSpec;
        this.outputFormat = i;
    }

    public /* synthetic */ MediaSpec(androidx.camera.video.VideoSpec videoSpec, androidx.camera.video.AudioSpec audioSpec, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.camera.video.VideoSpec.INSTANCE.getDEFAULT() : videoSpec, (i2 & 2) != 0 ? androidx.camera.video.AudioSpec.INSTANCE.getDEFAULT() : audioSpec, (i2 & 4) != 0 ? -1 : i);
    }

    public final androidx.camera.video.VideoSpec getVideoSpec() {
        return this.videoSpec;
    }

    public final androidx.camera.video.AudioSpec getAudioSpec() {
        return this.audioSpec;
    }

    public final int getOutputFormat() {
        return this.outputFormat;
    }

    public final androidx.camera.video.MediaSpec.Builder toBuilder() {
        return new androidx.camera.video.MediaSpec.Builder().setVideoSpec(this.videoSpec).setAudioSpec(this.audioSpec).setOutputFormat(this.outputFormat);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.MediaSpec)) {
            return false;
        }
        androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.videoSpec, mediaSpec.videoSpec) && kotlin.jvm.internal.Intrinsics.areEqual(this.audioSpec, mediaSpec.audioSpec) && this.outputFormat == mediaSpec.outputFormat;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.videoSpec, this.audioSpec, java.lang.Integer.valueOf(this.outputFormat));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.videoSpec);
        sb.append(", audioSpec=");
        sb.append(this.audioSpec);
        sb.append(", outputFormat=");
        sb.append(this.outputFormat);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/video/MediaSpec$Builder;", "", "<init>", "()V", "Landroidx/camera/video/AudioSpec;", "audioSpec", "setAudioSpec", "(Landroidx/camera/video/AudioSpec;)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/camera/video/VideoSpec;", "videoSpec", "setVideoSpec", "(Landroidx/camera/video/VideoSpec;)Landroidx/camera/video/MediaSpec$Builder;", "", "format", "setOutputFormat", "(I)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/AudioSpec$Builder;", "configBlock", "configureAudio", "(Landroidx/core/util/Consumer;)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/camera/video/VideoSpec$Builder;", "configureVideo", "Landroidx/camera/video/MediaSpec;", "build", "()Landroidx/camera/video/MediaSpec;", "Camera2StreamConfigurationMap", "Landroidx/camera/video/AudioSpec;", "getHighSpeedVideoSizes", "Landroidx/camera/video/VideoSpec;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.camera.video.AudioSpec getHighSpeedVideoSizes = androidx.camera.video.AudioSpec.INSTANCE.getDEFAULT();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.camera.video.VideoSpec getHighSpeedVideoFpsRanges = androidx.camera.video.VideoSpec.INSTANCE.getDEFAULT();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor = -1;

        public final androidx.camera.video.MediaSpec.Builder setAudioSpec(androidx.camera.video.AudioSpec audioSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
            this.getHighSpeedVideoSizes = audioSpec;
            return this;
        }

        public final androidx.camera.video.MediaSpec.Builder setVideoSpec(androidx.camera.video.VideoSpec videoSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
            this.getHighSpeedVideoFpsRanges = videoSpec;
            return this;
        }

        public final androidx.camera.video.MediaSpec.Builder setOutputFormat(int format) {
            this.getHighSpeedVideoFpsRangesFor = format;
            return this;
        }

        public final androidx.camera.video.MediaSpec.Builder configureAudio(androidx.core.util.Consumer<androidx.camera.video.AudioSpec.Builder> configBlock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configBlock, "");
            androidx.camera.video.AudioSpec.Builder builder = this.getHighSpeedVideoSizes.toBuilder();
            configBlock.accept(builder);
            this.getHighSpeedVideoSizes = builder.build();
            return this;
        }

        public final androidx.camera.video.MediaSpec.Builder configureVideo(androidx.core.util.Consumer<androidx.camera.video.VideoSpec.Builder> configBlock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configBlock, "");
            androidx.camera.video.VideoSpec.Builder builder = this.getHighSpeedVideoFpsRanges.toBuilder();
            configBlock.accept(builder);
            this.getHighSpeedVideoFpsRanges = builder.build();
            return this;
        }

        public final androidx.camera.video.MediaSpec build() {
            return new androidx.camera.video.MediaSpec(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/camera/video/MediaSpec$Companion;", "", "<init>", "()V", "", "outputFormat", "", "outputFormatToAudioMime", "(I)Ljava/lang/String;", "outputFormatToAudioProfile", "(I)I", "outputFormatToVideoMime", "outputFormatToMuxerFormat", "Landroidx/camera/video/MediaSpec$Builder;", "builder", "()Landroidx/camera/video/MediaSpec$Builder;", "OUTPUT_FORMAT_UNSPECIFIED", com.visa.cbp.getEncExpo.warmup, "OUTPUT_FORMAT_MPEG_4", "OUTPUT_FORMAT_WEBM"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public final int outputFormatToMuxerFormat(int outputFormat) {
            return outputFormat == 1 ? 1 : 0;
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String outputFormatToAudioMime(int outputFormat) {
            if (outputFormat == 1) {
                return androidx.media3.common.MimeTypes.AUDIO_VORBIS;
            }
            return "audio/mp4a-latm";
        }

        @kotlin.jvm.JvmStatic
        public final int outputFormatToAudioProfile(int outputFormat) {
            return kotlin.jvm.internal.Intrinsics.areEqual(outputFormatToAudioMime(outputFormat), "audio/mp4a-latm") ? 2 : -1;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String outputFormatToVideoMime(int outputFormat) {
            if (outputFormat == 1) {
                return androidx.media3.common.MimeTypes.VIDEO_VP8;
            }
            return "video/avc";
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.video.MediaSpec.Builder builder() {
            return new androidx.camera.video.MediaSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String outputFormatToVideoMime(int i) {
        return INSTANCE.outputFormatToVideoMime(i);
    }

    @kotlin.jvm.JvmStatic
    public static final int outputFormatToMuxerFormat(int i) {
        return INSTANCE.outputFormatToMuxerFormat(i);
    }

    @kotlin.jvm.JvmStatic
    public static final int outputFormatToAudioProfile(int i) {
        return INSTANCE.outputFormatToAudioProfile(i);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String outputFormatToAudioMime(int i) {
        return INSTANCE.outputFormatToAudioMime(i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.video.MediaSpec.Builder builder() {
        return INSTANCE.builder();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSpec(androidx.camera.video.VideoSpec videoSpec, androidx.camera.video.AudioSpec audioSpec) {
        this(videoSpec, audioSpec, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSpec, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSpec(androidx.camera.video.VideoSpec videoSpec) {
        this(videoSpec, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSpec, "");
    }

    public MediaSpec() {
        this(null, null, 0, 7, null);
    }
}
