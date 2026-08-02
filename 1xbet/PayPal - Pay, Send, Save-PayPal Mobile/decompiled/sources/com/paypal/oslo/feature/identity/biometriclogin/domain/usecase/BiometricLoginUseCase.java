package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010\"\u001a\u00020!*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;", "", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "eligibilityRepository", "Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "biometricKeyWrapper", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;", "biometricAuthenticator", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "loginUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "base64Encoder", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "authKeyOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "invoke", "(Landroidx/fragment/app/FragmentActivity;)Lkotlinx/coroutines/flow/Flow;", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "p0", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$SigningFailed;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$SigningFailed;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricLoginUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.Base64Encoder getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public BiometricLoginUseCase(com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository, com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper biometricKeyWrapper, com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator biometricAuthenticator, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations authKeyOperations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricEligibilityRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricKeyWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricAuthenticator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authKeyOperations, "");
        this.Camera2StreamConfigurationMap = biometricEligibilityRepository;
        this.getHighSpeedVideoSizes = biometricKeyWrapper;
        this.getHighResolutionOutputSizeshNQ4ISI = biometricAuthenticator;
        this.getHighSpeedVideoFpsRanges = deviceBindingTokenStorage;
        this.getHighSpeedVideoFpsRangesFor = loginUseCase;
        this.getInputSizeshNQ4ISI = base64Encoder;
        this.getOutputFormats = authKeyOperations;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0174, code lost:
    
        if (r19.getHighSpeedVideoFpsRangesFor(r3) == r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$verifyWithServer(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, java.security.Signature signature, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$verifyWithServer$1 biometricLoginUseCase$verifyWithServer$1;
        int i;
        java.security.Signature signature2;
        arrow.core.Either right;
        java.lang.String str2;
        arrow.core.Either either;
        java.lang.String str3;
        java.security.Signature signature3;
        com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginRequest biometricLoginRequest;
        java.lang.String str4;
        java.lang.String str5;
        arrow.core.Either either2;
        java.lang.String str6 = str;
        if (continuation instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$verifyWithServer$1) {
            biometricLoginUseCase$verifyWithServer$1 = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$verifyWithServer$1) continuation;
            if ((biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = biometricLoginUseCase$verifyWithServer$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    signature2 = signature;
                    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> sign = biometricLoginUseCase.getHighSpeedVideoSizes.sign(signature2, str6);
                    if (sign instanceof arrow.core.Either.Left) {
                        right = new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) sign).getValue(), "Failed to sign nonce"));
                    } else {
                        if (!(sign instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) sign).getValue());
                    }
                    if (!(right instanceof arrow.core.Either.Right)) {
                        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed((com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError) ((arrow.core.Either.Left) right).getValue());
                    }
                    java.lang.String str7 = (java.lang.String) ((arrow.core.Either.Right) right).getValue();
                    biometricLoginUseCase$verifyWithServer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizes = str6;
                    biometricLoginUseCase$verifyWithServer$1.Camera2StreamConfigurationMap = str7;
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = biometricLoginUseCase.getHighResolutionOutputSizeshNQ4ISI(biometricLoginUseCase$verifyWithServer$1);
                    if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        str2 = str7;
                        obj = highResolutionOutputSizeshNQ4ISI;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    java.lang.String str8 = (java.lang.String) biometricLoginUseCase$verifyWithServer$1.Camera2StreamConfigurationMap;
                    java.lang.String str9 = (java.lang.String) biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizes;
                    java.security.Signature signature4 = (java.security.Signature) biometricLoginUseCase$verifyWithServer$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str8;
                    str6 = str9;
                    signature2 = signature4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.DeviceNotBound.INSTANCE);
                    }
                    biometricLoginRequest = (com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginRequest) biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRanges;
                    str4 = (java.lang.String) biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRangesFor;
                    str5 = (java.lang.String) biometricLoginUseCase$verifyWithServer$1.Camera2StreamConfigurationMap;
                    str3 = (java.lang.String) biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizes;
                    signature3 = (java.security.Signature) biometricLoginUseCase$verifyWithServer$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    either2 = (arrow.core.Either) obj;
                    if (!(either2.leftOrNull() instanceof com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound)) {
                        biometricLoginUseCase$verifyWithServer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature3);
                        biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        biometricLoginUseCase$verifyWithServer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                        biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginRequest);
                        biometricLoginUseCase$verifyWithServer$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor = 3;
                    } else {
                        if (either2 instanceof arrow.core.Either.Right) {
                            return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed((com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) either2).getValue());
                        }
                        if (either2 instanceof arrow.core.Either.Left) {
                            return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed("Login failed"));
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String str10 = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginRequest biometricLoginRequest2 = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginRequest(obj2, str2, biometricLoginUseCase.getInputSizeshNQ4ISI.encode(str6), str10, null, false, 48, null);
                    biometricLoginUseCase$verifyWithServer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature2);
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    biometricLoginUseCase$verifyWithServer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginRequest2);
                    biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor = 2;
                    java.lang.Object invoke = biometricLoginUseCase.getHighSpeedVideoFpsRangesFor.invoke(biometricLoginRequest2, biometricLoginUseCase$verifyWithServer$1);
                    if (invoke != coroutine_suspended) {
                        str3 = str6;
                        signature3 = signature2;
                        biometricLoginRequest = biometricLoginRequest2;
                        str4 = str10;
                        obj = invoke;
                        str5 = str2;
                        either2 = (arrow.core.Either) obj;
                        if (!(either2.leftOrNull() instanceof com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound)) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed((com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        biometricLoginUseCase$verifyWithServer$1 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$verifyWithServer$1(biometricLoginUseCase, continuation);
        java.lang.Object obj3 = biometricLoginUseCase$verifyWithServer$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = biometricLoginUseCase$verifyWithServer$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState> invoke(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1(this, activity, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Clearing biometric device binding due to server-reported unbound state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authMethod", "biometric")), null, 4, null);
        arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Unit> deleteKey = this.getOutputFormats.deleteKey("deviceAuthBiometricAsymmetricKey");
        if (deleteKey.isLeft()) {
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) deleteKey).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            java.lang.Throwable rootCause = com.paypal.oslo.feature.identity.foundation.security.AuthSecurityErrorExtensionsKt.getRootCause(authSecurityError);
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("keyAlias", "deviceAuthBiometricAsymmetricKey");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSecurityError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, "Failed to delete biometric key during device-not-bound cleanup", kotlin.collections.MapsKt.mapOf(pairArr), null, rootCause, 4, null);
        }
        java.lang.Object clearBindingToken = this.getHighSpeedVideoFpsRanges.clearBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC, continuation);
        return clearBindingToken == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearBindingToken : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:10:0x0026, B:11:0x0042, B:13:0x0046, B:16:0x004b, B:21:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: Exception -> 0x005d, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:10:0x0026, B:11:0x0042, B:13:0x0046, B:16:0x004b, B:21:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$getBindToken$1 biometricLoginUseCase$getBindToken$1;
        int i;
        java.lang.String str;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$getBindToken$1) {
                biometricLoginUseCase$getBindToken$1 = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$getBindToken$1) continuation;
                if ((biometricLoginUseCase$getBindToken$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    biometricLoginUseCase$getBindToken$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = biometricLoginUseCase$getBindToken$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = biometricLoginUseCase$getBindToken$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC;
                        biometricLoginUseCase$getBindToken$1.getHighSpeedVideoFpsRanges = 1;
                        obj = deviceBindingTokenStorage.getBindingToken(deviceAuthMethod, biometricLoginUseCase$getBindToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    str = (java.lang.String) obj;
                    if (str == null) {
                        return arrow.core.EitherKt.right(str);
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Biometric bind token not found", null, null, 6, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible.INSTANCE);
                }
            }
            if (i != 0) {
            }
            str = (java.lang.String) obj;
            if (str == null) {
            }
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to retrieve biometric bind token", exc);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown("Failed to retrieve bind token", exc));
        }
        biometricLoginUseCase$getBindToken$1 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$getBindToken$1(this, continuation);
        java.lang.Object obj2 = biometricLoginUseCase$getBindToken$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = biometricLoginUseCase$getBindToken$1.getHighSpeedVideoFpsRanges;
    }

    private static com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError, java.lang.String str) {
        java.lang.String str2;
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) {
            str2 = ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) authSecurityError).getReason();
        } else if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) {
            str2 = ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) authSecurityError).getReason();
        } else if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) {
            str2 = ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) authSecurityError).getReason();
        } else {
            str2 = authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired ? "User authentication required" : com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed(sb.toString());
    }

    public static final /* synthetic */ arrow.core.Either access$createLockedSignature(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase) {
        arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.security.Signature> createLockedSignature = biometricLoginUseCase.getHighSpeedVideoSizes.createLockedSignature();
        if (createLockedSignature instanceof arrow.core.Either.Left) {
            return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) createLockedSignature).getValue(), "Failed to create signature"));
        }
        if (createLockedSignature instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) createLockedSignature).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
