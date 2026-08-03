package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class WorkTimer {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkTimer");
    final androidx.work.RunnableScheduler mRunnableScheduler;
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> mTimerMap = new java.util.HashMap();
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> mListeners = new java.util.HashMap();
    final java.lang.Object mLock = new java.lang.Object();

    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(androidx.work.impl.model.WorkGenerationalId id);
    }

    public WorkTimer(androidx.work.RunnableScheduler scheduler) {
        this.mRunnableScheduler = scheduler;
    }

    public void startTimer(final androidx.work.impl.model.WorkGenerationalId id, long processingTimeMillis, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener listener) {
        synchronized (this.mLock) {
            androidx.work.Logger.get().debug(TAG, "Starting timer for " + id);
            stopTimer(id);
            androidx.work.impl.utils.WorkTimer.WorkTimerRunnable workTimerRunnable = new androidx.work.impl.utils.WorkTimer.WorkTimerRunnable(this, id);
            this.mTimerMap.put(id, workTimerRunnable);
            this.mListeners.put(id, listener);
            this.mRunnableScheduler.scheduleWithDelay(processingTimeMillis, workTimerRunnable);
        }
    }

    public void stopTimer(final androidx.work.impl.model.WorkGenerationalId id) {
        synchronized (this.mLock) {
            if (this.mTimerMap.remove(id) != null) {
                androidx.work.Logger.get().debug(TAG, "Stopping timer for " + id);
                this.mListeners.remove(id);
            }
        }
    }

    public java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> getTimerMap() {
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> map;
        synchronized (this.mLock) {
            map = this.mTimerMap;
        }
        return map;
    }

    public java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> getListeners() {
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> map;
        synchronized (this.mLock) {
            map = this.mListeners;
        }
        return map;
    }

    public static class WorkTimerRunnable implements java.lang.Runnable {
        static final java.lang.String TAG = "WrkTimerRunnable";
        private final androidx.work.impl.model.WorkGenerationalId mWorkGenerationalId;
        private final androidx.work.impl.utils.WorkTimer mWorkTimer;

        WorkTimerRunnable(androidx.work.impl.utils.WorkTimer workTimer, androidx.work.impl.model.WorkGenerationalId id) {
            this.mWorkTimer = workTimer;
            this.mWorkGenerationalId = id;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (this.mWorkTimer.mTimerMap.remove(this.mWorkGenerationalId) != null) {
                    androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener remove = this.mWorkTimer.mListeners.remove(this.mWorkGenerationalId);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.mWorkGenerationalId);
                    }
                } else {
                    androidx.work.Logger.get().debug(TAG, java.lang.String.format("Timer with %s is already marked as complete.", this.mWorkGenerationalId));
                }
            }
        }
    }
}
