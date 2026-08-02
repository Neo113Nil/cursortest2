package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcoil3/decode/StaticImageDecoder;", "Lcoil3/decode/Decoder;", "source", "Landroid/graphics/ImageDecoder$Source;", "closeable", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "options", "Lcoil3/request/Options;", "parallelismLock", "Lkotlinx/coroutines/sync/Semaphore;", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lcoil3/request/Options;Lkotlinx/coroutines/sync/Semaphore;)V", "decode", "Lcoil3/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureImageDecoderProperties", "", "Landroid/graphics/ImageDecoder;", "Factory", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StaticImageDecoder implements coil3.graphics.Decoder {
    private final java.lang.AutoCloseable Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.sync.Semaphore getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.ImageDecoder.Source getHighSpeedVideoFpsRanges;
    private final coil3.view.Options getHighSpeedVideoSizes;

    /* renamed from: $r8$lambda$7fBz_v-dyQP3HQjAYhSvcgIv47A, reason: not valid java name */
    public static /* synthetic */ boolean m9771$r8$lambda$7fBz_vdyQP3HQjAYhSvcgIv47A(android.graphics.ImageDecoder.DecodeException decodeException) {
        return true;
    }

    public StaticImageDecoder(android.graphics.ImageDecoder.Source source, java.lang.AutoCloseable autoCloseable, coil3.view.Options options, kotlinx.coroutines.sync.Semaphore semaphore) {
        this.getHighSpeedVideoFpsRanges = source;
        this.Camera2StreamConfigurationMap = autoCloseable;
        this.getHighSpeedVideoSizes = options;
        this.getHighResolutionOutputSizeshNQ4ISI = semaphore;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil3.graphics.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        coil3.graphics.StaticImageDecoder$decode$1 staticImageDecoder$decode$1;
        int i;
        kotlinx.coroutines.sync.Semaphore semaphore;
        try {
            try {
                if (continuation instanceof coil3.graphics.StaticImageDecoder$decode$1) {
                    staticImageDecoder$decode$1 = (coil3.graphics.StaticImageDecoder$decode$1) continuation;
                    if ((staticImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        staticImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = staticImageDecoder$decode$1.getHighSpeedVideoSizes;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = staticImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.sync.Semaphore semaphore2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            staticImageDecoder$decode$1.getHighSpeedVideoFpsRanges = semaphore2;
                            staticImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (semaphore2.acquire(staticImageDecoder$decode$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            semaphore = semaphore2;
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            semaphore = (kotlinx.coroutines.sync.Semaphore) staticImageDecoder$decode$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        java.lang.AutoCloseable autoCloseable = this.Camera2StreamConfigurationMap;
                        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                        coil3.graphics.DecodeResult decodeResult = new coil3.graphics.DecodeResult(coil3.Image_androidKt.asImage$default(android.graphics.ImageDecoder.decodeBitmap(this.getHighSpeedVideoFpsRanges, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1
                            /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
                            
                                if (r2.getPrecision() == coil3.view.Precision.EXACT) goto L15;
                             */
                            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                                coil3.view.Options options;
                                coil3.view.Options options2;
                                coil3.view.Options options3;
                                coil3.view.Options options4;
                                coil3.view.Options options5;
                                coil3.view.Options options6;
                                android.util.Size size = imageInfo.getSize();
                                int width = size.getWidth();
                                int height = size.getHeight();
                                options = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                coil3.view.Size size2 = options.getSize();
                                options2 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                coil3.view.Scale scale = options2.getScale();
                                options3 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(width, height, size2, scale, coil3.view.ImageRequestsKt.getMaxBitmapSize(options3));
                                int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o);
                                int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o);
                                if (width > 0 && height > 0 && (width != m9814getFirstimpl || height != m9815getSecondimpl)) {
                                    options4 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                    coil3.view.Scale scale2 = options4.getScale();
                                    options5 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                    double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width, height, m9814getFirstimpl, m9815getSecondimpl, scale2, coil3.view.ImageRequestsKt.getMaxBitmapSize(options5));
                                    booleanRef.element = computeSizeMultiplier < 1.0d;
                                    if (!booleanRef.element) {
                                        options6 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                                    }
                                    imageDecoder.setTargetSize(kotlin.math.MathKt.roundToInt(width * computeSizeMultiplier), kotlin.math.MathKt.roundToInt(computeSizeMultiplier * height));
                                }
                                coil3.graphics.StaticImageDecoder.this.dK_(imageDecoder);
                            }
                        }), false, 1, null), booleanRef.element);
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                        return decodeResult;
                    }
                }
                final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                coil3.graphics.DecodeResult decodeResult2 = new coil3.graphics.DecodeResult(coil3.Image_androidKt.asImage$default(android.graphics.ImageDecoder.decodeBitmap(this.getHighSpeedVideoFpsRanges, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
                    
                        if (r2.getPrecision() == coil3.view.Precision.EXACT) goto L15;
                     */
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                        coil3.view.Options options;
                        coil3.view.Options options2;
                        coil3.view.Options options3;
                        coil3.view.Options options4;
                        coil3.view.Options options5;
                        coil3.view.Options options6;
                        android.util.Size size = imageInfo.getSize();
                        int width = size.getWidth();
                        int height = size.getHeight();
                        options = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                        coil3.view.Size size2 = options.getSize();
                        options2 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                        coil3.view.Scale scale = options2.getScale();
                        options3 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                        long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(width, height, size2, scale, coil3.view.ImageRequestsKt.getMaxBitmapSize(options3));
                        int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o);
                        int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o);
                        if (width > 0 && height > 0 && (width != m9814getFirstimpl || height != m9815getSecondimpl)) {
                            options4 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                            coil3.view.Scale scale2 = options4.getScale();
                            options5 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                            double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width, height, m9814getFirstimpl, m9815getSecondimpl, scale2, coil3.view.ImageRequestsKt.getMaxBitmapSize(options5));
                            booleanRef2.element = computeSizeMultiplier < 1.0d;
                            if (!booleanRef2.element) {
                                options6 = coil3.graphics.StaticImageDecoder.this.getHighSpeedVideoSizes;
                            }
                            imageDecoder.setTargetSize(kotlin.math.MathKt.roundToInt(width * computeSizeMultiplier), kotlin.math.MathKt.roundToInt(computeSizeMultiplier * height));
                        }
                        coil3.graphics.StaticImageDecoder.this.dK_(imageDecoder);
                    }
                }), false, 1, null), booleanRef2.element);
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return decodeResult2;
            } finally {
            }
            java.lang.AutoCloseable autoCloseable2 = this.Camera2StreamConfigurationMap;
        } finally {
            semaphore.release();
        }
        staticImageDecoder$decode$1 = new coil3.graphics.StaticImageDecoder$decode$1(this, continuation);
        java.lang.Object obj2 = staticImageDecoder$decode$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = staticImageDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dK_(android.graphics.ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new android.graphics.ImageDecoder.OnPartialImageListener() { // from class: coil3.decode.StaticImageDecoder$$ExternalSyntheticLambda0
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(android.graphics.ImageDecoder.DecodeException decodeException) {
                return coil3.graphics.StaticImageDecoder.m9771$r8$lambda$7fBz_vdyQP3HQjAYhSvcgIv47A(decodeException);
            }
        });
        imageDecoder.setAllocator(coil3.content.Bitmap.isHardware(coil3.view.ImageRequests_androidKt.getBitmapConfig(this.getHighSpeedVideoSizes)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!coil3.view.ImageRequests_androidKt.getAllowRgb565(this.getHighSpeedVideoSizes) ? 1 : 0);
        if (coil3.view.ImageRequests_androidKt.getColorSpace(this.getHighSpeedVideoSizes) != null) {
            imageDecoder.setTargetColorSpace(coil3.view.ImageRequests_androidKt.getColorSpace(this.getHighSpeedVideoSizes));
        }
        imageDecoder.setUnpremultipliedRequired(!coil3.view.ImageRequests_androidKt.getPremultipliedAlpha(this.getHighSpeedVideoSizes));
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcoil3/decode/StaticImageDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/Decoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/Decoder;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcoil3/request/Options;)Z", "Lkotlinx/coroutines/sync/Semaphore;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.sync.Semaphore getHighResolutionOutputSizeshNQ4ISI;

        public Factory(kotlinx.coroutines.sync.Semaphore semaphore) {
            this.getHighResolutionOutputSizeshNQ4ISI = semaphore;
        }

        public /* synthetic */ Factory(kotlinx.coroutines.sync.Semaphore semaphore, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(4, 0, 2, null) : semaphore);
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.Decoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            android.graphics.ImageDecoder.Source imageDecoderSourceOrNull;
            if (getHighSpeedVideoFpsRanges(options) && (imageDecoderSourceOrNull = coil3.graphics.StaticImageDecoderKt.toImageDecoderSourceOrNull(result.getSource(), options, false)) != null) {
                return new coil3.graphics.StaticImageDecoder(imageDecoderSourceOrNull, result.getSource(), options, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return null;
        }

        private static boolean getHighSpeedVideoFpsRanges(coil3.view.Options p0) {
            android.graphics.Bitmap.Config bitmapConfig = coil3.view.ImageRequests_androidKt.getBitmapConfig(p0);
            return bitmapConfig == android.graphics.Bitmap.Config.ARGB_8888 || bitmapConfig == android.graphics.Bitmap.Config.HARDWARE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
