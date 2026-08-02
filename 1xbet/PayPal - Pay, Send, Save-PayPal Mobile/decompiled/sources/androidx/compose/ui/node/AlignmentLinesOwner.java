package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/layout/Measurable;", "", "layoutChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "getPlaceOrder", "()I", "placeOrder", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends androidx.compose.ui.layout.Measurable {
    java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit> block);

    androidx.compose.ui.node.AlignmentLines getAlignmentLines();

    androidx.compose.ui.node.NodeCoordinator getInnerCoordinator();

    androidx.compose.ui.node.AlignmentLinesOwner getParentAlignmentLinesOwner();

    int getPlaceOrder();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
