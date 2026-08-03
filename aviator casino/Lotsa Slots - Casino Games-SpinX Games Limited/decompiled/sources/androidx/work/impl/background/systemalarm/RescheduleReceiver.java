package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        androidx.work.Logger.get().debug(TAG, "Received intent " + intent);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            try {
                androidx.work.impl.WorkManagerImpl.getInstance(context).setReschedulePendingResult(goAsync());
                return;
            } catch (java.lang.IllegalStateException e) {
                androidx.work.Logger.get().error(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        context.startService(androidx.work.impl.background.systemalarm.CommandHandler.createRescheduleIntent(context));
    }
}
