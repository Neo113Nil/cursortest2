package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$AgreementItemKt {
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2008062680, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt.$r8$lambda$KtKF10Od8SmbG1FboMJc7JADIcI((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$KtKF10Od8SmbG1FboMJc7JADIcI(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2008062680, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt.lambda$2008062680.<anonymous> (AgreementItem.kt:94)");
            }
            com.paypal.pds.core.Icon.CheckCircleFill checkCircleFill = com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE;
            com.paypal.pds.core.Icon.CheckCircleFill checkCircleFill2 = checkCircleFill;
            com.paypal.pds.components.IconKt.Icon(checkCircleFill2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_agreement_item_selected, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "agreement_checkmark_icon"), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 28038, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2008062680$subscriptions_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
