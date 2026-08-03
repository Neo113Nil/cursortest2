package io.ktor.utils.io;

/* compiled from: ByteWriteChannelOperations.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {179, 189, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class ByteWriteChannelOperationsKt$writer$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ io.ktor.utils.io.ByteChannel $channel;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteWriteChannelOperationsKt$writer$job$1(kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1(this.$block, this.$channel, continuation);
        byteWriteChannelOperationsKt$writer$job$1.L$0 = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:43:0x0053, B:44:0x008f, B:46:0x00a0, B:52:0x006b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.CompletableJob] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        java.lang.Throwable th2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        io.ktor.utils.io.ByteChannel byteChannel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlinx.coroutines.Job job = this.label;
        try {
            try {
            } catch (java.lang.Throwable th3) {
                try {
                    kotlinx.coroutines.JobKt.cancel(job, "Exception thrown while writing to channel", th3);
                    this.$channel.cancel(th3);
                    this.L$0 = coroutineScope;
                    this.L$1 = null;
                    this.label = 4;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    this.L$0 = coroutineScope;
                    this.L$1 = th;
                    this.label = 6;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } catch (java.lang.Throwable th5) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th5));
        }
        switch (job) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()));
                kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$block;
                io.ktor.utils.io.WriterScope writerScope = new io.ktor.utils.io.WriterScope(this.$channel, coroutineScope.getCoroutineContext().plus(Job));
                this.L$0 = coroutineScope;
                this.L$1 = Job;
                this.label = 1;
                job = Job;
                if (function2.invoke(writerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job.complete();
                if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                    this.$channel.cancel(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteChannel = this.$channel;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 1:
                kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) this.L$1;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                job = completableJob;
                job.complete();
                if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (job.join(this) == coroutine_suspended) {
                }
                byteChannel = this.$channel;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                byteChannel = this.$channel;
                kotlin.Result.Companion companion222 = kotlin.Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ByteChannel byteChannel2 = this.$channel;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                this.L$0 = null;
                this.label = 5;
                if (byteChannel2.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 6:
                java.lang.Throwable th6 = (java.lang.Throwable) this.L$1;
                kotlin.ResultKt.throwOnFailure(obj);
                th = th6;
                io.ktor.utils.io.ByteChannel byteChannel3 = this.$channel;
                try {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.label = 7;
                    if (byteChannel3.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = th;
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                    throw th;
                } catch (java.lang.Throwable th7) {
                    th = th;
                    th2 = th7;
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                    throw th;
                }
            case 7:
                th = (java.lang.Throwable) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                    throw th;
                } catch (java.lang.Throwable th8) {
                    th2 = th8;
                    kotlin.Result.Companion companion52 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                    throw th;
                }
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
