package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class RenderIntent {
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.RenderIntent.Companion INSTANCE = new androidx.compose.ui.graphics.colorspace.RenderIntent.Companion(null);
    private static final int Perceptual = m6413constructorimpl(0);
    private static final int Relative = m6413constructorimpl(1);
    private static final int Saturation = m6413constructorimpl(2);
    private static final int Absolute = m6413constructorimpl(3);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6413constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6415equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "Perceptual", com.visa.cbp.getEncExpo.warmup, "getPerceptual-uksYyKA", "()I", "Relative", "getRelative-uksYyKA", androidx.exifinterface.media.ExifInterface.TAG_SATURATION, "getSaturation-uksYyKA", "Absolute", "getAbsolute-uksYyKA"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m6420getPerceptualuksYyKA() {
            return androidx.compose.ui.graphics.colorspace.RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m6421getRelativeuksYyKA() {
            return androidx.compose.ui.graphics.colorspace.RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m6422getSaturationuksYyKA() {
            return androidx.compose.ui.graphics.colorspace.RenderIntent.Saturation;
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m6419getAbsoluteuksYyKA() {
            return androidx.compose.ui.graphics.colorspace.RenderIntent.Absolute;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ RenderIntent(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m6417toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6417toStringimpl(int i) {
        return m6415equalsimpl0(i, Perceptual) ? "Perceptual" : m6415equalsimpl0(i, Relative) ? "Relative" : m6415equalsimpl0(i, Saturation) ? androidx.exifinterface.media.ExifInterface.TAG_SATURATION : m6415equalsimpl0(i, Absolute) ? "Absolute" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m6416hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m6414equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6416hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6414equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.colorspace.RenderIntent) && i == ((androidx.compose.ui.graphics.colorspace.RenderIntent) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.colorspace.RenderIntent m6412boximpl(int i) {
        return new androidx.compose.ui.graphics.colorspace.RenderIntent(i);
    }
}
