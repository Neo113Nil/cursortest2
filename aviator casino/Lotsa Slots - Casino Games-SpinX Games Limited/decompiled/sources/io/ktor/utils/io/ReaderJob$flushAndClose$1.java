package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ReaderJob", f = "ByteReadChannelOperations.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE}, m = "flushAndClose", n = {}, s = {})
/* loaded from: classes6.dex */
final class ReaderJob$flushAndClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.ReaderJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderJob$flushAndClose$1(io.ktor.utils.io.ReaderJob readerJob, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ReaderJob$flushAndClose$1> continuation) {
        super(continuation);
        this.this$0 = readerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushAndClose(this);
    }
}
