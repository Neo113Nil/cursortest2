package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/decode/BlackholeDecoder;", "Lcoil3/decode/Decoder;", "Lkotlin/Function0;", "Lcoil3/Image;", "imageFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcoil3/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlackholeDecoder implements coil3.graphics.Decoder {
    private final kotlin.jvm.functions.Function0<coil3.Image> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public BlackholeDecoder(kotlin.jvm.functions.Function0<? extends coil3.Image> function0) {
        this.getHighSpeedVideoSizes = function0;
    }

    @Override // coil3.graphics.Decoder
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        return new coil3.graphics.DecodeResult(this.getHighSpeedVideoSizes.invoke(), false);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcoil3/decode/BlackholeDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlin/Function0;", "Lcoil3/Image;", "imageFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/BlackholeDecoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/BlackholeDecoder;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {
        public static final coil3.Image EMPTY_IMAGE = new coil3.ColorImage(0, 0, 0, 0, false, 30, null);
        private final kotlin.jvm.functions.Function0<coil3.Image> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(kotlin.jvm.functions.Function0<? extends coil3.Image> function0) {
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
        }

        public /* synthetic */ Factory(kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new kotlin.jvm.functions.Function0() { // from class: coil3.decode.BlackholeDecoder$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.Image image;
                    image = coil3.decode.BlackholeDecoder.Factory.EMPTY_IMAGE;
                    return image;
                }
            } : function0);
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.BlackholeDecoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            return new coil3.graphics.BlackholeDecoder(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
