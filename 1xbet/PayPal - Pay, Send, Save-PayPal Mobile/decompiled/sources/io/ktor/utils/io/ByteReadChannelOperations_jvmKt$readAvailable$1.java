package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0}, l = {40}, m = "readAvailable", n = {"$this$readAvailable", "buffer"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class ByteReadChannelOperations_jvmKt$readAvailable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(null, null, this);
    }

    ByteReadChannelOperations_jvmKt$readAvailable$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1> continuation) {
        super(continuation);
    }
}
