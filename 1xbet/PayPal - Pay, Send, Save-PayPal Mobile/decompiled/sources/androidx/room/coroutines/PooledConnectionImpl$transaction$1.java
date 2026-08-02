package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 1, 4}, l = {464, 468, 482, 482, 482}, m = "transaction", n = {"block", "success", "exception"}, s = {"L$0", "I$0", "L$0"})
/* loaded from: classes3.dex */
final class PooledConnectionImpl$transaction$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.room.coroutines.PooledConnectionImpl.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$transaction$1(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PooledConnectionImpl$transaction$1> continuation) {
        super(continuation);
        this.getInputFormats = pooledConnectionImpl;
    }
}
