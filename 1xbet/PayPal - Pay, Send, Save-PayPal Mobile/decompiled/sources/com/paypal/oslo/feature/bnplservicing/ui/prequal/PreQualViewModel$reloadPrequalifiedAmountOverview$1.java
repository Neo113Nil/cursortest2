package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$reloadPrequalifiedAmountOverview$1", f = "PreQualViewModel.kt", i = {1, 1, 1}, l = {108, 111}, m = "invokeSuspend", n = {"result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$i$a$-let-PreQualViewModel$reloadPrequalifiedAmountOverview$1$event$1"}, nl = {109, 112}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PreQualViewModel$reloadPrequalifiedAmountOverview$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase prequalificationAmountUseCase;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig;
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error error;
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper preQualMapper;
        com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            prequalificationAmountUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            supportedCpisConfig = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = prequalificationAmountUseCase.invoke2((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>) supportedCpisConfig.supportedPrequalCpis(), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                prequalificationAmount = (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                error = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded((java.lang.String) obj, prequalificationAmount.getPreQualificationEligible());
                this.getHighSpeedVideoFpsRanges.processEvent(error);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData();
            com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount2 = data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount ? (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) data : null;
            if (prequalificationAmount2 != null) {
                preQualMapper = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money spendingPower = prequalificationAmount2.getSpendingPower();
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                this.Camera2StreamConfigurationMap = prequalificationAmount2;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizes = 2;
                obj = preQualMapper.formatSpendingPower(spendingPower, this);
                if (obj != coroutine_suspended) {
                    prequalificationAmount = prequalificationAmount2;
                    error = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded((java.lang.String) obj, prequalificationAmount.getPreQualificationEligible());
                }
                return coroutine_suspended;
            }
            error = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error.INSTANCE;
        } else {
            error = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error.INSTANCE;
        }
        this.getHighSpeedVideoFpsRanges.processEvent(error);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$reloadPrequalifiedAmountOverview$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$reloadPrequalifiedAmountOverview$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreQualViewModel$reloadPrequalifiedAmountOverview$1(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel preQualViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$reloadPrequalifiedAmountOverview$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = preQualViewModel;
    }
}
