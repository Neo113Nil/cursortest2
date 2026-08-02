package com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$CategoryCardComponentKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2019065127, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt.$r8$lambda$oEP35MMQjGrl7sV4wkf0B8Vv5QY((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$oEP35MMQjGrl7sV4wkf0B8Vv5QY(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2019065127, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt.lambda$2019065127.<anonymous> (CategoryCardComponent.kt:105)");
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard = new com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard("Running Shoes", "https://example.com/shoes.jpg", (java.lang.String) null, (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt.CategoryCardComponent(categoryCard, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2019065127$search_and_intelligence_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
