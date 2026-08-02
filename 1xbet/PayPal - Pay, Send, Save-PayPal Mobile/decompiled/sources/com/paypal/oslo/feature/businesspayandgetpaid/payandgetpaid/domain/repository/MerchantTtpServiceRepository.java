package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/repository/MerchantTtpServiceRepository;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayOnboardingError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/MerchantTapToPayOnboardingStatus;", "fetchTapToPayOnboardingStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MerchantTtpServiceRepository {
    java.lang.Object fetchTapToPayOnboardingStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError, ? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus>> continuation);
}
