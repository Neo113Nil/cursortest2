package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockCreateCreditApplicationRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/CreateCreditApplicationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplication;", "createCreditApplication", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockCreateCreditApplicationRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCreateCreditApplicationRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest createCreditApplicationRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository$createCreditApplication$1 mockCreateCreditApplicationRepository$createCreditApplication$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository$createCreditApplication$1) {
            mockCreateCreditApplicationRepository$createCreditApplication$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository$createCreditApplication$1) continuation;
            if ((mockCreateCreditApplicationRepository$createCreditApplication$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockCreateCreditApplicationRepository$createCreditApplication$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockCreateCreditApplicationRepository$createCreditApplication$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCreateCreditApplicationRepository$createCreditApplication$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockCreateCreditApplicationRepository$createCreditApplication$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createCreditApplicationRequest);
                    mockCreateCreditApplicationRepository$createCreditApplication$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockCreateCreditApplicationRepository$createCreditApplication$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("Friedrichstraße 100", null, "Berlin", "", "10117", "DE", 2, null);
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PRIVACY_NOTICE, "<html>Privacy Statement</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("privacy-statement.html", "", "https://www.paypal.com/de/webapps/mpp/ua/privacy-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_CHECK, "<html>Credit Check</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("credit-check.html", "", "https://www.paypal.com/de/webapps/mpp/ua/creditcheck-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)}), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("Grace Hamilton", "Grace", null, 4, null), kotlin.collections.CollectionsKt.listOf(address), address, new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber(null, "+49 30 12345678", 1, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome(false, null, 2, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.DateOfBirth(true, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification(false, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "400"), "CREDIT_ACCOUNT_ID_DE_001", null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), null, 2, null));
            }
        }
        mockCreateCreditApplicationRepository$createCreditApplication$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository$createCreditApplication$1(this, continuation);
        java.lang.Object obj2 = mockCreateCreditApplicationRepository$createCreditApplication$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCreateCreditApplicationRepository$createCreditApplication$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("Friedrichstraße 100", null, "Berlin", "", "10117", "DE", 2, null);
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PRIVACY_NOTICE, "<html>Privacy Statement</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("privacy-statement.html", "", "https://www.paypal.com/de/webapps/mpp/ua/privacy-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CREDIT_CHECK, "<html>Credit Check</html>", null, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink("credit-check.html", "", "https://www.paypal.com/de/webapps/mpp/ua/creditcheck-full", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML), 4, null)}), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("Grace Hamilton", "Grace", null, 4, null), kotlin.collections.CollectionsKt.listOf(address2), address2, new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber(null, "+49 30 12345678", 1, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome(false, null, 2, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.DateOfBirth(true, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification(false, null)), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "400"), "CREDIT_ACCOUNT_ID_DE_001", null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), null, 2, null));
    }
}
