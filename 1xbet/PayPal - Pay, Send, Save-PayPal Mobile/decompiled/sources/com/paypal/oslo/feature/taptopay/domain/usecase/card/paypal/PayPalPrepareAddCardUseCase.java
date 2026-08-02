package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalPrepareAddCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "payPalCardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;)V", "", "paypalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "clientMetadataId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;", "flowEntryPoint", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalPrepareAddCardUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalPrepareAddCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.Camera2StreamConfigurationMap = payPalCardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepository;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState> invoke(java.lang.String paypalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String cvv, java.lang.String clientMetadataId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1(this, paypalCardId, cardType, cvv, clientMetadataId, flowEntryPoint, null));
    }

    public static final /* synthetic */ java.lang.Object access$sendResult(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase, kotlinx.coroutines.channels.ProducerScope producerScope, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult payPalPrepareAddCardResult, kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        if (payPalPrepareAddCardResult.getEncryptedCardInfo() == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Prepare card error - missing required data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_encrypted_card_info", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))), null, 4, null);
            obj = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState) new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError("Missing required card data: encryptedCardInfo=false");
        } else {
            obj = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState) new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess(payPalPrepareAddCardResult.getDeviceWalletServiceCardId(), payPalPrepareAddCardResult.getEncryptedCardInfo());
        }
        java.lang.Object send = producerScope.send(obj, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error access$toPayPalPrepareAddCardError(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError serviceApiError) {
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) {
            com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) serviceApiError;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError(responseError.getResponseCode(), responseError.getErrorBody());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(serviceApiError, com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.Offline.INSTANCE;
        }
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError(((com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) serviceApiError).getThrowable());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
