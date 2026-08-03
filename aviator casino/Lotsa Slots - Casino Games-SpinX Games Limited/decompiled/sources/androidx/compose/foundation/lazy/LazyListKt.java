package androidx.compose.foundation.lazy;

/* compiled from: LazyList.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u008a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.lazy.LazyListState lazyListState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final boolean z2, final androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final boolean z3, int i, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Alignment.Horizontal horizontal4;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final int i13;
        final androidx.compose.ui.Alignment.Vertical vertical4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(620764179);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)80@3813L50,82@3889L48,83@3954L24,86@4037L292,99@4377L18,105@4632L277,114@5029L153,120@5345L7,113@4973L481,128@5678L7,101@4487L1676:LazyList.kt#428nma");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & 458752) == 0) {
                i5 |= startRestartGroup.changed(flingBehavior) ? 131072 : 65536;
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i6 = i4 & 128;
                if (i6 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                }
                i7 = i4 & 256;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(horizontal) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(vertical) ? 536870912 : 268435456;
                }
                i9 = i4 & 1024;
                if (i9 != 0) {
                    i10 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i10 = i3 | (startRestartGroup.changed(vertical2) ? 4 : 2);
                } else {
                    i10 = i3;
                }
                i11 = i4 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((i3 & 112) == 0) {
                    i10 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
                }
                i12 = i10;
                if ((i4 & 4096) != 0) {
                    i12 |= 384;
                } else if ((i3 & 896) == 0) {
                    i12 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((1533916891 & i5) == 306783378 || (i12 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    int i14 = i6 != 0 ? 0 : i;
                    androidx.compose.ui.Alignment.Horizontal horizontal5 = i7 != 0 ? null : horizontal;
                    androidx.compose.foundation.layout.Arrangement.Vertical vertical5 = i8 != 0 ? null : vertical;
                    androidx.compose.ui.Alignment.Vertical vertical6 = i9 != 0 ? null : vertical2;
                    horizontal3 = i11 != 0 ? null : horizontal2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(620764179, i5, i12, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:79)");
                    }
                    int i15 = (i5 >> 3) & 14;
                    kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> rememberLazyListItemProviderLambda = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i15 | ((i12 >> 3) & 112));
                    androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyListSemanticState = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i15 | ((i5 >> 9) & 112));
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
                    lazyListState.setCoroutineScope$foundation_release(coroutineScope);
                    int i16 = i5 & 7168;
                    int i17 = i5 >> 6;
                    int i18 = i12 << 21;
                    int i19 = i5;
                    int i20 = i14;
                    composer2 = startRestartGroup;
                    kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal3, vertical5, composer2, (i5 & 112) | (i5 & 896) | i16 | (i5 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (1879048192 & i5), 0);
                    androidx.compose.foundation.OverscrollEffect overscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
                    androidx.compose.foundation.gestures.Orientation orientation = z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                    androidx.compose.ui.Modifier clipScrollableContainer = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, composer2, (i17 & 57344) | ((i19 << 6) & 458752)), orientation);
                    androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState = androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i20, composer2, i15 | ((i19 >> 18) & 112));
                    androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyListState.getBeyondBoundsInfo();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = composer2.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.Modifier overscroll = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer, rememberLazyListBeyondBoundsState, beyondBoundsInfo, z, (androidx.compose.ui.unit.LayoutDirection) consume, orientation, z3, composer2, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | i16 | (i19 & 3670016)), overscrollEffect);
                    androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = composer2.consume(localLayoutDirection2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll, lazyListState, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume2, orientation, z), flingBehavior, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy, composer2, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    horizontal4 = horizontal5;
                    vertical3 = vertical5;
                    i13 = i20;
                    vertical4 = vertical6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    i13 = i;
                    vertical3 = vertical;
                    vertical4 = vertical2;
                    horizontal3 = horizontal2;
                    composer2 = startRestartGroup;
                    horizontal4 = horizontal;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal6 = horizontal3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i21) {
                            androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier.this, lazyListState, paddingValues, z, z2, flingBehavior, z3, i13, horizontal4, vertical3, vertical4, horizontal6, function1, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                    return;
                }
                return;
            }
            if ((i4 & 64) != 0) {
            }
            i6 = i4 & 128;
            if (i6 != 0) {
            }
            i7 = i4 & 256;
            if (i7 != 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            i9 = i4 & 1024;
            if (i9 != 0) {
            }
            i11 = i4 & 2048;
            if (i11 != 0) {
            }
            i12 = i10;
            if ((i4 & 4096) != 0) {
            }
            if ((1533916891 & i5) == 306783378) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i152 = (i5 >> 3) & 14;
            kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> rememberLazyListItemProviderLambda2 = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i152 | ((i12 >> 3) & 112));
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyListSemanticState2 = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i152 | ((i5 >> 9) & 112));
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
            lazyListState.setCoroutineScope$foundation_release(coroutineScope2);
            int i162 = i5 & 7168;
            int i172 = i5 >> 6;
            int i182 = i12 << 21;
            int i192 = i5;
            int i202 = i14;
            composer2 = startRestartGroup;
            kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal3, vertical5, composer2, (i5 & 112) | (i5 & 896) | i162 | (i5 & 57344) | (i172 & 458752) | (i172 & 3670016) | (i182 & 29360128) | (i182 & 234881024) | (1879048192 & i5), 0);
            androidx.compose.foundation.OverscrollEffect overscrollEffect2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
            androidx.compose.foundation.gestures.Orientation orientation2 = z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
            androidx.compose.ui.Modifier clipScrollableContainer2 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, composer2, (i172 & 57344) | ((i192 << 6) & 458752)), orientation2);
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState2 = androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i202, composer2, i152 | ((i192 >> 18) & 112));
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyListState.getBeyondBoundsInfo();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = composer2.consume(localLayoutDirection3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
            androidx.compose.ui.Modifier overscroll2 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer2, rememberLazyListBeyondBoundsState2, beyondBoundsInfo2, z, (androidx.compose.ui.unit.LayoutDirection) consume3, orientation2, z3, composer2, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | i162 | (i192 & 3670016)), overscrollEffect2);
            androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22 = composer2.consume(localLayoutDirection22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll2, lazyListState, orientation2, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume22, orientation2, z), flingBehavior, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy2, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            horizontal4 = horizontal5;
            vertical3 = vertical5;
            i13 = i202;
            vertical4 = vertical6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) != 0) {
        }
        i6 = i4 & 128;
        if (i6 != 0) {
        }
        i7 = i4 & 256;
        if (i7 != 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        i9 = i4 & 1024;
        if (i9 != 0) {
        }
        i11 = i4 & 2048;
        if (i11 != 0) {
        }
        i12 = i10;
        if ((i4 & 4096) != 0) {
        }
        if ((1533916891 & i5) == 306783378) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i1522 = (i5 >> 3) & 14;
        kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.LazyListItemProvider> rememberLazyListItemProviderLambda22 = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i1522 | ((i12 >> 3) & 112));
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberLazyListSemanticState22 = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i1522 | ((i5 >> 9) & 112));
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
        lazyListState.setCoroutineScope$foundation_release(coroutineScope22);
        int i1622 = i5 & 7168;
        int i1722 = i5 >> 6;
        int i1822 = i12 << 21;
        int i1922 = i5;
        int i2022 = i14;
        composer2 = startRestartGroup;
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda22, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal3, vertical5, composer2, (i5 & 112) | (i5 & 896) | i1622 | (i5 & 57344) | (i1722 & 458752) | (i1722 & 3670016) | (i1822 & 29360128) | (i1822 & 234881024) | (1879048192 & i5), 0);
        androidx.compose.foundation.OverscrollEffect overscrollEffect22 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
        androidx.compose.foundation.gestures.Orientation orientation22 = z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
        androidx.compose.ui.Modifier clipScrollableContainer22 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda22, rememberLazyListSemanticState22, orientation22, z3, z, composer2, (i1722 & 57344) | ((i1922 << 6) & 458752)), orientation22);
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState22 = androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2022, composer2, i1522 | ((i1922 >> 18) & 112));
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyListState.getBeyondBoundsInfo();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32 = composer2.consume(localLayoutDirection32);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
        androidx.compose.ui.Modifier overscroll22 = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(clipScrollableContainer22, rememberLazyListBeyondBoundsState22, beyondBoundsInfo22, z, (androidx.compose.ui.unit.LayoutDirection) consume32, orientation22, z3, composer2, (androidx.compose.runtime.collection.MutableVector.$stable << 6) | i1622 | (i1922 & 3670016)), overscrollEffect22);
        androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults22 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222 = composer2.consume(localLayoutDirection222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
        androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda22, androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(overscroll22, lazyListState, orientation22, overscrollEffect22, z3, scrollableDefaults22.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume222, orientation22, z), flingBehavior, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy22, composer2, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        horizontal4 = horizontal5;
        vertical3 = vertical5;
        i13 = i2022;
        vertical4 = vertical6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy(final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemProvider> function0, final androidx.compose.foundation.lazy.LazyListState lazyListState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final boolean z2, final int i, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2, androidx.compose.foundation.layout.Arrangement.Vertical vertical2, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(183156450);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberLazyListMeasurePolicy)P(5,7,1,6,4!2,8)167@7348L7990:LazyList.kt#428nma");
        final androidx.compose.ui.Alignment.Horizontal horizontal3 = (i3 & 64) != 0 ? null : horizontal;
        final androidx.compose.ui.Alignment.Vertical vertical3 = (i3 & 128) != 0 ? null : vertical;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = (i3 & 256) != 0 ? null : horizontal2;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = (i3 & 512) != 0 ? null : vertical2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        java.lang.Object[] objArr = {lazyListState, paddingValues, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            z3 |= composer.changed(objArr[i4]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.LazyListMeasureResult invoke(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                    return m672invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.LazyListMeasureResult m672invoke0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i5;
                    int i6;
                    int i7;
                    float spacing;
                    int m4424getMaxWidthimpl;
                    long IntOffset;
                    float scrollToBeConsumed;
                    boolean z4 = androidx.compose.foundation.lazy.LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m240checkScrollableContainerConstraintsK40F9xA(j, z2 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
                    if (z2) {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo519calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo520calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i8 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getTop());
                    int i9 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getBottom());
                    final int i10 = i8 + i9;
                    final int i11 = i5 + i6;
                    boolean z5 = z2;
                    int i12 = z5 ? i10 : i11;
                    if (z5 && !z) {
                        i7 = i8;
                    } else if (z5 && z) {
                        i7 = i9;
                    } else {
                        i7 = (z5 || z) ? i6 : i5;
                    }
                    final int i13 = i12 - i7;
                    final long m4440offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(j, -i11, -i10);
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    androidx.compose.foundation.lazy.LazyListState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    final androidx.compose.foundation.lazy.LazyListItemProvider invoke = function0.invoke();
                    invoke.getItemScope().setMaxSize(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m4440offsetNN6EwU), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m4440offsetNN6EwU));
                    if (z2) {
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new java.lang.IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical5.getSpacing();
                    } else {
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new java.lang.IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        spacing = horizontal5.getSpacing();
                    }
                    final int i14 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - i10;
                    } else {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - i11;
                    }
                    int i15 = m4424getMaxWidthimpl;
                    if (!z || i15 > 0) {
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i5, i8);
                    } else {
                        boolean z6 = z2;
                        if (!z6) {
                            i5 += i15;
                        }
                        if (z6) {
                            i8 += i15;
                        }
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i5, i8);
                    }
                    final long j2 = IntOffset;
                    final boolean z7 = z2;
                    final androidx.compose.ui.Alignment.Horizontal horizontal6 = horizontal3;
                    final androidx.compose.ui.Alignment.Vertical vertical6 = vertical3;
                    final boolean z8 = z;
                    final androidx.compose.foundation.lazy.LazyListState lazyListState2 = androidx.compose.foundation.lazy.LazyListState.this;
                    final int i16 = i7;
                    androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new androidx.compose.foundation.lazy.LazyListMeasuredItemProvider(m4440offsetNN6EwU, z7, invoke, lazyLayoutMeasureScope, itemCount, i14, horizontal6, vertical6, z8, i16, i13, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ androidx.compose.ui.Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ androidx.compose.foundation.lazy.LazyListState $state;
                        final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ androidx.compose.ui.Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z7;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = i14;
                            this.$horizontalAlignment = horizontal6;
                            this.$verticalAlignment = vertical6;
                            this.$reverseLayout = z8;
                            this.$beforeContentPadding = i16;
                            this.$afterContentPadding = i13;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        public androidx.compose.foundation.lazy.LazyListMeasuredItem createItem(int index, java.lang.Object key, java.lang.Object contentType, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables) {
                            return new androidx.compose.foundation.lazy.LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator(), null);
                        }
                    };
                    androidx.compose.foundation.lazy.LazyListState.this.m684setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.getChildConstraints());
                    androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                    androidx.compose.foundation.lazy.LazyListState lazyListState3 = androidx.compose.foundation.lazy.LazyListState.this;
                    androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            java.util.List<java.lang.Integer> calculateLazyLayoutPinnedIndices = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, androidx.compose.foundation.lazy.LazyListState.this.getPinnedItems(), androidx.compose.foundation.lazy.LazyListState.this.getBeyondBoundsInfo());
                            if (lazyLayoutMeasureScope.isLookingAhead() || !z4) {
                                scrollToBeConsumed = androidx.compose.foundation.lazy.LazyListState.this.getScrollToBeConsumed();
                            } else {
                                scrollToBeConsumed = androidx.compose.foundation.lazy.LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                            }
                            float f = scrollToBeConsumed;
                            androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                            boolean z9 = z2;
                            java.util.List<java.lang.Integer> headerIndexes = invoke.getHeaderIndexes();
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical7 = vertical4;
                            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal7 = horizontal4;
                            boolean z10 = z;
                            androidx.compose.foundation.lazy.LazyListItemAnimator itemAnimator = androidx.compose.foundation.lazy.LazyListState.this.getItemAnimator();
                            int i17 = i;
                            boolean isLookingAhead = lazyLayoutMeasureScope.isLookingAhead();
                            androidx.compose.foundation.lazy.LazyListMeasureResult postLookaheadLayoutInfo = androidx.compose.foundation.lazy.LazyListState.this.getPostLookaheadLayoutInfo();
                            kotlinx.coroutines.CoroutineScope coroutineScope = androidx.compose.foundation.lazy.LazyListState.this.getCoroutineScope();
                            if (coroutineScope != null) {
                                androidx.compose.foundation.lazy.LazyListMeasureResult m677measureLazyList5IMabDg = androidx.compose.foundation.lazy.LazyListMeasureKt.m677measureLazyList5IMabDg(itemCount, lazyListMeasuredItemProvider2, i15, i7, i13, i14, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m4440offsetNN6EwU, z9, headerIndexes, vertical7, horizontal7, z10, lazyLayoutMeasureScope2, itemAnimator, i17, calculateLazyLayoutPinnedIndices, z4, isLookingAhead, postLookaheadLayoutInfo, coroutineScope, androidx.compose.foundation.lazy.LazyListState.this.m682getPlacementScopeInvalidatorzYiylxw$foundation_release(), new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit>, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(java.lang.Integer num, java.lang.Integer num2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>) function1);
                                    }

                                    public final androidx.compose.ui.layout.MeasureResult invoke(int i18, int i19, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
                                        return androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this.layout(androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, i18 + i11), androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, i19 + i10), kotlin.collections.MapsKt.emptyMap(), function1);
                                    }
                                });
                                androidx.compose.foundation.lazy.LazyListState.applyMeasureResult$foundation_release$default(androidx.compose.foundation.lazy.LazyListState.this, m677measureLazyList5IMabDg, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                return m677measureLazyList5IMabDg;
                            }
                            throw new java.lang.IllegalArgumentException("coroutineScope should be not null".toString());
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
