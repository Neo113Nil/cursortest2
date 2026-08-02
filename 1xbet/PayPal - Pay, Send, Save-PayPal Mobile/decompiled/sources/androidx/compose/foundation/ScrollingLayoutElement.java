package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\r*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "reverseScrolling", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "create", "()Landroidx/compose/foundation/ScrollNode;", "node", "", "update", "(Landroidx/compose/foundation/ScrollNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/foundation/ScrollState;", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "Z", "getReverseScrolling", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollingLayoutElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.ScrollNode> {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final androidx.compose.foundation.ScrollState scrollState;

    public ScrollingLayoutElement(androidx.compose.foundation.ScrollState scrollState, boolean z, boolean z2) {
        this.scrollState = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    public final androidx.compose.foundation.ScrollState getScrollState() {
        return this.scrollState;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.ScrollNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.ScrollNode(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.ScrollNode node) {
        node.setState(this.scrollState);
        node.setReverseScrolling(this.reverseScrolling);
        node.setVertical(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.scrollState.hashCode() * 31) + java.lang.Boolean.hashCode(this.reverseScrolling)) * 31) + java.lang.Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.foundation.ScrollingLayoutElement)) {
            return false;
        }
        androidx.compose.foundation.ScrollingLayoutElement scrollingLayoutElement = (androidx.compose.foundation.ScrollingLayoutElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scrollState, scrollingLayoutElement.scrollState) && this.reverseScrolling == scrollingLayoutElement.reverseScrolling && this.isVertical == scrollingLayoutElement.isVertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        inspectorInfo.getProperties().set("reverseScrolling", java.lang.Boolean.valueOf(this.reverseScrolling));
        inspectorInfo.getProperties().set("isVertical", java.lang.Boolean.valueOf(this.isVertical));
    }
}
