package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/coroutines/Job;)V", "", "flushAndClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReaderJob implements io.ktor.utils.io.ChannelJob {
    private final io.ktor.utils.io.ByteWriteChannel channel;
    private final kotlinx.coroutines.Job job;

    public ReaderJob(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        this.channel = byteWriteChannel;
        this.job = job;
    }

    public final io.ktor.utils.io.ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public final kotlinx.coroutines.Job getJob() {
        return this.job;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r7.flushAndClose(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ReaderJob$flushAndClose$1 readerJob$flushAndClose$1;
        int i;
        java.util.Iterator<kotlinx.coroutines.Job> it;
        if (continuation instanceof io.ktor.utils.io.ReaderJob$flushAndClose$1) {
            readerJob$flushAndClose$1 = (io.ktor.utils.io.ReaderJob$flushAndClose$1) continuation;
            if ((readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = readerJob$flushAndClose$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI;
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
                    it = (java.util.Iterator) readerJob$flushAndClose$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (true) {
                    if (!it.hasNext()) {
                        kotlinx.coroutines.Job next = it.next();
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(next, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        readerJob$flushAndClose$1.getHighSpeedVideoFpsRangesFor = it;
                        readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (next.join(readerJob$flushAndClose$1) == coroutine_suspended) {
                            break;
                        }
                    } else {
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.channel;
                        readerJob$flushAndClose$1.getHighSpeedVideoFpsRangesFor = null;
                        readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                }
                return coroutine_suspended;
            }
        }
        readerJob$flushAndClose$1 = new io.ktor.utils.io.ReaderJob$flushAndClose$1(this, continuation);
        java.lang.Object obj2 = readerJob$flushAndClose$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerJob$flushAndClose$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        while (true) {
            if (!it.hasNext()) {
            }
        }
        return coroutine_suspended2;
    }
}
