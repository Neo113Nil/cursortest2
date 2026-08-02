package coil3.intercept;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {203}, m = "decode", n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 1)
/* loaded from: classes3.dex */
final class EngineInterceptor$decode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ coil3.intercept.EngineInterceptor getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$decode$1(coil3.intercept.EngineInterceptor engineInterceptor, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor$decode$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = engineInterceptor;
    }
}
