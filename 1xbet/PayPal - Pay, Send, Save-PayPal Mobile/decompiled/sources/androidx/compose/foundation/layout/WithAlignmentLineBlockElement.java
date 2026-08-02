package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\f*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineBlockElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WithAlignmentLineBlockElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineBlockNode> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> block;

    /* JADX WARN: Multi-variable type inference failed */
    public WithAlignmentLineBlockElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        this.block = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> getBlock() {
        return this.block;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineBlockNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineBlockNode node) {
        node.setBlock(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        androidx.compose.foundation.layout.WithAlignmentLineBlockElement withAlignmentLineBlockElement = other instanceof androidx.compose.foundation.layout.WithAlignmentLineBlockElement ? (androidx.compose.foundation.layout.WithAlignmentLineBlockElement) other : null;
        return withAlignmentLineBlockElement != null && this.block == withAlignmentLineBlockElement.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }
}
