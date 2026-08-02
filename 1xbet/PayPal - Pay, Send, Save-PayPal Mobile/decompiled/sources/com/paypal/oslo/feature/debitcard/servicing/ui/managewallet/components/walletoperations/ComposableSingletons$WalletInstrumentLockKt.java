package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$WalletInstrumentLockKt {
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2102156833, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt.$r8$lambda$Nhm36rYTI0xTF8CUljEatTjHmLI((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nhm36rYTI0xTF8CUljEatTjHmLI(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2102156833, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt.lambda$2102156833.<anonymous> (WalletInstrumentLock.kt:56)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.LockLocked.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2102156833$debit_card_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
