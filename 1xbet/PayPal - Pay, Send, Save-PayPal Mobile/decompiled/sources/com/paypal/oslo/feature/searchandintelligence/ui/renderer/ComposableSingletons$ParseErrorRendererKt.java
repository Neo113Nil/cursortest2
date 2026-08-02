package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$ParseErrorRendererKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$ParseErrorRendererKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$ParseErrorRendererKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-835024781, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$ParseErrorRendererKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$ParseErrorRendererKt.$r8$lambda$KKjQo36e681DUR6zeEvOkqqLWM4((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$KKjQo36e681DUR6zeEvOkqqLWM4(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-835024781, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$ParseErrorRendererKt.lambda$-835024781.<anonymous> (ParseErrorRenderer.kt:46)");
            }
            com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.Render$default(com.paypal.oslo.feature.searchandintelligence.domain.model.ui.ParseError.INSTANCE, null, new com.paypal.oslo.feature.searchandintelligence.ui.renderer.ParseErrorRenderer(), composer, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-835024781$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19205getLambda$835024781$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
