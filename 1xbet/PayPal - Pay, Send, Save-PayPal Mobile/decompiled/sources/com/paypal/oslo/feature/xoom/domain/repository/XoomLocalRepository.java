package com.paypal.oslo.feature.xoom.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/repository/XoomLocalRepository;", "", "", "getUserAgreementAccepted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setUserAgreementAccepted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface XoomLocalRepository {
    java.lang.Object getUserAgreementAccepted(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object setUserAgreementAccepted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
