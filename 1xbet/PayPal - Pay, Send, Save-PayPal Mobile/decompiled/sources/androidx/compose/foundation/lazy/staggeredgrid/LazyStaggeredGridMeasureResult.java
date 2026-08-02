package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b5\u00101R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b\f\u00108R\u001a\u0010\r\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b9\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u001b\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\bL\u0010ER\u001a\u0010\u001c\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010C\u001a\u0004\bM\u0010ER\u001a\u0010\u001d\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010C\u001a\u0004\bN\u0010ER\u001a\u0010\u001e\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010C\u001a\u0004\bO\u0010ER\u001a\u0010\u001f\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010C\u001a\u0004\bP\u0010ER\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bT\u00108R\u001a\u0010W\u001a\u00020V8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00140[8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010ER'\u0010g\u001a\u0015\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020(\u0018\u00010b¢\u0006\u0002\bd8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010E"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "scrollBackAmount", "", "canScrollForward", "isVertical", "remeasureNeeded", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/ui/unit/Density;", "density", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;FZZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;Landroidx/compose/ui/unit/Density;ILjava/util/List;JIIIIILkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "updateAnimations", "copyWithScrollDeltaWithoutRemeasure", "(IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "", "placeChildren", "()V", "[I", "getFirstVisibleItemIndices", "()[I", "getFirstVisibleItemScrollOffsets", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getConsumedScroll", "()F", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "getScrollBackAmount", "Z", "getCanScrollForward", "()Z", "getRemeasureNeeded", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", com.visa.cbp.getEncExpo.warmup, "getTotalItemsCount", "()I", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "J", "getViewportSize-YbymL2g", "()J", "getViewportStartOffset", "getViewportEndOffset", "getBeforeContentPadding", "getAfterContentPadding", "getMainAxisItemSpacing", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasureResult implements androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo, androidx.compose.ui.layout.MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.ui.unit.Density density;
    private final int[] firstVisibleItemIndices;
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;
    private final androidx.compose.ui.layout.MeasureResult measureResult;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final boolean remeasureNeeded;
    private final float scrollBackAmount;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots slots;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider spanProvider;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;
    private final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, androidx.compose.ui.layout.MeasureResult measureResult, float f2, boolean z, boolean z2, boolean z3, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, androidx.compose.ui.unit.Density density, int i, java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> list, long j, int i2, int i3, int i4, int i5, int i6, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.canScrollForward = z;
        this.isVertical = z2;
        this.remeasureNeeded = z3;
        this.slots = lazyStaggeredGridSlots;
        this.spanProvider = lazyStaggeredGridSpanProvider;
        this.density = density;
        this.totalItemsCount = i;
        this.visibleItemsInfo = list;
        this.viewportSize = j;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.coroutineScope = coroutineScope;
        this.orientation = z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
    }

    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final androidx.compose.ui.layout.MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta, boolean updateAnimations) {
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || this.firstVisibleItemIndices.length == 0 || this.firstVisibleItemScrollOffsets.length == 0) {
            return null;
        }
        int viewportEndOffset = getViewportEndOffset();
        int afterContentPadding = getAfterContentPadding();
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> visibleItemsInfo2 = getVisibleItemsInfo();
                int size2 = visibleItemsInfo2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    visibleItemsInfo2.get(i2).applyScrollDelta(delta, updateAnimations);
                }
                int[] iArr = this.firstVisibleItemIndices;
                int length = this.firstVisibleItemScrollOffsets.length;
                int[] iArr2 = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr2[i3] = this.firstVisibleItemScrollOffsets[i3] - delta;
                }
                return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr, iArr2, delta, this.measureResult, this.scrollBackAmount, this.canScrollForward || delta > 0, this.isVertical, this.remeasureNeeded, this.slots, this.spanProvider, this.density, getTotalItemsCount(), getVisibleItemsInfo(), getViewportSize(), getViewportStartOffset(), getViewportEndOffset(), getBeforeContentPadding(), getAfterContentPadding(), getMainAxisItemSpacing(), this.coroutineScope, null);
            }
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i);
            if (lazyStaggeredGridMeasuredItem.getNonScrollableItem()) {
                break;
            }
            if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= 0) != (lazyStaggeredGridMeasuredItem.getMainAxisOffset() + delta <= 0)) {
                break;
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= getViewportStartOffset()) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset() <= (-delta)) {
                        break;
                    }
                } else if (getViewportStartOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= delta) {
                    break;
                }
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() >= viewportEndOffset - afterContentPadding) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportEndOffset() <= (-delta)) {
                        break;
                    }
                } else if (getViewportEndOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= delta) {
                    break;
                }
            }
            i++;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.measureResult.placeChildren();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.measureResult.getGetHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.measureResult.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, androidx.compose.ui.layout.MeasureResult measureResult, float f2, boolean z, boolean z2, boolean z3, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, androidx.compose.ui.unit.Density density, int i, java.util.List list, long j, int i2, int i3, int i4, int i5, int i6, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f, measureResult, f2, z, z2, z3, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i, list, j, i2, i3, i4, i5, i6, coroutineScope);
    }
}
