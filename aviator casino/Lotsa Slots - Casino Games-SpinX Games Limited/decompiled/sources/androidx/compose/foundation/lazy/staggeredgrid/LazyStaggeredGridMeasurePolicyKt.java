package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aw\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001a\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberStaggeredGridMeasurePolicy-1tP8Re8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* renamed from: rememberStaggeredGridMeasurePolicy-1tP8Re8, reason: not valid java name */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m778rememberStaggeredGridMeasurePolicy1tP8Re8(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> function0, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final androidx.compose.foundation.gestures.Orientation orientation, final float f, float f2, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-72951591);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberStaggeredGridMeasurePolicy)P(8,3!1,6,5,4:c#ui.unit.Dp,2:c#ui.unit.Dp)48@2083L2788:LazyStaggeredGridMeasurePolicy.kt#fzvcnm");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-72951591, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:48)");
        }
        java.lang.Object[] objArr = {lazyStaggeredGridState, function0, paddingValues, java.lang.Boolean.valueOf(z), orientation, androidx.compose.ui.unit.Dp.m4476boximpl(f), androidx.compose.ui.unit.Dp.m4476boximpl(f2), lazyGridStaggeredGridSlotsProvider};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i2 = 0; i2 < 8; i2++) {
            z2 |= composer.changed(objArr[i2]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult invoke(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                    return m779invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m779invoke0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    float beforePadding;
                    float afterPadding;
                    float startPadding;
                    long IntOffset;
                    androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m240checkScrollableContainerConstraintsK40F9xA(j, androidx.compose.foundation.gestures.Orientation.this);
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo761invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo761invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z3 = androidx.compose.foundation.gestures.Orientation.this == androidx.compose.foundation.gestures.Orientation.Vertical;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider invoke = function0.invoke();
                    lazyStaggeredGridState.setSlots$foundation_release(mo761invoke0kLqBqw);
                    lazyStaggeredGridState.setVertical$foundation_release(z3);
                    lazyStaggeredGridState.setSpanProvider$foundation_release(invoke.getSpanProvider());
                    beforePadding = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, androidx.compose.foundation.gestures.Orientation.this, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int i3 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(beforePadding);
                    afterPadding = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, androidx.compose.foundation.gestures.Orientation.this, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int i4 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(afterPadding);
                    startPadding = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, androidx.compose.foundation.gestures.Orientation.this, lazyLayoutMeasureScope.getLayoutDirection());
                    int i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(startPadding);
                    int m4423getMaxHeightimpl = ((z3 ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)) - i3) - i4;
                    if (z3) {
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i5, i3);
                    } else {
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i3, i5);
                    }
                    long j2 = IntOffset;
                    androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                    int i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues;
                    boolean z4 = z3;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m777measureStaggeredGridsdzDtKU = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m777measureStaggeredGridsdzDtKU(lazyLayoutMeasureScope, lazyStaggeredGridState, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), invoke, mo761invoke0kLqBqw, androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, i6), 0, androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z4, z, j2, m4423getMaxHeightimpl, lazyLayoutMeasureScope.mo309roundToPx0680j_4(f), i3, i4, coroutineScope);
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, m777measureStaggeredGridsdzDtKU, false, 2, null);
                    return m777measureStaggeredGridsdzDtKU;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> function2 = (kotlin.jvm.functions.Function2) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
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
    public static final float afterPadding(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
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
}
