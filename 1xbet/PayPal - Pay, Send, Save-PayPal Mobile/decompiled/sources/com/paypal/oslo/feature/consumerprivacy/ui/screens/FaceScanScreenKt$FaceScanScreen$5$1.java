package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1", f = "FaceScanScreen.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FaceScanScreenKt$FaceScanScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object onDeleteConfirm$consumer_privacy_prodRelease = this.getHighSpeedVideoFpsRangesFor.onDeleteConfirm$consumer_privacy_prodRelease(this);
        return onDeleteConfirm$consumer_privacy_prodRelease == coroutine_suspended ? coroutine_suspended : onDeleteConfirm$consumer_privacy_prodRelease;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceScanScreenKt$FaceScanScreen$5$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = manageFaceScanViewModel;
    }
}
