package androidx.room.coroutines;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConnectionPoolImpl$useConnection$4<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.PooledConnectionImpl> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
        androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl = this.getHighSpeedVideoFpsRangesFor.element;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object invoke = function2.invoke(pooledConnectionImpl, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.room.coroutines.ConnectionPoolImpl$useConnection$4) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.coroutines.ConnectionPoolImpl$useConnection$4(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConnectionPoolImpl$useConnection$4(kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.PooledConnectionImpl> objectRef, kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionPoolImpl$useConnection$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRangesFor = objectRef;
    }
}
