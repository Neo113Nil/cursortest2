package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/CategoryCardCarouselModule;", "", "Lcom/paypal/oslo/feature/searchandintelligence/data/model/categorycard/CategoryCardCarouselDeserializer;", "deserializer", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "bindCategoryCarouselDeserializer", "(Lcom/paypal/oslo/feature/searchandintelligence/data/model/categorycard/CategoryCardCarouselDeserializer;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/CategoryCardCarouselRenderer;", "renderer", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "bindCategoryCardCarouselRenderer", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/CategoryCardCarouselRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/data/model/categorycard/SingleCategoryCardDeserializer;", "bindCloudCategoryCardDeserializer", "(Lcom/paypal/oslo/feature/searchandintelligence/data/model/categorycard/SingleCategoryCardDeserializer;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/SingleCategoryCardRenderer;", "bindSingleCategoryCardRenderer", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/SingleCategoryCardRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface CategoryCardCarouselModule {
    public static final java.lang.String CLOUD_CATEGORY_CAROUSEL_COMPONENT = "agentic_category_carousel_component";
    public static final java.lang.String CLOUD_CATEGORY_COMPONENT = "agentic_category_component";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.di.CategoryCardCarouselModule.Companion INSTANCE = com.paypal.oslo.feature.searchandintelligence.di.CategoryCardCarouselModule.Companion.getHighSpeedVideoSizes;

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindCategoryCardCarouselRenderer(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardCarouselRenderer renderer);

    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("agentic_category_carousel_component")
    com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer bindCategoryCarouselDeserializer(com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer deserializer);

    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("agentic_category_component")
    com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer bindCloudCategoryCardDeserializer(com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.SingleCategoryCardDeserializer deserializer);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindSingleCategoryCardRenderer(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRenderer renderer);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/CategoryCardCarouselModule$Companion;", "", "<init>", "()V", "", "CLOUD_CATEGORY_CAROUSEL_COMPONENT", "Ljava/lang/String;", "CLOUD_CATEGORY_COMPONENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String CLOUD_CATEGORY_CAROUSEL_COMPONENT = "agentic_category_carousel_component";
        public static final java.lang.String CLOUD_CATEGORY_COMPONENT = "agentic_category_component";
        static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.di.CategoryCardCarouselModule.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.searchandintelligence.di.CategoryCardCarouselModule.Companion();

        private Companion() {
        }
    }
}
