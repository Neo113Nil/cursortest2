package io.ktor.utils.io.jvm.javaio;

/* compiled from: Reading.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class RawSourceChannel$awaitContent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $min;
    int label;
    final /* synthetic */ io.ktor.utils.io.jvm.javaio.RawSourceChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$2(io.ktor.utils.io.jvm.javaio.RawSourceChannel rawSourceChannel, int i, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2> continuation) {
        super(2, continuation);
        this.this$0 = rawSourceChannel;
        this.$min = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2(this.this$0, this.$min, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0020 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.io.Buffer buffer;
        kotlinx.io.RawSource rawSource;
        kotlinx.io.RawSource rawSource2;
        kotlinx.io.Buffer buffer2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        long j = 0;
        while (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(buffer) < this.$min && j >= 0) {
            try {
                rawSource2 = this.this$0.source;
                buffer2 = this.this$0.buffer;
                j = rawSource2.readAtMostTo(buffer2, Long.MAX_VALUE);
            } catch (java.io.EOFException unused) {
                j = -1;
            }
        }
        if (j == -1) {
            rawSource = this.this$0.source;
            rawSource.close();
            this.this$0.getJob().complete();
            this.this$0.closedToken = new io.ktor.utils.io.CloseToken(null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
