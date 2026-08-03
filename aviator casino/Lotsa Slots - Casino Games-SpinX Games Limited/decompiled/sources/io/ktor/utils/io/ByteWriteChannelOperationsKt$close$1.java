package io.ktor.utils.io;

/* compiled from: ByteWriteChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ByteWriteChannelOperationsKt$close$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    ByteWriteChannelOperationsKt$close$1(java.lang.Object obj) {
        super(1, obj, io.ktor.utils.io.ByteWriteChannel.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteWriteChannel) this.receiver).flushAndClose(continuation);
    }
}
