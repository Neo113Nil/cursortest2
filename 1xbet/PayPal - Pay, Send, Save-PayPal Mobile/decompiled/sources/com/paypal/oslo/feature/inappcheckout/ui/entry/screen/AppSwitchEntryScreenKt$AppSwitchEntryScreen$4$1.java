package com.paypal.oslo.feature.inappcheckout.ui.entry.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1", f = "AppSwitchEntryScreen.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, nl = {152}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.m15467navigateToCheckoutAuthenticationhN0UB1M(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) this.getHighResolutionOutputSizeshNQ4ISI).getCheckoutAuthenticationContext(), ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) this.getHighResolutionOutputSizeshNQ4ISI).m15520getRequestIdQDVFmTU());
            kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = this.getHighSpeedVideoSizes.m11582getScopedResultFlowInternalDpEMydE(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) this.getHighResolutionOutputSizeshNQ4ISI).m15520getRequestIdQDVFmTU());
            if (m11582getScopedResultFlowInternalDpEMydE != null) {
                final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = 1;
                if (m11582getScopedResultFlowInternalDpEMydE.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel2 = com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.this;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        appSwitchEntryViewModel2.handleCheckoutAuthenticationResult(((com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult) obj2).getResult());
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State state, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = inAppCheckoutCoordinator;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoSizes = navResultManager;
        this.getHighSpeedVideoFpsRangesFor = appSwitchEntryViewModel;
    }
}
