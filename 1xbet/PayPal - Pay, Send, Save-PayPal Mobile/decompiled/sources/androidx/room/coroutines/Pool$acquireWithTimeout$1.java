package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {231}, m = "acquireWithTimeout-KLykuaI", n = {"onTimeout", "connection", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class Pool$acquireWithTimeout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.room.coroutines.Pool getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.getHighSpeedVideoSizes(0L, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$1(androidx.room.coroutines.Pool pool, kotlin.coroutines.Continuation<? super androidx.room.coroutines.Pool$acquireWithTimeout$1> continuation) {
        super(continuation);
        this.getInputFormats = pool;
    }
}
