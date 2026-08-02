package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$RadioItemRowKt {
    public static final com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$RadioItemRowKt INSTANCE = new com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$RadioItemRowKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1202524950, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$RadioItemRowKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$RadioItemRowKt.$r8$lambda$qhQ90uGf7YSY0R3BfiuN1mn3z0E((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$qhQ90uGf7YSY0R3BfiuN1mn3z0E(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1202524950, i, -1, "com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$RadioItemRowKt.lambda$1202524950.<anonymous> (RadioItemRow.kt:107)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Radio Item Title", null, null, null, null, null, false, 0, 0, null, null, composer, 6, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1202524950$wallet_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
