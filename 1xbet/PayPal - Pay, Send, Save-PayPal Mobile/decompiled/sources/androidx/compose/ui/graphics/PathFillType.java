package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/PathFillType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class PathFillType {
    private final int getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.PathFillType.Companion INSTANCE = new androidx.compose.ui.graphics.PathFillType.Companion(null);
    private static final int NonZero = m6268constructorimpl(0);
    private static final int EvenOdd = m6268constructorimpl(1);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6268constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6270equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/PathFillType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/PathFillType;", "NonZero", com.visa.cbp.getEncExpo.warmup, "getNonZero-Rg-k1Os", "()I", "EvenOdd", "getEvenOdd-Rg-k1Os"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m6275getNonZeroRgk1Os() {
            return androidx.compose.ui.graphics.PathFillType.NonZero;
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m6274getEvenOddRgk1Os() {
            return androidx.compose.ui.graphics.PathFillType.EvenOdd;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ PathFillType(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public final java.lang.String toString() {
        return m6272toStringimpl(this.getHighSpeedVideoSizes);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6272toStringimpl(int i) {
        return m6270equalsimpl0(i, NonZero) ? "NonZero" : m6270equalsimpl0(i, EvenOdd) ? "EvenOdd" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return m6271hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m6269equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6271hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6269equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.PathFillType) && i == ((androidx.compose.ui.graphics.PathFillType) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.PathFillType m6267boximpl(int i) {
        return new androidx.compose.ui.graphics.PathFillType(i);
    }
}
