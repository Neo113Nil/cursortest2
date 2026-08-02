package androidx.compose.foundation.lazy.grid;

@androidx.compose.foundation.lazy.grid.LazyGridScopeMarker
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001JI\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "animateItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyGridItemScope {
    androidx.compose.ui.Modifier animateItem(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.Modifier animateItem$default(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec3 = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return lazyGridItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }
}
