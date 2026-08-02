package io.ktor.client.plugins;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {117, 118}, m = "HttpCallValidator$lambda$2$processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$processException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.HttpCallValidatorKt.access$HttpCallValidator$lambda$2$processException(null, null, null, this);
    }

    HttpCallValidatorKt$HttpCallValidator$2$processException$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1> continuation) {
        super(continuation);
    }
}
