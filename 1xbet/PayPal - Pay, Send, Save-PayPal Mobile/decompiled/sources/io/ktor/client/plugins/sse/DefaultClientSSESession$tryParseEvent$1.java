package io.ktor.client.plugins.sse;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {}, l = {145}, m = "tryParseEvent", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultClientSSESession$tryParseEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$tryParseEvent$1(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = defaultClientSSESession;
    }
}
