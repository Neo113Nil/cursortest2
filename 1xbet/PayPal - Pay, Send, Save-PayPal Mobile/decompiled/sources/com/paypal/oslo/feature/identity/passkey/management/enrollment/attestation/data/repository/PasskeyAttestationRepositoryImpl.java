package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/repository/PasskeyAttestationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/repository/PasskeyAttestationRepository;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/datasource/PasskeyAttestationDataSource;", "passkeyAttestationDataSource", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/datasource/PasskeyAttestationDataSource;)V", "Landroid/content/Context;", "activityContext", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationRequest;", "passkeyAttestationRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationResult;", "createPasskeyAttestation", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/credentials/CreatePublicKeyCredentialResponse;", "p0", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationSuccess;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/credentials/CreatePublicKeyCredentialResponse;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/datasource/PasskeyAttestationDataSource;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyAttestationRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository {

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_ATTESTATION = "none";

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_AUTHENTICATOR_ATTACHMENT = "platform";

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_RESIDENT_KEY = "required";

    @java.lang.Deprecated
    public static final long DEFAULT_TIMEOUT_MS = 1800000;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PasskeyAttestationRepositoryImpl(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource passkeyAttestationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAttestationDataSource, "");
        this.Camera2StreamConfigurationMap = passkeyAttestationDataSource;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.m15227$r8$lambda$yHuTXx7ib8X7WzOMaeZHtzMceo((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/repository/PasskeyAttestationRepositoryImpl$Companion;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT_MS", "J", "", "DEFAULT_ATTESTATION", "Ljava/lang/String;", "DEFAULT_AUTHENTICATOR_ATTACHMENT", "DEFAULT_RESIDENT_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:30|31))(2:32|(2:34|35)(19:36|(1:38)|39|(3:41|(1:43)|(4:45|(2:48|46)|49|50))|51|(2:54|52)|55|56|(1:58)(1:75)|59|(1:61)|62|(1:64)(1:74)|65|(1:67)|68|(1:70)|71|(1:73)))|12|(2:14|(1:16)(4:20|(1:22)|23|24))(2:25|(1:27)(2:28|29))|17|18))|88|6|7|(0)(0)|12|(0)(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025e, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - credential exception", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - security error", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0246, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0247, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - unsupported platform", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0219, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - connection refused", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0201, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0202, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - timeout", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0230, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey attestation - cannot resolve host", r0);
        r2 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0197 A[Catch: SecurityException -> 0x01e9, SocketTimeoutException -> 0x0201, ConnectException -> 0x0218, UnknownHostException -> 0x022f, UnsupportedOperationException -> 0x0246, CreateCredentialException -> 0x025d, TryCatch #2 {CreateCredentialException -> 0x025d, SecurityException -> 0x01e9, UnsupportedOperationException -> 0x0246, ConnectException -> 0x0218, SocketTimeoutException -> 0x0201, UnknownHostException -> 0x022f, blocks: (B:11:0x0036, B:12:0x0191, B:14:0x0197, B:16:0x01a3, B:20:0x01ab, B:24:0x01be, B:25:0x01cd, B:27:0x01d1, B:28:0x01e3, B:29:0x01e8, B:36:0x0057, B:38:0x0067, B:39:0x006b, B:41:0x0075, B:45:0x0081, B:46:0x0092, B:48:0x0098, B:50:0x00b7, B:51:0x00b9, B:52:0x00ee, B:54:0x00f4, B:56:0x010f, B:58:0x0118, B:59:0x0120, B:62:0x0128, B:64:0x012e, B:65:0x0134, B:68:0x013c, B:71:0x0151), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cd A[Catch: SecurityException -> 0x01e9, SocketTimeoutException -> 0x0201, ConnectException -> 0x0218, UnknownHostException -> 0x022f, UnsupportedOperationException -> 0x0246, CreateCredentialException -> 0x025d, TryCatch #2 {CreateCredentialException -> 0x025d, SecurityException -> 0x01e9, UnsupportedOperationException -> 0x0246, ConnectException -> 0x0218, SocketTimeoutException -> 0x0201, UnknownHostException -> 0x022f, blocks: (B:11:0x0036, B:12:0x0191, B:14:0x0197, B:16:0x01a3, B:20:0x01ab, B:24:0x01be, B:25:0x01cd, B:27:0x01d1, B:28:0x01e3, B:29:0x01e8, B:36:0x0057, B:38:0x0067, B:39:0x006b, B:41:0x0075, B:45:0x0081, B:46:0x0092, B:48:0x0098, B:50:0x00b7, B:51:0x00b9, B:52:0x00ee, B:54:0x00f4, B:56:0x010f, B:58:0x0118, B:59:0x0120, B:62:0x0128, B:64:0x012e, B:65:0x0134, B:68:0x013c, B:71:0x0151), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPasskeyAttestation(android.content.Context context, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest passkeyAttestationRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError, ? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl$createPasskeyAttestation$1 passkeyAttestationRepositoryImpl$createPasskeyAttestation$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess> left;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl$createPasskeyAttestation$1) {
            passkeyAttestationRepositoryImpl$createPasskeyAttestation$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl$createPasskeyAttestation$1) continuation;
            if ((passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList = null;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnsupportedPlatform(null, 1, null));
                    }
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge = passkeyAttestationRequest.getPasskeyBindChallenge();
                    java.lang.String userName = passkeyBindChallenge.getUserName();
                    if (kotlin.text.StringsKt.isBlank(userName)) {
                        userName = passkeyBindChallenge.getUserDisplayName();
                    }
                    java.lang.String str = userName;
                    java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> excludeCredentials = passkeyBindChallenge.getExcludeCredentials();
                    if (excludeCredentials != null) {
                        if (excludeCredentials.isEmpty()) {
                            excludeCredentials = null;
                        }
                        if (excludeCredentials != null) {
                            java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> list = excludeCredentials;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                            for (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor excludedCredentialDescriptor : list) {
                                arrayList2.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.ExcludedCredential(excludedCredentialDescriptor.getId(), com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.WebAuthnCreateRequestKt.normalizeCredentialType(excludedCredentialDescriptor.getType()), excludedCredentialDescriptor.getTransports()));
                            }
                            arrayList = arrayList2;
                        }
                    }
                    java.util.ArrayList arrayList3 = arrayList;
                    java.lang.String challenge = passkeyBindChallenge.getChallenge();
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.RelyingPartyInfo relyingPartyInfo = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.RelyingPartyInfo(passkeyBindChallenge.getRelyingPartyId(), passkeyBindChallenge.getRelyingPartyName());
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.UserInfo userInfo = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.UserInfo(passkeyBindChallenge.getUserId(), str, passkeyBindChallenge.getUserDisplayName());
                    java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> pubKeyCredParams = passkeyBindChallenge.getPubKeyCredParams();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pubKeyCredParams, 10));
                    for (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter pubKeyCredentialParameter : pubKeyCredParams) {
                        arrayList4.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.WebAuthnCreateRequestKt.normalizeCredentialType(pubKeyCredentialParameter.getType()), pubKeyCredentialParameter.getAlg()));
                    }
                    java.util.ArrayList arrayList5 = arrayList4;
                    java.lang.Long timeout = passkeyBindChallenge.getTimeout();
                    long longValue = timeout != null ? timeout.longValue() : 1800000L;
                    java.lang.String authenticatorAttachment = passkeyBindChallenge.getAuthenticatorAttachment();
                    if (authenticatorAttachment == null) {
                        authenticatorAttachment = DEFAULT_AUTHENTICATOR_ATTACHMENT;
                    }
                    java.lang.Boolean requireResidentKey = passkeyBindChallenge.getRequireResidentKey();
                    boolean booleanValue = requireResidentKey != null ? requireResidentKey.booleanValue() : true;
                    java.lang.String residentKey = passkeyBindChallenge.getResidentKey();
                    if (residentKey == null) {
                        residentKey = DEFAULT_RESIDENT_KEY;
                    }
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.AuthenticatorSelection authenticatorSelection = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.AuthenticatorSelection(authenticatorAttachment, java.lang.Boolean.valueOf(booleanValue), residentKey, passkeyBindChallenge.getUserVerification());
                    java.lang.String attestation = passkeyBindChallenge.getAttestation();
                    if (attestation == null) {
                        attestation = "none";
                    }
                    java.lang.String encodeToString = this.getHighSpeedVideoFpsRangesFor.encodeToString(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.WebAuthnCreateRequest.INSTANCE.serializer(), new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.WebAuthnCreateRequest(challenge, relyingPartyInfo, userInfo, arrayList5, java.lang.Long.valueOf(longValue), arrayList3, authenticatorSelection, attestation));
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource passkeyAttestationDataSource = this.Camera2StreamConfigurationMap;
                    boolean preferImmediatelyAvailableCredentials = passkeyAttestationRequest.getPreferImmediatelyAvailableCredentials();
                    passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAttestationRequest);
                    passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                    passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = passkeyAttestationDataSource.createPasskeyAttestation(context, encodeToString, preferImmediatelyAvailableCredentials, passkeyAttestationRepositoryImpl$createPasskeyAttestation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    androidx.view.CreateCredentialResponse createCredentialResponse = (androidx.view.CreateCredentialResponse) ((arrow.core.Either.Right) either).getValue();
                    if (createCredentialResponse instanceof androidx.view.CreatePublicKeyCredentialResponse) {
                        left = getHighSpeedVideoFpsRangesFor((androidx.view.CreatePublicKeyCredentialResponse) createCredentialResponse);
                    } else {
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(createCredentialResponse.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "Unknown";
                        }
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidCredentialType(simpleName, "PublicKeyCredential", null, 4, null));
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain((java.lang.Exception) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.ATTESTATION, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiType.CREDENTIAL_API, left);
                return left;
            }
        }
        passkeyAttestationRepositoryImpl$createPasskeyAttestation$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl$createPasskeyAttestation$1(this, continuation);
        java.lang.Object obj2 = passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyAttestationRepositoryImpl$createPasskeyAttestation$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.ATTESTATION, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiType.CREDENTIAL_API, left);
        return left;
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess> getHighSpeedVideoFpsRangesFor(androidx.view.CreatePublicKeyCredentialResponse p0) {
        try {
            java.lang.String registrationResponseJson = p0.getRegistrationResponseJson();
            java.lang.String optString = new org.json.JSONObject(registrationResponseJson).optString("id", "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            if (kotlin.text.StringsKt.isBlank(optString)) {
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.MissingCredentialId(null, 1, null));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess(registrationResponseJson, optString));
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to process credential response - invalid argument", e);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(e));
        } catch (java.lang.IllegalStateException e2) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to process credential response - invalid state", e2);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(e2));
        } catch (org.json.JSONException e3) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to process credential response - JSON parsing error", e3);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error.PasskeyAttestationErrorMapperKt.toDomain(e3));
        }
    }

    /* renamed from: $r8$lambda$yHuTXx7ib8X7-WzOMaeZHtzMceo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15227$r8$lambda$yHuTXx7ib8X7WzOMaeZHtzMceo(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setEncodeDefaults(false);
        return kotlin.Unit.INSTANCE;
    }
}
