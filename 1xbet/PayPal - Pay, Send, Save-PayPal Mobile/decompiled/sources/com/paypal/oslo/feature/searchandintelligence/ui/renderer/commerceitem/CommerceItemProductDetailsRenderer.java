package com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/commerceitem/CommerceItemProductDetailsRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/commerceitem/CommerceItemProductDetails;", "<init>", "()V", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "provideAnalyticsConfig", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "content", "Render", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/commerceitem/CommerceItemProductDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease", "productDetailData", "Lcom/paypal/oslo/feature/searchandintelligence/ui/component/productcard/ProductDetailData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommerceItemProductDetailsRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails> getHighSpeedVideoFpsRangesFor = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails.class);

    @javax.inject.Inject
    public CommerceItemProductDetailsRenderer() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails> getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        if (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardKt.type(content.getCard()) == com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.GIFT_CARD) {
            return com.paypal.oslo.feature.searchandintelligence.ui.analytics.productdetails.GiftCardDetailsModuleAnalyticsConfig.INSTANCE;
        }
        return com.paypal.oslo.feature.searchandintelligence.ui.analytics.productdetails.ProductDetailsModuleAnalyticsConfig.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails commerceItemProductDetails, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItemProductDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(243635210);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(243635210, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer.Render (CommerceItemProductDetailsRenderer.kt:69)");
        }
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) composer.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
        java.lang.String concat = "product_details_".concat(java.lang.String.valueOf(commerceItemProductDetails.getCard().getId()));
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel commerceItemProductDetailsViewModel = (com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel.class), current, concat, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        java.lang.String id = commerceItemProductDetails.getCard().getId();
        boolean changedInstance = composer.changedInstance(commerceItemProductDetailsViewModel);
        boolean changedInstance2 = composer.changedInstance(commerceItemProductDetails);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer$Render$1$1(commerceItemProductDetailsViewModel, commerceItemProductDetails, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(id, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 0);
        final com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData productDetailData = (com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(commerceItemProductDetailsViewModel.getProductDetailData$search_and_intelligence_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 0, 7).getValue();
        if (productDetailData == null) {
            composer.startReplaceGroup(-357314464);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-357314463);
            boolean changedInstance3 = composer.changedInstance(commerceItemProductDetailsViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer$Render$2$1$1(commerceItemProductDetailsViewModel);
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue2;
            boolean changedInstance4 = composer.changedInstance(productDetailData);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance4 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer.$r8$lambda$uf9JH0w7QGeO1fbgAVCWnbY7mZ4(com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailComponentKt.ProductDetailComponent(productDetailData, modifier, (kotlin.jvm.functions.Function0) rememberedValue3, (kotlin.jvm.functions.Function2) kFunction, null, composer, i & 112, 16);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* renamed from: $r8$lambda$1pk-3liUylJXBwFIIXpvymIDF60, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19214$r8$lambda$1pk3liUylJXBwFIIXpvymIDF60(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination(productCard.getStoreId(), productCard.getUrl(), productCard.getStoreName(), productCard.getStoreLogo(), (java.util.List) null, (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) null, 48, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uf9JH0w7QGeO1fbgAVCWnbY7mZ4(com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData productDetailData, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard card = productDetailData.getCard();
        if (card.getUrl().length() > 0) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsRenderer.m19214$r8$lambda$1pk3liUylJXBwFIIXpvymIDF60(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
