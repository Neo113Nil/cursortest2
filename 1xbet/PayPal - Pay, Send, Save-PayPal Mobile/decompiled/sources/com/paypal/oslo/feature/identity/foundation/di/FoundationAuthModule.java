package com.paypal.oslo.feature.identity.foundation.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/di/FoundationAuthModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;", "hasRememberedUserUseCase", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/identity/logout/domain/usecase/LogoutUseCase;", "logoutUseCase", "Lcom/paypal/oslo/feature/identity/foundation/IdentitySessionImpl;", "provideIdentitySession", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;Ldagger/Lazy;)Lcom/paypal/oslo/feature/identity/foundation/IdentitySessionImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class FoundationAuthModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule INSTANCE = new com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule();

    private FoundationAuthModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl provideIdentitySession(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage tokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase hasRememberedUserUseCase, dagger.Lazy<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> logoutUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutUseCase, "");
        return new com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl(tokenStorage, deviceBindingTokenStorage, hasRememberedUserUseCase, logoutUseCase);
    }
}
