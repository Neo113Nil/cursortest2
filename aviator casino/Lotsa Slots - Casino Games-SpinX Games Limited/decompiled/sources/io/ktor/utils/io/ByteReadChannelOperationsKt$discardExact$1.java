package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {385}, m = "discardExact", n = {"value"}, s = {"J$0"})
/* loaded from: classes6.dex */
final class ByteReadChannelOperationsKt$discardExact$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteReadChannelOperationsKt$discardExact$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(null, 0L, this);
    }
}
