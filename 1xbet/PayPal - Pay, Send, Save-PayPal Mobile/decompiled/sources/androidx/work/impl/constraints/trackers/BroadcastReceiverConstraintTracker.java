package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "T", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "startTracking", "()V", "stopTracking", "Landroid/content/BroadcastReceiver;", "getHighSpeedVideoFpsRanges", "Landroid/content/BroadcastReceiver;", "Camera2StreamConfigurationMap", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends androidx.work.impl.constraints.trackers.ConstraintTracker<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.BroadcastReceiver Camera2StreamConfigurationMap;

    public abstract android.content.IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(android.content.Intent intent);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        this.Camera2StreamConfigurationMap = new android.content.BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<T> getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                this.getHighResolutionOutputSizeshNQ4ISI.onBroadcastReceive(intent);
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        java.lang.String str;
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTrackerKt.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": registering receiver");
        logger.debug(str, sb.toString());
        getAppContext().registerReceiver(this.Camera2StreamConfigurationMap, getIntentFilter());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        java.lang.String str;
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTrackerKt.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": unregistering receiver");
        logger.debug(str, sb.toString());
        getAppContext().unregisterReceiver(this.Camera2StreamConfigurationMap);
    }
}
