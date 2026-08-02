package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0011\u001aP\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a^\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\n2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a,\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a:\u0010\u001f\u001a\u00020\n*\u00020\n2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002\u001a+\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\u0010%\u001a&\u0010&\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020$H\u0001\u001a\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(H\u0003¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismissRequest", "focusable", "", "enableUserInput", "hasAction", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "forceKeyboardFocusable", "Landroidx/compose/runtime/MutableState;", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/runtime/MutableState;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipPopup", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/TooltipState;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;ZLandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "handleGestures", "enabled", "anchorSemantics", "label", "", "keyboardBehavior", "rememberBasicTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "BasicTooltipState", "rememberTouchExplorationOrSwitchAccessServiceState", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d5, code lost:
    
        if (((java.lang.Boolean) r18.getValue()).booleanValue() != false) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0319  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTooltipBox(final androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final androidx.compose.material3.TooltipState tooltipState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, boolean z2, boolean z3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        boolean z9;
        ?? r10;
        boolean z10;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m5299constructorimpl;
        int i9;
        boolean z11;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1221877520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function02 = function0;
                        z6 = z5;
                        z7 = z4;
                        z8 = z3;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = i4 != 0 ? null : function0;
                        if (i5 != 0) {
                            z4 = false;
                        }
                        boolean z12 = i6 != 0 ? true : z5;
                        boolean z13 = i7 != 0 ? false : z3;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                        if (z13) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1960751094, 0, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
                            }
                            i8 = i3;
                            boolean z14 = false;
                            androidx.compose.runtime.State<java.lang.Boolean> rememberAccessibilityServiceState = androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, true, false, startRestartGroup, 438, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            if (!rememberAccessibilityServiceState.getValue().booleanValue()) {
                                z9 = z14;
                            }
                            z10 = true;
                            r10 = z14;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r10);
                            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r10);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (!tooltipState.getGetHighResolutionOutputSizeshNQ4ISI()) {
                                startRestartGroup.startReplaceGroup(-1891243071);
                                boolean z15 = (z4 || z10) ? true : r10;
                                i9 = i8;
                                getHighSpeedVideoFpsRangesFor(popupPositionProvider, tooltipState, function03, coroutineScope, z15, mutableState, function2, startRestartGroup, (i8 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i8 >> 3) & 112) | ((i8 >> 6) & 896) | ((i8 << 15) & 3670016));
                                startRestartGroup.endReplaceGroup();
                            } else {
                                i9 = i8;
                                startRestartGroup.startReplaceGroup(-1890863476);
                                startRestartGroup.endReplaceGroup();
                            }
                            getHighSpeedVideoSizes(z12, tooltipState, mutableState, z13, modifier3, function22, startRestartGroup, ((i9 >> 18) & 14) | 384 | ((i9 >> 3) & 112) | ((i9 >> 12) & 7168) | ((i9 << 3) & 57344) | ((i9 >> 9) & 458752), 0);
                            startRestartGroup.endNode();
                            z11 = (i9 & 896) != 256 || ((i9 & 512) != 0 && startRestartGroup.changedInstance(tooltipState));
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z11 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.internal.BasicTooltipKt.m4292$r8$lambda$K5Nd06VvyvpLD4gSSKw5SEc960(androidx.compose.material3.TooltipState.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.runtime.EffectsKt.DisposableEffect(tooltipState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, (i9 >> 6) & 14);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z7 = z4;
                            z6 = z12;
                            modifier2 = modifier3;
                            function02 = function03;
                            z8 = z13;
                        } else {
                            i8 = i3;
                            z9 = false;
                        }
                        z10 = z9 ? 1 : 0;
                        r10 = z9;
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r10);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r10);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m5299constructorimpl.getInserting()) {
                        }
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        if (!tooltipState.getGetHighResolutionOutputSizeshNQ4ISI()) {
                        }
                        getHighSpeedVideoSizes(z12, tooltipState, mutableState, z13, modifier3, function22, startRestartGroup, ((i9 >> 18) & 14) | 384 | ((i9 >> 3) & 112) | ((i9 >> 12) & 7168) | ((i9 << 3) & 57344) | ((i9 >> 9) & 458752), 0);
                        startRestartGroup.endNode();
                        if ((i9 & 896) != 256) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z11) {
                        }
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.internal.BasicTooltipKt.m4292$r8$lambda$K5Nd06VvyvpLD4gSSKw5SEc960(androidx.compose.material3.TooltipState.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        androidx.compose.runtime.EffectsKt.DisposableEffect(tooltipState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, (i9 >> 6) & 14);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z4;
                        z6 = z12;
                        modifier2 = modifier3;
                        function02 = function03;
                        z8 = z13;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material3.internal.BasicTooltipKt.m4291$r8$lambda$CvXxaEoMTWMLDfBY4kQQVvfBDY(androidx.compose.ui.window.PopupPositionProvider.this, function2, tooltipState, modifier2, function02, z7, z6, z8, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final boolean z, final androidx.compose.material3.TooltipState tooltipState, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final boolean z2, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1873232064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((i2 & 32) == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1873232064, i4, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                final java.lang.String label = androidx.compose.material3.internal.BasicTooltipStrings.INSTANCE.label(startRestartGroup, 6);
                androidx.compose.ui.Modifier Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(modifier4, z, tooltipState);
                androidx.compose.ui.Modifier highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(z ? androidx.compose.material3.internal.ChildParentSemanticsKt.parentSemantics(Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.internal.BasicTooltipKt.m4290$r8$lambda$72AMlpSeMRnhFrCEMwcmaVJaKk(label, coroutineScope, tooltipState, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                }) : Camera2StreamConfigurationMap, z, tooltipState, coroutineScope, z2, mutableState);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, highResolutionOutputSizeshNQ4ISI);
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
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 15) & 14));
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.internal.BasicTooltipKt.$r8$lambda$wXMZt5LuktpxEcKf3A36x0G0lqc(z, tooltipState, mutableState, z2, modifier3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, final androidx.compose.material3.TooltipState tooltipState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlinx.coroutines.CoroutineScope coroutineScope, final boolean z, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1413720282);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(coroutineScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1413720282, i2, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            java.lang.String description = androidx.compose.material3.internal.BasicTooltipStrings.INSTANCE.description(startRestartGroup, 6);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(tooltipState));
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            boolean z4 = (458752 & i2) == 131072;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z3 | z2 | changedInstance | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.internal.BasicTooltipKt.m4289$r8$lambda$UCVTXqa3GRcroYD2pcerMnaX8(kotlin.jvm.functions.Function0.this, tooltipState, coroutineScope, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(popupPositionProvider, (kotlin.jvm.functions.Function0) rememberedValue, new androidx.compose.ui.window.PopupProperties(z, false, false, false, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1287705660, true, new androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$2(description, function2), startRestartGroup, 54), startRestartGroup, (i2 & 14) | 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.BasicTooltipKt.$r8$lambda$0eJ_j1No5kM3fBlxFul52j5YaJM(androidx.compose.ui.window.PopupPositionProvider.this, tooltipState, function0, coroutineScope, z, mutableState, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.Modifier Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, boolean z, final androidx.compose.material3.TooltipState tooltipState) {
        return z ? androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, tooltipState, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                int getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoSizes;

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 0, 0, 1, 1, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 238}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00321 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
                    final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoFpsRangesFor;
                    long getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    private /* synthetic */ java.lang.Object getInputFormats;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x010a A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001a, B:10:0x0106, B:12:0x010a, B:26:0x00dc), top: B:2:0x000d }] */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
                    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v1 */
                    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.flow.MutableStateFlow] */
                    /* JADX WARN: Type inference failed for: r2v20 */
                    /* JADX WARN: Type inference failed for: r2v21 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                        kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow;
                        java.lang.Object awaitFirstDown$default;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass;
                        long j;
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                        java.lang.Object waitForUpOrCancellation;
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ?? r2 = this.getHighSpeedVideoSizesFor;
                        try {
                            if (r2 == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
                                MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                long longPressTimeoutMillis = awaitPointerEventScope3.getViewConfiguration().getLongPressTimeoutMillis();
                                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                                this.getInputFormats = awaitPointerEventScope3;
                                this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
                                this.Camera2StreamConfigurationMap = pointerEventPass3;
                                this.getHighSpeedVideoSizes = longPressTimeoutMillis;
                                this.getHighSpeedVideoSizesFor = 1;
                                awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, pointerEventPass3, this, 1, null);
                                if (awaitFirstDown$default != coroutine_suspended) {
                                    awaitPointerEventScope = awaitPointerEventScope3;
                                    pointerEventPass = pointerEventPass3;
                                    j = longPressTimeoutMillis;
                                }
                                return coroutine_suspended;
                            }
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    if (r2 != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = (kotlinx.coroutines.flow.MutableStateFlow) this.getInputFormats;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    waitForUpOrCancellation = obj;
                                    r2 = mutableStateFlow3;
                                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) waitForUpOrCancellation;
                                    if (pointerInputChange != null) {
                                        pointerInputChange.consume();
                                    }
                                    r2.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    return kotlin.Unit.INSTANCE;
                                }
                                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass4 = (androidx.compose.ui.input.pointer.PointerEventPass) this.Camera2StreamConfigurationMap;
                                mutableStateFlow = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighResolutionOutputSizeshNQ4ISI;
                                awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    mutableStateFlow.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
                                    pointerEventPass2 = pointerEventPass4;
                                    mutableStateFlow2 = mutableStateFlow;
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3(mutableStateFlow2, this.getHighSpeedVideoFpsRangesFor, null), 1, null);
                                    this.getInputFormats = mutableStateFlow2;
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                    this.Camera2StreamConfigurationMap = null;
                                    this.getHighSpeedVideoSizesFor = 3;
                                    waitForUpOrCancellation = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope2, pointerEventPass2, this);
                                    r2 = mutableStateFlow2;
                                    if (waitForUpOrCancellation == coroutine_suspended) {
                                    }
                                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) waitForUpOrCancellation;
                                    if (pointerInputChange != null) {
                                    }
                                    r2.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    mutableStateFlow.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    throw th;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            j = this.getHighSpeedVideoSizes;
                            pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.Camera2StreamConfigurationMap;
                            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighResolutionOutputSizeshNQ4ISI;
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
                            kotlin.ResultKt.throwOnFailure(obj);
                            MutableStateFlow = mutableStateFlow4;
                            awaitFirstDown$default = obj;
                            int type = ((androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default).getType();
                            if (androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA()) || androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7305getStylusT8wyACA())) {
                                try {
                                    this.getInputFormats = awaitPointerEventScope;
                                    this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
                                    this.Camera2StreamConfigurationMap = pointerEventPass;
                                    this.getHighSpeedVideoSizesFor = 2;
                                    if (awaitPointerEventScope.withTimeout(j, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.C00331(pointerEventPass, null), this) != coroutine_suspended) {
                                        mutableStateFlow = MutableStateFlow;
                                        mutableStateFlow.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    }
                                } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused2) {
                                    pointerEventPass2 = pointerEventPass;
                                    awaitPointerEventScope2 = awaitPointerEventScope;
                                    mutableStateFlow2 = MutableStateFlow;
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3(mutableStateFlow2, this.getHighSpeedVideoFpsRangesFor, null), 1, null);
                                    this.getInputFormats = mutableStateFlow2;
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                    this.Camera2StreamConfigurationMap = null;
                                    this.getHighSpeedVideoSizesFor = 3;
                                    waitForUpOrCancellation = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope2, pointerEventPass2, this);
                                    r2 = mutableStateFlow2;
                                    if (waitForUpOrCancellation == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) waitForUpOrCancellation;
                                    if (pointerInputChange != null) {
                                    }
                                    r2.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    mutableStateFlow = MutableStateFlow;
                                    mutableStateFlow.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                                    throw th;
                                }
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            mutableStateFlow = r2;
                        }
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00331 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange>, java.lang.Object> {
                        final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass Camera2StreamConfigurationMap;
                        int getHighResolutionOutputSizeshNQ4ISI;
                        private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                return obj;
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            java.lang.Object waitForUpOrCancellation = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation((androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this);
                            return waitForUpOrCancellation == coroutine_suspended ? coroutine_suspended : waitForUpOrCancellation;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
                            return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.C00331) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.C00331 c00331 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.C00331(this.Camera2StreamConfigurationMap, continuation);
                            c00331.getHighSpeedVideoSizes = obj;
                            return c00331;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00331(androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.C00331> continuation) {
                            super(2, continuation);
                            this.Camera2StreamConfigurationMap = pointerEventPass;
                        }
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", i = {}, l = {224, 227, 227}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoFpsRanges;
                        int getHighSpeedVideoFpsRangesFor;

                        /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
                        
                            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7.Camera2StreamConfigurationMap, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341(r7.getHighSpeedVideoFpsRanges, null), r7) != r0) goto L20;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
                        
                            if (r7.getHighSpeedVideoFpsRanges.show(androidx.compose.foundation.MutatePriority.PreventUserInput, r7) != r0) goto L16;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Throwable th;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoFpsRangesFor;
                            try {
                            } catch (java.lang.Throwable th2) {
                                if (this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI()) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = th2;
                                    this.getHighSpeedVideoFpsRangesFor = 3;
                                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341(this.getHighSpeedVideoFpsRanges, null), this) != coroutine_suspended) {
                                        th = th2;
                                    }
                                    return coroutine_suspended;
                                }
                                throw th2;
                            }
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.Camera2StreamConfigurationMap.tryEmit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                                this.getHighSpeedVideoFpsRangesFor = 1;
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    if (i != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    th = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    throw th;
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            if (this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI()) {
                                this.getHighSpeedVideoFpsRangesFor = 2;
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
                        static final class C00341 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            int Camera2StreamConfigurationMap;
                            final /* synthetic */ androidx.compose.material3.TooltipState getHighResolutionOutputSizeshNQ4ISI;
                            /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.Camera2StreamConfigurationMap != 0) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (!this.getHighSpeedVideoFpsRangesFor) {
                                    this.getHighResolutionOutputSizeshNQ4ISI.dismiss();
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341 c00341 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                                c00341.getHighSpeedVideoFpsRangesFor = ((java.lang.Boolean) obj).booleanValue();
                                return c00341;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00341(androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3.C00341> continuation) {
                                super(2, continuation);
                                this.getHighResolutionOutputSizeshNQ4ISI = tooltipState;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321.AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.Camera2StreamConfigurationMap = mutableStateFlow;
                            this.getHighSpeedVideoFpsRanges = tooltipState;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321 c00321 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
                        c00321.getInputFormats = obj;
                        return c00321;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00321(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRanges = coroutineScope;
                        this.getHighSpeedVideoFpsRangesFor = tooltipState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.getHighSpeedVideoFpsRanges, new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00321(coroutineScope, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
                    return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
                    anonymousClass1.Camera2StreamConfigurationMap = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRanges = pointerInputScope;
                    this.getHighSpeedVideoSizes = tooltipState;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1.AnonymousClass1(pointerInputScope, androidx.compose.material3.TooltipState.this, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }), tooltipState, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoFpsRangesFor;

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00351 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.compose.material3.TooltipState Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

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
                            int r1 = r11.getHighResolutionOutputSizeshNQ4ISI
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r11.getHighSpeedVideoFpsRangesFor
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r11.getHighSpeedVideoSizes
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
                            java.lang.Object r12 = r11.getHighSpeedVideoSizes
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r12
                        L29:
                            r12 = r11
                            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                            r11.getHighSpeedVideoSizes = r3
                            r11.getHighSpeedVideoFpsRangesFor = r1
                            r11.getHighResolutionOutputSizeshNQ4ISI = r2
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
                            kotlinx.coroutines.CoroutineScope r5 = r11.getHighSpeedVideoFpsRanges
                            r6 = 0
                            r7 = 0
                            androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r12 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.material3.TooltipState r4 = r11.Camera2StreamConfigurationMap
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
                            androidx.compose.material3.TooltipState r12 = r11.Camera2StreamConfigurationMap
                            r12.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00361 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ androidx.compose.material3.TooltipState Camera2StreamConfigurationMap;
                        int getHighSpeedVideoFpsRanges;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoFpsRanges;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.getHighSpeedVideoFpsRanges = 1;
                                if (this.Camera2StreamConfigurationMap.show(androidx.compose.foundation.MutatePriority.UserInput, this) == coroutine_suspended) {
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
                            return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351.C00361) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351.C00361(this.Camera2StreamConfigurationMap, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00361(androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351.C00361> continuation) {
                            super(2, continuation);
                            this.Camera2StreamConfigurationMap = tooltipState;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351 c00351 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
                        c00351.getHighSpeedVideoSizes = obj;
                        return c00351;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00351(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRanges = coroutineScope;
                        this.Camera2StreamConfigurationMap = tooltipState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
                        this.Camera2StreamConfigurationMap = 1;
                        if (this.getHighResolutionOutputSizeshNQ4ISI.awaitPointerEventScope(new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00351(coroutineScope, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
                    return ((androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
                    anonymousClass1.getHighSpeedVideoFpsRanges = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
                    this.getHighSpeedVideoFpsRangesFor = tooltipState;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1(pointerInputScope, androidx.compose.material3.TooltipState.this, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }) : modifier;
    }

    private static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, boolean z, final androidx.compose.material3.TooltipState tooltipState, final kotlinx.coroutines.CoroutineScope coroutineScope, final boolean z2, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        if (z) {
            return androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.internal.BasicTooltipKt.$r8$lambda$CphgePfuGiEn8s7nddyFYTrf__o(kotlinx.coroutines.CoroutineScope.this, tooltipState, (androidx.compose.ui.focus.FocusState) obj);
                }
            }), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                    android.view.KeyEvent m7078unboximpl = keyEvent.m7078unboximpl();
                    boolean getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.TooltipState.this.getGetHighResolutionOutputSizeshNQ4ISI();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    if (!getHighResolutionOutputSizeshNQ4ISI) {
                        mutableState.setValue(bool);
                    }
                    if (!z2 || !androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(m7078unboximpl), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) || !androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl), androidx.compose.ui.input.key.Key.INSTANCE.m7017getTabEK5gGoQ()) || !androidx.compose.material3.TooltipState.this.getGetHighResolutionOutputSizeshNQ4ISI()) {
                        return bool;
                    }
                    mutableState.setValue(java.lang.Boolean.TRUE);
                    return java.lang.Boolean.TRUE;
                }
            });
        }
        mutableState.setValue(java.lang.Boolean.FALSE);
        return modifier;
    }

    public static final androidx.compose.material3.TooltipState rememberBasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = androidx.compose.material3.internal.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1483057531, i, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:346)");
        }
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32;
        boolean z4 = (((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.internal.BasicTooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.internal.BasicTooltipStateImpl basicTooltipStateImpl = (androidx.compose.material3.internal.BasicTooltipStateImpl) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }

    public static /* synthetic */ androidx.compose.material3.TooltipState BasicTooltipState$default(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = androidx.compose.material3.internal.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, mutatorMutex);
    }

    public static final androidx.compose.material3.TooltipState BasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex) {
        return new androidx.compose.material3.internal.BasicTooltipStateImpl(z, z2, mutatorMutex);
    }

    /* renamed from: $r8$lambda$-UCVTXqa3GRcroYD2pcerMnaX-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4289$r8$lambda$UCVTXqa3GRcroYD2pcerMnaX8(kotlin.jvm.functions.Function0 function0, androidx.compose.material3.TooltipState tooltipState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState) {
        if (function0 == null) {
            if (tooltipState.getGetHighResolutionOutputSizeshNQ4ISI()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1(tooltipState, null), 3, null);
                mutableState.setValue(java.lang.Boolean.FALSE);
            }
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0eJ_j1No5kM3fBlxFul52j5YaJM(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, androidx.compose.material3.TooltipState tooltipState, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(popupPositionProvider, tooltipState, function0, coroutineScope, z, mutableState, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$4yhdXErQygjnvYehZVGFN6Qq5lU(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.TooltipState tooltipState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1(tooltipState, null), 3, null);
        return true;
    }

    /* renamed from: $r8$lambda$7-2AMlpSeMRnhFrCEMwcmaVJaKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4290$r8$lambda$72AMlpSeMRnhFrCEMwcmaVJaKk(java.lang.String str, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.material3.TooltipState tooltipState, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicTooltipKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.BasicTooltipKt.$r8$lambda$4yhdXErQygjnvYehZVGFN6Qq5lU(kotlinx.coroutines.CoroutineScope.this, tooltipState));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CphgePfuGiEn8s7nddyFYTrf__o(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.TooltipState tooltipState, androidx.compose.ui.focus.FocusState focusState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1(focusState, tooltipState, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CvXxaEoMTWML-DfBY4kQQVvfBDY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4291$r8$lambda$CvXxaEoMTWMLDfBY4kQQVvfBDY(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, kotlin.jvm.functions.Function2 function2, androidx.compose.material3.TooltipState tooltipState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, boolean z, boolean z2, boolean z3, kotlin.jvm.functions.Function2 function22, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BasicTooltipBox(popupPositionProvider, function2, tooltipState, modifier, function0, z, z2, z3, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K-5Nd06VvyvpLD4gSSKw5SEc960, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m4292$r8$lambda$K5Nd06VvyvpLD4gSSKw5SEc960(final androidx.compose.material3.TooltipState tooltipState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltipKt$BasicTooltipBox$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material3.TooltipState.this.onDispose();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wXMZt5LuktpxEcKf3A36x0G0lqc(boolean z, androidx.compose.material3.TooltipState tooltipState, androidx.compose.runtime.MutableState mutableState, boolean z2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(z, tooltipState, mutableState, z2, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
