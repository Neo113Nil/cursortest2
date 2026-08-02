package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DelegatableNode;", "p0", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;)V", "", "onAttach", "()V", "onDetach", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/DelegatableNode;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OverscrollModifierNode extends androidx.compose.ui.node.DelegatingNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.node.DelegatableNode getHighSpeedVideoFpsRangesFor;

    public OverscrollModifierNode(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        this.getHighSpeedVideoFpsRangesFor = delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getHighSpeedVideoFpsRangesFor;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNode p0) {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getHighSpeedVideoFpsRangesFor;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.getHighSpeedVideoFpsRangesFor = p0;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.node.DelegatableNode delegatableNode;
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.DelegatableNode delegatableNode2 = this.getHighSpeedVideoFpsRangesFor;
        if (delegatableNode2 == null || (node = delegatableNode2.getNode()) == null || node.getIsAttached()) {
            delegatableNode = null;
        } else {
            androidx.compose.ui.node.DelegatableNode delegatableNode3 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(delegatableNode3);
            delegatableNode = delegate(delegatableNode3);
        }
        this.getHighSpeedVideoFpsRangesFor = delegatableNode;
    }
}
