package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0004R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsets;", "ancestorConsumedInsets", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "onAttach", "onDetach", "onReset", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "insetsInvalidated", "Landroidx/compose/foundation/layout/WindowInsets;", "getAncestorConsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "consumedInsets", "getConsumedInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InsetsConsumingModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.layout.WindowInsets ancestorConsumedInsets = androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets();
    private androidx.compose.foundation.layout.WindowInsets consumedInsets = androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets();

    public abstract androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets ancestorConsumedInsets);

    public final androidx.compose.foundation.layout.WindowInsets getAncestorConsumedInsets() {
        return this.ancestorConsumedInsets;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public java.lang.Object getTraverseKey() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public final androidx.compose.foundation.layout.WindowInsets getConsumedInsets() {
        return this.consumedInsets;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, getTraverseKey(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.InsetsConsumingModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.InsetsConsumingModifierNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.InsetsConsumingModifierNode.this, (androidx.compose.ui.node.TraversableNode) obj);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        });
        insetsInvalidated();
        super.onAttach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.InsetsConsumingModifierNode insetsConsumingModifierNode, androidx.compose.ui.node.TraversableNode traversableNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(traversableNode, "");
        insetsConsumingModifierNode.ancestorConsumedInsets = ((androidx.compose.foundation.layout.InsetsConsumingModifierNode) traversableNode).consumedInsets;
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.consumedInsets = this.ancestorConsumedInsets;
        getHighSpeedVideoFpsRanges();
        super.onDetach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        this.ancestorConsumedInsets = androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets();
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.WindowInsets p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.ancestorConsumedInsets, p0)) {
            return;
        }
        this.ancestorConsumedInsets = p0;
        insetsInvalidated();
    }

    public void insetsInvalidated() {
        this.consumedInsets = calculateInsets(this.ancestorConsumedInsets);
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(this, getTraverseKey(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.InsetsConsumingModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.InsetsConsumingModifierNode.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.InsetsConsumingModifierNode.this, (androidx.compose.ui.node.TraversableNode) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.InsetsConsumingModifierNode insetsConsumingModifierNode, androidx.compose.ui.node.TraversableNode traversableNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(traversableNode, "");
        ((androidx.compose.foundation.layout.InsetsConsumingModifierNode) traversableNode).getHighSpeedVideoFpsRanges(insetsConsumingModifierNode.consumedInsets);
        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }
}
