package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {412}, m = "collect", n = {}, s = {})
/* loaded from: classes5.dex */
final class SubscribedSharedFlow$collect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.SubscribedSharedFlow<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.collect(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribedSharedFlow$collect$1(kotlinx.coroutines.flow.SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = subscribedSharedFlow;
    }
}
