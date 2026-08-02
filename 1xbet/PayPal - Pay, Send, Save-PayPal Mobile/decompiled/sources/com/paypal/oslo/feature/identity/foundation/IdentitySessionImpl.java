package com.paypal.oslo.feature.identity.foundation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/IdentitySessionImpl;", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;", "hasRememberedUserUseCase", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/identity/logout/domain/usecase/LogoutUseCase;", "logoutUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;Ldagger/Lazy;)V", "", "unbindDevice", "", "logout", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentitySessionImpl implements com.paypal.oslo.feature.identity.api.IdentitySession {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.Lazy<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase getHighSpeedVideoSizes;

    public IdentitySessionImpl(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase hasRememberedUserUseCase, dagger.Lazy<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identityTokenStorage;
        this.Camera2StreamConfigurationMap = deviceBindingTokenStorage;
        this.getHighSpeedVideoSizes = hasRememberedUserUseCase;
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r8.clearBindingToken(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r8.clearUserAccessToken(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r8.invoke(r7, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.identity.api.IdentitySession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object logout(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl$logout$1 identitySessionImpl$logout$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl$logout$1) {
            identitySessionImpl$logout$1 = (com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl$logout$1) continuation;
            if ((identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = identitySessionImpl$logout$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase logoutUseCase = this.getHighSpeedVideoFpsRanges.get();
                    identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges = z;
                    identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor = 1;
                } else if (i == 1) {
                    z = identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    z = identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
                    identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges = z;
                    identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor = 3;
                }
                com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges = z;
                identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        identitySessionImpl$logout$1 = new com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl$logout$1(this, continuation);
        java.lang.Object obj2 = identitySessionImpl$logout$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage2 = this.getHighResolutionOutputSizeshNQ4ISI;
        identitySessionImpl$logout$1.getHighSpeedVideoFpsRanges = z;
        identitySessionImpl$logout$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentitySession
    public final java.lang.Object hasRememberedUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighSpeedVideoSizes.invoke(continuation);
    }
}
