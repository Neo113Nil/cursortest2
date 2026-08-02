package coil3.intercept;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {126, 130, 148}, m = "execute", n = {"request", "mappedData", "eventListener", "options", "components", "fetchResult", "request", "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3"}, v = 1)
/* loaded from: classes3.dex */
final class EngineInterceptor$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ coil3.intercept.EngineInterceptor getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$1(coil3.intercept.EngineInterceptor engineInterceptor, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor$execute$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = engineInterceptor;
    }
}
