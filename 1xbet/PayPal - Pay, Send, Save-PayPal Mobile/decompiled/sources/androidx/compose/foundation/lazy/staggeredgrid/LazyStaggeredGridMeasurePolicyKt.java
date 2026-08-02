package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u001b\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001e\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "rememberStaggeredGridMeasurePolicy", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "p2", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasurePolicyKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r29.changed(r24) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r29.changed(r27) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r29.changed(r19) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy m1902rememberStaggeredGridMeasurePolicyqKj4JfE(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> function0, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final androidx.compose.foundation.gestures.Orientation orientation, final float f, float f2, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.runtime.Composer composer, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        java.lang.Object obj;
        boolean z9;
        boolean changed;
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(234882793, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        if (((i & 14) ^ 6) <= 4) {
        }
        if ((i & 6) != 4) {
            z2 = false;
            z3 = (((i & 112) ^ 48) <= 32 && composer.changed(function0)) || (i & 48) == 32;
            z4 = (((i & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i & 384) == 256;
            z5 = (((i & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i & 3072) == 2048;
            z6 = (((57344 & i) ^ 24576) <= 16384 && composer.changed(orientation.ordinal())) || (i & 24576) == 16384;
            if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if ((196608 & i) != 131072) {
                z7 = false;
                z8 = (((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576;
                if (((234881024 & i) ^ 100663296) <= 67108864) {
                }
                if ((i & 100663296) != 67108864) {
                    obj = graphicsContext;
                    z9 = false;
                    changed = composer.changed(obj);
                    rememberedValue = composer.rememberedValue();
                    if (!(z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                            /* renamed from: measure-0kLqBqw */
                            public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                                float Camera2StreamConfigurationMap;
                                float highResolutionOutputSizeshNQ4ISI;
                                float highSpeedVideoFpsRanges;
                                long m8723constructorimpl;
                                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.m1904getMeasurementScopeInvalidatorzYiylxw$foundation());
                                boolean z10 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, orientation);
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo1881invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1881invoke0kLqBqw(lazyLayoutMeasureScope, j);
                                boolean z11 = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider invoke = function0.invoke();
                                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.Camera2StreamConfigurationMap(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                                int i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(Camera2StreamConfigurationMap);
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighResolutionOutputSizeshNQ4ISI(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                                int i3 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highResolutionOutputSizeshNQ4ISI);
                                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighSpeedVideoFpsRanges(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection());
                                int i4 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highSpeedVideoFpsRanges);
                                int m8553getMaxHeightimpl = z11 ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                                if (z11) {
                                    m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i4 << 32));
                                } else {
                                    m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i4 & 4294967295L) | (i2 << 32));
                                }
                                long j2 = m8723constructorimpl;
                                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                                int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                                androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues;
                                boolean z12 = z11;
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m1901measureStaggeredGridC6celF4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m1901measureStaggeredGridC6celF4(lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getPinnedItems(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getBeyondBoundsInfo()), invoke, mo1881invoke0kLqBqw, androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i5), 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z12, z, j2, (m8553getMaxHeightimpl - i2) - i3, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(f), i2, i3, coroutineScope, z10, lazyLayoutMeasureScope.isLookingAhead(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getApproachLayoutInfo(), graphicsContext);
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, m1901measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                return m1901measureStaggeredGridC6celF4;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    return lazyLayoutMeasurePolicy;
                }
                obj = graphicsContext;
                z9 = true;
                changed = composer.changed(obj);
                rememberedValue = composer.rememberedValue();
                if (!(z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | changed)) {
                }
                rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                    /* renamed from: measure-0kLqBqw */
                    public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                        float Camera2StreamConfigurationMap;
                        float highResolutionOutputSizeshNQ4ISI;
                        float highSpeedVideoFpsRanges;
                        long m8723constructorimpl;
                        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.m1904getMeasurementScopeInvalidatorzYiylxw$foundation());
                        boolean z10 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                        androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, orientation);
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo1881invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1881invoke0kLqBqw(lazyLayoutMeasureScope, j);
                        boolean z11 = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider invoke = function0.invoke();
                        Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.Camera2StreamConfigurationMap(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                        int i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(Camera2StreamConfigurationMap);
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighResolutionOutputSizeshNQ4ISI(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                        int i3 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highResolutionOutputSizeshNQ4ISI);
                        highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighSpeedVideoFpsRanges(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection());
                        int i4 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highSpeedVideoFpsRanges);
                        int m8553getMaxHeightimpl = z11 ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                        if (z11) {
                            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i4 << 32));
                        } else {
                            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i4 & 4294967295L) | (i2 << 32));
                        }
                        long j2 = m8723constructorimpl;
                        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                        int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                        androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues;
                        boolean z12 = z11;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m1901measureStaggeredGridC6celF4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m1901measureStaggeredGridC6celF4(lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getPinnedItems(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getBeyondBoundsInfo()), invoke, mo1881invoke0kLqBqw, androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i5), 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z12, z, j2, (m8553getMaxHeightimpl - i2) - i3, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(f), i2, i3, coroutineScope, z10, lazyLayoutMeasureScope.isLookingAhead(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getApproachLayoutInfo(), graphicsContext);
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, m1901measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return m1901measureStaggeredGridC6celF4;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return lazyLayoutMeasurePolicy2;
            }
            z7 = true;
            if (((3670016 & i) ^ 1572864) <= 1048576) {
            }
            if (((234881024 & i) ^ 100663296) <= 67108864) {
            }
            if ((i & 100663296) != 67108864) {
            }
            obj = graphicsContext;
            z9 = true;
            changed = composer.changed(obj);
            rememberedValue = composer.rememberedValue();
            if (!(z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | changed)) {
            }
            rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                /* renamed from: measure-0kLqBqw */
                public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    float Camera2StreamConfigurationMap;
                    float highResolutionOutputSizeshNQ4ISI;
                    float highSpeedVideoFpsRanges;
                    long m8723constructorimpl;
                    androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.m1904getMeasurementScopeInvalidatorzYiylxw$foundation());
                    boolean z10 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, orientation);
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo1881invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1881invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z11 = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider invoke = function0.invoke();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.Camera2StreamConfigurationMap(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(Camera2StreamConfigurationMap);
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighResolutionOutputSizeshNQ4ISI(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int i3 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highResolutionOutputSizeshNQ4ISI);
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighSpeedVideoFpsRanges(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection());
                    int i4 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highSpeedVideoFpsRanges);
                    int m8553getMaxHeightimpl = z11 ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                    if (z11) {
                        m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i4 << 32));
                    } else {
                        m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i4 & 4294967295L) | (i2 << 32));
                    }
                    long j2 = m8723constructorimpl;
                    androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                    int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues;
                    boolean z12 = z11;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m1901measureStaggeredGridC6celF4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m1901measureStaggeredGridC6celF4(lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getPinnedItems(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getBeyondBoundsInfo()), invoke, mo1881invoke0kLqBqw, androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i5), 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z12, z, j2, (m8553getMaxHeightimpl - i2) - i3, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(f), i2, i3, coroutineScope, z10, lazyLayoutMeasureScope.isLookingAhead(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getApproachLayoutInfo(), graphicsContext);
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, m1901measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return m1901measureStaggeredGridC6celF4;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy22;
        }
        z2 = true;
        if (((i & 112) ^ 48) <= 32) {
        }
        if (((i & 896) ^ 384) <= 256) {
        }
        if (((i & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i) ^ 24576) <= 16384) {
        }
        if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if ((196608 & i) != 131072) {
        }
        z7 = true;
        if (((3670016 & i) ^ 1572864) <= 1048576) {
        }
        if (((234881024 & i) ^ 100663296) <= 67108864) {
        }
        if ((i & 100663296) != 67108864) {
        }
        obj = graphicsContext;
        z9 = true;
        changed = composer.changed(obj);
        rememberedValue = composer.rememberedValue();
        if (!(z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | changed)) {
        }
        rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
            /* renamed from: measure-0kLqBqw */
            public final androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                float Camera2StreamConfigurationMap;
                float highResolutionOutputSizeshNQ4ISI;
                float highSpeedVideoFpsRanges;
                long m8723constructorimpl;
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.m1904getMeasurementScopeInvalidatorzYiylxw$foundation());
                boolean z10 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, orientation);
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo1881invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1881invoke0kLqBqw(lazyLayoutMeasureScope, j);
                boolean z11 = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider invoke = function0.invoke();
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.Camera2StreamConfigurationMap(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                int i2 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(Camera2StreamConfigurationMap);
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighResolutionOutputSizeshNQ4ISI(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                int i3 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highResolutionOutputSizeshNQ4ISI);
                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.getHighSpeedVideoFpsRanges(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection());
                int i4 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(highSpeedVideoFpsRanges);
                int m8553getMaxHeightimpl = z11 ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                if (z11) {
                    m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i4 << 32));
                } else {
                    m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i4 & 4294967295L) | (i2 << 32));
                }
                long j2 = m8723constructorimpl;
                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                int i5 = lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues;
                boolean z12 = z11;
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m1901measureStaggeredGridC6celF4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m1901measureStaggeredGridC6celF4(lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getPinnedItems(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getBeyondBoundsInfo()), invoke, mo1881invoke0kLqBqw, androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i5), 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z12, z, j2, (m8553getMaxHeightimpl - i2) - i3, lazyLayoutMeasureScope.mo1412roundToPx0680j_4(f), i2, i3, coroutineScope, z10, lazyLayoutMeasureScope.isLookingAhead(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getApproachLayoutInfo(), graphicsContext);
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, m1901measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                return m1901measureStaggeredGridC6celF4;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return paddingValues.getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (z) {
            return androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (z) {
            return androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.Orientation.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
