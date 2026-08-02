package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", i = {}, l = {304, 306}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PullToRefreshModifierNode$update$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.Camera2StreamConfigurationMap.getIsRefreshing()) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$update$1(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pullToRefreshModifierNode;
    }
}
