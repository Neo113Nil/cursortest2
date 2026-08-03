package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridSemantics.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyStaggeredGridSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "reverseScrolling", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridSemanticsKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1629354903);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberLazyStaggeredGridSemanticState)P(1)31@1206L756:LazyStaggeredGridSemantics.kt#fzvcnm");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        composer.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(lazyStaggeredGridState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public /* synthetic */ float pseudoMaxScrollOffset() {
                    return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState.CC.$default$pseudoMaxScrollOffset(this);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public /* synthetic */ float pseudoScrollOffset() {
                    return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState.CC.$default$pseudoScrollOffset(this);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemScrollOffset() {
                    return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getFirstVisibleItemScrollOffset();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemIndex() {
                    return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getFirstVisibleItemIndex();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean getCanScrollForward() {
                    return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getCanScrollForward();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public java.lang.Object animateScrollBy(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object animateScrollBy$default = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, f, null, continuation, 2, null);
                    return animateScrollBy$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy$default : kotlin.Unit.INSTANCE;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public java.lang.Object scrollToItem(int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object scrollToItem$default = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, i2, 0, continuation, 2, null);
                    return scrollToItem$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem$default : kotlin.Unit.INSTANCE;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public androidx.compose.ui.semantics.CollectionInfo collectionInfo() {
                    return new androidx.compose.ui.semantics.CollectionInfo(-1, -1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1;
    }
}
