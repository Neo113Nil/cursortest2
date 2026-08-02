package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\u0018\u0000 o2\u00020\u0001:\u0001oB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0013\u0010\u0018BY\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001cB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u001fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010%J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010(J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b&\u0010(J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010,J%\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f¢\u0006\u0004\b1\u00102J\u0015\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b1\u0010(J%\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f¢\u0006\u0004\b4\u00102J\u0015\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010(J'\u0010:\u001a\u0002092\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b<\u0010=J7\u0010E\u001a\u00020B2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0001H\u0010¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010(J\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010GH\u0096\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0011H\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\bZ\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\b[\u0010%R\u001a\u0010)\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010Y\u001a\u0004\b\\\u0010%R\u001a\u0010]\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bd\u0010^\u001a\u0004\be\u0010`R\u001a\u0010f\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bg\u0010`R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bh\u0010cR\u001a\u0010i\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bi\u0010^\u001a\u0004\bj\u0010`R\u001a\u0010k\u001a\u00020I8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bk\u0010mR\u001a\u0010n\u001a\u00020I8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bn\u0010l\u001a\u0004\bn\u0010m"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "getPrimaries", "()[F", "getTransform", "getInverseTransform", "([F)[F", "inverseTransform", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "getMinValue", "(I)F", "getMaxValue", "r", "g", util.h.xy.cb.b.f1091, "toLinear", "(FFF)[F", "v", "fromLinear", "toXyz", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toZ$ui_graphics", "(FFF)F", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics", "getTransform$ui_graphics", "getInverseTransform$ui_graphics", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "oetfFunc", "getOetfFunc$ui_graphics", "eotfOrig", "getEotfOrig$ui_graphics", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics", "isWideGamut", "Z", "()Z", "isSrgb", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Rgb extends androidx.compose.ui.graphics.colorspace.ColorSpace {
    private final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> eotf;
    private final androidx.compose.ui.graphics.colorspace.DoubleFunction eotfFunc;
    private final androidx.compose.ui.graphics.colorspace.DoubleFunction eotfOrig;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> oetf;
    private final androidx.compose.ui.graphics.colorspace.DoubleFunction oetfFunc;
    private final androidx.compose.ui.graphics.colorspace.DoubleFunction oetfOrig;
    private final float[] primaries;
    private final androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters;
    private final float[] transform;
    private final androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.Rgb.Companion INSTANCE = new androidx.compose.ui.graphics.colorspace.Rgb.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.graphics.colorspace.DoubleFunction getHighSpeedVideoFpsRanges = new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d) {
            double highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoSizes(d);
            return highSpeedVideoSizes;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoSizes(double d) {
        return d;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public final androidx.compose.ui.graphics.colorspace.TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, float[] fArr2, androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction2, float f, float f2, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, int i) {
        super(str, androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6402getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            public final java.lang.Double getHighResolutionOutputSizeshNQ4ISI(double d) {
                float f3;
                float f4;
                double invoke = androidx.compose.ui.graphics.colorspace.Rgb.this.getOetfOrig().invoke(d);
                f3 = androidx.compose.ui.graphics.colorspace.Rgb.this.getHighSpeedVideoFpsRanges;
                double d2 = f3;
                f4 = androidx.compose.ui.graphics.colorspace.Rgb.this.Camera2StreamConfigurationMap;
                return java.lang.Double.valueOf(kotlin.ranges.RangesKt.coerceIn(invoke, d2, f4));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Double invoke(java.lang.Double d) {
                return getHighResolutionOutputSizeshNQ4ISI(d.doubleValue());
            }

            {
                super(1);
            }
        };
        this.oetfFunc = new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.colorspace.Rgb.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.Rgb.this, d);
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            public final java.lang.Double getHighResolutionOutputSizeshNQ4ISI(double d) {
                float f3;
                float f4;
                androidx.compose.ui.graphics.colorspace.DoubleFunction eotfOrig = androidx.compose.ui.graphics.colorspace.Rgb.this.getEotfOrig();
                f3 = androidx.compose.ui.graphics.colorspace.Rgb.this.getHighSpeedVideoFpsRanges;
                double d2 = f3;
                f4 = androidx.compose.ui.graphics.colorspace.Rgb.this.Camera2StreamConfigurationMap;
                return java.lang.Double.valueOf(eotfOrig.invoke(kotlin.ranges.RangesKt.coerceIn(d, d2, f4)));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Double invoke(java.lang.Double d) {
                return getHighResolutionOutputSizeshNQ4ISI(d.doubleValue());
            }

            {
                super(1);
            }
        };
        this.eotfFunc = new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.colorspace.Rgb.this, d);
                return highSpeedVideoFpsRanges;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new java.lang.IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid range: min=");
            sb.append(f);
            sb.append(", max=");
            sb.append(f2);
            sb.append("; min must be strictly < max");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.compose.ui.graphics.colorspace.Rgb.Companion companion = INSTANCE;
        float[] access$xyPrimaries = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$xyPrimaries(companion, fArr);
        this.primaries = access$xyPrimaries;
        if (fArr2 == null) {
            this.transform = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeXYZMatrix(companion, access$xyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Transform must have 9 entries! Has ");
                sb2.append(fArr2.length);
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.transform = fArr2;
        }
        this.inverseTransform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$isWideGamut(companion, access$xyPrimaries, f, f2);
        this.isSrgb = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$isSrgb(companion, access$xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
    }

    /* renamed from: getPrimaries$ui_graphics, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* renamed from: getTransform$ui_graphics, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: getInverseTransform$ui_graphics, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    /* renamed from: getOetfOrig$ui_graphics, reason: from getter */
    public final androidx.compose.ui.graphics.colorspace.DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> getOetf() {
        return this.oetf;
    }

    /* renamed from: getOetfFunc$ui_graphics, reason: from getter */
    public final androidx.compose.ui.graphics.colorspace.DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.Rgb rgb, double d) {
        return kotlin.ranges.RangesKt.coerceIn(rgb.oetfOrig.invoke(d), rgb.getHighSpeedVideoFpsRanges, rgb.Camera2StreamConfigurationMap);
    }

    /* renamed from: getEotfOrig$ui_graphics, reason: from getter */
    public final androidx.compose.ui.graphics.colorspace.DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> getEotf() {
        return this.eotf;
    }

    /* renamed from: getEotfFunc$ui_graphics, reason: from getter */
    public final androidx.compose.ui.graphics.colorspace.DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.colorspace.Rgb rgb, double d) {
        return rgb.eotfOrig.invoke(kotlin.ranges.RangesKt.coerceIn(d, rgb.getHighSpeedVideoFpsRanges, rgb.Camera2StreamConfigurationMap));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut, reason: from getter */
    public final boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public final boolean getIsSrgb() {
        return this.isSrgb;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = java.util.Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = java.util.Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = java.util.Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(java.lang.String str, float[] fArr, final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> function1, final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> function12) {
        this(str, r1.computePrimaries$ui_graphics(fArr), androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r1, fArr), null, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.ui.graphics.colorspace.Rgb.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1.this, d);
                return Camera2StreamConfigurationMap;
            }
        }, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, d);
                return highSpeedVideoSizes;
            }
        }, 0.0f, 1.0f, null, -1);
        androidx.compose.ui.graphics.colorspace.Rgb.Companion companion = INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> function1, final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> function12, float f, float f2) {
        this(str, fArr, whitePoint, null, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1.this, d);
                return highSpeedVideoFpsRangesFor;
            }
        }, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, d);
                return highSpeedVideoFpsRanges;
            }
        }, f, f2, null, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters) {
        this(str, r0.computePrimaries$ui_graphics(fArr), androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, fArr), transferParameters, -1);
        androidx.compose.ui.graphics.colorspace.Rgb.Companion companion = INSTANCE;
    }

    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$generateOetf(r0, transferParameters), androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$generateEotf(r0, transferParameters), 0.0f, 1.0f, transferParameters, i);
        androidx.compose.ui.graphics.colorspace.Rgb.Companion companion = INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(java.lang.String str, float[] fArr, double d) {
        this(str, r0.computePrimaries$ui_graphics(fArr), androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, fArr), d, 0.0f, 1.0f, -1);
        androidx.compose.ui.graphics.colorspace.Rgb.Companion companion = INSTANCE;
    }

    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, double d) {
        this(str, fArr, whitePoint, d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(java.lang.String str, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, final double d, float f, float f2, int i) {
        this(str, fArr, whitePoint, null, r17, r0, f, f2, new androidx.compose.ui.graphics.colorspace.TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
        androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction;
        androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction2;
        if (d == 1.0d) {
            doubleFunction = getHighSpeedVideoFpsRanges;
        } else {
            doubleFunction = new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    double highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.colorspace.Rgb.getHighSpeedVideoFpsRangesFor(d, d2);
                    return highSpeedVideoFpsRangesFor;
                }
            };
        }
        androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = getHighSpeedVideoFpsRanges;
        } else {
            doubleFunction2 = new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    double Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.ui.graphics.colorspace.Rgb.Camera2StreamConfigurationMap(d, d2);
                    return Camera2StreamConfigurationMap;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRangesFor(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return java.lang.Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Camera2StreamConfigurationMap(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return java.lang.Math.pow(d2, d);
    }

    public Rgb(androidx.compose.ui.graphics.colorspace.Rgb rgb, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.getHighSpeedVideoFpsRanges, rgb.Camera2StreamConfigurationMap, rgb.transferParameters, -1);
    }

    public final float[] getPrimaries(float[] primaries) {
        return kotlin.collections.ArraysKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (java.lang.Object) null);
    }

    public final float[] getTransform(float[] transform) {
        return kotlin.collections.ArraysKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (java.lang.Object) null);
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        return kotlin.collections.ArraysKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (java.lang.Object) null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int component) {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int component) {
        return this.Camera2StreamConfigurationMap;
    }

    public final float[] toLinear(float r, float g, float b) {
        return toLinear(new float[]{r, g, b});
    }

    public final float[] toLinear(float[] v) {
        if (v.length < 3) {
            return v;
        }
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return v;
    }

    public final float[] fromLinear(float r, float g, float b) {
        return fromLinear(new float[]{r, g, b});
    }

    public final float[] fromLinear(float[] v) {
        if (v.length < 3) {
            return v;
        }
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] v) {
        if (v.length < 3) {
            return v;
        }
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(this.transform, v);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float v0, float v1, float v2) {
        float invoke = (float) this.eotfFunc.invoke(v0);
        float invoke2 = (float) this.eotfFunc.invoke(v1);
        float invoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        return (java.lang.Float.floatToRawIntBits((f4 * invoke) + (f5 * invoke2) + (f6 * invoke3)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(((f * invoke) + (f2 * invoke2)) + (f3 * invoke3)) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float v0, float v1, float v2) {
        float invoke = (float) this.eotfFunc.invoke(v0);
        float invoke2 = (float) this.eotfFunc.invoke(v1);
        float invoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        return (fArr[2] * invoke) + (fArr[5] * invoke2) + (fArr[8] * invoke3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo6405xyzaToColorJlNiLsg$ui_graphics(float x, float y, float z, float a2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return androidx.compose.ui.graphics.ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * x) + (fArr[3] * y) + (fArr[6] * z)), (float) this.oetfFunc.invoke((fArr[1] * x) + (fArr[4] * y) + (fArr[7] * z)), (float) this.oetfFunc.invoke((fArr[2] * x) + (fArr[5] * y) + (fArr[8] * z)), a2, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] v) {
        androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
        if (v.length < 3) {
            return v;
        }
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass() || !super.equals(other)) {
            return false;
        }
        androidx.compose.ui.graphics.colorspace.Rgb rgb = (androidx.compose.ui.graphics.colorspace.Rgb) other;
        if (java.lang.Float.compare(rgb.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) != 0 || java.lang.Float.compare(rgb.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) != 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !java.util.Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.whitePoint.hashCode();
        int hashCode3 = java.util.Arrays.hashCode(this.primaries);
        float f = this.getHighSpeedVideoFpsRanges;
        int floatToIntBits = f == 0.0f ? 0 : java.lang.Float.floatToIntBits(f);
        float f2 = this.Camera2StreamConfigurationMap;
        int floatToIntBits2 = f2 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f2);
        androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters = this.transferParameters;
        int hashCode4 = (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return (((hashCode4 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return hashCode4;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u001dJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020 H\u0002¢\u0006\u0004\b\u001e\u0010!J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020 H\u0002¢\u0006\u0004\b\u0016\u0010!R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "p1", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "p2", "p3", "", "p4", "p5", "", "p6", "", "Camera2StreamConfigurationMap", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFI)Z", "", "getHighSpeedVideoFpsRangesFor", "(DLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;)Z", "getHighSpeedVideoSizes", "([FFF)Z", "([F)F", "([F[F)Z", "toXYZ", "computePrimaries$ui_graphics", "([F)[F", "([F)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getHighResolutionOutputSizeshNQ4ISI", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ androidx.compose.ui.graphics.colorspace.WhitePoint access$computeWhitePoint(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, float[] fArr) {
            return getHighSpeedVideoFpsRangesFor(fArr);
        }

        public static final /* synthetic */ float[] access$computeXYZMatrix(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint) {
            return getHighResolutionOutputSizeshNQ4ISI(fArr, whitePoint);
        }

        public static final /* synthetic */ androidx.compose.ui.graphics.colorspace.DoubleFunction access$generateEotf(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters) {
            return getHighSpeedVideoSizes(transferParameters);
        }

        public static final /* synthetic */ androidx.compose.ui.graphics.colorspace.DoubleFunction access$generateOetf(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters) {
            return getHighResolutionOutputSizeshNQ4ISI(transferParameters);
        }

        public static final /* synthetic */ boolean access$isSrgb(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, float[] fArr, androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction doubleFunction2, float f, float f2, int i) {
            return Camera2StreamConfigurationMap(fArr, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
        }

        public static final /* synthetic */ boolean access$isWideGamut(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, float[] fArr, float f, float f2) {
            return getHighSpeedVideoSizes(fArr, f, f2);
        }

        public static final /* synthetic */ float[] access$xyPrimaries(androidx.compose.ui.graphics.colorspace.Rgb.Companion companion, float[] fArr) {
            return Camera2StreamConfigurationMap(fArr);
        }

        private static boolean Camera2StreamConfigurationMap(float[] p0, androidx.compose.ui.graphics.colorspace.WhitePoint p1, androidx.compose.ui.graphics.colorspace.DoubleFunction p2, androidx.compose.ui.graphics.colorspace.DoubleFunction p3, float p4, float p5, int p6) {
            if (p6 == 0) {
                return true;
            }
            if (!androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(p0, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics()) || !androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(p1, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD65()) || p4 != 0.0f || p5 != 1.0f) {
                return false;
            }
            androidx.compose.ui.graphics.colorspace.Rgb srgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!getHighSpeedVideoFpsRangesFor(d, p2, srgb.getOetfOrig()) || !getHighSpeedVideoFpsRangesFor(d, p3, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        private static boolean getHighSpeedVideoFpsRangesFor(double p0, androidx.compose.ui.graphics.colorspace.DoubleFunction p1, androidx.compose.ui.graphics.colorspace.DoubleFunction p2) {
            return java.lang.Math.abs(p1.invoke(p0) - p2.invoke(p0)) <= 0.001d;
        }

        private static boolean getHighSpeedVideoSizes(float[] p0, float p1, float p2) {
            if (getHighSpeedVideoSizes(p0) / getHighSpeedVideoSizes(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics()) <= 0.9f || !Camera2StreamConfigurationMap(p0, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics())) {
                return p1 < 0.0f && p2 > 1.0f;
            }
            return true;
        }

        private static float getHighSpeedVideoSizes(float[] p0) {
            if (p0.length < 6) {
                return 0.0f;
            }
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private static boolean Camera2StreamConfigurationMap(float[] p0, float[] p1) {
            float f = p0[0];
            float f2 = p1[0];
            float f3 = p0[1];
            float f4 = p1[1];
            float f5 = p0[2];
            float f6 = p1[2];
            float f7 = p0[3];
            float f8 = p1[3];
            float f9 = p0[4];
            float f10 = p1[4];
            float f11 = p0[5];
            float f12 = p1[5];
            float[] fArr = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= 0.0f && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= 0.0f) {
                float f15 = fArr[2];
                float f16 = fArr[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= 0.0f && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= 0.0f) {
                    float f17 = fArr[4];
                    float f18 = fArr[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= 0.0f && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final float[] computePrimaries$ui_graphics(float[] toXYZ) {
            float[] mul3x3Float3 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0];
            float f5 = mul3x3Float32[1];
            float f6 = f4 + f5 + mul3x3Float32[2];
            float f7 = mul3x3Float33[0];
            float f8 = mul3x3Float33[1];
            float f9 = f7 + f8 + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        private static androidx.compose.ui.graphics.colorspace.WhitePoint getHighSpeedVideoFpsRangesFor(float[] p0) {
            float[] mul3x3Float3 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(p0, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            return new androidx.compose.ui.graphics.colorspace.WhitePoint(f / f3, f2 / f3);
        }

        private static float[] Camera2StreamConfigurationMap(float[] p0) {
            float[] fArr = new float[6];
            if (p0.length == 9) {
                float f = p0[0];
                float f2 = p0[1];
                float f3 = f + f2 + p0[2];
                fArr[0] = f / f3;
                fArr[1] = f2 / f3;
                float f4 = p0[3];
                float f5 = p0[4];
                float f6 = f4 + f5 + p0[5];
                fArr[2] = f4 / f6;
                fArr[3] = f5 / f6;
                float f7 = p0[6];
                float f8 = p0[7];
                float f9 = f7 + f8 + p0[8];
                fArr[4] = f7 / f9;
                fArr[5] = f8 / f9;
                return fArr;
            }
            kotlin.collections.ArraysKt.copyInto$default(p0, fArr, 0, 0, 6, 6, (java.lang.Object) null);
            return fArr;
        }

        private static float[] getHighResolutionOutputSizeshNQ4ISI(float[] p0, androidx.compose.ui.graphics.colorspace.WhitePoint p1) {
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float x = p1.getX();
            float y = p1.getY();
            float f7 = 1.0f - f;
            float f8 = f7 / f2;
            float f9 = 1.0f - f3;
            float f10 = 1.0f - f5;
            float f11 = (1.0f - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = (f9 / f4) - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / ((((f10 / f6) - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f * f20, f19, f20 * (f7 - f2), f3 * f21, f18, f21 * (f9 - f4), f5 * f22, f17, f22 * (f10 - f6)};
        }

        private static androidx.compose.ui.graphics.colorspace.DoubleFunction getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.graphics.colorspace.TransferParameters p0) {
            if (p0.isHLGish$ui_graphics()) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda4
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getHighSpeedVideoSizes(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return highSpeedVideoSizes;
                    }
                };
            }
            if (p0.isPQish$ui_graphics()) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda5
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double outputFormats;
                        outputFormats = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getOutputFormats(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return outputFormats;
                    }
                };
            }
            if (p0.getE() == 0.0d && p0.getF() == 0.0d) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda6
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double outputMinFrameDuration;
                        outputMinFrameDuration = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getOutputMinFrameDuration(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return outputMinFrameDuration;
                    }
                };
            }
            return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda7
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double highSpeedVideoSizesFor;
                    highSpeedVideoSizesFor = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getHighSpeedVideoSizesFor(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                    return highSpeedVideoSizesFor;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getHighSpeedVideoSizes(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getOutputFormats(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getOutputMinFrameDuration(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getHighSpeedVideoSizesFor(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        private static androidx.compose.ui.graphics.colorspace.DoubleFunction getHighSpeedVideoSizes(final androidx.compose.ui.graphics.colorspace.TransferParameters p0) {
            if (p0.isHLGish$ui_graphics()) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.ui.graphics.colorspace.Rgb.Companion.Camera2StreamConfigurationMap(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return Camera2StreamConfigurationMap;
                    }
                };
            }
            if (p0.isPQish$ui_graphics()) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda1
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return highSpeedVideoFpsRangesFor;
                    }
                };
            }
            if (p0.getE() == 0.0d && p0.getF() == 0.0d) {
                return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda2
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        double highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
            }
            return new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.ui.graphics.colorspace.Rgb.Companion.getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.colorspace.TransferParameters.this, d);
                    return highSpeedVideoFpsRanges;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double Camera2StreamConfigurationMap(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters, double d) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
