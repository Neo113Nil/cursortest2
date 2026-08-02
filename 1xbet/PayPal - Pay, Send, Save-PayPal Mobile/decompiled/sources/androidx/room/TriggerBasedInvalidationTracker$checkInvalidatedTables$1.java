package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 1}, l = {445, 453}, m = "checkInvalidatedTables", n = {"connection", "invalidatedTableIds"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$checkInvalidatedTables$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$checkInvalidatedTables(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$checkInvalidatedTables$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = triggerBasedInvalidationTracker;
    }
}
