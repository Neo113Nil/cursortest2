package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {53}, m = "readBytes", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReadersKt$readBytes$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.client.statement.ReadersKt.readBytes(null, this);
    }

    ReadersKt$readBytes$3(kotlin.coroutines.Continuation<? super io.ktor.client.statement.ReadersKt$readBytes$3> continuation) {
        super(continuation);
    }
}
