package androidx.work.impl.background.systemalarm;

/* loaded from: classes3.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        androidx.work.Logger.get().debug(Camera2StreamConfigurationMap, "Received intent ".concat(java.lang.String.valueOf(intent)));
        try {
            androidx.work.impl.WorkManagerImpl.getInstance(context).setReschedulePendingResult(goAsync());
        } catch (java.lang.IllegalStateException e) {
            androidx.work.Logger.get().error(Camera2StreamConfigurationMap, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
