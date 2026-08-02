package io.ktor.client.plugins;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0}, l = {110}, m = "HttpCallValidator$lambda$2$validateResponse", n = {"response"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.HttpCallValidatorKt.access$HttpCallValidator$lambda$2$validateResponse(null, null, this);
    }

    HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1> continuation) {
        super(continuation);
    }
}
