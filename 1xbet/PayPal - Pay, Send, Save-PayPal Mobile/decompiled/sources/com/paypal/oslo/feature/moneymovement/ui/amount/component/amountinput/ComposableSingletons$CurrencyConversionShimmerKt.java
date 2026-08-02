package com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$CurrencyConversionShimmerKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.ComposableSingletons$CurrencyConversionShimmerKt INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.ComposableSingletons$CurrencyConversionShimmerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-567675695, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.ComposableSingletons$CurrencyConversionShimmerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.ComposableSingletons$CurrencyConversionShimmerKt.$r8$lambda$TYd8KTuNwjMj4skgAdYo4fbwLws((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$TYd8KTuNwjMj4skgAdYo4fbwLws(androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-567675695, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.ComposableSingletons$CurrencyConversionShimmerKt.lambda$-567675695.<anonymous> (CurrencyConversionShimmer.kt:45)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            f = com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.CurrencyConversionShimmerKt.getHighSpeedVideoSizes;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(companion, f), com.paypal.pds.core.ConstantsKt.getSpacing40()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-567675695$money_movement_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15632getLambda$567675695$money_movement_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
