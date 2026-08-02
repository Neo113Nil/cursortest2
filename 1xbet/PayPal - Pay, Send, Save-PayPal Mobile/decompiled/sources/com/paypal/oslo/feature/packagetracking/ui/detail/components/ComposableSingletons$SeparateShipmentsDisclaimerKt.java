package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$SeparateShipmentsDisclaimerKt {
    public static final com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-37027012, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt.$r8$lambda$8wOrhNAJbKtZAsmz098ktuGhQeo((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$8wOrhNAJbKtZAsmz098ktuGhQeo(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-37027012, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt.lambda$-37027012.<anonymous> (SeparateShipmentsDisclaimer.kt:44)");
            }
            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_separate_shipments_message, composer, 0), null, com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, composer, com.paypal.pds.components.ContextualAlertStyle.Neutral.$stable << 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-37027012$package_tracking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17543getLambda$37027012$package_tracking_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
