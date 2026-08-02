package com.paypal.oslo.feature.taptopay.ui.setup.error;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;", "coordinator", "", "TokenizationErrorScreen", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;Landroidx/compose/runtime/Composer;I)V", "", "isPPDC", "isRetryable", "Lkotlin/Function0;", "onRetry", "onClose", "TokenizationErrorContent", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenizationErrorScreenKt {
    public static final void TokenizationErrorScreen(final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupFlowCoordinator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-823713781);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(setupFlowCoordinator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-823713781, i2, -1, "com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreen (TokenizationErrorScreen.kt:40)");
            }
            com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo cardInfo = setupFlowCoordinator.getStateHolder().getCardInfo();
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState errorState = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState) setupFlowCoordinator.getStateHolder().getHighSpeedVideoFpsRangesFor.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.class));
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization tokenization = errorState instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization ? (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization) errorState : null;
            if (tokenization == null) {
                tokenization = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0);
            }
            final boolean z = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.isPPDC(cardInfo) && tokenization.getRetryCount() < 2;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to("isPPDC", java.lang.Boolean.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.isPPDC(cardInfo)));
            pairArr[1] = kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(tokenization.getRetryCount()));
            pairArr[2] = kotlin.TuplesKt.to("isRetryable", java.lang.Boolean.valueOf(z));
            pairArr[3] = kotlin.TuplesKt.to("buttonText", z ? "Retry" : "Ok");
            com.paypal.android.logger.Logger.d$default(logger, "TokenizationErrorScreen", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            boolean isPPDC = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.isPPDC(cardInfo);
            boolean changed = startRestartGroup.changed(z);
            boolean changedInstance = startRestartGroup.changedInstance(setupFlowCoordinator);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt.$r8$lambda$NIfdufOqUANieiESCZ_S2ievNP0(z, setupFlowCoordinator);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(setupFlowCoordinator);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt.$r8$lambda$i1dO3OkUGx3hJMX3ggxbVbyO1Rc(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            TokenizationErrorContent(isPPDC, z, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt.$r8$lambda$jF_SHj31nQkGiaOUw_e1Flkfbeo(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TokenizationErrorContent(final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(968316543);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(968316543, i2, -1, "com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorContent (TokenizationErrorScreen.kt:91)");
            }
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_tokenization_error_activation_title, startRestartGroup, 0);
            int i4 = i2 & 126;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(919963538, i4, -1, "com.paypal.oslo.feature.taptopay.ui.setup.error.getErrorDescription (TokenizationErrorScreen.kt:117)");
            }
            if (z && z2) {
                i3 = com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_tokenization_error_activation_body_retry;
            } else if (z && !z2) {
                i3 = com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_tokenization_error_activation_body_terminal;
            } else {
                i3 = com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_tokenization_error_generic_terminal_body;
            }
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            if (z2) {
                startRestartGroup.startReplaceGroup(2118097366);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_common_button_retry, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2118179609);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_common_button_ok, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt.SetupErrorContent(stringResource2, stringResource, function0, function02, stringResource3, null, null, null, startRestartGroup, i2 & 8064, 224);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.error.TokenizationErrorScreenKt.$r8$lambda$DuXclxEZ1FRRrorf56IlqX8Unn8(z, z2, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DuXclxEZ1FRRrorf56IlqX8Unn8(boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        TokenizationErrorContent(z, z2, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NIfdufOqUANieiESCZ_S2ievNP0(boolean z, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator) {
        if (z) {
            setupFlowCoordinator.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.RetryTokenization.INSTANCE);
        } else {
            setupFlowCoordinator.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i1dO3OkUGx3hJMX3ggxbVbyO1Rc(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator) {
        setupFlowCoordinator.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jF_SHj31nQkGiaOUw_e1Flkfbeo(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, int i, androidx.compose.runtime.Composer composer, int i2) {
        TokenizationErrorScreen(setupFlowCoordinator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
