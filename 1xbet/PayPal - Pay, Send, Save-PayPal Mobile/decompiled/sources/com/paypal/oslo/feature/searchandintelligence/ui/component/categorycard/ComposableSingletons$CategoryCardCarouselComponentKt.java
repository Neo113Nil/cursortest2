package com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$CategoryCardCarouselComponentKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(593061415, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt.$r8$lambda$rB1o_APSYBUsKMHV5eaGIYfpm_c((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$rB1o_APSYBUsKMHV5eaGIYfpm_c(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(593061415, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt.lambda$593061415.<anonymous> (CategoryCardCarouselComponent.kt:72)");
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel previewCategoryCardCarousel = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewCategoryCardCarousel();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt.$r8$lambda$xQpArRDGGtQY8CYA41tshgTUk2w((com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.CategoryCardCarouselComponent(previewCategoryCardCarousel, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xQpArRDGGtQY8CYA41tshgTUk2w(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$593061415$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
