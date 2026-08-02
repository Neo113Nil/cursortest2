package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/ChildSemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "onDetach", "()V", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "setProperties"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChildSemanticsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> properties;

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> getProperties() {
        return this.properties;
    }

    public final void setProperties(kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.properties = function1;
    }

    public ChildSemanticsNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.properties = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, androidx.compose.material3.internal.ParentSemanticsNodeKey.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.ChildSemanticsNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.ChildSemanticsNode.$r8$lambda$ndOjSSKk1rVi7mcO5urVL0EYIVU(androidx.compose.ui.semantics.SemanticsPropertyReceiver.this, (androidx.compose.ui.node.TraversableNode) obj));
            }
        });
        this.properties.invoke(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, androidx.compose.material3.internal.ParentSemanticsNodeKey.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.ChildSemanticsNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.ChildSemanticsNode.$r8$lambda$wM9tCcpaeCtGKUMK_zOvJkAwrhI((androidx.compose.ui.node.TraversableNode) obj));
            }
        });
    }

    public static /* synthetic */ boolean $r8$lambda$ndOjSSKk1rVi7mcO5urVL0EYIVU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.node.TraversableNode traversableNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(traversableNode, "");
        ((androidx.compose.material3.internal.ParentSemanticsNode) traversableNode).obtainSemantics(semanticsPropertyReceiver);
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$wM9tCcpaeCtGKUMK_zOvJkAwrhI(androidx.compose.ui.node.TraversableNode traversableNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(traversableNode, "");
        ((androidx.compose.material3.internal.ParentSemanticsNode) traversableNode).releaseSemantics();
        return false;
    }
}
