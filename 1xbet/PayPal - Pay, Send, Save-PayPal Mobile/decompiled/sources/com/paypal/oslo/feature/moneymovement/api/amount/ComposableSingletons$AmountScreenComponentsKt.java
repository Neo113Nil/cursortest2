package com.paypal.oslo.feature.moneymovement.api.amount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$AmountScreenComponentsKt {
    public static final com.paypal.oslo.feature.moneymovement.api.amount.ComposableSingletons$AmountScreenComponentsKt INSTANCE = new com.paypal.oslo.feature.moneymovement.api.amount.ComposableSingletons$AmountScreenComponentsKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1642345060, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.ComposableSingletons$AmountScreenComponentsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.api.amount.ComposableSingletons$AmountScreenComponentsKt.m15605$r8$lambda$xBD8lYGzDsCRe0BbKru5nooeOk((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$xBD8lYGzDsCRe0BbKr-u5nooeOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15605$r8$lambda$xBD8lYGzDsCRe0BbKru5nooeOk(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1642345060, i, -1, "com.paypal.oslo.feature.moneymovement.api.amount.ComposableSingletons$AmountScreenComponentsKt.lambda$-1642345060.<anonymous> (AmountScreenComponents.kt:115)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1642345060$money_movement_api_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15606getLambda$1642345060$money_movement_api_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
