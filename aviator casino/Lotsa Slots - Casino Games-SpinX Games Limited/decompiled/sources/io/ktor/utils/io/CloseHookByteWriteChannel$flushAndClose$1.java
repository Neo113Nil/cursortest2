package io.ktor.utils.io;

/* compiled from: CloseHookByteWriteChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", i = {}, l = {24, 25}, m = "flushAndClose", n = {}, s = {})
/* loaded from: classes6.dex */
final class CloseHookByteWriteChannel$flushAndClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.CloseHookByteWriteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseHookByteWriteChannel$flushAndClose$1(io.ktor.utils.io.CloseHookByteWriteChannel closeHookByteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1> continuation) {
        super(continuation);
        this.this$0 = closeHookByteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushAndClose(this);
    }
}
