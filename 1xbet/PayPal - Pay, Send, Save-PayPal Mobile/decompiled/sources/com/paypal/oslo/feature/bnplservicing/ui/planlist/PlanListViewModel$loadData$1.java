package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$loadData$1", f = "PlanListViewModel.kt", i = {1, 1, 1}, l = {73, 78}, m = "invokeSuspend", n = {"result", "it", "$i$a$-let-PlanListViewModel$loadData$1$event$1"}, nl = {72, 78}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanListViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r6 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase getPlanListOverviewUseCase;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error error;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPlanListOverviewUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.INSTANCE;
            supportedCpisConfig = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = getPlanListOverviewUseCase.invoke2(companion.getDefaultPlansListInput(supportedCpisConfig.supportedCpis()), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel) obj;
                if (planListUiModel != null) {
                    error = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded(planListUiModel);
                    this.getHighSpeedVideoFpsRanges.processEvent(error);
                    return kotlin.Unit.INSTANCE;
                }
                error = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error.INSTANCE;
                this.getHighSpeedVideoFpsRanges.processEvent(error);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData();
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview ? (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) data : null;
            if (plansOverview != null) {
                planListMapper = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansOverview);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.Camera2StreamConfigurationMap = 2;
                obj = planListMapper.toPlanListUiModel(plansOverview, this);
            }
            error = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error.INSTANCE;
            this.getHighSpeedVideoFpsRanges.processEvent(error);
            return kotlin.Unit.INSTANCE;
        }
        error = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error.INSTANCE;
        this.getHighSpeedVideoFpsRanges.processEvent(error);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$loadData$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanListViewModel$loadData$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel planListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = planListViewModel;
    }
}
