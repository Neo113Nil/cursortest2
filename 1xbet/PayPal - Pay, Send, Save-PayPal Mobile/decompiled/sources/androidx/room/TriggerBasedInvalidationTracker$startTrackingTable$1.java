package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0, 1, 1, 1}, l = {328, com.visa.cbp.getCertUsage.getODAData}, m = "startTrackingTable", n = {"connection", "tableId", "connection", "tableName", "tableId"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(this.getInputFormats, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$startTrackingTable$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1> continuation) {
        super(continuation);
        this.getInputFormats = triggerBasedInvalidationTracker;
    }
}
