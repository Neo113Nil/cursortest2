package androidx.room.coroutines;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConnectionPoolImpl$useConnection$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = function2.invoke(pooledConnectionImpl, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.room.coroutines.ConnectionPoolImpl$useConnection$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.coroutines.ConnectionPoolImpl$useConnection$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConnectionPoolImpl$useConnection$2(kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionPoolImpl$useConnection$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = pooledConnectionImpl;
    }
}
