package io.ktor.utils.io;

/* compiled from: CountedByteWriteChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", i = {}, l = {32}, m = "flush", n = {}, s = {})
/* loaded from: classes6.dex */
final class CountedByteWriteChannel$flush$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.CountedByteWriteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountedByteWriteChannel$flush$1(io.ktor.utils.io.CountedByteWriteChannel countedByteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.CountedByteWriteChannel$flush$1> continuation) {
        super(continuation);
        this.this$0 = countedByteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flush(this);
    }
}
