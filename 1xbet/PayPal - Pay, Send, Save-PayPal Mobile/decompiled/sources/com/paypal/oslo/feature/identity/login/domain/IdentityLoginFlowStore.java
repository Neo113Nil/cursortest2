package com.paypal.oslo.feature.identity.login.domain;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/IdentityLoginFlowStore;", "", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "tokenType", "", "requestToken", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "awaitTerminal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "reason", "interrupt", "(Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface IdentityLoginFlowStore {
    java.lang.Object awaitTerminal(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation);

    void interrupt(com.paypal.oslo.feature.identity.login.domain.model.InterruptReason reason);

    void requestToken(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType);

    void reset();
}
