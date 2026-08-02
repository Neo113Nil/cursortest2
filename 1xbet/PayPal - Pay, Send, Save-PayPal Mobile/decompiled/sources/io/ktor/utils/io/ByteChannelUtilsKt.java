package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lkotlinx/coroutines/Job;", "job", "", "attachJob", "(Lio/ktor/utils/io/ByteChannel;Lkotlinx/coroutines/Job;)V", "Lio/ktor/utils/io/ChannelJob;", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/utils/io/ChannelJob;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteChannelUtilsKt {
    public static final void attachJob(final io.ktor.utils.io.ByteChannel byteChannel, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.ByteChannelUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.utils.io.ByteChannelUtilsKt.m23406$r8$lambda$Iy4m4kw5bls7YlqbWcLnFrZOaU(io.ktor.utils.io.ByteChannel.this, (java.lang.Throwable) obj);
            }
        });
    }

    public static final void attachJob(io.ktor.utils.io.ByteChannel byteChannel, io.ktor.utils.io.ChannelJob channelJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        attachJob(byteChannel, channelJob.getJob());
    }

    /* renamed from: $r8$lambda$Iy4m4kw5bls-7YlqbWcLnFrZOaU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23406$r8$lambda$Iy4m4kw5bls7YlqbWcLnFrZOaU(io.ktor.utils.io.ByteChannel byteChannel, java.lang.Throwable th) {
        if (th != null) {
            byteChannel.cancel(th);
        }
        return kotlin.Unit.INSTANCE;
    }
}
