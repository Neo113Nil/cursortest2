package com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext;

/* loaded from: classes13.dex */
public final class MarkdownTextRenderer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager> getHighSpeedVideoSizes;

    private MarkdownTextRenderer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager> provider) {
        return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer_Factory(provider);
    }

    public static com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer newInstance(com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager linkManager) {
        return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer(linkManager);
    }
}
