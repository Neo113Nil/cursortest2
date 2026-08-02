package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {132, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 142, 142}, m = "copyAndClose", n = {"$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$copyAndClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose(null, null, this);
    }

    ByteReadChannelOperationsKt$copyAndClose$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1> continuation) {
        super(continuation);
    }
}
