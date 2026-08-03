package androidx.compose.foundation.lazy;

/* compiled from: LazyItemScope.kt */
@androidx.compose.foundation.lazy.LazyScopeMarker
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "animateItemPlacement", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "fillParentMaxHeight", "fraction", "", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyItemScope {
    androidx.compose.ui.Modifier animateItemPlacement(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec);

    androidx.compose.ui.Modifier fillParentMaxHeight(androidx.compose.ui.Modifier modifier, float f);

    androidx.compose.ui.Modifier fillParentMaxSize(androidx.compose.ui.Modifier modifier, float f);

    androidx.compose.ui.Modifier fillParentMaxWidth(androidx.compose.ui.Modifier modifier, float f);

    /* compiled from: LazyItemScope.kt */
    /* renamed from: androidx.compose.foundation.lazy.LazyItemScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxSize$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
            }
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxSize(modifier, f);
        }

        public static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxWidth$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
            }
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxWidth(modifier, f);
        }

        public static /* synthetic */ androidx.compose.ui.Modifier fillParentMaxHeight$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
            }
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxHeight(modifier, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.ui.Modifier animateItemPlacement$default(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
            }
            if ((i & 1) != 0) {
                finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
            }
            return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
    }

    /* compiled from: LazyItemScope.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }
}
