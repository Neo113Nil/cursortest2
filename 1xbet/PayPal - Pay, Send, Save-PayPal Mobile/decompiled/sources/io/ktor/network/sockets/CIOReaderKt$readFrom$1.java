package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "readFrom", n = {com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CIOReaderKt$readFrom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.network.sockets.CIOReaderKt.access$readFrom(null, null, this);
    }

    CIOReaderKt$readFrom$1(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOReaderKt$readFrom$1> continuation) {
        super(continuation);
    }
}
