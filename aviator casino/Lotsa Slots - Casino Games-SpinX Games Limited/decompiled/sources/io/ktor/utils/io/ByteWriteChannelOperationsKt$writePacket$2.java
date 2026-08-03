package io.ktor.utils.io;

/* compiled from: ByteWriteChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0, 0}, l = {116}, m = "writePacket", n = {"$this$writePacket", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ByteWriteChannelOperationsKt$writePacket$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteWriteChannelOperationsKt$writePacket$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket((io.ktor.utils.io.ByteWriteChannel) null, (kotlinx.io.Source) null, this);
    }
}
