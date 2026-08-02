package coil3.content.okhttp.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClientKt", f = "CallFactoryNetworkClient.kt", i = {0, 0}, l = {32}, m = "toRequest", n = {"$this$toRequest", "request"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class CallFactoryNetworkClientKt$toRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return coil3.content.okhttp.internal.CallFactoryNetworkClientKt.access$toRequest(null, this);
    }

    CallFactoryNetworkClientKt$toRequest$1(kotlin.coroutines.Continuation<? super coil3.content.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1> continuation) {
        super(continuation);
    }
}
