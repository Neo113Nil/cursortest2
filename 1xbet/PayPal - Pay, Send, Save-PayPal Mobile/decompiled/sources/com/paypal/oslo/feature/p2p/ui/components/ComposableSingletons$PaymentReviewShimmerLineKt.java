package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PaymentReviewShimmerLineKt {
    public static final com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$PaymentReviewShimmerLineKt INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$PaymentReviewShimmerLineKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1263822447, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$PaymentReviewShimmerLineKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$PaymentReviewShimmerLineKt.$r8$lambda$58TXJRpj_ztCHWS0bUPJ6nTkXrU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$58TXJRpj_ztCHWS0bUPJ6nTkXrU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1263822447, i, -1, "com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$PaymentReviewShimmerLineKt.lambda$1263822447.<anonymous> (PaymentReviewShimmerLine.kt:45)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize20()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1263822447$p2p_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
