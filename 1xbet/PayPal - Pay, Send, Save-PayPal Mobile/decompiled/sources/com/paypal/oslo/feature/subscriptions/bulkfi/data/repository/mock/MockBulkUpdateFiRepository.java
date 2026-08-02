package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/data/repository/mock/MockBulkUpdateFiRepository;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/repository/BulkUpdateFiRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;", "getConsumerAgreementsByFundingInstrument", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockBulkUpdateFiRepository implements com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockBulkUpdateFiRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConsumerAgreementsByFundingInstrument(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData>>> continuation) {
        com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1 mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1) {
            mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1 = (com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1) continuation;
            if ((mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighSpeedVideoFpsRanges = agreementType;
                    mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    agreementType = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-1", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD, "Chase Visa", "1234", null, "https://example.com/images/visa.png", null, 80, null);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem[]{new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-11111", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, fundingInstrument, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-1", "Netflix", "https://e7.pngegg.com/pngimages/708/187/png-clipart-netflix-round-logo-tech-companies-thumbnail.png"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 15", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "15.99"))), new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-22222", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED, fundingInstrument, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-2", "Spotify", "https://cdn.joinhoney.com/images/store-logos/313322609974798150.png"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 20", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "9.99"))), new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-33333", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, fundingInstrument, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-3", "Adobe", "https://www.subscriptioninsider.com/wp-content/uploads/2022/03/Roku-logo-2021.jpg"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 01", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "54.99")))});
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : listOf) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) obj2).getType(), agreementType)) {
                        arrayList.add(obj2);
                    }
                }
                return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData(fundingInstrument, arrayList)));
            }
        }
        mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1 = new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1(this, continuation);
        java.lang.Object obj3 = mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("mock-fi-1", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD, "Chase Visa", "1234", null, "https://example.com/images/visa.png", null, 80, null);
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem[]{new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-11111", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, fundingInstrument2, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-1", "Netflix", "https://e7.pngegg.com/pngimages/708/187/png-clipart-netflix-round-logo-tech-companies-thumbnail.png"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 15", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "15.99"))), new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-22222", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED, fundingInstrument2, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-2", "Spotify", "https://cdn.joinhoney.com/images/store-logos/313322609974798150.png"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 20", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "9.99"))), new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem("BA-33333", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, fundingInstrument2, null, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant-3", "Adobe", "https://www.subscriptioninsider.com/wp-content/uploads/2022/03/Roku-logo-2021.jpg"), new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation("Paid Dec 01", new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance("USD", "54.99")))});
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r0.hasNext()) {
        }
        return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData(fundingInstrument2, arrayList2)));
    }
}
