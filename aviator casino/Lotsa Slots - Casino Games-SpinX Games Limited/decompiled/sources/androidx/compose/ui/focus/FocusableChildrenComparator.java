package androidx.compose.ui.focus;

/* compiled from: OneDimensionalFocusSearch.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "()V", "compare", "", "focusTarget1", "focusTarget2", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableChildrenComparator implements java.util.Comparator<androidx.compose.ui.focus.FocusTargetNode> {
    public static final androidx.compose.ui.focus.FocusableChildrenComparator INSTANCE = new androidx.compose.ui.focus.FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    @Override // java.util.Comparator
    public int compare(androidx.compose.ui.focus.FocusTargetNode focusTarget1, androidx.compose.ui.focus.FocusTargetNode focusTarget2) {
        if (focusTarget1 == null) {
            throw new java.lang.IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (focusTarget2 == null) {
            throw new java.lang.IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        int i = 0;
        if (!androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTarget1) || !androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTarget2)) {
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTarget1)) {
                return -1;
            }
            return androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTarget2) ? 1 : 0;
        }
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTarget1);
        androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTarget2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(requireLayoutNode, requireLayoutNode2)) {
            return 0;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> pathFromRoot = pathFromRoot(requireLayoutNode);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> pathFromRoot2 = pathFromRoot(requireLayoutNode2);
        int min = java.lang.Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
        if (min >= 0) {
            while (kotlin.jvm.internal.Intrinsics.areEqual(pathFromRoot.getContent()[i], pathFromRoot2.getContent()[i])) {
                if (i != min) {
                    i++;
                }
            }
            return kotlin.jvm.internal.Intrinsics.compare(pathFromRoot.getContent()[i].getPlaceOrder$ui_release(), pathFromRoot2.getContent()[i].getPlaceOrder$ui_release());
        }
        throw new java.lang.IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }

    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> pathFromRoot(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}
