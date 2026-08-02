package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

/* loaded from: classes14.dex */
public final class UiComponentRendererRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>>> getHighSpeedVideoSizes;

    private UiComponentRendererRegistry_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>>> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>>> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry newInstance(java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> set) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry(set);
    }
}
