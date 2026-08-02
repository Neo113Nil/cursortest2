package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", i = {0, 0}, l = {89, 91}, m = "usePrepared", n = {com.datadog.trace.api.DDSpanTypes.SQL, "block"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class PassthroughConnection$usePrepared$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.coroutines.PassthroughConnection getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.usePrepared(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassthroughConnection$usePrepared$1(androidx.room.coroutines.PassthroughConnection passthroughConnection, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PassthroughConnection$usePrepared$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passthroughConnection;
    }
}
