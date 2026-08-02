package coil3.graphics.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcoil3/decode/ImageSource;", "source", "", "enforceMinimumFrameDelay", "maybeWrapImageSourceToRewriteFrameDelay", "(Lcoil3/decode/ImageSource;Z)Lcoil3/decode/ImageSource;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameDelayRewritingSourceKt {
    public static final coil3.graphics.ImageSource maybeWrapImageSourceToRewriteFrameDelay(coil3.graphics.ImageSource imageSource, boolean z) {
        return (z && coil3.graphics.DecodeUtilsKt.isGif(coil3.graphics.DecodeUtils.INSTANCE, imageSource.source())) ? coil3.graphics.ImageSourceKt.ImageSource$default(okio.Okio.buffer(new coil3.graphics.internal.FrameDelayRewritingSource(imageSource.source())), imageSource.getFileSystem(), null, 4, null) : imageSource;
    }
}
