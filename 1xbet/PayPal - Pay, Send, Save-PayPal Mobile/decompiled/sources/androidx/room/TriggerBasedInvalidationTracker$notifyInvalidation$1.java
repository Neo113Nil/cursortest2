package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0}, l = {417}, m = "notifyInvalidation", n = {"$this$ifNotClosed$iv"}, s = {"L$0"})
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$notifyInvalidation$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = triggerBasedInvalidationTracker;
    }
}
