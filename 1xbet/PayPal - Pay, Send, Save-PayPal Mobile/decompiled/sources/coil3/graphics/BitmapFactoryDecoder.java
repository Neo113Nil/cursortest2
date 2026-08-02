package coil3.graphics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001aB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder;", "Lcoil3/decode/Decoder;", "Lcoil3/decode/ImageSource;", "source", "Lcoil3/request/Options;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil3/decode/ExifOrientationStrategy;", "exifOrientationStrategy", "<init>", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Lkotlinx/coroutines/sync/Semaphore;Lcoil3/decode/ExifOrientationStrategy;)V", "Lcoil3/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/BitmapFactory$Options;)Lcoil3/decode/DecodeResult;", "Lcoil3/decode/ImageSource;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcoil3/request/Options;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Semaphore;", "Lcoil3/decode/ExifOrientationStrategy;", "Companion", "Factory", "ExceptionCatchingSource"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements coil3.graphics.Decoder {
    public static final int DEFAULT_MAX_PARALLELISM = 4;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Semaphore getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.graphics.ImageSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final coil3.graphics.ExifOrientationStrategy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.view.Options getHighSpeedVideoFpsRangesFor;

    public BitmapFactoryDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, kotlinx.coroutines.sync.Semaphore semaphore, coil3.graphics.ExifOrientationStrategy exifOrientationStrategy) {
        this.getHighSpeedVideoFpsRanges = imageSource;
        this.getHighSpeedVideoFpsRangesFor = options;
        this.getHighSpeedVideoSizes = semaphore;
        this.getHighResolutionOutputSizeshNQ4ISI = exifOrientationStrategy;
    }

    public /* synthetic */ BitmapFactoryDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, kotlinx.coroutines.sync.Semaphore semaphore, coil3.graphics.ExifOrientationStrategy exifOrientationStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore, (i & 8) != 0 ? coil3.graphics.ExifOrientationStrategy.RESPECT_PERFORMANCE : exifOrientationStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r7.acquire(r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // coil3.graphics.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        coil3.graphics.BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Semaphore semaphore;
        java.lang.Object runInterruptible$default;
        kotlinx.coroutines.sync.Semaphore semaphore2;
        try {
            if (continuation instanceof coil3.graphics.BitmapFactoryDecoder$decode$1) {
                bitmapFactoryDecoder$decode$1 = (coil3.graphics.BitmapFactoryDecoder$decode$1) continuation;
                if ((bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRangesFor;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphore = this.getHighSpeedVideoSizes;
                        bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRanges = semaphore;
                        bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            semaphore2 = (kotlinx.coroutines.sync.Semaphore) bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                coil3.graphics.DecodeResult decodeResult = (coil3.graphics.DecodeResult) obj;
                                semaphore2.release();
                                return decodeResult;
                            } catch (java.lang.Throwable th) {
                                kotlinx.coroutines.sync.Semaphore semaphore3 = semaphore2;
                                th = th;
                                semaphore = semaphore3;
                                semaphore.release();
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Semaphore semaphore4 = (kotlinx.coroutines.sync.Semaphore) bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphore = semaphore4;
                    }
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: coil3.decode.BitmapFactoryDecoder$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            coil3.graphics.DecodeResult highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = coil3.graphics.BitmapFactoryDecoder.this.getHighResolutionOutputSizeshNQ4ISI(new android.graphics.BitmapFactory.Options());
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRanges = semaphore;
                    bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    runInterruptible$default = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, function0, bitmapFactoryDecoder$decode$1, 1, null);
                    if (runInterruptible$default != coroutine_suspended) {
                        semaphore2 = semaphore;
                        obj = runInterruptible$default;
                        coil3.graphics.DecodeResult decodeResult2 = (coil3.graphics.DecodeResult) obj;
                        semaphore2.release();
                        return decodeResult2;
                    }
                    return coroutine_suspended;
                }
            }
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: coil3.decode.BitmapFactoryDecoder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.graphics.DecodeResult highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = coil3.graphics.BitmapFactoryDecoder.this.getHighResolutionOutputSizeshNQ4ISI(new android.graphics.BitmapFactory.Options());
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRanges = semaphore;
            bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            runInterruptible$default = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, function02, bitmapFactoryDecoder$decode$1, 1, null);
            if (runInterruptible$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            semaphore.release();
            throw th;
        }
        bitmapFactoryDecoder$decode$1 = new coil3.graphics.BitmapFactoryDecoder$decode$1(this, continuation);
        java.lang.Object obj2 = bitmapFactoryDecoder$decode$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bitmapFactoryDecoder$decode$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final coil3.graphics.DecodeResult getHighResolutionOutputSizeshNQ4ISI(android.graphics.BitmapFactory.Options options) {
        coil3.graphics.ExifData exifData;
        coil3.decode.BitmapFactoryDecoder.ExceptionCatchingSource exceptionCatchingSource = new coil3.decode.BitmapFactoryDecoder.ExceptionCatchingSource(this.getHighSpeedVideoFpsRanges.source());
        okio.BufferedSource buffer = okio.Okio.buffer(exceptionCatchingSource);
        boolean z = true;
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(buffer.peek().inputStream(), null, options);
        java.lang.Exception exc = exceptionCatchingSource.getHighSpeedVideoFpsRanges;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        coil3.graphics.ExifData exifData2 = coil3.graphics.ExifUtils.INSTANCE.getExifData(options.outMimeType, buffer, this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.Exception exc2 = exceptionCatchingSource.getHighSpeedVideoFpsRanges;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        if (coil3.view.ImageRequests_androidKt.getColorSpace(this.getHighSpeedVideoFpsRangesFor) != null) {
            options.inPreferredColorSpace = coil3.view.ImageRequests_androidKt.getColorSpace(this.getHighSpeedVideoFpsRangesFor);
        }
        options.inPremultiplied = coil3.view.ImageRequests_androidKt.getPremultipliedAlpha(this.getHighSpeedVideoFpsRangesFor);
        android.graphics.Bitmap.Config bitmapConfig = coil3.view.ImageRequests_androidKt.getBitmapConfig(this.getHighSpeedVideoFpsRangesFor);
        if (exifData2.getIsFlipped() || coil3.graphics.ExifUtilsKt.isRotated(exifData2)) {
            bitmapConfig = coil3.content.Bitmap.toSoftware(bitmapConfig);
        }
        if (coil3.view.ImageRequests_androidKt.getAllowRgb565(this.getHighSpeedVideoFpsRangesFor) && bitmapConfig == android.graphics.Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            bitmapConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        if (options.outConfig == android.graphics.Bitmap.Config.RGBA_F16 && bitmapConfig != android.graphics.Bitmap.Config.HARDWARE) {
            bitmapConfig = android.graphics.Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = bitmapConfig;
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            exifData = exifData2;
            options.inSampleSize = 1;
            options.inScaled = false;
        } else {
            int i = coil3.graphics.ExifUtilsKt.isSwapped(exifData2) ? options.outHeight : options.outWidth;
            int i2 = coil3.graphics.ExifUtilsKt.isSwapped(exifData2) ? options.outWidth : options.outHeight;
            long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(i, i2, this.getHighSpeedVideoFpsRangesFor.getSize(), this.getHighSpeedVideoFpsRangesFor.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(this.getHighSpeedVideoFpsRangesFor));
            int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o);
            int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o);
            options.inSampleSize = coil3.graphics.DecodeUtils.calculateInSampleSize(i, i2, m9814getFirstimpl, m9815getSecondimpl, this.getHighSpeedVideoFpsRangesFor.getScale());
            exifData = exifData2;
            double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(i / options.inSampleSize, i2 / options.inSampleSize, m9814getFirstimpl, m9815getSecondimpl, this.getHighSpeedVideoFpsRangesFor.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(this.getHighSpeedVideoFpsRangesFor));
            if (this.getHighSpeedVideoFpsRangesFor.getPrecision() == coil3.view.Precision.INEXACT) {
                computeSizeMultiplier = kotlin.ranges.RangesKt.coerceAtMost(computeSizeMultiplier, 1.0d);
            }
            options.inScaled = !(computeSizeMultiplier == 1.0d);
            if (options.inScaled) {
                if (computeSizeMultiplier > 1.0d) {
                    options.inDensity = kotlin.math.MathKt.roundToInt(2.147483647E9d / computeSizeMultiplier);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = kotlin.math.MathKt.roundToInt(computeSizeMultiplier * 2.147483647E9d);
                }
            }
        }
        okio.BufferedSource bufferedSource = buffer;
        try {
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(bufferedSource.inputStream(), null, options);
            kotlin.io.CloseableKt.closeFinally(bufferedSource, null);
            java.lang.Exception exc3 = exceptionCatchingSource.getHighSpeedVideoFpsRanges;
            if (exc3 != null) {
                throw exc3;
            }
            if (decodeStream == null) {
                throw new java.lang.IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
            }
            decodeStream.setDensity(this.getHighSpeedVideoFpsRangesFor.getContext().getResources().getDisplayMetrics().densityDpi);
            coil3.Image asImage = coil3.Image_androidKt.asImage(new android.graphics.drawable.BitmapDrawable(this.getHighSpeedVideoFpsRangesFor.getContext().getResources(), coil3.graphics.ExifUtils.INSTANCE.reverseTransformations(decodeStream, exifData)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new coil3.graphics.DecodeResult(asImage, z);
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil3/decode/ExifOrientationStrategy;", "exifOrientationStrategy", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;Lcoil3/decode/ExifOrientationStrategy;)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/Decoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/Decoder;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Semaphore;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcoil3/decode/ExifOrientationStrategy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.sync.Semaphore Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final coil3.graphics.ExifOrientationStrategy getHighSpeedVideoSizes;

        public Factory(kotlinx.coroutines.sync.Semaphore semaphore, coil3.graphics.ExifOrientationStrategy exifOrientationStrategy) {
            this.Camera2StreamConfigurationMap = semaphore;
            this.getHighSpeedVideoSizes = exifOrientationStrategy;
        }

        public /* synthetic */ Factory(kotlinx.coroutines.sync.Semaphore semaphore, coil3.graphics.ExifOrientationStrategy exifOrientationStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(4, 0, 2, null) : semaphore, (i & 2) != 0 ? coil3.graphics.ExifOrientationStrategy.RESPECT_PERFORMANCE : exifOrientationStrategy);
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.Decoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            return new coil3.graphics.BitmapFactoryDecoder(result.getSource(), options, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR.\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u000e\u0010\u0003\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$ExceptionCatchingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "p0", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "", "p1", "read", "(Lokio/Buffer;J)J", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Exception;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class ExceptionCatchingSource extends okio.ForwardingSource {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        java.lang.Exception getHighSpeedVideoFpsRanges;

        public ExceptionCatchingSource(okio.Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(okio.Buffer p0, long p1) {
            try {
                return super.read(p0, p1);
            } catch (java.lang.Exception e) {
                this.getHighSpeedVideoFpsRanges = e;
                throw e;
            }
        }
    }
}
