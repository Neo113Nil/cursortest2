package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aa\u0010\f\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "pyusdRewardsCardUiState", "Lcom/paypal/pds/components/BottomSheetController;", "pyusdRewardsLearnMoreBottomSheetController", "pyusdRewardsSuccessBottomSheetController", "pyusdRewardsCannotPerformPayoutBottomSheetController", "pyusdRewardsEnrolledCardTooltipController", "Lkotlin/Function0;", "", "onPYUSDRewardsOptInClick", "onBuyMorePYUSDClick", "onTermsClick", "CryptoPYUSDRewardsBottomSheets", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPYUSDRewardsBottomSheetsKt {
    public static final void CryptoPYUSDRewardsBottomSheets(final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.pds.components.BottomSheetController bottomSheetController2, final com.paypal.pds.components.BottomSheetController bottomSheetController3, final com.paypal.pds.components.BottomSheetController bottomSheetController4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1856850372);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pYUSDRewardsCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(bottomSheetController2) : startRestartGroup.changedInstance(bottomSheetController2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(bottomSheetController3) : startRestartGroup.changedInstance(bottomSheetController3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? startRestartGroup.changed(bottomSheetController4) : startRestartGroup.changedInstance(bottomSheetController4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1856850372, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheets (CryptoPYUSDRewardsBottomSheets.kt:47)");
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.BottomSheetCallbackHandler bottomSheetCallbackHandler = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.BottomSheetCallbackHandler(bottomSheetController, bottomSheetController2, bottomSheetController3, bottomSheetController4, function0, function02, function03);
            if (pYUSDRewardsCardUiState == null) {
                composer2.startReplaceGroup(-1748064050);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1748064049);
                java.lang.String formattedRate = pYUSDRewardsCardUiState.getStatus().getFormattedRate();
                boolean changedInstance = composer2.changedInstance(bottomSheetCallbackHandler);
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$1$1 rememberedValue = composer2.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$1$1(bottomSheetCallbackHandler);
                    composer2.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue);
                boolean changedInstance2 = composer2.changedInstance(bottomSheetCallbackHandler);
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$2$1 rememberedValue2 = composer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$2$1(bottomSheetCallbackHandler);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
                boolean changedInstance3 = composer2.changedInstance(bottomSheetCallbackHandler);
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$3$1 rememberedValue3 = composer2.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$3$1(bottomSheetCallbackHandler);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsLearnMoreBottomSheetKt.CryptoPYUSDRewardsLearnMoreBottomSheet(formattedRate, bottomSheetController, function04, function05, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3), composer2, (com.paypal.pds.components.BottomSheetController.$stable << 3) | (i3 & 112));
                java.lang.String logoUrl = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbolKt.getLogoUrl(com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.PYUSD, composer2, 6);
                java.lang.String formattedRate2 = pYUSDRewardsCardUiState.getStatus().getFormattedRate();
                boolean changedInstance4 = composer2.changedInstance(bottomSheetCallbackHandler);
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$4$1 rememberedValue4 = composer2.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$4$1(bottomSheetCallbackHandler);
                    composer2.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue4);
                boolean changedInstance5 = composer2.changedInstance(bottomSheetCallbackHandler);
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$5$1 rememberedValue5 = composer2.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$1$5$1(bottomSheetCallbackHandler);
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsSuccessBottomSheetKt.CryptoPYUSDRewardsSuccessBottomSheet(logoUrl, formattedRate2, bottomSheetController2, function06, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue5), composer2, (i3 & 896) | (com.paypal.pds.components.BottomSheetController.$stable << 6));
                composer2.endReplaceGroup();
            }
            boolean changedInstance6 = composer2.changedInstance(bottomSheetCallbackHandler);
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$2$1 rememberedValue6 = composer2.rememberedValue();
            if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$2$1(bottomSheetCallbackHandler);
                composer2.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6);
            boolean changedInstance7 = composer2.changedInstance(bottomSheetCallbackHandler);
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$3$1 rememberedValue7 = composer2.rememberedValue();
            if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$3$1(bottomSheetCallbackHandler);
                composer2.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsCannotPerformPayoutBottomSheetKt.CryptoPYUSDRewardsCannotPerformPayoutBottomSheet(bottomSheetController3, function07, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue7), composer2, com.paypal.pds.components.BottomSheetController.$stable | ((i3 >> 9) & 14));
            boolean changedInstance8 = composer2.changedInstance(bottomSheetCallbackHandler);
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$4$1 rememberedValue8 = composer2.rememberedValue();
            if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$CryptoPYUSDRewardsBottomSheets$4$1(bottomSheetCallbackHandler);
                composer2.updateRememberedValue(rememberedValue8);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsEnrolledCardTooltipKt.CryptoPYUSDRewardsEnrolledCardTooltip(bottomSheetController4, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue8), composer2, com.paypal.pds.components.BottomSheetController.$stable | ((i3 >> 12) & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsBottomSheetsKt.$r8$lambda$vPR3qtTvYlpLe73xLGpDlReRqig(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState.this, bottomSheetController, bottomSheetController2, bottomSheetController3, bottomSheetController4, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vPR3qtTvYlpLe73xLGpDlReRqig(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, com.paypal.pds.components.BottomSheetController bottomSheetController4, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoPYUSDRewardsBottomSheets(pYUSDRewardsCardUiState, bottomSheetController, bottomSheetController2, bottomSheetController3, bottomSheetController4, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
