package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public class SystemAlarmDispatcher implements androidx.work.impl.ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final java.lang.String KEY_START_ID = "KEY_START_ID";
    private static final java.lang.String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemAlarmDispatcher");
    final androidx.work.impl.background.systemalarm.CommandHandler mCommandHandler;
    private androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener mCompletedListener;
    final android.content.Context mContext;
    android.content.Intent mCurrentIntent;
    final java.util.List<android.content.Intent> mIntents;
    private final androidx.work.impl.Processor mProcessor;
    private androidx.work.impl.StartStopTokens mStartStopTokens;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;
    private final androidx.work.impl.utils.WorkTimer mWorkTimer;

    interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    SystemAlarmDispatcher(android.content.Context context) {
        this(context, null, null);
    }

    SystemAlarmDispatcher(android.content.Context context, androidx.work.impl.Processor processor, androidx.work.impl.WorkManagerImpl workManager) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mStartStopTokens = new androidx.work.impl.StartStopTokens();
        this.mCommandHandler = new androidx.work.impl.background.systemalarm.CommandHandler(applicationContext, this.mStartStopTokens);
        workManager = workManager == null ? androidx.work.impl.WorkManagerImpl.getInstance(context) : workManager;
        this.mWorkManager = workManager;
        this.mWorkTimer = new androidx.work.impl.utils.WorkTimer(workManager.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManager.getProcessor() : processor;
        this.mProcessor = processor;
        this.mTaskExecutor = workManager.getWorkTaskExecutor();
        processor.addExecutionListener(this);
        this.mIntents = new java.util.ArrayList();
        this.mCurrentIntent = null;
    }

    void onDestroy() {
        androidx.work.Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher");
        this.mProcessor.removeExecutionListener(this);
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted */
    public void m4930lambda$runOnExecuted$1$androidxworkimplProcessor(androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        this.mTaskExecutor.getMainThreadExecutor().execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this, androidx.work.impl.background.systemalarm.CommandHandler.createExecutionCompletedIntent(this.mContext, id, needsReschedule), 0));
    }

    public boolean add(final android.content.Intent intent, final int startId) {
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Adding command " + intent + " (" + startId + ")");
        assertMainThread();
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            androidx.work.Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(KEY_START_ID, startId);
        synchronized (this.mIntents) {
            boolean z = !this.mIntents.isEmpty();
            this.mIntents.add(intent);
            if (!z) {
                processCommand();
            }
        }
        return true;
    }

    void setCompletedListener(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener listener) {
        if (this.mCompletedListener != null) {
            androidx.work.Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.mCompletedListener = listener;
        }
    }

    androidx.work.impl.Processor getProcessor() {
        return this.mProcessor;
    }

    androidx.work.impl.utils.WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    androidx.work.impl.WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    void dequeueAndCheckForCompletion() {
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Checking if commands are complete.");
        assertMainThread();
        synchronized (this.mIntents) {
            if (this.mCurrentIntent != null) {
                androidx.work.Logger.get().debug(str, "Removing command " + this.mCurrentIntent);
                if (!this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                    throw new java.lang.IllegalStateException("Dequeue-d command is not the first.");
                }
                this.mCurrentIntent = null;
            }
            androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = this.mTaskExecutor.getSerialTaskExecutor();
            if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                androidx.work.Logger.get().debug(str, "No more commands & intents.");
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener commandsCompletedListener = this.mCompletedListener;
                if (commandsCompletedListener != null) {
                    commandsCompletedListener.onAllCommandsCompleted();
                }
            } else if (!this.mIntents.isEmpty()) {
                processCommand();
            }
        }
    }

    private void processCommand() {
        assertMainThread();
        android.os.PowerManager.WakeLock newWakeLock = androidx.work.impl.utils.WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    java.util.concurrent.Executor mainThreadExecutor;
                    androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mIntents) {
                        androidx.work.impl.background.systemalarm.SystemAlarmDispatcher systemAlarmDispatcher = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.mCurrentIntent = systemAlarmDispatcher.mIntents.get(0);
                    }
                    if (androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent != null) {
                        java.lang.String action = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent.getAction();
                        int intExtra = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.KEY_START_ID, 0);
                        androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Processing command " + androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent + ", " + intExtra);
                        android.os.PowerManager.WakeLock newWakeLock2 = androidx.work.impl.utils.WakeLocks.newWakeLock(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mContext, action + " (" + intExtra + ")");
                        try {
                            androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Acquiring operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.acquire();
                            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCommandHandler.onHandleIntent(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent, intExtra, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this);
                            androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.release();
                            mainThreadExecutor = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                            dequeueAndCheckForCompletion = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this);
                        } catch (java.lang.Throwable th) {
                            try {
                                androidx.work.Logger.get().error(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Unexpected error in onHandleIntent", th);
                                androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                mainThreadExecutor = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                                dequeueAndCheckForCompletion = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this);
                            } catch (java.lang.Throwable th2) {
                                androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor().execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        mainThreadExecutor.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    private boolean hasIntentWithAction(java.lang.String action) {
        assertMainThread();
        synchronized (this.mIntents) {
            java.util.Iterator<android.content.Intent> it = this.mIntents.iterator();
            while (it.hasNext()) {
                if (action.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void assertMainThread() {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    static class DequeueAndCheckForCompletion implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
            this.mDispatcher = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    static class AddRunnable implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
        private final android.content.Intent mIntent;
        private final int mStartId;

        AddRunnable(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher, android.content.Intent intent, int startId) {
            this.mDispatcher = dispatcher;
            this.mIntent = intent;
            this.mStartId = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }
}
