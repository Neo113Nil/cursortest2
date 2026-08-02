package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0}, l = {640}, m = "rollback", n = {"result", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2"})
/* loaded from: classes3.dex */
final class PooledConnectionImpl$TransactionImpl$rollback$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl.TransactionImpl<T> getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.rollback(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$TransactionImpl$rollback$1(androidx.room.coroutines.PooledConnectionImpl.TransactionImpl<T> transactionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = transactionImpl;
    }
}
