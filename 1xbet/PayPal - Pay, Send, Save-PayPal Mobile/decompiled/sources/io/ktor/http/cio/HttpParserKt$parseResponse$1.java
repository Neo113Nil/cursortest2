package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {81, 90}, m = "parseResponse", n = {"input", "builder", "range", "builder", "version", "statusText", "statusCode"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class HttpParserKt$parseResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.http.cio.HttpParserKt.parseResponse(null, this);
    }

    HttpParserKt$parseResponse$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpParserKt$parseResponse$1> continuation) {
        super(continuation);
    }
}
