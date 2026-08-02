package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", i = {0}, l = {74, 75}, m = "emit", n = {"it"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CachedPageEventFlow$job$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CachedPageEventFlow$job$1$1$emit$1(androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$job$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anonymousClass1;
    }
}
