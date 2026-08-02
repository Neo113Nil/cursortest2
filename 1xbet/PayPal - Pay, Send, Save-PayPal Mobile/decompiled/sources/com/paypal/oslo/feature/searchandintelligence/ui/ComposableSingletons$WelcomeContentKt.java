package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$WelcomeContentKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-538083432, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.$r8$lambda$A3Cu183n8RkemUS9qnevy6PfY0w((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(348195544, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.m19156$r8$lambda$HDSiPojU5xg7J_hx54nxFGnM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$2jvrcbt7aK5GhRJzCQd7gqQjxtE(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewRendererRegistry().get(kClass);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A3Cu183n8RkemUS9qnevy6PfY0w(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-538083432, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.lambda$-538083432.<anonymous> (WelcomeContent.kt:203)");
            }
            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> previewPrompts = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewPrompts();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.$r8$lambda$2jvrcbt7aK5GhRJzCQd7gqQjxtE((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.WelcomeContent(previewPrompts, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HDS-iPo-jU5xg7J_hx54n-xFGnM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19156$r8$lambda$HDSiPojU5xg7J_hx54nxFGnM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(348195544, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.lambda$348195544.<anonymous> (WelcomeContent.kt:202)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.core.navigation.scene.LocalL0VisibilityKt.getLocalL0Visibility().provides(java.lang.Boolean.TRUE), getHighSpeedVideoSizes, composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$348195544$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-538083432$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19157getLambda$538083432$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
