package io.ktor.utils.io.jvm.javaio;

/* compiled from: Reading.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020'8VX\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/RawSource;", "source", "Lkotlin/coroutines/CoroutineContext;", "parent", "<init>", "(Lkotlinx/io/RawSource;Lkotlin/coroutines/CoroutineContext;)V", "", "min", "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)V", "Lkotlinx/io/RawSource;", "Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/utils/io/CloseToken;", "closedToken", "Lio/ktor/utils/io/CloseToken;", "Lkotlinx/io/Buffer;", "buffer", "Lkotlinx/io/Buffer;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/io/Source;", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RawSourceChannel implements io.ktor.utils.io.ByteReadChannel {
    private final kotlinx.io.Buffer buffer;
    private io.ktor.utils.io.CloseToken closedToken;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.CompletableJob job;
    private final kotlin.coroutines.CoroutineContext parent;
    private final kotlinx.io.RawSource source;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public RawSourceChannel(kotlinx.io.RawSource source, kotlin.coroutines.CoroutineContext parent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        this.source = source;
        this.parent = parent;
        this.buffer = new kotlinx.io.Buffer();
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) parent.get(kotlinx.coroutines.Job.INSTANCE));
        this.job = Job;
        this.coroutineContext = parent.plus(Job).plus(new kotlinx.coroutines.CoroutineName("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.exhausted();
    }

    public final kotlinx.coroutines.CompletableJob getJob() {
        return this.job;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public kotlinx.io.Source getReadBuffer() {
        return this.buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 rawSourceChannel$awaitContent$1;
        int i2;
        if (continuation instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1) {
            rawSourceChannel$awaitContent$1 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1) continuation;
            if ((rawSourceChannel$awaitContent$1.label & Integer.MIN_VALUE) != 0) {
                rawSourceChannel$awaitContent$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = rawSourceChannel$awaitContent$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = rawSourceChannel$awaitContent$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.closedToken != null) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    kotlin.coroutines.CoroutineContext coroutineContext = this.coroutineContext;
                    io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 rawSourceChannel$awaitContent$2 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2(this, i, null);
                    rawSourceChannel$awaitContent$1.I$0 = i;
                    rawSourceChannel$awaitContent$1.label = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, rawSourceChannel$awaitContent$2, rawSourceChannel$awaitContent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = rawSourceChannel$awaitContent$1.I$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
            }
        }
        rawSourceChannel$awaitContent$1 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1(this, continuation);
        java.lang.Object obj2 = rawSourceChannel$awaitContent$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = rawSourceChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        java.lang.String str;
        java.lang.String message;
        if (this.closedToken != null) {
            return;
        }
        kotlinx.coroutines.CompletableJob completableJob = this.job;
        java.lang.String str2 = "Channel was cancelled";
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        kotlinx.coroutines.JobKt.cancel(completableJob, str, cause);
        this.source.close();
        if (cause != null && (message = cause.getMessage()) != null) {
            str2 = message;
        }
        this.closedToken = new io.ktor.utils.io.CloseToken(new java.io.IOException(str2, cause));
    }
}
