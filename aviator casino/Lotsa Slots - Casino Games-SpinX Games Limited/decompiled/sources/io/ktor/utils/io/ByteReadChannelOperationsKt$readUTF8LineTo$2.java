package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {446, 461, 485}, m = "readUTF8LineTo-RRvyBJ8", n = {"$this$readUTF8LineTo_u2dRRvyBJ8", "out", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "lineEnding"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0", "I$1"})
/* loaded from: classes6.dex */
final class ByteReadChannelOperationsKt$readUTF8LineTo$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteReadChannelOperationsKt$readUTF8LineTo$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
    }
}
