package io.ktor.util.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {19}, m = "toByteArray", n = {}, s = {})
/* loaded from: classes17.dex */
final class ReadersKt$toByteArray$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.util.cio.ReadersKt.toByteArray(null, 0, this);
    }

    ReadersKt$toByteArray$1(kotlin.coroutines.Continuation<? super io.ktor.util.cio.ReadersKt$toByteArray$1> continuation) {
        super(continuation);
    }
}
