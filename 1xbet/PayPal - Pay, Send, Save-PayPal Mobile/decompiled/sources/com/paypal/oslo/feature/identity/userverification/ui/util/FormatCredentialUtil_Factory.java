package com.paypal.oslo.feature.identity.userverification.ui.util;

/* loaded from: classes13.dex */
public final class FormatCredentialUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> Camera2StreamConfigurationMap;

    private FormatCredentialUtil_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider) {
        return new com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase) {
        return new com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil(formatAsTypedUseCase);
    }
}
