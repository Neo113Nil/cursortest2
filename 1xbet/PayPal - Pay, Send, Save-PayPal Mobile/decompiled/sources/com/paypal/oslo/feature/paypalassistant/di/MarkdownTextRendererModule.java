package com.paypal.oslo.feature.paypalassistant.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/di/MarkdownTextRendererModule;", "", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownTextRenderer;", "renderer", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "bindMarkdownTextRenderer", "(Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownTextRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface MarkdownTextRendererModule {
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindMarkdownTextRenderer(com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer renderer);
}
