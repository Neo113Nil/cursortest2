package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SavingsHubDocumentZoneKt {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1760200499, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt.$r8$lambda$VoRMlE4NwOabrhUhGVZLtq3uQDs((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$VoRMlE4NwOabrhUhGVZLtq3uQDs(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1760200499, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt.lambda$1760200499.<anonymous> (SavingsHubDocumentZone.kt:108)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_documents_title, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 432, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1760200499$savings_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
