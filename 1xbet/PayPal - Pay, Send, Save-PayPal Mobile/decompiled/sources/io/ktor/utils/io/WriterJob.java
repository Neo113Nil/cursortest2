package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getChannel", "()Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WriterJob implements io.ktor.utils.io.ChannelJob {
    private final io.ktor.utils.io.ByteReadChannel channel;
    private final kotlinx.coroutines.Job job;

    public WriterJob(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        this.channel = byteReadChannel;
        this.job = job;
    }

    public final io.ktor.utils.io.ByteReadChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public final kotlinx.coroutines.Job getJob() {
        return this.job;
    }
}
