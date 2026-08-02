package com.paypal.oslo.feature.searchandintelligence.ui.component.productcard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$ProductCardCarouselComponentKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-675808214, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt.$r8$lambda$x_1QlH0jsHs1DWuQYBhGriD0d50((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qce8UOQmpv3wjyGizbBtCErIlVE(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x_1QlH0jsHs1DWuQYBhGriD0d50(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-675808214, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt.lambda$-675808214.<anonymous> (ProductCardCarouselComponent.kt:85)");
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel previewProductCardCarousel = com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewProductCardCarousel();
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType = com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.PRODUCT;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt.$r8$lambda$Qce8UOQmpv3wjyGizbBtCErIlVE((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.ProductCardCarouselComponent(previewProductCardCarousel, commerceItemType, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-675808214$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19179getLambda$675808214$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
