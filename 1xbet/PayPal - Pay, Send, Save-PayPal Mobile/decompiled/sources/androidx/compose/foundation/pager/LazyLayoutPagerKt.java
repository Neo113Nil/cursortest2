package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aå\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$21\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*H\u0001¢\u0006\u0004\b+\u0010,\u001a\u0081\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0004\u001a\u00020\u000521\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*2#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0003¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u00063"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-eLwUrMk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    public static final void m1917PagereLwUrMk(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.pager.PagerState pagerState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, final boolean z2, final androidx.compose.foundation.OverscrollEffect overscrollEffect, int i, float f, final androidx.compose.foundation.pager.PageSize pageSize, final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, final androidx.compose.ui.Alignment.Horizontal horizontal, final androidx.compose.ui.Alignment.Vertical vertical, final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final int i7;
        final float f2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        int i8;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-572816025);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(targetedFlingBehavior) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(overscrollEffect) ? 8388608 : 4194304;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changed(i) ? 67108864 : 33554432;
        }
        int i10 = i4 & 512;
        if (i10 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(pageSize) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(nestedScrollConnection) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= startRestartGroup.changed(horizontal) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= startRestartGroup.changed(vertical) ? 16384 : 8192;
        }
        if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= startRestartGroup.changed(snapPosition) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        int i11 = i6;
        if (!startRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true, i5 & 1)) {
            androidx.compose.runtime.Composer composer4 = startRestartGroup;
            composer4.skipToGroupEnd();
            i7 = i;
            f2 = f;
            composer2 = composer4;
        } else {
            int i12 = i9 != 0 ? 0 : i;
            float m8601constructorimpl = i10 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-572816025, i5, i11, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
            }
            if (i12 < 0) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("beyondViewportPageCount should be greater than or equal to 0, you selected ".concat(java.lang.String.valueOf(i12)));
            }
            int i13 = i5 & 112;
            boolean z3 = i13 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        int highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.pager.LazyLayoutPagerKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerState.this);
                        return java.lang.Integer.valueOf(highSpeedVideoFpsRanges);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            int i14 = i5 >> 3;
            int i15 = i14 & 14;
            int i16 = i11 >> 15;
            int i17 = i5;
            int i18 = i12;
            kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(pagerState, function4, function1, function0, startRestartGroup, i15 | (i16 & 112) | (i11 & 896));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer3 = startRestartGroup;
                rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3);
                composer3.updateRememberedValue(rememberedValue2);
            } else {
                composer3 = startRestartGroup;
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
            boolean z4 = i13 == 32;
            java.lang.Object rememberedValue3 = composer3.rememberedValue();
            if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        int Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.pager.LazyLayoutPagerKt.Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState.this);
                        return java.lang.Integer.valueOf(Camera2StreamConfigurationMap);
                    }
                };
                composer3.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            int i19 = i17 >> 9;
            int i20 = i11 << 15;
            androidx.compose.runtime.Composer composer5 = composer3;
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy m1930rememberPagerMeasurePolicy8u0NR3k = androidx.compose.foundation.pager.PagerMeasurePolicyKt.m1930rememberPagerMeasurePolicy8u0NR3k(highSpeedVideoFpsRanges, pagerState, paddingValues, z, orientation, i18, m8601constructorimpl, pageSize, horizontal, vertical, snapPosition, coroutineScope, function02, composer5, ((i11 << 21) & 29360128) | (i19 & 3670016) | (i17 & 65520) | (i19 & 458752) | (234881024 & i20) | (1879048192 & i20), i16 & 14);
            androidx.compose.runtime.Composer composer6 = composer5;
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberPagerSemanticState = androidx.compose.foundation.pager.PagerSemanticsKt.rememberPagerSemanticState(pagerState, orientation == androidx.compose.foundation.gestures.Orientation.Vertical, composer6, i15);
            boolean z5 = i13 == 32;
            boolean z6 = (i17 & 458752) == 131072;
            java.lang.Object rememberedValue4 = composer6.rememberedValue();
            if ((z5 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior(targetedFlingBehavior, pagerState);
                composer6.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) rememberedValue4;
            androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec = (androidx.compose.foundation.gestures.BringIntoViewSpec) composer6.consume(androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec());
            boolean z7 = i13 == 32;
            boolean changed = composer6.changed(bringIntoViewSpec);
            java.lang.Object rememberedValue5 = composer6.rememberedValue();
            if ((z7 | changed) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new androidx.compose.foundation.pager.PagerBringIntoViewSpec(pagerState, bringIntoViewSpec);
                composer6.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.foundation.pager.PagerBringIntoViewSpec pagerBringIntoViewSpec = (androidx.compose.foundation.pager.PagerBringIntoViewSpec) rememberedValue5;
            if (z2) {
                composer6.startReplaceGroup(-853822717);
                i8 = i18;
                companion = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.pager.PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState, i8, composer6, i15 | ((i17 >> 21) & 112)), pagerState.getBeyondBoundsInfo(), z, orientation);
                composer6.endReplaceGroup();
            } else {
                i8 = i18;
                composer6.startReplaceGroup(-853392933);
                composer6.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            int i21 = i8;
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(highSpeedVideoFpsRanges, androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.ScrollableAreaKt.scrollableArea(androidx.compose.foundation.pager.PagerKt.pagerSemantics(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier()).then(pagerState.getAwaitLayoutModifier()), highSpeedVideoFpsRanges, rememberPagerSemanticState, orientation, z2, z, composer6, ((i17 << 6) & 458752) | (i14 & 7168) | ((i17 >> 6) & 57344)), pagerState, orientation == androidx.compose.foundation.gestures.Orientation.Vertical, coroutineScope, z2).then(companion), pagerState, orientation, overscrollEffect, z2, z, pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource(), pagerBringIntoViewSpec), pagerState), nestedScrollConnection, null, 2, null), pagerState.getPrefetchState(), m1930rememberPagerMeasurePolicy8u0NR3k, composer6, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            i7 = i21;
            f2 = m8601constructorimpl;
            composer2 = composer6;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges2;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRanges2 = androidx.compose.foundation.pager.LazyLayoutPagerKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.this, pagerState, paddingValues, z, orientation, targetedFlingBehavior, z2, overscrollEffect, i7, f2, pageSize, nestedScrollConnection, function1, horizontal, vertical, snapPosition, function4, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRanges2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerState pagerState) {
        return pagerState.getPageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState pagerState) {
        return pagerState.getPageCount();
    }

    private static final kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> getHighSpeedVideoFpsRanges(final androidx.compose.foundation.pager.PagerState pagerState, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, final kotlin.jvm.functions.Function0<java.lang.Integer> function0, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1052364153, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:257)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function4, composer, (i >> 3) & 14);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 6) & 14);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4;
        boolean changed = composer.changed(rememberUpdatedState);
        boolean changed2 = composer.changed(rememberUpdatedState2);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(function0)) && (i & 3072) != 2048) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | changed | changed2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final androidx.compose.runtime.State derivedStateOf = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.pager.PagerLayoutIntervalContent highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.pager.LazyLayoutPagerKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this, rememberUpdatedState2, function0);
                    return highSpeedVideoFpsRanges;
                }
            });
            final androidx.compose.runtime.State derivedStateOf2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.pager.PagerLazyLayoutItemProvider highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.LazyLayoutPagerKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State.this, pagerState);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
            rememberedValue = (kotlin.reflect.KProperty0) new kotlin.jvm.internal.PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((androidx.compose.runtime.State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.reflect.KProperty0 kProperty0 = (kotlin.reflect.KProperty0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kProperty0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.PagerLayoutIntervalContent getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state, androidx.compose.runtime.State state2, kotlin.jvm.functions.Function0 function0) {
        return new androidx.compose.foundation.pager.PagerLayoutIntervalContent((kotlin.jvm.functions.Function4) state.getValue(), (kotlin.jvm.functions.Function1) state2.getValue(), ((java.lang.Number) function0.invoke()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.PagerLazyLayoutItemProvider getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State state, androidx.compose.foundation.pager.PagerState pagerState) {
        androidx.compose.foundation.pager.PagerLayoutIntervalContent pagerLayoutIntervalContent = (androidx.compose.foundation.pager.PagerLayoutIntervalContent) state.getValue();
        return new androidx.compose.foundation.pager.PagerLazyLayoutItemProvider(pagerState, pagerLayoutIntervalContent, new androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation(), pagerLayoutIntervalContent));
    }

    private static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.pager.PagerState pagerState) {
        return modifier.then(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, pagerState, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
                int getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighSpeedVideoSizes;

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 1)
                /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00181 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    java.lang.Object Camera2StreamConfigurationMap;
                    final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighResolutionOutputSizeshNQ4ISI;
                    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
                    
                        if (r11 == r0) goto L26;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
                    
                        if (r11 != r0) goto L12;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006a -> B:6:0x006d). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
                            this.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                        } else if (i == 1) {
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.Camera2StreamConfigurationMap;
                            pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizes;
                            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                            int size = changes.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(changes.get(i2))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    pointerInputChange = pointerEvent.getChanges().get(0);
                                    break;
                                }
                            }
                            if (pointerInputChange != null) {
                                this.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                                this.getHighSpeedVideoSizes = pointerInputChange2;
                                this.Camera2StreamConfigurationMap = pointerInputChange;
                                this.getHighSpeedVideoFpsRangesFor = 2;
                                obj = awaitPointerEventScope2.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI.m1937setUpDownDifferencek4lQ0M$foundation(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition()));
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.m1937setUpDownDifferencek4lQ0M$foundation(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = null;
                        pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                        if (pointerInputChange != null) {
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00181) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00181 c00181 = new androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00181(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                        c00181.getHighSpeedVideoFpsRanges = obj;
                        return c00181;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00181(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00181> continuation) {
                        super(2, continuation);
                        this.getHighResolutionOutputSizeshNQ4ISI = pagerState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getHighSpeedVideoFpsRangesFor = 1;
                        if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00181(this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.jvm.functions.Function2
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
                    this.getHighSpeedVideoSizes = pagerState;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1(pointerInputScope, androidx.compose.foundation.pager.PagerState.this, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, int i, float f, androidx.compose.foundation.pager.PageSize pageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, kotlin.jvm.functions.Function4 function4, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m1917PagereLwUrMk(modifier, pagerState, paddingValues, z, orientation, targetedFlingBehavior, z2, overscrollEffect, i, f, pageSize, nestedScrollConnection, function1, horizontal, vertical, snapPosition, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }
}
