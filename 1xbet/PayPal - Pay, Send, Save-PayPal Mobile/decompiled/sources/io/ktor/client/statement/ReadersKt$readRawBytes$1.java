package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {35}, m = "readRawBytes", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReadersKt$readRawBytes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.client.statement.ReadersKt.readRawBytes(null, this);
    }

    ReadersKt$readRawBytes$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.ReadersKt$readRawBytes$1> continuation) {
        super(continuation);
    }
}
