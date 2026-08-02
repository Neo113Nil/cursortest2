package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/material3/RailPredictiveBackState;", "", "<init>", "()V", "", "isSwipeEdgeLeft", "isRtl", "", "update", "(ZZ)V", "<set-?>", "swipeEdgeMatchesRail$delegate", "Landroidx/compose/runtime/MutableState;", "getSwipeEdgeMatchesRail", "()Z", "setSwipeEdgeMatchesRail", "(Z)V", "swipeEdgeMatchesRail"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RailPredictiveBackState {
    public static final int $stable = 0;

    /* renamed from: swipeEdgeMatchesRail$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState swipeEdgeMatchesRail = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesRail() {
        return ((java.lang.Boolean) this.swipeEdgeMatchesRail.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesRail(boolean z) {
        this.swipeEdgeMatchesRail.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void update(boolean isSwipeEdgeLeft, boolean isRtl) {
        setSwipeEdgeMatchesRail((isSwipeEdgeLeft && !isRtl) || (!isSwipeEdgeLeft && isRtl));
    }
}
