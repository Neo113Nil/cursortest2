package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-w41Enmo", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: LazyStaggeredGrid-w41Enmo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1892LazyStaggeredGridw41Enmo(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final androidx.compose.foundation.OverscrollEffect overscrollEffect, float f, float f2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final boolean z3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        final boolean z4;
        final float f3;
        final float f4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z5;
        float f5;
        float f6;
        float m8601constructorimpl;
        int i12;
        androidx.compose.ui.Modifier modifier3;
        float f7;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        boolean z6;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier scrollableArea;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1904835166);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? startRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(overscrollEffect) ? 67108864 : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i10 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    i10 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                }
                i11 = i10;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        modifier3 = modifier;
                        paddingValues3 = paddingValues;
                        z6 = z;
                        flingBehavior4 = flingBehavior;
                        z5 = z2;
                        f7 = f;
                        m8601constructorimpl = f2;
                        i12 = i4;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion2 = i13 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = i5 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                        boolean z7 = i6 == 0 ? z : false;
                        if ((i3 & 64) != 0) {
                            flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior;
                        }
                        z5 = i7 == 0 ? z2 : true;
                        if (i8 != 0) {
                            f5 = 0.0f;
                            f6 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                        } else {
                            f5 = 0.0f;
                            f6 = f;
                        }
                        m8601constructorimpl = i9 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(f5) : f2;
                        i12 = i4;
                        modifier3 = companion2;
                        f7 = f6;
                        paddingValues3 = m1699PaddingValues0680j_4;
                        z6 = z7;
                        flingBehavior4 = flingBehavior3;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1904835166, i12, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    int i14 = i12 & 14;
                    kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, (i11 & 112) | i14);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    int i15 = i12 >> 6;
                    int i16 = i12 >> 12;
                    int i17 = i12;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    boolean z8 = z6;
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy m1902rememberStaggeredGridMeasurePolicyqKj4JfE = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m1902rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, paddingValues3, z6, orientation, f7, m8601constructorimpl, (kotlinx.coroutines.CoroutineScope) rememberedValue, lazyGridStaggeredGridSlotsProvider, (androidx.compose.ui.graphics.GraphicsContext) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalGraphicsContext()), startRestartGroup, ((i12 << 18) & 234881024) | (i15 & 896) | i14 | (i15 & 7168) | ((i12 << 9) & 57344) | (i16 & 458752) | ((i11 << 18) & 3670016));
                    androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z8, startRestartGroup, (i16 & 112) | i14);
                    if (z5) {
                        startRestartGroup.startReplaceGroup(-1834596342);
                        companion = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i14), lazyStaggeredGridState.getBeyondBoundsInfo(), z8, orientation);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1834291488);
                        startRestartGroup.endReplaceGroup();
                        companion = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    boolean z9 = z5;
                    composer2 = startRestartGroup;
                    scrollableArea = androidx.compose.foundation.ScrollableAreaKt.scrollableArea(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda, rememberLazyStaggeredGridSemanticState, orientation, z9, z8, startRestartGroup, (i17 & 458752) | ((i17 << 6) & 7168) | ((i17 >> 9) & 57344)).then(companion).then(lazyStaggeredGridState.getItemAnimator$foundation().getModifier()), lazyStaggeredGridState, orientation, overscrollEffect, (r20 & 8) != 0 ? true : z9, (r20 & 16) != 0 ? false : z8, (r20 & 32) != 0 ? null : flingBehavior4, (r20 & 64) != 0 ? null : lazyStaggeredGridState.getMutableInteractionSource(), (r20 & 128) != 0 ? null : null);
                    androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, scrollableArea, lazyStaggeredGridState.getPrefetchState(), m1902rememberStaggeredGridMeasurePolicyqKj4JfE, composer2, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z8;
                    modifier2 = modifier4;
                    paddingValues2 = paddingValues3;
                    flingBehavior2 = flingBehavior4;
                    z4 = z5;
                    f3 = f7;
                    f4 = m8601constructorimpl;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    paddingValues2 = paddingValues;
                    z3 = z;
                    flingBehavior2 = flingBehavior;
                    z4 = z2;
                    f3 = f;
                    f4 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            ((java.lang.Integer) obj2).intValue();
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, orientation, lazyGridStaggeredGridSlotsProvider, modifier2, paddingValues2, z3, flingBehavior2, z4, overscrollEffect, f3, f4, function1, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i11 = i10;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i11 = i10;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m1892LazyStaggeredGridw41Enmo(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier, paddingValues, z, flingBehavior, z2, overscrollEffect, f, f2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
