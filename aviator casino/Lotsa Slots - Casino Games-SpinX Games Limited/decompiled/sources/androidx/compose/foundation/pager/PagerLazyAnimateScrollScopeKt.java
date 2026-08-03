package androidx.compose.foundation.pager;

/* compiled from: PagerLazyAnimateScrollScope.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"PagerLazyAnimateScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerLazyAnimateScrollScopeKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope PagerLazyAnimateScrollScope(final androidx.compose.foundation.pager.PagerState pagerState) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope() { // from class: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemIndex() {
                return androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemScrollOffset() {
                return androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePageOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getLastVisibleItemIndex() {
                return ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getVisiblePagesInfo())).getIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getItemCount() {
                return androidx.compose.foundation.pager.PagerState.this.getPageCount();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemScrollOffset(int index) {
                androidx.compose.foundation.pager.PageInfo pageInfo;
                java.util.List<androidx.compose.foundation.pager.PageInfo> visiblePagesInfo = androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pageInfo = null;
                        break;
                    }
                    pageInfo = visiblePagesInfo.get(i);
                    if (pageInfo.getIndex() == index) {
                        break;
                    }
                    i++;
                }
                androidx.compose.foundation.pager.PageInfo pageInfo2 = pageInfo;
                if (pageInfo2 != null) {
                    return pageInfo2.getOffset();
                }
                return 0;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public void snapToItem(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, int i2) {
                androidx.compose.foundation.pager.PagerState.this.snapToItem$foundation_release(i, i2 / androidx.compose.foundation.pager.PagerState.this.getPageSizeWithSpacing$foundation_release());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public float calculateDistanceTo(int targetIndex, int targetItemOffset) {
                return ((targetIndex - androidx.compose.foundation.pager.PagerState.this.getCurrentPage()) * getVisibleItemsAverageSize()) + targetItemOffset;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public java.lang.Object scroll(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(androidx.compose.foundation.pager.PagerState.this, null, function2, continuation, 1, null);
                return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemsAverageSize() {
                return androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation_release() + androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation_release();
            }
        };
    }
}
