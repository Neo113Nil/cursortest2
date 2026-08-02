package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/constraints/trackers/StorageNotLowTracker;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "readSystemState", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageNotLowTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageNotLowTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") != false) goto L18;
     */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean readSystemState() {
        android.content.Intent registerReceiver = getAppContext().registerReceiver(null, getIntentFilter());
        boolean z = true;
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            java.lang.String action = registerReceiver.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (hashCode == -730838620) {
                }
            }
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final android.content.IntentFilter getIntentFilter() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final void onBroadcastReceive(android.content.Intent intent) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.getAction() != null) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.StorageNotLowTrackerKt.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Received ");
            sb.append(intent.getAction());
            logger.debug(str, sb.toString());
            java.lang.String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        setState(java.lang.Boolean.FALSE);
                    }
                } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    setState(java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
