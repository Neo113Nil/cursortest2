package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$refreshPlansOnly$1", f = "PayLaterHubViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {322, 325}, m = "invokeSuspend", n = {"$this$launch", "input", "currentModel", "planListLimit", "$this$launch", "input", "currentModel", "result", "plansOverview", "planListLimit"}, nl = {323, com.visa.cbp.getCertUsage.getAucAID}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubViewModel$refreshPlansOnly$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r13 == r1) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput refreshPlansInput;
        com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig;
        int planListLimit;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase refreshPlansUseCase;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            refreshPlansInput = new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput(this.getHighSpeedVideoFpsRanges);
            payLaterHubConfig = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            planListLimit = payLaterHubConfig.getUIs().getPlansSection().getPlanListLimit();
            mviStateStore = this.getHighSpeedVideoSizesFor.getInputFormats;
            java.lang.Object value = mviStateStore.getUiState().getValue();
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content content = value instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content ? (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content) value : null;
            if (content != null && (model = content.getModel()) != null) {
                refreshPlansUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(refreshPlansInput);
                this.Camera2StreamConfigurationMap = model;
                this.getHighResolutionOutputSizeshNQ4ISI = planListLimit;
                this.getOutputFormats = 1;
                obj = refreshPlansUseCase.invoke2(refreshPlansInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
            } else {
                this.getHighSpeedVideoSizesFor.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizesFor.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
            planListLimit = this.getHighResolutionOutputSizeshNQ4ISI;
            model = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel) this.Camera2StreamConfigurationMap;
            refreshPlansInput = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i2 = planListLimit;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = model;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) || (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
            java.lang.Object data = useCaseResult.getData();
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview ? (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) data : null;
            payLaterHubOverviewMapper = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            boolean hasEverUsedBnpl = plansOverview != null ? plansOverview.getHasEverUsedBnpl() : true;
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(refreshPlansInput);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubUiModel);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansOverview);
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getOutputFormats = 2;
            obj = payLaterHubOverviewMapper.mergeRefreshedPlans(payLaterHubUiModel, plansOverview, i2, hasEverUsedBnpl, this);
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizesFor.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$refreshPlansOnly$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$refreshPlansOnly$1 payLaterHubViewModel$refreshPlansOnly$1 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$refreshPlansOnly$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, continuation);
        payLaterHubViewModel$refreshPlansOnly$1.getInputFormats = obj;
        return payLaterHubViewModel$refreshPlansOnly$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubViewModel$refreshPlansOnly$1(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$refreshPlansOnly$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = plansListInput;
        this.getHighSpeedVideoSizesFor = payLaterHubViewModel;
    }
}
