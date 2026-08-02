package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcoil3/gif/AnimatedImageDecoder;", "Lcoil3/decode/Decoder;", "Lcoil3/decode/ImageSource;", "source", "Lcoil3/request/Options;", "options", "", "enforceMinimumFrameDelay", "<init>", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Z)V", "Lcoil3/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/drawable/Drawable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcoil3/decode/ImageSource;", "getHighSpeedVideoFpsRanges", "Lcoil3/request/Options;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Companion", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnimatedImageDecoder implements coil3.graphics.Decoder {
    public static final int ENCODED_LOOP_COUNT = -2;
    private final coil3.graphics.ImageSource Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.view.Options getHighResolutionOutputSizeshNQ4ISI;

    public AnimatedImageDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z) {
        this.Camera2StreamConfigurationMap = imageSource;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
        this.getHighSpeedVideoSizes = z;
    }

    public /* synthetic */ AnimatedImageDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? android.os.Build.VERSION.SDK_INT < 34 : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // coil3.graphics.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        coil3.graphics.AnimatedImageDecoder$decode$1 animatedImageDecoder$decode$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        if (continuation instanceof coil3.graphics.AnimatedImageDecoder$decode$1) {
            animatedImageDecoder$decode$1 = (coil3.graphics.AnimatedImageDecoder$decode$1) continuation;
            if ((animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = animatedImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: coil3.gif.AnimatedImageDecoder$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = coil3.graphics.AnimatedImageDecoder.Camera2StreamConfigurationMap(coil3.graphics.AnimatedImageDecoder.this, booleanRef3);
                            return Camera2StreamConfigurationMap;
                        }
                    };
                    animatedImageDecoder$decode$1.Camera2StreamConfigurationMap = booleanRef3;
                    animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object runInterruptible$default = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, function0, animatedImageDecoder$decode$1, 1, null);
                    if (runInterruptible$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef3;
                    obj = runInterruptible$default;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) animatedImageDecoder$decode$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new coil3.graphics.DecodeResult(coil3.Image_androidKt.asImage((android.graphics.drawable.Drawable) obj), booleanRef2.element);
                    }
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) animatedImageDecoder$decode$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                animatedImageDecoder$decode$1.Camera2StreamConfigurationMap = booleanRef;
                animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges = 2;
                obj = getHighSpeedVideoFpsRangesFor((android.graphics.drawable.Drawable) obj, animatedImageDecoder$decode$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef2 = booleanRef;
                return new coil3.graphics.DecodeResult(coil3.Image_androidKt.asImage((android.graphics.drawable.Drawable) obj), booleanRef2.element);
            }
        }
        animatedImageDecoder$decode$1 = new coil3.graphics.AnimatedImageDecoder$decode$1(this, continuation);
        obj = animatedImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        animatedImageDecoder$decode$1.Camera2StreamConfigurationMap = booleanRef;
        animatedImageDecoder$decode$1.getHighSpeedVideoFpsRanges = 2;
        obj = getHighSpeedVideoFpsRangesFor((android.graphics.drawable.Drawable) obj, animatedImageDecoder$decode$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.drawable.Drawable Camera2StreamConfigurationMap(final coil3.graphics.AnimatedImageDecoder animatedImageDecoder, final kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        coil3.graphics.ImageSource maybeWrapImageSourceToRewriteFrameDelay = coil3.graphics.internal.FrameDelayRewritingSourceKt.maybeWrapImageSourceToRewriteFrameDelay(animatedImageDecoder.Camera2StreamConfigurationMap, animatedImageDecoder.getHighSpeedVideoSizes);
        try {
            coil3.graphics.ImageSource imageSource = maybeWrapImageSourceToRewriteFrameDelay;
            android.graphics.ImageDecoder.Source imageDecoderSourceOrNull = coil3.graphics.StaticImageDecoderKt.toImageDecoderSourceOrNull(imageSource, animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI, true);
            if (imageDecoderSourceOrNull == null) {
                okio.BufferedSource source = imageSource.source();
                try {
                    java.nio.ByteBuffer squashToDirectByteBuffer = coil3.graphics.internal.UtilsKt.squashToDirectByteBuffer(source);
                    kotlin.io.CloseableKt.closeFinally(source, null);
                    imageDecoderSourceOrNull = android.graphics.ImageDecoder.createSource(squashToDirectByteBuffer);
                } finally {
                }
            }
            android.graphics.drawable.Drawable decodeDrawable = android.graphics.ImageDecoder.decodeDrawable(imageDecoderSourceOrNull, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.gif.AnimatedImageDecoder$decode$lambda$0$0$$inlined$decodeDrawable$1
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
                
                    if (r2.getPrecision() == coil3.view.Precision.EXACT) goto L15;
                 */
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                    coil3.view.Options options;
                    coil3.view.Options options2;
                    coil3.view.Options options3;
                    coil3.view.Options options4;
                    coil3.view.Options options5;
                    coil3.view.Options options6;
                    android.util.Size size = imageInfo.getSize();
                    int width = size.getWidth();
                    int height = size.getHeight();
                    options = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                    coil3.view.Size size2 = options.getSize();
                    options2 = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                    coil3.view.Scale scale = options2.getScale();
                    options3 = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                    long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(width, height, size2, scale, coil3.view.ImageRequestsKt.getMaxBitmapSize(options3));
                    int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o);
                    int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o);
                    if (width > 0 && height > 0 && (width != m9814getFirstimpl || height != m9815getSecondimpl)) {
                        options4 = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                        coil3.view.Scale scale2 = options4.getScale();
                        options5 = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                        double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width, height, m9814getFirstimpl, m9815getSecondimpl, scale2, coil3.view.ImageRequestsKt.getMaxBitmapSize(options5));
                        booleanRef.element = computeSizeMultiplier < 1.0d;
                        if (!booleanRef.element) {
                            options6 = coil3.graphics.AnimatedImageDecoder.this.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        imageDecoder.setTargetSize(kotlin.math.MathKt.roundToInt(width * computeSizeMultiplier), kotlin.math.MathKt.roundToInt(computeSizeMultiplier * height));
                    }
                    coil3.graphics.AnimatedImageDecoder.access$configureImageDecoderProperties(coil3.graphics.AnimatedImageDecoder.this, imageDecoder);
                }
            });
            kotlin.jdk7.AutoCloseableKt.closeFinally(maybeWrapImageSourceToRewriteFrameDelay, null);
            return decodeDrawable;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable drawable, kotlin.coroutines.Continuation<? super android.graphics.drawable.Drawable> continuation) {
        coil3.graphics.AnimatedImageDecoder$wrapDrawable$1 animatedImageDecoder$wrapDrawable$1;
        int i;
        if (continuation instanceof coil3.graphics.AnimatedImageDecoder$wrapDrawable$1) {
            animatedImageDecoder$wrapDrawable$1 = (coil3.graphics.AnimatedImageDecoder$wrapDrawable$1) continuation;
            if ((animatedImageDecoder$wrapDrawable$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                animatedImageDecoder$wrapDrawable$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = animatedImageDecoder$wrapDrawable$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = animatedImageDecoder$wrapDrawable$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
                        return drawable;
                    }
                    if (coil3.graphics.ImageRequestsKt.getRepeatCount(this.getHighResolutionOutputSizeshNQ4ISI) != -2) {
                        ((android.graphics.drawable.AnimatedImageDrawable) drawable).setRepeatCount(coil3.graphics.ImageRequestsKt.getRepeatCount(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> animationStartCallback = coil3.graphics.ImageRequestsKt.getAnimationStartCallback(this.getHighResolutionOutputSizeshNQ4ISI);
                    kotlin.jvm.functions.Function0<kotlin.Unit> animationEndCallback = coil3.graphics.ImageRequestsKt.getAnimationEndCallback(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (animationStartCallback != null || animationEndCallback != null) {
                        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
                        coil3.graphics.AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new coil3.graphics.AnimatedImageDecoder$wrapDrawable$2(drawable, animationStartCallback, animationEndCallback, null);
                        animatedImageDecoder$wrapDrawable$1.getHighResolutionOutputSizeshNQ4ISI = drawable;
                        animatedImageDecoder$wrapDrawable$1.Camera2StreamConfigurationMap = 1;
                        if (kotlinx.coroutines.BuildersKt.withContext(immediate, animatedImageDecoder$wrapDrawable$2, animatedImageDecoder$wrapDrawable$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    drawable = (android.graphics.drawable.Drawable) animatedImageDecoder$wrapDrawable$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new coil3.view.ScaleDrawable(drawable, this.getHighResolutionOutputSizeshNQ4ISI.getScale());
            }
        }
        animatedImageDecoder$wrapDrawable$1 = new coil3.graphics.AnimatedImageDecoder$wrapDrawable$1(this, continuation);
        java.lang.Object obj2 = animatedImageDecoder$wrapDrawable$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = animatedImageDecoder$wrapDrawable$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new coil3.view.ScaleDrawable(drawable, this.getHighResolutionOutputSizeshNQ4ISI.getScale());
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcoil3/gif/AnimatedImageDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "", "enforceMinimumFrameDelay", "<init>", "(Z)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/Decoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/Decoder;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        public Factory(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        public /* synthetic */ Factory(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? android.os.Build.VERSION.SDK_INT < 34 : z);
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.Decoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            okio.BufferedSource source = result.getSource().source();
            if (coil3.graphics.DecodeUtilsKt.isGif(coil3.graphics.DecodeUtils.INSTANCE, source) || coil3.graphics.DecodeUtilsKt.isAnimatedWebP(coil3.graphics.DecodeUtils.INSTANCE, source) || (android.os.Build.VERSION.SDK_INT >= 30 && coil3.graphics.DecodeUtilsKt.isAnimatedHeif(coil3.graphics.DecodeUtils.INSTANCE, source))) {
                return new coil3.graphics.AnimatedImageDecoder(result.getSource(), options, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return null;
        }

        public Factory() {
            this(false, 1, null);
        }
    }

    public static final /* synthetic */ void access$configureImageDecoderProperties(coil3.graphics.AnimatedImageDecoder animatedImageDecoder, android.graphics.ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(coil3.content.Bitmap.isHardware(coil3.view.ImageRequests_androidKt.getBitmapConfig(animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!coil3.view.ImageRequests_androidKt.getAllowRgb565(animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI) ? 1 : 0);
        if (coil3.view.ImageRequests_androidKt.getColorSpace(animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI) != null) {
            imageDecoder.setTargetColorSpace(coil3.view.ImageRequests_androidKt.getColorSpace(animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI));
        }
        coil3.graphics.AnimatedTransformation animatedTransformation = coil3.graphics.ImageRequestsKt.getAnimatedTransformation(animatedImageDecoder.getHighResolutionOutputSizeshNQ4ISI);
        imageDecoder.setPostProcessor(animatedTransformation != null ? coil3.graphics.internal.UtilsKt.asPostProcessor(animatedTransformation) : null);
    }
}
