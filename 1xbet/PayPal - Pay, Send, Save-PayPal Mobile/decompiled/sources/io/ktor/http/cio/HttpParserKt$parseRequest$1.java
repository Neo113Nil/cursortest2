package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {45, 60}, m = "parseRequest", n = {"input", "builder", "range", "builder", "method", "uri", "version"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class HttpParserKt$parseRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.http.cio.HttpParserKt.parseRequest(null, this);
    }

    HttpParserKt$parseRequest$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpParserKt$parseRequest$1> continuation) {
        super(continuation);
    }
}
