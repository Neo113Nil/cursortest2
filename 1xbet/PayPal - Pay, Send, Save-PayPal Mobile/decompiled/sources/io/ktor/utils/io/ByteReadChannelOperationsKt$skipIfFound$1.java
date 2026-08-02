package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED, 599}, m = "skipIfFound", n = {"$this$skipIfFound", "byteString"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$skipIfFound$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(null, null, this);
    }

    ByteReadChannelOperationsKt$skipIfFound$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1> continuation) {
        super(continuation);
    }
}
