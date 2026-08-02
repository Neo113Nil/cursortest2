package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$1", f = "CloseAccountWebViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, nl = {51}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class CloseAccountWebViewModel$setResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            closeAccountUseCasesProvider = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (closeAccountUseCasesProvider.getLogout().invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        mutableSharedFlow.tryEmit(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.CLOSE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseAccountWebViewModel$setResult$1(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel closeAccountWebViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = closeAccountWebViewModel;
    }
}
