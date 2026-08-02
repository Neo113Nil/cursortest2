package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/ByteBuffer;", "buffer", "Lkotlin/Function1;", "", "block", "pass", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReadersJvmKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:10:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object pass(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.cio.ReadersJvmKt$pass$1 readersJvmKt$pass$1;
        int i;
        if (continuation instanceof io.ktor.util.cio.ReadersJvmKt$pass$1) {
            readersJvmKt$pass$1 = (io.ktor.util.cio.ReadersJvmKt$pass$1) continuation;
            if ((readersJvmKt$pass$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                readersJvmKt$pass$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = readersJvmKt$pass$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readersJvmKt$pass$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) readersJvmKt$pass$1.getHighSpeedVideoFpsRanges;
                    byteBuffer = (java.nio.ByteBuffer) readersJvmKt$pass$1.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) readersJvmKt$pass$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    byteReadChannel = byteReadChannel2;
                    byteBuffer.flip();
                    function1.invoke(byteBuffer);
                    if (!byteReadChannel.isClosedForRead()) {
                        byteBuffer.clear();
                        readersJvmKt$pass$1.Camera2StreamConfigurationMap = byteReadChannel;
                        readersJvmKt$pass$1.getHighSpeedVideoSizes = byteBuffer;
                        readersJvmKt$pass$1.getHighSpeedVideoFpsRanges = function1;
                        readersJvmKt$pass$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel, byteBuffer, readersJvmKt$pass$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteBuffer.flip();
                        function1.invoke(byteBuffer);
                        if (!byteReadChannel.isClosedForRead()) {
                            java.lang.Throwable closedCause = byteReadChannel.getClosedCause();
                            if (closedCause != null) {
                                throw closedCause;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        readersJvmKt$pass$1 = new io.ktor.util.cio.ReadersJvmKt$pass$1(continuation);
        java.lang.Object obj2 = readersJvmKt$pass$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readersJvmKt$pass$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }
}
