package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/CategoryCardCarouselRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCardCarousel;", "<init>", "()V", "content", "Lcom/paypal/oslo/feature/searchandintelligence/ui/analytics/categorycard/CategoryCardModuleAnalyticsConfig;", "provideAnalyticsConfig", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCardCarousel;)Lcom/paypal/oslo/feature/searchandintelligence/ui/analytics/categorycard/CategoryCardModuleAnalyticsConfig;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Render", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCardCarousel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CategoryCardCarouselRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel.class);

    @javax.inject.Inject
    public CategoryCardCarouselRenderer() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel> getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final com.paypal.oslo.feature.searchandintelligence.ui.analytics.categorycard.CategoryCardModuleAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.analytics.categorycard.CategoryCardModuleAnalyticsConfig.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel categoryCardCarousel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCardCarousel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1873783875);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1873783875, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardCarouselRenderer.Render (CategoryCardCarouselRenderer.kt:47)");
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
        com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel categoryCardViewModel = (com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        boolean changedInstance = composer.changedInstance(categoryCardViewModel);
        com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardCarouselRenderer$Render$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardCarouselRenderer$Render$1$1(categoryCardViewModel);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.CategoryCardCarouselComponent(categoryCardCarousel, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), modifier, composer, (i & 14) | ((i << 3) & 896), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
