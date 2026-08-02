package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebView$1$1", f = "StepupWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupWebViewKt$StepupWebView$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        pairArr[0] = kotlin.TuplesKt.to("challengeUri", this.getHighSpeedVideoFpsRangesFor.getWebChallengeUrl());
        pairArr[1] = kotlin.TuplesKt.to("returnUri", this.getHighSpeedVideoFpsRangesFor.getReturnUri());
        pairArr[2] = kotlin.TuplesKt.to("returnUriParam", this.getHighSpeedVideoFpsRangesFor.getReturnUriParam());
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, this.getHighSpeedVideoFpsRangesFor.getStepUpContextId());
        java.lang.String flowName = this.getHighSpeedVideoFpsRangesFor.getFlowName();
        if (flowName == null) {
            flowName = "";
        }
        pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, flowName);
        java.lang.String flowContext = this.getHighSpeedVideoFpsRangesFor.getFlowContext();
        pairArr[5] = kotlin.TuplesKt.to("flowContext", flowContext != null ? flowContext : "");
        com.paypal.android.logger.Logger.d$default(logger, "StepupWebView opened", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        this.Camera2StreamConfigurationMap.initializeChallenge(this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebView$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebView$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupWebViewKt$StepupWebView$1$1(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel stepupWebViewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebView$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = webViewChallenge;
        this.Camera2StreamConfigurationMap = stepupWebViewViewModel;
    }
}
