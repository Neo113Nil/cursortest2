package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel$fetchPlanDetails$1", f = "PlanDetailsViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {152, 160, 163}, m = "invokeSuspend", n = {"loadingStartTime", "result", "it", "loadingStartTime", "$i$a$-let-PlanDetailsViewModel$fetchPlanDetails$1$1", "elapsed", "result", "it", "loadingStartTime", "$i$a$-let-PlanDetailsViewModel$fetchPlanDetails$1$1", "elapsed"}, nl = {153, 163, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {"J$0", "L$0", "L$4", "J$0", "I$0", "J$1", "L$0", "L$3", "J$0", "I$0", "J$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsViewModel$fetchPlanDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    long getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase getPlanDetailsOverviewUseCase;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview planDetailsOverview;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel planDetailsViewModel;
        java.lang.String str;
        java.lang.String str2;
        long currentTimeMillis2;
        int i;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper;
        java.lang.Object uiModel;
        java.lang.String str3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputSizes;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            getPlanDetailsOverviewUseCase = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
            this.getOutputSizes = 1;
            invoke2 = getPlanDetailsOverviewUseCase.invoke2(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
            if (invoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) this.getInputSizeshNQ4ISI;
                    planDetailsViewModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel) this.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiModel = obj;
                    planDetailsViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded(str3, (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel) uiModel));
                    return kotlin.Unit.INSTANCE;
                }
                long j = this.getInputFormats;
                int i3 = this.getHighSpeedVideoSizes;
                currentTimeMillis = this.getHighSpeedVideoFpsRangesFor;
                planDetailsOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview) this.getOutputSizeshNQ4ISI;
                java.lang.String str4 = (java.lang.String) this.getOutputFormats;
                str = (java.lang.String) this.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel planDetailsViewModel2 = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel) this.getHighSpeedVideoSizesFor;
                useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                currentTimeMillis2 = j;
                str2 = str4;
                i = i3;
                planDetailsViewModel = planDetailsViewModel2;
                planDetailsMapper = planDetailsViewModel.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = useCaseResult;
                this.getHighSpeedVideoSizesFor = planDetailsViewModel;
                this.getInputSizeshNQ4ISI = str2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(planDetailsOverview);
                this.getOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
                this.getHighSpeedVideoSizes = i;
                this.getInputFormats = currentTimeMillis2;
                this.getOutputSizes = 3;
                uiModel = planDetailsMapper.toUiModel(planDetailsOverview, str, this);
                if (uiModel != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                planDetailsViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded(str3, (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel) uiModel));
                return kotlin.Unit.INSTANCE;
            }
            long j2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke2 = obj;
            currentTimeMillis = j2;
        }
        useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) invoke2;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) || (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
            java.lang.Object data = useCaseResult.getData();
            planDetailsOverview = data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview ? (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview) data : null;
            if (planDetailsOverview != null) {
                planDetailsViewModel = this.getOutputMinFrameDurationlomOqCM;
                str = this.getHighSpeedVideoFpsRanges;
                str2 = this.Camera2StreamConfigurationMap;
                currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < 300) {
                    this.getOutputMinFrameDuration = useCaseResult;
                    this.getHighSpeedVideoSizesFor = planDetailsViewModel;
                    this.getInputSizeshNQ4ISI = str;
                    this.getOutputFormats = str2;
                    this.getOutputSizeshNQ4ISI = planDetailsOverview;
                    this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
                    this.getHighSpeedVideoSizes = 0;
                    this.getInputFormats = currentTimeMillis2;
                    this.getOutputSizes = 2;
                    if (kotlinx.coroutines.DelayKt.delay(300 - currentTimeMillis2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    useCaseResult = useCaseResult;
                }
                i = 0;
                planDetailsMapper = planDetailsViewModel.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = useCaseResult;
                this.getHighSpeedVideoSizesFor = planDetailsViewModel;
                this.getInputSizeshNQ4ISI = str2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(planDetailsOverview);
                this.getOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
                this.getHighSpeedVideoSizes = i;
                this.getInputFormats = currentTimeMillis2;
                this.getOutputSizes = 3;
                uiModel = planDetailsMapper.toUiModel(planDetailsOverview, str, this);
                if (uiModel != coroutine_suspended) {
                }
            } else {
                this.getOutputMinFrameDurationlomOqCM.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError(useCaseResult.getCorrelationId()));
            }
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getOutputMinFrameDurationlomOqCM.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError(((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel$fetchPlanDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel$fetchPlanDetails$1(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsViewModel$fetchPlanDetails$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel planDetailsViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel$fetchPlanDetails$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = planDetailsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = str3;
    }
}
