package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "LazyLayoutSemanticState", "(Landroidx/compose/foundation/pager/PagerState;Z)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutSemanticStateKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState LazyLayoutSemanticState(final androidx.compose.foundation.pager.PagerState pagerState, final boolean z) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final float getScrollOffset() {
                return androidx.compose.foundation.pager.PagerScrollPositionKt.currentAbsoluteScrollOffset(androidx.compose.foundation.pager.PagerState.this);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final float getMaxScrollOffset() {
                return androidx.compose.foundation.pager.PagerStateKt.calculateNewMaxScrollOffset(androidx.compose.foundation.pager.PagerState.this.getLayoutInfo(), androidx.compose.foundation.pager.PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final java.lang.Object scrollToItem(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object scrollToPage$default = androidx.compose.foundation.pager.PagerState.scrollToPage$default(androidx.compose.foundation.pager.PagerState.this, i, 0.0f, continuation, 2, null);
                return scrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToPage$default : kotlin.Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final androidx.compose.ui.semantics.CollectionInfo collectionInfo() {
                if (z) {
                    return new androidx.compose.ui.semantics.CollectionInfo(androidx.compose.foundation.pager.PagerState.this.getPageCount(), 1);
                }
                return new androidx.compose.ui.semantics.CollectionInfo(1, androidx.compose.foundation.pager.PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final int getViewport() {
                long mo1926getViewportSizeYbymL2g;
                if (androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                    mo1926getViewportSizeYbymL2g = androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().mo1926getViewportSizeYbymL2g() & 4294967295L;
                } else {
                    mo1926getViewportSizeYbymL2g = androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().mo1926getViewportSizeYbymL2g() >> 32;
                }
                return (int) mo1926getViewportSizeYbymL2g;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public final int getContentPadding() {
                return androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getBeforeContentPadding() + androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getAfterContentPadding();
            }
        };
    }
}
