package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$InStorePaymentScreenKt {
    public static final com.paypal.oslo.feature.wallet.preferred.ui.inStore.ComposableSingletons$InStorePaymentScreenKt INSTANCE = new com.paypal.oslo.feature.wallet.preferred.ui.inStore.ComposableSingletons$InStorePaymentScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1782023377, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.inStore.ComposableSingletons$InStorePaymentScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.preferred.ui.inStore.ComposableSingletons$InStorePaymentScreenKt.$r8$lambda$7W0FEQL2y8j1tDTzW90yKLvBqrM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$7W0FEQL2y8j1tDTzW90yKLvBqrM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1782023377, i, -1, "com.paypal.oslo.feature.wallet.preferred.ui.inStore.ComposableSingletons$InStorePaymentScreenKt.lambda$1782023377.<anonymous> (InStorePaymentScreen.kt:206)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_payment_how_it_works_body_1, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_payment_how_it_works_description, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1782023377$wallet_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
