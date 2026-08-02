package com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$3", f = "EConsentViewModel.kt", i = {0}, l = {101}, m = "invokeSuspend", n = {"webViewData"}, nl = {102}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class EConsentViewModel$onEvent$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            handleInAppLinkUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData invoke = handleInAppLinkUseCase.invoke(((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick) this.Camera2StreamConfigurationMap).getLink());
            mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
            this.getHighSpeedVideoFpsRanges = 1;
            if (mutableSharedFlow.emit(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView(invoke), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$3(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EConsentViewModel$onEvent$3(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event event, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = eConsentViewModel;
        this.Camera2StreamConfigurationMap = event;
    }
}
