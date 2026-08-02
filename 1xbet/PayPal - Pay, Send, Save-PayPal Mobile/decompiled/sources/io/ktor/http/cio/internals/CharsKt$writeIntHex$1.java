package io.ktor.http.cio.internals;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {110, 118}, m = "writeIntHex", n = {"$this$writeIntHex", "table", "current", "digits", "$this$writeIntHex", "table", "current", "digits"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class CharsKt$writeIntHex$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.http.cio.internals.CharsKt.writeIntHex(null, 0, this);
    }

    CharsKt$writeIntHex$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.internals.CharsKt$writeIntHex$1> continuation) {
        super(continuation);
    }
}
