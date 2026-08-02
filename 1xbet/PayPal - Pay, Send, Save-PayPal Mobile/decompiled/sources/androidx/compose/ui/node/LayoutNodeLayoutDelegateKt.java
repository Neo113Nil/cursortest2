package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a@\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\b¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u00020\n*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/layout/Measurable;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/collection/MutableVector;", "destination", "Lkotlin/Function1;", "transform", "", "updateChildMeasurables", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function1;)V", "", "isOutMostLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "MeasuredTwiceErrorMessage", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final java.lang.String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui != null ? parent$ui.getLookaheadRoot() : null) == null || layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPass();
    }

    public static final <T extends androidx.compose.ui.layout.Measurable> void updateChildMeasurables(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.collection.MutableVector<T> mutableVector, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, ? extends T> function1) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNodeArr[i];
            if (mutableVector.getSize() <= i) {
                mutableVector.add(function1.invoke(layoutNode2));
            } else {
                mutableVector.set(i, function1.invoke(layoutNode2));
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui().size(), mutableVector.getSize());
    }
}
