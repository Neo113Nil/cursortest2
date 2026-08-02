package coil3.svg.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcoil3/svg/internal/SvgDecoderServiceLoaderTarget;", "Lcoil3/util/DecoderServiceLoaderTarget;", "<init>", "()V", "Lcoil3/svg/SvgDecoder$Factory;", "factory", "()Lcoil3/svg/SvgDecoder$Factory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SvgDecoderServiceLoaderTarget implements coil3.content.DecoderServiceLoaderTarget {
    @Override // coil3.content.DecoderServiceLoaderTarget
    public final coil3.svg.SvgDecoder.Factory factory() {
        return new coil3.svg.SvgDecoder.Factory(false, false, false, 7, null);
    }
}
