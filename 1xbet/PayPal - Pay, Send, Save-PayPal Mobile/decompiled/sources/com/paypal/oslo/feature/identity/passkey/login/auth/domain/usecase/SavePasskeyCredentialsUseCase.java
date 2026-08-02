package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/usecase/SavePasskeyCredentialsUseCase;", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "rememberedLoginRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;)V", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "passkeyAssertionSuccess", "", "invoke", "(Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SavePasskeyCredentialsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SavePasskeyCredentialsUseCase(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginRepository, "");
        this.Camera2StreamConfigurationMap = rememberedLoginRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:21|(1:23))|13|14)|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to save allowed credentials: ".concat(java.lang.String.valueOf(r11.getMessage())), null, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to save allowed credentials: ".concat(java.lang.String.valueOf(r11.getMessage())), null, null, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase$invoke$1 savePasskeyCredentialsUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase$invoke$1) {
            savePasskeyCredentialsUseCase$invoke$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase$invoke$1) continuation;
            if ((savePasskeyCredentialsUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savePasskeyCredentialsUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savePasskeyCredentialsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savePasskeyCredentialsUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> allowedCredentials = passkeyAssertionSuccess.getPasskeyLoginCredentialChallenge().getAllowedCredentials();
                    if (allowedCredentials != null) {
                        com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository = this.Camera2StreamConfigurationMap;
                        savePasskeyCredentialsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAssertionSuccess);
                        savePasskeyCredentialsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(allowedCredentials);
                        savePasskeyCredentialsUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        savePasskeyCredentialsUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                        if (rememberedLoginRepository.updateAllowedCredentials(allowedCredentials, savePasskeyCredentialsUseCase$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = savePasskeyCredentialsUseCase$invoke$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
        }
        savePasskeyCredentialsUseCase$invoke$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = savePasskeyCredentialsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savePasskeyCredentialsUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
