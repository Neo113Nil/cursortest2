package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0080@¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\f\u001a\u00020\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0000¨\u0006\u001a²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"GenericInAppBrowserScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "collectUiEffects", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GenericInAppBrowserScreenContent", "state", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GenericInAppBrowserDefaultPreview", "(Landroidx/compose/runtime/Composer;I)V", "GenericInAppBrowserErrorPreview", "GenericInAppBrowser", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "secureWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenericInAppBrowserScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericInAppBrowserScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-697542740);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(genericInAppBrowserViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-697542740, i4, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreen (GenericInAppBrowserScreen.kt:40)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(genericInAppBrowserViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean changedInstance = startRestartGroup.changedInstance(genericInAppBrowserViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19959$r8$lambda$hoY3B9JkWX6lKt8qs1XZ4Buf0(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(genericInAppBrowserViewModel);
                boolean z = (i4 & 14) == 4;
                com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$GenericInAppBrowserScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$GenericInAppBrowserScreen$2$1(genericInAppBrowserViewModel, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState = (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance3 = startRestartGroup.changedInstance(genericInAppBrowserViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$6_0RcqagnJO8smzwQfnLAby7Eoo(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.this, (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                GenericInAppBrowserScreenContent(genericInAppBrowserUiState, (kotlin.jvm.functions.Function1) rememberedValue3, modifier3, startRestartGroup, i4 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19960$r8$lambda$i94dGqy0s1sixEY6fvdf1W69I4(com.paypal.oslo.core.navigation.AppNavigator.this, genericInAppBrowserViewModel, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.Object collectUiEffects(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = genericInAppBrowserViewModel.getUiEffect().collect(new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$collectUiEffects$2(appNavigator), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericInAppBrowserScreenContent(final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2111285101);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(genericInAppBrowserUiState) : startRestartGroup.changedInstance(genericInAppBrowserUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2111285101, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenContent (GenericInAppBrowserScreen.kt:76)");
                }
                if (genericInAppBrowserUiState instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default) {
                    startRestartGroup.startReplaceGroup(-1720410805);
                    getHighSpeedVideoSizes(function1, (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default) genericInAppBrowserUiState, modifier4, startRestartGroup, (i3 & 896) | ((i3 << 3) & 112) | ((i3 >> 3) & 14), 0);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    if (!(genericInAppBrowserUiState instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error)) {
                        startRestartGroup.startReplaceGroup(-1720412195);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1720404978);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1533075974, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19957$r8$lambda$MHFMTJ_te8jz8pjddUgDgJUAZI(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 196614, 94);
                    boolean z = (i3 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$31W4vUPzRaglfrLn3jMZRtUrtiw(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, startRestartGroup, 0, 4);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19958$r8$lambda$fJkiHJBG1ajQlcXil9OIU_p70(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r9, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1454192297);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(r9) : startRestartGroup.changedInstance(r9) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1454192297, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowser (GenericInAppBrowserScreen.kt:134)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19961$r8$lambda$jfFGs_48AjTYLTnpVvQe9YoDp4(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest urlRequest = r9.getUrlRequest();
            java.lang.String title = r9.getTitle();
            boolean changed = startRestartGroup.changed(urlRequest);
            boolean changed2 = startRestartGroup.changed(title);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = secureWebViewConfiguration(r9, function1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2, function0, modifier, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | (i3 & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19956$r8$lambda$7eBqrZm36x8SPZ9w4UYoXAxzCU(kotlin.jvm.functions.Function1.this, r9, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r16, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r16, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, r16.getUrlRequest(), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(r16.getTitle(), null, false, false, false, 30, null), r16.getSettings(), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(com.paypal.oslo.feature.subscriptions.shared.iab.ui.WebViewClientDelegateKt.webViewClientDelegate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$4rjrehkdCQ8YCtzzcvh0srBAfrU(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        }), null, 2, null), 37, null);
    }

    /* renamed from: $r8$lambda$1e5ESi0op2-PaifU3ylV18RkRLY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19954$r8$lambda$1e5ESi0op2PaifU3ylV18RkRLY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2OmVNM-MKOLhMVWXPEwiSfs-vfA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19955$r8$lambda$2OmVNMMKOLhMVWXPEwiSfsvfA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-454468589);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-454468589, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserDefaultPreview (GenericInAppBrowserScreen.kt:105)");
            }
            com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r1 = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default(new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest("https://www.example.com", "", false, false, null, 28, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, false, 3, null), "In-App Browser");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$FRWtuQKoRdLtBbKx_qxvMzplyoM((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            GenericInAppBrowserScreenContent(r1, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest.$stable | com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings.$stable | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19955$r8$lambda$2OmVNMMKOLhMVWXPEwiSfsvfA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$31W4vUPzRaglfrLn3jMZRtUrtiw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.TryAgainClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4rjrehkdCQ8YCtzzcvh0srBAfrU(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6_0RcqagnJO8smzwQfnLAby7Eoo(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent genericInAppBrowserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserEvent, "");
        genericInAppBrowserViewModel.onEvent(genericInAppBrowserEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7eBqrZm3-6x8SPZ9w4UYoXAxzCU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19956$r8$lambda$7eBqrZm36x8SPZ9w4UYoXAxzCU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r7, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(function1, r7, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FRWtuQKoRdLtBbKx_qxvMzplyoM(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent genericInAppBrowserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MHFMTJ_te8jz8pjddU-gDgJUAZI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19957$r8$lambda$MHFMTJ_te8jz8pjddUgDgJUAZI(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1533075974, i, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenContent.<anonymous>.<anonymous> (GenericInAppBrowserScreen.kt:88)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.m19954$r8$lambda$1e5ESi0op2PaifU3ylV18RkRLY(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Py5TJGS69W354UBuuPFxZiPFIfM(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent genericInAppBrowserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fJkiHJBG1ajQlcXil9--OIU_p70, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19958$r8$lambda$fJkiHJBG1ajQlcXil9OIU_p70(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GenericInAppBrowserScreenContent(genericInAppBrowserUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hoY3B9JkWX6lKt8qs1-X-Z4Buf0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19959$r8$lambda$hoY3B9JkWX6lKt8qs1XZ4Buf0(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel) {
        genericInAppBrowserViewModel.onEvent((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent) com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.OnSystemBackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i94dGqy0s1-sixEY6fvdf1W69I4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19960$r8$lambda$i94dGqy0s1sixEY6fvdf1W69I4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GenericInAppBrowserScreen(appNavigator, genericInAppBrowserViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jf-FGs_48AjTYLTnpVvQe9YoDp4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19961$r8$lambda$jfFGs_48AjTYLTnpVvQe9YoDp4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$virXBYlk7mipuo3ZwQcsg4PfYcw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-524681300);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-524681300, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserErrorPreview (GenericInAppBrowserScreen.kt:120)");
            }
            com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error error = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error("https://www.example.com");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$Py5TJGS69W354UBuuPFxZiPFIfM((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            GenericInAppBrowserScreenContent(error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt.$r8$lambda$virXBYlk7mipuo3ZwQcsg4PfYcw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
