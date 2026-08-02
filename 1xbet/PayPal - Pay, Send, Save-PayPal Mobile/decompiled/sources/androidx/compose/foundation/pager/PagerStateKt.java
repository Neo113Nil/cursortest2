package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000k\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\b\u001a(\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u0001H\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\r*\u00020\u0001H\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0082\b\u001a\u0014\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010$\u001a\u00020\"*\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001aO\u0010%\u001a\u00020\r*\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*2\u001d\u0010+\u001a\u0019\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0,¢\u0006\u0002\b.H\u0082@¢\u0006\u0002\u0010/\"\u0016\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"rememberPagerState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "", "initialPageOffsetFraction", "", "pageCount", "Lkotlin/Function0;", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "PagerState", "currentPage", "currentPageOffsetFraction", "animateToNextPage", "", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MaxPagesForAnimateScroll", "PagesToPrefetch", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "debugLog", "generateMsg", "", "calculateNewMaxScrollOffset", "", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "calculateNewMinScrollOffset", "animateScrollToPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "targetPage", "targetPageOffsetToSnappedPosition", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "updateTargetPage", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerStateKt {
    public static final int PagesToPrefetch = 1;
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final androidx.compose.foundation.pager.PagerMeasureResult getHighSpeedVideoFpsRangesFor;
    private static final androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1 getHighSpeedVideoSizes;

    public static final androidx.compose.foundation.pager.PagerState rememberPagerState(final int i, final float f, final kotlin.jvm.functions.Function0<java.lang.Integer> function0, androidx.compose.runtime.Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.DefaultPagerState, ?> saver = androidx.compose.foundation.pager.DefaultPagerState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(f)) || (i2 & 48) == 32;
        if ((((i2 & 896) ^ 384) <= 256 || !composer.changed(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.pager.DefaultPagerState highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.pager.PagerStateKt.getHighSpeedVideoSizes(i, f, function0);
                    return highSpeedVideoSizes;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.pager.DefaultPagerState defaultPagerState = (androidx.compose.foundation.pager.DefaultPagerState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        defaultPagerState.getHighResolutionOutputSizeshNQ4ISI.setValue(function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.DefaultPagerState getHighSpeedVideoSizes(int i, float f, kotlin.jvm.functions.Function0 function0) {
        return new androidx.compose.foundation.pager.DefaultPagerState(i, f, function0);
    }

    public static /* synthetic */ androidx.compose.foundation.pager.PagerState PagerState$default(int i, float f, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return PagerState(i, f, function0);
    }

    public static final androidx.compose.foundation.pager.PagerState PagerState(int i, float f, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        return new androidx.compose.foundation.pager.DefaultPagerState(i, f, function0);
    }

    public static final java.lang.Object animateToNextPage(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateScrollToPage$default = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
        return animateScrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object animateToPreviousPage(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateScrollToPage$default = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
        return animateScrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : kotlin.Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final androidx.compose.foundation.pager.PagerMeasureResult getEmptyLayoutInfo() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final long calculateNewMaxScrollOffset(androidx.compose.foundation.pager.PagerLayoutInfo pagerLayoutInfo, int i) {
        long j = i;
        long pageSpacing = pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize();
        long beforeContentPadding = pagerLayoutInfo.getBeforeContentPadding();
        long afterContentPadding = pagerLayoutInfo.getAfterContentPadding();
        long pageSpacing2 = pagerLayoutInfo.getPageSpacing();
        int mo1926getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal ? pagerLayoutInfo.mo1926getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo1926getViewportSizeYbymL2g() & 4294967295L);
        return kotlin.ranges.RangesKt.coerceAtLeast(((((j * pageSpacing) + beforeContentPadding) + afterContentPadding) - pageSpacing2) - (mo1926getViewportSizeYbymL2g - kotlin.ranges.RangesKt.coerceIn(pagerLayoutInfo.getSnapPosition().position(mo1926getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i - 1, i), 0, mo1926getViewportSizeYbymL2g)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult, int i) {
        int mo1926getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal ? pagerMeasureResult.mo1926getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo1926getViewportSizeYbymL2g() & 4294967295L);
        return kotlin.ranges.RangesKt.coerceIn(pagerMeasureResult.getSnapPosition().position(mo1926getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i), 0, mo1926getViewportSizeYbymL2g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object Camera2StreamConfigurationMap(final androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int coerceAtMost;
        function2.invoke(lazyLayoutScrollScope, kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        boolean z = i > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z && i > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && java.lang.Math.abs(i - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            if (z) {
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtLeast(i - lastVisibleItemIndex, lazyLayoutScrollScope.getFirstVisibleItemIndex());
            } else {
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(lastVisibleItemIndex + i, lazyLayoutScrollScope.getFirstVisibleItemIndex());
            }
            lazyLayoutScrollScope.snapToItem(coerceAtMost, 0);
        }
        float calculateDistanceTo$default = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i, 0, 2, null);
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        java.lang.Object animate$default = androidx.compose.animation.core.SuspendAnimationKt.animate$default(0.0f, calculateDistanceTo$default + f, 0.0f, animationSpec, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoSizes;
                kotlin.jvm.internal.Ref.FloatRef floatRef2 = kotlin.jvm.internal.Ref.FloatRef.this;
                androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                float floatValue = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                highSpeedVideoSizes = androidx.compose.foundation.pager.PagerStateKt.getHighSpeedVideoSizes(floatRef2, lazyLayoutScrollScope2, floatValue);
                return highSpeedVideoSizes;
            }
        }, continuation, 4, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, float f) {
        floatRef.element += lazyLayoutScrollScope.scrollBy(f - floatRef.element);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1] */
    static {
        ?? r0 = new androidx.compose.ui.unit.Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
            private final float density = 1.0f;
            private final float fontScale = 1.0f;

            @Override // androidx.compose.ui.unit.Density
            public final float getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public final float getFontScale() {
                return this.fontScale;
            }
        };
        getHighSpeedVideoSizes = r0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        androidx.compose.foundation.pager.MeasuredPage measuredPage = null;
        float f = 0.0f;
        int i4 = 0;
        boolean z = false;
        getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.pager.PagerMeasureResult(kotlin.collections.CollectionsKt.emptyList(), i, i2, i3, androidx.compose.foundation.gestures.Orientation.Horizontal, 0, 0, false, 0, measuredPage, null, f, i4, z, androidx.compose.foundation.gestures.snapping.SnapPosition.Start.INSTANCE, new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
            private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = kotlin.collections.MapsKt.emptyMap();
            private final int height;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return this.alignmentLines;
            }
        }, false, null, null, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE), (androidx.compose.ui.unit.Density) r0, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), 393216, null);
    }
}
