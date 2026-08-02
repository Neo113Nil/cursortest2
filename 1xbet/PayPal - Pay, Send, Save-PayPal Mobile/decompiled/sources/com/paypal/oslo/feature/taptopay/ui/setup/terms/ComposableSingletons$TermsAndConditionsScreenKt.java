package com.paypal.oslo.feature.taptopay.ui.setup.terms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$TermsAndConditionsScreenKt {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.terms.ComposableSingletons$TermsAndConditionsScreenKt INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.terms.ComposableSingletons$TermsAndConditionsScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-453986749, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.terms.ComposableSingletons$TermsAndConditionsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.taptopay.ui.setup.terms.ComposableSingletons$TermsAndConditionsScreenKt.$r8$lambda$0TfWcQOXY4CXYWnHbhZDGMMELsw((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$0TfWcQOXY4CXYWnHbhZDGMMELsw(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-453986749, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.terms.ComposableSingletons$TermsAndConditionsScreenKt.lambda$-453986749.<anonymous> (TermsAndConditionsScreen.kt:197)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_terms_and_conditions_title, composer, 0), null, null, null, null, null, false, 0, 0, null, null, composer, 0, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-453986749$taptopay_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20224getLambda$453986749$taptopay_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
