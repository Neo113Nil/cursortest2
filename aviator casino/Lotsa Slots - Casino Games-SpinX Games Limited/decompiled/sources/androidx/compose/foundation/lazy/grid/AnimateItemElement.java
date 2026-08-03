package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridItemScopeImpl.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/grid/AnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "placementSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getPlacementSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class AnimateItemElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode> {
    private final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> placementSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.foundation.lazy.grid.AnimateItemElement copy$default(androidx.compose.foundation.lazy.grid.AnimateItemElement animateItemElement, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = animateItemElement.placementSpec;
        }
        return animateItemElement.copy(finiteAnimationSpec);
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> component1() {
        return this.placementSpec;
    }

    public final androidx.compose.foundation.lazy.grid.AnimateItemElement copy(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> placementSpec) {
        return new androidx.compose.foundation.lazy.grid.AnimateItemElement(placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.lazy.grid.AnimateItemElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.placementSpec, ((androidx.compose.foundation.lazy.grid.AnimateItemElement) other).placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.placementSpec.hashCode();
    }

    public java.lang.String toString() {
        return "AnimateItemElement(placementSpec=" + this.placementSpec + ')';
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public AnimateItemElement(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode create() {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode(null, this.placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode node) {
        node.setPlacementSpec(this.placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.placementSpec);
    }
}
