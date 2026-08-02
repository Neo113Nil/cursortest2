package com.paypal.oslo.core.permission.ui.viewmodel;

/* loaded from: classes10.dex */
public final class PermissionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase> getHighSpeedVideoSizes;

    private PermissionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase> provider2) {
        return new com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel newInstance(com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase checkPermissionRequestedBeforeUseCase, com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase updatePermissionRequestedBeforeUseCase) {
        return new com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel(checkPermissionRequestedBeforeUseCase, updatePermissionRequestedBeforeUseCase);
    }
}
