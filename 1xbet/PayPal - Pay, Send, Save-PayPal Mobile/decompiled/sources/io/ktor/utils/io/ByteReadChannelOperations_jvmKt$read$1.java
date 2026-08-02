package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0, 1, 1}, l = {192, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "read", n = {"$this$read", "consumer", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "$this$read", "consumer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class ByteReadChannelOperations_jvmKt$read$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.read(null, 0, null, this);
    }

    ByteReadChannelOperations_jvmKt$read$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1> continuation) {
        super(continuation);
    }
}
