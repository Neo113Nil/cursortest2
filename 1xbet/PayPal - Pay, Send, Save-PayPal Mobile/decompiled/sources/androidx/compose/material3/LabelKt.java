package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Label", "", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isPersistent", "", "content", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "HandleInteractions", "enabled", "state", "Landroidx/compose/material3/TooltipState;", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LabelKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0049  */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Label(final kotlin.jvm.functions.Function3<? super androidx.compose.material3.TooltipScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        int i5;
        boolean z2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.material3.LabelStateImpl rememberBasicTooltipState;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-458575864);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z3 = z2;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = i4 != 0 ? null : mutableInteractionSource2;
                        boolean z4 = i5 != 0 ? false : z2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-458575864, i3, -1, "androidx.compose.material3.Label (Label.kt:69)");
                        }
                        if (mutableInteractionSource5 == null) {
                            startRestartGroup.startReplaceGroup(857748595);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1690236644);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource5;
                        }
                        androidx.compose.ui.window.PopupPositionProvider m4167rememberTooltipPositionProviderHu5FAss = androidx.compose.material3.TooltipDefaults.INSTANCE.m4167rememberTooltipPositionProviderHu5FAss(androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4154getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2);
                        if (z4) {
                            startRestartGroup.startReplaceGroup(857995293);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new androidx.compose.material3.LabelStateImpl(false, false, 3, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            rememberBasicTooltipState = (androidx.compose.material3.LabelStateImpl) rememberedValue2;
                        } else {
                            startRestartGroup.startReplaceGroup(1690246656);
                            rememberBasicTooltipState = androidx.compose.material3.internal.BasicTooltipKt.rememberBasicTooltipState(false, false, new androidx.compose.foundation.MutatorMutex(), startRestartGroup, 0, 3);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.material3.TooltipState tooltipState = rememberBasicTooltipState;
                        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        objectRef.element = (androidx.compose.runtime.MutableState) rememberedValue3;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new androidx.compose.material3.TooltipScopeImpl(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.LabelKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.compose.material3.LabelKt.$r8$lambda$J79KiBDx8opdeUoOm8STnz0ay9A(kotlin.jvm.internal.Ref.ObjectRef.this);
                                }
                            }, m4167rememberTooltipPositionProviderHu5FAss);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        final androidx.compose.material3.TooltipScopeImpl tooltipScopeImpl = (androidx.compose.material3.TooltipScopeImpl) rememberedValue4;
                        androidx.compose.material3.internal.BasicTooltipKt.BasicTooltipBox(m4167rememberTooltipPositionProviderHu5FAss, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1572484206, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.LabelKt$Label$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                androidx.compose.runtime.Composer composer3 = composer2;
                                int intValue = num.intValue();
                                if (composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1572484206, intValue, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                                    }
                                    function3.invoke(tooltipScopeImpl, composer3, 6);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, startRestartGroup, 54), tooltipState, modifier3, null, false, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-44123786, true, new androidx.compose.material3.LabelKt$Label$wrappedContent$1(objectRef, function2), startRestartGroup, 54), startRestartGroup, ((i3 << 6) & 7168) | 102432816, 144);
                        getHighSpeedVideoFpsRangesFor(!z4, tooltipState, mutableInteractionSource4, startRestartGroup, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        z3 = z4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.LabelKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material3.LabelKt.$r8$lambda$HQ5TBW7FdjL_For0LZ506MEymfU(kotlin.jvm.functions.Function3.this, modifier4, mutableInteractionSource3, z3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i2 & 16) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i2 & 16) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i2 & 16) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final boolean z, final androidx.compose.material3.TooltipState tooltipState, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-627258109);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-627258109, i2, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(756598818);
                boolean z3 = (i2 & 896) == 256;
                if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !startRestartGroup.changedInstance(tooltipState))) {
                    z2 = false;
                }
                androidx.compose.material3.LabelKt$HandleInteractions$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material3.LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(mutableInteractionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i2 >> 6) & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(757210975);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.LabelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.LabelKt.$r8$lambda$YJrvTkYhjCSxTKf5Np61jAde8nM(z, tooltipState, mutableInteractionSource, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HQ5TBW7FdjL_For0LZ506MEymfU(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Label(function3, modifier, mutableInteractionSource, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates $r8$lambda$J79KiBDx8opdeUoOm8STnz0ay9A(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        return (androidx.compose.ui.layout.LayoutCoordinates) ((androidx.compose.runtime.MutableState) objectRef.element).getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YJrvTkYhjCSxTKf5Np61jAde8nM(boolean z, androidx.compose.material3.TooltipState tooltipState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(z, tooltipState, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
