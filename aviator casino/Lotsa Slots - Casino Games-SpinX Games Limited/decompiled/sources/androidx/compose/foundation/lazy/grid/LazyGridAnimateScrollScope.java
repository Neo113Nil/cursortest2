package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridAnimateScrollScope.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J7\u0010\u001c\u001a\u00020\u001d2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f¢\u0006\u0002\b#H\u0096@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\u00020\u001d*\u00020 2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "visibleItemsAverageSize", "getVisibleItemsAverageSize", "calculateDistanceTo", "", "targetIndex", "targetItemOffset", "calculateLineAverageMainAxisSize", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "isVertical", "", "getVisibleItemScrollOffset", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, com.helpshift.proactive.InAppViewConstants.SCROLL, "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "scrollOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridAnimateScrollScope implements androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope {
    public static final int $stable = 0;
    private final androidx.compose.foundation.lazy.grid.LazyGridState state;

    public LazyGridAnimateScrollScope(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState) {
        this.state = lazyGridState;
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
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemsAverageSize() {
        return calculateLineAverageMainAxisSize(this.state.getLayoutInfo(), this.state.getIsVertical());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemScrollOffset(int index) {
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo;
        int m4610getXimpl;
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i);
            if (lazyGridItemInfo.getIndex() == index) {
                break;
            }
            i++;
        }
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 == null) {
            return 0;
        }
        if (this.state.getIsVertical()) {
            m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(lazyGridItemInfo2.getOffset());
        } else {
            m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(lazyGridItemInfo2.getOffset());
        }
        return m4610getXimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public void snapToItem(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, int i2) {
        this.state.snapToItemIndexInternal$foundation_release(i, i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int targetIndex, int targetItemOffset) {
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int visibleItemsAverageSize = getVisibleItemsAverageSize();
        int firstVisibleItemIndex = ((targetIndex - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * (targetIndex < getFirstVisibleItemIndex() ? -1 : 1))) / slotsPerLine$foundation_release;
        int min = java.lang.Math.min(java.lang.Math.abs(targetItemOffset), visibleItemsAverageSize);
        if (targetItemOffset < 0) {
            min *= -1;
        }
        return ((visibleItemsAverageSize * firstVisibleItemIndex) + min) - getFirstVisibleItemScrollOffset();
    }

    private final int calculateLineAverageMainAxisSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo layoutInfo, final boolean isVertical) {
        int m4652getWidthimpl;
        final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                return java.lang.Integer.valueOf(isVertical ? visibleItemsInfo.get(i).getRow() : visibleItemsInfo.get(i).getColumn());
            }
        };
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int intValue = function1.invoke(java.lang.Integer.valueOf(i)).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < visibleItemsInfo.size() && function1.invoke(java.lang.Integer.valueOf(i)).intValue() == intValue) {
                    if (isVertical) {
                        m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(visibleItemsInfo.get(i).getSize());
                    } else {
                        m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(visibleItemsInfo.get(i).getSize());
                    }
                    i4 = java.lang.Math.max(i4, m4652getWidthimpl);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return (i2 / i3) + layoutInfo.getMainAxisItemSpacing();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public java.lang.Object scroll(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(this.state, null, function2, continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }
}
