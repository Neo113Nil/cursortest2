package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 \u001f2\u00020\u0001:\u0005 !\"#\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016"}, d2 = {"Landroidx/camera/video/AudioSpec;", "", "", "bitrate", "sourceFormat", "source", "sampleRate", "channelCount", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(IIIIILjava/lang/String;)V", "Landroidx/camera/video/AudioSpec$Builder;", "toBuilder", "()Landroidx/camera/video/AudioSpec$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getBitrate", "getSourceFormat", "getSource", "getSampleRate", "getChannelCount", "Ljava/lang/String;", "getMimeType", "Companion", "Builder", "SourceFormat", "ChannelCount", "Source"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudioSpec {
    public static final int BITRATE_UNSPECIFIED = 0;
    public static final int CHANNEL_COUNT_MONO = 1;
    public static final int CHANNEL_COUNT_NONE = 0;
    public static final int CHANNEL_COUNT_STEREO = 2;
    public static final int CHANNEL_COUNT_UNSPECIFIED = -1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.AudioSpec.Companion INSTANCE;
    private static final androidx.camera.video.AudioSpec DEFAULT;
    public static final java.lang.String MIME_TYPE_UNSPECIFIED = "audio/*";
    public static final int SAMPLE_RATE_UNSPECIFIED = 0;
    public static final int SOURCE_CAMCORDER = 5;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_FORMAT_PCM_16BIT = 2;
    public static final int SOURCE_FORMAT_UNSPECIFIED = -1;
    public static final int SOURCE_MIC = 1;
    public static final int SOURCE_UNPROCESSED = 9;
    public static final int SOURCE_UNSPECIFIED = -1;
    public static final int SOURCE_VOICE_COMMUNICATION = 7;
    public static final int SOURCE_VOICE_PERFORMANCE = 10;
    public static final int SOURCE_VOICE_RECOGNITION = 6;
    private final int bitrate;
    private final int channelCount;
    private final java.lang.String mimeType;
    private final int sampleRate;
    private final int source;
    private final int sourceFormat;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/video/AudioSpec$ChannelCount;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface ChannelCount {
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/video/AudioSpec$Source;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Source {
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/video/AudioSpec$SourceFormat;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface SourceFormat {
    }

    public AudioSpec(int i, int i2, int i3, int i4, int i5, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.bitrate = i;
        this.sourceFormat = i2;
        this.source = i3;
        this.sampleRate = i4;
        this.channelCount = i5;
        this.mimeType = str;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getSourceFormat() {
        return this.sourceFormat;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public /* synthetic */ AudioSpec(int i, int i2, int i3, int i4, int i5, java.lang.String str, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) == 0 ? i4 : 0, (i6 & 16) == 0 ? i5 : -1, (i6 & 32) != 0 ? MIME_TYPE_UNSPECIFIED : str);
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final androidx.camera.video.AudioSpec.Builder toBuilder() {
        return new androidx.camera.video.AudioSpec.Builder().setSampleRate(this.sampleRate).setBitrate(this.bitrate).setChannelCount(this.channelCount).setSource(this.source).setSourceFormat(this.sourceFormat).setMimeType(this.mimeType);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.AudioSpec)) {
            return false;
        }
        androidx.camera.video.AudioSpec audioSpec = (androidx.camera.video.AudioSpec) other;
        return this.sourceFormat == audioSpec.sourceFormat && this.source == audioSpec.source && this.channelCount == audioSpec.channelCount && this.bitrate == audioSpec.bitrate && this.sampleRate == audioSpec.sampleRate && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, audioSpec.mimeType);
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(this.sourceFormat), java.lang.Integer.valueOf(this.source), java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelCount));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioSpec{bitrate=");
        sb.append(this.bitrate);
        sb.append(", sourceFormat=");
        sb.append(this.sourceFormat);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channelCount=");
        sb.append(this.channelCount);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/camera/video/AudioSpec$Builder;", "", "<init>", "()V", "", "bitrate", "setBitrate", "(I)Landroidx/camera/video/AudioSpec$Builder;", "audioFormat", "setSourceFormat", "source", "setSource", "sampleRate", "setSampleRate", "channelCount", "setChannelCount", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "setMimeType", "(Ljava/lang/String;)Landroidx/camera/video/AudioSpec$Builder;", "Landroidx/camera/video/AudioSpec;", "build", "()Landroidx/camera/video/AudioSpec;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap = -1;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor = -1;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges = -1;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.lang.String getInputFormats = androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED;

        public final androidx.camera.video.AudioSpec.Builder setBitrate(int bitrate) {
            this.getHighResolutionOutputSizeshNQ4ISI = bitrate;
            return this;
        }

        public final androidx.camera.video.AudioSpec.Builder setSourceFormat(int audioFormat) {
            this.Camera2StreamConfigurationMap = audioFormat;
            return this;
        }

        public final androidx.camera.video.AudioSpec.Builder setSource(int source) {
            this.getHighSpeedVideoFpsRangesFor = source;
            return this;
        }

        public final androidx.camera.video.AudioSpec.Builder setSampleRate(int sampleRate) {
            this.getHighSpeedVideoSizes = sampleRate;
            return this;
        }

        public final androidx.camera.video.AudioSpec.Builder setChannelCount(int channelCount) {
            this.getHighSpeedVideoFpsRanges = channelCount;
            return this;
        }

        public final androidx.camera.video.AudioSpec.Builder setMimeType(java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            this.getInputFormats = mimeType;
            return this;
        }

        public final androidx.camera.video.AudioSpec build() {
            return new androidx.camera.video.AudioSpec(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputFormats);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/video/AudioSpec$Companion;", "", "<init>", "()V", "Landroidx/camera/video/AudioSpec$Builder;", "builder", "()Landroidx/camera/video/AudioSpec$Builder;", "", "SOURCE_FORMAT_UNSPECIFIED", com.visa.cbp.getEncExpo.warmup, "SOURCE_FORMAT_PCM_16BIT", "CHANNEL_COUNT_UNSPECIFIED", "CHANNEL_COUNT_NONE", "CHANNEL_COUNT_MONO", "CHANNEL_COUNT_STEREO", "SOURCE_UNSPECIFIED", "SOURCE_CAMCORDER", "SOURCE_DEFAULT", "SOURCE_MIC", "SOURCE_UNPROCESSED", "SOURCE_VOICE_COMMUNICATION", "SOURCE_VOICE_RECOGNITION", "SOURCE_VOICE_PERFORMANCE", "BITRATE_UNSPECIFIED", "SAMPLE_RATE_UNSPECIFIED", "", "MIME_TYPE_UNSPECIFIED", "Ljava/lang/String;", "Landroidx/camera/video/AudioSpec;", "DEFAULT", "Landroidx/camera/video/AudioSpec;", "getDEFAULT", "()Landroidx/camera/video/AudioSpec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.video.AudioSpec getDEFAULT() {
            return androidx.camera.video.AudioSpec.DEFAULT;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.video.AudioSpec.Builder builder() {
            return new androidx.camera.video.AudioSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.camera.video.AudioSpec.Companion companion = new androidx.camera.video.AudioSpec.Companion(null);
        INSTANCE = companion;
        DEFAULT = companion.builder().build();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.video.AudioSpec.Builder builder() {
        return INSTANCE.builder();
    }

    public AudioSpec(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, null, 32, null);
    }

    public AudioSpec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, 0, null, 48, null);
    }

    public AudioSpec(int i, int i2, int i3) {
        this(i, i2, i3, 0, 0, null, 56, null);
    }

    public AudioSpec(int i, int i2) {
        this(i, i2, 0, 0, 0, null, 60, null);
    }

    public AudioSpec(int i) {
        this(i, 0, 0, 0, 0, null, 62, null);
    }

    public AudioSpec() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }
}
