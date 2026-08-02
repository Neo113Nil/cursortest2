package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r*\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020&*\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b\u000e\u0010:R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bA\u00108R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bB\u0010@R\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\bC\u0010@R\u001a\u0010\u0016\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bD\u0010:R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bE\u0010@R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u001a\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b\u001a\u0010:R\u001a\u0010\u001b\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b\u001b\u0010:R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010P\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010U\u001a\u00020T8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010@R\u0016\u0010#\u001a\u00020\r*\u00020&8Ç\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010U\u001a\u00020\u0005*\u00020&8Ç\u0002¢\u0006\u0006\u001a\u0004\b]\u0010^"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "itemIndex", "isFullSpan", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "J", "getConstraints-msEJaDk", "()J", "Z", "()Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", com.visa.cbp.getEncExpo.warmup, "getMainAxisAvailableSize", "()I", "getContentOffset-nOcc-ac", "getBeforeContentPadding", "getAfterContentPadding", "getReverseLayout", "getMainAxisSpacing", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getApproachLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneCount", "getLaneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo approachLayoutInfo;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.ui.graphics.GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope measureScope;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final java.util.List<java.lang.Integer> pinnedItems;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState state;

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m1896getLaneInfoSZVOQXA(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i - i2 != 1) {
            return -2;
        }
        return i2;
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m1898isFullSpanSZVOQXA(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32)) != 1;
    }

    private LazyStaggeredGridMeasureContext(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, java.util.List<java.lang.Integer> list, final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, final boolean z, final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z3, boolean z4, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, androidx.compose.ui.graphics.GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j;
        this.isVertical = z;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i;
        this.contentOffset = j2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.reverseLayout = z2;
        this.mainAxisSpacing = i4;
        this.coroutineScope = coroutineScope;
        this.isInLookaheadScope = z3;
        this.isLookingAhead = z4;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem mo1899createItempitSLOA(int index, int lane, int span, java.lang.Object key, java.lang.Object contentType, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables, long constraints) {
                return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem(index, key, placeables, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this.getIsVertical(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), lane, span, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), contentType, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this.getState().getItemAnimator$foundation(), constraints, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState getState() {
        return this.state;
    }

    public final java.util.List<java.lang.Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: isInLookaheadScope, reason: from getter */
    public final boolean getIsInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    /* renamed from: isLookingAhead, reason: from getter */
    public final boolean getIsLookingAhead() {
        return this.isLookingAhead;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final androidx.compose.ui.graphics.GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final boolean isFullSpan(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m1897getSpanRangelOCCd4c(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i, int i2) {
        boolean isFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
        int i3 = isFullSpan ? this.laneCount : 1;
        if (isFullSpan) {
            i2 = 0;
        }
        return androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m1907constructorimpl(i2, i3);
    }

    public /* synthetic */ LazyStaggeredGridMeasureContext(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, java.util.List list, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z3, boolean z4, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, androidx.compose.ui.graphics.GraphicsContext graphicsContext, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i2, i3, z2, i4, coroutineScope, z3, z4, lazyStaggeredGridLayoutInfo, graphicsContext);
    }
}
