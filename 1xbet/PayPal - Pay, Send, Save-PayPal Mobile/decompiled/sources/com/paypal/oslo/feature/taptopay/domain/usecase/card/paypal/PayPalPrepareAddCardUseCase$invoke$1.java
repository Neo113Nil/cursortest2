package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1", f = "PayPalPrepareAddCardUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {66, 81, 86, 91, 94, 75}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "this_$iv", "result", "riskDecision", "$i$f$fold", "$i$a$-fold-PayPalPrepareAddCardUseCase$invoke$1$2", "$i$a$-let-PayPalPrepareAddCardUseCase$invoke$1$2$1", "$this$channelFlow", "this_$iv", "result", "riskDecision", "$i$f$fold", "$i$a$-fold-PayPalPrepareAddCardUseCase$invoke$1$2", "$i$a$-let-PayPalPrepareAddCardUseCase$invoke$1$2$1", "$this$channelFlow", "this_$iv", "result", "riskDecision", "$i$f$fold", "$i$a$-fold-PayPalPrepareAddCardUseCase$invoke$1$2", "$i$a$-let-PayPalPrepareAddCardUseCase$invoke$1$2$1", "$this$channelFlow", "this_$iv", "result", "$this$invokeSuspend_u24lambda_u241_u241", "$i$f$fold", "$i$a$-fold-PayPalPrepareAddCardUseCase$invoke$1$2", "$i$a$-run-PayPalPrepareAddCardUseCase$invoke$1$2$2", "$this$channelFlow", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayPalPrepareAddCardUseCase$invoke$1$1"}, nl = {73, 82, 87, 79, 95, 76}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalPrepareAddCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase getOutputMinFrameDurationlomOqCM;
    private /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r0.send(r8, r13) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0122, code lost:
    
        if (r0.send(r8, r13) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
    
        if (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase.access$sendResult(r2, r0, r5, r13) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017a, code lost:
    
        if (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase.access$sendResult(r2, r0, r5, r13) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01af, code lost:
    
        if (r0.send(r2, r13) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        if (r14 != r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository;
        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getOutputStallDurationlomOqCM) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                payPalCardRepository = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
                java.lang.String str = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.String str3 = this.getHighSpeedVideoSizes;
                cardRepository = this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope;
                this.getOutputStallDurationlomOqCM = 1;
                obj = payPalCardRepository.prepareAddCard(str, cardType, str2, str3, cardRepository.getWalletPartner(), this.getHighSpeedVideoFpsRanges, this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase = this.getOutputMinFrameDurationlomOqCM;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult payPalPrepareAddCardResult = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision = payPalPrepareAddCardResult.getRiskDecision();
                    if (riskDecision != null) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode = riskDecision.getDecisionCode();
                        int i = decisionCode == null ? -1 : com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1.WhenMappings.$EnumSwitchMapping$0[decisionCode.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined riskDeclined = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined.INSTANCE;
                                this.getOutputSizes = producerScope;
                                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                this.getOutputFormats = payPalPrepareAddCardUseCase;
                                this.getOutputStallDuration = payPalPrepareAddCardResult;
                                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskDecision);
                                this.getOutputMinFrameDuration = 0;
                                this.getInputFormats = 0;
                                this.getInputSizeshNQ4ISI = 0;
                                this.getOutputStallDurationlomOqCM = 2;
                                break;
                            } else if (i == 2) {
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge stepUpAuthChallenge = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge(riskDecision.getContextId());
                                this.getOutputSizes = producerScope;
                                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                this.getOutputFormats = payPalPrepareAddCardUseCase;
                                this.getOutputStallDuration = payPalPrepareAddCardResult;
                                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskDecision);
                                this.getOutputMinFrameDuration = 0;
                                this.getInputFormats = 0;
                                this.getInputSizeshNQ4ISI = 0;
                                this.getOutputStallDurationlomOqCM = 3;
                                break;
                            } else if (i != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return coroutine_suspended;
                        }
                        this.getOutputSizes = producerScope;
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getOutputFormats = payPalPrepareAddCardUseCase;
                        this.getOutputStallDuration = payPalPrepareAddCardResult;
                        this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskDecision);
                        this.getOutputMinFrameDuration = 0;
                        this.getInputFormats = 0;
                        this.getInputSizeshNQ4ISI = 0;
                        this.getOutputStallDurationlomOqCM = 4;
                        break;
                    } else {
                        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalPrepareAddCardResult);
                        this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputMinFrameDuration = 0;
                        this.getInputFormats = 0;
                        this.getInputSizeshNQ4ISI = 0;
                        this.getOutputStallDurationlomOqCM = 5;
                        break;
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError prepareAddCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error access$toPayPalPrepareAddCardError = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase.access$toPayPalPrepareAddCardError(payPalPrepareAddCardUseCase, prepareAddCardError.getServiceApiError());
                    this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prepareAddCardError);
                    this.getOutputMinFrameDuration = 0;
                    this.getInputFormats = 0;
                    this.getOutputStallDurationlomOqCM = 6;
                    break;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null));
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null));
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.DECLINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.STEPUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.APPROVED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1 payPalPrepareAddCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1(this.getOutputMinFrameDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        payPalPrepareAddCardUseCase$invoke$1.getOutputSizes = obj;
        return payPalPrepareAddCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalPrepareAddCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = payPalPrepareAddCardUseCase;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = cardType;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoFpsRanges = flowEntryPoint;
    }
}
