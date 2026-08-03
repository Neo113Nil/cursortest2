package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class StopWorkRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("StopWorkRunnable");
    private final boolean mStopInForeground;
    private final androidx.work.impl.StartStopToken mToken;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    public StopWorkRunnable(androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.impl.StartStopToken startStopToken, boolean stopInForeground) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mToken = startStopToken;
        this.mStopInForeground = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean stopWork;
        if (this.mStopInForeground) {
            stopWork = this.mWorkManagerImpl.getProcessor().stopForegroundWork(this.mToken);
        } else {
            stopWork = this.mWorkManagerImpl.getProcessor().stopWork(this.mToken);
        }
        androidx.work.Logger.get().debug(TAG, "StopWorkRunnable for " + this.mToken.getId().getWorkSpecId() + "; Processor.stopWork = " + stopWork);
    }
}
