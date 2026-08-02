package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "", "", "getRequestId", "()Ljava/lang/String;", "requestId", "", "isAuthRequired", "()Z", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LoginRequest {
    com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent();

    java.lang.String getRequestId();

    boolean isAuthRequired();
}
