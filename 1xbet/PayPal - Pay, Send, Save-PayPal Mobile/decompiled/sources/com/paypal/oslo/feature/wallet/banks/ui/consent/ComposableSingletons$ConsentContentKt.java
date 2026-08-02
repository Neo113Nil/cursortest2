package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$ConsentContentKt {
    public static final com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(683451143, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt.m20844$r8$lambda$a0DaeAEVRzkqGU3QPfAnqMR6Ek((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-517847906, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt.m20846$r8$lambda$x19ytu4LKzNwhfo3sI0jTJo8ko((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$a0DaeAEVRzkqGU3QPfAnqM-R6Ek, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20844$r8$lambda$a0DaeAEVRzkqGU3QPfAnqMR6Ek(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(683451143, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt.lambda$683451143.<anonymous> (ConsentContent.kt:388)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt$$ExternalSyntheticLambda3
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

    /* renamed from: $r8$lambda$x19ytu4LKzN-whfo3sI0jTJo8ko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20846$r8$lambda$x19ytu4LKzNwhfo3sI0jTJo8ko(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-517847906, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt.lambda$-517847906.<anonymous> (ConsentContent.kt:444)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$ConsentContentKt$$ExternalSyntheticLambda0
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

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$683451143$wallet_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-517847906$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20847getLambda$517847906$wallet_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
