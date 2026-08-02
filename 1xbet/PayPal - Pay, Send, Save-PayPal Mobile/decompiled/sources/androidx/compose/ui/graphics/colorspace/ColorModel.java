package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u000e8G¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoSizes", "getComponentCount-impl", "(J)I", "getComponentCount$annotations", "()V", "componentCount", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ColorModel {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.ColorModel.Companion INSTANCE = new androidx.compose.ui.graphics.colorspace.ColorModel.Companion(null);
    private static final long Rgb = m6393constructorimpl(12884901888L);
    private static final long Xyz = m6393constructorimpl(12884901889L);
    private static final long Lab = m6393constructorimpl(12884901890L);
    private static final long Cmyk = m6393constructorimpl(17179869187L);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6393constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6395equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m6396getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ ColorModel(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "Rgb", "J", "getRgb-xdoWZVw", "()J", "Xyz", "getXyz-xdoWZVw", "Lab", "getLab-xdoWZVw", "Cmyk", "getCmyk-xdoWZVw"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m6402getRgbxdoWZVw() {
            return androidx.compose.ui.graphics.colorspace.ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m6403getXyzxdoWZVw() {
            return androidx.compose.ui.graphics.colorspace.ColorModel.Xyz;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m6401getLabxdoWZVw() {
            return androidx.compose.ui.graphics.colorspace.ColorModel.Lab;
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m6400getCmykxdoWZVw() {
            return androidx.compose.ui.graphics.colorspace.ColorModel.Cmyk;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m6398toStringimpl(this.getHighSpeedVideoSizes);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6398toStringimpl(long j) {
        return m6395equalsimpl0(j, Rgb) ? "Rgb" : m6395equalsimpl0(j, Xyz) ? "Xyz" : m6395equalsimpl0(j, Lab) ? "Lab" : m6395equalsimpl0(j, Cmyk) ? "Cmyk" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return m6397hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m6394equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6397hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6394equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.colorspace.ColorModel) && j == ((androidx.compose.ui.graphics.colorspace.ColorModel) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.colorspace.ColorModel m6392boximpl(long j) {
        return new androidx.compose.ui.graphics.colorspace.ColorModel(j);
    }
}
