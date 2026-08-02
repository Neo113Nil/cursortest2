package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

/* loaded from: classes14.dex */
public final class QuickStartPromptRenderer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer_Factory();

        private InstanceHolder() {
        }
    }
}
