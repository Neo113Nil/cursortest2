package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/screenlock/RequireScreenLockNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1", f = "VirtualCardOverviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status status = requireScreenLockNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Completed) {
            this.getHighSpeedVideoSizes.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCompleted.INSTANCE);
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCancelled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1) create(requireScreenLockNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1 virtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1 = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1(this.getHighSpeedVideoSizes, continuation);
        virtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1.getHighSpeedVideoFpsRangesFor = obj;
        return virtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = virtualCardOverviewViewModel;
    }
}
