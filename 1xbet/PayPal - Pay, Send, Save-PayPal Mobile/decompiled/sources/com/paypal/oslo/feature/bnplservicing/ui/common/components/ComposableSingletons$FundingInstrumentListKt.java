package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$FundingInstrumentListKt {
    public static final com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2143587677, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt.$r8$lambda$vA2a6vbzOVeO7cPEQkEHKpTHYDE((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$vA2a6vbzOVeO7cPEQkEHKpTHYDE(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2143587677, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt.lambda$2143587677.<anonymous> (FundingInstrumentList.kt:103)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.Camera2StreamConfigurationMap(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2143587677$bnpl_servicing_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
