package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$loadData$1", f = "PayLaterHubViewModel.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 193, 202}, m = "invokeSuspend", n = {"input", "planListLimit", "input", "result", "domainModel", "planListLimit", "input", "result", "domainModel", "planListLimit"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 197, 204}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ff, code lost:
    
        if (r10 != r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager featureGateManager;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig2;
        com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager featureGateManager2;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig3;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig4;
        com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig;
        int planListLimit;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase getPayLaterHubOverviewUseCase;
        com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper2;
        com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview payLaterHubOverview;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput.INSTANCE;
            featureGateManager = this.getOutputMinFrameDuration.getInputSizeshNQ4ISI;
            boolean isServicingEnabled = featureGateManager.isServicingEnabled();
            supportedCpisConfig = this.getOutputMinFrameDuration.getOutputFormats;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansInput = companion.plansInput(isServicingEnabled, supportedCpisConfig.supportedCpis());
            supportedCpisConfig2 = this.getOutputMinFrameDuration.getOutputFormats;
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedPrequalCpis = supportedCpisConfig2.supportedPrequalCpis();
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput.Companion companion2 = com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput.INSTANCE;
            featureGateManager2 = this.getOutputMinFrameDuration.getInputSizeshNQ4ISI;
            boolean isInstoreProductEnabled = featureGateManager2.isInstoreProductEnabled();
            supportedCpisConfig3 = this.getOutputMinFrameDuration.getOutputFormats;
            com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput = companion2.applicationEligibilityInput(isInstoreProductEnabled, supportedCpisConfig3.supportedInstoreCpis());
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.Companion companion3 = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.INSTANCE;
            supportedCpisConfig4 = this.getOutputMinFrameDuration.getOutputFormats;
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput2 = new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput(plansInput, companion3.getReadyToUsePlansListInput(supportedCpisConfig4.supportedInstoreCpis()), supportedPrequalCpis, applicationEligibilityInput);
            payLaterHubConfig = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
            planListLimit = payLaterHubConfig.getUIs().getPlansSection().getPlanListLimit();
            getPayLaterHubOverviewUseCase = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubInput2);
            this.getHighResolutionOutputSizeshNQ4ISI = planListLimit;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getPayLaterHubOverviewUseCase.invoke2(payLaterHubInput2, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
            if (obj != coroutine_suspended) {
                payLaterHubInput = payLaterHubInput2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputMinFrameDuration.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            payLaterHubOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview) this.getHighSpeedVideoSizes;
            useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel) obj, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel.access$determineSectionStates(this.getOutputMinFrameDuration, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) useCaseResult).getErrors(), payLaterHubOverview)));
            return kotlin.Unit.INSTANCE;
        }
        planListLimit = this.getHighResolutionOutputSizeshNQ4ISI;
        payLaterHubInput = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult2 = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult2).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview payLaterHubOverview2 = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview) data;
            payLaterHubOverviewMapper3 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubInput);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult2);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubOverview2);
            this.getHighResolutionOutputSizeshNQ4ISI = planListLimit;
            this.getHighSpeedVideoFpsRanges = 2;
            obj = payLaterHubOverviewMapper3.toUiModel(payLaterHubOverview2, planListLimit, this);
        } else {
            if (!(useCaseResult2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
                if (!(useCaseResult2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel = this.getOutputMinFrameDuration;
                payLaterHubOverviewMapper = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                payLaterHubViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError(payLaterHubOverviewMapper.toErrorModel()));
                return kotlin.Unit.INSTANCE;
            }
            T data2 = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) useCaseResult2).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview payLaterHubOverview3 = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview) data2;
            payLaterHubOverviewMapper2 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubInput);
            this.getHighSpeedVideoFpsRangesFor = useCaseResult2;
            this.getHighSpeedVideoSizes = payLaterHubOverview3;
            this.getHighResolutionOutputSizeshNQ4ISI = planListLimit;
            this.getHighSpeedVideoFpsRanges = 3;
            java.lang.Object uiModel = payLaterHubOverviewMapper2.toUiModel(payLaterHubOverview3, planListLimit, this);
            if (uiModel != coroutine_suspended) {
                payLaterHubOverview = payLaterHubOverview3;
                useCaseResult = useCaseResult2;
                obj = uiModel;
                this.getOutputMinFrameDuration.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel) obj, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel.access$determineSectionStates(this.getOutputMinFrameDuration, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) useCaseResult).getErrors(), payLaterHubOverview)));
                return kotlin.Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$loadData$1(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubViewModel$loadData$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = payLaterHubViewModel;
    }
}
