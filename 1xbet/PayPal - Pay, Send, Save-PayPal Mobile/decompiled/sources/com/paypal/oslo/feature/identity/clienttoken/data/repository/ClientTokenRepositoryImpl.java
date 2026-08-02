package com.paypal.oslo.feature.identity.clienttoken.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B5\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/data/repository/ClientTokenRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/repository/ClientTokenRepository;", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/clienttoken/data/service/ClientTokenService;", "service", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "encoder", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "authenticationConfig", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;Ljavax/inject/Provider;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "", "forceRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;", "getClientToken", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "p0", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientTokenRepositoryImpl implements com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository {
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.Base64Encoder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ClientTokenRepositoryImpl(javax.inject.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> provider, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = base64Encoder;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = identityTokenStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getClientToken(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError, com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken>> continuation) {
        com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getClientToken$1 clientTokenRepositoryImpl$getClientToken$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken clientAccessToken;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getClientToken$1) {
            clientTokenRepositoryImpl$getClientToken$1 = (com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getClientToken$1) continuation;
            if ((clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            z = clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                        } else if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    boolean z2 = clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (z) {
                    clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap = z;
                    clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(clientTokenRepositoryImpl$getClientToken$1);
                    if (highSpeedVideoSizes != coroutine_suspended) {
                        return highSpeedVideoSizes;
                    }
                } else {
                    clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap = z;
                    clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor = 2;
                    obj = Camera2StreamConfigurationMap(clientTokenRepositoryImpl$getClientToken$1);
                }
                clientAccessToken = (com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken) obj;
                if (clientAccessToken == null && (right = arrow.core.EitherKt.right(clientAccessToken)) != null) {
                    return right;
                }
                clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap = z;
                clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor = 3;
                java.lang.Object highSpeedVideoSizes2 = getHighSpeedVideoSizes(clientTokenRepositoryImpl$getClientToken$1);
                return highSpeedVideoSizes2 != coroutine_suspended ? coroutine_suspended : highSpeedVideoSizes2;
            }
        }
        clientTokenRepositoryImpl$getClientToken$1 = new com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getClientToken$1(this, continuation);
        java.lang.Object obj2 = clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
        clientAccessToken = (com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken) obj2;
        if (clientAccessToken == null) {
        }
        clientTokenRepositoryImpl$getClientToken$1.Camera2StreamConfigurationMap = z;
        clientTokenRepositoryImpl$getClientToken$1.getHighSpeedVideoFpsRangesFor = 3;
        java.lang.Object highSpeedVideoSizes22 = getHighSpeedVideoSizes(clientTokenRepositoryImpl$getClientToken$1);
        if (highSpeedVideoSizes22 != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError, com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken>> continuation) {
        com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$fetchFreshToken$1 clientTokenRepositoryImpl$fetchFreshToken$1;
        int i;
        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig;
        java.lang.String str;
        java.lang.String str2;
        arrow.core.Either either;
        com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken clientAccessToken;
        if (continuation instanceof com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$fetchFreshToken$1) {
            clientTokenRepositoryImpl$fetchFreshToken$1 = (com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$fetchFreshToken$1) continuation;
            if ((clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats -= 2147483648;
                java.lang.Object obj = clientTokenRepositoryImpl$fetchFreshToken$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig2 = this.getHighSpeedVideoFpsRanges.get();
                    java.lang.String proxyClientId = authenticationConfig2.getProxyClientId();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(proxyClientId);
                    sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                    java.lang.String obj2 = sb.toString();
                    java.lang.String encode = this.getHighResolutionOutputSizeshNQ4ISI.encode(obj2);
                    com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService clientTokenService = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clientTokenService, "");
                    java.lang.String concat = "Basic ".concat(java.lang.String.valueOf(encode));
                    java.lang.String firstPartyClientId = authenticationConfig2.getFirstPartyClientId();
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationConfig2);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encode);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats = 1;
                    java.lang.Object clientToken$default = com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService.getClientToken$default(clientTokenService, concat, null, null, firstPartyClientId, clientTokenRepositoryImpl$fetchFreshToken$1, 6, null);
                    if (clientToken$default != coroutine_suspended) {
                        authenticationConfig = authenticationConfig2;
                        obj = clientToken$default;
                        str = obj2;
                        str2 = encode;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = clientTokenRepositoryImpl$fetchFreshToken$1.Camera2StreamConfigurationMap;
                    int i3 = clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoSizes;
                    clientAccessToken = (com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken) clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return arrow.core.EitherKt.right(clientAccessToken);
                }
                str2 = (java.lang.String) clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRanges;
                str = (java.lang.String) clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRangesFor;
                authenticationConfig = (com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig) clientTokenRepositoryImpl$fetchFreshToken$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.clienttoken.data.model.ClientAccessTokenResponse clientAccessTokenResponse = (com.paypal.oslo.feature.identity.clienttoken.data.model.ClientAccessTokenResponse) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken domain = com.paypal.oslo.feature.identity.clienttoken.data.mapper.ClientTokenMapperKt.toDomain(clientAccessTokenResponse);
                    java.lang.String tokenValue = domain.getTokenValue();
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationConfig);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(clientAccessTokenResponse);
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoSizesFor = domain;
                    clientTokenRepositoryImpl$fetchFreshToken$1.getHighSpeedVideoSizes = 0;
                    clientTokenRepositoryImpl$fetchFreshToken$1.Camera2StreamConfigurationMap = 0;
                    clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats = 2;
                    java.lang.Object saveClientAccessToken = this.getHighSpeedVideoFpsRangesFor.saveClientAccessToken(tokenValue, clientTokenRepositoryImpl$fetchFreshToken$1);
                    if (saveClientAccessToken != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        saveClientAccessToken = kotlin.Unit.INSTANCE;
                    }
                    if (saveClientAccessToken != coroutine_suspended) {
                        clientAccessToken = domain;
                        return arrow.core.EitherKt.right(clientAccessToken);
                    }
                    return coroutine_suspended;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue())));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        clientTokenRepositoryImpl$fetchFreshToken$1 = new com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$fetchFreshToken$1(this, continuation);
        java.lang.Object obj3 = clientTokenRepositoryImpl$fetchFreshToken$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clientTokenRepositoryImpl$fetchFreshToken$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken> continuation) {
        com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getCachedToken$1 clientTokenRepositoryImpl$getCachedToken$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getCachedToken$1) {
            clientTokenRepositoryImpl$getCachedToken$1 = (com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getCachedToken$1) continuation;
            if ((clientTokenRepositoryImpl$getCachedToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                clientTokenRepositoryImpl$getCachedToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = clientTokenRepositoryImpl$getCachedToken$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clientTokenRepositoryImpl$getCachedToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.getHighSpeedVideoFpsRangesFor;
                    clientTokenRepositoryImpl$getCachedToken$1.Camera2StreamConfigurationMap = 1;
                    obj = identityTokenStorage.getClientAccessToken(clientTokenRepositoryImpl$getCachedToken$1);
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
                if (str != null) {
                    return null;
                }
                return new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken(io.ktor.http.auth.AuthScheme.Bearer, str, null, 0, 4, null);
            }
        }
        clientTokenRepositoryImpl$getCachedToken$1 = new com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getCachedToken$1(this, continuation);
        java.lang.Object obj2 = clientTokenRepositoryImpl$getCachedToken$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clientTokenRepositoryImpl$getCachedToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    private static com.paypal.oslo.feature.identity.shared.domain.model.ApiError getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.http.error.NetworkError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) p0;
            return new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(httpError.getCode(), httpError.getBody());
        }
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError.INSTANCE;
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) p0).getCause());
    }

    public static final /* synthetic */ java.lang.Object access$saveToken(com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl clientTokenRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        java.lang.Object saveClientAccessToken = clientTokenRepositoryImpl.getHighSpeedVideoFpsRangesFor.saveClientAccessToken(str, continuation);
        return saveClientAccessToken == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveClientAccessToken : kotlin.Unit.INSTANCE;
    }
}
