package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/MinimumInteractiveModifierNode;", "<init>", "()V", "create", "()Landroidx/compose/material3/MinimumInteractiveModifierNode;", "node", "", "update", "(Landroidx/compose/material3/MinimumInteractiveModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinimumInteractiveModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.MinimumInteractiveModifierNode> {
    public static final int $stable = 0;
    public static final androidx.compose.material3.MinimumInteractiveModifier INSTANCE = new androidx.compose.material3.MinimumInteractiveModifier();

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        return other == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.material3.MinimumInteractiveModifierNode node) {
    }

    private MinimumInteractiveModifier() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.material3.MinimumInteractiveModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.material3.MinimumInteractiveModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveComponentSize");
        inspectorInfo.getProperties().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return androidx.compose.material3.internal.System_jvmKt.identityHashCode(this);
    }
}
