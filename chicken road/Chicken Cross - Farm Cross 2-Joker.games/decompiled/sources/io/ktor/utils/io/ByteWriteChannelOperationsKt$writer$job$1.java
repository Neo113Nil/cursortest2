package io.ktor.utils.io;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: ByteWriteChannelOperations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {179, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes7.dex */
final class ByteWriteChannelOperationsKt$writer$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<WriterScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteWriteChannelOperationsKt$writer$job$1(Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> function2, ByteChannel byteChannel, Continuation<? super ByteWriteChannelOperationsKt$writer$job$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new ByteWriteChannelOperationsKt$writer$job$1(this.$block, this.$channel, continuation);
        byteWriteChannelOperationsKt$writer$job$1.L$0 = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteWriteChannelOperationsKt$writer$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Throwable th2;
        CoroutineScope coroutineScope;
        ByteChannel byteChannel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Job job = this.label;
        try {
            try {
            } catch (Throwable th3) {
                try {
                    JobKt.cancel(job, "Exception thrown while writing to channel", th3);
                    this.$channel.cancel(th3);
                    this.L$0 = coroutineScope;
                    this.L$1 = null;
                    this.label = 4;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    this.L$0 = coroutineScope;
                    this.L$1 = th;
                    this.label = 6;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } catch (Throwable th5) {
            Result.Companion companion = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th5));
        }
        switch (job) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                CompletableJob Job = JobKt.Job(JobKt.getJob(coroutineScope.getCoroutineContext()));
                Function2<WriterScope, Continuation<? super Unit>, Object> function2 = this.$block;
                WriterScope writerScope = new WriterScope(this.$channel, coroutineScope.getCoroutineContext().plus(Job));
                this.L$0 = coroutineScope;
                this.L$1 = Job;
                this.label = 1;
                job = Job;
                if (function2.invoke(writerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job.complete();
                if (JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                    this.$channel.cancel(JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteChannel = this.$channel;
                Result.Companion companion2 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                CompletableJob completableJob = (CompletableJob) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                job = completableJob;
                job.complete();
                if (JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (job.join(this) == coroutine_suspended) {
                }
                byteChannel = this.$channel;
                Result.Companion companion22 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                byteChannel = this.$channel;
                Result.Companion companion222 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                ByteChannel byteChannel2 = this.$channel;
                Result.Companion companion3 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 5;
                if (byteChannel2.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                Result.m8079constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                Throwable th6 = (Throwable) this.L$1;
                ResultKt.throwOnFailure(obj);
                th = th6;
                ByteChannel byteChannel3 = this.$channel;
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.label = 7;
                    if (byteChannel3.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = th;
                    Result.m8079constructorimpl(Unit.INSTANCE);
                    throw th;
                } catch (Throwable th7) {
                    th = th;
                    th2 = th7;
                    Result.Companion companion5 = Result.INSTANCE;
                    Result.m8079constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            case 7:
                th = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Result.m8079constructorimpl(Unit.INSTANCE);
                    throw th;
                } catch (Throwable th8) {
                    th2 = th8;
                    Result.Companion companion52 = Result.INSTANCE;
                    Result.m8079constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
