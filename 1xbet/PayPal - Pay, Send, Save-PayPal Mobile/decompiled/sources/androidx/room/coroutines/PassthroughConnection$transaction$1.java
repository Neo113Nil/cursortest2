package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", i = {0}, l = {127}, m = "transaction", n = {"success"}, s = {"I$0"})
/* loaded from: classes3.dex */
final class PassthroughConnection$transaction$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.room.coroutines.PassthroughConnection Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassthroughConnection$transaction$1(androidx.room.coroutines.PassthroughConnection passthroughConnection, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PassthroughConnection$transaction$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = passthroughConnection;
    }
}
