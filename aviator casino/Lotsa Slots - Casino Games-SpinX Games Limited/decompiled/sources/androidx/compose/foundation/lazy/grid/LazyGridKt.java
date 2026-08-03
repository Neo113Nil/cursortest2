package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGrid.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001av\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#¨\u0006$"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, final boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final boolean z3, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        int i6;
        int i7;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        int i8;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer2;
        final boolean z5;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues4;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-649686062);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)68@3230L15,78@3671L18,80@3720L50,82@3796L51,84@3874L24,85@3923L244,104@4440L277,113@4837L48,116@5048L7,112@4781L376,124@5381L7,100@4295L1571:LazyGrid.kt#7791vq");
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & 458752) == 0) {
                    i6 = startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((234881024 & i) == 0) {
                        i4 |= startRestartGroup.changed(vertical) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((1879048192 & i) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
                            if ((i3 & 1024) == 0) {
                                i7 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i7 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                            } else {
                                i7 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i7 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    androidx.compose.ui.Modifier.Companion companion = i9 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = i10 == 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        modifier3 = companion;
                                        z4 = z6;
                                        paddingValues3 = m561PaddingValues0680j_4;
                                        flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        modifier3 = companion;
                                        z4 = z6;
                                        paddingValues3 = m561PaddingValues0680j_4;
                                    }
                                    i8 = i4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i8 = i4;
                                    paddingValues3 = paddingValues2;
                                    z4 = z;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-649686062, i8, i7, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                                }
                                androidx.compose.foundation.OverscrollEffect overscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                                int i11 = i8 >> 3;
                                int i12 = i11 & 14;
                                kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i12);
                                int i13 = i8 >> 9;
                                androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i13 & 112) | i12);
                                startRestartGroup.startReplaceableGroup(773894976);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                startRestartGroup.endReplaceableGroup();
                                kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                int i14 = i8;
                                boolean z7 = z4;
                                androidx.compose.ui.Modifier modifier5 = modifier3;
                                kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i13 & 3670016) | (i11 & 29360128));
                                lazyGridState.setVertical$foundation_release(z2);
                                androidx.compose.foundation.gestures.Orientation orientation = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                                androidx.compose.ui.Modifier clipScrollableContainer = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda, rememberLazyGridSemanticState, orientation, z3, z7, startRestartGroup, (i13 & 57344) | ((i14 << 3) & 458752)), orientation);
                                androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i12);
                                androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyGridState.getBeyondBoundsInfo();
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                composer2 = startRestartGroup;
                                androidx.compose.ui.Modifier overscroll = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer, rememberLazyGridBeyondBoundsState, beyondBoundsInfo, z7, (androidx.compose.ui.unit.LayoutDirection) consume, orientation, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i11 & 7168) | (i11 & 3670016)), overscrollEffect);
                                androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = composer2.consume(localLayoutDirection2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll, lazyGridState, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume2, orientation, z7), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                z5 = z7;
                                modifier4 = modifier5;
                                paddingValues4 = paddingValues3;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z;
                                modifier4 = modifier2;
                                paddingValues4 = paddingValues2;
                                composer2 = startRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                        androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier.this, lazyGridState, lazyGridSlotsProvider, paddingValues4, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        i8 = i4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.compose.foundation.OverscrollEffect overscrollEffect2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                        int i112 = i8 >> 3;
                        int i122 = i112 & 14;
                        kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda2 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i122);
                        int i132 = i8 >> 9;
                        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState2 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i132 & 112) | i122);
                        startRestartGroup.startReplaceableGroup(773894976);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        int i142 = i8;
                        boolean z72 = z4;
                        androidx.compose.ui.Modifier modifier52 = modifier3;
                        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i132 & 3670016) | (i112 & 29360128));
                        lazyGridState.setVertical$foundation_release(z2);
                        androidx.compose.foundation.gestures.Orientation orientation2 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                        androidx.compose.ui.Modifier clipScrollableContainer2 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier52.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2, rememberLazyGridSemanticState2, orientation2, z3, z72, startRestartGroup, (i132 & 57344) | ((i142 << 3) & 458752)), orientation2);
                        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i122);
                        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyGridState.getBeyondBoundsInfo();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = startRestartGroup.consume(localLayoutDirection3);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        composer2 = startRestartGroup;
                        androidx.compose.ui.Modifier overscroll2 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer2, rememberLazyGridBeyondBoundsState2, beyondBoundsInfo2, z72, (androidx.compose.ui.unit.LayoutDirection) consume3, orientation2, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i112 & 7168) | (i112 & 3670016)), overscrollEffect2);
                        androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22 = composer2.consume(localLayoutDirection22);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll2, lazyGridState, orientation2, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume22, orientation2, z72), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2, composer2, 0, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z72;
                        modifier4 = modifier52;
                        paddingValues4 = paddingValues3;
                        flingBehavior3 = flingBehavior2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    i8 = i4;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.foundation.OverscrollEffect overscrollEffect22 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i1122 = i8 >> 3;
                    int i1222 = i1122 & 14;
                    kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda22 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i1222);
                    int i1322 = i8 >> 9;
                    androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState22 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i1322 & 112) | i1222);
                    startRestartGroup.startReplaceableGroup(773894976);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    kotlinx.coroutines.CoroutineScope coroutineScope22 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    int i1422 = i8;
                    boolean z722 = z4;
                    androidx.compose.ui.Modifier modifier522 = modifier3;
                    kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i1322 & 3670016) | (i1122 & 29360128));
                    lazyGridState.setVertical$foundation_release(z2);
                    androidx.compose.foundation.gestures.Orientation orientation22 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                    androidx.compose.ui.Modifier clipScrollableContainer22 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier522.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22, rememberLazyGridSemanticState22, orientation22, z3, z722, startRestartGroup, (i1322 & 57344) | ((i1422 << 3) & 458752)), orientation22);
                    androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1222);
                    androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyGridState.getBeyondBoundsInfo();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume32 = startRestartGroup.consume(localLayoutDirection32);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    composer2 = startRestartGroup;
                    androidx.compose.ui.Modifier overscroll22 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer22, rememberLazyGridBeyondBoundsState22, beyondBoundsInfo22, z722, (androidx.compose.ui.unit.LayoutDirection) consume32, orientation22, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i1122 & 7168) | (i1122 & 3670016)), overscrollEffect22);
                    androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults22 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222 = composer2.consume(localLayoutDirection222);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll22, lazyGridState, orientation22, overscrollEffect22, z3, scrollableDefaults22.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume222, orientation22, z722), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22, composer2, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z722;
                    modifier4 = modifier522;
                    paddingValues4 = paddingValues3;
                    flingBehavior3 = flingBehavior2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                i8 = i4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.foundation.OverscrollEffect overscrollEffect222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                int i11222 = i8 >> 3;
                int i12222 = i11222 & 14;
                kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda222 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i12222);
                int i13222 = i8 >> 9;
                androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState222 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i13222 & 112) | i12222);
                startRestartGroup.startReplaceableGroup(773894976);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                kotlinx.coroutines.CoroutineScope coroutineScope222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                int i14222 = i8;
                boolean z7222 = z4;
                androidx.compose.ui.Modifier modifier5222 = modifier3;
                kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope222, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i13222 & 3670016) | (i11222 & 29360128));
                lazyGridState.setVertical$foundation_release(z2);
                androidx.compose.foundation.gestures.Orientation orientation222 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                androidx.compose.ui.Modifier clipScrollableContainer222 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda222, rememberLazyGridSemanticState222, orientation222, z3, z7222, startRestartGroup, (i13222 & 57344) | ((i14222 << 3) & 458752)), orientation222);
                androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState222 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i12222);
                androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyGridState.getBeyondBoundsInfo();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume322 = startRestartGroup.consume(localLayoutDirection322);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                composer2 = startRestartGroup;
                androidx.compose.ui.Modifier overscroll222 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer222, rememberLazyGridBeyondBoundsState222, beyondBoundsInfo222, z7222, (androidx.compose.ui.unit.LayoutDirection) consume322, orientation222, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i11222 & 7168) | (i11222 & 3670016)), overscrollEffect222);
                androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2222 = composer2.consume(localLayoutDirection2222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda222, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll222, lazyGridState, orientation222, overscrollEffect222, z3, scrollableDefaults222.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume2222, orientation222, z7222), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy222, composer2, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z5 = z7222;
                modifier4 = modifier5222;
                paddingValues4 = paddingValues3;
                flingBehavior3 = flingBehavior2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 |= i6;
            if ((i & 3670016) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i8 = i4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.foundation.OverscrollEffect overscrollEffect2222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i112222 = i8 >> 3;
            int i122222 = i112222 & 14;
            kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda2222 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i122222);
            int i132222 = i8 >> 9;
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState2222 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i132222 & 112) | i122222);
            startRestartGroup.startReplaceableGroup(773894976);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            kotlinx.coroutines.CoroutineScope coroutineScope2222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            int i142222 = i8;
            boolean z72222 = z4;
            androidx.compose.ui.Modifier modifier52222 = modifier3;
            kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2222, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i132222 & 3670016) | (i112222 & 29360128));
            lazyGridState.setVertical$foundation_release(z2);
            androidx.compose.foundation.gestures.Orientation orientation2222 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
            androidx.compose.ui.Modifier clipScrollableContainer2222 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier52222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2222, rememberLazyGridSemanticState2222, orientation2222, z3, z72222, startRestartGroup, (i132222 & 57344) | ((i142222 << 3) & 458752)), orientation2222);
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2222 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i122222);
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo2222 = lazyGridState.getBeyondBoundsInfo();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3222 = startRestartGroup.consume(localLayoutDirection3222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            androidx.compose.ui.Modifier overscroll2222 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer2222, rememberLazyGridBeyondBoundsState2222, beyondBoundsInfo2222, z72222, (androidx.compose.ui.unit.LayoutDirection) consume3222, orientation2222, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i112222 & 7168) | (i112222 & 3670016)), overscrollEffect2222);
            androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults2222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22222 = composer2.consume(localLayoutDirection22222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2222, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll2222, lazyGridState, orientation2222, overscrollEffect2222, z3, scrollableDefaults2222.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume22222, orientation2222, z72222), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2222, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            z5 = z72222;
            modifier4 = modifier52222;
            paddingValues4 = paddingValues3;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i6;
        if ((i & 3670016) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i8 = i4;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect22222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1122222 = i8 >> 3;
        int i1222222 = i1122222 & 14;
        kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridItemProvider> rememberLazyGridItemProviderLambda22222 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i7 << 3) & 112) | i1222222);
        int i1322222 = i8 >> 9;
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyGridSemanticState22222 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i1322222 & 112) | i1222222);
        startRestartGroup.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        kotlinx.coroutines.CoroutineScope coroutineScope22222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        int i1422222 = i8;
        boolean z722222 = z4;
        androidx.compose.ui.Modifier modifier522222 = modifier3;
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22222, startRestartGroup, (i8 & 112) | 134217728 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i1322222 & 3670016) | (i1122222 & 29360128));
        lazyGridState.setVertical$foundation_release(z2);
        androidx.compose.foundation.gestures.Orientation orientation22222 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
        androidx.compose.ui.Modifier clipScrollableContainer22222 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier522222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22222, rememberLazyGridSemanticState22222, orientation22222, z3, z722222, startRestartGroup, (i1322222 & 57344) | ((i1422222 << 3) & 458752)), orientation22222);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22222 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1222222);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo22222 = lazyGridState.getBeyondBoundsInfo();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection32222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32222 = startRestartGroup.consume(localLayoutDirection32222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        composer2 = startRestartGroup;
        androidx.compose.ui.Modifier overscroll22222 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer22222, rememberLazyGridBeyondBoundsState22222, beyondBoundsInfo22222, z722222, (androidx.compose.ui.unit.LayoutDirection) consume32222, orientation22222, z3, startRestartGroup, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | (i1122222 & 7168) | (i1122222 & 3670016)), overscrollEffect22222);
        androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults22222 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222222 = composer2.consume(localLayoutDirection222222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22222, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll22222, lazyGridState, orientation22222, overscrollEffect22222, z3, scrollableDefaults22222.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume222222, orientation22222, z722222), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22222, composer2, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z5 = z722222;
        modifier4 = modifier522222;
        paddingValues4 = paddingValues3;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyGridMeasurePolicy(final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.grid.LazyGridItemProvider> function0, final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final boolean z2, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-2068958445);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberLazyGridMeasurePolicy)P(4,7,6!1,5,3,2,8)167@6903L8834:LazyGrid.kt#7791vq");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2068958445, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        java.lang.Object[] objArr = {lazyGridState, lazyGridSlotsProvider, paddingValues, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), horizontal, vertical};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i2 = 0; i2 < 7; i2++) {
            z3 |= composer.changed(objArr[i2]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.grid.LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridMeasureResult invoke(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                    return m704invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m704invoke0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i3;
                    int i4;
                    int i5;
                    float spacing;
                    int m4424getMaxWidthimpl;
                    long IntOffset;
                    int firstVisibleItemScrollOffset;
                    int i6;
                    androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m240checkScrollableContainerConstraintsK40F9xA(j, z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
                    if (z2) {
                        i3 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo519calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i3 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i4 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo520calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i3 + i4;
                    boolean z4 = z2;
                    int i11 = z4 ? i9 : i10;
                    if (z4 && !z) {
                        i5 = i7;
                    } else if (z4 && z) {
                        i5 = i8;
                    } else {
                        i5 = (z4 || z) ? i4 : i3;
                    }
                    final int i12 = i11 - i5;
                    long m4440offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(j, -i10, -i9);
                    final androidx.compose.foundation.lazy.grid.LazyGridItemProvider invoke = function0.invoke();
                    final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    final androidx.compose.foundation.lazy.grid.LazyGridSlots mo693invoke0kLqBqw = lazyGridSlotsProvider.mo693invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                    int length = mo693invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    lazyGridState.setSlotsPerLine$foundation_release(length);
                    if (z2) {
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new java.lang.IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new java.lang.IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int i13 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - i9;
                    } else {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - i10;
                    }
                    int i14 = m4424getMaxWidthimpl;
                    if (!z || i14 > 0) {
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i3, i7);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            i3 += i14;
                        }
                        if (z5) {
                            i7 += i14;
                        }
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i3, i7);
                    }
                    final long j2 = IntOffset;
                    final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final int i15 = i5;
                    final ?? r18 = new androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i13, lazyGridState2, z6, z7, i15, i12, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState $state;
                        final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z6;
                            this.$reverseLayout = z7;
                            this.$beforeContentPadding = i15;
                            this.$afterContentPadding = i12;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        public androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem createItem(int index, java.lang.Object key, java.lang.Object contentType, int crossAxisSize, int mainAxisSpacing, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables) {
                            return new androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getPlacementAnimator(), null);
                        }
                    };
                    final boolean z8 = z2;
                    final ?? r2 = new androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider(z8, mo693invoke0kLqBqw, itemCount, i13, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z8, mo693invoke0kLqBqw, itemCount, i13, r18, spanLayoutProvider);
                            this.$isVertical = z8;
                            this.$resolvedSlots = mo693invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine createLine(int index, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items, java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> spans, int mainAxisSpacing) {
                            return new androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                        }
                    };
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new kotlin.jvm.functions.Function1<java.lang.Integer, java.util.ArrayList<kotlin.Pair<? extends java.lang.Integer, ? extends androidx.compose.ui.unit.Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.util.ArrayList<kotlin.Pair<? extends java.lang.Integer, ? extends androidx.compose.ui.unit.Constraints>> invoke(java.lang.Integer num) {
                            return invoke(num.intValue());
                        }

                        public final java.util.ArrayList<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> invoke(int i16) {
                            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.this.getLineConfiguration(i16);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            java.util.ArrayList<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> arrayList = new java.util.ArrayList<>(lineConfiguration.getSpans().size());
                            java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> spans = lineConfiguration.getSpans();
                            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r2;
                            int size = spans.size();
                            int i17 = 0;
                            for (int i18 = 0; i18 < size; i18++) {
                                int m689getCurrentLineSpanimpl = androidx.compose.foundation.lazy.grid.GridItemSpan.m689getCurrentLineSpanimpl(spans.get(i18).getPackedValue());
                                arrayList.add(kotlin.TuplesKt.to(java.lang.Integer.valueOf(firstItemIndex), androidx.compose.ui.unit.Constraints.m4412boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m711childConstraintsJhjzzOo$foundation_release(i17, m689getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i17 += m689getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                    androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3 = lazyGridState;
                    androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState3.getFirstVisibleItemIndex());
                            if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                                i6 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                createNonObservableSnapshot.dispose();
                                androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m706measureLazyGridW2FL7xs = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m706measureLazyGridW2FL7xs(itemCount, (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider) r2, (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider) r18, i14, i5, i12, i13, i6, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m4440offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, lazyGridState.getPlacementAnimator(), spanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), coroutineScope, lazyGridState.m713getPlacementScopeInvalidatorzYiylxw$foundation_release(), new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit>, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(java.lang.Integer num, java.lang.Integer num2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>) function1);
                                    }

                                    public final androidx.compose.ui.layout.MeasureResult invoke(int i16, int i17, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
                                        return androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this.layout(androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, i16 + i10), androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, i17 + i9), kotlin.collections.MapsKt.emptyMap(), function1);
                                    }
                                });
                                androidx.compose.foundation.lazy.grid.LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, m706measureLazyGridW2FL7xs, false, 2, null);
                                return m706measureLazyGridW2FL7xs;
                            }
                            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                            i6 = lineIndexOfItem;
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m706measureLazyGridW2FL7xs2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m706measureLazyGridW2FL7xs(itemCount, (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider) r2, (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider) r18, i14, i5, i12, i13, i6, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m4440offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, lazyGridState.getPlacementAnimator(), spanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), coroutineScope, lazyGridState.m713getPlacementScopeInvalidatorzYiylxw$foundation_release(), new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit>, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(java.lang.Integer num, java.lang.Integer num2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>) function1);
                                }

                                public final androidx.compose.ui.layout.MeasureResult invoke(int i16, int i17, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
                                    return androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this.layout(androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, i16 + i10), androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, i17 + i9), kotlin.collections.MapsKt.emptyMap(), function1);
                                }
                            });
                            androidx.compose.foundation.lazy.grid.LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, m706measureLazyGridW2FL7xs2, false, 2, null);
                            return m706measureLazyGridW2FL7xs2;
                        } finally {
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        }
                    } catch (java.lang.Throwable th) {
                        createNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2 = (kotlin.jvm.functions.Function2) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }
}
