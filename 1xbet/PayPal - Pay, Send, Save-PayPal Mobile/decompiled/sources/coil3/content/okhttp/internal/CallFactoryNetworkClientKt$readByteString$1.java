package coil3.content.okhttp.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClientKt", f = "CallFactoryNetworkClient.kt", i = {0}, l = {39}, m = "readByteString", n = {"buffer"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CallFactoryNetworkClientKt$readByteString$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = coil3.content.okhttp.internal.CallFactoryNetworkClientKt.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    CallFactoryNetworkClientKt$readByteString$1(kotlin.coroutines.Continuation<? super coil3.content.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1> continuation) {
        super(continuation);
    }
}
