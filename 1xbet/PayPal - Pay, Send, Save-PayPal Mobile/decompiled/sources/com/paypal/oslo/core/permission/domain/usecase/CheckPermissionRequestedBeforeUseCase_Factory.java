package com.paypal.oslo.core.permission.domain.usecase;

/* loaded from: classes10.dex */
public final class CheckPermissionRequestedBeforeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> getHighSpeedVideoFpsRanges;

    private CheckPermissionRequestedBeforeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> provider) {
        return new com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase newInstance(com.paypal.oslo.core.permission.domain.repository.PermissionRepository permissionRepository) {
        return new com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase(permissionRepository);
    }
}
