package com.paypal.oslo.feature.identity.shared.data.mapper;

/* loaded from: classes13.dex */
public final class GraphQLErrorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> Camera2StreamConfigurationMap;

    private GraphQLErrorMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider) {
        return new com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper newInstance(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper(stringProvider);
    }
}
