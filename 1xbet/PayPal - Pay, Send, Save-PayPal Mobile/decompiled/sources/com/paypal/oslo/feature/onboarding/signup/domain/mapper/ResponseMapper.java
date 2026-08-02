package com.paypal.oslo.feature.onboarding.signup.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/mapper/ResponseMapper;", "T", "D", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "mapResponse", "(Ljava/lang/Object;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ResponseMapper<T, D> {
    arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, D> mapResponse(T data);

    com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError);
}
