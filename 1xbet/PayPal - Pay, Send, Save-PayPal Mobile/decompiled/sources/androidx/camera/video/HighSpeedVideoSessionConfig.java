package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB9\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig;", "Landroidx/camera/core/SessionConfig;", "Landroidx/camera/video/VideoCapture;", "videoCapture", "Landroidx/camera/core/Preview;", "preview", "Landroid/util/Range;", "", "frameRateRange", "", "isSlowMotionEnabled", "<init>", "(Landroidx/camera/video/VideoCapture;Landroidx/camera/core/Preview;Landroid/util/Range;Z)V", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/video/VideoCapture;", "getVideoCapture", "()Landroidx/camera/video/VideoCapture;", "Landroidx/camera/core/Preview;", "getPreview", "()Landroidx/camera/core/Preview;", "Z", "()Z", "sessionType", com.visa.cbp.getEncExpo.warmup, "getSessionType", "()I", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HighSpeedVideoSessionConfig extends androidx.camera.core.SessionConfig {
    private static final androidx.camera.video.HighSpeedVideoSessionConfig.Companion Companion = new androidx.camera.video.HighSpeedVideoSessionConfig.Companion(null);
    private final boolean isSlowMotionEnabled;
    private final androidx.camera.core.Preview preview;
    private final int sessionType;
    private final androidx.camera.video.VideoCapture<?> videoCapture;

    public final androidx.camera.video.VideoCapture<?> getVideoCapture() {
        return this.videoCapture;
    }

    public final androidx.camera.core.Preview getPreview() {
        return this.preview;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HighSpeedVideoSessionConfig(androidx.camera.video.VideoCapture videoCapture, androidx.camera.core.Preview preview, android.util.Range range, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(videoCapture, preview, range, (i & 8) != 0 ? false : z);
        preview = (i & 2) != 0 ? null : preview;
        if ((i & 4) != 0) {
            range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
        }
    }

    /* renamed from: isSlowMotionEnabled, reason: from getter */
    public final boolean getIsSlowMotionEnabled() {
        return this.isSlowMotionEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(androidx.camera.video.VideoCapture<?> videoCapture, androidx.camera.core.Preview preview, android.util.Range<java.lang.Integer> range, boolean z) {
        super(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new androidx.camera.core.UseCase[]{videoCapture, preview}), null, null, range, null, null, 54, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoCapture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        this.videoCapture = videoCapture;
        this.preview = preview;
        this.isSlowMotionEnabled = z;
        this.sessionType = 1;
        if (videoCapture.getMirrorMode() != 0) {
            throw new java.lang.IllegalArgumentException("VideoCapture.Builder.setMirrorMode() is not allowed for high-speed video.".toString());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(videoCapture.getTargetFrameRate(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            throw new java.lang.IllegalArgumentException("VideoCapture.Builder.setTargetFrameRate() is not allowed for high-speed video.".toString());
        }
        if (preview != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(preview.getTargetFrameRate(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                throw new java.lang.IllegalArgumentException("Preview.Builder.setTargetFrameRate() is not allowed for high-speed video.".toString());
            }
            androidx.camera.core.impl.UseCaseConfig<?> currentConfig = preview.getCurrentConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNull(currentConfig, "");
            androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) currentConfig;
            if (imageOutputConfig.getResolutionSelector(null) != null) {
                throw new java.lang.IllegalArgumentException("Preview.Builder.setResolutionSelector() is not allowed for high-speed video.".toString());
            }
            if (imageOutputConfig.getTargetResolution(null) != null) {
                throw new java.lang.IllegalArgumentException("Preview.Builder.setTargetResolution() is not allowed for high-speed video.".toString());
            }
            if (imageOutputConfig.hasTargetAspectRatio()) {
                throw new java.lang.IllegalArgumentException("Preview.Builder.setTargetAspectRatio() is not allowed for high-speed video.".toString());
            }
        }
        if (z) {
            java.lang.Object output = videoCapture.getOutput();
            kotlin.jvm.internal.Intrinsics.checkNotNull(output, "");
            ((androidx.camera.video.Recorder) output).setVideoEncodingFrameRate(30);
        }
    }

    @Override // androidx.camera.core.SessionConfig
    public final int getSessionType() {
        return this.sessionType;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;", "", "Landroidx/camera/video/VideoCapture;", "videoCapture", "<init>", "(Landroidx/camera/video/VideoCapture;)V", "Landroidx/camera/core/Preview;", "preview", "setPreview", "(Landroidx/camera/core/Preview;)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;", "", "enabled", "setSlowMotionEnabled", "(Z)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;", "Landroid/util/Range;", "", "frameRateRange", "setFrameRateRange", "(Landroid/util/Range;)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;", "Landroidx/camera/video/HighSpeedVideoSessionConfig;", "build", "()Landroidx/camera/video/HighSpeedVideoSessionConfig;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/video/VideoCapture;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/Preview;", "Landroid/util/Range;", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private android.util.Range<java.lang.Integer> Camera2StreamConfigurationMap;
        private androidx.camera.core.Preview getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.camera.video.VideoCapture<?> getHighResolutionOutputSizeshNQ4ISI;

        public Builder(androidx.camera.video.VideoCapture<?> videoCapture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoCapture, "");
            this.getHighResolutionOutputSizeshNQ4ISI = videoCapture;
            android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
            this.Camera2StreamConfigurationMap = range;
        }

        public final androidx.camera.video.HighSpeedVideoSessionConfig.Builder setPreview(androidx.camera.core.Preview preview) {
            this.getHighSpeedVideoFpsRanges = preview;
            return this;
        }

        public final androidx.camera.video.HighSpeedVideoSessionConfig.Builder setSlowMotionEnabled(boolean enabled) {
            this.getHighSpeedVideoSizes = enabled;
            return this;
        }

        public final androidx.camera.video.HighSpeedVideoSessionConfig.Builder setFrameRateRange(android.util.Range<java.lang.Integer> frameRateRange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameRateRange, "");
            this.Camera2StreamConfigurationMap = frameRateRange;
            return this;
        }

        public final androidx.camera.video.HighSpeedVideoSessionConfig build() {
            return new androidx.camera.video.HighSpeedVideoSessionConfig(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    @Override // androidx.camera.core.SessionConfig
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HighSpeedVideoSessionConfig@");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" {videoCapture=");
        sb.append(this.videoCapture);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", frameRateRange=");
        sb.append(getFrameRateRange());
        sb.append(", isSlowMotionEnabled=");
        sb.append(this.isSlowMotionEnabled);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(androidx.camera.video.VideoCapture<?> videoCapture, androidx.camera.core.Preview preview, android.util.Range<java.lang.Integer> range) {
        this(videoCapture, preview, range, false, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoCapture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(androidx.camera.video.VideoCapture<?> videoCapture, androidx.camera.core.Preview preview) {
        this(videoCapture, preview, null, false, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoCapture, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(androidx.camera.video.VideoCapture<?> videoCapture) {
        this(videoCapture, null, null, false, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoCapture, "");
    }
}
