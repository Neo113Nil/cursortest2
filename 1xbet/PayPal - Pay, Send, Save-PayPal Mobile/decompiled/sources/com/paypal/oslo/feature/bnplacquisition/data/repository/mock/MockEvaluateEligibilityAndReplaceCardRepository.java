package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockEvaluateEligibilityAndReplaceCardRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/EvaluateEligibilityAndReplaceCardRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/InStoreVccDetailsRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", "fetchInStoreVccDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/InStoreVccDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockEvaluateEligibilityAndReplaceCardRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockEvaluateEligibilityAndReplaceCardRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchInStoreVccDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.InStoreVccDetailsRequest inStoreVccDetailsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1 mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1) {
            mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1) continuation;
            if ((mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(inStoreVccDetailsRequest);
                    mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000146713865383ff230640e89ad81c595fcc19a1", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.GOOGLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.PHONE)), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.MDES, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.MASTERCARD), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent("1234", "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "", "PT14H", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "200")), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "15"), com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.MONTHLY, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("John Doe", "John", null, 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("37468 Salt Grass Rd", null, "Newark", "CA", "94560", "US"), "6503321926"), false)), null, 2, null));
            }
        }
        mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1(this, continuation);
        java.lang.Object obj2 = mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockEvaluateEligibilityAndReplaceCardRepository$fetchInStoreVccDetails$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000146713865383ff230640e89ad81c595fcc19a1", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.GOOGLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.PHONE)), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.MDES, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.MASTERCARD), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent("1234", "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "", "PT14H", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "200")), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "15"), com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.MONTHLY, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("John Doe", "John", null, 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("37468 Salt Grass Rd", null, "Newark", "CA", "94560", "US"), "6503321926"), false)), null, 2, null));
    }
}
