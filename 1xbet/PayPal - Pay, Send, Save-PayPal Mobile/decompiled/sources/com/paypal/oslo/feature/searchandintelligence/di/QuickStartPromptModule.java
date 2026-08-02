package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/QuickStartPromptModule;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/deserializer/QuickStartPromptDeserializer;", "deserializer", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "bindQuickStartPromptDeserializer", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/deserializer/QuickStartPromptDeserializer;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/QuickStartPromptRenderer;", "renderer", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "bindQuickStartPromptRenderer", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/QuickStartPromptRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface QuickStartPromptModule {
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer.COMPONENT_NAME)
    com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer bindQuickStartPromptDeserializer(com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer deserializer);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindQuickStartPromptRenderer(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer renderer);
}
