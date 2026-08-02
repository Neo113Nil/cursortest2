package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1", f = "PoolsListScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {120}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PoolsListScreenKt$PoolsListScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, com.paypal.oslo.feature.pools.domain.models.PoolUserRole, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> effect = this.Camera2StreamConfigurationMap.getEffect();
            final kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, com.paypal.oslo.feature.pools.domain.models.PoolUserRole, kotlin.Unit> function3 = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect poolsListEffect = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect) obj2;
                    if (poolsListEffect instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails) {
                        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails navigateToPoolDetails = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails) poolsListEffect;
                        function3.invoke(navigateToPoolDetails.getPoolId(), navigateToPoolDetails.getPoolCreatorAccountId(), navigateToPoolDetails.getUserRole());
                    } else {
                        if (!(poolsListEffect instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function1.invoke(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs.m17651copyuLJ83ew$default(((com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError) poolsListEffect).getErrorNavArgs(), str, 0, null, 0, 14, null));
                    }
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
        return ((com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PoolsListScreenKt$PoolsListScreen$1$1(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super com.paypal.oslo.feature.pools.domain.models.PoolUserRole, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> function1, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = poolsListViewModel;
        this.getHighSpeedVideoSizes = function3;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
