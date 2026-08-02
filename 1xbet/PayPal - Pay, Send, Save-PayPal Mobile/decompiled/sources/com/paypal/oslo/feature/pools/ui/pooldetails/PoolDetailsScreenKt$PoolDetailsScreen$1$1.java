package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt$PoolDetailsScreen$1$1", f = "PoolDetailsScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {114}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PoolDetailsScreenKt$PoolDetailsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect> effect = this.getHighSpeedVideoFpsRangesFor.getEffect();
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt$PoolDetailsScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect poolDetailsEffect = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect) obj2;
                    if (!(poolDetailsEffect instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs.m17651copyuLJ83ew$default(((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError) poolDetailsEffect).getErrorNavArgs(), str, 0, null, 0, 14, null));
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
        return ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt$PoolDetailsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt$PoolDetailsScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PoolDetailsScreenKt$PoolDetailsScreen$1$1(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> function1, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt$PoolDetailsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = poolDetailsViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = str;
    }
}
