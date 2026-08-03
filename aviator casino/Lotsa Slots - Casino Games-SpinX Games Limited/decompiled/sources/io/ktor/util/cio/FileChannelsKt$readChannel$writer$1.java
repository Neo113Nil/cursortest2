package io.ktor.util.cio;

/* compiled from: FileChannels.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FileChannelsKt$readChannel$writer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ kotlin.Lazy<java.io.RandomAccessFile> $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, kotlin.Lazy<? extends java.io.RandomAccessFile> lazy, kotlin.coroutines.Continuation<? super io.ktor.util.cio.FileChannelsKt$readChannel$writer$1> continuation) {
        super(2, continuation);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$randomAccessFile$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.cio.FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new io.ktor.util.cio.FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, continuation);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.cio.FileChannelsKt$readChannel$writer$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.RandomAccessFile readChannel$lambda$1;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
            long j = this.$start;
            if (!(j >= 0)) {
                throw new java.lang.IllegalArgumentException(("start position shouldn't be negative but it is " + j).toString());
            }
            long j2 = this.$endInclusive;
            long j3 = this.$fileLength;
            if (j2 <= j3 - 1) {
                readChannel$lambda$1 = io.ktor.util.cio.FileChannelsKt.readChannel$lambda$1(this.$randomAccessFile$delegate);
                java.io.RandomAccessFile randomAccessFile = readChannel$lambda$1;
                long j4 = this.$start;
                long j5 = this.$endInclusive;
                try {
                    java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                    this.L$0 = randomAccessFile;
                    this.label = 1;
                    if (io.ktor.util.cio.FileChannelsKt.writeToScope(channel, writerScope, j4, j5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = randomAccessFile;
                } catch (java.lang.Throwable th2) {
                    closeable = randomAccessFile;
                    th = th2;
                    throw th;
                }
            } else {
                throw new java.lang.IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j3 + ", endInclusive = " + j2).toString());
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
