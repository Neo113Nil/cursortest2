package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$loadData$1", f = "PreQualViewModel.kt", i = {1, 2, 2}, l = {77, 78, 87}, m = "invokeSuspend", n = {"result", "result", "hasPrequalAmountError"}, nl = {78, 80, 89}, s = {"L$0", "L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PreQualViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r8 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r8 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        if (r8 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase getPrequalificationSummaryUseCase;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig;
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error error;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = 1;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPrequalificationSummaryUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            supportedCpisConfig = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getPrequalificationSummaryUseCase.invoke2((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>) supportedCpisConfig.supportedPrequalCpis(), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    error = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent) obj;
                    this.Camera2StreamConfigurationMap.processEvent(error);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                error = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent) obj;
                this.Camera2StreamConfigurationMap.processEvent(error);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
            if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) {
                com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess partialSuccess = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) useCaseResult;
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> errors = partialSuccess.getErrors();
                if (!(errors instanceof java.util.Collection) || !errors.isEmpty()) {
                    for (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError bNPLError : errors) {
                        if ((bNPLError instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError) && ((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError) bNPLError).getError() == com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PREQUALIFICATION_SUMMARY_AMOUNT) {
                            break;
                        }
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                    this.getHighSpeedVideoFpsRanges = 3;
                    obj = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel.access$mapToDataLoadedEvent(this.Camera2StreamConfigurationMap, partialSuccess.getData(), this);
                } else {
                    error = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error.INSTANCE;
                }
            } else {
                error = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error.INSTANCE;
            }
            this.Camera2StreamConfigurationMap.processEvent(error);
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
        this.getHighSpeedVideoFpsRanges = 2;
        obj = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel.access$mapToDataLoadedEvent(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData(), this);
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$loadData$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreQualViewModel$loadData$1(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel preQualViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = preQualViewModel;
    }
}
