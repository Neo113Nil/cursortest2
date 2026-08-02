package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "create", "()Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WithAlignmentLineElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.layout.AlignmentLine alignmentLine;

    public WithAlignmentLineElement(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    public final androidx.compose.ui.layout.AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineNode(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.layout.SiblingsAlignedNode.WithAlignmentLineNode node) {
        node.setAlignmentLine(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        androidx.compose.foundation.layout.WithAlignmentLineElement withAlignmentLineElement = other instanceof androidx.compose.foundation.layout.WithAlignmentLineElement ? (androidx.compose.foundation.layout.WithAlignmentLineElement) other : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }
}
