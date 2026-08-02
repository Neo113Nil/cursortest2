package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/UiComponentRendererModule;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "bindRenderers", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface UiComponentRendererModule {
    @dagger.multibindings.Multibinds
    java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> bindRenderers();
}
