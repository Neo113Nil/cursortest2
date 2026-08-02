package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00062\u0006\u0010\u0005\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00062\u0006\u0010\u0005\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J%\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u000f\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockUpdateApplicationRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/UpdateApplicationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTerms;", "updateApplicationAndFetchTerms", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/AvailableOffersRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/AvailableOfferDetails;", "updateApplicationAndFetchOffers", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/AvailableOffersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/AvailableOffersRequest;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/AvailableOfferDetails;", "createNoInternetErrorScenario$bnpl_acquisition_prodRelease", "()Larrow/core/Ior;", "createInvalidDateOfBirthScenario$bnpl_acquisition_prodRelease", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "reason", "createDeclineScenario$bnpl_acquisition_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;)Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/Repayments;", "updateApplicationAndFetchRepayments", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchReviewDetailsRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetails;", "updateApplicationAndFetchReviewDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchReviewDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SaveAddressRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "updateApplicationAndFetchAddresses", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SaveAddressRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "p1", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/EstimatedInstallment;", "getHighSpeedVideoSizes", "(ILjava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockUpdateApplicationRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockUpdateApplicationRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateApplicationAndFetchTerms(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1 mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1) {
            mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1) continuation;
            if ((mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewTermsRequest);
                    mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccessCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, "mock-credit-account-id", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.ESIGN, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/legalhub-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.LOAN_AGREEMENT, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/loanrespprog-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PRIVACY_NOTICE, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.PrivacyStatement, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_SCORE_DISCLOSURE, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/creditscoreterms-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_CHECK, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/de/webapps/mpp/ua/creditcheck-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)}))), null, 2, null));
            }
        }
        mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1(this, continuation);
        java.lang.Object obj2 = mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockUpdateApplicationRepository$updateApplicationAndFetchTerms$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccessCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, "mock-credit-account-id", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.ESIGN, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/legalhub-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.LOAN_AGREEMENT, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/loanrespprog-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PRIVACY_NOTICE, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.PrivacyStatement, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_SCORE_DISCLOSURE, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/us/webapps/mpp/ua/creditscoreterms-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_CHECK, "", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("", "", "https://www.paypal.com/de/webapps/mpp/ua/creditcheck-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)}))), null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateApplicationAndFetchOffers(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest availableOffersRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1 mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1) {
            mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1) continuation;
            if ((mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.Camera2StreamConfigurationMap = availableOffersRequest;
                    mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    availableOffersRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest) mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(Camera2StreamConfigurationMap(availableOffersRequest));
            }
        }
        mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1(this, continuation);
        java.lang.Object obj2 = mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockUpdateApplicationRepository$updateApplicationAndFetchOffers$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(Camera2StreamConfigurationMap(availableOffersRequest));
    }

    private final com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest p0) {
        java.lang.String postalCode = p0.getAddress().getPostalCode();
        if (postalCode == null) {
            postalCode = "400.00";
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, postalCode), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.ProductOfferEvaluation(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer("OFFER_6M", "7.99", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "0.00"), getHighSpeedVideoSizes(6, "68.67"), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.LOWEST_MONTHLY_COST), 6, "7.5", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "68.67"), true, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "412.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "12.00")), new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer("OFFER_12M", "9.99", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "0.00"), getHighSpeedVideoSizes(12, "35.00"), kotlin.collections.CollectionsKt.emptyList(), 12, "9.5", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "35.00"), false, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "420.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "20.00")), new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer("OFFER_3M", "5.99", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "0.00"), getHighSpeedVideoSizes(3, "135.33"), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.LOWEST_TOTAL_COST), 3, "5.5", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "135.33"), false, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "406.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "6.00")), new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer("OFFER_24M", "11.99", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "0.00"), getHighSpeedVideoSizes(24, "18.33"), kotlin.collections.CollectionsKt.emptyList(), 24, "11.5", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "18.33"), false, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "440.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "40.00"))}), null, 4, null)))), null, 2, null);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails> createNoInternetErrorScenario$bnpl_acquisition_prodRelease() {
        return new arrow.core.Ior.Left(new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection(new java.io.IOException(com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR)));
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails> createInvalidDateOfBirthScenario$bnpl_acquisition_prodRelease() {
        return new arrow.core.Ior.Left(new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth(new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail("Please enter a valid date of birth", kotlin.collections.CollectionsKt.listOf("updateApplicationAndFetchOffers"), new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_DATE_OF_BIRTH, "credit-application-service", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_DATE_OF_BIRTH, "Please enter a valid date of birth", "debugId", "mock-debug-id-12345")))), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_FORMAT));
    }

    public static /* synthetic */ arrow.core.Ior createDeclineScenario$bnpl_acquisition_prodRelease$default(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository mockUpdateApplicationRepository, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.RISK_ASSESSMENT_FAILURE;
        }
        return mockUpdateApplicationRepository.createDeclineScenario$bnpl_acquisition_prodRelease(declineReason);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails> createDeclineScenario$bnpl_acquisition_prodRelease(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails(null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline(reason), 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateApplicationAndFetchRepayments(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1 mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1) {
            mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1) continuation;
            if ((mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(repaymentRequest);
                    mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccessCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("BANK_002", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "3820", null, "Chase Checking"), new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("BANK_001", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "1234", null, "Bank of America")}), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PAYMENT_AUTHORIZATION, "<html>Payment Authorization Consent</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("payment-authorization.html", "", "https://www.paypal.com/us/webapps/mpp/ua/payment-authorization", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "87.43"), 6, "2025-09-05"))), null, 2, null));
            }
        }
        mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1(this, continuation);
        java.lang.Object obj2 = mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccessCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("BANK_002", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "3820", null, "Chase Checking"), new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("BANK_001", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "1234", null, "Bank of America")}), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PAYMENT_AUTHORIZATION, "<html>Payment Authorization Consent</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("payment-authorization.html", "", "https://www.paypal.com/us/webapps/mpp/ua/payment-authorization", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "87.43"), 6, "2025-09-05"))), null, 2, null));
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository
    public final java.lang.Object updateApplicationAndFetchReviewDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.UpdateApplicationAndFetchReviewDetailsRequest updateApplicationAndFetchReviewDetailsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails>> continuation) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateApplicationAndFetchAddresses(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SaveAddressRequest saveAddressRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1 mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1) {
            mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1) continuation;
            if ((mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(saveAddressRequest);
                    mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("200 N. Clark St", null, "Chicago", "IL", "60601", "US", 2, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("200 N. Clark St", null, "Chicago", "IL", "60601", "US", 2, null))), null, 2, null));
            }
        }
        mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1(this, continuation);
        java.lang.Object obj2 = mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockUpdateApplicationRepository$updateApplicationAndFetchAddresses$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("200 N. Clark St", null, "Chicago", "IL", "60601", "US", 2, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("200 N. Clark St", null, "Chicago", "IL", "60601", "US", 2, null))), null, 2, null));
    }

    private static java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.EstimatedInstallment> getHighSpeedVideoSizes(int p0, java.lang.String p1) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, p0);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.EstimatedInstallment(new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).format(new java.util.Date(((((kotlin.collections.IntIterator) it).nextInt() + 1) * 2592000000L) + currentTimeMillis)), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", p1)));
        }
        return arrayList;
    }
}
