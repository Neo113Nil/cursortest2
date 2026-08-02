package io.ktor.client.engine.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0}, l = {107}, m = "executeServerSendEventsRequest", n = {"callContext", "requestTime", "session"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class OkHttpEngine$executeServerSendEventsRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.engine.okhttp.OkHttpEngine getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getInputFormats.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngine$executeServerSendEventsRequest$1(io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1> continuation) {
        super(continuation);
        this.getInputFormats = okHttpEngine;
    }
}
