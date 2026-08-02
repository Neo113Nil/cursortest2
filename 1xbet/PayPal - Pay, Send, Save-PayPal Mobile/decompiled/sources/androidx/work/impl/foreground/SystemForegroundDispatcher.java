package androidx.work.impl.foreground;

/* loaded from: classes3.dex */
public class SystemForegroundDispatcher implements androidx.work.impl.constraints.OnConstraintsStateChangedListener, androidx.work.impl.ExecutionListener {
    static final java.lang.String getHighSpeedVideoSizes = androidx.work.Logger.tagWithPrefix("SystemFgDispatcher");
    final androidx.work.impl.constraints.WorkConstraintsTracker Camera2StreamConfigurationMap;
    androidx.work.impl.model.WorkGenerationalId getHighResolutionOutputSizeshNQ4ISI;
    androidx.work.impl.foreground.SystemForegroundDispatcher.Callback getHighSpeedVideoFpsRanges;
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo> getHighSpeedVideoFpsRangesFor;
    androidx.work.impl.WorkManagerImpl getHighSpeedVideoSizesFor;
    final java.lang.Object getInputFormats = new java.lang.Object();
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.model.WorkSpec> getInputSizeshNQ4ISI;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor getOutputFormats;
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, kotlinx.coroutines.Job> getOutputMinFrameDuration;
    private android.content.Context getOutputSizeshNQ4ISI;

    interface Callback {
        void cancelNotification(int i);

        void notify(int i, android.app.Notification notification);

        void startForeground(int i, int i2, android.app.Notification notification);

        void stop(int i);
    }

    SystemForegroundDispatcher(android.content.Context context) {
        this.getOutputSizeshNQ4ISI = context;
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(this.getOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizesFor = workManagerImpl;
        this.getOutputFormats = workManagerImpl.getWorkTaskExecutor();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.getOutputMinFrameDuration = new java.util.HashMap();
        this.getInputSizeshNQ4ISI = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = new androidx.work.impl.constraints.WorkConstraintsTracker(this.getHighSpeedVideoSizesFor.getTrackers());
        this.getHighSpeedVideoSizesFor.getProcessor().addExecutionListener(this);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(androidx.work.impl.model.WorkGenerationalId workGenerationalId, boolean z) {
        java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo> entry;
        synchronized (this.getInputFormats) {
            kotlinx.coroutines.Job remove = this.getInputSizeshNQ4ISI.remove(workGenerationalId) != null ? this.getOutputMinFrameDuration.remove(workGenerationalId) : null;
            if (remove != null) {
                remove.cancel((java.util.concurrent.CancellationException) null);
            }
        }
        androidx.work.ForegroundInfo remove2 = this.getHighSpeedVideoFpsRangesFor.remove(workGenerationalId);
        if (workGenerationalId.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
            if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
                java.util.Iterator<java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo>> it = this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
                java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI = entry.getKey();
                if (this.getHighSpeedVideoFpsRanges != null) {
                    androidx.work.ForegroundInfo value = entry.getValue();
                    this.getHighSpeedVideoFpsRanges.startForeground(value.getNotificationId(), value.getForegroundServiceType(), value.getNotification());
                    this.getHighSpeedVideoFpsRanges.cancelNotification(value.getNotificationId());
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
        androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback = this.getHighSpeedVideoFpsRanges;
        if (remove2 == null || callback == null) {
            return;
        }
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Removing Notification (id: ");
        sb.append(remove2.getNotificationId());
        sb.append(", workSpecId: ");
        sb.append(workGenerationalId);
        sb.append(", notificationType: ");
        sb.append(remove2.getForegroundServiceType());
        logger.debug(str, sb.toString());
        callback.cancelNotification(remove2.getNotificationId());
    }

    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoFpsRanges = null;
        synchronized (this.getInputFormats) {
            java.util.Iterator<kotlinx.coroutines.Job> it = this.getOutputMinFrameDuration.values().iterator();
            while (it.hasNext()) {
                it.next().cancel((java.util.concurrent.CancellationException) null);
            }
        }
        this.getHighSpeedVideoSizesFor.getProcessor().removeExecutionListener(this);
    }

    final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
        androidx.work.Logger.get().info(getHighSpeedVideoSizes, "Foreground service timed out, FGS type: ".concat(java.lang.String.valueOf(i2)));
        for (java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo> entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            if (entry.getValue().getForegroundServiceType() == i2) {
                this.getHighSpeedVideoSizesFor.stopForegroundWork(entry.getKey(), androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
            }
        }
        androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback = this.getHighSpeedVideoFpsRanges;
        if (callback != null) {
            callback.stop(i);
        }
    }

    final void Camera2StreamConfigurationMap(android.content.Intent intent) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        androidx.work.impl.model.WorkGenerationalId workGenerationalId = new androidx.work.impl.model.WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        sb.append(intExtra2);
        sb.append(")");
        logger.debug(str, sb.toString());
        if (notification == null) {
            throw new java.lang.IllegalArgumentException("Notification passed in the intent was null.");
        }
        androidx.work.ForegroundInfo foregroundInfo = new androidx.work.ForegroundInfo(intExtra, notification, intExtra2);
        this.getHighSpeedVideoFpsRangesFor.put(workGenerationalId, foregroundInfo);
        androidx.work.ForegroundInfo foregroundInfo2 = this.getHighSpeedVideoFpsRangesFor.get(this.getHighResolutionOutputSizeshNQ4ISI);
        if (foregroundInfo2 == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = workGenerationalId;
        } else {
            this.getHighSpeedVideoFpsRanges.notify(intExtra, notification);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.util.Iterator<java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.ForegroundInfo>> it = this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
                while (it.hasNext()) {
                    i |= it.next().getValue().getForegroundServiceType();
                }
                foregroundInfo = new androidx.work.ForegroundInfo(foregroundInfo2.getNotificationId(), foregroundInfo2.getNotification(), i);
            } else {
                foregroundInfo = foregroundInfo2;
            }
        }
        this.getHighSpeedVideoFpsRanges.startForeground(foregroundInfo.getNotificationId(), foregroundInfo.getForegroundServiceType(), foregroundInfo.getNotification());
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(androidx.work.impl.model.WorkSpec workSpec, androidx.work.impl.constraints.ConstraintsState constraintsState) {
        if (constraintsState instanceof androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) {
            androidx.work.Logger.get().debug(getHighSpeedVideoSizes, "Constraints unmet for WorkSpec ".concat(java.lang.String.valueOf(workSpec.id)));
            this.getHighSpeedVideoSizesFor.stopForegroundWork(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec), ((androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }

    public static android.content.Intent createStartForegroundIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId workGenerationalId, androidx.work.ForegroundInfo foregroundInfo) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        return intent;
    }

    public static android.content.Intent createCancelWorkIntent(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(android.net.Uri.parse("workspec://".concat(java.lang.String.valueOf(str))));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent createNotifyIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId workGenerationalId, androidx.work.ForegroundInfo foregroundInfo) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static android.content.Intent createStopForegroundIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
}
