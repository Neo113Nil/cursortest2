package com.paypal.oslo.feature.checkcapture.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1", f = "CheckCaptureViewModel.kt", i = {1, 1, 1, 1}, l = {183, 197}, m = "invokeSuspend", n = {"this_$iv", "sessionDetails", "$i$f$fold", "$i$a$-fold-CheckCaptureViewModel$authenticateUser$1$2"}, nl = {204, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class CheckCaptureViewModel$authenticateUser$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (r1.send(r4, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext;
        com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase authenticateCheckCaptureUserUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Loading.INSTANCE);
            com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics checkCaptureAnalytics = com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE;
            businessFlowContext = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(checkCaptureAnalytics.createLoadingScreenAppearedEvent(businessFlowContext));
            authenticateCheckCaptureUserUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizesFor = 1;
            obj = authenticateCheckCaptureUserUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel = this.getInputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails = (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow3 = checkCaptureViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success(checkCaptureSessionDetails));
            channel = checkCaptureViewModel.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect.NavigateToIngo navigateToIngo = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect.NavigateToIngo(checkCaptureSessionDetails);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkCaptureSessionDetails);
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizesFor = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError checkCaptureError = (com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow2 = checkCaptureViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.AUTHENTICATION_FAILED, checkCaptureError.getMessage(), i2));
            com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics checkCaptureAnalytics2 = com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE;
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType = com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.AUTHENTICATION_FAILED;
            businessFlowContext2 = checkCaptureViewModel.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(checkCaptureAnalytics2.createErrorScreenAppearedEvent(checkCaptureErrorType, businessFlowContext2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckCaptureViewModel$authenticateUser$1(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = checkCaptureViewModel;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
