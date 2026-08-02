package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockProvisionedCardOverviewRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ProvisionedCardOverviewRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", "fetchProvisionedCardOverview", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockProvisionedCardOverviewRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockProvisionedCardOverviewRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchProvisionedCardOverview(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1 mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1) {
            mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1) continuation;
            if ((mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionedCardOverviewRequest);
                    mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000146713865383ff230640e89ad81c595fcc19a1", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.GOOGLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.PHONE), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000246713865383ff230640e89ad81c595fcc19b2", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.APPLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.WATCH)}), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.MDES, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.MASTERCARD), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent("5678", "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "2025-01-15T10:30:00Z", "03/26", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "321")), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "321"), com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.MONTHLY, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("Jane Smith", "Jane", null, 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("123 Main Street", "Apt 4B", "New York", "NY", "10001", "US"), "2125551234"), false)), null, 2, null));
            }
        }
        mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1(this, continuation);
        java.lang.Object obj2 = mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000146713865383ff230640e89ad81c595fcc19a1", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.GOOGLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.PHONE), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken("DSHRMC0000246713865383ff230640e89ad81c595fcc19b2", com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.APPLE_WALLET, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.WATCH)}), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.MDES, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.MASTERCARD), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent("5678", "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "2025-01-15T10:30:00Z", "03/26", new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "321")), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money("USD", "321"), com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.MONTHLY, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName("Jane Smith", "Jane", null, 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address("123 Main Street", "Apt 4B", "New York", "NY", "10001", "US"), "2125551234"), false)), null, 2, null));
    }
}
