package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridAnimateScrollScope.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J7\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\u00020\u0018*\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "visibleItemsAverageSize", "getVisibleItemsAverageSize", "calculateDistanceTo", "", "targetIndex", "targetItemOffset", "getVisibleItemScrollOffset", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, com.helpshift.proactive.InAppViewConstants.SCROLL, "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "scrollOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridAnimateScrollScope implements androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope {
    public static final int $stable = 8;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState) {
        this.state = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getLastVisibleItemIndex() {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemScrollOffset(final int index) {
        long offset = this.state.getLayoutInfo().getVisibleItemsInfo().get(kotlin.collections.CollectionsKt.binarySearch$default(this.state.getLayoutInfo().getVisibleItemsInfo(), 0, 0, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, java.lang.Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridAnimateScrollScope$getVisibleItemScrollOffset$searchedIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Integer invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                return java.lang.Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - index);
            }
        }, 3, (java.lang.Object) null)).getOffset();
        return this.state.getIsVertical() ? androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset) : androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public void snapToItem(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, int i2) {
        this.state.snapToItemInternal$foundation_release(scrollScope, i, i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int targetIndex, int targetItemOffset) {
        int visibleItemsAverageSize = getVisibleItemsAverageSize();
        int laneCount$foundation_release = (targetIndex / this.state.getLaneCount$foundation_release()) - (getFirstVisibleItemIndex() / this.state.getLaneCount$foundation_release());
        int min = java.lang.Math.min(java.lang.Math.abs(targetItemOffset), visibleItemsAverageSize);
        if (targetItemOffset < 0) {
            min *= -1;
        }
        return ((visibleItemsAverageSize * laneCount$foundation_release) + min) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public java.lang.Object scroll(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(this.state, null, function2, continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemsAverageSize() {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo layoutInfo = this.state.getLayoutInfo();
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i2);
            i += this.state.getIsVertical() ? androidx.compose.ui.unit.IntSize.m4651getHeightimpl(lazyStaggeredGridItemInfo.getSize()) : androidx.compose.ui.unit.IntSize.m4652getWidthimpl(lazyStaggeredGridItemInfo.getSize());
        }
        return (i / visibleItemsInfo.size()) + layoutInfo.getMainAxisItemSpacing();
    }
}
