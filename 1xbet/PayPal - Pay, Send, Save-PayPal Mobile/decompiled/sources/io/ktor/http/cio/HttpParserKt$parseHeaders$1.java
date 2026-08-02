package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0}, l = {106}, m = "parseHeaders", n = {"builder"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HttpParserKt$parseHeaders$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.http.cio.HttpParserKt.parseHeaders(null, this);
    }

    HttpParserKt$parseHeaders$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpParserKt$parseHeaders$1> continuation) {
        super(continuation);
    }
}
