package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

/* loaded from: classes14.dex */
public final class PlainTextRenderer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer_Factory();

        private InstanceHolder() {
        }
    }
}
