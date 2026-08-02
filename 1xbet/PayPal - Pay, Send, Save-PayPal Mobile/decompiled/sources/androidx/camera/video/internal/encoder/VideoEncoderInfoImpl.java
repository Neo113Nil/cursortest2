package androidx.camera.video.internal.encoder;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013"}, d2 = {"Landroidx/camera/video/internal/encoder/VideoEncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/EncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "Landroid/media/MediaCodecInfo;", "codecInfo", "", "mime", "<init>", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V", "", "canSwapWidthHeight", "()Z", "", "width", "height", "isSizeSupported", "(II)Z", "Landroid/util/Range;", "getSupportedWidths", "()Landroid/util/Range;", "getSupportedHeights", "getSupportedWidthsFor", "(I)Landroid/util/Range;", "getSupportedHeightsFor", "Landroid/media/MediaCodecInfo$VideoCapabilities;", "Camera2StreamConfigurationMap", "Landroid/media/MediaCodecInfo$VideoCapabilities;", "getHighResolutionOutputSizeshNQ4ISI", "getWidthAlignment", "()I", "widthAlignment", "getHeightAlignment", "heightAlignment", "getSupportedBitrateRange", "supportedBitrateRange", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoEncoderInfoImpl extends androidx.camera.video.internal.encoder.EncoderInfoImpl implements androidx.camera.video.internal.encoder.VideoEncoderInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.Companion INSTANCE = new androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.Companion(null);
    public static final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder FINDER = new androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder() { // from class: androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0
        @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder
        public final androidx.camera.video.internal.encoder.VideoEncoderInfo find(java.lang.String str) {
            androidx.camera.video.internal.encoder.VideoEncoderInfo highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.getHighSpeedVideoFpsRanges(str);
            return highSpeedVideoFpsRanges;
        }
    };

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.media.MediaCodecInfo.VideoCapabilities getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEncoderInfoImpl(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        super(mediaCodecInfo, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCodecInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = getCodecCapabilities().getVideoCapabilities();
        kotlin.jvm.internal.Intrinsics.checkNotNull(videoCapabilities);
        this.getHighResolutionOutputSizeshNQ4ISI = videoCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int width, int height) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isSizeSupported(width, height);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidths() {
        android.util.Range<java.lang.Integer> supportedWidths = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedWidths();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedWidths, "");
        return supportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeights() {
        android.util.Range<java.lang.Integer> supportedHeights = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedHeights();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedHeights, "");
        return supportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidthsFor(int height) {
        try {
            android.util.Range<java.lang.Integer> supportedWidthsFor = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedWidthsFor(height);
            kotlin.jvm.internal.Intrinsics.checkNotNull(supportedWidthsFor);
            return supportedWidthsFor;
        } catch (java.lang.Throwable th) {
            throw androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.Companion.access$toIllegalArgumentException(INSTANCE, th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeightsFor(int width) {
        try {
            android.util.Range<java.lang.Integer> supportedHeightsFor = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedHeightsFor(width);
            kotlin.jvm.internal.Intrinsics.checkNotNull(supportedHeightsFor);
            return supportedHeightsFor;
        } catch (java.lang.Throwable th) {
            throw androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.Companion.access$toIllegalArgumentException(INSTANCE, th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedBitrateRange() {
        android.util.Range<java.lang.Integer> bitrateRange = this.getHighResolutionOutputSizeshNQ4ISI.getBitrateRange();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitrateRange, "");
        return bitrateRange;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/video/internal/encoder/VideoEncoderInfoImpl$Companion;", "", "<init>", "()V", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "FINDER", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.IllegalArgumentException access$toIllegalArgumentException(androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.Companion companion, java.lang.Throwable th) {
            java.lang.IllegalArgumentException illegalArgumentException = th instanceof java.lang.IllegalArgumentException ? (java.lang.IllegalArgumentException) th : null;
            return illegalArgumentException == null ? new java.lang.IllegalArgumentException(th) : illegalArgumentException;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.camera.video.internal.encoder.VideoEncoderInfo getHighSpeedVideoFpsRanges(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.INSTANCE.from(new androidx.camera.video.internal.encoder.VideoEncoderInfoImpl(androidx.camera.video.internal.utils.CodecUtil.findCodecAndGetCodecInfo(str), str), null);
        } catch (androidx.camera.video.internal.encoder.InvalidConfigException e) {
            androidx.camera.core.Logger.w("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
            return null;
        }
    }
}
