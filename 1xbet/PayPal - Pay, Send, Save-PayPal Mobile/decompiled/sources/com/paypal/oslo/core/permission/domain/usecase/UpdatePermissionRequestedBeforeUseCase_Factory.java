package com.paypal.oslo.core.permission.domain.usecase;

/* loaded from: classes10.dex */
public final class UpdatePermissionRequestedBeforeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UpdatePermissionRequestedBeforeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.permission.domain.repository.PermissionRepository> provider) {
        return new com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase newInstance(com.paypal.oslo.core.permission.domain.repository.PermissionRepository permissionRepository) {
        return new com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase(permissionRepository);
    }
}
