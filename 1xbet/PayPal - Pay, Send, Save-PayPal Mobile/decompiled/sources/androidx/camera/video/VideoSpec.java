package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000  2\u00020\u0001:\u0002! B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Landroidx/camera/video/VideoSpec;", "", "Landroidx/camera/video/QualitySelector;", "qualitySelector", "", "encodeFrameRate", "bitrate", "aspectRatio", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroidx/camera/video/QualitySelector;IIILjava/lang/String;)V", "Landroidx/camera/video/VideoSpec$Builder;", "toBuilder", "()Landroidx/camera/video/VideoSpec$Builder;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/camera/video/QualitySelector;", "getQualitySelector", "()Landroidx/camera/video/QualitySelector;", com.visa.cbp.getEncExpo.warmup, "getEncodeFrameRate", "getBitrate", "getAspectRatio", "Ljava/lang/String;", "getMimeType", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoSpec {
    public static final int BITRATE_UNSPECIFIED = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.VideoSpec.Companion INSTANCE;
    private static final androidx.camera.video.VideoSpec DEFAULT;
    public static final int ENCODE_FRAME_RATE_UNSPECIFIED = 0;
    public static final java.lang.String MIME_TYPE_UNSPECIFIED = "video/*";
    private static final androidx.camera.video.QualitySelector QUALITY_SELECTOR_UNSPECIFIED;
    private final int aspectRatio;
    private final int bitrate;
    private final int encodeFrameRate;
    private final java.lang.String mimeType;
    private final androidx.camera.video.QualitySelector qualitySelector;

    public VideoSpec(androidx.camera.video.QualitySelector qualitySelector, int i, int i2, int i3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.qualitySelector = qualitySelector;
        this.encodeFrameRate = i;
        this.bitrate = i2;
        this.aspectRatio = i3;
        this.mimeType = str;
    }

    public /* synthetic */ VideoSpec(androidx.camera.video.QualitySelector qualitySelector, int i, int i2, int i3, java.lang.String str, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? QUALITY_SELECTOR_UNSPECIFIED : qualitySelector, (i4 & 2) != 0 ? 0 : i, (i4 & 4) == 0 ? i2 : 0, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? MIME_TYPE_UNSPECIFIED : str);
    }

    public final androidx.camera.video.QualitySelector getQualitySelector() {
        return this.qualitySelector;
    }

    public final int getEncodeFrameRate() {
        return this.encodeFrameRate;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getAspectRatio() {
        return this.aspectRatio;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final androidx.camera.video.VideoSpec.Builder toBuilder() {
        return new androidx.camera.video.VideoSpec.Builder().setQualitySelector(this.qualitySelector).setEncodeFrameRate(this.encodeFrameRate).setBitrate(this.bitrate).setAspectRatio(this.aspectRatio).setMimeType(this.mimeType);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.qualitySelector);
        sb.append(", encodeFrameRate=");
        sb.append(this.encodeFrameRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", aspectRatio=");
        sb.append(this.aspectRatio);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.VideoSpec)) {
            return false;
        }
        androidx.camera.video.VideoSpec videoSpec = (androidx.camera.video.VideoSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.qualitySelector, videoSpec.qualitySelector) && this.encodeFrameRate == videoSpec.encodeFrameRate && this.bitrate == videoSpec.bitrate && this.aspectRatio == videoSpec.aspectRatio && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, videoSpec.mimeType);
    }

    public final int hashCode() {
        androidx.camera.video.QualitySelector qualitySelector = this.qualitySelector;
        int i = this.encodeFrameRate;
        int i2 = this.bitrate;
        int i3 = this.aspectRatio;
        return java.util.Objects.hash(qualitySelector, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), this.mimeType);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e"}, d2 = {"Landroidx/camera/video/VideoSpec$Builder;", "", "<init>", "()V", "Landroidx/camera/video/QualitySelector;", "qualitySelector", "setQualitySelector", "(Landroidx/camera/video/QualitySelector;)Landroidx/camera/video/VideoSpec$Builder;", "", "frameRate", "setEncodeFrameRate", "(I)Landroidx/camera/video/VideoSpec$Builder;", "bitrate", "setBitrate", "aspectRatio", "setAspectRatio", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "setMimeType", "(Ljava/lang/String;)Landroidx/camera/video/VideoSpec$Builder;", "Landroidx/camera/video/VideoSpec;", "build", "()Landroidx/camera/video/VideoSpec;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/video/QualitySelector;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.camera.video.QualitySelector getHighSpeedVideoFpsRangesFor = androidx.camera.video.VideoSpec.INSTANCE.getQUALITY_SELECTOR_UNSPECIFIED();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes = -1;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED;

        public final androidx.camera.video.VideoSpec.Builder setQualitySelector(androidx.camera.video.QualitySelector qualitySelector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
            this.getHighSpeedVideoFpsRangesFor = qualitySelector;
            return this;
        }

        public final androidx.camera.video.VideoSpec.Builder setEncodeFrameRate(int frameRate) {
            this.getHighSpeedVideoFpsRanges = frameRate;
            return this;
        }

        public final androidx.camera.video.VideoSpec.Builder setBitrate(int bitrate) {
            this.Camera2StreamConfigurationMap = bitrate;
            return this;
        }

        public final androidx.camera.video.VideoSpec.Builder setAspectRatio(int aspectRatio) {
            this.getHighSpeedVideoSizes = aspectRatio;
            return this;
        }

        public final androidx.camera.video.VideoSpec.Builder setMimeType(java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            this.getHighResolutionOutputSizeshNQ4ISI = mimeType;
            return this;
        }

        public final androidx.camera.video.VideoSpec build() {
            return new androidx.camera.video.VideoSpec(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/video/VideoSpec$Companion;", "", "<init>", "()V", "Landroidx/camera/video/VideoSpec$Builder;", "builder", "()Landroidx/camera/video/VideoSpec$Builder;", "", "ENCODE_FRAME_RATE_UNSPECIFIED", com.visa.cbp.getEncExpo.warmup, "BITRATE_UNSPECIFIED", "", "MIME_TYPE_UNSPECIFIED", "Ljava/lang/String;", "Landroidx/camera/video/QualitySelector;", "QUALITY_SELECTOR_UNSPECIFIED", "Landroidx/camera/video/QualitySelector;", "getQUALITY_SELECTOR_UNSPECIFIED", "()Landroidx/camera/video/QualitySelector;", "Landroidx/camera/video/VideoSpec;", "DEFAULT", "Landroidx/camera/video/VideoSpec;", "getDEFAULT", "()Landroidx/camera/video/VideoSpec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.video.QualitySelector getQUALITY_SELECTOR_UNSPECIFIED() {
            return androidx.camera.video.VideoSpec.QUALITY_SELECTOR_UNSPECIFIED;
        }

        public final androidx.camera.video.VideoSpec getDEFAULT() {
            return androidx.camera.video.VideoSpec.DEFAULT;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.video.VideoSpec.Builder builder() {
            return new androidx.camera.video.VideoSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.camera.video.VideoSpec.Companion companion = new androidx.camera.video.VideoSpec.Companion(null);
        INSTANCE = companion;
        androidx.camera.video.QualitySelector qualitySelector = androidx.camera.video.QualitySelector.NONE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualitySelector, "");
        QUALITY_SELECTOR_UNSPECIFIED = qualitySelector;
        DEFAULT = companion.builder().build();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.video.VideoSpec.Builder builder() {
        return INSTANCE.builder();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(androidx.camera.video.QualitySelector qualitySelector, int i, int i2, int i3) {
        this(qualitySelector, i, i2, i3, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(androidx.camera.video.QualitySelector qualitySelector, int i, int i2) {
        this(qualitySelector, i, i2, 0, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(androidx.camera.video.QualitySelector qualitySelector, int i) {
        this(qualitySelector, i, 0, 0, null, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(androidx.camera.video.QualitySelector qualitySelector) {
        this(qualitySelector, 0, 0, 0, null, 30, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualitySelector, "");
    }

    public VideoSpec() {
        this(null, 0, 0, 0, null, 31, null);
    }
}
