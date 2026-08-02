package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$launchConnectSdk$1", f = "FinicityFlowViewModel.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 224}, m = "invokeSuspend", n = {"redirectUrl", "redirectUrl", "result"}, nl = {224, 225}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class FinicityFlowViewModel$launchConnectSdk$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.app.Activity getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
    
        if (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.access$handleConnectSdkSuccess(r10.getInputFormats, (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult) ((arrow.core.Either.Right) r11).getValue(), r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ec, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r11 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.String str;
        java.lang.String access$getRedirectUrlForOAuth;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase initiateMastercardConnectUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getOutputMinFrameDuration;
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel = this.getInputFormats;
            do {
                value = mutableStateFlow.getValue();
                str = finicityFlowViewModel.getInputFormats;
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading(str)));
            access$getRedirectUrlForOAuth = com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.access$getRedirectUrlForOAuth(this.getInputFormats);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            integrationType = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, integrationType.name());
            pairArr[1] = kotlin.TuplesKt.to("hasRedirectUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(access$getRedirectUrlForOAuth.length() > 0));
            com.paypal.android.logger.Logger.i$default(logger, "Launching Mastercard Connect SDK", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            initiateMastercardConnectUseCase = this.getInputFormats.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$getRedirectUrlForOAuth);
            this.Camera2StreamConfigurationMap = 1;
            obj = initiateMastercardConnectUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, access$getRedirectUrlForOAuth, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            access$getRedirectUrlForOAuth = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$getRedirectUrlForOAuth);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.Camera2StreamConfigurationMap = 2;
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.access$handleConnectSdkError(this.getInputFormats, (com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError) ((arrow.core.Either.Left) either).getValue());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$launchConnectSdk$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$launchConnectSdk$1(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinicityFlowViewModel$launchConnectSdk$1(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, android.app.Activity activity, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$launchConnectSdk$1> continuation) {
        super(2, continuation);
        this.getInputFormats = finicityFlowViewModel;
        this.getHighSpeedVideoFpsRangesFor = activity;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
