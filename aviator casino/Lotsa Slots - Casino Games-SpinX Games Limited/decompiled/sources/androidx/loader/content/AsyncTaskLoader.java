package androidx.loader.content;

/* loaded from: classes2.dex */
public abstract class AsyncTaskLoader<D> extends androidx.loader.content.Loader<D> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "AsyncTaskLoader";
    private volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private java.util.concurrent.Executor mExecutor;
    private android.os.Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mTask;
    private long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(D d) {
    }

    final class LoadTask extends androidx.loader.content.ModernAsyncTask<D> implements java.lang.Runnable {
        boolean waiting;

        LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected D doInBackground() {
            try {
                return (D) androidx.loader.content.AsyncTaskLoader.this.onLoadInBackground();
            } catch (androidx.core.os.OperationCanceledException e) {
                if (isCancelled()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onPostExecute(D d) {
            androidx.loader.content.AsyncTaskLoader.this.dispatchOnLoadComplete(this, d);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onCancelled(D d) {
            androidx.loader.content.AsyncTaskLoader.this.dispatchOnCancelled(this, d);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.waiting = false;
            androidx.loader.content.AsyncTaskLoader.this.executePendingTask();
        }
    }

    public AsyncTaskLoader(android.content.Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new android.os.Handler();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new androidx.loader.content.AsyncTaskLoader.LoadTask();
        executePendingTask();
    }

    @Override // androidx.loader.content.Loader
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean cancel = this.mTask.cancel(false);
        if (cancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return cancel;
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && android.os.SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.waiting = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        } else {
            if (this.mExecutor == null) {
                this.mExecutor = getExecutor();
            }
            this.mTask.executeOnExecutor(this.mExecutor);
        }
    }

    void dispatchOnCancelled(androidx.loader.content.AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        onCanceled(d);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(androidx.loader.content.AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    protected java.util.concurrent.Executor getExecutor() {
        return android.os.AsyncTask.THREAD_POOL_EXECUTOR;
    }

    @Override // androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(android.text.format.DateUtils.formatElapsedTime(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + android.text.format.DateUtils.formatElapsedTime(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(android.os.SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }
}
