package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/pools/shared/ui/error/navigation/result/ErrorActionNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1", f = "PoolsListScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PoolsListScreenKt$PoolsListScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult errorActionNavResult = (com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1.WhenMappings.$EnumSwitchMapping$0[errorActionNavResult.getAction().ordinal()];
        if (i == 1) {
            this.getHighSpeedVideoSizes.retry();
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult errorActionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1) create(errorActionNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.DISMISS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1 poolsListScreenKt$PoolsListScreen$2$1 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        poolsListScreenKt$PoolsListScreen$2$1.Camera2StreamConfigurationMap = obj;
        return poolsListScreenKt$PoolsListScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolsListScreenKt$PoolsListScreen$2$1(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = poolsListViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
