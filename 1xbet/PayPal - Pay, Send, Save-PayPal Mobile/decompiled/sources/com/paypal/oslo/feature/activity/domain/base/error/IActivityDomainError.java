package com.paypal.oslo.feature.activity.domain.base.error;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "", "", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getCallError", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityDomainError {
    com.paypal.oslo.core.network.graphql.error.CallError getCallError();

    java.lang.String getErrorMessage();
}
