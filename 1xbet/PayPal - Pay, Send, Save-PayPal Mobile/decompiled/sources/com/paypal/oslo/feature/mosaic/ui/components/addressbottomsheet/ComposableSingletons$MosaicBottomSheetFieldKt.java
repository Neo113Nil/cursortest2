package com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$MosaicBottomSheetFieldKt {
    public static final com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(915156269, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt.$r8$lambda$GtBtL9oAw_6sMOfInp4orAm1Zj4((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$GtBtL9oAw_6sMOfInp4orAm1Zj4(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(915156269, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt.lambda$915156269.<anonymous> (MosaicBottomSheetField.kt:89)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronDown.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_open_selection_menu, composer, 0), null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27654, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$915156269$mosaic_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
