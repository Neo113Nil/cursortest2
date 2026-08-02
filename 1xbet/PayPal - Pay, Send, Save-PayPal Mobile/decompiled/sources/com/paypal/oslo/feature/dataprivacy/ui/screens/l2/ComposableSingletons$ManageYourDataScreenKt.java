package com.paypal.oslo.feature.dataprivacy.ui.screens.l2;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ManageYourDataScreenKt {
    public static final com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(934675850, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt.$r8$lambda$hV8Nlc7NOAgV2cnx4BwXgA04eBs((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$hV8Nlc7NOAgV2cnx4BwXgA04eBs(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(934675850, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt.lambda$934675850.<anonymous> (ManageYourDataScreen.kt:129)");
            }
            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_request_in_progress, composer, 0), null, com.paypal.pds.components.BadgeStyle.Info.INSTANCE, null, null, null, null, composer, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$934675850$data_privacy_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
