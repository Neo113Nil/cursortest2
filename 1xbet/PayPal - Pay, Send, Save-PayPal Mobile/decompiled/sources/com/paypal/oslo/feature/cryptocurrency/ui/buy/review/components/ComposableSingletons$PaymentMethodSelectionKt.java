package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$PaymentMethodSelectionKt {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(776607647, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt.$r8$lambda$R5a0XTsCIbjxCVZqevRW4t74VX0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$R5a0XTsCIbjxCVZqevRW4t74VX0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(776607647, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt.lambda$776607647.<anonymous> (PaymentMethodSelection.kt:141)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$776607647$cryptocurrency_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
