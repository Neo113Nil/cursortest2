package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy {
    final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Horizontal getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.graphics.GraphicsContext getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.StickyItemsPlacement getInputFormats;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Vertical getOutputStallDurationlomOqCM;

    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        int i;
        int i2;
        int i3;
        float spacing;
        int m8554getMaxWidthimpl;
        int i4;
        int i5;
        long m8723constructorimpl;
        int lineIndexOfItem;
        int firstVisibleItemScrollOffset;
        float scrollToBeConsumed;
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(this.getInputSizeshNQ4ISI.m1833getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.getInputSizeshNQ4ISI.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
        androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, this.getHighSpeedVideoFpsRanges ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
        if (this.getHighSpeedVideoFpsRanges) {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor.mo1672calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(this.getHighSpeedVideoFpsRangesFor, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.getHighSpeedVideoFpsRanges) {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor.mo1673calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(this.getHighSpeedVideoFpsRangesFor, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i6 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor.getTop());
        int i7 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor.getBottom());
        final int i8 = i6 + i7;
        final int i9 = i + i2;
        boolean z2 = this.getHighSpeedVideoFpsRanges;
        int i10 = z2 ? i8 : i9;
        if (z2 && !this.getHighSpeedVideoSizesFor) {
            i3 = i6;
        } else if (z2 && this.getHighSpeedVideoSizesFor) {
            i3 = i7;
        } else {
            i3 = (z2 || this.getHighSpeedVideoSizesFor) ? i2 : i;
        }
        final int i11 = i10 - i3;
        long m8573offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -i9, -i8);
        final androidx.compose.foundation.lazy.grid.LazyGridItemProvider invoke = this.getOutputMinFrameDuration.invoke();
        final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        final androidx.compose.foundation.lazy.grid.LazyGridSlots mo1811invoke0kLqBqw = this.getOutputFormats.mo1811invoke0kLqBqw(lazyLayoutMeasureScope2, m8573offsetNN6EwU);
        int length = mo1811invoke0kLqBqw.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        if (this.getHighSpeedVideoFpsRanges) {
            androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.getOutputStallDurationlomOqCM;
            if (vertical != null) {
                spacing = vertical.getSpacing();
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                throw new kotlin.KotlinNothingValueException();
            }
        } else {
            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = this.getHighResolutionOutputSizeshNQ4ISI;
            if (horizontal != null) {
                spacing = horizontal.getSpacing();
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        final int i12 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(spacing);
        int itemCount = invoke.getItemCount();
        if (this.getHighSpeedVideoFpsRanges) {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - i8;
        } else {
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - i9;
        }
        int i13 = m8554getMaxWidthimpl;
        if (this.getHighSpeedVideoSizesFor && i13 <= 0) {
            boolean z3 = this.getHighSpeedVideoFpsRanges;
            if (!z3) {
                i += i13;
            }
            if (z3) {
                i6 += i13;
            }
            i4 = itemCount;
            i5 = length;
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i6 & 4294967295L));
        } else {
            i4 = itemCount;
            i5 = length;
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i6 & 4294967295L));
        }
        final long j2 = m8723constructorimpl;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = this.getInputSizeshNQ4ISI;
        final boolean z4 = this.getHighSpeedVideoFpsRanges;
        final boolean z5 = this.getHighSpeedVideoSizesFor;
        int i14 = i5;
        final int i15 = i3;
        final ?? r29 = new androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i12, lazyGridState, z4, z5, i15, i11, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState Camera2StreamConfigurationMap;
            final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ int getHighSpeedVideoFpsRanges;
            final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ int getHighSpeedVideoSizes;
            final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope getInputFormats;
            final /* synthetic */ long getOutputFormats;

            {
                this.getInputFormats = lazyLayoutMeasureScope;
                this.Camera2StreamConfigurationMap = lazyGridState;
                this.getHighResolutionOutputSizeshNQ4ISI = z4;
                this.getHighSpeedVideoFpsRangesFor = z5;
                this.getHighSpeedVideoSizes = i15;
                this.getHighSpeedVideoFpsRanges = i11;
                this.getOutputFormats = j2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
            public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem mo1825createItemO3s9Psw(int index, java.lang.Object key, java.lang.Object contentType, int crossAxisSize, int mainAxisSpacing, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables, long constraints, int lane, int span) {
                return new androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem(index, key, this.getHighResolutionOutputSizeshNQ4ISI, crossAxisSize, mainAxisSpacing, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats.getLayoutDirection(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, placeables, this.getOutputFormats, contentType, this.Camera2StreamConfigurationMap.getItemAnimator$foundation(), constraints, lane, span, null);
            }
        };
        final boolean z6 = this.getHighSpeedVideoFpsRanges;
        final int i16 = i4;
        final ?? r2 = new androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider(z6, mo1811invoke0kLqBqw, i16, i12, r29, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridSlots getHighSpeedVideoSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z6, mo1811invoke0kLqBqw, i16, i12, r29, spanLayoutProvider);
                this.Camera2StreamConfigurationMap = z6;
                this.getHighSpeedVideoSizes = mo1811invoke0kLqBqw;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine createLine(int index, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items, java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> spans, int mainAxisSpacing) {
                return new androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine(index, items, this.getHighSpeedVideoSizes, spans, this.Camera2StreamConfigurationMap, mainAxisSpacing);
            }
        };
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.ArrayList highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.this, r2, ((java.lang.Integer) obj).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        };
        kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.this, ((java.lang.Integer) obj).intValue());
                return java.lang.Integer.valueOf(highSpeedVideoSizes);
            }
        };
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2 = this.getInputSizeshNQ4ISI;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyGridState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(invoke, lazyGridState2.getFirstVisibleItemIndex());
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation < i4 || i4 <= 0) {
                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation);
                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
            } else {
                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(i4 - 1);
                firstVisibleItemScrollOffset = 0;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            java.util.List<java.lang.Integer> calculateLazyLayoutPinnedIndices = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.getInputSizeshNQ4ISI.getPinnedItems(), this.getInputSizeshNQ4ISI.getBeyondBoundsInfo());
            if (lazyLayoutMeasureScope.isLookingAhead() || !z) {
                scrollToBeConsumed = this.getInputSizeshNQ4ISI.getScrollToBeConsumed();
            } else {
                scrollToBeConsumed = this.getInputSizeshNQ4ISI.getScrollDeltaBetweenPasses$foundation();
            }
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider) r2;
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m1829measureLazyGridt1x4au0 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m1829measureLazyGridt1x4au0(i4, lazyGridMeasuredLineProvider, (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider) r29, i13, i3, i11, i12, lineIndexOfItem, firstVisibleItemScrollOffset, scrollToBeConsumed, m8573offsetNN6EwU, this.getHighSpeedVideoFpsRanges, this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, lazyLayoutMeasureScope2, this.getInputSizeshNQ4ISI.getItemAnimator$foundation(), i14, calculateLazyLayoutPinnedIndices, z, lazyLayoutMeasureScope.isLookingAhead(), this.getInputSizeshNQ4ISI.getApproachLayoutInfo(), this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI.m1834getPlacementScopeInvalidatorzYiylxw$foundation(), this.getHighSpeedVideoSizes, function1, function12, this.getInputFormats, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    androidx.compose.ui.layout.MeasureResult highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this, j, i9, i8, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), (kotlin.jvm.functions.Function1) obj3);
                    return highSpeedVideoFpsRanges;
                }
            });
            androidx.compose.foundation.lazy.grid.LazyGridState.applyMeasureResult$foundation$default(this.getInputSizeshNQ4ISI, m1829measureLazyGridt1x4au0, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            java.lang.Object prefetchStrategy = this.getInputSizeshNQ4ISI.getPrefetchStrategy();
            androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic = prefetchStrategy instanceof androidx.compose.foundation.lazy.layout.CacheWindowLogic ? (androidx.compose.foundation.lazy.layout.CacheWindowLogic) prefetchStrategy : null;
            if (cacheWindowLogic != null) {
                androidx.compose.foundation.lazy.grid.LazyGridKt.getHighResolutionOutputSizeshNQ4ISI(cacheWindowLogic, m1829measureLazyGridt1x4au0.getOrientation(), m1829measureLazyGridt1x4au0.getVisibleItemsInfo(), lazyGridMeasuredLineProvider);
            }
            return m1829measureLazyGridt1x4au0;
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, int i) {
        androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = lazyGridSpanLayoutProvider.getLineConfiguration(i);
        int firstItemIndex = lineConfiguration.getFirstItemIndex();
        java.util.ArrayList arrayList = new java.util.ArrayList(lineConfiguration.getSpans().size());
        java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> spans = lineConfiguration.getSpans();
        int size = spans.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int m1807getCurrentLineSpanimpl = androidx.compose.foundation.lazy.grid.GridItemSpan.m1807getCurrentLineSpanimpl(spans.get(i3).getGetHighResolutionOutputSizeshNQ4ISI());
            arrayList.add(kotlin.TuplesKt.to(java.lang.Integer.valueOf(firstItemIndex), androidx.compose.ui.unit.Constraints.m8542boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m1831childConstraintsJhjzzOo$foundation(i2, m1807getCurrentLineSpanimpl))));
            firstItemIndex++;
            i2 += m1807getCurrentLineSpanimpl;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int i) {
        return lazyGridSpanLayoutProvider.getLineIndexOfItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, kotlin.jvm.functions.Function1 function1) {
        return lazyLayoutMeasureScope.layout(androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i3 + i), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i4 + i2), kotlin.collections.MapsKt.emptyMap(), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    LazyGridKt$rememberLazyGridMeasurePolicy$1$1(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z2, kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.grid.LazyGridItemProvider> function0, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement) {
        this.getInputSizeshNQ4ISI = lazyGridState;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
        this.getHighSpeedVideoSizesFor = z2;
        this.getOutputMinFrameDuration = function0;
        this.getOutputFormats = lazyGridSlotsProvider;
        this.getOutputStallDurationlomOqCM = vertical;
        this.getHighResolutionOutputSizeshNQ4ISI = horizontal;
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.getHighSpeedVideoSizes = graphicsContext;
        this.getInputFormats = stickyItemsPlacement;
    }
}
