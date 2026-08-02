package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {64, 94}, m = "execute", n = {com.datadog.trace.api.DDSpanTypes.COUCHBASE, "cancellationSignal", "callable", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "cancellationSignal", "callable", "context"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$execute$3<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.room.CoroutinesRoom.Companion getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.execute(null, false, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$3(androidx.room.CoroutinesRoom.Companion companion, kotlin.coroutines.Continuation<? super androidx.room.CoroutinesRoom$Companion$execute$3> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = companion;
    }
}
