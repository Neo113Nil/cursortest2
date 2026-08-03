package coil.decode;

/* compiled from: BitmapFactoryDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\fB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010\u0016\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "parallelismLock", "Lkotlinx/coroutines/sync/Semaphore;", "exifOrientationPolicy", "Lcoil/decode/ExifOrientationPolicy;", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;Lcoil/decode/ExifOrientationPolicy;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "configureConfig", "", "exifData", "Lcoil/decode/ExifData;", "configureScale", "Factory", "ExceptionCatchingSource", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BitmapFactoryDecoder implements coil.decode.Decoder {
    public static final int DEFAULT_MAX_PARALLELISM = 4;
    private final coil.decode.ExifOrientationPolicy exifOrientationPolicy;
    private final coil.request.Options options;
    private final kotlinx.coroutines.sync.Semaphore parallelismLock;
    private final coil.decode.ImageSource source;

    public BitmapFactoryDecoder(coil.decode.ImageSource imageSource, coil.request.Options options, kotlinx.coroutines.sync.Semaphore semaphore, coil.decode.ExifOrientationPolicy exifOrientationPolicy) {
        this.source = imageSource;
        this.options = options;
        this.parallelismLock = semaphore;
        this.exifOrientationPolicy = exifOrientationPolicy;
    }

    public /* synthetic */ BitmapFactoryDecoder(coil.decode.ImageSource imageSource, coil.request.Options options, kotlinx.coroutines.sync.Semaphore semaphore, coil.decode.ExifOrientationPolicy exifOrientationPolicy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore, (i & 8) != 0 ? coil.decode.ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ BitmapFactoryDecoder(coil.decode.ImageSource imageSource, coil.request.Options options) {
        this(imageSource, options, null, null, 12, null);
    }

    public /* synthetic */ BitmapFactoryDecoder(coil.decode.ImageSource imageSource, coil.request.Options options, kotlinx.coroutines.sync.Semaphore semaphore, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ BitmapFactoryDecoder(coil.decode.ImageSource imageSource, coil.request.Options options, kotlinx.coroutines.sync.Semaphore semaphore) {
        this(imageSource, options, semaphore, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // coil.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object decode(kotlin.coroutines.Continuation<? super coil.decode.DecodeResult> continuation) {
        coil.decode.BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Semaphore semaphore;
        final coil.decode.BitmapFactoryDecoder bitmapFactoryDecoder;
        kotlinx.coroutines.sync.Semaphore semaphore2;
        java.lang.Throwable th;
        java.lang.Object runInterruptible$default;
        try {
            if (continuation instanceof coil.decode.BitmapFactoryDecoder$decode$1) {
                bitmapFactoryDecoder$decode$1 = (coil.decode.BitmapFactoryDecoder$decode$1) continuation;
                if ((bitmapFactoryDecoder$decode$1.label & Integer.MIN_VALUE) != 0) {
                    bitmapFactoryDecoder$decode$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = bitmapFactoryDecoder$decode$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bitmapFactoryDecoder$decode$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphore = this.parallelismLock;
                        bitmapFactoryDecoder$decode$1.L$0 = this;
                        bitmapFactoryDecoder$decode$1.L$1 = semaphore;
                        bitmapFactoryDecoder$decode$1.label = 1;
                        if (semaphore.acquire(bitmapFactoryDecoder$decode$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bitmapFactoryDecoder = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            semaphore2 = (kotlinx.coroutines.sync.Semaphore) bitmapFactoryDecoder$decode$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                coil.decode.DecodeResult decodeResult = (coil.decode.DecodeResult) obj;
                                semaphore2.release();
                                return decodeResult;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                semaphore2.release();
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Semaphore semaphore3 = (kotlinx.coroutines.sync.Semaphore) bitmapFactoryDecoder$decode$1.L$1;
                        bitmapFactoryDecoder = (coil.decode.BitmapFactoryDecoder) bitmapFactoryDecoder$decode$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphore = semaphore3;
                    }
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: coil.decode.BitmapFactoryDecoder$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            coil.decode.DecodeResult decode$lambda$1$lambda$0;
                            decode$lambda$1$lambda$0 = coil.decode.BitmapFactoryDecoder.decode$lambda$1$lambda$0(coil.decode.BitmapFactoryDecoder.this);
                            return decode$lambda$1$lambda$0;
                        }
                    };
                    bitmapFactoryDecoder$decode$1.L$0 = semaphore;
                    bitmapFactoryDecoder$decode$1.L$1 = null;
                    bitmapFactoryDecoder$decode$1.label = 2;
                    runInterruptible$default = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, function0, bitmapFactoryDecoder$decode$1, 1, null);
                    if (runInterruptible$default != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    semaphore2 = semaphore;
                    obj = runInterruptible$default;
                    coil.decode.DecodeResult decodeResult2 = (coil.decode.DecodeResult) obj;
                    semaphore2.release();
                    return decodeResult2;
                }
            }
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: coil.decode.BitmapFactoryDecoder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil.decode.DecodeResult decode$lambda$1$lambda$0;
                    decode$lambda$1$lambda$0 = coil.decode.BitmapFactoryDecoder.decode$lambda$1$lambda$0(coil.decode.BitmapFactoryDecoder.this);
                    return decode$lambda$1$lambda$0;
                }
            };
            bitmapFactoryDecoder$decode$1.L$0 = semaphore;
            bitmapFactoryDecoder$decode$1.L$1 = null;
            bitmapFactoryDecoder$decode$1.label = 2;
            runInterruptible$default = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(null, function02, bitmapFactoryDecoder$decode$1, 1, null);
            if (runInterruptible$default != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th3) {
            semaphore2 = semaphore;
            th = th3;
            semaphore2.release();
            throw th;
        }
        bitmapFactoryDecoder$decode$1 = new coil.decode.BitmapFactoryDecoder$decode$1(this, continuation);
        java.lang.Object obj2 = bitmapFactoryDecoder$decode$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bitmapFactoryDecoder$decode$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.decode.DecodeResult decode$lambda$1$lambda$0(coil.decode.BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.decode(new android.graphics.BitmapFactory.Options());
    }

    private final coil.decode.DecodeResult decode(android.graphics.BitmapFactory.Options options) {
        coil.decode.BitmapFactoryDecoder.ExceptionCatchingSource exceptionCatchingSource = new coil.decode.BitmapFactoryDecoder.ExceptionCatchingSource(this.source.source());
        okio.BufferedSource buffer = okio.Okio.buffer(exceptionCatchingSource);
        boolean z = true;
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(buffer.peek().inputStream(), null, options);
        java.lang.Exception exception = exceptionCatchingSource.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        coil.decode.ExifData exifData = coil.decode.ExifUtils.INSTANCE.getExifData(options.outMimeType, buffer, this.exifOrientationPolicy);
        java.lang.Exception exception2 = exceptionCatchingSource.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (android.os.Build.VERSION.SDK_INT >= 26 && this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        configureConfig(options, exifData);
        configureScale(options, exifData);
        okio.BufferedSource bufferedSource = buffer;
        try {
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(bufferedSource.inputStream(), null, options);
            kotlin.io.CloseableKt.closeFinally(bufferedSource, null);
            java.lang.Exception exception3 = exceptionCatchingSource.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (decodeStream == null) {
                throw new java.lang.IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
            }
            decodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.options.getContext().getResources(), coil.decode.ExifUtils.INSTANCE.reverseTransformations(decodeStream, exifData));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new coil.decode.DecodeResult(bitmapDrawable, z);
        } finally {
        }
    }

    private final void configureConfig(android.graphics.BitmapFactory.Options options, coil.decode.ExifData exifData) {
        android.graphics.Bitmap.Config config = this.options.getConfig();
        if (exifData.getIsFlipped() || coil.decode.ExifUtilsKt.isRotated(exifData)) {
            config = coil.util.Bitmaps.toSoftware(config);
        }
        if (this.options.getAllowRgb565() && config == android.graphics.Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            config = android.graphics.Bitmap.Config.RGB_565;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && options.outConfig == android.graphics.Bitmap.Config.RGBA_F16 && config != android.graphics.Bitmap.Config.HARDWARE) {
            config = android.graphics.Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = config;
    }

    private final void configureScale(android.graphics.BitmapFactory.Options options, coil.decode.ExifData exifData) {
        coil.decode.ImageSource.Metadata metadata = this.source.getMetadata();
        if ((metadata instanceof coil.decode.ResourceMetadata) && coil.size.Sizes.isOriginal(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((coil.decode.ResourceMetadata) metadata).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = coil.decode.ExifUtilsKt.isSwapped(exifData) ? options.outHeight : options.outWidth;
        int i2 = coil.decode.ExifUtilsKt.isSwapped(exifData) ? options.outWidth : options.outHeight;
        coil.size.Size size = this.options.getSize();
        int px = coil.size.Sizes.isOriginal(size) ? i : coil.util.Utils.toPx(size.getWidth(), this.options.getScale());
        coil.size.Size size2 = this.options.getSize();
        int px2 = coil.size.Sizes.isOriginal(size2) ? i2 : coil.util.Utils.toPx(size2.getHeight(), this.options.getScale());
        options.inSampleSize = coil.decode.DecodeUtils.calculateInSampleSize(i, i2, px, px2, this.options.getScale());
        double computeSizeMultiplier = coil.decode.DecodeUtils.computeSizeMultiplier(i / options.inSampleSize, i2 / options.inSampleSize, px, px2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            computeSizeMultiplier = kotlin.ranges.RangesKt.coerceAtMost(computeSizeMultiplier, 1.0d);
        }
        options.inScaled = !(computeSizeMultiplier == 1.0d);
        if (options.inScaled) {
            if (computeSizeMultiplier > 1.0d) {
                options.inDensity = kotlin.math.MathKt.roundToInt(Integer.MAX_VALUE / computeSizeMultiplier);
                options.inTargetDensity = Integer.MAX_VALUE;
            } else {
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = kotlin.math.MathKt.roundToInt(Integer.MAX_VALUE * computeSizeMultiplier);
            }
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0017¢\u0006\u0004\b\u0006\u0010\bB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "maxParallelism", "", "exifOrientationPolicy", "Lcoil/decode/ExifOrientationPolicy;", "<init>", "(ILcoil/decode/ExifOrientationPolicy;)V", "()V", "(I)V", "parallelismLock", "Lkotlinx/coroutines/sync/Semaphore;", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "equals", "", "other", "", "hashCode", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.decode.Decoder.Factory {
        private final coil.decode.ExifOrientationPolicy exifOrientationPolicy;
        private final kotlinx.coroutines.sync.Semaphore parallelismLock;

        public Factory(int i, coil.decode.ExifOrientationPolicy exifOrientationPolicy) {
            this.exifOrientationPolicy = exifOrientationPolicy;
            this.parallelismLock = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        public /* synthetic */ Factory(int i, coil.decode.ExifOrientationPolicy exifOrientationPolicy, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? coil.decode.ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Factory(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ Factory(int i) {
            this(i, null, 2, 0 == true ? 1 : 0);
        }

        @Override // coil.decode.Decoder.Factory
        public coil.decode.Decoder create(coil.fetch.SourceResult result, coil.request.Options options, coil.ImageLoader imageLoader) {
            return new coil.decode.BitmapFactoryDecoder(result.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(java.lang.Object other) {
            return other instanceof coil.decode.BitmapFactoryDecoder.Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R0\u0010\t\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$ExceptionCatchingSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "<init>", "(Lokio/Source;)V", "value", "Lkotlin/Exception;", "Ljava/lang/Exception;", "exception", "getException", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "read", "", "sink", "Lokio/Buffer;", "byteCount", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ExceptionCatchingSource extends okio.ForwardingSource {
        private java.lang.Exception exception;

        public ExceptionCatchingSource(okio.Source source) {
            super(source);
        }

        public final java.lang.Exception getException() {
            return this.exception;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(okio.Buffer sink, long byteCount) {
            try {
                return super.read(sink, byteCount);
            } catch (java.lang.Exception e) {
                this.exception = e;
                throw e;
            }
        }
    }
}
