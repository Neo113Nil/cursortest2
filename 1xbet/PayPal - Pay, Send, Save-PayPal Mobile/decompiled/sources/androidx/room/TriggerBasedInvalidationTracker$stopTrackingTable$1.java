package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {347}, m = "stopTrackingTable", n = {"connection", "tableName"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(this.getOutputFormats, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$stopTrackingTable$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1> continuation) {
        super(continuation);
        this.getOutputFormats = triggerBasedInvalidationTracker;
    }
}
