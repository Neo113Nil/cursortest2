package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a1\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"RequestVirtualCardScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;Landroidx/compose/runtime/Composer;I)V", "RequestVirtualCardReadyContent", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "isRequestingCard", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEvent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ErrorStateUi", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Error;", "onTryAgain", "Lkotlin/Function0;", "onManageCard", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Error;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ErrorStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "RequestVirtualCardScreenReadyPreview", "RequestVirtualCardScreenRequestingPreview", "CardAspectRatio", "", "revolvingcredit-servicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardScreenKt {
    public static final void RequestVirtualCardScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel requestVirtualCardViewModel, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardArgs, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1733015917);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(requestVirtualCardViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(requestVirtualCardArgs) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1733015917, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreen (RequestVirtualCardScreen.kt:77)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(requestVirtualCardViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect> uiEffect = requestVirtualCardViewModel.getUiEffect();
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$XZK8ck8LJ7s7fYj3eKGuaWN_Bug(com.paypal.oslo.core.navigation.AppNavigator.this, requestVirtualCardArgs, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 6);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState requestVirtualCardState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState) collectAsStateWithLifecycle.getValue();
            boolean z3 = requestVirtualCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Loading;
            if (z3 || (requestVirtualCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Ready)) {
                startRestartGroup.startReplaceGroup(1526157502);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo = requestVirtualCardState.getReadyInfo();
                boolean changedInstance = startRestartGroup.changedInstance(requestVirtualCardViewModel);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$RequestVirtualCardScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$RequestVirtualCardScreen$2$1(requestVirtualCardViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoSizes(readyInfo, z3, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(requestVirtualCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error)) {
                    startRestartGroup.startReplaceGroup(1019058923);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1526443601);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error) requestVirtualCardState;
                boolean changedInstance2 = startRestartGroup.changedInstance(requestVirtualCardViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$rAx_6JFGBUJV_oi_oxUiYriRe50(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance3 = startRestartGroup.changedInstance(requestVirtualCardViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$G54uRdTRF9kHd3Bw6tEWwWCB4mE(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                getHighSpeedVideoFpsRanges(error, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$d5uoc_lf1aghEAXJ_hBPUd4t4U4(com.paypal.oslo.core.navigation.AppNavigator.this, requestVirtualCardViewModel, requestVirtualCardArgs, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-638790974);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(readyInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-638790974, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardReadyContent (RequestVirtualCardScreen.kt:135)");
            }
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel = readyInfo.getRequestVirtualCardUiModel();
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1589814843, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$zYdrUv01HMZ7gl0korblkE_lYWY(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel.this, function1, z, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1766143100, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.m18572$r8$lambda$B53SINkcmHJte112vs8P2yzgpQ(androidx.compose.foundation.ScrollState.this, requestVirtualCardUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 27654, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$aJ6NeVHDtZHrLYh47hhUJ48uOt8(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo.this, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error error, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-409828383);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-409828383, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.ErrorStateUi (RequestVirtualCardScreen.kt:246)");
            }
            int i3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.WhenMappings.$EnumSwitchMapping$0[error.getErrorType().ordinal()];
            if (i3 == 1) {
                startRestartGroup.startReplaceGroup(1394893636);
                androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_error_message), uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null), fillMaxHeight$default, function0, startRestartGroup, ((i2 << 3) & 896) | 48, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    startRestartGroup.startReplaceGroup(1291920657);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1395584750);
                androidx.compose.ui.Modifier fillMaxHeight$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_error_verify_address_title);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_error_verify_address_description), uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_manage_profile), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null), fillMaxHeight$default2, function02, startRestartGroup, (i2 & 896) | 48, 0);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.m18576$r8$lambda$j3TGxX1Gsz2E2w1dCkyYeKO1co(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$B53SINkc-mHJte112vs8P2yzgpQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18572$r8$lambda$B53SINkcmHJte112vs8P2yzgpQ(androidx.compose.foundation.ScrollState scrollState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1766143100, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardReadyContent.<anonymous>.<anonymous> (RequestVirtualCardScreen.kt:193)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String cardArtUrl = requestVirtualCardUiModel.getCardArtUrl();
            if (cardArtUrl == null) {
                composer.startReplaceGroup(598232438);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(598232439);
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(cardArtUrl, null, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.59f, false, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12())), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), composer, 196656, 24);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_title, composer, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 0, 6, 1006);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_description, composer, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 0, 6, 1006);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BwDe5-zSCZqR1hH9R9R7FdEZXqU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18574$r8$lambda$BwDe5zSCZqR1hH9R9R7FdEZXqU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DPwgVpzc1Ld60zo_wgJ-URY_hoo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18575$r8$lambda$DPwgVpzc1Ld60zo_wgJURY_hoo(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnCardholderTermsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F3A6M0J9HdMfu_ZLSRPivfLiNZo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1884302617);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1884302617, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenReadyPreview (RequestVirtualCardScreen.kt:299)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel("https://pics.paypal.com/00/p/MDhhOGYxOTAtODljYi00NWZlLTlhY2MtYzZlNDg3ZDVhNjkw/image_8.png", "https://www.paypal.com/uk/webapps/mpp/ua/legalhub-full"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$WRfAib5nNKAQkzAE7hP95Rcmb6Y((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(readyInfo, false, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$F3A6M0J9HdMfu_ZLSRPivfLiNZo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G54uRdTRF9kHd3Bw6tEWwWCB4mE(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel requestVirtualCardViewModel) {
        requestVirtualCardViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnManageCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J4mKYqQP1R6X8_gtrZHMN2lXQMc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnMaybeLaterClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SRjsGHPLaYP_Ygf98QbD753zOJM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Tlg3GzrRjaidKVn3YZyBhiaQgVE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1867552181);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1867552181, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenRequestingPreview (RequestVirtualCardScreen.kt:316)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel("https://pics.paypal.com/00/p/MDhhOGYxOTAtODljYi00NWZlLTlhY2MtYzZlNDg3ZDVhNjkw/image_8.png", "https://www.paypal.com/uk/webapps/mpp/ua/legalhub-full"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$bLX62_zhFAWBllVLiHE90nLnrbg((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(readyInfo, true, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$Tlg3GzrRjaidKVn3YZyBhiaQgVE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WRfAib5nNKAQkzAE7hP95Rcmb6Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent requestVirtualCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XZK8ck8LJ7s7fYj3eKGuaWN_Bug(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect requestVirtualCardEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardEffect, "");
        if (requestVirtualCardEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect.NavigateBack) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.m18574$r8$lambda$BwDe5zSCZqR1hH9R9R7FdEZXqU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (requestVirtualCardEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect.NavigateToCardholderTerms) {
            final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect.NavigateToCardholderTerms) requestVirtualCardEffect).getUrl(), requestVirtualCardArgs.getCreditProductIdentifier(), false, false, (java.lang.String) null, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$iCOhNIwofchqcBNVO4liaUYapiM(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (requestVirtualCardEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect.NavigateToManageAccount) {
            final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink(requestVirtualCardArgs.getCreditProductIdentifier()));
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$eyiI9lzJPEhV9qQxSbFkj8zuHyk(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(requestVirtualCardEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect.NavigateToSuccess)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$SRjsGHPLaYP_Ygf98QbD753zOJM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aJ6NeVHDtZHrLYh47hhUJ48uOt8(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(readyInfo, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bLX62_zhFAWBllVLiHE90nLnrbg(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent requestVirtualCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cWm92VMy5K9NHkEHiphGYBm2UVA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnRequestVirtualCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d5uoc_lf1aghEAXJ_hBPUd4t4U4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel requestVirtualCardViewModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, int i, androidx.compose.runtime.Composer composer, int i2) {
        RequestVirtualCardScreen(appNavigator, requestVirtualCardViewModel, requestVirtualCardArgs, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eyiI9lzJPEhV9qQxSbFkj8zuHyk(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(manageCardDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iCIXxWjS6L2Y1MpQdt5TxtsObfw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1897029101);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1897029101, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.ErrorStatePreview (RequestVirtualCardScreen.kt:279)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error error = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel("https://...", "https://...")), com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType.UNKNOWN);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(error, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$iCIXxWjS6L2Y1MpQdt5TxtsObfw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iCOhNIwofchqcBNVO4liaUYapiM(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(revolvingCreditWebViewDestination);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j3TG-xX1Gsz2E2w1dCkyYeKO1co, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18576$r8$lambda$j3TGxX1Gsz2E2w1dCkyYeKO1co(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Error error, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(error, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rAx_6JFGBUJV_oi_oxUiYriRe50(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel requestVirtualCardViewModel) {
        requestVirtualCardViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnTryAgainClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zYdrUv01HMZ7gl0korblkE_lYWY(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel, final kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        int i2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1589814843, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardReadyContent.<anonymous>.<anonymous> (RequestVirtualCardScreen.kt:151)");
            }
            if (requestVirtualCardUiModel.getCardHolderTermsUrl() != null) {
                composer.startReplaceGroup(1569730298);
                com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_terms, composer, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_terms_link, composer, 0), requestVirtualCardUiModel.getCardHolderTermsUrl())));
                androidx.compose.ui.text.style.TextAlign m8436boximpl = androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk());
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.m18575$r8$lambda$DPwgVpzc1Ld60zo_wgJURY_hoo(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer2 = composer;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, null, null, null, m8436boximpl, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, null, null, composer, 0, 0, 7150);
                composer.endReplaceGroup();
                i2 = 0;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1570427891);
                i2 = 0;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                composer.endReplaceGroup();
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_primary_button, composer2, i2);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.runtime.Composer composer3 = composer2;
            boolean changed2 = composer3.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$cWm92VMy5K9NHkEHiphGYBm2UVA(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource, fillMaxWidth$default, null, null, primary, large, !z, z, composer, 1769856, 24);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_request_virtual_card_secondary_button, composer3, i2);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed3 = composer3.changed(function1);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.$r8$lambda$J4mKYqQP1R6X8_gtrZHMN2lXQMc(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, fillMaxWidth$default2, null, null, tertiary, large2, false, false, composer, 1769856, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType.UNABLE_TO_VERIFY_ADDRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
