package androidx.camera.video.internal.encoder;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001:\u0001\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "Landroidx/camera/video/internal/encoder/EncoderInfo;", "", "canSwapWidthHeight", "()Z", "", "width", "height", "isSizeSupported", "(II)Z", "isSizeSupportedAllowSwapping", "Landroid/util/Range;", "getSupportedWidths", "()Landroid/util/Range;", "getSupportedHeights", "getSupportedWidthsFor", "(I)Landroid/util/Range;", "getSupportedHeightsFor", "getWidthAlignment", "()I", "widthAlignment", "getHeightAlignment", "heightAlignment", "getSupportedBitrateRange", "supportedBitrateRange", "Finder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VideoEncoderInfo extends androidx.camera.video.internal.encoder.EncoderInfo {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "find", "(Ljava/lang/String;)Landroidx/camera/video/internal/encoder/VideoEncoderInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Finder {
        androidx.camera.video.internal.encoder.VideoEncoderInfo find(java.lang.String mimeType);
    }

    boolean canSwapWidthHeight();

    int getHeightAlignment();

    android.util.Range<java.lang.Integer> getSupportedBitrateRange();

    android.util.Range<java.lang.Integer> getSupportedHeights();

    android.util.Range<java.lang.Integer> getSupportedHeightsFor(int width);

    android.util.Range<java.lang.Integer> getSupportedWidths();

    android.util.Range<java.lang.Integer> getSupportedWidthsFor(int height);

    int getWidthAlignment();

    boolean isSizeSupported(int width, int height);

    default boolean isSizeSupportedAllowSwapping(int width, int height) {
        if (isSizeSupported(width, height)) {
            return true;
        }
        return canSwapWidthHeight() && isSizeSupported(height, width);
    }
}
