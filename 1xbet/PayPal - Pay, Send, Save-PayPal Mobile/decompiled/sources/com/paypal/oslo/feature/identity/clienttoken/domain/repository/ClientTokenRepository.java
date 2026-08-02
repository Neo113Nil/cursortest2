package com.paypal.oslo.feature.identity.clienttoken.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/domain/repository/ClientTokenRepository;", "", "", "forceRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;", "getClientToken", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientTokenRepository {
    java.lang.Object getClientToken(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError, com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getClientToken$default(com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository clientTokenRepository, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClientToken");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return clientTokenRepository.getClientToken(z, continuation);
    }
}
