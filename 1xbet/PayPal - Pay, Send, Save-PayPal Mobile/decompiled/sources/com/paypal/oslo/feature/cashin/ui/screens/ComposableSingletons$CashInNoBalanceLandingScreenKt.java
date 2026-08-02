package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CashInNoBalanceLandingScreenKt {
    public static final com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInNoBalanceLandingScreenKt INSTANCE = new com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInNoBalanceLandingScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2002772017, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInNoBalanceLandingScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInNoBalanceLandingScreenKt.$r8$lambda$vvz8ATWoFPkR9ojyL67x5QwGVq0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$vvz8ATWoFPkR9ojyL67x5QwGVq0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2002772017, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInNoBalanceLandingScreenKt.lambda$-2002772017.<anonymous> (CashInNoBalanceLandingScreen.kt:150)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInNoBalanceLandingScreenKt.getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_props_convenient_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_props_convenient_caption, composer, 0), true, null, composer, 384, 8);
            com.paypal.oslo.feature.cashin.ui.screens.CashInNoBalanceLandingScreenKt.getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_props_simple_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_props_simple_caption, composer, 0), false, null, composer, 384, 8);
            com.paypal.oslo.feature.cashin.ui.screens.CashInNoBalanceLandingScreenKt.getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_props_quick_title, composer, 0), "", false, null, composer, 432, 8);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_landing_nobalance_disclaimer_balance, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), "cash_in_landing_nobalance_disclaimer_balance"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-2002772017$cash_in_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13483getLambda$2002772017$cash_in_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
