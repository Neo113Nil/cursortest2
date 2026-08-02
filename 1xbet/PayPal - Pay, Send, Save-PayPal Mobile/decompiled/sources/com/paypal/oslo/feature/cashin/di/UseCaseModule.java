package com.paypal.oslo.feature.cashin.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/di/UseCaseModule;", "", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCaseImpl;", "useCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCase;", "bindGetHasSeenLandingUseCase", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCaseImpl;)Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCase;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCaseImpl;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;", "bindSetHasSeenLandingUseCase", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCaseImpl;)Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCaseImpl;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "bindCheckLocationPermissionUseCase", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCaseImpl;)Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCaseImpl;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;", "bindCheckLocationEnabledUseCase", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCaseImpl;)Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public interface UseCaseModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase bindCheckLocationEnabledUseCase(com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl useCase);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase bindCheckLocationPermissionUseCase(com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl useCase);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase bindGetHasSeenLandingUseCase(com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl useCase);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase bindSetHasSeenLandingUseCase(com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl useCase);
}
