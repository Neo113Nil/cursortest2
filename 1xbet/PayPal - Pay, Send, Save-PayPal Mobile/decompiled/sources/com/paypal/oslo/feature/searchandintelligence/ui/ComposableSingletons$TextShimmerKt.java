package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$TextShimmerKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-272279142, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt.m19154$r8$lambda$bjTVTvDvohA7PR5IKOaPqGQYE((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$bjT--VTvDvohA7PR5IKOaPqGQYE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19154$r8$lambda$bjTVTvDvohA7PR5IKOaPqGQYE(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-272279142, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt.lambda$-272279142.<anonymous> (TextShimmer.kt:106)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt.m19171TextShimmerY0xEhic(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_thinking, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), 0L, 0L, null, 0, composer, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-272279142$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19155getLambda$272279142$search_and_intelligence_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
