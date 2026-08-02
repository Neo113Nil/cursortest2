package io.ktor.client.plugins.sse;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {648, androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay}, m = "serverSentEvents-Mswn-_c", n = {"block", "session"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class BuildersKt$serverSentEvents$8 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.sse.BuildersKt.m23284serverSentEventsMswn_c(null, null, null, null, null, null, null, this);
    }

    BuildersKt$serverSentEvents$8(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8> continuation) {
        super(continuation);
    }
}
