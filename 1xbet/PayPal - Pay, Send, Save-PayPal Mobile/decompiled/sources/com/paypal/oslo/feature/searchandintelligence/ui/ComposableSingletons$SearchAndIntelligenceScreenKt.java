package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SearchAndIntelligenceScreenKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2076847638, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.$r8$lambda$z6H0hZi52U3p2mR6bpma2nnTN7Q((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1222443834, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.m19150$r8$lambda$HIGymTF7Ac6QBVZLuE1WlgCSqQ((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(663777905, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.m19149$r8$lambda$8bkWoVqCM3FnDt5bcNaCo3ZssM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$-8bkWoVqCM3FnDt5bcNaCo3ZssM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19149$r8$lambda$8bkWoVqCM3FnDt5bcNaCo3ZssM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(663777905, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.lambda$663777905.<anonymous> (SearchAndIntelligenceScreen.kt:263)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState = new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewConversations(), true, null, false, 24, null);
            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> previewPrompts = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewPrompts();
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.$r8$lambda$gNTraPD3occ1iRF2b57QTdSSXlI((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.SearchAndIntelligenceScreenContent(chatUiState, rememberLazyListState, null, previewPrompts, (kotlin.jvm.functions.Function1) rememberedValue, null, null, composer, 24576, 100);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HIG-ymTF7Ac6QBVZLuE1WlgCSqQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19150$r8$lambda$HIGymTF7Ac6QBVZLuE1WlgCSqQ(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1222443834, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.lambda$-1222443834.<anonymous> (SearchAndIntelligenceScreen.kt:247)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState = new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewConversations(), false, null, false, 28, null);
            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> previewPrompts = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewPrompts();
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.$r8$lambda$zZlYpEBBLVhSZM4Nlico0xupgm4((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.SearchAndIntelligenceScreenContent(chatUiState, rememberLazyListState, null, previewPrompts, (kotlin.jvm.functions.Function1) rememberedValue, null, null, composer, 24576, 100);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U179xWNSZ6nPCBEwrtge0c--F3w, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer m19151$r8$lambda$U179xWNSZ6nPCBEwrtge0cF3w(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewRendererRegistry().get(kClass);
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$gNTraPD3occ1iRF2b57QTdSSXlI(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewRendererRegistry().get(kClass);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z6H0hZi52U3p2mR6bpma2nnTN7Q(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2076847638, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.lambda$2076847638.<anonymous> (SearchAndIntelligenceScreen.kt:234)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState = new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null);
            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> previewPrompts = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewPrompts();
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.m19151$r8$lambda$U179xWNSZ6nPCBEwrtge0cF3w((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.SearchAndIntelligenceScreenContent(chatUiState, rememberLazyListState, null, previewPrompts, (kotlin.jvm.functions.Function1) rememberedValue, null, null, composer, 24576, 100);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$zZlYpEBBLVhSZM4Nlico0xupgm4(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewRendererRegistry().get(kClass);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$663777905$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2076847638$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1222443834$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19152getLambda$1222443834$search_and_intelligence_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
