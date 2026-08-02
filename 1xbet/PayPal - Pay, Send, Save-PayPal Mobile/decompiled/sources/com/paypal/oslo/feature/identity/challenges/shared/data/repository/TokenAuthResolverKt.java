package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001aJ\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\"\b\b\u0000\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "", "resolveAvailableToken", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "T", "Lcom/apollographql/apollo/ApolloCall;", "partialToken", "tokenStorage", "noTokenErrorMessage", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/AuthenticationError;", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "applyStepupAuthHeader", "(Lcom/apollographql/apollo/ApolloCall;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenAuthResolverKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r6 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object resolveAvailableToken(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$resolveAvailableToken$1 tokenAuthResolverKt$resolveAvailableToken$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData;
        java.lang.String accessToken;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$resolveAvailableToken$1) {
            tokenAuthResolverKt$resolveAvailableToken$1 = (com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$resolveAvailableToken$1) continuation;
            if ((tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoSizes;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tokenAuthResolverKt$resolveAvailableToken$1.getHighResolutionOutputSizeshNQ4ISI = identityTokenStorage;
                    tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = identityTokenStorage.getUserAccessToken(tokenAuthResolverKt$resolveAvailableToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    identityTokenStorage = (com.paypal.oslo.feature.identity.storage.IdentityTokenStorage) tokenAuthResolverKt$resolveAvailableToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj;
                if (userAccessTokenData == null && (accessToken = userAccessTokenData.getAccessToken()) != null) {
                    return accessToken;
                }
                tokenAuthResolverKt$resolveAvailableToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityTokenStorage);
                tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object clientAccessToken = identityTokenStorage.getClientAccessToken(tokenAuthResolverKt$resolveAvailableToken$1);
                return clientAccessToken != coroutine_suspended ? coroutine_suspended : clientAccessToken;
            }
        }
        tokenAuthResolverKt$resolveAvailableToken$1 = new com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$resolveAvailableToken$1(continuation);
        java.lang.Object obj2 = tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj2;
        if (userAccessTokenData == null) {
        }
        tokenAuthResolverKt$resolveAvailableToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityTokenStorage);
        tokenAuthResolverKt$resolveAvailableToken$1.getHighSpeedVideoFpsRangesFor = 2;
        java.lang.Object clientAccessToken2 = identityTokenStorage.getClientAccessToken(tokenAuthResolverKt$resolveAvailableToken$1);
        if (clientAccessToken2 != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends com.apollographql.apollo.api.Operation.Data> java.lang.Object applyStepupAuthHeader(com.apollographql.apollo.ApolloCall<T> apolloCall, java.lang.String str, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError, com.paypal.oslo.core.network.graphql.CallConfig>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$applyStepupAuthHeader$1 tokenAuthResolverKt$applyStepupAuthHeader$1;
        int i;
        java.lang.String str3;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$applyStepupAuthHeader$1) {
            tokenAuthResolverKt$applyStepupAuthHeader$1 = (com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$applyStepupAuthHeader$1) continuation;
            if ((tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = tokenAuthResolverKt$applyStepupAuthHeader$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRanges;
                int i2 = 2;
                java.util.Map map = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                java.lang.Object[] objArr3 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str4 = str;
                    if (str4 != null && str4.length() != 0) {
                        apolloCall.addHttpHeader("Authorization", "Bearer ".concat(java.lang.String.valueOf(str)));
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.network.graphql.CallConfig(com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                    }
                    tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRangesFor = apolloCall;
                    tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    tokenAuthResolverKt$applyStepupAuthHeader$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityTokenStorage);
                    tokenAuthResolverKt$applyStepupAuthHeader$1.Camera2StreamConfigurationMap = str2;
                    tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRanges = 1;
                    obj = resolveAvailableToken(identityTokenStorage, tokenAuthResolverKt$applyStepupAuthHeader$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) tokenAuthResolverKt$applyStepupAuthHeader$1.Camera2StreamConfigurationMap;
                    apolloCall = (com.apollographql.apollo.ApolloCall) tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str3 = (java.lang.String) obj;
                if (str3 != null) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError(str2));
                }
                apolloCall.addHttpHeader("Authorization", "Bearer ".concat(java.lang.String.valueOf(str3)));
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.network.graphql.CallConfig(com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE, map, i2, objArr3 == true ? 1 : 0));
            }
        }
        tokenAuthResolverKt$applyStepupAuthHeader$1 = new com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$applyStepupAuthHeader$1(continuation);
        java.lang.Object obj2 = tokenAuthResolverKt$applyStepupAuthHeader$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tokenAuthResolverKt$applyStepupAuthHeader$1.getHighSpeedVideoFpsRanges;
        int i22 = 2;
        java.util.Map map2 = null;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        if (i != 0) {
        }
        str3 = (java.lang.String) obj2;
        if (str3 != null) {
        }
    }
}
