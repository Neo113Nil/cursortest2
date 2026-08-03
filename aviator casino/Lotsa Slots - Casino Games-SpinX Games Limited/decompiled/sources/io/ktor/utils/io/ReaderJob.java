package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/coroutines/Job;)V", "", "flushAndClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReaderJob implements io.ktor.utils.io.ChannelJob {
    private final io.ktor.utils.io.ByteWriteChannel channel;
    private final kotlinx.coroutines.Job job;

    public ReaderJob(io.ktor.utils.io.ByteWriteChannel channel, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "job");
        this.channel = channel;
        this.job = job;
    }

    public final io.ktor.utils.io.ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public kotlinx.coroutines.Job getJob() {
        return this.job;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ReaderJob$flushAndClose$1 readerJob$flushAndClose$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.util.Iterator<kotlinx.coroutines.Job> it;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        if (continuation instanceof io.ktor.utils.io.ReaderJob$flushAndClose$1) {
            readerJob$flushAndClose$1 = (io.ktor.utils.io.ReaderJob$flushAndClose$1) continuation;
            if ((readerJob$flushAndClose$1.label & Integer.MIN_VALUE) != 0) {
                readerJob$flushAndClose$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = readerJob$flushAndClose$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerJob$flushAndClose$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    it = getJob().getChildren().iterator();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    it = (java.util.Iterator) readerJob$flushAndClose$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    kotlinx.coroutines.Job next = it.next();
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(next, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    readerJob$flushAndClose$1.L$0 = it;
                    readerJob$flushAndClose$1.label = 1;
                    if (next.join(readerJob$flushAndClose$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                byteWriteChannel = this.channel;
                readerJob$flushAndClose$1.L$0 = null;
                readerJob$flushAndClose$1.label = 2;
                if (byteWriteChannel.flushAndClose(readerJob$flushAndClose$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        readerJob$flushAndClose$1 = new io.ktor.utils.io.ReaderJob$flushAndClose$1(this, continuation);
        java.lang.Object obj2 = readerJob$flushAndClose$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerJob$flushAndClose$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        byteWriteChannel = this.channel;
        readerJob$flushAndClose$1.L$0 = null;
        readerJob$flushAndClose$1.label = 2;
        if (byteWriteChannel.flushAndClose(readerJob$flushAndClose$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
