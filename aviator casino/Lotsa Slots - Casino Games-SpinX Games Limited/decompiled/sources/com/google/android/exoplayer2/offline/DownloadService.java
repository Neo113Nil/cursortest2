package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public abstract class DownloadService extends android.app.Service {
    public static final java.lang.String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final java.lang.String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final java.lang.String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final java.lang.String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final java.lang.String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final java.lang.String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final java.lang.String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final java.lang.String KEY_CONTENT_ID = "content_id";
    public static final java.lang.String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final java.lang.String KEY_FOREGROUND = "foreground";
    public static final java.lang.String KEY_REQUIREMENTS = "requirements";
    public static final java.lang.String KEY_STOP_REASON = "stop_reason";
    private static final java.lang.String TAG = "DownloadService";
    private static final java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper> downloadManagerHelpers = new java.util.HashMap<>();
    private final int channelDescriptionResourceId;
    private final java.lang.String channelId;
    private final int channelNameResourceId;
    private com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper downloadManagerHelper;
    private final com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    protected abstract com.google.android.exoplayer2.offline.DownloadManager getDownloadManager();

    protected abstract android.app.Notification getForegroundNotification(java.util.List<com.google.android.exoplayer2.offline.Download> list, int i);

    protected abstract com.google.android.exoplayer2.scheduler.Scheduler getScheduler();

    protected DownloadService(int i) {
        this(i, 1000L);
    }

    protected DownloadService(int i, long j) {
        this(i, j, null, 0, 0);
    }

    @java.lang.Deprecated
    protected DownloadService(int i, long j, java.lang.String str, int i2) {
        this(i, j, str, i2, 0);
    }

    protected DownloadService(int i, long j, java.lang.String str, int i2, int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater(i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, int i, boolean z) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra("download_request", downloadRequest).putExtra("stop_reason", i);
    }

    public static android.content.Intent buildRemoveDownloadIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra("content_id", str);
    }

    public static android.content.Intent buildRemoveAllDownloadsIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static android.content.Intent buildResumeDownloadsIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static android.content.Intent buildPauseDownloadsIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static android.content.Intent buildSetStopReasonIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str, int i, boolean z) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra("content_id", str).putExtra("stop_reason", i);
    }

    public static android.content.Intent buildSetRequirementsIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.scheduler.Requirements requirements, boolean z) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra("requirements", requirements);
    }

    public static void sendAddDownload(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendAddDownload(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, int i, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }

    public static void sendRemoveDownload(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str, boolean z) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendRemoveAllDownloads(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendResumeDownloads(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendPauseDownloads(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, boolean z) {
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetStopReason(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str, int i, boolean z) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void sendSetRequirements(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, com.google.android.exoplayer2.scheduler.Requirements requirements, boolean z) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void start(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls) {
        com.google.android.exoplayer2.util.Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        java.lang.String str = this.channelId;
        if (str != null) {
            com.google.android.exoplayer2.util.NotificationUtil.createNotificationChannel(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        java.lang.Class<?> cls = getClass();
        java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper> hashMap = downloadManagerHelpers;
        com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper downloadManagerHelper = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) hashMap.get(cls);
        if (downloadManagerHelper == null) {
            boolean z = this.foregroundNotificationUpdater != null;
            com.google.android.exoplayer2.scheduler.Scheduler scheduler = (z && (com.google.android.exoplayer2.util.Util.SDK_INT < 31)) ? getScheduler() : null;
            com.google.android.exoplayer2.offline.DownloadManager downloadManager = getDownloadManager();
            downloadManager.resumeDownloads();
            downloadManagerHelper = new com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper(getApplicationContext(), downloadManager, z, scheduler, cls);
            hashMap.put(cls, downloadManagerHelper);
        }
        this.downloadManagerHelper = downloadManagerHelper;
        downloadManagerHelper.attachService(this);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        com.google.android.exoplayer2.offline.DownloadManager downloadManager;
        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater;
        this.lastStartId = i2;
        this.taskRemoved = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            this.startedInForeground |= intent.getBooleanExtra("foreground", false) || ACTION_RESTART.equals(str);
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = ACTION_INIT;
        }
        downloadManager = ((com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.downloadManagerHelper)).downloadManager;
        str.hashCode();
        switch (str) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                com.google.android.exoplayer2.offline.DownloadRequest downloadRequest = (com.google.android.exoplayer2.offline.DownloadRequest) ((android.content.Intent) com.google.android.exoplayer2.util.Assertions.checkNotNull(intent)).getParcelableExtra("download_request");
                if (downloadRequest == null) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    downloadManager.addDownload(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.resumeDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.removeAllDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                com.google.android.exoplayer2.scheduler.Requirements requirements = (com.google.android.exoplayer2.scheduler.Requirements) ((android.content.Intent) com.google.android.exoplayer2.util.Assertions.checkNotNull(intent)).getParcelableExtra("requirements");
                if (requirements == null) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    downloadManager.setRequirements(requirements);
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.pauseDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((android.content.Intent) com.google.android.exoplayer2.util.Assertions.checkNotNull(intent)).hasExtra("stop_reason")) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    downloadManager.setStopReason(str2, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 == null) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    downloadManager.removeDownload(str2);
                    break;
                }
            default:
                com.google.android.exoplayer2.util.Log.e(TAG, "Ignored unrecognized action: " + str);
                break;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 && this.startedInForeground && (foregroundNotificationUpdater = this.foregroundNotificationUpdater) != null) {
            foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        this.isStopped = false;
        if (downloadManager.isIdle()) {
            onIdle();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        this.taskRemoved = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.downloadManagerHelper)).detachService(this);
        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected final void invalidateForegroundNotification() {
        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null || this.isDestroyed) {
            return;
        }
        foregroundNotificationUpdater.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(java.util.List<com.google.android.exoplayer2.offline.Download> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                if (needsStartedService(list.get(i).state)) {
                    this.foregroundNotificationUpdater.startPeriodicUpdates();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(com.google.android.exoplayer2.offline.Download download) {
        if (this.foregroundNotificationUpdater != null) {
            if (needsStartedService(download.state)) {
                this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                this.foregroundNotificationUpdater.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
        if (((com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.downloadManagerHelper)).updateScheduler()) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 28 && this.taskRemoved) {
                stopSelf();
                this.isStopped = true;
            } else {
                this.isStopped |= stopSelfResult(this.lastStartId);
            }
        }
    }

    private static android.content.Intent getIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str, boolean z) {
        return getIntent(context, cls, str).putExtra("foreground", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.content.Intent getIntent(android.content.Context context, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls, java.lang.String str) {
        return new android.content.Intent(context, cls).setAction(str);
    }

    private static void startService(android.content.Context context, android.content.Intent intent, boolean z) {
        if (z) {
            com.google.android.exoplayer2.util.Util.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ForegroundNotificationUpdater {
        private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i, long j) {
            this.notificationId = i;
            this.updateInterval = j;
        }

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacksAndMessages(null);
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public void invalidate() {
            if (this.notificationDisplayed) {
                update();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            com.google.android.exoplayer2.offline.DownloadManager downloadManager = ((com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.offline.DownloadService.this.downloadManagerHelper)).downloadManager;
            android.app.Notification foregroundNotification = com.google.android.exoplayer2.offline.DownloadService.this.getForegroundNotification(downloadManager.getCurrentDownloads(), downloadManager.getNotMetRequirements());
            if (!this.notificationDisplayed) {
                com.google.android.exoplayer2.offline.DownloadService.this.startForeground(this.notificationId, foregroundNotification);
                this.notificationDisplayed = true;
            } else {
                ((android.app.NotificationManager) com.google.android.exoplayer2.offline.DownloadService.this.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION)).notify(this.notificationId, foregroundNotification);
            }
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater.this.update();
                    }
                }, this.updateInterval);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DownloadManagerHelper implements com.google.android.exoplayer2.offline.DownloadManager.Listener {
        private final android.content.Context context;
        private final com.google.android.exoplayer2.offline.DownloadManager downloadManager;
        private com.google.android.exoplayer2.offline.DownloadService downloadService;
        private final boolean foregroundAllowed;
        private com.google.android.exoplayer2.scheduler.Requirements scheduledRequirements;
        private final com.google.android.exoplayer2.scheduler.Scheduler scheduler;
        private final java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> serviceClass;

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onDownloadsPausedChanged(com.google.android.exoplayer2.offline.DownloadManager downloadManager, boolean z) {
            com.google.android.exoplayer2.offline.DownloadManager.Listener.CC.$default$onDownloadsPausedChanged(this, downloadManager, z);
        }

        private DownloadManagerHelper(android.content.Context context, com.google.android.exoplayer2.offline.DownloadManager downloadManager, boolean z, com.google.android.exoplayer2.scheduler.Scheduler scheduler, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> cls) {
            this.context = context;
            this.downloadManager = downloadManager;
            this.foregroundAllowed = z;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            downloadManager.addListener(this);
            updateScheduler();
        }

        public void attachService(final com.google.android.exoplayer2.offline.DownloadService downloadService) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.downloadService == null);
            this.downloadService = downloadService;
            if (this.downloadManager.isInitialized()) {
                com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper.this.m5415x5d17c8bb(downloadService);
                    }
                });
            }
        }

        /* renamed from: lambda$attachService$0$com-google-android-exoplayer2-offline-DownloadService$DownloadManagerHelper, reason: not valid java name */
        /* synthetic */ void m5415x5d17c8bb(com.google.android.exoplayer2.offline.DownloadService downloadService) {
            downloadService.notifyDownloads(this.downloadManager.getCurrentDownloads());
        }

        public void detachService(com.google.android.exoplayer2.offline.DownloadService downloadService) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.downloadService == downloadService);
            this.downloadService = null;
        }

        public boolean updateScheduler() {
            boolean isWaitingForRequirements = this.downloadManager.isWaitingForRequirements();
            if (this.scheduler == null) {
                return !isWaitingForRequirements;
            }
            if (!isWaitingForRequirements) {
                cancelScheduler();
                return true;
            }
            com.google.android.exoplayer2.scheduler.Requirements requirements = this.downloadManager.getRequirements();
            if (!this.scheduler.getSupportedRequirements(requirements).equals(requirements)) {
                cancelScheduler();
                return false;
            }
            if (!schedulerNeedsUpdate(requirements)) {
                return true;
            }
            if (this.scheduler.schedule(requirements, this.context.getPackageName(), com.google.android.exoplayer2.offline.DownloadService.ACTION_RESTART)) {
                this.scheduledRequirements = requirements;
                return true;
            }
            com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.offline.DownloadService.TAG, "Failed to schedule restart");
            cancelScheduler();
            return false;
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(com.google.android.exoplayer2.offline.DownloadManager downloadManager) {
            com.google.android.exoplayer2.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloads(downloadManager.getCurrentDownloads());
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(com.google.android.exoplayer2.offline.DownloadManager downloadManager, com.google.android.exoplayer2.offline.Download download, java.lang.Exception exc) {
            com.google.android.exoplayer2.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadChanged(download);
            }
            if (serviceMayNeedRestart() && com.google.android.exoplayer2.offline.DownloadService.needsStartedService(download.state)) {
                com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.offline.DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                restartService();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(com.google.android.exoplayer2.offline.DownloadManager downloadManager, com.google.android.exoplayer2.offline.Download download) {
            com.google.android.exoplayer2.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(com.google.android.exoplayer2.offline.DownloadManager downloadManager) {
            com.google.android.exoplayer2.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.onIdle();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onRequirementsStateChanged(com.google.android.exoplayer2.offline.DownloadManager downloadManager, com.google.android.exoplayer2.scheduler.Requirements requirements, int i) {
            updateScheduler();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(com.google.android.exoplayer2.offline.DownloadManager downloadManager, boolean z) {
            if (z || downloadManager.getDownloadsPaused() || !serviceMayNeedRestart()) {
                return;
            }
            java.util.List<com.google.android.exoplayer2.offline.Download> currentDownloads = downloadManager.getCurrentDownloads();
            for (int i = 0; i < currentDownloads.size(); i++) {
                if (currentDownloads.get(i).state == 0) {
                    restartService();
                    return;
                }
            }
        }

        private boolean schedulerNeedsUpdate(com.google.android.exoplayer2.scheduler.Requirements requirements) {
            return !com.google.android.exoplayer2.util.Util.areEqual(this.scheduledRequirements, requirements);
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"scheduler"})
        private void cancelScheduler() {
            com.google.android.exoplayer2.scheduler.Requirements requirements = new com.google.android.exoplayer2.scheduler.Requirements(0);
            if (schedulerNeedsUpdate(requirements)) {
                this.scheduler.cancel();
                this.scheduledRequirements = requirements;
            }
        }

        private boolean serviceMayNeedRestart() {
            com.google.android.exoplayer2.offline.DownloadService downloadService = this.downloadService;
            return downloadService == null || downloadService.isStopped();
        }

        private void restartService() {
            if (this.foregroundAllowed) {
                try {
                    com.google.android.exoplayer2.util.Util.startForegroundService(this.context, com.google.android.exoplayer2.offline.DownloadService.getIntent(this.context, this.serviceClass, com.google.android.exoplayer2.offline.DownloadService.ACTION_RESTART));
                    return;
                } catch (java.lang.IllegalStateException unused) {
                    com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.offline.DownloadService.TAG, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.context.startService(com.google.android.exoplayer2.offline.DownloadService.getIntent(this.context, this.serviceClass, com.google.android.exoplayer2.offline.DownloadService.ACTION_INIT));
            } catch (java.lang.IllegalStateException unused2) {
                com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.offline.DownloadService.TAG, "Failed to restart (process is idle)");
            }
        }
    }
}
