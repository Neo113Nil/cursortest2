package androidx.compose.foundation.pager;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.Alignment.Horizontal getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.gestures.Orientation getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Integer> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.pager.PageSize getOutputFormats;
    final /* synthetic */ boolean getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapPosition getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.Alignment.Vertical getOutputStallDuration;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        int i;
        int i2;
        int i3;
        int m8554getMaxWidthimpl;
        int i4;
        long m8723constructorimpl;
        androidx.compose.runtime.snapshots.Snapshot snapshot;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(this.getOutputSizeshNQ4ISI.m1932getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.getHighSpeedVideoSizesFor == androidx.compose.foundation.gestures.Orientation.Vertical;
        androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
        if (z) {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes.mo1672calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(this.getHighSpeedVideoSizes, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (z) {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes.mo1673calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(this.getHighSpeedVideoSizes, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes.getTop());
        int i6 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes.getBottom());
        final int i7 = i5 + i6;
        final int i8 = i + i2;
        int i9 = z ? i7 : i8;
        if (z && !this.getOutputMinFrameDuration) {
            i3 = i5;
        } else if (z && this.getOutputMinFrameDuration) {
            i3 = i6;
        } else {
            i3 = (z || this.getOutputMinFrameDuration) ? i2 : i;
        }
        int i10 = i9 - i3;
        long m8573offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -i8, -i7);
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        this.getOutputSizeshNQ4ISI.setDensity$foundation(lazyLayoutMeasureScope2);
        int i11 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges);
        if (z) {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - i7;
        } else {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - i8;
        }
        if (!this.getOutputMinFrameDuration || m8554getMaxWidthimpl > 0) {
            i4 = i11;
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i5 & 4294967295L));
        } else {
            if (!z) {
                i += m8554getMaxWidthimpl;
            }
            if (z) {
                i5 += m8554getMaxWidthimpl;
            }
            i4 = i11;
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i5 & 4294967295L));
        }
        long j2 = m8723constructorimpl;
        int i12 = i4;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(this.getOutputFormats.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m8554getMaxWidthimpl, i12), 0);
        this.getOutputSizeshNQ4ISI.m1936setPremeasureConstraintsBRTryo0$foundation(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, this.getHighSpeedVideoSizesFor == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(m8573offsetNN6EwU) : coerceAtLeast, 0, this.getHighSpeedVideoSizesFor != androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m8573offsetNN6EwU) : coerceAtLeast, 5, null));
        androidx.compose.foundation.pager.PagerLazyLayoutItemProvider invoke = this.getInputFormats.invoke();
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.pager.PagerState pagerState = this.getOutputSizeshNQ4ISI;
        androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition = this.getOutputMinFrameDurationlomOqCM;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int matchScrollPositionWithKey$foundation = pagerState.matchScrollPositionWithKey$foundation(invoke, pagerState.getCurrentPage());
            int currentPage = pagerState.getCurrentPage();
            float currentPageOffsetFraction = pagerState.getCurrentPageOffsetFraction();
            int pageCount = pagerState.getPageCount();
            snapshot = makeCurrentNonObservable;
            function1 = readObserver;
            try {
                int currentPageOffset = androidx.compose.foundation.pager.PagerKt.currentPageOffset(snapPosition, m8554getMaxWidthimpl + i3 + i10, coerceAtLeast, i12, i3, i10, currentPage, currentPageOffsetFraction, pageCount);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                companion.restoreNonObservable(currentThreadSnapshot, snapshot, function1);
                androidx.compose.foundation.pager.PagerMeasureResult m1929measurePager7L1iB3k = androidx.compose.foundation.pager.PagerMeasureKt.m1929measurePager7L1iB3k(lazyLayoutMeasureScope, this.getInputSizeshNQ4ISI.invoke().intValue(), invoke, m8554getMaxWidthimpl, i3, i10, i12, matchScrollPositionWithKey$foundation, currentPageOffset, m8573offsetNN6EwU, this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, j2, coerceAtLeast, this.Camera2StreamConfigurationMap, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.getOutputSizeshNQ4ISI.getPinnedPages(), this.getOutputSizeshNQ4ISI.getBeyondBoundsInfo()), this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI.m1933getPlacementScopeInvalidatorzYiylxw$foundation(), this.getHighResolutionOutputSizeshNQ4ISI, lazyLayoutMeasureScope2, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        androidx.compose.ui.layout.MeasureResult highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this, j, i8, i7, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), (kotlin.jvm.functions.Function1) obj3);
                        return highSpeedVideoFpsRangesFor;
                    }
                }, androidx.collection.IntObjectMapKt.mutableIntObjectMapOf());
                androidx.compose.foundation.pager.PagerState.applyMeasureResult$foundation$default(this.getOutputSizeshNQ4ISI, m1929measurePager7L1iB3k, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                androidx.compose.foundation.pager.PagerMeasurePolicyKt.getHighSpeedVideoFpsRanges(lazyLayoutMeasureScope, this.getOutputSizeshNQ4ISI.getCacheWindowLogic(), m1929measurePager7L1iB3k.getVisiblePagesInfo());
                return m1929measurePager7L1iB3k;
            } catch (java.lang.Throwable th) {
                th = th;
                companion.restoreNonObservable(currentThreadSnapshot, snapshot, function1);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            snapshot = makeCurrentNonObservable;
            function1 = readObserver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, kotlin.jvm.functions.Function1 function1) {
        return lazyLayoutMeasureScope.layout(androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i3 + i), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i4 + i2), kotlin.collections.MapsKt.emptyMap(), function1);
    }

    PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.pager.PageSize pageSize, kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> function0, kotlin.jvm.functions.Function0<java.lang.Integer> function02, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, int i, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getOutputSizeshNQ4ISI = pagerState;
        this.getHighSpeedVideoSizesFor = orientation;
        this.getHighSpeedVideoSizes = paddingValues;
        this.getOutputMinFrameDuration = z;
        this.getHighSpeedVideoFpsRanges = f;
        this.getOutputFormats = pageSize;
        this.getInputFormats = function0;
        this.getInputSizeshNQ4ISI = function02;
        this.getOutputStallDuration = vertical;
        this.getHighSpeedVideoFpsRangesFor = horizontal;
        this.Camera2StreamConfigurationMap = i;
        this.getOutputMinFrameDurationlomOqCM = snapPosition;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
    }
}
