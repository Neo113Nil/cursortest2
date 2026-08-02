package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b5\u00102R\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b6\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0016\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\bC\u0010,R\u001a\u0010\u0017\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\bD\u0010,R\u001a\u0010\u0018\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\bE\u0010,R\u001a\u0010\u0019\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\bF\u0010/R\u001a\u0010\u001b\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u001c\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\bJ\u0010,R\u001a\u0010\u001d\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\bK\u0010,R\u0011\u0010M\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bL\u0010/R\u0014\u0010P\u001a\u00020N8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010?R\u0014\u0010R\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010,R \u0010W\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00050S8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010,R'\u0010_\u001a\u0015\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020$\u0018\u00010Z¢\u0006\u0002\b\\8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010,"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "updateAnimations", "copyWithScrollDeltaWithoutRemeasure", "(IZ)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "", "placeChildren", "()V", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", com.visa.cbp.getEncExpo.warmup, "getFirstVisibleItemScrollOffset", "()I", "Z", "getCanScrollForward", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getConsumedScroll", "()F", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureResult;", "getScrollBackAmount", "getRemeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "J", "getChildConstraints-msEJaDk", "()J", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getViewportStartOffset", "getViewportEndOffset", "getTotalItemsCount", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getAfterContentPadding", "getMainAxisItemSpacing", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListMeasureResult implements androidx.compose.foundation.lazy.LazyListLayoutInfo, androidx.compose.ui.layout.MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final float consumedScroll;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.ui.unit.Density density;
    private final androidx.compose.foundation.lazy.LazyListMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final androidx.compose.ui.layout.MeasureResult getHighResolutionOutputSizeshNQ4ISI;
    private final int mainAxisItemSpacing;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> visibleItemsInfo;

    private LazyListMeasureResult(androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, androidx.compose.ui.layout.MeasureResult measureResult, float f2, boolean z2, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, long j, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list, int i2, int i3, int i4, boolean z3, androidx.compose.foundation.gestures.Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.getHighResolutionOutputSizeshNQ4ISI = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
    }

    public final androidx.compose.foundation.lazy.LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
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

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem == null || lazyListMeasuredItem.getIndex() == 0) && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public final long mo1788getViewportSizeYbymL2g() {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((getGetHighSpeedVideoSizes() & 4294967295L) | (getGetHighResolutionOutputSizeshNQ4ISI() << 32));
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final androidx.compose.foundation.lazy.LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta, boolean updateAnimations) {
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem;
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || (lazyListMeasuredItem = this.firstVisibleItem) == null) {
            return null;
        }
        int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
        int i = this.firstVisibleItemScrollOffset - delta;
        if (i < 0 || i >= mainAxisSizeWithSpacings) {
            return null;
        }
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) getVisibleItemsInfo());
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) getVisibleItemsInfo());
        if (lazyListMeasuredItem2.getNonScrollableItem() || lazyListMeasuredItem3.getNonScrollableItem()) {
            return null;
        }
        if (delta < 0) {
            if (java.lang.Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) <= (-delta)) {
                return null;
            }
        } else if (java.lang.Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) <= delta) {
            return null;
        }
        java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            visibleItemsInfo.get(i2).applyScrollDelta(delta, updateAnimations);
        }
        return new androidx.compose.foundation.lazy.LazyListMeasureResult(this.firstVisibleItem, this.firstVisibleItemScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.getHighResolutionOutputSizeshNQ4ISI, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.getHighResolutionOutputSizeshNQ4ISI.placeChildren();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlignmentLines();
    }

    public /* synthetic */ LazyListMeasureResult(androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, androidx.compose.ui.layout.MeasureResult measureResult, float f2, boolean z2, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, long j, java.util.List list, int i2, int i3, int i4, boolean z3, androidx.compose.foundation.gestures.Orientation orientation, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i, z, f, measureResult, f2, z2, coroutineScope, density, j, list, i2, i3, i4, z3, orientation, i5, i6);
    }
}
