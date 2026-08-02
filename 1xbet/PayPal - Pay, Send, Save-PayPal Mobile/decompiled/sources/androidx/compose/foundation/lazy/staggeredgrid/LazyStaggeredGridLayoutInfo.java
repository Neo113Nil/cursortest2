package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r\u0082\u0001\u0001\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "", "getTotalItemsCount", "()I", "totalItemsCount", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getViewportStartOffset", "viewportStartOffset", "getViewportEndOffset", "viewportEndOffset", "getBeforeContentPadding", "beforeContentPadding", "getAfterContentPadding", "afterContentPadding", "getMainAxisItemSpacing", "mainAxisItemSpacing", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyStaggeredGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    androidx.compose.foundation.gestures.Orientation getOrientation();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo1893getViewportSizeYbymL2g();

    int getViewportStartOffset();

    java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> getVisibleItemsInfo();
}
