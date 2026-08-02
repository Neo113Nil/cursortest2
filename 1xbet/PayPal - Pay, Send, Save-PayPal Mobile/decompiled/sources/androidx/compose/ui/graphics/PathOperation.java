package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class PathOperation {
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.PathOperation.Companion INSTANCE = new androidx.compose.ui.graphics.PathOperation.Companion(null);
    private static final int Difference = m6278constructorimpl(0);
    private static final int Intersect = m6278constructorimpl(1);
    private static final int Union = m6278constructorimpl(2);
    private static final int Xor = m6278constructorimpl(3);
    private static final int ReverseDifference = m6278constructorimpl(4);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6278constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6280equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/PathOperation;", "Difference", com.visa.cbp.getEncExpo.warmup, "getDifference-b3I0S0c", "()I", "Intersect", "getIntersect-b3I0S0c", "Union", "getUnion-b3I0S0c", "Xor", "getXor-b3I0S0c", "ReverseDifference", "getReverseDifference-b3I0S0c"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m6284getDifferenceb3I0S0c() {
            return androidx.compose.ui.graphics.PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m6285getIntersectb3I0S0c() {
            return androidx.compose.ui.graphics.PathOperation.Intersect;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m6287getUnionb3I0S0c() {
            return androidx.compose.ui.graphics.PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m6288getXorb3I0S0c() {
            return androidx.compose.ui.graphics.PathOperation.Xor;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m6286getReverseDifferenceb3I0S0c() {
            return androidx.compose.ui.graphics.PathOperation.ReverseDifference;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final java.lang.String toString() {
        return m6282toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6282toStringimpl(int i) {
        return m6280equalsimpl0(i, Difference) ? "Difference" : m6280equalsimpl0(i, Intersect) ? "Intersect" : m6280equalsimpl0(i, Union) ? "Union" : m6280equalsimpl0(i, Xor) ? "Xor" : m6280equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m6281hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m6279equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6281hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6279equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.PathOperation) && i == ((androidx.compose.ui.graphics.PathOperation) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.PathOperation m6277boximpl(int i) {
        return new androidx.compose.ui.graphics.PathOperation(i);
    }
}
