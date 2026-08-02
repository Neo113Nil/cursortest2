package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FileChannelsKt$readChannel$writer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.Lazy<java.io.RandomAccessFile> getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoSizesFor;
            long j = this.getHighSpeedVideoSizes;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("start position shouldn't be negative but it is ".concat(java.lang.String.valueOf(j)).toString());
            }
            long j2 = this.getHighSpeedVideoFpsRangesFor;
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j2 > j3 - 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("endInclusive points to the position out of the file: file size = ");
                sb.append(j3);
                sb.append(", endInclusive = ");
                sb.append(j2);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.io.RandomAccessFile access$readChannel$lambda$1 = io.ktor.util.cio.FileChannelsKt.access$readChannel$lambda$1(this.getHighSpeedVideoFpsRanges);
            long j4 = this.getHighSpeedVideoSizes;
            long j5 = this.getHighSpeedVideoFpsRangesFor;
            try {
                java.nio.channels.FileChannel channel = access$readChannel$lambda$1.getChannel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "");
                this.getHighSpeedVideoSizesFor = access$readChannel$lambda$1;
                this.Camera2StreamConfigurationMap = 1;
                if (io.ktor.util.cio.FileChannelsKt.writeToScope(channel, writerScope, j4, j5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = access$readChannel$lambda$1;
            } catch (java.lang.Throwable th2) {
                closeable = access$readChannel$lambda$1;
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
        return ((io.ktor.util.cio.FileChannelsKt$readChannel$writer$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.cio.FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new io.ktor.util.cio.FileChannelsKt$readChannel$writer$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        fileChannelsKt$readChannel$writer$1.getHighSpeedVideoSizesFor = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, kotlin.Lazy<? extends java.io.RandomAccessFile> lazy, kotlin.coroutines.Continuation<? super io.ktor.util.cio.FileChannelsKt$readChannel$writer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
        this.getHighSpeedVideoFpsRanges = lazy;
    }
}
