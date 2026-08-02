package com.paypal.oslo.feature.subscriptions.details.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/domain/usecase/GetConsumerAgreementUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/details/domain/repository/SubscriptionDetailsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/details/domain/repository/SubscriptionDetailsRepository;)V", "", "id", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/details/domain/repository/SubscriptionDetailsRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetConsumerAgreementUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetConsumerAgreementUseCase(com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository subscriptionDetailsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetailsRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = subscriptionDetailsRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getConsumerAgreement(str, agreementType, continuation);
    }
}
