package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 3, 3}, l = {131, 135, 154, 159}, m = "useConnection", n = {"block", "pool", "connection", "currentContext", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class ConnectionPoolImpl$useConnection$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ androidx.room.coroutines.ConnectionPoolImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.useConnection(false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPoolImpl$useConnection$1(androidx.room.coroutines.ConnectionPoolImpl connectionPoolImpl, kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionPoolImpl$useConnection$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = connectionPoolImpl;
    }
}
