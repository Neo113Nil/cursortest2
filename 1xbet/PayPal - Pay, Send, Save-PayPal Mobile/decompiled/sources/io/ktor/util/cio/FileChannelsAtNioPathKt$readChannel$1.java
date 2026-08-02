package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FileChannelsAtNioPathKt$readChannel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.nio.file.Path getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoSizesFor;
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("start position shouldn't be negative but it is ".concat(java.lang.String.valueOf(j)).toString());
            }
            long j2 = this.Camera2StreamConfigurationMap;
            long j3 = this.getHighSpeedVideoSizes;
            if (j2 > j3 - 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("endInclusive points to the position out of the file: file size = ");
                sb.append(j3);
                sb.append(", endInclusive = ");
                sb.append(j2);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.nio.channels.SeekableByteChannel newByteChannel = java.nio.file.Files.newByteChannel(this.getHighSpeedVideoFpsRanges, new java.nio.file.OpenOption[0]);
            long j4 = this.getHighSpeedVideoFpsRangesFor;
            long j5 = this.Camera2StreamConfigurationMap;
            try {
                java.nio.channels.SeekableByteChannel seekableByteChannel = newByteChannel;
                kotlin.jvm.internal.Intrinsics.checkNotNull(seekableByteChannel);
                this.getHighSpeedVideoSizesFor = newByteChannel;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (io.ktor.util.cio.FileChannelsKt.writeToScope(seekableByteChannel, writerScope, j4, j5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = newByteChannel;
            } catch (java.lang.Throwable th2) {
                closeable = newByteChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) this.getHighSpeedVideoSizesFor;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1 fileChannelsAtNioPathKt$readChannel$1 = new io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        fileChannelsAtNioPathKt$readChannel$1.getHighSpeedVideoSizesFor = obj;
        return fileChannelsAtNioPathKt$readChannel$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileChannelsAtNioPathKt$readChannel$1(long j, long j2, long j3, java.nio.file.Path path, kotlin.coroutines.Continuation<? super io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoSizes = j3;
        this.getHighSpeedVideoFpsRanges = path;
    }
}
