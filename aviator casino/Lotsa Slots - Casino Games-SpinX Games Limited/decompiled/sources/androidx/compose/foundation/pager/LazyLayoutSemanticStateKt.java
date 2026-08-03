package androidx.compose.foundation.pager;

/* compiled from: LazyLayoutSemanticState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState LazyLayoutSemanticState(final androidx.compose.foundation.pager.PagerState pagerState, final boolean z) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
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
                return androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePageOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getFirstVisibleItemIndex() {
                return androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return androidx.compose.foundation.pager.PagerState.this.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public java.lang.Object animateScrollBy(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object animateScrollBy$default = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(androidx.compose.foundation.pager.PagerState.this, f, null, continuation, 2, null);
                return animateScrollBy$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy$default : kotlin.Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public java.lang.Object scrollToItem(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object scrollToPage$default = androidx.compose.foundation.pager.PagerState.scrollToPage$default(androidx.compose.foundation.pager.PagerState.this, i, 0.0f, continuation, 2, null);
                return scrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToPage$default : kotlin.Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public androidx.compose.ui.semantics.CollectionInfo collectionInfo() {
                if (z) {
                    return new androidx.compose.ui.semantics.CollectionInfo(androidx.compose.foundation.pager.PagerState.this.getPageCount(), 1);
                }
                return new androidx.compose.ui.semantics.CollectionInfo(1, androidx.compose.foundation.pager.PagerState.this.getPageCount());
            }
        };
    }
}
