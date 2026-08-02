package com.paypal.oslo.feature.searchandintelligence.ui.preview;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/preview/PreviewProductCardCarouselRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;", "<init>", "()V", "content", "Landroidx/compose/ui/Modifier;", "modifier", "", "Render", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewProductCardCarouselRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.class);

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final /* bridge */ com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel) {
        return super.provideAnalyticsConfig((com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewProductCardCarouselRenderer) productCardCarousel);
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCardCarousel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(1064286326);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1064286326, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewProductCardCarouselRenderer.Render (PreviewUtils.kt:89)");
        }
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType = com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.PRODUCT;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewProductCardCarouselRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewProductCardCarouselRenderer.$r8$lambda$B0bZ_72mhEeAo38rDaYL_kmGIY0((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.ProductCardCarouselComponent(productCardCarousel, commerceItemType, (kotlin.jvm.functions.Function1) rememberedValue, modifier, composer, (i & 14) | 432 | ((i << 6) & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B0bZ_72mhEeAo38rDaYL_kmGIY0(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        return kotlin.Unit.INSTANCE;
    }
}
