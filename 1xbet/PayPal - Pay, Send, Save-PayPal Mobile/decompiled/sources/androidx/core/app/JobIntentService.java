package androidx.core.app;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public abstract class JobIntentService extends android.app.Service {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "JobIntentService";
    androidx.core.app.JobIntentService.WorkEnqueuer mCompatWorkEnqueuer;
    androidx.core.app.JobIntentService.CommandProcessor mCurProcessor;
    androidx.core.app.JobIntentService.CompatJobEngine mJobImpl;
    static final java.lang.Object sLock = new java.lang.Object();
    static final java.util.HashMap<android.content.ComponentName, androidx.core.app.JobIntentService.WorkEnqueuer> sClassWorkEnqueuer = new java.util.HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> mCompatQueue = null;

    interface CompatJobEngine {
        android.os.IBinder getHighResolutionOutputSizeshNQ4ISI();

        androidx.core.app.JobIntentService.GenericWorkItem getHighSpeedVideoSizes();
    }

    interface GenericWorkItem {
        android.content.Intent getHighResolutionOutputSizeshNQ4ISI();

        void getHighSpeedVideoSizes();
    }

    protected abstract void onHandleWork(android.content.Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    static abstract class WorkEnqueuer {
        boolean Camera2StreamConfigurationMap;
        final android.content.ComponentName getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        public void Camera2StreamConfigurationMap() {
        }

        abstract void Camera2StreamConfigurationMap(android.content.Intent intent);

        public void getHighSpeedVideoFpsRanges() {
        }

        public void getHighSpeedVideoFpsRangesFor() {
        }

        WorkEnqueuer(android.content.ComponentName componentName) {
            this.getHighSpeedVideoFpsRangesFor = componentName;
        }

        void getHighSpeedVideoFpsRanges(int i) {
            if (!this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes = i;
            } else {
                if (this.getHighSpeedVideoSizes == i) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.getHighSpeedVideoSizes);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class CompatWorkEnqueuer extends androidx.core.app.JobIntentService.WorkEnqueuer {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        private final android.os.PowerManager.WakeLock getInputFormats;
        private final android.content.Context getInputSizeshNQ4ISI;
        private final android.os.PowerManager.WakeLock getOutputMinFrameDuration;

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        final void Camera2StreamConfigurationMap(android.content.Intent intent) {
            android.content.Intent intent2 = new android.content.Intent(intent);
            intent2.setComponent(this.getHighSpeedVideoFpsRangesFor);
            if (this.getInputSizeshNQ4ISI.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                        if (!this.getHighSpeedVideoFpsRanges) {
                            this.getOutputMinFrameDuration.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void getHighSpeedVideoFpsRangesFor() {
            synchronized (this) {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void getHighSpeedVideoFpsRanges() {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getInputFormats.acquire(androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
                    this.getOutputMinFrameDuration.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void Camera2StreamConfigurationMap() {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.getOutputMinFrameDuration.acquire(60000L);
                    }
                    this.getHighSpeedVideoFpsRanges = false;
                    this.getInputFormats.release();
                }
            }
        }
    }

    static final class JobServiceEngineImpl extends android.app.job.JobServiceEngine implements androidx.core.app.JobIntentService.CompatJobEngine {
        final androidx.core.app.JobIntentService getHighResolutionOutputSizeshNQ4ISI;
        android.app.job.JobParameters getHighSpeedVideoFpsRangesFor;
        final java.lang.Object getHighSpeedVideoSizes;

        final class WrapperWorkItem implements androidx.core.app.JobIntentService.GenericWorkItem {
            final android.app.job.JobWorkItem Camera2StreamConfigurationMap;

            WrapperWorkItem(android.app.job.JobWorkItem jobWorkItem) {
                this.Camera2StreamConfigurationMap = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final android.content.Intent getHighResolutionOutputSizeshNQ4ISI() {
                return this.Camera2StreamConfigurationMap.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final void getHighSpeedVideoSizes() {
                synchronized (androidx.core.app.JobIntentService.JobServiceEngineImpl.this.getHighSpeedVideoSizes) {
                    if (androidx.core.app.JobIntentService.JobServiceEngineImpl.this.getHighSpeedVideoFpsRangesFor != null) {
                        androidx.core.app.JobIntentService.JobServiceEngineImpl.this.getHighSpeedVideoFpsRangesFor.completeWork(this.Camera2StreamConfigurationMap);
                    }
                }
            }
        }

        JobServiceEngineImpl(androidx.core.app.JobIntentService jobIntentService) {
            super(jobIntentService);
            this.getHighSpeedVideoSizes = new java.lang.Object();
            this.getHighResolutionOutputSizeshNQ4ISI = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public final android.os.IBinder getHighResolutionOutputSizeshNQ4ISI() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
            this.getHighSpeedVideoFpsRangesFor = jobParameters;
            this.getHighResolutionOutputSizeshNQ4ISI.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
            boolean doStopCurrentWork = this.getHighResolutionOutputSizeshNQ4ISI.doStopCurrentWork();
            synchronized (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            return doStopCurrentWork;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public final androidx.core.app.JobIntentService.GenericWorkItem getHighSpeedVideoSizes() {
            synchronized (this.getHighSpeedVideoSizes) {
                android.app.job.JobParameters jobParameters = this.getHighSpeedVideoFpsRangesFor;
                if (jobParameters == null) {
                    return null;
                }
                android.app.job.JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.getHighResolutionOutputSizeshNQ4ISI.getClassLoader());
                return new androidx.core.app.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(dequeueWork);
            }
        }
    }

    static final class JobWorkEnqueuer extends androidx.core.app.JobIntentService.WorkEnqueuer {
        private final android.app.job.JobInfo getHighResolutionOutputSizeshNQ4ISI;
        private final android.app.job.JobScheduler getHighSpeedVideoFpsRanges;

        JobWorkEnqueuer(android.content.Context context, android.content.ComponentName componentName, int i) {
            super(componentName);
            getHighSpeedVideoFpsRanges(i);
            this.getHighResolutionOutputSizeshNQ4ISI = new android.app.job.JobInfo.Builder(i, this.getHighSpeedVideoFpsRangesFor).setOverrideDeadline(0L).build();
            this.getHighSpeedVideoFpsRanges = (android.app.job.JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        final void Camera2StreamConfigurationMap(android.content.Intent intent) {
            this.getHighSpeedVideoFpsRanges.enqueue(this.getHighResolutionOutputSizeshNQ4ISI, new android.app.job.JobWorkItem(intent));
        }
    }

    final class CompatWorkItem implements androidx.core.app.JobIntentService.GenericWorkItem {
        final android.content.Intent getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;

        CompatWorkItem(android.content.Intent intent, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = intent;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final android.content.Intent getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final void getHighSpeedVideoSizes() {
            androidx.core.app.JobIntentService.this.stopSelf(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    final class CommandProcessor extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
            while (true) {
                androidx.core.app.JobIntentService.GenericWorkItem dequeueWork = androidx.core.app.JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                androidx.core.app.JobIntentService.this.onHandleWork(dequeueWork.getHighResolutionOutputSizeshNQ4ISI());
                dequeueWork.getHighSpeedVideoSizes();
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onCancelled(java.lang.Void r1) {
            androidx.core.app.JobIntentService.this.processorFinished();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.Void r1) {
            androidx.core.app.JobIntentService.this.processorFinished();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new androidx.core.app.JobIntentService.JobServiceEngineImpl(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getHighSpeedVideoFpsRangesFor();
        synchronized (this.mCompatQueue) {
            java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            arrayList.add(new androidx.core.app.JobIntentService.CompatWorkItem(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        androidx.core.app.JobIntentService.CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.Camera2StreamConfigurationMap();
            }
        }
    }

    public static void enqueueWork(android.content.Context context, java.lang.Class<?> cls, int i, android.content.Intent intent) {
        enqueueWork(context, new android.content.ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(android.content.Context context, android.content.ComponentName componentName, int i, android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            androidx.core.app.JobIntentService.WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.getHighSpeedVideoFpsRanges(i);
            workEnqueuer.Camera2StreamConfigurationMap(intent);
        }
    }

    static androidx.core.app.JobIntentService.WorkEnqueuer getWorkEnqueuer(android.content.Context context, android.content.ComponentName componentName, boolean z, int i) {
        java.util.HashMap<android.content.ComponentName, androidx.core.app.JobIntentService.WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        androidx.core.app.JobIntentService.WorkEnqueuer workEnqueuer = hashMap.get(componentName);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("Can't be here without a job id");
        }
        androidx.core.app.JobIntentService.JobWorkEnqueuer jobWorkEnqueuer = new androidx.core.app.JobIntentService.JobWorkEnqueuer(context, componentName, i);
        hashMap.put(componentName, jobWorkEnqueuer);
        return jobWorkEnqueuer;
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    boolean doStopCurrentWork() {
        androidx.core.app.JobIntentService.CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new androidx.core.app.JobIntentService.CommandProcessor();
            androidx.core.app.JobIntentService.WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z) {
                workEnqueuer.getHighSpeedVideoFpsRanges();
            }
            this.mCurProcessor.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }

    void processorFinished() {
        java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.Camera2StreamConfigurationMap();
                }
            }
        }
    }

    androidx.core.app.JobIntentService.GenericWorkItem dequeueWork() {
        androidx.core.app.JobIntentService.CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.getHighSpeedVideoSizes();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            return this.mCompatQueue.remove(0);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
