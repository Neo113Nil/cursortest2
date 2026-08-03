package io.ktor.utils.io;

/* compiled from: ByteWriteChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0}, l = {224}, m = "write", n = {"written"}, s = {"I$0"})
/* loaded from: classes6.dex */
final class ByteWriteChannelOperationsKt$write$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteWriteChannelOperationsKt$write$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.write(null, 0, null, this);
    }
}
