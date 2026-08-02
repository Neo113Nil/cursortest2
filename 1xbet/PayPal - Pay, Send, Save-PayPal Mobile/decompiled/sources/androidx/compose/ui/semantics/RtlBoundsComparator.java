package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/semantics/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/getOutputStallDuration;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RtlBoundsComparator implements java.util.Comparator<androidx.compose.ui.semantics.SemanticsNode> {
    public static final androidx.compose.ui.semantics.RtlBoundsComparator INSTANCE = new androidx.compose.ui.semantics.RtlBoundsComparator();

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.compose.ui.semantics.SemanticsNode semanticsNode2) {
        androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
        androidx.compose.ui.geometry.Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
        int compare = java.lang.Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
        if (compare != 0) {
            return compare;
        }
        int compare2 = java.lang.Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = java.lang.Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
        return compare3 != 0 ? compare3 : java.lang.Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
    }
}
