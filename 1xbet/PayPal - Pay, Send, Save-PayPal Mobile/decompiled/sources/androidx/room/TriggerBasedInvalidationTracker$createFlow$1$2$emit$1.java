package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", i = {0, 1}, l = {247, 256}, m = "emit", n = {"newVersions", "newVersions"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anonymousClass2;
    }
}
