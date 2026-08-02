package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {640}, m = "usePrepared", n = {com.datadog.trace.api.DDSpanTypes.SQL, "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class PooledConnectionImpl$usePrepared$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.usePrepared(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$usePrepared$1(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PooledConnectionImpl$usePrepared$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = pooledConnectionImpl;
    }
}
