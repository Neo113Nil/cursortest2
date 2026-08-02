package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 *2\u00020\u0001:\u0002+*BT\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001d\b\u0002\u0010\r\u001a\u0017\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR/\u0010\r\u001a\u0017\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b&\u0010%R\u001a\u0010\u0013\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010%"}, d2 = {"Lcoil3/svg/SvgDecoder;", "Lcoil3/decode/Decoder;", "Lcoil3/decode/ImageSource;", "source", "Lcoil3/request/Options;", "options", "Lcoil3/svg/Svg$Parser;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "", "Lkotlin/ExtensionFunctionType;", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Lcoil3/svg/Svg$Parser;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;ZZZ)V", "Lcoil3/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcoil3/decode/ImageSource;", "getHighSpeedVideoSizes", "Lcoil3/request/Options;", "Camera2StreamConfigurationMap", "Lcoil3/svg/Svg$Parser;", "getParser", "()Lcoil3/svg/Svg$Parser;", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "getRenderToBitmap", "getScaleToDensity", "getScaleToDensity$annotations", "()V", "Companion", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SvgDecoder implements coil3.graphics.Decoder {
    public static final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> NO_DENSITY = new kotlin.jvm.functions.Function1() { // from class: coil3.svg.SvgDecoder$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Float.valueOf(coil3.svg.SvgDecoder.$r8$lambda$MlXcRpvk12LNIxAz1FTkwfw6gJI((android.content.Context) obj));
        }
    };
    public static final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> PLATFORM_DENSITY = new kotlin.jvm.functions.Function1() { // from class: coil3.svg.SvgDecoder$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            float density;
            density = coil3.svg.internal.Utils_androidKt.getDensity((android.content.Context) obj);
            return java.lang.Float.valueOf(density);
        }
    };
    private final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> density;
    private final coil3.graphics.ImageSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.view.Options Camera2StreamConfigurationMap;
    private final coil3.svg.Svg.Parser parser;
    private final boolean renderToBitmap;
    private final boolean useViewBoundsAsIntrinsicSize;

    public static /* synthetic */ float $r8$lambda$MlXcRpvk12LNIxAz1FTkwfw6gJI(android.content.Context context) {
        return 1.0f;
    }

    @kotlin.Deprecated(message = "Migrate to density.")
    public static /* synthetic */ void getScaleToDensity$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SvgDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, coil3.svg.Svg.Parser parser, kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Float> function1, boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRanges = imageSource;
        this.Camera2StreamConfigurationMap = options;
        this.parser = parser;
        this.density = function1;
        this.useViewBoundsAsIntrinsicSize = z;
        this.renderToBitmap = z2;
    }

    public /* synthetic */ SvgDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, coil3.svg.Svg.Parser parser, kotlin.jvm.functions.Function1 function1, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? coil3.svg.Svg.Parser.DEFAULT : parser, (i & 8) != 0 ? NO_DENSITY : function1, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }

    public final coil3.svg.Svg.Parser getParser() {
        return this.parser;
    }

    public final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> getDensity() {
        return this.density;
    }

    public final boolean getUseViewBoundsAsIntrinsicSize() {
        return this.useViewBoundsAsIntrinsicSize;
    }

    public final boolean getRenderToBitmap() {
        return this.renderToBitmap;
    }

    public /* synthetic */ SvgDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }

    public SvgDecoder(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z, boolean z2, boolean z3) {
        this(imageSource, options, coil3.svg.Svg.Parser.DEFAULT, z3 ? PLATFORM_DENSITY : NO_DENSITY, z, z2);
    }

    public final boolean getScaleToDensity() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this.density, NO_DENSITY);
    }

    @Override // coil3.graphics.Decoder
    public final java.lang.Object decode(kotlin.coroutines.Continuation<? super coil3.graphics.DecodeResult> continuation) {
        return kotlinx.coroutines.InterruptibleKt.runInterruptible(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function0() { // from class: coil3.svg.SvgDecoder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.graphics.DecodeResult highSpeedVideoSizes;
                highSpeedVideoSizes = coil3.svg.SvgDecoder.getHighSpeedVideoSizes(coil3.svg.SvgDecoder.this);
                return highSpeedVideoSizes;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil3.graphics.DecodeResult getHighSpeedVideoSizes(coil3.svg.SvgDecoder svgDecoder) {
        java.lang.Throwable th;
        coil3.svg.Svg svg;
        float width;
        float height;
        okio.BufferedSource source = svgDecoder.getHighSpeedVideoFpsRanges.source();
        try {
            svg = svgDecoder.parser.parse(source);
            if (source != null) {
                try {
                    source.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (java.lang.Throwable th3) {
            if (source != null) {
                try {
                    source.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            svg = null;
        }
        if (th == null) {
            coil3.svg.Svg.ViewBox viewBox = svg.getViewBox();
            if (svgDecoder.useViewBoundsAsIntrinsicSize && viewBox != null) {
                width = coil3.svg.SvgKt.getWidth(viewBox);
                height = coil3.svg.SvgKt.getHeight(viewBox);
            } else {
                width = svg.getWidth();
                height = svg.getHeight();
            }
            if (coil3.view.SizeKt.isOriginal(svgDecoder.Camera2StreamConfigurationMap.getSize())) {
                float floatValue = svgDecoder.density.invoke(svgDecoder.Camera2StreamConfigurationMap.getContext()).floatValue();
                if (width > 0.0f) {
                    width *= floatValue;
                }
                if (height > 0.0f) {
                    height *= floatValue;
                }
            }
            long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(width > 0.0f ? kotlin.math.MathKt.roundToInt(width) : 512, height > 0.0f ? kotlin.math.MathKt.roundToInt(height) : 512, svgDecoder.Camera2StreamConfigurationMap.getSize(), svgDecoder.Camera2StreamConfigurationMap.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(svgDecoder.Camera2StreamConfigurationMap));
            int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o);
            int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o);
            if (width > 0.0f && height > 0.0f) {
                float computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width, height, m9814getFirstimpl, m9815getSecondimpl, svgDecoder.Camera2StreamConfigurationMap.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(svgDecoder.Camera2StreamConfigurationMap));
                m9814getFirstimpl = (int) (computeSizeMultiplier * width);
                m9815getSecondimpl = (int) (computeSizeMultiplier * height);
                if (viewBox == null) {
                    svg.setViewBox(new coil3.svg.Svg.ViewBox(0.0f, 0.0f, width, height));
                }
            }
            svg.width("100%");
            svg.height("100%");
            svg.options(svgDecoder.Camera2StreamConfigurationMap);
            coil3.BitmapImage asImage = svg.asImage(m9814getFirstimpl, m9815getSecondimpl);
            if (svgDecoder.renderToBitmap) {
                asImage = coil3.Image_androidKt.asImage$default(coil3.Image_androidKt.toBitmap$default(asImage, 0, 0, 3, null), false, 1, null);
            }
            return new coil3.graphics.DecodeResult(asImage, svgDecoder.renderToBitmap);
        }
        throw th;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BD\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001d\b\u0002\u0010\t\u001a\u0017\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB'\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0010J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR/\u0010\t\u001a\u0017\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\u000f\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\""}, d2 = {"Lcoil3/svg/SvgDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lcoil3/svg/Svg$Parser;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "", "Lkotlin/ExtensionFunctionType;", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lcoil3/svg/Svg$Parser;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(ZZZ)V", "Lcoil3/fetch/SourceFetchResult;", "result", "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/decode/Decoder;", "create", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/decode/Decoder;", "Lcoil3/svg/Svg$Parser;", "getParser", "()Lcoil3/svg/Svg$Parser;", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "getRenderToBitmap", "getScaleToDensity", "getScaleToDensity$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.decode.Decoder.Factory {
        private final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> density;
        private final coil3.svg.Svg.Parser parser;
        private final boolean renderToBitmap;
        private final boolean useViewBoundsAsIntrinsicSize;

        @kotlin.Deprecated(message = "Migrate to density.")
        public static /* synthetic */ void getScaleToDensity$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(coil3.svg.Svg.Parser parser, kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Float> function1, boolean z, boolean z2) {
            this.parser = parser;
            this.density = function1;
            this.useViewBoundsAsIntrinsicSize = z;
            this.renderToBitmap = z2;
        }

        public /* synthetic */ Factory(coil3.svg.Svg.Parser parser, kotlin.jvm.functions.Function1 function1, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? coil3.svg.Svg.Parser.DEFAULT : parser, (i & 2) != 0 ? coil3.svg.SvgDecoder.NO_DENSITY : function1, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
        }

        public final coil3.svg.Svg.Parser getParser() {
            return this.parser;
        }

        public final kotlin.jvm.functions.Function1<android.content.Context, java.lang.Float> getDensity() {
            return this.density;
        }

        public final boolean getUseViewBoundsAsIntrinsicSize() {
            return this.useViewBoundsAsIntrinsicSize;
        }

        public final boolean getRenderToBitmap() {
            return this.renderToBitmap;
        }

        public /* synthetic */ Factory(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3);
        }

        public Factory(boolean z, boolean z2, boolean z3) {
            this(coil3.svg.Svg.Parser.DEFAULT, z3 ? coil3.svg.SvgDecoder.PLATFORM_DENSITY : coil3.svg.SvgDecoder.NO_DENSITY, z, z2);
        }

        public final boolean getScaleToDensity() {
            return !kotlin.jvm.internal.Intrinsics.areEqual(this.density, coil3.svg.SvgDecoder.NO_DENSITY);
        }

        @Override // coil3.decode.Decoder.Factory
        public final coil3.graphics.Decoder create(coil3.fetch.SourceFetchResult result, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(result.getMimeType(), coil3.svg.internal.UtilsKt.MIME_TYPE_SVG) || coil3.svg.DecodeUtilsKt.isSvg(coil3.graphics.DecodeUtils.INSTANCE, result.getSource().source())) {
                return new coil3.svg.SvgDecoder(result.getSource(), options, this.parser, this.density, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap);
            }
            return null;
        }

        public Factory() {
            this(null, null, false, false, 15, null);
        }
    }
}
