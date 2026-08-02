package com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$MosaicAddressItemKt {
    public static final com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicAddressItemKt INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicAddressItemKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1746113392, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicAddressItemKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicAddressItemKt.m15784$r8$lambda$YeoFrwUiu2Te0TAkrmkwBcv_RE((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$YeoFrwUiu2Te0TAkrmkwBcv_-RE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15784$r8$lambda$YeoFrwUiu2Te0TAkrmkwBcv_RE(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1746113392, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicAddressItemKt.lambda$1746113392.<anonymous> (MosaicAddressItem.kt:64)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_selected, composer, 0), null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27654, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1746113392$mosaic_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
