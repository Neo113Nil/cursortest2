package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000b"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/MeasurePolicy;", "policy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "", "updateFrom", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "minLookaheadIntrinsicWidth", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "p0", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoSizes;
    private final androidx.compose.ui.node.LayoutNode layoutNode;

    public IntrinsicsPolicy(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
        this.layoutNode = layoutNode;
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    private final androidx.compose.ui.layout.MeasurePolicy getHighSpeedVideoFpsRangesFor() {
        return (androidx.compose.ui.layout.MeasurePolicy) this.getHighSpeedVideoSizes.getValue();
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
        this.getHighSpeedVideoSizes.setValue(measurePolicy);
    }

    public final void updateFrom(androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
        getHighSpeedVideoSizes(measurePolicy);
    }

    public final int minIntrinsicWidth(int height) {
        return getHighSpeedVideoFpsRangesFor().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), height);
    }

    public final int minIntrinsicHeight(int width) {
        return getHighSpeedVideoFpsRangesFor().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), width);
    }

    public final int maxIntrinsicWidth(int height) {
        return getHighSpeedVideoFpsRangesFor().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), height);
    }

    public final int maxIntrinsicHeight(int width) {
        return getHighSpeedVideoFpsRangesFor().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), width);
    }

    public final int minLookaheadIntrinsicWidth(int height) {
        return getHighSpeedVideoFpsRangesFor().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), height);
    }

    public final int minLookaheadIntrinsicHeight(int width) {
        return getHighSpeedVideoFpsRangesFor().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), width);
    }

    public final int maxLookaheadIntrinsicWidth(int height) {
        return getHighSpeedVideoFpsRangesFor().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), height);
    }

    public final int maxLookaheadIntrinsicHeight(int width) {
        return getHighSpeedVideoFpsRangesFor().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), width);
    }
}
