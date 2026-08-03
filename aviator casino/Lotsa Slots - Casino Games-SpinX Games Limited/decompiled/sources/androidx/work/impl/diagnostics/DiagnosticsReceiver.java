package androidx.work.impl.diagnostics;

/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        androidx.work.Logger.get().debug(TAG, "Requesting diagnostics");
        try {
            androidx.work.WorkManager.getInstance(context).enqueue(androidx.work.OneTimeWorkRequest.from((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.impl.workers.DiagnosticsWorker.class));
        } catch (java.lang.IllegalStateException e) {
            androidx.work.Logger.get().error(TAG, "WorkManager is not initialized", e);
        }
    }
}
