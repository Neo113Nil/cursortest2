package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {}, l = {43}, m = "runInIsolation", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SingleRunner$runInIsolation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.SingleRunner getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.runInIsolation(0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$1(androidx.paging.SingleRunner singleRunner, kotlin.coroutines.Continuation<? super androidx.paging.SingleRunner$runInIsolation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = singleRunner;
    }
}
