package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", i = {}, l = {638}, m = "collect", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObservedTableVersions$collect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.room.ObservedTableVersions getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.collect(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservedTableVersions$collect$1(androidx.room.ObservedTableVersions observedTableVersions, kotlin.coroutines.Continuation<? super androidx.room.ObservedTableVersions$collect$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = observedTableVersions;
    }
}
