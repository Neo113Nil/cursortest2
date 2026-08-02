package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Ljava/io/OutputStream;", "out", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/io/OutputStream;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WritingKt {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.io.OutputStream outputStream, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 writingKt$copyTo$1;
        int i;
        long j2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 writingKt$copyTo$12;
        java.io.OutputStream outputStream2;
        if (continuation instanceof io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1) {
            writingKt$copyTo$1 = (io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1) continuation;
            if ((writingKt$copyTo$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                writingKt$copyTo$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = writingKt$copyTo$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writingKt$copyTo$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = 0;
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("Limit shouldn't be negative: ".concat(java.lang.String.valueOf(j)).toString());
                    }
                    byteReadChannel2 = byteReadChannel;
                    writingKt$copyTo$12 = writingKt$copyTo$1;
                    outputStream2 = outputStream;
                    if (!byteReadChannel2.isClosedForRead()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = writingKt$copyTo$1.getHighSpeedVideoFpsRanges;
                    java.io.OutputStream outputStream3 = (java.io.OutputStream) writingKt$copyTo$1.Camera2StreamConfigurationMap;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) writingKt$copyTo$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j4 = j3;
                    byteReadChannel2 = byteReadChannel3;
                    writingKt$copyTo$12 = writingKt$copyTo$1;
                    outputStream2 = outputStream3;
                    long sizeMut = byteReadChannel2.getReadBuffer().getGetHighSpeedVideoFpsRanges().getSizeMut();
                    kotlinx.io.BuffersJvmKt.readTo$default(byteReadChannel2.getReadBuffer().getGetHighSpeedVideoFpsRanges(), outputStream2, 0L, 2, null);
                    j2 = sizeMut + j4;
                    if (!byteReadChannel2.isClosedForRead()) {
                        if (byteReadChannel2.getReadBuffer().exhausted()) {
                            writingKt$copyTo$12.getHighSpeedVideoSizes = byteReadChannel2;
                            writingKt$copyTo$12.Camera2StreamConfigurationMap = outputStream2;
                            writingKt$copyTo$12.getHighSpeedVideoFpsRanges = j2;
                            writingKt$copyTo$12.getHighSpeedVideoFpsRangesFor = 1;
                            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, writingKt$copyTo$12, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        j4 = j2;
                        long sizeMut2 = byteReadChannel2.getReadBuffer().getGetHighSpeedVideoFpsRanges().getSizeMut();
                        kotlinx.io.BuffersJvmKt.readTo$default(byteReadChannel2.getReadBuffer().getGetHighSpeedVideoFpsRanges(), outputStream2, 0L, 2, null);
                        j2 = sizeMut2 + j4;
                        if (!byteReadChannel2.isClosedForRead()) {
                        }
                    } else {
                        return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2);
                    }
                }
            }
        }
        writingKt$copyTo$1 = new io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1(continuation);
        java.lang.Object obj2 = writingKt$copyTo$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writingKt$copyTo$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object copyTo$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.io.OutputStream outputStream, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, outputStream, j, continuation);
    }
}
