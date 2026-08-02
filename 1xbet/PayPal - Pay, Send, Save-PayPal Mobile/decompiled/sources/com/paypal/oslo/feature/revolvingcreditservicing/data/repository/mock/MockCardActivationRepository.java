package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCardActivationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CardActivationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAccountSummaryRepository;", "mockAccountSummaryRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAccountSummaryRepository;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationAvailability;", "getCardActivationAvailability", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;", "request", "", "activateCard", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAccountSummaryRepository;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockCardActivationRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockCardActivationRepository(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mockAccountSummaryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockAccountSummaryRepository, "");
        this.getHighSpeedVideoFpsRangesFor = mockAccountSummaryRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r13 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardActivationAvailability(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$getCardActivationAvailability$1 mockCardActivationRepository$getCardActivationAvailability$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$getCardActivationAvailability$1) {
            mockCardActivationRepository$getCardActivationAvailability$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$getCardActivationAvailability$1) continuation;
            if ((mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockCardActivationRepository$getCardActivationAvailability$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
                    mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) mockCardActivationRepository$getCardActivationAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) ((arrow.core.Ior) obj).getOrNull();
                        java.lang.String str = null;
                        java.lang.String nationalNumber = (accountSummaryOverView == null || (customerServiceContact = accountSummaryOverView.getCustomerServiceContact()) == null || (phoneNumber = customerServiceContact.getPhoneNumber()) == null) ? null : phoneNumber.getNationalNumber();
                        if (nationalNumber == null) {
                            nationalNumber = "";
                        }
                        java.lang.String str2 = nationalNumber;
                        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository.WhenMappings.$EnumSwitchMapping$0[creditProductIdentifier.ordinal()];
                        if (i2 == 1) {
                            str = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardArtUrls.PPCC;
                        } else if (i2 == 2) {
                            str = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardArtUrls.CBMC;
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability("mock-account-id", "1234", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.READY_TO_ACTIVATE, str, str2));
                    }
                    creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) mockCardActivationRepository$getCardActivationAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mockAccountSummaryRepository = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest(creditProductIdentifier, null, null, 6, null);
                mockCardActivationRepository$getCardActivationAvailability$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
                mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = mockAccountSummaryRepository.fetchAccountSummary(servicingOverviewRequest, mockCardActivationRepository$getCardActivationAvailability$1);
            }
        }
        mockCardActivationRepository$getCardActivationAvailability$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$getCardActivationAvailability$1(this, continuation);
        java.lang.Object obj2 = mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mockAccountSummaryRepository2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest(creditProductIdentifier, null, null, 6, null);
        mockCardActivationRepository$getCardActivationAvailability$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
        mockCardActivationRepository$getCardActivationAvailability$1.getHighSpeedVideoFpsRangesFor = 2;
        obj2 = mockAccountSummaryRepository2.fetchAccountSummary(servicingOverviewRequest2, mockCardActivationRepository$getCardActivationAvailability$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object activateCard(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData activateCardRequestData, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$activateCard$1 mockCardActivationRepository$activateCard$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$activateCard$1) {
            mockCardActivationRepository$activateCard$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$activateCard$1) continuation;
            if ((mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = mockCardActivationRepository$activateCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activateCardRequestData);
                    mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1500L, mockCardActivationRepository$activateCard$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
        }
        mockCardActivationRepository$activateCard$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$activateCard$1(this, continuation);
        java.lang.Object obj2 = mockCardActivationRepository$activateCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCardActivationRepository$activateCard$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCardActivationRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
