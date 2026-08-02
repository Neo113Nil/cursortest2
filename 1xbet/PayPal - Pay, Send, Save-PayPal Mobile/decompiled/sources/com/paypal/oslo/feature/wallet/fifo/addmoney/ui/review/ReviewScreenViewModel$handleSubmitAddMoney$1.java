package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$handleSubmitAddMoney$1", f = "ReviewScreenViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {259, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {"currentState", "selectedFundingSource", "amount", "depositAmount", "currentState", "selectedFundingSource", "amount", "depositAmount", "result", "error", "fulfillment"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 282}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes15.dex */
final class ReviewScreenViewModel$handleSubmitAddMoney$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x011b, code lost:
    
        if (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.access$handleDepositSuccess(r11.getInputSizeshNQ4ISI, r7, r4.getPlanId(), r1, r11) == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase depositFulfillmentUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            java.lang.Object value2 = mutableStateFlow.getValue();
            fundingInstrumentUiModel = null;
            content = value2 instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content ? (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content) value2 : null;
            if (content != null && (fundingSourceSection = content.getFundingSourceSection()) != null) {
                fundingInstrumentUiModel = fundingSourceSection.getSelectedFundingSource();
            }
            if (content == null || fundingInstrumentUiModel == null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasState", java.lang.String.valueOf(content != null));
                pairArr[1] = kotlin.TuplesKt.to("hasFundingSource", java.lang.String.valueOf(fundingInstrumentUiModel != null));
                com.paypal.android.logger.Logger.w$default(logger, "Cannot submit add money: missing state or funding source", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            java.lang.String amount = content.getAmount();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(content.getCurrencyCode(), amount);
            mutableStateFlow2 = this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Loading.INSTANCE));
            depositFulfillmentUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = content;
            this.getHighSpeedVideoSizes = fundingInstrumentUiModel;
            this.getHighSpeedVideoFpsRanges = amount;
            this.getHighSpeedVideoFpsRangesFor = money2;
            this.getOutputMinFrameDuration = 1;
            java.lang.Object invoke = depositFulfillmentUseCase.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest(fundingInstrumentUiModel.getPlanId(), com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.CONSUMER_TRANSFERS, money2, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.ADD_FUNDS), this);
            if (invoke != coroutine_suspended) {
                str = amount;
                obj = invoke;
                money = money2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        money = (com.paypal.oslo.feature.wallet.common.domain.model.Money) this.getHighSpeedVideoFpsRangesFor;
        str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
        fundingInstrumentUiModel = (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel) this.getHighSpeedVideoSizes;
        content = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError depositFulfillmentError = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError) ior.leftOrNull();
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult depositFulfillmentResult = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult) ior.getOrNull();
        if (depositFulfillmentError != null) {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.access$handleDepositError(this.getInputSizeshNQ4ISI, depositFulfillmentError, new com.paypal.oslo.feature.wallet.common.domain.model.Money(content.getCurrencyCode(), str));
        } else if (depositFulfillmentResult != null) {
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrumentUiModel);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositFulfillmentError);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositFulfillmentResult);
            this.getOutputMinFrameDuration = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$handleSubmitAddMoney$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$handleSubmitAddMoney$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$handleSubmitAddMoney$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$handleSubmitAddMoney$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = reviewScreenViewModel;
    }
}
