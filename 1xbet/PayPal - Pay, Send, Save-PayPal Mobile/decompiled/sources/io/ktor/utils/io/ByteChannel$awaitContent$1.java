package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "awaitContent", n = {"this_$iv", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
final class ByteChannel$awaitContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.awaitContent(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannel$awaitContent$1(io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannel$awaitContent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = byteChannel;
    }
}
