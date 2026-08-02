package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsDeleter;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "localCardDataRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "cardId", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TermsAndConditionsDeleter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TermsAndConditionsDeleter(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalLocalCardDataRepository, "");
        this.getHighSpeedVideoFpsRangesFor = payPalLocalCardDataRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Deleting Terms and Conditions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id", cardId)), null, 4, null);
        java.lang.Object deleteTermsAndConditions = this.getHighSpeedVideoFpsRangesFor.deleteTermsAndConditions(cardId, continuation);
        return deleteTermsAndConditions == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteTermsAndConditions : kotlin.Unit.INSTANCE;
    }
}
