package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 201, 201}, m = "copyTo", n = {"$this$copyTo", "channel", "limit", "remaining", "$this$copyTo", "channel", "limit", "remaining", "limit", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$copyTo$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
    }

    ByteReadChannelOperationsKt$copyTo$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2> continuation) {
        super(continuation);
    }
}
