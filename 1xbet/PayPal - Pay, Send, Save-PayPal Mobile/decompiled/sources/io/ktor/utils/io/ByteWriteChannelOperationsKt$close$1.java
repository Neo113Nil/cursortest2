package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ByteWriteChannelOperationsKt$close$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteWriteChannel) this.receiver).flushAndClose(continuation);
    }

    ByteWriteChannelOperationsKt$close$1(java.lang.Object obj) {
        super(1, obj, io.ktor.utils.io.ByteWriteChannel.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
