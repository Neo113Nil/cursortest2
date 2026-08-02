package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000e\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u0018*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001d*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\"\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010%\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010\r\u001a\u0017\u0010&\u001a\u00020#*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b(\u0010\u0015\u001a\u001f\u0010)\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b)\u0010\u0017\u001a\u0017\u0010+\u001a\u00020**\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b+\u0010'\u001a\u001f\u0010-\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010\r\u001a\u0017\u0010/\u001a\u00020.*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b/\u0010'\u001a\u001f\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020.H\u0000¢\u0006\u0004\b0\u0010\r\u001a\u0017\u00102\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b2\u0010\u0015\u001a\u001f\u00103\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b3\u0010\u0017\u001a\u0017\u00105\u001a\u000204*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b5\u0010'\u001a\u001f\u00107\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u000204H\u0000¢\u0006\u0004\b6\u0010\r\u001a'\u0010:\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u0010\u001a\n\u0018\u000108j\u0004\u0018\u0001`9H\u0000¢\u0006\u0004\b:\u0010;\u001a!\u0010=\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>*\n\u0010?\"\u00020\u00032\u00020\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "asComposePaint", "(Landroid/graphics/Paint;)Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/getHighResolutionOutputSizeshNQ4ISI;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setNativeColorFilter", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getNativeAlpha", "(Landroid/graphics/Paint;)F", "setNativeAlpha", "(Landroid/graphics/Paint;F)V", "", "getNativeAntiAlias", "(Landroid/graphics/Paint;)Z", "setNativeAntiAlias", "(Landroid/graphics/Paint;Z)V", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "setNativeShader", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/PathEffect;)V", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {
    public static final androidx.compose.ui.graphics.Paint Paint() {
        return new androidx.compose.ui.graphics.AndroidPaint();
    }

    public static final androidx.compose.ui.graphics.Paint asComposePaint(android.graphics.Paint paint) {
        return new androidx.compose.ui.graphics.AndroidPaint(paint);
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m5878setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.WrapperVerificationHelperMethods.INSTANCE.m6391setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5845toPorterDuffModes9anfk8(i)));
        }
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f) {
        paint.setAlpha((int) java.lang.Math.rint(f * 255.0f));
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        return androidx.compose.ui.graphics.ColorKt.Color(paint.getColor());
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m5879setNativeColor4WTKRHQ(android.graphics.Paint paint, long j) {
        paint.setColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m5883setNativeStyle5YerkU(android.graphics.Paint paint, int i) {
        paint.setStyle(androidx.compose.ui.graphics.PaintingStyle.m6255equalsimpl0(i, androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo()) ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        android.graphics.Paint.Style style = paint.getStyle();
        if (style != null && androidx.compose.ui.graphics.AndroidPaint_androidKt.WhenMappings.$EnumSwitchMapping$0[style.ordinal()] == 1) {
            return androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo();
        }
        return androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6259getFillTiuSbCo();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : androidx.compose.ui.graphics.AndroidPaint_androidKt.WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
        }
        if (i == 2) {
            return androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw();
        }
        if (i == 3) {
            return androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw();
        }
        return androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m5881setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i) {
        android.graphics.Paint.Cap cap;
        if (androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw())) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw())) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw());
            cap = android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : androidx.compose.ui.graphics.AndroidPaint_androidKt.WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8();
        }
        if (i == 2) {
            return androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
        }
        if (i == 3) {
            return androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6352getRoundLxFBmk8();
        }
        return androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8();
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m5882setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i) {
        android.graphics.Paint.Join join;
        if (!androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8())) {
            if (androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8())) {
                join = android.graphics.Paint.Join.BEVEL;
            } else if (androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6352getRoundLxFBmk8())) {
                join = android.graphics.Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
        }
        join = android.graphics.Paint.Join.MITER;
        paint.setStrokeJoin(join);
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        if (!paint.isFilterBitmap()) {
            return androidx.compose.ui.graphics.FilterQuality.INSTANCE.m6093getNonefv9h1I();
        }
        return androidx.compose.ui.graphics.FilterQuality.INSTANCE.m6091getLowfv9h1I();
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m5880setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i) {
        paint.setFilterBitmap(!androidx.compose.ui.graphics.FilterQuality.m6086equalsimpl0(i, androidx.compose.ui.graphics.FilterQuality.INSTANCE.m6093getNonefv9h1I()));
    }

    public static final void setNativeShader(android.graphics.Paint paint, android.graphics.Shader shader) {
        paint.setShader(shader);
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, androidx.compose.ui.graphics.PathEffect pathEffect) {
        androidx.compose.ui.graphics.AndroidPathEffect androidPathEffect = (androidx.compose.ui.graphics.AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[android.graphics.Paint.Style.values().length];
            try {
                iArr[android.graphics.Paint.Style.STROKE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.graphics.Paint.Cap.values().length];
            try {
                iArr2[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[android.graphics.Paint.Join.values().length];
            try {
                iArr3[android.graphics.Paint.Join.MITER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[android.graphics.Paint.Join.ROUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
