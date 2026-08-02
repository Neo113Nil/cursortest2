package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1", f = "ChangeFiViewModel.kt", i = {0, 1, 1, 1, 1}, l = {215, 225}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "result", "fundingInstrument", "$i$a$-let-ChangeFiViewModel$updateAutopay$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 226}, s = {"L$0", "L$0", "L$1", "L$4", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiViewModel$updateAutopay$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel getInputFormats;
    java.lang.Object getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r9 != r1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase updateAutopayUseCase;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updateAutopayUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = coroutineScope;
            this.getHighSpeedVideoSizesFor = 1;
            obj = updateAutopayUseCase.invoke2(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.UpdateAutoPayInput(this.getInputFormats.getArgs().getCreditAccountId(), this.getInputFormats.getArgs().getCreditProductIdentifier(), this.getHighResolutionOutputSizeshNQ4ISI.getFundingInstrument()), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onConfirmClicked = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked) this.Camera2StreamConfigurationMap;
                changeFiViewModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess((com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj, onConfirmClicked.getFlowType()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = ((com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult) data).getFundingInstrument();
            if (fundingInstrument != null) {
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel2 = this.getInputFormats;
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked2 = this.getHighResolutionOutputSizeshNQ4ISI;
                changeFiMapper = changeFiViewModel2.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = coroutineScope;
                this.getHighSpeedVideoFpsRanges = useCaseResult;
                this.getHighSpeedVideoFpsRangesFor = changeFiViewModel2;
                this.Camera2StreamConfigurationMap = onConfirmClicked2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoSizesFor = 2;
                obj = changeFiMapper.toFundingInstrumentUiModel(fundingInstrument, this);
                if (obj != coroutine_suspended) {
                    changeFiViewModel = changeFiViewModel2;
                    onConfirmClicked = onConfirmClicked2;
                    changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess((com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj, onConfirmClicked.getFlowType()));
                }
                return coroutine_suspended;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel3 = this.getInputFormats;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked3 = this.getHighResolutionOutputSizeshNQ4ISI;
            changeFiViewModel3.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError(success.getCorrelationId(), onConfirmClicked3.getCreditAccountId(), onConfirmClicked3.getCpi(), onConfirmClicked3.getFundingInstrument()));
        } else if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) {
            this.getInputFormats.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError(((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId(), this.getHighResolutionOutputSizeshNQ4ISI.getCreditAccountId(), this.getHighResolutionOutputSizeshNQ4ISI.getCpi(), this.getHighResolutionOutputSizeshNQ4ISI.getFundingInstrument()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1 changeFiViewModel$updateAutopay$1 = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        changeFiViewModel$updateAutopay$1.getOutputMinFrameDuration = obj;
        return changeFiViewModel$updateAutopay$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiViewModel$updateAutopay$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1> continuation) {
        super(2, continuation);
        this.getInputFormats = changeFiViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = onConfirmClicked;
    }
}
