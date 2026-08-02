package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$TaxInputDropDownWidgetKt {
    public static final com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-370128542, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt.$r8$lambda$SMRdVC_58tfFxzmpbkujY2XA0iQ((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$SMRdVC_58tfFxzmpbkujY2XA0iQ(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-370128542, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt.lambda$-370128542.<anonymous> (TaxInputDropDownWidget.kt:164)");
            }
            com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.MosaicTextLabel(new com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel("tax_input_info_description", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_info_sheet_description, composer, 0), "BODY", null, "MEDIUM", null, null, null, null, 488, null), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-370128542$mosaic_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15800getLambda$370128542$mosaic_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
