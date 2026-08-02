package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", i = {0}, l = {104}, m = "emit", n = {"indexedValue"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CachedPageEventFlow$downstreamFlow$1$2$emit$1(androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = anonymousClass2;
    }
}
