package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {}, l = {417}, m = "initialize", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class RemoteMediatorAccessImpl$initialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.RemoteMediatorAccessImpl<Key, Value> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.initialize(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$initialize$1(androidx.paging.RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediatorAccessImpl$initialize$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = remoteMediatorAccessImpl;
    }
}
