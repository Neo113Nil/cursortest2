package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$PersonalInfoScreenKt {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.ComposableSingletons$PersonalInfoScreenKt INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.ComposableSingletons$PersonalInfoScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(537344987, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.ComposableSingletons$PersonalInfoScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.ComposableSingletons$PersonalInfoScreenKt.$r8$lambda$DJYSrVsbnB8qhzHi9a6_mKmGn0w((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$DJYSrVsbnB8qhzHi9a6_mKmGn0w(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(537344987, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.ComposableSingletons$PersonalInfoScreenKt.lambda$537344987.<anonymous> (PersonalInfoScreen.kt:1067)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentFundingInstrumentListKt.RepaymentLeadingIcon(com.paypal.pds.core.Icon.Plus.INSTANCE, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$537344987$bnpl_acquisition_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
