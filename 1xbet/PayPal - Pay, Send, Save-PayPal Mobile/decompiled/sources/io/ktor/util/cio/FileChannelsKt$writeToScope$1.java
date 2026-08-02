package io.ktor.util.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt", f = "FileChannels.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {144, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "writeToScope", n = {"$this$writeToScope", "$this$writeWhile$iv", "done$iv", "$this$writeToScope", com.daon.sdk.face.license.License.FEATURE_POSITION, "$this$writeWhile$iv", "done$iv", "endInclusive"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0"})
/* loaded from: classes17.dex */
final class FileChannelsKt$writeToScope$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.util.cio.FileChannelsKt.writeToScope(null, null, 0L, 0L, this);
    }

    FileChannelsKt$writeToScope$1(kotlin.coroutines.Continuation<? super io.ktor.util.cio.FileChannelsKt$writeToScope$1> continuation) {
        super(continuation);
    }
}
