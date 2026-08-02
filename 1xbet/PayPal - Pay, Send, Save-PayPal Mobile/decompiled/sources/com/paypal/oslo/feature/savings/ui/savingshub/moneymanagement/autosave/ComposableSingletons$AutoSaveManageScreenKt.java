package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$AutoSaveManageScreenKt {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1197882352, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt.$r8$lambda$dR0vyhWRPiUwEWzc89VBaeLVZio((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$dR0vyhWRPiUwEWzc89VBaeLVZio(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1197882352, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt.lambda$1197882352.<anonymous> (AutoSaveManageScreen.kt:565)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review_from_where, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer, 384, 6, 1018);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1197882352$savings_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
