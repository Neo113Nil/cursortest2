package com.paypal.oslo.feature.identity.clienttoken.data.service;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJF\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/data/service/ClientTokenService;", "", "", "authorization", "grantType", "responseType", "targetClientId", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/identity/clienttoken/data/model/ClientAccessTokenResponse;", "getClientToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientTokenService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService.Companion INSTANCE = com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService.Companion.getHighSpeedVideoSizes;

    @com.paypal.oslo.core.network.rest.noauth.NoAuth
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/v1/oauth2/token")
    java.lang.Object getClientToken(@retrofit2.http.Header("Authorization") java.lang.String str, @retrofit2.http.Field("grant_type") java.lang.String str2, @retrofit2.http.Field("response_type") java.lang.String str3, @retrofit2.http.Field("target_client_id") java.lang.String str4, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.identity.clienttoken.data.model.ClientAccessTokenResponse>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getClientToken$default(com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService clientTokenService, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClientToken");
        }
        if ((i & 2) != 0) {
            str2 = "client_credentials";
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = null;
        }
        return clientTokenService.getClientToken(str, str5, str6, str4, continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/data/service/ClientTokenService$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService.Companion();

        private Companion() {
        }
    }
}
