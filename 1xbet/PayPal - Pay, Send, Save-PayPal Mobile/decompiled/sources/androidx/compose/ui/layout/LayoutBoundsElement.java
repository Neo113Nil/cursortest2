package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Landroidx/compose/ui/layout/LayoutBoundsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutBoundsNode;", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "holder", "<init>", "(Landroidx/compose/ui/layout/LayoutBoundsHolder;)V", "create", "()Landroidx/compose/ui/layout/LayoutBoundsNode;", "node", "", "update", "(Landroidx/compose/ui/layout/LayoutBoundsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/layout/LayoutBoundsHolder;", "copy", "(Landroidx/compose/ui/layout/LayoutBoundsHolder;)Landroidx/compose/ui/layout/LayoutBoundsElement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "getHolder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LayoutBoundsElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.LayoutBoundsNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.layout.LayoutBoundsHolder holder;

    public LayoutBoundsElement(androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final androidx.compose.ui.layout.LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.layout.LayoutBoundsNode create() {
        return new androidx.compose.ui.layout.LayoutBoundsNode(this.holder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.layout.LayoutBoundsNode node) {
        node.setHolder(this.holder);
        node.forceUpdate();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutBounds");
        inspectorInfo.getProperties().set("holder", this.holder);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutBoundsElement(holder=");
        sb.append(this.holder);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.holder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.layout.LayoutBoundsElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.holder, ((androidx.compose.ui.layout.LayoutBoundsElement) other).holder);
    }

    public final androidx.compose.ui.layout.LayoutBoundsElement copy(androidx.compose.ui.layout.LayoutBoundsHolder holder) {
        return new androidx.compose.ui.layout.LayoutBoundsElement(holder);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.layout.LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    public static /* synthetic */ androidx.compose.ui.layout.LayoutBoundsElement copy$default(androidx.compose.ui.layout.LayoutBoundsElement layoutBoundsElement, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            layoutBoundsHolder = layoutBoundsElement.holder;
        }
        return layoutBoundsElement.copy(layoutBoundsHolder);
    }
}
