package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u001eR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001bR\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "state", "<init>", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "index", "offsetFraction", "requestPositionAndForgetLastKnownKey", "(IF)V", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchPageWithKey", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "updateCurrentPageOffsetFraction", "(F)V", "delta", "applyScrollDelta", "(I)V", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "<set-?>", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCurrentPage", "()I", "setCurrentPage", "currentPageOffsetFraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;
    private java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: currentPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState currentPage;

    /* renamed from: currentPageOffsetFraction$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState currentPageOffsetFraction;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState nearestRangeState;
    private final androidx.compose.foundation.pager.PagerState state;

    public PagerScrollPosition(int i, float f, androidx.compose.foundation.pager.PagerState pagerState) {
        this.state = pagerState;
        this.currentPage = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
        this.currentPageOffsetFraction = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i, float f, androidx.compose.foundation.pager.PagerState pagerState, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, pagerState);
    }

    public final androidx.compose.foundation.pager.PagerState getState() {
        return this.state;
    }

    private final void setCurrentPage(int i) {
        this.currentPage.setIntValue(i);
    }

    public final int getCurrentPage() {
        return this.currentPage.getIntValue();
    }

    private final void setCurrentPageOffsetFraction(float f) {
        this.currentPageOffsetFraction.setFloatValue(f);
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction.getFloatValue();
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(androidx.compose.foundation.pager.PagerMeasureResult measureResult) {
        androidx.compose.foundation.pager.MeasuredPage currentPage = measureResult.getCurrentPage();
        this.Camera2StreamConfigurationMap = currentPage != null ? currentPage.getKey() : null;
        if (this.getHighSpeedVideoFpsRangesFor || !measureResult.getVisiblePagesInfo().isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor = true;
            androidx.compose.foundation.pager.MeasuredPage currentPage2 = measureResult.getCurrentPage();
            getHighResolutionOutputSizeshNQ4ISI(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }

    public final void requestPositionAndForgetLastKnownKey(int index, float offsetFraction) {
        getHighResolutionOutputSizeshNQ4ISI(index, offsetFraction);
        this.Camera2StreamConfigurationMap = null;
    }

    public final int matchPageWithKey(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider itemProvider, int index) {
        int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.Camera2StreamConfigurationMap, index);
        if (index != findIndexByKey) {
            setCurrentPage(findIndexByKey);
            this.nearestRangeState.update(index);
        }
        return findIndexByKey;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, float p1) {
        setCurrentPage(p0);
        this.nearestRangeState.update(p0);
        setCurrentPageOffsetFraction(p1);
    }

    public final void updateCurrentPageOffsetFraction(float offsetFraction) {
        setCurrentPageOffsetFraction(offsetFraction);
    }

    public final void applyScrollDelta(int delta) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation() == 0 ? 0.0f : delta / this.state.getPageSizeWithSpacing$foundation()));
    }
}
