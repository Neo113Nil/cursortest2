package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$AddBankManualInfoScreenKt {
    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(95867939, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt.$r8$lambda$yM5HHx_6PDB3MCMhV6E5tVg6ws0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$yM5HHx_6PDB3MCMhV6E5tVg6ws0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(95867939, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt.lambda$95867939.<anonymous> (AddBankManualInfoScreen.kt:684)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.ComposableSingletons$AddBankManualInfoScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarLeadingElementKt.WalletTopBarBack((kotlin.jvm.functions.Function0) rememberedValue, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$95867939$wallet_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
