package coil3.intercept;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0}, l = {31}, m = "proceed", n = {"interceptor"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class RealInterceptorChain$proceed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.intercept.RealInterceptorChain getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.proceed(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealInterceptorChain$proceed$1(coil3.intercept.RealInterceptorChain realInterceptorChain, kotlin.coroutines.Continuation<? super coil3.intercept.RealInterceptorChain$proceed$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = realInterceptorChain;
    }
}
