package com.paypal.oslo.feature.home.ui.components.deckcollection;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$DeckCardKt {
    public static final com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt INSTANCE = new com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.home.domain.model.DeckCardContent, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1138992186, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt.$r8$lambda$Sc0e6F21Yy2XsNNYO7K1fvlOA3Q((com.paypal.oslo.feature.home.domain.model.DeckCardContent) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$Sc0e6F21Yy2XsNNYO7K1fvlOA3Q(com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1138992186, i, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt.lambda$1138992186.<anonymous> (DeckCard.kt:259)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.ComposableSingletons$DeckCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.home.ui.components.deckcollection.DeckCardKt.DeckCard(deckCardContent, false, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, (i & 14) | 432, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.home.domain.model.DeckCardContent, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1138992186$home_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
