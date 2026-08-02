package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetCLIManageDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository> getHighSpeedVideoSizes;

    private GetCLIManageDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository cLIRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase(cLIRepository);
    }
}
