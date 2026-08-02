package coil3.graphics.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcoil3/gif/internal/GifDecoderServiceLoaderTarget;", "Lcoil3/util/DecoderServiceLoaderTarget;", "<init>", "()V", "Lcoil3/decode/Decoder$Factory;", "factory", "()Lcoil3/decode/Decoder$Factory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GifDecoderServiceLoaderTarget implements coil3.content.DecoderServiceLoaderTarget {
    @Override // coil3.content.DecoderServiceLoaderTarget
    public final coil3.decode.Decoder.Factory factory() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new coil3.gif.AnimatedImageDecoder.Factory(false, 1, null);
        }
        return new coil3.gif.GifDecoder.Factory(false, 1, null);
    }
}
