package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8'X¦\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0014\u0010(\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0001\u0001)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "", "Landroidx/compose/foundation/pager/PageInfo;", "getVisiblePagesInfo", "()Ljava/util/List;", "visiblePagesInfo", "", "getPageSize", "()I", "pageSize", "getPageSpacing", "pageSpacing", "getViewportStartOffset", "viewportStartOffset", "getViewportEndOffset", "viewportEndOffset", "getBeforeContentPadding", "beforeContentPadding", "getAfterContentPadding", "afterContentPadding", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "getReverseLayout", "()Z", "getReverseLayout$annotations", "()V", "reverseLayout", "getBeyondViewportPageCount", "beyondViewportPageCount", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/pager/PagerMeasureResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PagerLayoutInfo {
    static /* synthetic */ void getReverseLayout$annotations() {
    }

    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getBeyondViewportPageCount();

    androidx.compose.foundation.gestures.Orientation getOrientation();

    int getPageSize();

    int getPageSpacing();

    boolean getReverseLayout();

    androidx.compose.foundation.gestures.snapping.SnapPosition getSnapPosition();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo1926getViewportSizeYbymL2g();

    int getViewportStartOffset();

    java.util.List<androidx.compose.foundation.pager.PageInfo> getVisiblePagesInfo();
}
