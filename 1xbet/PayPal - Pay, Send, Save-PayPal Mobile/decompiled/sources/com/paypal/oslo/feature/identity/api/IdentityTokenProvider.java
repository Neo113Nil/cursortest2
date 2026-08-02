package com.paypal.oslo.feature.identity.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "", "Lcom/paypal/oslo/core/identity/domain/model/TokenType;", "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invalidateToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IdentityTokenProvider {
    java.lang.Object getToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation);

    java.lang.Object invalidateToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
