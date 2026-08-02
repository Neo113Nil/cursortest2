package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$cancelAutopay$1", f = "UpdateAutopayViewModel.kt", i = {1, 1, 1, 1}, l = {85, 92}, m = "invokeSuspend", n = {"result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "it", "$i$a$-let-UpdateAutopayViewModel$cancelAutopay$1$formattedAmount$1"}, nl = {84, 91}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class UpdateAutopayViewModel$cancelAutopay$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r13 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase cancelAutopayUseCase;
        com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult cancelAutoPayResult;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter;
        com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult cancelAutoPayResult2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cancelAutopayUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = 1;
            obj = cancelAutopayUseCase.invoke2(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.name(), this.getHighSpeedVideoFpsRanges), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cancelAutoPayResult2 = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                str = (java.lang.String) obj;
                cancelAutoPayResult = cancelAutoPayResult2;
                this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated(null, new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel(str, cancelAutoPayResult.getNextPaymentDueDate()), 1, null));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
            cancelAutoPayResult = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult) data;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money nextPaymentDueAmount = cancelAutoPayResult.getNextPaymentDueAmount();
            if (nextPaymentDueAmount != null) {
                bnplServFormatter = this.getOutputFormats.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                this.getOutputMinFrameDuration = cancelAutoPayResult;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(nextPaymentDueAmount);
                this.getHighSpeedVideoSizes = 0;
                this.getInputFormats = 2;
                obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, nextPaymentDueAmount, null, 0, this, 6, null);
                if (obj != coroutine_suspended) {
                    cancelAutoPayResult2 = cancelAutoPayResult;
                    str = (java.lang.String) obj;
                    cancelAutoPayResult = cancelAutoPayResult2;
                    this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated(null, new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel(str, cancelAutoPayResult.getNextPaymentDueDate()), 1, null));
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            str = null;
            this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated(null, new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel(str, cancelAutoPayResult.getNextPaymentDueDate()), 1, null));
            return kotlin.Unit.INSTANCE;
        }
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) {
            this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError(((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$cancelAutopay$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$cancelAutopay$1(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateAutopayViewModel$cancelAutopay$1(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$cancelAutopay$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = updateAutopayViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
