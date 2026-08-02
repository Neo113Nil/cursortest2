package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli;

/* loaded from: classes14.dex */
public final class RequestCreditLineIncreaseUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository> getHighResolutionOutputSizeshNQ4ISI;

    private RequestCreditLineIncreaseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository cLIApplicationRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase(cLIApplicationRepository);
    }
}
