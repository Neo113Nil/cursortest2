package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\t\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b6\u00100R\u001a\u0010\r\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b7\u00100R\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0010\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b;\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b?\u0010>R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\bC\u00100R\u001a\u0010\u0016\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bD\u0010:R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010\u001a\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bK\u0010:R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\bL\u0010-R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\bM\u0010-R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\"\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020W8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010[\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u00100R\u0011\u0010]\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\\\u0010:R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00060^8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00068\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u00100R'\u0010j\u001a\u0015\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020(\u0018\u00010e¢\u0006\u0002\bg8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u00068\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bk\u00100"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "copyWithScrollDeltaWithoutRemeasure", "(I)Landroidx/compose/foundation/pager/PagerMeasureResult;", "", "placeChildren", "()V", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", com.visa.cbp.getEncExpo.warmup, "getPageSize", "()I", "getPageSpacing", "getAfterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getViewportStartOffset", "getViewportEndOffset", "Z", "getReverseLayout", "()Z", "getBeyondViewportPageCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "getCurrentPage", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCurrentPageOffsetFraction", "()F", "getFirstVisiblePageScrollOffset", "getCanScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureResult;", "Camera2StreamConfigurationMap", "getRemeasureNeeded", "getExtraPagesBefore", "getExtraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "J", "getChildConstraints-msEJaDk", "()J", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "canScrollBackward", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerMeasureResult implements androidx.compose.foundation.pager.PagerLayoutInfo, androidx.compose.ui.layout.MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.foundation.pager.MeasuredPage currentPage;
    private final float currentPageOffsetFraction;
    private final androidx.compose.ui.unit.Density density;
    private final java.util.List<androidx.compose.foundation.pager.MeasuredPage> extraPagesAfter;
    private final java.util.List<androidx.compose.foundation.pager.MeasuredPage> extraPagesBefore;
    private final androidx.compose.foundation.pager.MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final java.util.List<androidx.compose.foundation.pager.MeasuredPage> visiblePagesInfo;

    private PagerMeasureResult(java.util.List<androidx.compose.foundation.pager.MeasuredPage> list, int i, int i2, int i3, androidx.compose.foundation.gestures.Orientation orientation, int i4, int i5, boolean z, int i6, androidx.compose.foundation.pager.MeasuredPage measuredPage, androidx.compose.foundation.pager.MeasuredPage measuredPage2, float f, int i7, boolean z2, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.ui.layout.MeasureResult measureResult, boolean z3, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list3, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, long j) {
        this.visiblePagesInfo = list;
        this.pageSize = i;
        this.pageSpacing = i2;
        this.afterContentPadding = i3;
        this.orientation = orientation;
        this.viewportStartOffset = i4;
        this.viewportEndOffset = i5;
        this.reverseLayout = z;
        this.beyondViewportPageCount = i6;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f;
        this.firstVisiblePageScrollOffset = i7;
        this.canScrollForward = z2;
        this.snapPosition = snapPosition;
        this.Camera2StreamConfigurationMap = measureResult;
        this.remeasureNeeded = z3;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final java.util.List<androidx.compose.foundation.pager.MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final androidx.compose.foundation.pager.MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final androidx.compose.foundation.pager.MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final androidx.compose.foundation.gestures.snapping.SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public /* synthetic */ PagerMeasureResult(java.util.List list, int i, int i2, int i3, androidx.compose.foundation.gestures.Orientation orientation, int i4, int i5, boolean z, int i6, androidx.compose.foundation.pager.MeasuredPage measuredPage, androidx.compose.foundation.pager.MeasuredPage measuredPage2, float f, int i7, boolean z2, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.ui.layout.MeasureResult measureResult, boolean z3, java.util.List list2, java.util.List list3, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, long j, int i8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i4, i5, z, i6, measuredPage, measuredPage2, f, i7, z2, snapPosition, measureResult, z3, (i8 & 131072) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i8 & 262144) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, coroutineScope, density, j, null);
    }

    public final java.util.List<androidx.compose.foundation.pager.MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final java.util.List<androidx.compose.foundation.pager.MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
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

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public final long mo1926getViewportSizeYbymL2g() {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((getGetHighSpeedVideoSizes() & 4294967295L) | (getGetHighResolutionOutputSizeshNQ4ISI() << 32));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        androidx.compose.foundation.pager.MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage == null || measuredPage.getIndex() == 0) && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final androidx.compose.foundation.pager.PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta) {
        int i;
        int pageSize = getPageSize() + getPageSpacing();
        if (this.remeasureNeeded || getVisiblePagesInfo().isEmpty() || this.firstVisiblePage == null || (i = this.firstVisiblePageScrollOffset - delta) < 0 || i >= pageSize) {
            return null;
        }
        float f = pageSize != 0 ? delta / pageSize : 0.0f;
        float f2 = this.currentPageOffsetFraction - f;
        if (this.currentPage == null || f2 >= 0.5f || f2 <= -0.5f) {
            return null;
        }
        androidx.compose.foundation.pager.MeasuredPage measuredPage = (androidx.compose.foundation.pager.MeasuredPage) kotlin.collections.CollectionsKt.first((java.util.List) getVisiblePagesInfo());
        androidx.compose.foundation.pager.MeasuredPage measuredPage2 = (androidx.compose.foundation.pager.MeasuredPage) kotlin.collections.CollectionsKt.last((java.util.List) getVisiblePagesInfo());
        if (delta < 0) {
            if (java.lang.Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) <= (-delta)) {
                return null;
            }
        } else if (java.lang.Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) <= delta) {
            return null;
        }
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
        int size = visiblePagesInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            visiblePagesInfo.get(i2).applyScrollDelta(delta);
        }
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> list = this.extraPagesBefore;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            list.get(i3).applyScrollDelta(delta);
        }
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2 = this.extraPagesAfter;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            list2.get(i4).applyScrollDelta(delta);
        }
        return new androidx.compose.foundation.pager.PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.Camera2StreamConfigurationMap, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope, this.density, this.childConstraints, null);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.Camera2StreamConfigurationMap.placeChildren();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
        return this.Camera2StreamConfigurationMap.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getGetHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
        return this.Camera2StreamConfigurationMap.getAlignmentLines();
    }

    public /* synthetic */ PagerMeasureResult(java.util.List list, int i, int i2, int i3, androidx.compose.foundation.gestures.Orientation orientation, int i4, int i5, boolean z, int i6, androidx.compose.foundation.pager.MeasuredPage measuredPage, androidx.compose.foundation.pager.MeasuredPage measuredPage2, float f, int i7, boolean z2, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.ui.layout.MeasureResult measureResult, boolean z3, java.util.List list2, java.util.List list3, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i4, i5, z, i6, measuredPage, measuredPage2, f, i7, z2, snapPosition, measureResult, z3, list2, list3, coroutineScope, density, j);
    }
}
