package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$AccountSummaryScreenKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.ComposableSingletons$AccountSummaryScreenKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.ComposableSingletons$AccountSummaryScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1936859176, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.ComposableSingletons$AccountSummaryScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.ComposableSingletons$AccountSummaryScreenKt.$r8$lambda$NcF7GcziZVNHlNAcZmfgDroEpUI((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$NcF7GcziZVNHlNAcZmfgDroEpUI(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1936859176, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.ComposableSingletons$AccountSummaryScreenKt.lambda$1936859176.<anonymous> (AccountSummaryScreen.kt:570)");
            }
            com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_banner_past_due_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_debt_collection_notice, composer, 0), (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, composer, 48, 113);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1936859176$revolvingcredit_servicing_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
