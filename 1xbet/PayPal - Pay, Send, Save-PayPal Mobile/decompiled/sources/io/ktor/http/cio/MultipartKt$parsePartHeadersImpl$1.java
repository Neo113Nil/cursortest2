package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {114}, m = "parsePartHeadersImpl", n = {"builder"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MultipartKt$parsePartHeadersImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = io.ktor.http.cio.MultipartKt.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    MultipartKt$parsePartHeadersImpl$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1> continuation) {
        super(continuation);
    }
}
