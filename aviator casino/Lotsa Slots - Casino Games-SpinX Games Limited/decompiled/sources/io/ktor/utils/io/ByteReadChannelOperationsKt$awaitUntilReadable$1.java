package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {}, l = {92}, m = "awaitUntilReadable", n = {}, s = {})
/* loaded from: classes6.dex */
final class ByteReadChannelOperationsKt$awaitUntilReadable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    ByteReadChannelOperationsKt$awaitUntilReadable$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object awaitUntilReadable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitUntilReadable = io.ktor.utils.io.ByteReadChannelOperationsKt.awaitUntilReadable(null, 0, this);
        return awaitUntilReadable;
    }
}
