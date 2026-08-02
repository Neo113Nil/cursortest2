package com.paypal.oslo.feature.identity.llslogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0086B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;", "", "Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;", "eligibilityRepository", "Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;", "nonBiometricKeyWrapper", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "loginUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "base64Encoder", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "authKeyOperations", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "identityAnalyticsTracker", "<init>", "(Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/llslogin/domain/model/LLSLoginError;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;", "Camera2StreamConfigurationMap", "getInputFormats", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LLSLoginUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.Base64Encoder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public LLSLoginUseCase(com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository lLSEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper nonBiometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations authKeyOperations, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSEligibilityRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonBiometricKeyWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authKeyOperations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityAnalyticsTracker, "");
        this.getHighSpeedVideoFpsRanges = lLSEligibilityRepository;
        this.Camera2StreamConfigurationMap = nonBiometricKeyWrapper;
        this.getHighSpeedVideoSizes = deviceBindingTokenStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = loginUseCase;
        this.getHighSpeedVideoFpsRangesFor = base64Encoder;
        this.getOutputMinFrameDuration = authKeyOperations;
        this.getInputFormats = identityAnalyticsTracker;
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00f2: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:124:0x00f2 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00f5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:122:0x00f5 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x035b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:93:0x035b */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x035f: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:91:0x035f */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137 A[Catch: all -> 0x0372, RaiseCancellationException -> 0x037d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {RaiseCancellationException -> 0x037d, all -> 0x0372, blocks: (B:104:0x00ee, B:105:0x0128, B:108:0x0137, B:109:0x015f, B:114:0x0152, B:115:0x036a, B:116:0x036f, B:118:0x0101), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0217 A[Catch: all -> 0x00a5, RaiseCancellationException -> 0x00a8, TryCatch #7 {RaiseCancellationException -> 0x00a8, all -> 0x00a5, blocks: (B:32:0x0098, B:34:0x020d, B:36:0x0217, B:38:0x0240, B:41:0x026e, B:42:0x028b, B:50:0x02e6, B:53:0x02f2, B:54:0x02f7, B:57:0x0308, B:58:0x0330, B:62:0x0323, B:63:0x0341, B:64:0x0346, B:67:0x0347, B:68:0x034c), top: B:31:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1 A[Catch: all -> 0x0362, RaiseCancellationException -> 0x0366, TRY_LEAVE, TryCatch #9 {RaiseCancellationException -> 0x0366, all -> 0x0362, blocks: (B:76:0x019d, B:79:0x01a1), top: B:75:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError, ? extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult>> continuation) {
        com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase$invoke$1 lLSLoginUseCase$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.Raise raise;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Pair<java.lang.String, java.lang.String>> generateNonceAndSignature;
        arrow.core.Either right;
        java.lang.Object bindingToken;
        java.lang.String str;
        int i6;
        int i7;
        arrow.core.raise.Raise raise2;
        int i8;
        int i9;
        java.lang.String str2;
        java.lang.String str3;
        arrow.core.raise.DefaultRaise defaultRaise6;
        arrow.core.raise.DefaultRaise defaultRaise7;
        java.lang.String encode;
        com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest userPreviewLoginRequest;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        arrow.core.raise.Raise raise3;
        int i10;
        arrow.core.Either.Right right2;
        arrow.core.Either right3;
        int i11;
        int i12;
        arrow.core.raise.DefaultRaise defaultRaise8;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase$invoke$1) {
                lLSLoginUseCase$invoke$1 = (com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase$invoke$1) continuation;
                if ((lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = lLSLoginUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise5 = defaultRaise4;
                        this.getInputFormats.trackLoginInitiated();
                        com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository lLSEligibilityRepository = this.getHighSpeedVideoFpsRanges;
                        lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise4;
                        lLSLoginUseCase$invoke$1.getInputFormats = defaultRaise5;
                        lLSLoginUseCase$invoke$1.getOutputFormats = defaultRaise5;
                        lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                        obj = lLSEligibilityRepository.isEligibleForLogin(lLSLoginUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            raise = defaultRaise5;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        i2 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        i3 = lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                        i4 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        i5 = lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                        defaultRaise5 = (arrow.core.raise.Raise) lLSLoginUseCase$invoke$1.getOutputFormats;
                        raise = (arrow.core.raise.Raise) lLSLoginUseCase$invoke$1.getInputFormats;
                        defaultRaise4 = (arrow.core.raise.DefaultRaise) lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i13 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i14 = lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i15 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i16 = lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                                raise3 = (arrow.core.raise.Raise) lLSLoginUseCase$invoke$1.getInputFormats;
                                defaultRaise8 = (arrow.core.raise.DefaultRaise) lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    raise3.raise(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.DeviceNotBound.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise2 = defaultRaise8;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise2 = defaultRaise8;
                                    defaultRaise2.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            int i17 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            i6 = lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                            i8 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            i10 = lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                            userPreviewLoginRequest = (com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest) lLSLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                            encode = (java.lang.String) lLSLoginUseCase$invoke$1.getInputSizeshNQ4ISI;
                            java.lang.String str7 = (java.lang.String) lLSLoginUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            str = (java.lang.String) lLSLoginUseCase$invoke$1.getOutputMinFrameDuration;
                            str2 = (java.lang.String) lLSLoginUseCase$invoke$1.getOutputFormats;
                            arrow.core.raise.Raise raise4 = (arrow.core.raise.Raise) lLSLoginUseCase$invoke$1.getInputFormats;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                str4 = com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper.LLS_KEY_ALIAS;
                                str5 = "";
                                str6 = str7;
                                raise3 = raise4;
                                i7 = i17;
                                right2 = (arrow.core.Either) obj;
                                if (!(right2.leftOrNull() instanceof com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound)) {
                                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Clearing LLS device binding due to server-reported unbound state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authMethod", "lls")), null, 4, null);
                                    java.lang.String str8 = str4;
                                    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Unit> deleteKey = this.getOutputMinFrameDuration.deleteKey(str8);
                                    if (deleteKey.isLeft()) {
                                        com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) deleteKey).getValue();
                                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                                        java.lang.Throwable rootCause = com.paypal.oslo.feature.identity.foundation.security.AuthSecurityErrorExtensionsKt.getRootCause(authSecurityError);
                                        i11 = i7;
                                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                                        i12 = i6;
                                        pairArr[0] = kotlin.TuplesKt.to("keyAlias", str8);
                                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSecurityError.getClass()).getSimpleName();
                                        if (simpleName == null) {
                                            simpleName = str5;
                                        }
                                        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
                                        com.paypal.android.logger.Logger.e$default(logger, "Failed to delete LLS key during device-not-bound cleanup", kotlin.collections.MapsKt.mapOf(pairArr), null, rootCause, 4, null);
                                    } else {
                                        i11 = i7;
                                        i12 = i6;
                                    }
                                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
                                    lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise2;
                                    lLSLoginUseCase$invoke$1.getInputFormats = raise3;
                                    lLSLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    lLSLoginUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                    lLSLoginUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encode);
                                    lLSLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userPreviewLoginRequest);
                                    lLSLoginUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right2);
                                    lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i10;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i8;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes = i12;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i11;
                                    lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 4;
                                    if (deviceBindingTokenStorage.clearBindingToken(deviceAuthMethod, lLSLoginUseCase$invoke$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultRaise8 = defaultRaise2;
                                    raise3.raise(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.DeviceNotBound.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                if (right2 instanceof arrow.core.Either.Right) {
                                    com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) right2).getValue();
                                    if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                                        this.getInputFormats.trackLoginSuccess();
                                    }
                                    right2 = new arrow.core.Either.Right(loginResult);
                                } else if (!(right2 instanceof arrow.core.Either.Left)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                if (right2 instanceof arrow.core.Either.Left) {
                                    right3 = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.AuthenticationFailed("Login authentication failed"));
                                } else {
                                    if (!(right2 instanceof arrow.core.Either.Right)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    right3 = new arrow.core.Either.Right(((arrow.core.Either.Right) right2).getValue());
                                }
                                com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult2 = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) raise3.bind(right3);
                                defaultRaise2.complete();
                                return new arrow.core.Either.Right(loginResult2);
                            } catch (arrow.core.raise.RaiseCancellationException e2) {
                                e = e2;
                                defaultRaise2.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                defaultRaise2.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        int i18 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i19 = lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i20 = lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i21 = lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                        java.lang.String str9 = (java.lang.String) lLSLoginUseCase$invoke$1.getOutputMinFrameDuration;
                        java.lang.String str10 = (java.lang.String) lLSLoginUseCase$invoke$1.getOutputFormats;
                        raise2 = (arrow.core.raise.Raise) lLSLoginUseCase$invoke$1.getInputFormats;
                        arrow.core.raise.DefaultRaise defaultRaise9 = (arrow.core.raise.DefaultRaise) lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i6 = i19;
                            i7 = i18;
                            defaultRaise2 = defaultRaise9;
                            i8 = i20;
                            str = str9;
                            i9 = i21;
                            str2 = str10;
                            try {
                                str3 = (java.lang.String) obj;
                                try {
                                    if (str3 != null) {
                                        raise2.raise(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.NotEligible.INSTANCE);
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                    encode = this.getHighSpeedVideoFpsRangesFor.encode(str);
                                    java.util.UUID randomUUID = java.util.UUID.randomUUID();
                                    str4 = com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper.LLS_KEY_ALIAS;
                                    java.lang.String obj2 = randomUUID.toString();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                                    userPreviewLoginRequest = new com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest(obj2, str2, encode, str3, null, false, 48, null);
                                    com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                                    str5 = "";
                                    com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest userPreviewLoginRequest2 = userPreviewLoginRequest;
                                    lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise2;
                                    lLSLoginUseCase$invoke$1.getInputFormats = raise2;
                                    arrow.core.raise.DefaultRaise defaultRaise10 = defaultRaise2;
                                    lLSLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    lLSLoginUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                    lLSLoginUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encode);
                                    lLSLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userPreviewLoginRequest);
                                    lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i8;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes = i6;
                                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i7;
                                    lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                                    java.lang.Object invoke = loginUseCase.invoke(userPreviewLoginRequest2, lLSLoginUseCase$invoke$1);
                                    if (invoke != coroutine_suspended) {
                                        str6 = str3;
                                        obj = invoke;
                                        raise3 = raise2;
                                        defaultRaise2 = defaultRaise10;
                                        i10 = i9;
                                        right2 = (arrow.core.Either) obj;
                                        if (!(right2.leftOrNull() instanceof com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound)) {
                                        }
                                    }
                                    return coroutine_suspended;
                                } catch (arrow.core.raise.RaiseCancellationException e3) {
                                    e = e3;
                                    defaultRaise2 = defaultRaise7;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    defaultRaise2 = defaultRaise6;
                                    defaultRaise2.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            } catch (arrow.core.raise.RaiseCancellationException e4) {
                                e = e4;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e5) {
                            e = e5;
                            defaultRaise2 = defaultRaise9;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            defaultRaise2 = defaultRaise9;
                            defaultRaise2.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    defaultRaise5.bind((arrow.core.Either) obj);
                    generateNonceAndSignature = this.Camera2StreamConfigurationMap.generateNonceAndSignature();
                    if (!(generateNonceAndSignature instanceof arrow.core.Either.Left)) {
                        right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.AuthenticationFailed("Failed to sign nonce"));
                    } else {
                        if (!(generateNonceAndSignature instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) generateNonceAndSignature).getValue());
                    }
                    kotlin.Pair pair = (kotlin.Pair) raise.bind(right);
                    java.lang.String str11 = (java.lang.String) pair.component1();
                    java.lang.String str12 = (java.lang.String) pair.component2();
                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage2 = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod2 = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
                    lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise4;
                    lLSLoginUseCase$invoke$1.getInputFormats = raise;
                    lLSLoginUseCase$invoke$1.getOutputFormats = str11;
                    lLSLoginUseCase$invoke$1.getOutputMinFrameDuration = str12;
                    lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i5;
                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i4;
                    lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes = i3;
                    lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                    bindingToken = deviceBindingTokenStorage2.getBindingToken(deviceAuthMethod2, lLSLoginUseCase$invoke$1);
                    if (bindingToken != coroutine_suspended) {
                        int i22 = i4;
                        str = str12;
                        obj = bindingToken;
                        i6 = i3;
                        i7 = i2;
                        defaultRaise2 = defaultRaise4;
                        raise2 = raise;
                        i8 = i22;
                        i9 = i5;
                        str2 = str11;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            defaultRaise5.bind((arrow.core.Either) obj);
            generateNonceAndSignature = this.Camera2StreamConfigurationMap.generateNonceAndSignature();
            if (!(generateNonceAndSignature instanceof arrow.core.Either.Left)) {
            }
            kotlin.Pair pair2 = (kotlin.Pair) raise.bind(right);
            java.lang.String str112 = (java.lang.String) pair2.component1();
            java.lang.String str122 = (java.lang.String) pair2.component2();
            com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage22 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod22 = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
            lLSLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise4;
            lLSLoginUseCase$invoke$1.getInputFormats = raise;
            lLSLoginUseCase$invoke$1.getOutputFormats = str112;
            lLSLoginUseCase$invoke$1.getOutputMinFrameDuration = str122;
            lLSLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i5;
            lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i4;
            lLSLoginUseCase$invoke$1.getHighSpeedVideoSizes = i3;
            lLSLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
            lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
            bindingToken = deviceBindingTokenStorage22.getBindingToken(deviceAuthMethod22, lLSLoginUseCase$invoke$1);
            if (bindingToken != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e6) {
            e = e6;
            defaultRaise2 = defaultRaise3;
        } catch (java.lang.Throwable th6) {
            th = th6;
            defaultRaise2 = defaultRaise;
        }
        lLSLoginUseCase$invoke$1 = new com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = lLSLoginUseCase$invoke$1.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lLSLoginUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }
}
