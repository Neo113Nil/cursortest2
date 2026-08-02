package io.ktor.client.engine.android;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", i = {0, 0}, l = {61}, m = "timeoutAwareConnection", n = {"request", "cause"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class AndroidURLConnectionUtilsKt$timeoutAwareConnection$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(null, null, null, this);
    }

    AndroidURLConnectionUtilsKt$timeoutAwareConnection$1(kotlin.coroutines.Continuation<? super io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1> continuation) {
        super(continuation);
    }
}
