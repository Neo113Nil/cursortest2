package com.paypal.oslo.feature.activity.ui.ledger.view.compose.options;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt {
    public static final com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2088250784, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt.m11889$r8$lambda$3b1MnTUmBnS70_FMqVyrMb6pM4((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$-3b1MnTUmBnS70_FMqVyrMb6pM4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11889$r8$lambda$3b1MnTUmBnS70_FMqVyrMb6pM4(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2088250784, i, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ComposableSingletons$ActivityLedgerFilterMenuContentComposeKt.lambda$2088250784.<anonymous> (ActivityLedgerFilterMenuContentCompose.kt:267)");
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerFilterMenuContentComposeKt.DropdownItemContent(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_by_date, composer, 0), true, composer, 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2088250784$activity_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
