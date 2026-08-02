package com.paypal.oslo.feature.controlcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class GetTabContentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider>> Camera2StreamConfigurationMap;

    private GetTabContentUseCase_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider>> provider) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase newInstance(java.util.Set<com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider> set) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase(set);
    }
}
