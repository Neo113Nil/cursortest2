package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt$MockSelectionScreen$1$1", f = "MockSelectionScreen.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MockSelectionScreenKt$MockSelectionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect> effect = this.Camera2StreamConfigurationMap.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt$MockSelectionScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    if (!(((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect) obj2) instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect.NavigateToOneShot)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToOneShot(null);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt$MockSelectionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt$MockSelectionScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockSelectionScreenKt$MockSelectionScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel mockSelectionViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt$MockSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mockSelectionViewModel;
        this.getHighSpeedVideoFpsRangesFor = inAppCheckoutCoordinator;
    }
}
