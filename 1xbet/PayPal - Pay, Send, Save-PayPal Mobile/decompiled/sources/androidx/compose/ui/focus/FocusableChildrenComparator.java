package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/getOutputStallDuration;", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "p0", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/collection/MutableVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusableChildrenComparator implements java.util.Comparator<androidx.compose.ui.focus.FocusTargetNode> {
    public static final androidx.compose.ui.focus.FocusableChildrenComparator INSTANCE = new androidx.compose.ui.focus.FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i = 0;
        if (!androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) || !androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4)) {
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3)) {
                return -1;
            }
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4)) {
                return 1;
            }
        } else {
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(requireLayoutNode, requireLayoutNode2)) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(requireLayoutNode);
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(requireLayoutNode2);
                int min = java.lang.Math.min(highSpeedVideoFpsRangesFor.getSize() - 1, highSpeedVideoFpsRangesFor2.getSize() - 1);
                if (min >= 0) {
                    while (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.content[i], highSpeedVideoFpsRangesFor2.content[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.Intrinsics.compare(highSpeedVideoFpsRangesFor.content[i].getPlaceOrder$ui(), highSpeedVideoFpsRangesFor2.content[i].getPlaceOrder$ui());
                }
                throw new java.lang.IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
            }
        }
        return 0;
    }

    private static androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode p0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNode[16], 0);
        while (p0 != null) {
            mutableVector.add(0, p0);
            p0 = p0.getParent$ui();
        }
        return mutableVector;
    }
}
