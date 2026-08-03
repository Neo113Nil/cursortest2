package io.ktor.util.cio;

/* compiled from: FileChannels.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0}, l = {106}, m = "invokeSuspend", n = {"file"}, s = {"L$1"})
/* loaded from: classes6.dex */
final class FileChannelsKt$writeChannel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.io.File $this_writeChannel;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileChannelsKt$writeChannel$1(java.io.File file, kotlin.coroutines.Continuation<? super io.ktor.util.cio.FileChannelsKt$writeChannel$1> continuation) {
        super(2, continuation);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.cio.FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new io.ktor.util.cio.FileChannelsKt$writeChannel$1(this.$this_writeChannel, continuation);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.ReaderScope readerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.cio.FileChannelsKt$writeChannel$1) create(readerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ReaderScope readerScope = (io.ktor.utils.io.ReaderScope) this.L$0;
                java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(this.$this_writeChannel, "rw");
                java.io.RandomAccessFile randomAccessFile3 = randomAccessFile2;
                io.ktor.utils.io.ByteReadChannel channel = readerScope.getChannel();
                java.nio.channels.FileChannel channel2 = randomAccessFile3.getChannel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel2, "getChannel(...)");
                this.L$0 = randomAccessFile2;
                this.L$1 = randomAccessFile3;
                this.label = 1;
                obj = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.copyTo$default(channel, channel2, 0L, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                randomAccessFile = randomAccessFile3;
                r1 = randomAccessFile2;
            } else {
                if (r1 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                randomAccessFile = (java.io.RandomAccessFile) this.L$1;
                java.io.Closeable closeable = (java.io.Closeable) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                r1 = closeable;
            }
            randomAccessFile.setLength(((java.lang.Number) obj).longValue());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(r1, null);
            return kotlin.Unit.INSTANCE;
        } finally {
        }
    }
}
