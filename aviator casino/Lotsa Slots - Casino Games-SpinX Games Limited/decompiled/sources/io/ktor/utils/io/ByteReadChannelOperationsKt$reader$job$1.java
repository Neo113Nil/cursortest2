package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {333, 343, 343, 343}, m = "invokeSuspend", n = {"$this$launch", "nested"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ByteReadChannelOperationsKt$reader$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ io.ktor.utils.io.ByteChannel $channel;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteReadChannelOperationsKt$reader$job$1(kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1(this.$block, this.$channel, continuation);
        byteReadChannelOperationsKt$reader$job$1.L$0 = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlinx.coroutines.Job job = this.label;
        try {
        } catch (java.lang.Throwable th) {
            try {
                kotlinx.coroutines.JobKt.cancel(job, "Exception thrown while reading from channel", th);
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(this.$channel, th);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (java.lang.Throwable th2) {
                this.L$0 = th2;
                this.L$1 = null;
                this.label = 4;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
        if (job == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope2.getCoroutineContext()));
            kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$block;
            io.ktor.utils.io.ReaderScope readerScope = new io.ktor.utils.io.ReaderScope(this.$channel, coroutineScope2.getCoroutineContext().plus(Job));
            this.L$0 = coroutineScope2;
            this.L$1 = Job;
            this.label = 1;
            if (function2.invoke(readerScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            job = Job;
        } else {
            if (job != 1) {
                if (job == 2 || job == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (job != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th3 = (java.lang.Throwable) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th3;
            }
            kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) this.L$1;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            job = completableJob;
        }
        job.complete();
        if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
            this.$channel.cancel(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (job.join(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
