package io.ktor.util.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", i = {0, 0, 0}, l = {19}, m = "pass", n = {"$this$pass", "buffer", "block"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class ReadersJvmKt$pass$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.util.cio.ReadersJvmKt.pass(null, null, null, this);
    }

    ReadersJvmKt$pass$1(kotlin.coroutines.Continuation<? super io.ktor.util.cio.ReadersJvmKt$pass$1> continuation) {
        super(continuation);
    }
}
