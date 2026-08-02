package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$QuickStartPromptRendererKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2080586395, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.$r8$lambda$f3OSPfLpSNpzIaXgOQ6TfKJQEr0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1593806001, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.$r8$lambda$V_JSUgEju0Bnm0PkvFOM1ywYWc0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$V_JSUgEju0Bnm0PkvFOM1ywYWc0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1593806001, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.lambda$-1593806001.<anonymous> (QuickStartPromptRenderer.kt:178)");
            }
            new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer().QuickStartPrompt$search_and_intelligence_prodRelease(new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt("Issue with a purchase", (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) null, (java.lang.String) null, com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.SHOPPING_BAG, "I have an issue with a purchase", (java.lang.String) null, 38, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f3OSPfLpSNpzIaXgOQ6TfKJQEr0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2080586395, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.lambda$-2080586395.<anonymous> (QuickStartPromptRenderer.kt:164)");
            }
            new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer().QuickStartPrompt$search_and_intelligence_prodRelease(new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt("Don't recognize activity", (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) null, "https://example.com/icon.png", (java.lang.String) null, "I don't recognize this activity", (java.lang.String) null, 42, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-2080586395$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19207getLambda$2080586395$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1593806001$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19206getLambda$1593806001$search_and_intelligence_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
