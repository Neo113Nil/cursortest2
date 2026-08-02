package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$PlainTextRendererKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$PlainTextRendererKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$PlainTextRendererKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1579489269, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$PlainTextRendererKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$PlainTextRendererKt.$r8$lambda$uXvxFataULzUmfi0kn0XQmsr2p8((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$uXvxFataULzUmfi0kn0XQmsr2p8(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1579489269, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$PlainTextRendererKt.lambda$1579489269.<anonymous> (PlainTextRenderer.kt:48)");
            }
            com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.Render$default(new com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText("This is plain text content from the backend response."), null, new com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer(), composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1579489269$search_and_intelligence_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
