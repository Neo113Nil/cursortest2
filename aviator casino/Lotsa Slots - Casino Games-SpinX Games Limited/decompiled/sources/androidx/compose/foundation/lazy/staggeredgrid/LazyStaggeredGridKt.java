package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGrid.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    /* renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m768LazyStaggeredGridLJWHXA8(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, float f, float f2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(288295126);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyStaggeredGrid)P(9,6,8,5,1,7,3,10,4:c#ui.unit.Dp,2:c#ui.unit.Dp)52@2419L15,62@2835L18,64@2884L55,65@2965L24,66@3014L242,77@3281L60,83@3492L277,92@3889L57,95@4109L7,91@3833L385,103@4442L7,79@3347L1579:LazyStaggeredGrid.kt#fzvcnm");
        androidx.compose.ui.Modifier modifier2 = (i3 & 8) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = (i3 & 16) != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues;
        boolean z3 = (i3 & 32) != 0 ? false : z;
        if ((i3 & 64) != 0) {
            flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
            i4 = i & (-3670017);
        } else {
            flingBehavior2 = flingBehavior;
            i4 = i;
        }
        boolean z4 = (i3 & 128) != 0 ? true : z2;
        float m4478constructorimpl = (i3 & 256) != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
        float m4478constructorimpl2 = (i3 & 512) != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(288295126, i4, i2, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:61)");
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i2 << 3) & 112) | 8);
        startRestartGroup.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        int i5 = i4 >> 6;
        int i6 = i5 & 7168;
        int i7 = i4 >> 9;
        int i8 = i4;
        final boolean z5 = z3;
        final androidx.compose.ui.Modifier modifier3 = modifier2;
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m778rememberStaggeredGridMeasurePolicy1tP8Re8 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m778rememberStaggeredGridMeasurePolicy1tP8Re8(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, m561PaddingValues0680j_4, z3, orientation, m4478constructorimpl, m4478constructorimpl2, coroutineScope, lazyGridStaggeredGridSlotsProvider, startRestartGroup, (i5 & 896) | 16777224 | i6 | ((i4 << 9) & 57344) | (i7 & 458752) | (i7 & 3670016) | ((i4 << 18) & 234881024));
        androidx.compose.ui.Modifier clipScrollableContainer = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z5, startRestartGroup, ((i8 >> 12) & 112) | 8), orientation, z4, z5, startRestartGroup, ((i8 << 6) & 7168) | (i7 & 57344) | (i8 & 458752)), orientation);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, 8);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyStaggeredGridState.getBeyondBoundsInfo();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localLayoutDirection);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.Modifier overscroll = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer, rememberLazyStaggeredGridBeyondBoundsState, beyondBoundsInfo, z5, (androidx.compose.ui.unit.LayoutDirection) consume, orientation, z4, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | i6 | ((i8 << 12) & 458752) | ((i8 >> 3) & 3670016)), overscrollEffect);
        androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll, lazyStaggeredGridState, orientation, overscrollEffect, z4, scrollableDefaults.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume2, orientation, z5), flingBehavior2, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), m778rememberStaggeredGridMeasurePolicy1tP8Re8, startRestartGroup, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.foundation.layout.PaddingValues paddingValues2 = m561PaddingValues0680j_4;
            final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z6 = z4;
            final float f3 = m4478constructorimpl;
            final float f4 = m4478constructorimpl2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m768LazyStaggeredGridLJWHXA8(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues2, z5, flingBehavior3, z6, f3, f4, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }
}
