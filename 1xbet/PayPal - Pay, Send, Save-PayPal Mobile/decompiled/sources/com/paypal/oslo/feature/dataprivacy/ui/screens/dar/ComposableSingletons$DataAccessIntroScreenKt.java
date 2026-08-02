package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$DataAccessIntroScreenKt {
    public static final com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessIntroScreenKt INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessIntroScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(786948803, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessIntroScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessIntroScreenKt.$r8$lambda$roLzA0xRvzPS0PRwCS8LoSDCDLg((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$roLzA0xRvzPS0PRwCS8LoSDCDLg(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(786948803, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessIntroScreenKt.lambda$786948803.<anonymous> (DataAccessIntroScreen.kt:143)");
            }
            com.paypal.pds.components.TimelineKt.Timeline(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.TimelineVerticalItem[]{com.paypal.pds.components.TimelineVerticalItem.Companion.invoke$default(com.paypal.pds.components.TimelineVerticalItem.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step1_title, composer, 0), com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step1_desc, composer, 0), null, 8, null), com.paypal.pds.components.TimelineVerticalItem.Companion.invoke$default(com.paypal.pds.components.TimelineVerticalItem.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step2_title, composer, 0), com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step2_desc, composer, 0), null, 8, null), com.paypal.pds.components.TimelineVerticalItem.Companion.invoke$default(com.paypal.pds.components.TimelineVerticalItem.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step3_title, composer, 0), com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_intro_step3_desc, composer, 0), null, 8, null)}), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), null, composer, com.paypal.pds.components.TimelineVerticalItem.$stable, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$786948803$data_privacy_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
