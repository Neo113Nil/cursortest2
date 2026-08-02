package com.paypal.oslo.feature.subscriptions.details.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/data/repository/mock/MockSubscriptionsDetailsRepository;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/repository/SubscriptionDetailsRepository;", "<init>", "()V", "", "id", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "getConsumerAgreement", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockSubscriptionsDetailsRepository implements com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockSubscriptionsDetailsRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConsumerAgreement(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails>> continuation) {
        com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository$getConsumerAgreement$1 mockSubscriptionsDetailsRepository$getConsumerAgreement$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository$getConsumerAgreement$1) {
            mockSubscriptionsDetailsRepository$getConsumerAgreement$1 = (com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository$getConsumerAgreement$1) continuation;
            if ((mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockSubscriptionsDetailsRepository$getConsumerAgreement$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockSubscriptionsDetailsRepository$getConsumerAgreement$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-1", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_DEBIT_CARD, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME, null, null, "https://example.com/images/paypal-debit-thumb.png", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "25.00"), 24, null);
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-2", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_SAVINGS, "Chase Savings Account", "1234", null, "https://example.com/images/bank-savings.png", null, 80, null);
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails("BA-12345678", "Netflix", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, "https://e7.pngegg.com/pngimages/708/187/png-clipart-netflix-round-logo-tech-companies-thumbnail.png", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument[]{fundingInstrument, fundingInstrument2}), fundingInstrument2, fundingInstrument, "help@netflix.com", com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, null, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, "https://www.netflix.com/", 512, null));
            }
        }
        mockSubscriptionsDetailsRepository$getConsumerAgreement$1 = new com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository$getConsumerAgreement$1(this, continuation);
        java.lang.Object obj2 = mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockSubscriptionsDetailsRepository$getConsumerAgreement$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-1", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_DEBIT_CARD, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME, null, null, "https://example.com/images/paypal-debit-thumb.png", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "25.00"), 24, null);
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument22 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-2", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_SAVINGS, "Chase Savings Account", "1234", null, "https://example.com/images/bank-savings.png", null, 80, null);
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails("BA-12345678", "Netflix", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, "https://e7.pngegg.com/pngimages/708/187/png-clipart-netflix-round-logo-tech-companies-thumbnail.png", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument[]{fundingInstrument3, fundingInstrument22}), fundingInstrument22, fundingInstrument3, "help@netflix.com", com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, null, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, "https://www.netflix.com/", 512, null));
    }
}
