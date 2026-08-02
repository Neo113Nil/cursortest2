package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "parseHeaders", n = {"input", "builder", "range", "headers"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class HttpParserKt$parseHeaders$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.http.cio.HttpParserKt.parseHeaders(null, null, null, this);
    }

    HttpParserKt$parseHeaders$2(kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpParserKt$parseHeaders$2> continuation) {
        super(continuation);
    }
}
