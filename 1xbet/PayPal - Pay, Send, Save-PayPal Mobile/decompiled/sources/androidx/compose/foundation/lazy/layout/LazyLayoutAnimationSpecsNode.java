package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\f*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setFadeInSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getPlacementSpec", "setPlacementSpec", "getFadeOutSpec", "setFadeOutSpec"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutAnimationSpecsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public static final int $stable = 8;
    private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> fadeInSpec;
    private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> fadeOutSpec;
    private androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> placementSpec;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        return this;
    }

    public LazyLayoutAnimationSpecsNode(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final void setFadeInSpec(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setPlacementSpec(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    public final void setFadeOutSpec(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }
}
