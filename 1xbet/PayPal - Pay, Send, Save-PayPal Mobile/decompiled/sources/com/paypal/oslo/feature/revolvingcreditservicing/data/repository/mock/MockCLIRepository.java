package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageData;", "fetchCreditLineIncreaseOffer", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockCLIRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository.Companion(null);

    @javax.inject.Inject
    public MockCLIRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchCreditLineIncreaseOffer(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository$fetchCreditLineIncreaseOffer$1 mockCLIRepository$fetchCreditLineIncreaseOffer$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository$fetchCreditLineIncreaseOffer$1) {
            mockCLIRepository$fetchCreditLineIncreaseOffer$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository$fetchCreditLineIncreaseOffer$1) continuation;
            if ((mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "MockCLIRepository: Using MOCK data", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditProductIdentifier", creditProductIdentifier.name())), 2, null);
                    mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    mockCLIRepository$fetchCreditLineIncreaseOffer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockCLIRepository$fetchCreditLineIncreaseOffer$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData("mock-credit-account-id", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "2500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "4000.00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.PENDING, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.PENDING_INCOME_VERIFICATION, false, "mock-offer-id", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "1000.00"), "2026-03-18T23:59:59Z", "https://www.paypal.com/uk/legalhub/privacy-full"));
            }
        }
        mockCLIRepository$fetchCreditLineIncreaseOffer$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository$fetchCreditLineIncreaseOffer$1(this, continuation);
        java.lang.Object obj2 = mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCLIRepository$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData("mock-credit-account-id", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "2500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "4000.00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.PENDING, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.PENDING_INCOME_VERIFICATION, false, "mock-offer-id", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("GBP", "1000.00"), "2026-03-18T23:59:59Z", "https://www.paypal.com/uk/legalhub/privacy-full"));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
