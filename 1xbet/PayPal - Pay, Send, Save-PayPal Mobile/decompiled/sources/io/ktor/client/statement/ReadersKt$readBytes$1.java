package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {17}, m = "readBytes", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReadersKt$readBytes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.client.statement.ReadersKt.readBytes(null, 0, this);
    }

    ReadersKt$readBytes$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.ReadersKt$readBytes$1> continuation) {
        super(continuation);
    }
}
