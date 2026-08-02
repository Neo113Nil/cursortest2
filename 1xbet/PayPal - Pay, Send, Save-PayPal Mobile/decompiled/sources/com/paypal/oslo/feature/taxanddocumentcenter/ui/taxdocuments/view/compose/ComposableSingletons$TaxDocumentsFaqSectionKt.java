package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$TaxDocumentsFaqSectionKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1219650064, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt.$r8$lambda$czA3CO_vb8cB6zOK2dqsaeBkfw0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$czA3CO_vb8cB6zOK2dqsaeBkfw0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1219650064, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt.lambda$-1219650064.<anonymous> (TaxDocumentsFaqSection.kt:157)");
            }
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Alert.INSTANCE, null, null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_error_message, composer, 0), null, null, composer, 6, 110);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1219650064$tax_and_document_center_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20364getLambda$1219650064$tax_and_document_center_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
