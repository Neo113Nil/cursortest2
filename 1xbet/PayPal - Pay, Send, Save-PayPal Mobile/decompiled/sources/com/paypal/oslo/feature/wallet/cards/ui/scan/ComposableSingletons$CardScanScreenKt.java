package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$CardScanScreenKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1361859644, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt.m21192$r8$lambda$0_mOR7MI3ToVFe_QSoBI5y657U((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1054831209, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt.$r8$lambda$fZvE5lOWSxJxh5xcPFXBq1BRp2o((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$0_mOR7M-I3ToVFe_QSoBI5y657U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21192$r8$lambda$0_mOR7MI3ToVFe_QSoBI5y657U(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1361859644, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt.lambda$1361859644.<anonymous> (CardScanScreen.kt:301)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Pencil.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, null, composer, 3126, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fZvE5lOWSxJxh5xcPFXBq1BRp2o(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1054831209, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.scan.ComposableSingletons$CardScanScreenKt.lambda$-1054831209.<anonymous> (CardScanScreen.kt:316)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Bank.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, null, composer, 3126, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1361859644$wallet_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-1054831209$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21193getLambda$1054831209$wallet_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
