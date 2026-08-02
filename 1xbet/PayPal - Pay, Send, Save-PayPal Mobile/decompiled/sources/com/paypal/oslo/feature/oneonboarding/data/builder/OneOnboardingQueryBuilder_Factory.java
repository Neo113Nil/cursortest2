package com.paypal.oslo.feature.oneonboarding.data.builder;

/* loaded from: classes13.dex */
public final class OneOnboardingQueryBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder> {
    private final dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>>> Camera2StreamConfigurationMap;

    private OneOnboardingQueryBuilder_Factory(dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder_Factory create(dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>>> provider) {
        return new com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder newInstance(java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>> map) {
        return new com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder(map);
    }
}
