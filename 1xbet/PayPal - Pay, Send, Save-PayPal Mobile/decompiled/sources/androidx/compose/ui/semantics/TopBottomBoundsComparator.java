package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/semantics/TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/getOutputStallDuration;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TopBottomBoundsComparator implements java.util.Comparator<kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>>> {
    public static final androidx.compose.ui.semantics.TopBottomBoundsComparator INSTANCE = new androidx.compose.ui.semantics.TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair, kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair2) {
        kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair3 = pair;
        kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair4 = pair2;
        int compare = java.lang.Float.compare(pair3.getFirst().getTop(), pair4.getFirst().getTop());
        return compare != 0 ? compare : java.lang.Float.compare(pair3.getFirst().getBottom(), pair4.getFirst().getBottom());
    }
}
