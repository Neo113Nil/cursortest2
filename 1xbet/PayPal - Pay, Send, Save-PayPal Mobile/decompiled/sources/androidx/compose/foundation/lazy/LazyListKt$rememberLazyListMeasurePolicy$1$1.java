package androidx.compose.foundation.lazy;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy {
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.graphics.GraphicsContext getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.Alignment.Horizontal getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getInputFormats;
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Horizontal getInputSizeshNQ4ISI;
    final /* synthetic */ boolean getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.ui.Alignment.Vertical getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.StickyItemsPlacement getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Vertical getOutputStallDurationlomOqCM;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        int i;
        int i2;
        int i3;
        float spacing;
        int m8554getMaxWidthimpl;
        long m8723constructorimpl;
        float scrollToBeConsumed;
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(this.getInputFormats.m1801getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.getInputFormats.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
        androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, this.getOutputFormats ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
        if (this.getOutputFormats) {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.mo1672calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(this.Camera2StreamConfigurationMap, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.getOutputFormats) {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.mo1673calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(this.Camera2StreamConfigurationMap, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i4 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.getTop());
        int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.getBottom());
        final int i6 = i4 + i5;
        final int i7 = i + i2;
        boolean z2 = this.getOutputFormats;
        int i8 = z2 ? i6 : i7;
        if (z2 && !this.getHighSpeedVideoSizesFor) {
            i3 = i4;
        } else if (z2 && this.getHighSpeedVideoSizesFor) {
            i3 = i5;
        } else {
            i3 = (z2 || this.getHighSpeedVideoSizesFor) ? i2 : i;
        }
        final int i9 = i8 - i3;
        final long m8573offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -i7, -i6);
        final androidx.compose.foundation.lazy.LazyListItemProvider invoke = this.getOutputMinFrameDuration.invoke();
        invoke.getGetHighSpeedVideoFpsRanges().setMaxSize(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(m8573offsetNN6EwU), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m8573offsetNN6EwU));
        if (this.getOutputFormats) {
            androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.getOutputStallDurationlomOqCM;
            if (vertical != null) {
                spacing = vertical.getSpacing();
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                throw new kotlin.KotlinNothingValueException();
            }
        } else {
            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = this.getInputSizeshNQ4ISI;
            if (horizontal != null) {
                spacing = horizontal.getSpacing();
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == false");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        final int i10 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(spacing);
        final int itemCount = invoke.getItemCount();
        if (this.getOutputFormats) {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - i6;
        } else {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - i7;
        }
        int i11 = m8554getMaxWidthimpl;
        if (this.getHighSpeedVideoSizesFor && i11 <= 0) {
            boolean z3 = this.getOutputFormats;
            if (!z3) {
                i += i11;
            }
            if (z3) {
                i4 += i11;
            }
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i4 & 4294967295L));
        } else {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i4 & 4294967295L));
        }
        final long j2 = m8723constructorimpl;
        final boolean z4 = this.getOutputFormats;
        final androidx.compose.ui.Alignment.Horizontal horizontal2 = this.getHighSpeedVideoSizes;
        final androidx.compose.ui.Alignment.Vertical vertical2 = this.getOutputMinFrameDurationlomOqCM;
        final boolean z5 = this.getHighSpeedVideoSizesFor;
        final androidx.compose.foundation.lazy.LazyListState lazyListState = this.getInputFormats;
        final int i12 = i3;
        androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new androidx.compose.foundation.lazy.LazyListMeasuredItemProvider(m8573offsetNN6EwU, z4, invoke, lazyLayoutMeasureScope, itemCount, i10, horizontal2, vertical2, z5, i12, i9, j2, lazyListState) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ boolean Camera2StreamConfigurationMap;
            final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.ui.Alignment.Horizontal getHighSpeedVideoFpsRanges;
            final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ int getHighSpeedVideoSizes;
            final /* synthetic */ androidx.compose.ui.Alignment.Vertical getHighSpeedVideoSizesFor;
            final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getInputFormats;
            final /* synthetic */ int getInputSizeshNQ4ISI;
            final /* synthetic */ boolean getOutputFormats;
            final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope getOutputMinFrameDuration;
            final /* synthetic */ long getOutputSizes;

            {
                this.Camera2StreamConfigurationMap = z4;
                this.getOutputMinFrameDuration = lazyLayoutMeasureScope;
                this.getHighSpeedVideoSizes = itemCount;
                this.getInputSizeshNQ4ISI = i10;
                this.getHighSpeedVideoFpsRanges = horizontal2;
                this.getHighSpeedVideoSizesFor = vertical2;
                this.getOutputFormats = z5;
                this.getHighSpeedVideoFpsRangesFor = i12;
                this.getHighResolutionOutputSizeshNQ4ISI = i9;
                this.getOutputSizes = j2;
                this.getInputFormats = lazyListState;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
            public final androidx.compose.foundation.lazy.LazyListMeasuredItem mo1786createItemX9ElhV4(int index, java.lang.Object key, java.lang.Object contentType, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables, long constraints) {
                return new androidx.compose.foundation.lazy.LazyListMeasuredItem(index, placeables, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration.getLayoutDirection(), this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, index == this.getHighSpeedVideoSizes + (-1) ? 0 : this.getInputSizeshNQ4ISI, this.getOutputSizes, key, contentType, this.getInputFormats.getItemAnimator$foundation(), constraints, null);
            }
        };
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.lazy.LazyListState lazyListState2 = this.getInputFormats;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyListState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(invoke, lazyListState2.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            java.util.List<java.lang.Integer> calculateLazyLayoutPinnedIndices = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.getInputFormats.getPinnedItems(), this.getInputFormats.getBeyondBoundsInfo());
            if (lazyLayoutMeasureScope.isLookingAhead() || !z) {
                scrollToBeConsumed = this.getInputFormats.getScrollToBeConsumed();
            } else {
                scrollToBeConsumed = this.getInputFormats.getScrollDeltaBetweenPasses$foundation();
            }
            androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            androidx.compose.foundation.lazy.LazyListMeasureResult m1791measureLazyList_s_dbAc = androidx.compose.foundation.lazy.LazyListMeasureKt.m1791measureLazyList_s_dbAc(itemCount, lazyListMeasuredItemProvider2, i11, i3, i9, i10, updateScrollPositionIfTheFirstItemWasMoved$foundation, firstVisibleItemScrollOffset, scrollToBeConsumed, m8573offsetNN6EwU, this.getOutputFormats, this.getOutputStallDurationlomOqCM, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, lazyLayoutMeasureScope, this.getInputFormats.getItemAnimator$foundation(), this.getHighSpeedVideoFpsRangesFor, calculateLazyLayoutPinnedIndices, z, lazyLayoutMeasureScope.isLookingAhead(), this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats.m1802getPlacementScopeInvalidatorzYiylxw$foundation(), this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    androidx.compose.ui.layout.MeasureResult highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this, j, i7, i6, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), (kotlin.jvm.functions.Function1) obj3);
                    return highSpeedVideoSizes;
                }
            });
            androidx.compose.foundation.lazy.LazyListState.applyMeasureResult$foundation$default(this.getInputFormats, m1791measureLazyList_s_dbAc, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            java.lang.Object prefetchStrategy = this.getInputFormats.getPrefetchStrategy();
            androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic = prefetchStrategy instanceof androidx.compose.foundation.lazy.layout.CacheWindowLogic ? (androidx.compose.foundation.lazy.layout.CacheWindowLogic) prefetchStrategy : null;
            if (cacheWindowLogic != null) {
                androidx.compose.foundation.lazy.LazyListKt.getHighSpeedVideoFpsRangesFor(cacheWindowLogic, m1791measureLazyList_s_dbAc.getVisibleItemsInfo(), lazyListMeasuredItemProvider2);
            }
            return m1791measureLazyList_s_dbAc;
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, kotlin.jvm.functions.Function1 function1) {
        return lazyLayoutMeasureScope.layout(androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i3 + i), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i4 + i2), kotlin.collections.MapsKt.emptyMap(), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    LazyListKt$rememberLazyListMeasurePolicy$1$1(androidx.compose.foundation.lazy.LazyListState lazyListState, boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z2, kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemProvider> function0, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, int i, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement, androidx.compose.ui.Alignment.Horizontal horizontal2, androidx.compose.ui.Alignment.Vertical vertical2) {
        this.getInputFormats = lazyListState;
        this.getOutputFormats = z;
        this.Camera2StreamConfigurationMap = paddingValues;
        this.getHighSpeedVideoSizesFor = z2;
        this.getOutputMinFrameDuration = function0;
        this.getOutputStallDurationlomOqCM = vertical;
        this.getInputSizeshNQ4ISI = horizontal;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRanges = graphicsContext;
        this.getOutputSizeshNQ4ISI = stickyItemsPlacement;
        this.getHighSpeedVideoSizes = horizontal2;
        this.getOutputMinFrameDurationlomOqCM = vertical2;
    }
}
