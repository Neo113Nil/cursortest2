package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NeoBankSelectionScreenKt {
    public static final com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-597979952, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.m20848$r8$lambda$SC4hw3Qn4dZd6d57vjfmnchaDY((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(795118900, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.$r8$lambda$Aza0wYdgHtmsbS_SLG33O0afFYU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$Aza0wYdgHtmsbS_SLG33O0afFYU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(795118900, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.lambda$795118900.<anonymous> (NeoBankSelectionScreen.kt:114)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt$$ExternalSyntheticLambda2
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

    /* renamed from: $r8$lambda$S-C4hw3Qn4dZd6d57vjfmnchaDY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20848$r8$lambda$SC4hw3Qn4dZd6d57vjfmnchaDY(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-597979952, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.lambda$-597979952.<anonymous> (NeoBankSelectionScreen.kt:89)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, "Right chevron", null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$795118900$wallet_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-597979952$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20850getLambda$597979952$wallet_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
