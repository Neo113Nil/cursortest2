package coil3.intercept;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {259}, m = "transform", n = {"result", "request", "options", "eventListener", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
/* loaded from: classes7.dex */
final class EngineInterceptorKt$transform$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return coil3.intercept.EngineInterceptorKt.transform(null, null, null, null, null, this);
    }

    EngineInterceptorKt$transform$1(kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptorKt$transform$1> continuation) {
        super(continuation);
    }
}
