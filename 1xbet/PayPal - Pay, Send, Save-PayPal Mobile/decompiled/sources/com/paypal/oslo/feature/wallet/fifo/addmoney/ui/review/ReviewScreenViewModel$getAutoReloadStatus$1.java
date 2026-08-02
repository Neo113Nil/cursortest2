package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getAutoReloadStatus$1", f = "ReviewScreenViewModel.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, nl = {437}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ReviewScreenViewModel$getAutoReloadStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase isAutoReloadEnabledUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            isAutoReloadEnabledUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = isAutoReloadEnabledUseCase.invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.AUTO_RELOAD_THRESHOLD, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to fetch auto-reload status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString())), null, 4, null);
        } else if (ior instanceof arrow.core.Ior.Right) {
            reviewScreenViewModel.getOutputStallDuration = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to fetch auto-reload status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) leftValue).toString())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getAutoReloadStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getAutoReloadStatus$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$getAutoReloadStatus$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getAutoReloadStatus$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewScreenViewModel;
    }
}
