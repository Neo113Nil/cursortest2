package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a)\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"CLIApprovalScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalViewModel;Landroidx/compose/runtime/Composer;I)V", "CLIApprovalUiEffectHandler", "toastMessage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "effect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalUiEffect$NavigateToCLIHub;", "CLIApprovalContent", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalEvent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CLIApprovalReadyContent", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NewCreditLimitCard", "newCreditLine", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Landroidx/compose/runtime/Composer;I)V", "CLIApprovalScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "CLIApprovalScreenLoadingPreview", "CLIApprovalScreenErrorPreview", "revolvingcredit-servicing_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApprovalScreenKt {
    public static final void CLIApprovalScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel cLIApprovalViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1835669869);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(cLIApprovalViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1835669869, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreen (CLIApprovalScreen.kt:72)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cLIApprovalViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            getHighSpeedVideoSizes(appNavigator, cLIApprovalViewModel, startRestartGroup, i3 & 126);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState cLIApprovalState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance = startRestartGroup.changedInstance(cLIApprovalViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$mpe20RofBwVAYe4zX87_EB13zAI(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CLIApprovalContent(cLIApprovalState, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$n2GUJshnLtWT5PfSMLfmV7iDMS4(com.paypal.oslo.core.navigation.AppNavigator.this, cLIApprovalViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel cLIApprovalViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1371918204);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(cLIApprovalViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1371918204, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalUiEffectHandler (CLIApprovalScreen.kt:85)");
            }
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect> uiEffect = cLIApprovalViewModel.getUiEffect();
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$amPtBcUihlG2kntxGwxKEpoKS_0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$2E19o8HE8MEij2UdUKblXim6Cyk(com.paypal.oslo.core.navigation.AppNavigator.this, cLIApprovalViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CLIApprovalContent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState cLIApprovalState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(207318588);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cLIApprovalState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(207318588, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalContent (CLIApprovalScreen.kt:111)");
            }
            if (cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready) {
                startRestartGroup.startReplaceGroup(1664672449);
                getHighSpeedVideoSizes(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready) cLIApprovalState).getUiModel(), function1, startRestartGroup, i2 & 112);
                startRestartGroup.endReplaceGroup();
            } else if ((cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial) || (cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing) || (cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel)) {
                startRestartGroup.startReplaceGroup(1664679692);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error)) {
                    startRestartGroup.startReplaceGroup(1664671828);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(65541828);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_error_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null);
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$vXGhIKkNu0WFVKoevDLH9gZcY7c(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(errorUiModel, fillMaxSize$default, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$oNXIQ4pLm7LAKOom0WjPIpPYJaM(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-446928103);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cLIApprovalUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-446928103, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalReadyContent (CLIApprovalScreen.kt:146)");
            }
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1922524928, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$IE0ZwdcMl34SWhPmdTpw0lYfMCU(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1926905057, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$gDV9q54dVVXb3vDwJz6cJuSW5SI(androidx.compose.foundation.ScrollState.this, cLIApprovalUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 27654, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.m18341$r8$lambda$NW42bK9JYf64a4tSDG5e2FDEAw(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(133811690);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(uiString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(133811690, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.NewCreditLimitCard (CLIApprovalScreen.kt:229)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 7, null), com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1143100368, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$UNnhYz3twesJxSLYOdMw71sAMuU(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, 500);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$cweteAwbjVLBmi_knkLWbqQeLas(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2E19o8HE8MEij2UdUKblXim6Cyk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel cLIApprovalViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(appNavigator, cLIApprovalViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IE0ZwdcMl34SWhPmdTpw0lYfMCU(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1922524928, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalReadyContent.<anonymous>.<anonymous> (CLIApprovalScreen.kt:160)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_notice, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_accept_increase, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 7, null);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$VAKDSPUZJkbY4SeRVU25g6LelgU(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, m1710paddingqDBjuR0$default, null, null, primary, large, false, false, composer, 1769472, 408);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_decline_increase, composer, 0);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.m18343$r8$lambda$eYeuRVcVAwc9nY2x7vik4svRiI(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, m1710paddingqDBjuR0$default2, null, null, tertiary, large2, false, false, composer, 1769472, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NW42bK9JYf64a4tSDG5e2F-DEAw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18341$r8$lambda$NW42bK9JYf64a4tSDG5e2FDEAw(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(cLIApprovalUiModel, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QwNZpjbrpg0KIsXUXNDD8QWOfE8(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult cLIApprovalNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(cLIApprovalNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UECeovUKG7JJXKfguzz-jJnsjvU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18342$r8$lambda$UECeovUKG7JJXKfguzzjJnsjvU(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent cLIApprovalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UNnhYz3twesJxSLYOdMw71sAMuU(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1143100368, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.NewCreditLimitCard.<anonymous> (CLIApprovalScreen.kt:237)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_new_limit, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(uiString.asString(composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 0, 6, 1020);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_new_limit_disclaimer, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1000);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VAKDSPUZJkbY4SeRVU25g6LelgU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnAcceptIncreaseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YGzzoBdSMPhQOWK1iszxRdw2a48(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1783497372);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1783497372, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenErrorPreview (CLIApprovalScreen.kt:309)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error error = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error(null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo("ACC-123456789", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "1500.00"), "2026-02-28", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "2500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "125.00"), "OFFER-987654321"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.m18342$r8$lambda$UECeovUKG7JJXKfguzzjJnsjvU((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CLIApprovalContent(error, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$YGzzoBdSMPhQOWK1iszxRdw2a48(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$amPtBcUihlG2kntxGwxKEpoKS_0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect cLIApprovalUiEffect) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalUiEffect, "");
        if (!(cLIApprovalUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect.NavigateToCLIHub)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect.NavigateToCLIHub navigateToCLIHub = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect.NavigateToCLIHub) cLIApprovalUiEffect;
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.WhenMappings.$EnumSwitchMapping$0[navigateToCLIHub.getOperation().ordinal()];
        if (i == 1) {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_cli_limit_increased, new java.lang.Object[]{navigateToCLIHub.getAmount()}, null, false, 12, null);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_cli_limit_not_changed, new java.lang.Object[]{navigateToCLIHub.getAmount()}, null, false, 12, null);
        }
        final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult cLIApprovalNavResult = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult(stringResWithParameter);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$QwNZpjbrpg0KIsXUXNDD8QWOfE8(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cweteAwbjVLBmi_knkLWbqQeLas(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(uiString, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eYeuRVcVAwc9nY-2x7vik4svRiI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18343$r8$lambda$eYeuRVcVAwc9nY2x7vik4svRiI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnDeclineIncreaseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fb4ruaGMBoh0qM56R0g40WAg03g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(841530328);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(841530328, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenLoadingPreview (CLIApprovalScreen.kt:301)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial initial = com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.m18344$r8$lambda$y_r6cp7xtmzm8CJIwgGo6f5vHc((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CLIApprovalContent(initial, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$fb4ruaGMBoh0qM56R0g40WAg03g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gDV9q54dVVXb3vDwJz6cJuSW5SI(androidx.compose.foundation.ScrollState scrollState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1926905057, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalReadyContent.<anonymous>.<anonymous> (CLIApprovalScreen.kt:192)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
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
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_title, composer, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (java.lang.String) null, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt.INSTANCE.m18346getLambda$45552086$revolvingcredit_servicing_prodRelease(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 221232, 76);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(cLIApprovalUiModel.getDescription().asString(composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            getHighResolutionOutputSizeshNQ4ISI(cLIApprovalUiModel.getNewCreditLimit(), composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mpe20RofBwVAYe4zX87_EB13zAI(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel cLIApprovalViewModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent cLIApprovalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalEvent, "");
        cLIApprovalViewModel.processEvent(cLIApprovalEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n2GUJshnLtWT5PfSMLfmV7iDMS4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel cLIApprovalViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        CLIApprovalScreen(appNavigator, cLIApprovalViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oNXIQ4pLm7LAKOom0WjPIpPYJaM(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState cLIApprovalState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        CLIApprovalContent(cLIApprovalState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oqCVD8FBp1yNptcgFsoQKIwy1dM(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent cLIApprovalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rU7EP1tZxK1N0GNiR8i08T9550E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1383315938);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1383315938, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenPreview (CLIApprovalScreen.kt:266)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("£4,000 = £80/month"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_description, new java.lang.Object[]{"20 Dec,2026"}, null, false, 12, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("£2,500"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("£4,000")), new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo("ACC-123456789", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "1500.00"), "2026-02-28", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "2500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "125.00"), "OFFER-987654321"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$oqCVD8FBp1yNptcgFsoQKIwy1dM((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CLIApprovalContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.$r8$lambda$rU7EP1tZxK1N0GNiR8i08T9550E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vXGhIKkNu0WFVKoevDLH9gZcY7c(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnTryAgainClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y_r6cp7xtmzm8CJIwgGo6f5-vHc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18344$r8$lambda$y_r6cp7xtmzm8CJIwgGo6f5vHc(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent cLIApprovalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.ACCEPT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.DECLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
