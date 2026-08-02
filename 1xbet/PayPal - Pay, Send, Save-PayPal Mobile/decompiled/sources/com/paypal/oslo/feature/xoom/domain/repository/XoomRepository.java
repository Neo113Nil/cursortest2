package com.paypal.oslo.feature.xoom.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "", "", "userAccessToken", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "getUsersMe", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "createFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface XoomRepository {
    java.lang.Object createFailedPaymentInfo(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo>> continuation);

    java.lang.Object getUsersMe(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.UserInfo>> continuation);
}
