package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$ChooseSecondaryPaymentScreenKt {
    public static final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt INSTANCE = new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1421465640, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt.m20272$r8$lambda$hZWpEQhyllmBsaiqWdcmOCxKes((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$hZWpEQhyllmBs-aiqWdcmOCxKes, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20272$r8$lambda$hZWpEQhyllmBsaiqWdcmOCxKes(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1421465640, i, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt.lambda$1421465640.<anonymous> (ChooseSecondaryPaymentScreen.kt:125)");
            }
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_secondary_settings_title, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_secondary_settings_description, composer, 0), (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1421465640$taptopay_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
