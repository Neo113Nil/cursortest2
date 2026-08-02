package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$MoneyMovementGoalsListKt {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-497675717, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt.$r8$lambda$97EAF4V5IaAYq_MPxmJ50bBaQAo((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$97EAF4V5IaAYq_MPxmJ50bBaQAo(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-497675717, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt.lambda$-497675717.<anonymous> (MoneyMovementGoalsList.kt:452)");
            }
            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_money_no_amount, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, composer, com.paypal.pds.components.ContextualAlertStyle.Neutral.$stable << 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-497675717$savings_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19002getLambda$497675717$savings_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
