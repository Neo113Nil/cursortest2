package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalAddCardIdMappingInDbUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "payPalLocalCardDataRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "idGroup", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "cardInfo", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalAddCardIdMappingInDbUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalAddCardIdMappingInDbUseCase(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalLocalCardDataRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = payPalLocalCardDataRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mapCardIdData = this.getHighResolutionOutputSizeshNQ4ISI.mapCardIdData(cardIdGroup, cardInfo, continuation);
        return mapCardIdData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mapCardIdData : kotlin.Unit.INSTANCE;
    }
}
