package androidx.camera.video.internal.encoder;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u000e"}, d2 = {"Landroidx/camera/video/internal/encoder/SwappedVideoEncoderInfo;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "videoEncoderInfo", "<init>", "(Landroidx/camera/video/internal/encoder/VideoEncoderInfo;)V", "", "width", "height", "", "isSizeSupported", "(II)Z", "isSizeSupportedAllowSwapping", "Landroid/util/Range;", "getSupportedWidths", "()Landroid/util/Range;", "getSupportedHeights", "getSupportedWidthsFor", "(I)Landroid/util/Range;", "getSupportedHeightsFor", "canSwapWidthHeight", "()Z", "", "getName", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "getHighSpeedVideoFpsRanges", "getWidthAlignment", "()I", "widthAlignment", "getHeightAlignment", "heightAlignment", "getSupportedBitrateRange", "supportedBitrateRange"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwappedVideoEncoderInfo implements androidx.camera.video.internal.encoder.VideoEncoderInfo {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo getHighSpeedVideoFpsRanges;

    public SwappedVideoEncoderInfo(androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEncoderInfo, "");
        this.getHighSpeedVideoFpsRanges = videoEncoderInfo;
        if (!videoEncoderInfo.canSwapWidthHeight()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int width, int height) {
        return this.getHighSpeedVideoFpsRanges.isSizeSupported(height, width);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupportedAllowSwapping(int width, int height) {
        return this.getHighSpeedVideoFpsRanges.isSizeSupportedAllowSwapping(height, width);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidths() {
        return this.getHighSpeedVideoFpsRanges.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeights() {
        return this.getHighSpeedVideoFpsRanges.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidthsFor(int height) {
        return this.getHighSpeedVideoFpsRanges.getSupportedHeightsFor(height);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeightsFor(int width) {
        return this.getHighSpeedVideoFpsRanges.getSupportedWidthsFor(width);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.getHighSpeedVideoFpsRanges.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.getHighSpeedVideoFpsRanges.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedBitrateRange() {
        return this.getHighSpeedVideoFpsRanges.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public final java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.getHighSpeedVideoFpsRanges.canSwapWidthHeight();
    }
}
