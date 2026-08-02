package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcoil3/gif/GifDecoder;", "Lcoil3/decode/Decoder;", "Lcoil3/decode/ImageSource;", "source", "Lcoil3/request/Options;", "options", "", "enforceMinimumFrameDelay", "<init>", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Z)V", "Lcoil3/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcoil3/decode/ImageSource;", "Camera2StreamConfigurationMap", "Lcoil3/request/Options;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GifDecoder implements coil3.graphics.Decoder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.view.Options getHighResolutionOutputSizeshNQ4ISI;
    private final coil3.graphics.ImageSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    public GifDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z) {
        this.getHighSpeedVideoFpsRanges = imageSource;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
        this.getHighSpeedVideoSizes = z;
    }

    public /* synthetic */ GifDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }

    @Override // coil3.graphics.Decoder
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        return kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, new kotlin.jvm.functions.Function0() { // from class: coil3.gif.GifDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.graphics.DecodeResult highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = coil3.graphics.GifDecoder.getHighSpeedVideoFpsRanges(coil3.graphics.GifDecoder.this);
                return highSpeedVideoFpsRanges;
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil3.graphics.DecodeResult getHighSpeedVideoFpsRanges(coil3.graphics.GifDecoder gifDecoder) {
        android.graphics.Bitmap.Config bitmapConfig;
        coil3.graphics.ImageSource maybeWrapImageSourceToRewriteFrameDelay = coil3.graphics.internal.FrameDelayRewritingSourceKt.maybeWrapImageSourceToRewriteFrameDelay(gifDecoder.getHighSpeedVideoFpsRanges, gifDecoder.getHighSpeedVideoSizes);
        try {
            android.graphics.Movie decodeStream = android.graphics.Movie.decodeStream(maybeWrapImageSourceToRewriteFrameDelay.source().inputStream());
            kotlin.jdk7.AutoCloseableKt.closeFinally(maybeWrapImageSourceToRewriteFrameDelay, null);
            if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                throw new java.lang.IllegalStateException("Failed to decode GIF.".toString());
            }
            if (decodeStream.isOpaque() && coil3.view.ImageRequests_androidKt.getAllowRgb565(gifDecoder.getHighResolutionOutputSizeshNQ4ISI)) {
                bitmapConfig = android.graphics.Bitmap.Config.RGB_565;
            } else {
                bitmapConfig = coil3.content.Bitmap.isHardware(coil3.view.ImageRequests_androidKt.getBitmapConfig(gifDecoder.getHighResolutionOutputSizeshNQ4ISI)) ? android.graphics.Bitmap.Config.ARGB_8888 : coil3.view.ImageRequests_androidKt.getBitmapConfig(gifDecoder.getHighResolutionOutputSizeshNQ4ISI);
            }
            coil3.graphics.MovieDrawable movieDrawable = new coil3.graphics.MovieDrawable(decodeStream, bitmapConfig, gifDecoder.getHighResolutionOutputSizeshNQ4ISI.getScale());
            if (coil3.graphics.ImageRequestsKt.getRepeatCount(gifDecoder.getHighResolutionOutputSizeshNQ4ISI) != -2) {
                movieDrawable.setRepeatCount(coil3.graphics.ImageRequestsKt.getRepeatCount(gifDecoder.getHighResolutionOutputSizeshNQ4ISI));
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> animationStartCallback = coil3.graphics.ImageRequestsKt.getAnimationStartCallback(gifDecoder.getHighResolutionOutputSizeshNQ4ISI);
            kotlin.jvm.functions.Function0<kotlin.Unit> animationEndCallback = coil3.graphics.ImageRequestsKt.getAnimationEndCallback(gifDecoder.getHighResolutionOutputSizeshNQ4ISI);
            if (animationStartCallback != null || animationEndCallback != null) {
                movieDrawable.registerAnimationCallback(coil3.graphics.internal.UtilsKt.animatable2CompatCallbackOf(animationStartCallback, animationEndCallback));
            }
            movieDrawable.setAnimatedTransformation(coil3.graphics.ImageRequestsKt.getAnimatedTransformation(gifDecoder.getHighResolutionOutputSizeshNQ4ISI));
            return new coil3.graphics.DecodeResult(coil3.Image_androidKt.asImage(movieDrawable), false);
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcoil3/gif/GifDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "", "enforceMinimumFrameDelay", "<init>", "(Z)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/Decoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/Decoder;", "Z", "getEnforceMinimumFrameDelay", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {
        private final boolean enforceMinimumFrameDelay;

        public Factory(boolean z) {
            this.enforceMinimumFrameDelay = z;
        }

        public /* synthetic */ Factory(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean getEnforceMinimumFrameDelay() {
            return this.enforceMinimumFrameDelay;
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.Decoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (coil3.graphics.DecodeUtilsKt.isGif(coil3.graphics.DecodeUtils.INSTANCE, result.getSource().source())) {
                return new coil3.graphics.GifDecoder(result.getSource(), options, this.enforceMinimumFrameDelay);
            }
            return null;
        }

        public Factory() {
            this(false, 1, null);
        }
    }
}
