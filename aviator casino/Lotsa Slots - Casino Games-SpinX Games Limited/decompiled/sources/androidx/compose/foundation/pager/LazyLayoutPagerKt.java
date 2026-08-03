package androidx.compose.foundation.pager;

/* compiled from: LazyLayoutPager.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÖ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0081\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0004\u001a\u00020\u000521\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&2#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100*H\u0003¢\u0006\u0002\u0010-\u001a\u0014\u0010.\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", com.ironsource.X3.i.W, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-fs30GE4", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* renamed from: Pager-fs30GE4, reason: not valid java name */
    public static final void m799Pagerfs30GE4(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.pager.PagerState pagerState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, final boolean z2, int i, float f, final androidx.compose.foundation.pager.PageSize pageSize, final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, final androidx.compose.ui.Alignment.Horizontal horizontal, final androidx.compose.ui.Alignment.Vertical vertical, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-301644943);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Pager)P(5,12,1,11,6,2,13!1,10:c#ui.unit.Dp,9,8,4!1,14)101@4846L18,103@4894L134,109@5054L534,124@5619L94,128@5739L115,134@5889L49,140@6089L276,149@6485L150,155@6798L7,148@6429L478,163@7131L7,136@5944L1832:LazyLayoutPager.kt#g6yjnt");
        int i5 = (i4 & 128) != 0 ? 0 : i;
        float m4478constructorimpl = (i4 & 256) != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-301644943, i2, i3, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:95)");
        }
        if (i5 < 0) {
            throw new java.lang.IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + i5).toString());
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-735094232);
        boolean changed = startRestartGroup.changed(pagerState);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Integer invoke() {
                    return java.lang.Integer.valueOf(androidx.compose.foundation.pager.PagerState.this.getPageCount());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i6 = i2 >> 3;
        int i7 = i6 & 14;
        kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda = rememberPagerItemProviderLambda(pagerState, function4, function1, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, i7 | ((i3 >> 9) & 112) | ((i3 << 3) & 896));
        androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapAlignmentStartToStart = androidx.compose.foundation.pager.PagerStateKt.getSnapAlignmentStartToStart();
        startRestartGroup.startReplaceableGroup(-735093678);
        boolean changed2 = startRestartGroup.changed(pagerState);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Integer invoke() {
                    return java.lang.Integer.valueOf(androidx.compose.foundation.pager.PagerState.this.getPageCount());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        int i8 = i2 & 7168;
        int i9 = i2 >> 6;
        int i10 = i3 << 18;
        final int i11 = i5;
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> m810rememberPagerMeasurePolicy121YqSk = androidx.compose.foundation.pager.PagerMeasurePolicyKt.m810rememberPagerMeasurePolicy121YqSk(rememberPagerItemProviderLambda, pagerState, paddingValues, z, orientation, i5, m4478constructorimpl, pageSize, horizontal, vertical, snapAlignmentStartToStart, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, (i2 & 112) | (i2 & 896) | i8 | (i2 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (234881024 & i10) | (i10 & 1879048192), 0);
        startRestartGroup.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = startRestartGroup.changed(snapFlingBehavior) | startRestartGroup.changed(pagerState);
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) rememberedValue3;
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberPagerSemanticState = androidx.compose.foundation.pager.PagerSemanticsKt.rememberPagerSemanticState(pagerState, z, orientation == androidx.compose.foundation.gestures.Orientation.Vertical, startRestartGroup, i7 | (i9 & 112));
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed4 = startRestartGroup.changed(pagerState);
        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new androidx.compose.foundation.pager.PagerBringIntoViewSpec(pagerState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.pager.PagerBringIntoViewSpec pagerBringIntoViewSpec = (androidx.compose.foundation.pager.PagerBringIntoViewSpec) rememberedValue4;
        androidx.compose.ui.Modifier clipScrollableContainer = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier()).then(pagerState.getAwaitLayoutModifier()), rememberPagerItemProviderLambda, rememberPagerSemanticState, orientation, z2, z, startRestartGroup, (i6 & 7168) | (i9 & 57344) | ((i2 << 6) & 458752)), orientation);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState = androidx.compose.foundation.pager.PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState, i11, startRestartGroup, i7 | ((i2 >> 18) & 112));
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo = pagerState.getBeyondBoundsInfo();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localLayoutDirection);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.Modifier overscroll = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer, rememberPagerBeyondBoundsState, beyondBoundsInfo, z, (androidx.compose.ui.unit.LayoutDirection) consume, orientation, z2, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | i8 | ((i2 << 3) & 458752) | (i2 & 3670016)), overscrollEffect);
        androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberPagerItemProviderLambda, androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(androidx.compose.foundation.gestures.ScrollableKt.scrollable(overscroll, pagerState, orientation, overscrollEffect, z2, scrollableDefaults.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume2, orientation, z), pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource(), pagerBringIntoViewSpec), pagerState), nestedScrollConnection, null, 2, null), pagerState.getPrefetchState(), m810rememberPagerMeasurePolicy121YqSk, startRestartGroup, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f2 = m4478constructorimpl;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                    androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(androidx.compose.ui.Modifier.this, pagerState, paddingValues, z, orientation, snapFlingBehavior, z2, i11, f2, pageSize, nestedScrollConnection, function1, horizontal, vertical, function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    private static final kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final androidx.compose.foundation.pager.PagerState pagerState, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, final kotlin.jvm.functions.Function0<java.lang.Integer> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1372505274);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberPagerItemProviderLambda)P(3,1)248@10137L33,249@10191L25,250@10228L677:LazyLayoutPager.kt#g6yjnt");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:247)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function4, composer, (i >> 3) & 14);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 6) & 14);
        java.lang.Object[] objArr = {pagerState, rememberUpdatedState, rememberUpdatedState2, function0};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z |= composer.changed(objArr[i2]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final androidx.compose.runtime.State derivedStateOf = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.pager.PagerLayoutIntervalContent invoke() {
                    return new androidx.compose.foundation.pager.PagerLayoutIntervalContent(rememberUpdatedState.getValue(), rememberUpdatedState2.getValue(), function0.invoke().intValue());
                }
            });
            final androidx.compose.runtime.State derivedStateOf2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.pager.PagerLazyLayoutItemProvider invoke() {
                    androidx.compose.foundation.pager.PagerLayoutIntervalContent value = derivedStateOf.getValue();
                    return new androidx.compose.foundation.pager.PagerLazyLayoutItemProvider(pagerState, value, new androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = (kotlin.reflect.KProperty0) new kotlin.jvm.internal.PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public java.lang.Object get() {
                    return ((androidx.compose.runtime.State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        kotlin.reflect.KProperty0 kProperty0 = (kotlin.reflect.KProperty0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return kProperty0;
    }

    private static final androidx.compose.ui.Modifier dragDirectionDetector(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.pager.PagerState pagerState) {
        return modifier.then(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, pagerState, new androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }
}
