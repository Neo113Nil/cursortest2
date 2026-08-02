package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentListener;)V", "create", "()Landroidx/compose/foundation/content/ReceiveContentNode;", "node", "", "update", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "copy", "(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/ReceiveContentElement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReceiveContentElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.content.ReceiveContentNode> {
    public static final int $stable = 0;
    private final androidx.compose.foundation.content.ReceiveContentListener receiveContentListener;

    public ReceiveContentElement(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public final androidx.compose.foundation.content.ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.foundation.content.ReceiveContentNode create() {
        return new androidx.compose.foundation.content.ReceiveContentNode(this.receiveContentListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.content.ReceiveContentNode node) {
        node.updateNode(this.receiveContentListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("receiveContent");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveContentElement(receiveContentListener=");
        sb.append(this.receiveContentListener);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.content.ReceiveContentElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveContentListener, ((androidx.compose.foundation.content.ReceiveContentElement) other).receiveContentListener);
    }

    public final androidx.compose.foundation.content.ReceiveContentElement copy(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        return new androidx.compose.foundation.content.ReceiveContentElement(receiveContentListener);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.foundation.content.ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public static /* synthetic */ androidx.compose.foundation.content.ReceiveContentElement copy$default(androidx.compose.foundation.content.ReceiveContentElement receiveContentElement, androidx.compose.foundation.content.ReceiveContentListener receiveContentListener, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            receiveContentListener = receiveContentElement.receiveContentListener;
        }
        return receiveContentElement.copy(receiveContentListener);
    }
}
