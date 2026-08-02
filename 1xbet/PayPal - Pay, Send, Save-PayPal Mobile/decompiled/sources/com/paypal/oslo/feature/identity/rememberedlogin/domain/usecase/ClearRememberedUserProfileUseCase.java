package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/ClearRememberedUserProfileUseCase;", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "repository", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "deviceAuthPreferenceStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClearRememberedUserProfileUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ClearRememberedUserProfileUseCase(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthPreferenceStorage, "");
        this.getHighSpeedVideoFpsRangesFor = rememberedLoginRepository;
        this.getHighSpeedVideoSizes = deviceBindingTokenStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceAuthPreferenceStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r7.reset(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r7.clearAllBindingTokens(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r7.clearRememberedUserProfile(r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase$invoke$1 clearRememberedUserProfileUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase$invoke$1) {
            clearRememberedUserProfileUseCase$invoke$1 = (com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase$invoke$1) continuation;
            if ((clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = clearRememberedUserProfileUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository = this.getHighSpeedVideoFpsRangesFor;
                    clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                    clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 3;
                }
                com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoSizes;
                clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        clearRememberedUserProfileUseCase$invoke$1 = new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = clearRememberedUserProfileUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage2 = this.getHighSpeedVideoSizes;
        clearRememberedUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
    }
}
