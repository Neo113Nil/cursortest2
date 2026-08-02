package io.ktor.client.engine.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0}, l = {91}, m = "executeWebSocketRequest", n = {"callContext", "requestTime", "session"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class OkHttpEngine$executeWebSocketRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.engine.okhttp.OkHttpEngine getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap((okhttp3.OkHttpClient) null, (okhttp3.Request) null, (kotlin.coroutines.CoroutineContext) null, (kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngine$executeWebSocketRequest$1(io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1> continuation) {
        super(continuation);
        this.getOutputFormats = okHttpEngine;
    }
}
