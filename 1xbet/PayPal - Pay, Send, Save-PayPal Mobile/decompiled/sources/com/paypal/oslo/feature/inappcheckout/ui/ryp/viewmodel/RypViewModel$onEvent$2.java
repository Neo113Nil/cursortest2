package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$2", f = "RypViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RypViewModel$onEvent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView(new com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData(((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick) this.getHighSpeedVideoSizes).getUrl(), ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick) this.getHighSpeedVideoSizes).getTitle(), com.paypal.oslo.feature.inappcheckout.Constants.PAYPAL_CREDIT_TERMS_SOURCE, false)), null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RypViewModel$onEvent$2(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event event, com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = event;
        this.getHighSpeedVideoFpsRanges = rypViewModel;
    }
}
