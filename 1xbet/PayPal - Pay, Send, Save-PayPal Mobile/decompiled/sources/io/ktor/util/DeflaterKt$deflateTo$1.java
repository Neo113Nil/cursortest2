package io.ktor.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {72, 77, 82, 88, 91}, m = "deflateTo", n = {"$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "destination", "pool", "crc", "deflater", "input", "compressed", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "pool", "deflater", "input", "compressed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class DeflaterKt$deflateTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = io.ktor.util.DeflaterKt.getHighResolutionOutputSizeshNQ4ISI(null, null, false, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    DeflaterKt$deflateTo$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$deflateTo$1> continuation) {
        super(continuation);
    }
}
