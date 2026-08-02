package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ClipOp;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ClipOp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.ClipOp.Companion INSTANCE = new androidx.compose.ui.graphics.ClipOp.Companion(null);
    private static final int Difference = m5978constructorimpl(0);
    private static final int Intersect = m5978constructorimpl(1);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5978constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5980equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/ClipOp$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ClipOp;", "Difference", com.visa.cbp.getEncExpo.warmup, "getDifference-rtfAjoo", "()I", "Intersect", "getIntersect-rtfAjoo"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m5984getDifferencertfAjoo() {
            return androidx.compose.ui.graphics.ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m5985getIntersectrtfAjoo() {
            return androidx.compose.ui.graphics.ClipOp.Intersect;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ClipOp(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m5982toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5982toStringimpl(int i) {
        return m5980equalsimpl0(i, Difference) ? "Difference" : m5980equalsimpl0(i, Intersect) ? "Intersect" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m5981hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m5979equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5981hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5979equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.ClipOp) && i == ((androidx.compose.ui.graphics.ClipOp) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.ClipOp m5977boximpl(int i) {
        return new androidx.compose.ui.graphics.ClipOp(i);
    }
}
