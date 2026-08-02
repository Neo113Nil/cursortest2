package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B \b\u0007\u0012\u0015\u0010\u0006\u001a\u0011\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\u0011\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockProductOffersRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ProductOffersRepository;", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "Lcom/paypal/oslo/feature/bnplacquisition/config/CountryGetter;", "Lkotlin/jvm/JvmSuppressWildcards;", "countryGetter", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/ProductOffers;", "evaluateProductOffers", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockProductOffersRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MockProductOffersRepository(kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object evaluateProductOffers(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest evaluateProductOffersRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository$evaluateProductOffers$1 mockProductOffersRepository$evaluateProductOffers$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository$evaluateProductOffers$1) {
            mockProductOffersRepository$evaluateProductOffers$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository$evaluateProductOffers$1) continuation;
            if ((mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockProductOffersRepository$evaluateProductOffers$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateProductOffersRequest);
                    mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockProductOffersRepository$evaluateProductOffers$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (this.Camera2StreamConfigurationMap.invoke() == com.paypal.oslo.feature.bnplacquisition.config.Country.DE) {
                    return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffersSuccess(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer[]{new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US, "mock-offer-1", null, 4, null), new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, "mock-offer-2", null, 4, null)})), null, 2, null));
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffersSuccess(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_DE, "mock-offer-de", null, 4, null))), null, 2, null));
            }
        }
        mockProductOffersRepository$evaluateProductOffers$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository$evaluateProductOffers$1(this, continuation);
        java.lang.Object obj2 = mockProductOffersRepository$evaluateProductOffers$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockProductOffersRepository$evaluateProductOffers$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (this.Camera2StreamConfigurationMap.invoke() == com.paypal.oslo.feature.bnplacquisition.config.Country.DE) {
        }
    }
}
