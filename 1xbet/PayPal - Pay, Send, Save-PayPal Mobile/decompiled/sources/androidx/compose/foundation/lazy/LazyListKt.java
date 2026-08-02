package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a\u0085\u0001\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0002\u0010*\u001a\"\u0010+\u001a\u00020\u0001*\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0002¨\u00062"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "keepAroundItems", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "visibleItemsList", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.lazy.LazyListState lazyListState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final boolean z2, final androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final boolean z3, final androidx.compose.foundation.OverscrollEffect overscrollEffect, int i, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final int i7;
        final androidx.compose.ui.Alignment.Horizontal horizontal3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final androidx.compose.ui.Alignment.Vertical vertical4;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        androidx.compose.ui.Alignment.Horizontal horizontal5;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical5;
        androidx.compose.ui.Alignment.Vertical vertical6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical7;
        int i9;
        androidx.compose.ui.Alignment.Vertical vertical8;
        androidx.compose.ui.Alignment.Horizontal horizontal6;
        int i10;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal7;
        java.lang.Object rememberedValue;
        int i11;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier scrollableArea;
        int i12;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(924924659);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changed(flingBehavior) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(overscrollEffect) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if ((i4 & 256) == 0 && startRestartGroup.changed(i)) {
                i12 = 67108864;
                i5 |= i12;
            }
            i12 = 33554432;
            i5 |= i12;
        }
        int i13 = i4 & 512;
        if (i13 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        int i14 = i4 & 1024;
        if (i14 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(vertical) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i15 = i4 & 2048;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(vertical2) ? 32 : 16;
        }
        int i16 = i6;
        int i17 = i4 & 4096;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i3 & 384) == 0) {
            i16 |= startRestartGroup.changed(horizontal2) ? 256 : 128;
            if ((i3 & 3072) == 0) {
                i16 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 1171) != 1170, i5 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i4 & 256) != 0) {
                        i8 = androidx.compose.foundation.lazy.LazyList_androidKt.defaultLazyListBeyondBoundsItemCount(startRestartGroup, 0);
                        i5 &= -234881025;
                    } else {
                        i8 = i;
                    }
                    horizontal5 = i13 != 0 ? null : horizontal;
                    vertical5 = i14 != 0 ? null : vertical;
                    vertical6 = i15 != 0 ? null : vertical2;
                    if (i17 != 0) {
                        vertical7 = vertical5;
                        i9 = i5;
                        vertical8 = vertical6;
                        horizontal6 = horizontal5;
                        i10 = i8;
                        horizontal7 = null;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(924924659, i9, i16, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                        }
                        int i18 = (i9 >> 3) & 14;
                        kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> rememberLazyListItemProviderLambda = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i18 | ((i16 >> 6) & 112));
                        int i19 = i9 >> 9;
                        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyListSemanticState = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i18 | (i19 & 112));
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        int i20 = i16 << 18;
                        int i21 = i9;
                        int i22 = i10;
                        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy highSpeedVideoSizes = getHighSpeedVideoSizes(rememberLazyListItemProviderLambda, lazyListState, paddingValues, z, z2, i10, horizontal6, vertical8, horizontal7, vertical7, coroutineScope, (androidx.compose.ui.graphics.GraphicsContext) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalGraphicsContext()), ((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? null : androidx.compose.foundation.lazy.layout.StickyItemsPlacement.INSTANCE.getStickToTopPlacement(), startRestartGroup, (i19 & 3670016) | (65520 & i9) | (i19 & 458752) | (29360128 & i20) | (i20 & 234881024) | ((i16 << 27) & 1879048192));
                        androidx.compose.foundation.gestures.Orientation orientation = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                        if (!z3) {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(-2077147368);
                            i11 = i22;
                            companion = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i22, composer2, i18 | ((i21 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z, orientation);
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            i11 = i22;
                            composer2.startReplaceGroup(-2076718545);
                            composer2.endReplaceGroup();
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        scrollableArea = androidx.compose.foundation.ScrollableAreaKt.scrollableArea(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, composer2, ((i21 >> 6) & 57344) | ((i21 << 6) & 458752)).then(companion).then(lazyListState.getItemAnimator$foundation().getModifier()), lazyListState, orientation, overscrollEffect, (r20 & 8) != 0 ? true : z3, (r20 & 16) != 0 ? false : z, (r20 & 32) != 0 ? null : flingBehavior, (r20 & 64) != 0 ? null : lazyListState.getInternalInteractionSource(), (r20 & 128) != 0 ? null : null);
                        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, scrollableArea, lazyListState.getPrefetchState(), highSpeedVideoSizes, composer2, 0, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        i7 = i11;
                        horizontal3 = horizontal6;
                        vertical3 = vertical7;
                        vertical4 = vertical8;
                        horizontal4 = horizontal7;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i4 & 256) != 0) {
                        i5 &= -234881025;
                    }
                    i8 = i;
                    horizontal5 = horizontal;
                    vertical5 = vertical;
                    vertical6 = vertical2;
                }
                horizontal7 = horizontal2;
                vertical7 = vertical5;
                i9 = i5;
                vertical8 = vertical6;
                horizontal6 = horizontal5;
                i10 = i8;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i182 = (i9 >> 3) & 14;
                kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> rememberLazyListItemProviderLambda2 = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i182 | ((i16 >> 6) & 112));
                int i192 = i9 >> 9;
                androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyListSemanticState2 = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i182 | (i192 & 112));
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                int i202 = i16 << 18;
                int i212 = i9;
                int i222 = i10;
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy highSpeedVideoSizes2 = getHighSpeedVideoSizes(rememberLazyListItemProviderLambda2, lazyListState, paddingValues, z, z2, i10, horizontal6, vertical8, horizontal7, vertical7, coroutineScope2, (androidx.compose.ui.graphics.GraphicsContext) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalGraphicsContext()), ((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? null : androidx.compose.foundation.lazy.layout.StickyItemsPlacement.INSTANCE.getStickToTopPlacement(), startRestartGroup, (i192 & 3670016) | (65520 & i9) | (i192 & 458752) | (29360128 & i202) | (i202 & 234881024) | ((i16 << 27) & 1879048192));
                androidx.compose.foundation.gestures.Orientation orientation2 = !z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                if (!z3) {
                }
                scrollableArea = androidx.compose.foundation.ScrollableAreaKt.scrollableArea(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, composer2, ((i212 >> 6) & 57344) | ((i212 << 6) & 458752)).then(companion).then(lazyListState.getItemAnimator$foundation().getModifier()), lazyListState, orientation2, overscrollEffect, (r20 & 8) != 0 ? true : z3, (r20 & 16) != 0 ? false : z, (r20 & 32) != 0 ? null : flingBehavior, (r20 & 64) != 0 ? null : lazyListState.getInternalInteractionSource(), (r20 & 128) != 0 ? null : null);
                androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, scrollableArea, lazyListState.getPrefetchState(), highSpeedVideoSizes2, composer2, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                i7 = i11;
                horizontal3 = horizontal6;
                vertical3 = vertical7;
                vertical4 = vertical8;
                horizontal4 = horizontal7;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                i7 = i;
                horizontal3 = horizontal;
                vertical3 = vertical;
                vertical4 = vertical2;
                horizontal4 = horizontal2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoSizes3;
                        ((java.lang.Integer) obj2).intValue();
                        highSpeedVideoSizes3 = androidx.compose.foundation.lazy.LazyListKt.getHighSpeedVideoSizes(androidx.compose.ui.Modifier.this, lazyListState, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, i7, horizontal3, vertical3, vertical4, horizontal4, function1, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                        return highSpeedVideoSizes3;
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r33.changed(r24) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r33.changed(r26) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r33.changed(r27) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        if (r33.changed(r28) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r33.changed(r29) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r33.changed(r21) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy getHighSpeedVideoSizes(kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemProvider> function0, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, boolean z2, int i, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2, androidx.compose.foundation.layout.Arrangement.Vertical vertical2, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement, androidx.compose.runtime.Composer composer, int i2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        java.lang.Object obj;
        boolean z11;
        boolean changed;
        boolean changed2;
        androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1 rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(406165748, i2, 0, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if ((i2 & 48) != 32) {
            z3 = false;
            z4 = (((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256;
            z5 = (((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048;
            if (((57344 & i2) ^ 24576) <= 16384) {
            }
            if ((i2 & 24576) != 16384) {
                z6 = false;
                z7 = (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i)) || (i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
                if (((3670016 & i2) ^ 1572864) <= 1048576) {
                }
                if ((1572864 & i2) != 1048576) {
                    z8 = false;
                    if (((29360128 & i2) ^ 12582912) <= 8388608) {
                    }
                    if ((i2 & 12582912) != 8388608) {
                        z9 = false;
                        if (((234881024 & i2) ^ 100663296) <= 67108864) {
                        }
                        if ((i2 & 100663296) != 67108864) {
                            z10 = false;
                            if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                            }
                            if ((i2 & 805306368) != 536870912) {
                                obj = graphicsContext;
                                z11 = false;
                                changed = composer.changed(obj);
                                changed2 = composer.changed(stickyItemsPlacement);
                                rememberedValue = composer.rememberedValue();
                                if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
                                    composer.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                return lazyLayoutMeasurePolicy;
                            }
                            obj = graphicsContext;
                            z11 = true;
                            changed = composer.changed(obj);
                            changed2 = composer.changed(stickyItemsPlacement);
                            rememberedValue = composer.rememberedValue();
                            if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
                            }
                            rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
                            composer.updateRememberedValue(rememberedValue);
                            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            return lazyLayoutMeasurePolicy2;
                        }
                        z10 = true;
                        if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                        }
                        if ((i2 & 805306368) != 536870912) {
                        }
                        obj = graphicsContext;
                        z11 = true;
                        changed = composer.changed(obj);
                        changed2 = composer.changed(stickyItemsPlacement);
                        rememberedValue = composer.rememberedValue();
                        if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
                        }
                        rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
                        composer.updateRememberedValue(rememberedValue);
                        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        return lazyLayoutMeasurePolicy22;
                    }
                    z9 = true;
                    if (((234881024 & i2) ^ 100663296) <= 67108864) {
                    }
                    if ((i2 & 100663296) != 67108864) {
                    }
                    z10 = true;
                    if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                    }
                    if ((i2 & 805306368) != 536870912) {
                    }
                    obj = graphicsContext;
                    z11 = true;
                    changed = composer.changed(obj);
                    changed2 = composer.changed(stickyItemsPlacement);
                    rememberedValue = composer.rememberedValue();
                    if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
                    }
                    rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
                    composer.updateRememberedValue(rememberedValue);
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    return lazyLayoutMeasurePolicy222;
                }
                z8 = true;
                if (((29360128 & i2) ^ 12582912) <= 8388608) {
                }
                if ((i2 & 12582912) != 8388608) {
                }
                z9 = true;
                if (((234881024 & i2) ^ 100663296) <= 67108864) {
                }
                if ((i2 & 100663296) != 67108864) {
                }
                z10 = true;
                if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                }
                obj = graphicsContext;
                z11 = true;
                changed = composer.changed(obj);
                changed2 = composer.changed(stickyItemsPlacement);
                rememberedValue = composer.rememberedValue();
                if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
                }
                rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
                composer.updateRememberedValue(rememberedValue);
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return lazyLayoutMeasurePolicy2222;
            }
            z6 = true;
            if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i2) != 1048576) {
            }
            z8 = true;
            if (((29360128 & i2) ^ 12582912) <= 8388608) {
            }
            if ((i2 & 12582912) != 8388608) {
            }
            z9 = true;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((i2 & 100663296) != 67108864) {
            }
            z10 = true;
            if (((1879048192 & i2) ^ 805306368) <= 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            obj = graphicsContext;
            z11 = true;
            changed = composer.changed(obj);
            changed2 = composer.changed(stickyItemsPlacement);
            rememberedValue = composer.rememberedValue();
            if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
            }
            rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy22222;
        }
        z3 = true;
        if (((i2 & 896) ^ 384) <= 256) {
        }
        if (((i2 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i2) ^ 24576) <= 16384) {
        }
        if ((i2 & 24576) != 16384) {
        }
        z6 = true;
        if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z8 = true;
        if (((29360128 & i2) ^ 12582912) <= 8388608) {
        }
        if ((i2 & 12582912) != 8388608) {
        }
        z9 = true;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((i2 & 100663296) != 67108864) {
        }
        z10 = true;
        if (((1879048192 & i2) ^ 805306368) <= 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        obj = graphicsContext;
        z11 = true;
        changed = composer.changed(obj);
        changed2 = composer.changed(stickyItemsPlacement);
        rememberedValue = composer.rememberedValue();
        if (!(z11 | z9 | z8 | z3 | z4 | z5 | z6 | z7 | z10 | changed | changed2)) {
        }
        rememberedValue = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z2, paddingValues, z, function0, vertical2, horizontal2, i, coroutineScope, graphicsContext, stickyItemsPlacement, horizontal, vertical);
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy222222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider) {
        android.os.Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int index = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) list)).getIndex();
                int index2 = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) list)).getIndex();
                for (int prefetchWindowStartLine = cacheWindowLogic.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    lazyListMeasuredItemProvider.keepAround(prefetchWindowStartLine);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine = cacheWindowLogic.getPrefetchWindowEndLine();
                if (i <= prefetchWindowEndLine) {
                    while (true) {
                        lazyListMeasuredItemProvider.keepAround(i);
                        if (i == prefetchWindowEndLine) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z3, androidx.compose.foundation.OverscrollEffect overscrollEffect, int i, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2, kotlin.jvm.functions.Function1 function1, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, i, horizontal, vertical, vertical2, horizontal2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }
}
