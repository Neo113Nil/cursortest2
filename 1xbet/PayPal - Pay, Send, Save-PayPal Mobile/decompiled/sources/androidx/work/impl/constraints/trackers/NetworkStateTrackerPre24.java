package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre24;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "readSystemState", "()Landroidx/work/impl/constraints/NetworkState;", "Landroid/net/ConnectivityManager;", "Camera2StreamConfigurationMap", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoSizes", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "getIntentFilter$annotations", "()V", "intentFilter"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkStateTrackerPre24 extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<androidx.work.impl.constraints.NetworkState> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighSpeedVideoSizes;

    public static /* synthetic */ void getIntentFilter$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateTrackerPre24(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        java.lang.Object systemService = getAppContext().getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoSizes = (android.net.ConnectivityManager) systemService;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final void onBroadcastReceive(android.content.Intent intent) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger.debug(str, "Network broadcast received");
            setState(androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(this.getHighSpeedVideoSizes, false));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final android.content.IntentFilter getIntentFilter() {
        return new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final androidx.work.impl.constraints.NetworkState readSystemState() {
        return androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(this.getHighSpeedVideoSizes, false);
    }
}
