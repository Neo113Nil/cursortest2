package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReissueCardUseCase;", "reissueCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentShipmentUseCase;", "getDebitInstrumentShipmentUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReissueCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentShipmentUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;Landroid/content/Context;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReissueCardUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentShipmentUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "", "Ljava/lang/String;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardReplacementSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getHighSpeedVideoFpsRangesFor;

    public CardReplacementSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase reissueCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getDebitInstrumentShipmentUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, android.content.Context context, com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reissueCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentShipmentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDateFormatter, "");
        this.Camera2StreamConfigurationMap = reissueCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getDebitInstrumentShipmentUseCase;
        this.getHighSpeedVideoFpsRangesFor = cardReplacementInfo;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = debitCardDateFormatter;
        this.getOutputMinFrameDuration = cardReplacementInfo.getBillingAddressId();
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent cardReplacementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState cardReplacementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(cardReplacementEvent, cardReplacementState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent cardReplacementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState cardReplacementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (cardReplacementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.AddressChanged) {
            this.getOutputMinFrameDuration = ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.AddressChanged) cardReplacementEvent).getAddressId();
        } else if ((cardReplacementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.SendNewCardClicked) || (cardReplacementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.RetryButtonClicked)) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0192, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware$reissueCard$1 cardReplacementSideEffectsMiddleware$reissueCard$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest reissueCardRequest;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        java.lang.Object rightValue;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment shipment;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails shipmentDetails;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware$reissueCard$1) {
            cardReplacementSideEffectsMiddleware$reissueCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware$reissueCard$1) continuation;
            if ((cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardReplacementSideEffectsMiddleware$reissueCard$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str2 = this.getOutputMinFrameDuration;
                    str = (str2 == null || str2.length() <= 0) ? null : str2;
                    reissueCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest(this.getHighSpeedVideoFpsRangesFor.getDebitInstrumentId(), com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.resolveReissueCardReason(this.getHighSpeedVideoFpsRangesFor.getFlowType()), str);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase reissueCardUseCase = this.Camera2StreamConfigurationMap;
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoSizes = function1;
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reissueCardRequest);
                    cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap = 1;
                    obj = reissueCardUseCase.invoke2(reissueCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardResponse>>) cardReplacementSideEffectsMiddleware$reissueCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function1 = (kotlin.jvm.functions.Function1) cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior = (arrow.core.Ior) obj;
                        if (ior instanceof arrow.core.Ior.Left) {
                            rightValue = null;
                        } else if (ior instanceof arrow.core.Ior.Right) {
                            rightValue = ((arrow.core.Ior.Right) ior).getValue();
                        } else {
                            if (!(ior instanceof arrow.core.Ior.Both)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            rightValue = ((arrow.core.Ior.Both) ior).getRightValue();
                        }
                        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse reissueCardShipmentResponse = (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse) rightValue;
                        java.lang.String estimatedArrivalDate = (reissueCardShipmentResponse == null || (shipment = reissueCardShipmentResponse.getShipment()) == null || (shipmentDetails = shipment.getShipmentDetails()) == null) ? null : shipmentDetails.getEstimatedArrivalDate();
                        kotlin.Pair<java.lang.String, java.lang.String> resolveSuccessContent = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.resolveSuccessContent(this.getHighSpeedVideoFpsRangesFor.getFlowType(), this.getHighSpeedVideoFpsRanges, estimatedArrivalDate != null ? this.getHighSpeedVideoSizes.formatToMonthDay(estimatedArrivalDate) : null);
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementSuccess(resolveSuccessContent.component1(), resolveSuccessContent.component2()));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest reissueCardRequest2 = (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest) cardReplacementSideEffectsMiddleware$reissueCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    reissueCardRequest = reissueCardRequest2;
                    function1 = function12;
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getDebitInstrumentShipmentUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String name2 = this.getHighSpeedVideoFpsRangesFor.getProductName().name();
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoSizes = function1;
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reissueCardRequest);
                    cardReplacementSideEffectsMiddleware$reissueCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap = 2;
                    obj = getDebitInstrumentShipmentUseCase.invoke(name2, cardReplacementSideEffectsMiddleware$reissueCard$1);
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    pairArr[0] = kotlin.TuplesKt.to("errorTag", error.getTag());
                    java.lang.String errorMessage = error.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    pairArr[1] = kotlin.TuplesKt.to("errorMessage", errorMessage);
                    java.lang.String correlationId = error.getCorrelationId();
                    pairArr[2] = kotlin.TuplesKt.to("correlationId", correlationId != null ? correlationId : "");
                    com.paypal.android.logger.Logger.d$default(logger, "Card replacement request failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), error.getTag()));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        cardReplacementSideEffectsMiddleware$reissueCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware$reissueCard$1(this, continuation);
        java.lang.Object obj2 = cardReplacementSideEffectsMiddleware$reissueCard$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardReplacementSideEffectsMiddleware$reissueCard$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
    }
}
