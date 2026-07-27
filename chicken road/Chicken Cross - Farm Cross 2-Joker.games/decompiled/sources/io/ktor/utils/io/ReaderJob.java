package io.ktor.utils.io;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/coroutines/Job;)V", "", "flushAndClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReaderJob implements ChannelJob {
    private final ByteWriteChannel channel;
    private final Job job;

    public ReaderJob(ByteWriteChannel channel, Job job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.channel = channel;
        this.job = job;
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public Job getJob() {
        return this.job;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flushAndClose(Continuation<? super Unit> continuation) {
        ReaderJob$flushAndClose$1 readerJob$flushAndClose$1;
        Object coroutine_suspended;
        int i;
        Iterator<Job> it;
        ByteWriteChannel byteWriteChannel;
        if (continuation instanceof ReaderJob$flushAndClose$1) {
            readerJob$flushAndClose$1 = (ReaderJob$flushAndClose$1) continuation;
            if ((readerJob$flushAndClose$1.label & Integer.MIN_VALUE) != 0) {
                readerJob$flushAndClose$1.label -= Integer.MIN_VALUE;
                Object obj = readerJob$flushAndClose$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerJob$flushAndClose$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JobKt__JobKt.cancelChildren$default(getJob(), (CancellationException) null, 1, (Object) null);
                    it = getJob().getChildren().iterator();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    it = (Iterator) readerJob$flushAndClose$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Job next = it.next();
                    Job.DefaultImpls.cancel$default(next, (CancellationException) null, 1, (Object) null);
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
                return Unit.INSTANCE;
            }
        }
        readerJob$flushAndClose$1 = new ReaderJob$flushAndClose$1(this, continuation);
        Object obj2 = readerJob$flushAndClose$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
        return Unit.INSTANCE;
    }
}
