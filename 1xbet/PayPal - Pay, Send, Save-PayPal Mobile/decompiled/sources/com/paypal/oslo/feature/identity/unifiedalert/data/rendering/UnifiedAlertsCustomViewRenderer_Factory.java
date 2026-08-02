package com.paypal.oslo.feature.identity.unifiedalert.data.rendering;

/* loaded from: classes13.dex */
public final class UnifiedAlertsCustomViewRenderer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private UnifiedAlertsCustomViewRenderer_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer(context);
    }
}
