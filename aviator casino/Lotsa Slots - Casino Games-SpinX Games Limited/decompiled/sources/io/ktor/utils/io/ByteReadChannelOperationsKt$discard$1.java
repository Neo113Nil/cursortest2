package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {393}, m = "discard", n = {"$this$discard", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "remaining"}, s = {"L$0", "J$0", "J$1"})
/* loaded from: classes6.dex */
final class ByteReadChannelOperationsKt$discard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    long J$1;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteReadChannelOperationsKt$discard$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.discard(null, 0L, this);
    }
}
