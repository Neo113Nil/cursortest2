package io.ktor.http.content;

/* compiled from: WriterContent.kt */
@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class WriterContent$writeTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel $channel;
    final /* synthetic */ java.nio.charset.Charset $charset;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.http.content.WriterContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriterContent$writeTo$2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.charset.Charset charset, io.ktor.http.content.WriterContent writerContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.WriterContent$writeTo$2> continuation) {
        super(1, continuation);
        this.$channel = byteWriteChannel;
        this.$charset = charset;
        this.this$0 = writerContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.http.content.WriterContent$writeTo$2(this.$channel, this.$charset, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.WriterContent$writeTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.Closeable closeable;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.io.Writer writer = io.ktor.util.cio.OutputStreamAdaptersKt.writer(this.$channel, this.$charset);
            try {
                function2 = this.this$0.body;
                this.L$0 = writer;
                this.label = 1;
                if (function2.invoke(writer, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = writer;
            } catch (java.lang.Throwable th2) {
                closeable = writer;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    kotlin.io.CloseableKt.closeFinally(closeable, th);
                    throw th4;
                }
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.io.CloseableKt.closeFinally(closeable, null);
        return kotlin.Unit.INSTANCE;
    }
}
