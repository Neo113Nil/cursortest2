package com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/data/repository/PasskeyAssertionRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/repository/PasskeyAssertionRepository;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/data/datasource/PasskeyCredentialDataSource;", "passkeyCredentialDataSource", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/assertion/data/datasource/PasskeyCredentialDataSource;)V", "Landroid/content/Context;", "activityContext", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionRequest;", "passkeyAssertionRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionResult;", "getPasskeyCredentials", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/data/datasource/PasskeyCredentialDataSource;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyAssertionRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PasskeyAssertionRepositoryImpl(com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource passkeyCredentialDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialDataSource, "");
        this.getHighResolutionOutputSizeshNQ4ISI = passkeyCredentialDataSource;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:23|24))(8:25|26|(1:28)|29|(2:32|30)|33|34|(1:36))|12|(1:14)(2:18|(1:20)(2:21|22))|15|16))|47|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - security error", r11);
        r11 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - connection refused", r11);
        r11 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - timeout", r11);
        r11 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0142, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - cannot resolve host", r11);
        r11 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0157, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0158, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - serialization error", r11);
        r11 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[Catch: SecurityException -> 0x00ff, SocketTimeoutException -> 0x0115, ConnectException -> 0x012b, UnknownHostException -> 0x0141, SerializationException -> 0x0157, TryCatch #2 {SecurityException -> 0x00ff, ConnectException -> 0x012b, SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0141, SerializationException -> 0x0157, blocks: (B:11:0x0033, B:12:0x00cc, B:14:0x00d2, B:18:0x00e4, B:20:0x00e8, B:21:0x00f9, B:22:0x00fe, B:26:0x0043, B:28:0x0055, B:29:0x0059, B:30:0x006c, B:32:0x0072, B:34:0x0095), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4 A[Catch: SecurityException -> 0x00ff, SocketTimeoutException -> 0x0115, ConnectException -> 0x012b, UnknownHostException -> 0x0141, SerializationException -> 0x0157, TryCatch #2 {SecurityException -> 0x00ff, ConnectException -> 0x012b, SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0141, SerializationException -> 0x0157, blocks: (B:11:0x0033, B:12:0x00cc, B:14:0x00d2, B:18:0x00e4, B:20:0x00e8, B:21:0x00f9, B:22:0x00fe, B:26:0x0043, B:28:0x0055, B:29:0x0059, B:30:0x006c, B:32:0x0072, B:34:0x0095), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPasskeyCredentials(android.content.Context context, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest passkeyAssertionRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError, ? extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1 passkeyAssertionRepositoryImpl$getPasskeyCredentials$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult> left;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1) {
            passkeyAssertionRepositoryImpl$getPasskeyCredentials$1 = (com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1) continuation;
            if ((passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge = passkeyAssertionRequest.getPasskeyLoginCredentialChallenge();
                    java.lang.String encodedChallenge = passkeyAssertionRequest.getEncodedChallenge();
                    java.lang.String relyingPartyId = passkeyLoginCredentialChallenge.getRelyingPartyId();
                    java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> allowedCredentials = passkeyLoginCredentialChallenge.getAllowedCredentials();
                    if (allowedCredentials == null) {
                        allowedCredentials = kotlin.collections.CollectionsKt.emptyList();
                    }
                    java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> list = allowedCredentials;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential passkeyAllowedCredential : list) {
                        arrayList.add(new com.paypal.oslo.feature.identity.passkey.login.assertion.data.model.AllowedCredential(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallengeKt.toBase64Url(passkeyAllowedCredential.getId()), com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallengeKt.normalizeCredentialType(passkeyAllowedCredential.getType()), passkeyAllowedCredential.getTransports()));
                    }
                    com.paypal.oslo.feature.identity.passkey.login.assertion.data.model.WebAuthnRequest webAuthnRequest = new com.paypal.oslo.feature.identity.passkey.login.assertion.data.model.WebAuthnRequest(encodedChallenge, relyingPartyId, arrayList);
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    companion.getSerializersModule();
                    java.lang.String encodeToString = companion.encodeToString(com.paypal.oslo.feature.identity.passkey.login.assertion.data.model.WebAuthnRequest.INSTANCE.serializer(), webAuthnRequest);
                    com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource passkeyCredentialDataSource = this.getHighResolutionOutputSizeshNQ4ISI;
                    boolean preferImmediatelyAvailableCredentials = passkeyAssertionRequest.getPreferImmediatelyAvailableCredentials();
                    passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighSpeedVideoFpsRangesFor = passkeyAssertionRequest;
                    passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                    passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.Camera2StreamConfigurationMap = 1;
                    obj = passkeyCredentialDataSource.getPasskeyCredentialsFromManager(context, encodeToString, preferImmediatelyAvailableCredentials, passkeyAssertionRepositoryImpl$getPasskeyCredentials$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    passkeyAssertionRequest = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest) passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    left = com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionResponseMapperKt.toDomain((androidx.view.GetCredentialResponse) ((arrow.core.Either.Right) either).getValue(), passkeyAssertionRequest.getPasskeyLoginCredentialChallenge());
                } else if (either instanceof arrow.core.Either.Left) {
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper.PasskeyAssertionErrorMapperKt.toDomain((java.lang.Exception) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.ASSERTION, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiType.CREDENTIAL_API, left);
                return left;
            }
        }
        passkeyAssertionRepositoryImpl$getPasskeyCredentials$1 = new com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1(this, continuation);
        java.lang.Object obj2 = passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyAssertionRepositoryImpl$getPasskeyCredentials$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.ASSERTION, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiType.CREDENTIAL_API, left);
        return left;
    }
}
