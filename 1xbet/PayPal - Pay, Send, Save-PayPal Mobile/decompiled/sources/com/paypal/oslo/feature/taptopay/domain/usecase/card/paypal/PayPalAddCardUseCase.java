package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0086\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010+R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalAddCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalPrepareAddCardUseCase;", "prepareAddCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/AddCardUseCase;", "addCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalOnDigitizationCompletedUseCase;", "payPalOnDigitizationCompletedUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "paypalCardIdGroupUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;", "payPalGetCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ContinueAddCardUseCase;", "continueAddCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalUploadTermsAndConditionUseCase;", "payPalUploadTermsAndConditionUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;", "deleteCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalPrepareAddCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/AddCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalOnDigitizationCompletedUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ContinueAddCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalUploadTermsAndConditionUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;)V", "", "paypalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "cardArtCollection", "clientMetadataId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "cardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;", "flowEntryPoint", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalPrepareAddCardUseCase;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/AddCardUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalOnDigitizationCompletedUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ContinueAddCardUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalUploadTermsAndConditionUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalAddCardUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayPalAddCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase payPalOnDigitizationCompletedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase continueAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase payPalUploadTermsAndConditionUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalPrepareAddCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalOnDigitizationCompletedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continueAddCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalUploadTermsAndConditionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardIdGroupUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = payPalPrepareAddCardUseCase;
        this.Camera2StreamConfigurationMap = addCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalOnDigitizationCompletedUseCase;
        this.getHighSpeedVideoSizes = payPalGetCardIdGroupUseCase;
        this.getHighSpeedVideoFpsRanges = payPalGetCardUseCase;
        this.getHighSpeedVideoSizesFor = continueAddCardUseCase;
        this.getOutputMinFrameDuration = payPalUploadTermsAndConditionUseCase;
        this.getInputFormats = payPalDeleteCardIdGroupUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> invoke(java.lang.String paypalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String cvv, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, java.lang.String clientMetadataId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "invoke PayPalAddCardUseCase", null, null, 6, null);
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1(this, paypalCardId, cardType, cvv, clientMetadataId, flowEntryPoint, setAsDefault, cardArtCollection, cardInfo, null));
    }

    public static final /* synthetic */ java.lang.Object access$addCard(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, kotlinx.coroutines.channels.ProducerScope producerScope, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "add card", null, null, 6, null);
        java.lang.Object collect = payPalAddCardUseCase.getHighSpeedVideoFpsRangesFor.invoke(str, cardType, str2, str3, flowEntryPoint).collect(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2(producerScope, payPalAddCardUseCase, str, setAsDefault, cardArtCollection, cardInfo), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$addCard(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, kotlinx.coroutines.channels.SendChannel sendChannel, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase = payPalAddCardUseCase.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme = null;
        if (cardInfo != null) {
            if (kotlin.text.StringsKt.equals(cardInfo.getBrand(), com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA, true)) {
                cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.VISA;
            } else if (kotlin.text.StringsKt.equals(cardInfo.getBrand(), com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_MASTERCARD, true)) {
                cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.MASTERCARD;
            } else if (kotlin.text.StringsKt.equals(cardInfo.getBrand(), "pure", true)) {
                cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.PURE;
            }
        }
        java.lang.Object collect = com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase.invoke$default(addCardUseCase, bArr, setAsDefault, cardScheme, null, 8, null).collect(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$4(payPalAddCardUseCase, str, deviceWalletServiceCardId, cardInfo, cardArtCollection, sendChannel), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState access$toPaypalAddCardState(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState payPalPrepareAddCardState) {
        if (payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess) payPalPrepareAddCardState).getDeviceWalletServiceCardId());
        }
        if (payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge) payPalPrepareAddCardState).getContextId());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(payPalPrepareAddCardState, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined.INSTANCE;
        }
        if (payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError) payPalPrepareAddCardState).getThrowable());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(payPalPrepareAddCardState, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.Offline.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline.INSTANCE;
        }
        if (payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError) payPalPrepareAddCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError(responseError.getResponseCode(), responseError.getErrorBody());
        }
        if (!(payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError) payPalPrepareAddCardState).getDebugMessage());
    }
}
