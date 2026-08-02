package com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/productcard/ProductCardCarouselRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;", "<init>", "()V", "content", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "provideAnalyticsConfig", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;)Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Render", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCardCarouselRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.class);

    @javax.inject.Inject
    public ProductCardCarouselRenderer() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCardCarousel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1946659257);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1946659257, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselRenderer.Render (ProductCardCarouselRenderer.kt:58)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        final com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel productCardCarouselViewModel = (com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) productCardCarousel.getCards());
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType type = productCard != null ? com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardKt.type(productCard) : null;
        boolean changedInstance = composer.changedInstance(productCardCarouselViewModel);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselRenderer.$r8$lambda$YL1mqkdZIhwgEW_WFE7Mf0v6e98(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel.this, (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.ProductCardCarouselComponent(productCardCarousel, type, (kotlin.jvm.functions.Function1) rememberedValue, modifier, composer, (i & 14) | ((i << 6) & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YL1mqkdZIhwgEW_WFE7Mf0v6e98(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel productCardCarouselViewModel, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        productCardCarouselViewModel.onProductCardClick(productCard);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) content.getCards());
        com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.ProductCardCarouselModuleAnalyticsConfig productCardCarouselModuleAnalyticsConfig = null;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType type = productCard != null ? com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardKt.type(productCard) : null;
        if (type != null) {
            if (type == com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.GIFT_CARD) {
                productCardCarouselModuleAnalyticsConfig = com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.GiftCardCarouselModuleAnalyticsConfig.INSTANCE;
            } else {
                productCardCarouselModuleAnalyticsConfig = com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.ProductCardCarouselModuleAnalyticsConfig.INSTANCE;
            }
        }
        return productCardCarouselModuleAnalyticsConfig;
    }
}
