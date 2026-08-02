package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0}, l = {629}, m = "beginTransaction", n = {"type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class PooledConnectionImpl$beginTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges((androidx.room.Transactor.SQLiteTransactionType) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$beginTransaction$1(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = pooledConnectionImpl;
    }
}
