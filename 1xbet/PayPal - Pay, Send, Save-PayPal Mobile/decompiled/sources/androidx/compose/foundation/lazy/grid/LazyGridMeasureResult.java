package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012)\u0010\u0018\u001a%\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0014\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0013\u0012\u0017\u0010\u0019\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u0004\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b<\u00108R\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b=\u00105R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\bD\u00102R=\u0010\u0018\u001a%\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0014\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR+\u0010\u0019\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u00050\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bH\u0010GR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u001c\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bL\u00102R\u001a\u0010\u001d\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bM\u00102R\u001a\u0010\u001e\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\bN\u00102R\u001a\u0010\u001f\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\bO\u00105R\u001a\u0010!\u001a\u00020 8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\"\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\bS\u00102R\u001a\u0010#\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\bT\u00102R\u0011\u0010V\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bU\u00105R\u0014\u0010Z\u001a\u00020W8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u00102R\u0014\u0010^\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u00102R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00050_8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u00102R'\u0010i\u001a\u0015\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020*\u0018\u00010\u0013¢\u0006\u0002\bg8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010GR\u0014\u0010k\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u00102"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "slotsPerLine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "lineIndexProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "delta", "updateAnimations", "copyWithScrollDeltaWithoutRemeasure", "(IZ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "", "placeChildren", "()V", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", com.visa.cbp.getEncExpo.warmup, "getFirstVisibleLineScrollOffset", "()I", "Z", "getCanScrollForward", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getConsumedScroll", "()F", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureResult;", "getHighSpeedVideoSizes", "getScrollBackAmount", "getRemeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getSlotsPerLine", "Lkotlin/jvm/functions/Function1;", "getPrefetchInfoRetriever", "()Lkotlin/jvm/functions/Function1;", "getLineIndexProvider", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getViewportStartOffset", "getViewportEndOffset", "getTotalItemsCount", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getAfterContentPadding", "getMainAxisItemSpacing", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getMaxSpan", "maxSpan", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "rulers", "getWidth", "width"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridMeasureResult implements androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, androidx.compose.ui.layout.MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.ui.unit.Density density;
    private final androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> lineIndexProvider;
    private final int mainAxisItemSpacing;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> visibleItemsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, androidx.compose.ui.layout.MeasureResult measureResult, float f2, boolean z2, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function12, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> list, int i3, int i4, int i5, boolean z3, androidx.compose.foundation.gestures.Orientation orientation, int i6, int i7) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.getHighSpeedVideoSizes = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.slotsPerLine = i2;
        this.prefetchInfoRetriever = function1;
        this.lineIndexProvider = function12;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
    }

    public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> getLineIndexProvider() {
        return this.lineIndexProvider;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine == null || lazyGridMeasuredLine.getIndex() == 0) && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public final long mo1826getViewportSizeYbymL2g() {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((getGetHighSpeedVideoSizes() & 4294967295L) | (getGetHighResolutionOutputSizeshNQ4ISI() << 32));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getMaxSpan, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta, boolean updateAnimations) {
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine;
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || (lazyGridMeasuredLine = this.firstVisibleLine) == null) {
            return null;
        }
        int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
        int i = this.firstVisibleLineScrollOffset - delta;
        if (i < 0 || i >= mainAxisSizeWithSpacings) {
            return null;
        }
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) getVisibleItemsInfo());
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) getVisibleItemsInfo());
        if (lazyGridMeasuredItem.getNonScrollableItem() || lazyGridMeasuredItem2.getNonScrollableItem()) {
            return null;
        }
        if (delta < 0) {
            if (java.lang.Math.min((androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) <= (-delta)) {
                return null;
            }
        } else if (java.lang.Math.min(getViewportStartOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation())) <= delta) {
            return null;
        }
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            visibleItemsInfo.get(i2).applyScrollDelta(delta, updateAnimations);
        }
        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(this.firstVisibleLine, this.firstVisibleLineScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.getHighSpeedVideoSizes, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, this.lineIndexProvider, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.getHighSpeedVideoSizes.placeChildren();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
        return this.getHighSpeedVideoSizes.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
        return this.getHighSpeedVideoSizes.getAlignmentLines();
    }
}
