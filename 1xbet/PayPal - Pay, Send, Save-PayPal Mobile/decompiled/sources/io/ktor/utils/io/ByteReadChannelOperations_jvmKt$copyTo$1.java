package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {205, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "copyTo", n = {"$this$copyTo", "copied", "copy", "$this$read$iv", "limit", "min$iv", "$this$copyTo", "copied", "copy", "$this$read$iv", "limit"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0"})
/* loaded from: classes17.dex */
final class ByteReadChannelOperations_jvmKt$copyTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.copyTo(null, null, 0L, this);
    }

    ByteReadChannelOperations_jvmKt$copyTo$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1> continuation) {
        super(continuation);
    }
}
