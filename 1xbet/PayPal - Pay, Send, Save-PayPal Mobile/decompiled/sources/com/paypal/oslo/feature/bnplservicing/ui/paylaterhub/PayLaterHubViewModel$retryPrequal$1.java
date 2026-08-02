package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$retryPrequal$1", f = "PayLaterHubViewModel.kt", i = {1, 1}, l = {283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubViewModel$retryPrequal$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase prequalificationAmountUseCase;
        com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            prequalificationAmountUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            supportedCpisConfig = this.getHighSpeedVideoSizes.getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = prequalificationAmountUseCase.invoke2((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>) supportedCpisConfig.supportedPrequalCpis(), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                payLaterHubViewModel = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                payLaterHubViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) || (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData)) {
            java.lang.Object data = useCaseResult.getData();
            com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount = data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount ? (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) data : null;
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel2 = this.getHighSpeedVideoSizes;
            payLaterHubOverviewMapper = payLaterHubViewModel2.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prequalificationAmount);
            this.getHighSpeedVideoFpsRanges = payLaterHubViewModel2;
            this.getHighSpeedVideoFpsRangesFor = 2;
            obj = payLaterHubOverviewMapper.derivePrequalSection(prequalificationAmount, this);
            if (obj != coroutine_suspended) {
                payLaterHubViewModel = payLaterHubViewModel2;
                payLaterHubViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        this.getHighSpeedVideoSizes.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$retryPrequal$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$retryPrequal$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubViewModel$retryPrequal$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel payLaterHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel$retryPrequal$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = payLaterHubViewModel;
    }
}
