package com.paypal.oslo.feature.identity.login.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/repository/LoginRepository;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "loginRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginError;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "login", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LoginRepository {
    java.lang.Object login(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.login.domain.model.LoginError, ? extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult>> continuation);
}
