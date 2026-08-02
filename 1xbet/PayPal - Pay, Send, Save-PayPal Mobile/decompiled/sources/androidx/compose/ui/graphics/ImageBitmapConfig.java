package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ImageBitmapConfig {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.ImageBitmapConfig.Companion INSTANCE = new androidx.compose.ui.graphics.ImageBitmapConfig.Companion(null);
    private static final int Argb8888 = m6203constructorimpl(0);
    private static final int Alpha8 = m6203constructorimpl(1);
    private static final int Rgb565 = m6203constructorimpl(2);
    private static final int F16 = m6203constructorimpl(3);
    private static final int Gpu = m6203constructorimpl(4);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6203constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6205equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "Argb8888", com.visa.cbp.getEncExpo.warmup, "getArgb8888-_sVssgQ", "()I", "Alpha8", "getAlpha8-_sVssgQ", "Rgb565", "getRgb565-_sVssgQ", "F16", "getF16-_sVssgQ", "Gpu", "getGpu-_sVssgQ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m6210getArgb8888_sVssgQ() {
            return androidx.compose.ui.graphics.ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m6209getAlpha8_sVssgQ() {
            return androidx.compose.ui.graphics.ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m6213getRgb565_sVssgQ() {
            return androidx.compose.ui.graphics.ImageBitmapConfig.Rgb565;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m6211getF16_sVssgQ() {
            return androidx.compose.ui.graphics.ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m6212getGpu_sVssgQ() {
            return androidx.compose.ui.graphics.ImageBitmapConfig.Gpu;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m6207toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6207toStringimpl(int i) {
        return m6205equalsimpl0(i, Argb8888) ? "Argb8888" : m6205equalsimpl0(i, Alpha8) ? "Alpha8" : m6205equalsimpl0(i, Rgb565) ? "Rgb565" : m6205equalsimpl0(i, F16) ? "F16" : m6205equalsimpl0(i, Gpu) ? "Gpu" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6208unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m6206hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m6204equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6206hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6204equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.ImageBitmapConfig) && i == ((androidx.compose.ui.graphics.ImageBitmapConfig) obj).m6208unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.ImageBitmapConfig m6202boximpl(int i) {
        return new androidx.compose.ui.graphics.ImageBitmapConfig(i);
    }
}
