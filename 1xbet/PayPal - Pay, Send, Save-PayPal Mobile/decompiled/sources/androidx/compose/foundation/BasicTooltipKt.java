package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000f\u001a:\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0011\u001a@\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a,\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a+\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a&\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006\""}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/BasicTooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipPopup", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "handleGestures", "enabled", "anchorSemantics", "label", "", "rememberBasicTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "BasicTooltipState", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTooltipBox(final androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        boolean z4;
        int i6;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(196062260);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(basicTooltipState) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z4;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z7 = i4 != 0 ? true : z3;
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(196062260, i6, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        if (!basicTooltipState.isVisible()) {
                            z6 = false;
                            startRestartGroup.startReplaceGroup(1829588468);
                        } else {
                            startRestartGroup.startReplaceGroup(1833353604);
                            int i8 = i6 >> 3;
                            z6 = false;
                            getHighResolutionOutputSizeshNQ4ISI(popupPositionProvider, basicTooltipState, coroutineScope, z7, function2, startRestartGroup, (i8 & 7168) | (i6 & 14) | (i8 & 112) | ((i6 << 9) & 57344));
                        }
                        startRestartGroup.endReplaceGroup();
                        int i9 = i6 >> 3;
                        getHighSpeedVideoFpsRanges(z4, basicTooltipState, modifier4, function22, startRestartGroup, (i9 & 896) | ((i6 >> 15) & 14) | (i9 & 112) | ((i6 >> 9) & 7168), 0);
                        startRestartGroup.endNode();
                        boolean z8 = (i6 & 896) != 256 ? z6 : true;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z8 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.foundation.BasicTooltipKt.$r8$lambda$1pdEden7YFoHt3ULBzPRKT3vRDI(androidx.compose.foundation.BasicTooltipState.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.DisposableEffect(basicTooltipState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, (i6 >> 6) & 14);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z5 = z4;
                        z3 = z7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.foundation.BasicTooltipKt.$r8$lambda$n2wsnSL8gRt0MSZdbGmu6rgNWvM(androidx.compose.ui.window.PopupPositionProvider.this, function2, basicTooltipState, modifier3, z3, z5, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((1572864 & i) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((1572864 & i) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((1572864 & i) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final boolean z, final androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1381511093);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1381511093, i3, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            final java.lang.String label = androidx.compose.foundation.BasicTooltipStrings.INSTANCE.label(startRestartGroup, 6);
            androidx.compose.ui.Modifier highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(modifier, z, basicTooltipState);
            if (z) {
                highSpeedVideoFpsRangesFor = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(highSpeedVideoFpsRangesFor, true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.BasicTooltipKt.m1291$r8$lambda$96zyarguWcYkJO5ttwz9hzZlmc(label, coroutineScope, basicTooltipState, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                });
            }
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, highSpeedVideoFpsRangesFor);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.BasicTooltipKt.m1292$r8$lambda$ADqd1sU2gbHNu6H6CiAcxk5YcQ(z, basicTooltipState, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, final androidx.compose.foundation.BasicTooltipState basicTooltipState, final kotlinx.coroutines.CoroutineScope coroutineScope, final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1882542163);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(coroutineScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1882542163, i2, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            final java.lang.String description = androidx.compose.foundation.BasicTooltipStrings.INSTANCE.description(startRestartGroup, 6);
            boolean z2 = (i2 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.BasicTooltipKt.$r8$lambda$eR67hVqdel337jirzOGCObniBjw(androidx.compose.foundation.BasicTooltipState.this, coroutineScope);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(popupPositionProvider, (kotlin.jvm.functions.Function0) rememberedValue, new androidx.compose.ui.window.PopupProperties(z, false, false, false, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(916917707, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.BasicTooltipKt.$r8$lambda$cVmhqCqBFMEoY4tkWA0kkxS3Xys(description, function2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 14) | 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.BasicTooltipKt.m1293$r8$lambda$LgjTv0k90uE9pAnZyPYdqytP5g(androidx.compose.ui.window.PopupPositionProvider.this, basicTooltipState, coroutineScope, z, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, boolean z, final androidx.compose.foundation.BasicTooltipState basicTooltipState) {
        return z ? androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope Camera2StreamConfigurationMap;
                int getHighResolutionOutputSizeshNQ4ISI;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighSpeedVideoSizes;

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 1, 1}, l = {166, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 175}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00091 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighSpeedVideoSizes;

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
                    
                        if (r13 == r0) goto L32;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                            this.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                            this.getHighResolutionOutputSizeshNQ4ISI = pointerEventPass;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            java.lang.Object awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, pointerEventPass, this, 1, null);
                            if (awaitFirstDown$default != coroutine_suspended) {
                                awaitPointerEventScope = awaitPointerEventScope3;
                                obj = awaitFirstDown$default;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    changes.get(i2).consume();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.getHighResolutionOutputSizeshNQ4ISI;
                            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (((androidx.compose.foundation.gestures.LongPressResult) obj) instanceof androidx.compose.foundation.gestures.LongPressResult.Success) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091.C00101(this.getHighSpeedVideoSizes, null), 3, null);
                                this.Camera2StreamConfigurationMap = null;
                                this.getHighResolutionOutputSizeshNQ4ISI = null;
                                this.getHighSpeedVideoFpsRangesFor = 3;
                                obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.getHighResolutionOutputSizeshNQ4ISI;
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        int type = ((androidx.compose.ui.input.pointer.PointerInputChange) obj).getType();
                        if (androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA()) || androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7305getStylusT8wyACA())) {
                            this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                            this.getHighResolutionOutputSizeshNQ4ISI = pointerEventPass;
                            this.getHighSpeedVideoFpsRangesFor = 2;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(awaitPointerEventScope, pointerEventPass, this);
                            if (obj != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                if (((androidx.compose.foundation.gestures.LongPressResult) obj) instanceof androidx.compose.foundation.gestures.LongPressResult.Success) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00101 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        int getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighSpeedVideoFpsRanges;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (this.getHighSpeedVideoFpsRanges.show(androidx.compose.foundation.MutatePriority.UserInput, this) == coroutine_suspended) {
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

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091.C00101) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091.C00101(this.getHighSpeedVideoFpsRanges, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00101(androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091.C00101> continuation) {
                            super(2, continuation);
                            this.getHighSpeedVideoFpsRanges = basicTooltipState;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091 c00091 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
                        c00091.Camera2StreamConfigurationMap = obj;
                        return c00091;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00091(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRanges = coroutineScope;
                        this.getHighSpeedVideoSizes = basicTooltipState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.Camera2StreamConfigurationMap, new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00091(coroutineScope, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.Camera2StreamConfigurationMap = pointerInputScope;
                    this.getHighSpeedVideoSizes = basicTooltipState;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1(pointerInputScope, androidx.compose.foundation.BasicTooltipState.this, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }), basicTooltipState, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$2

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoSizes;

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"}, v = 1)
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00111 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    int Camera2StreamConfigurationMap;
                    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
                    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighSpeedVideoSizes;

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[RETURN] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r11.Camera2StreamConfigurationMap
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r11.getHighSpeedVideoFpsRangesFor
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r11.getHighSpeedVideoFpsRanges
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.ResultKt.throwOnFailure(r12)
                            goto L39
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            kotlin.ResultKt.throwOnFailure(r12)
                            java.lang.Object r12 = r11.getHighSpeedVideoFpsRanges
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r12
                        L29:
                            r12 = r11
                            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                            r11.getHighSpeedVideoFpsRanges = r3
                            r11.getHighSpeedVideoFpsRangesFor = r1
                            r11.Camera2StreamConfigurationMap = r2
                            java.lang.Object r12 = r3.awaitPointerEvent(r1, r12)
                            if (r12 != r0) goto L39
                            return r0
                        L39:
                            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
                            java.util.List r4 = r12.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.getType()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
                            int r5 = r5.m7304getMouseT8wyACA()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(r4, r5)
                            if (r4 == 0) goto L29
                            int r12 = r12.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r4 = r4.m7184getEnter7fucELk()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(r12, r4)
                            if (r4 == 0) goto L7b
                            kotlinx.coroutines.CoroutineScope r5 = r11.getHighResolutionOutputSizeshNQ4ISI
                            r6 = 0
                            r7 = 0
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r12 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r4 = r11.getHighSpeedVideoSizes
                            r8 = 0
                            r12.<init>(r4, r8)
                            r8 = r12
                            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                            r9 = 3
                            r10 = 0
                            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                            goto L29
                        L7b:
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r4 = r4.m7185getExit7fucELk()
                            boolean r12 = androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(r12, r4)
                            if (r12 == 0) goto L29
                            androidx.compose.foundation.BasicTooltipState r12 = r11.getHighSpeedVideoSizes
                            r12.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00121 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ androidx.compose.foundation.BasicTooltipState getHighResolutionOutputSizeshNQ4ISI;
                        int getHighSpeedVideoSizes;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoSizes;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.getHighSpeedVideoSizes = 1;
                                if (this.getHighResolutionOutputSizeshNQ4ISI.show(androidx.compose.foundation.MutatePriority.UserInput, this) == coroutine_suspended) {
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

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111.C00121) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111.C00121(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00121(androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111.C00121> continuation) {
                            super(2, continuation);
                            this.getHighResolutionOutputSizeshNQ4ISI = basicTooltipState;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111 c00111 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
                        c00111.getHighSpeedVideoFpsRanges = obj;
                        return c00111;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00111(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111> continuation) {
                        super(2, continuation);
                        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
                        this.getHighSpeedVideoSizes = basicTooltipState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = 1;
                        if (this.getHighSpeedVideoSizes.awaitPointerEventScope(new androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00111(coroutineScope, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoSizes = pointerInputScope;
                    this.getHighSpeedVideoFpsRanges = basicTooltipState;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1(pointerInputScope, androidx.compose.foundation.BasicTooltipState.this, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }) : modifier;
    }

    public static final androidx.compose.foundation.BasicTooltipState rememberBasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = androidx.compose.foundation.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1123859613, i, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32;
        boolean z4 = (((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.BasicTooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.BasicTooltipStateImpl basicTooltipStateImpl = (androidx.compose.foundation.BasicTooltipStateImpl) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }

    public static /* synthetic */ androidx.compose.foundation.BasicTooltipState BasicTooltipState$default(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = androidx.compose.foundation.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, mutatorMutex);
    }

    public static final androidx.compose.foundation.BasicTooltipState BasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex) {
        return new androidx.compose.foundation.BasicTooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$1pdEden7YFoHt3ULBzPRKT3vRDI(final androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.BasicTooltipState.this.onDispose();
            }
        };
    }

    public static /* synthetic */ boolean $r8$lambda$3iP3VMMtXU_A5c7wOnMj1GsfXsU(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.BasicTooltipState basicTooltipState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1(basicTooltipState, null), 3, null);
        return true;
    }

    /* renamed from: $r8$lambda$96zyarguW-cYkJO5ttwz9hzZlmc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1291$r8$lambda$96zyarguWcYkJO5ttwz9hzZlmc(java.lang.String str, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.BasicTooltipKt.$r8$lambda$3iP3VMMtXU_A5c7wOnMj1GsfXsU(kotlinx.coroutines.CoroutineScope.this, basicTooltipState));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ADqd1sU2gbHNu-6H6CiAcxk5YcQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1292$r8$lambda$ADqd1sU2gbHNu6H6CiAcxk5YcQ(boolean z, androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(z, basicTooltipState, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J82dIPuIG80ULXSQWQi2EBp0XSQ(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7790getAssertive0phEisY());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LgjTv0k90uE9p-AnZyPYdqytP5g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1293$r8$lambda$LgjTv0k90uE9pAnZyPYdqytP5g(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(popupPositionProvider, basicTooltipState, coroutineScope, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cVmhqCqBFMEoY4tkWA0kkxS3Xys(final java.lang.String str, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(916917707, i, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(str);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.BasicTooltipKt.$r8$lambda$J82dIPuIG80ULXSQWQi2EBp0XSQ(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function2.invoke(composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eR67hVqdel337jirzOGCObniBjw(androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (basicTooltipState.isVisible()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1(basicTooltipState, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n2wsnSL8gRt0MSZdbGmu6rgNWvM(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, kotlin.jvm.functions.Function2 function22, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BasicTooltipBox(popupPositionProvider, function2, basicTooltipState, modifier, z, z2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
