package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FinalSnappingItem {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion INSTANCE = new androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion(null);
    private static final int ClosestItem = m1557constructorimpl(0);
    private static final int NextItem = m1557constructorimpl(1);
    private static final int PreviousItem = m1557constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1557constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1559equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "ClosestItem", com.visa.cbp.getEncExpo.warmup, "getClosestItem-bbeMdSM", "()I", "NextItem", "getNextItem-bbeMdSM", "PreviousItem", "getPreviousItem-bbeMdSM"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m1563getClosestItembbeMdSM() {
            return androidx.compose.foundation.gestures.snapping.FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m1564getNextItembbeMdSM() {
            return androidx.compose.foundation.gestures.snapping.FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m1565getPreviousItembbeMdSM() {
            return androidx.compose.foundation.gestures.snapping.FinalSnappingItem.PreviousItem;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ FinalSnappingItem(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m1561toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m1560hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m1558equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1561toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinalSnappingItem(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1560hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1558equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.gestures.snapping.FinalSnappingItem) && i == ((androidx.compose.foundation.gestures.snapping.FinalSnappingItem) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.gestures.snapping.FinalSnappingItem m1556boximpl(int i) {
        return new androidx.compose.foundation.gestures.snapping.FinalSnappingItem(i);
    }
}
