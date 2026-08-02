package androidx.compose.foundation.lazy;

@androidx.compose.foundation.lazy.LazyScopeMarker
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0006JI\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "animateItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyItemScope {
    default androidx.compose.ui.Modifier animateItem(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3) {
        return modifier;
    }

    androidx.compose.ui.Modifier fillParentMaxHeight(androidx.compose.ui.Modifier modifier, float f);

    androidx.compose.ui.Modifier fillParentMaxSize(androidx.compose.ui.Modifier modifier, float f);

    androidx.compose.ui.Modifier fillParentMaxWidth(androidx.compose.ui.Modifier modifier, float f);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier animateItem(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3) {
            return androidx.compose.foundation.lazy.LazyItemScope.super.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
        }
    }

    static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxSize$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f);
    }

    static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxWidth$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f);
    }

    static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxHeight$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.Modifier animateItem$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec3, int i, java.lang.Object obj) {
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
        return lazyItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }
}
