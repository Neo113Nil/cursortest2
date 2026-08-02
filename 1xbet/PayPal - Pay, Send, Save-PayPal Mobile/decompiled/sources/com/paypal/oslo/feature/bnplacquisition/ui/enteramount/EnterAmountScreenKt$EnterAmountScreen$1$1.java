package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/screenlock/RequireScreenLockNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$1$1", f = "EnterAmountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountScreenKt$EnterAmountScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status status = requireScreenLockNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Completed) {
            this.getHighSpeedVideoFpsRangesFor.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted.INSTANCE);
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRangesFor.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCancelled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$1$1) create(requireScreenLockNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$1$1 enterAmountScreenKt$EnterAmountScreen$1$1 = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$1$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        enterAmountScreenKt$EnterAmountScreen$1$1.getHighSpeedVideoSizes = obj;
        return enterAmountScreenKt$EnterAmountScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountScreenKt$EnterAmountScreen$1$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = enterAmountViewModel;
    }
}
