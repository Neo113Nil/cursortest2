package coil3.intercept;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0}, l = {75}, m = "intercept", n = {"chain"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class EngineInterceptor$intercept$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.intercept.EngineInterceptor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.intercept(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$1(coil3.intercept.EngineInterceptor engineInterceptor, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor$intercept$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = engineInterceptor;
    }
}
