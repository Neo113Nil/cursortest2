package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0}, l = {629}, m = "endTransaction", n = {"$this$withLock_u24default$iv", "success"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class PooledConnectionImpl$endTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(false, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$endTransaction$1(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PooledConnectionImpl$endTransaction$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pooledConnectionImpl;
    }
}
