package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "rememberLazyGridSemanticState", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazySemanticsKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState(final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(z)) && (i & 48) != 32) {
            z2 = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final float getScrollOffset() {
                    return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.estimatedLazyScrollOffset(androidx.compose.foundation.lazy.grid.LazyGridState.this.getFirstVisibleItemIndex(), androidx.compose.foundation.lazy.grid.LazyGridState.this.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final float getMaxScrollOffset() {
                    return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(androidx.compose.foundation.lazy.grid.LazyGridState.this.getFirstVisibleItemIndex(), androidx.compose.foundation.lazy.grid.LazyGridState.this.getFirstVisibleItemScrollOffset(), androidx.compose.foundation.lazy.grid.LazyGridState.this.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final java.lang.Object scrollToItem(int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object scrollToItem$default = androidx.compose.foundation.lazy.grid.LazyGridState.scrollToItem$default(androidx.compose.foundation.lazy.grid.LazyGridState.this, i2, 0, continuation, 2, null);
                    return scrollToItem$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem$default : kotlin.Unit.INSTANCE;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final androidx.compose.ui.semantics.CollectionInfo collectionInfo() {
                    return new androidx.compose.ui.semantics.CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final int getViewport() {
                    long mo1826getViewportSizeYbymL2g;
                    if (androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                        mo1826getViewportSizeYbymL2g = androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().mo1826getViewportSizeYbymL2g() & 4294967295L;
                    } else {
                        mo1826getViewportSizeYbymL2g = androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().mo1826getViewportSizeYbymL2g() >> 32;
                    }
                    return (int) mo1826getViewportSizeYbymL2g;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public final int getContentPadding() {
                    return androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().getBeforeContentPadding() + androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().getAfterContentPadding();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
