package io.ktor.client.engine.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0}, l = {118}, m = "executeHttpRequest", n = {"callContext", "requestData", "requestTime"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class OkHttpEngine$executeHttpRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.engine.okhttp.OkHttpEngine getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngine$executeHttpRequest$1(io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = okHttpEngine;
    }
}
