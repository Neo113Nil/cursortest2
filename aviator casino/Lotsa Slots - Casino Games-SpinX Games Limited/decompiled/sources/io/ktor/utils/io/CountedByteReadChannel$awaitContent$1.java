package io.ktor.utils.io;

/* compiled from: CountedByteReadChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.CountedByteReadChannel", f = "CountedByteReadChannel.kt", i = {}, l = {48}, m = "awaitContent", n = {}, s = {})
/* loaded from: classes6.dex */
final class CountedByteReadChannel$awaitContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.CountedByteReadChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountedByteReadChannel$awaitContent$1(io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.CountedByteReadChannel$awaitContent$1> continuation) {
        super(continuation);
        this.this$0 = countedByteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitContent(0, this);
    }
}
