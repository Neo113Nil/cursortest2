package coil3.content.okhttp.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "CallFactoryNetworkClient.kt", i = {0, 1}, l = {24, 24, 25}, m = "executeRequest-impl", n = {"block", "block"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class CallFactoryNetworkClient$executeRequest$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return coil3.content.okhttp.internal.CallFactoryNetworkClient.m9788executeRequestimpl(null, null, null, this);
    }

    CallFactoryNetworkClient$executeRequest$1(kotlin.coroutines.Continuation<? super coil3.content.okhttp.internal.CallFactoryNetworkClient$executeRequest$1> continuation) {
        super(continuation);
    }
}
