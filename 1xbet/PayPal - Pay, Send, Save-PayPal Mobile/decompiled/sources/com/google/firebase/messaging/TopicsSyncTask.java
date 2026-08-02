package com.google.firebase.messaging;

/* loaded from: classes9.dex */
class TopicsSyncTask implements java.lang.Runnable {
    private static final java.lang.Object TOPIC_SYNC_TASK_LOCK = new java.lang.Object();
    private static java.lang.Boolean hasAccessNetworkStatePermission;
    private static java.lang.Boolean hasWakeLockPermission;
    private final android.content.Context context;
    private final com.google.firebase.messaging.Metadata metadata;
    private final long nextDelaySeconds;
    private final android.os.PowerManager.WakeLock syncWakeLock;
    private final com.google.firebase.messaging.TopicsSubscriber topicsSubscriber;

    TopicsSyncTask(com.google.firebase.messaging.TopicsSubscriber topicsSubscriber, android.content.Context context, com.google.firebase.messaging.Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, com.google.firebase.messaging.Constants.FCM_WAKE_LOCK);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(com.google.firebase.messaging.Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (java.lang.RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (hasAccessNetworkStatePermission(this.context) && !isDeviceConnected()) {
                        new com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver(this).registerReceiver();
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (java.lang.RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.topicsSubscriber.syncTopics()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                    } else {
                        this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                    }
                    if (hasWakeLockPermission(this.context)) {
                        this.syncWakeLock.release();
                    }
                } catch (java.io.IOException e) {
                    e.getMessage();
                    this.topicsSubscriber.setSyncScheduledOrRunning(false);
                    if (hasWakeLockPermission(this.context)) {
                        this.syncWakeLock.release();
                    }
                }
            } catch (java.lang.RuntimeException unused3) {
            }
        } catch (java.lang.Throwable th) {
            if (hasWakeLockPermission(this.context)) {
                try {
                    this.syncWakeLock.release();
                } catch (java.lang.RuntimeException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDeviceConnected() {
        boolean z;
        synchronized (this) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
            android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLoggable() {
        return android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3);
    }

    private static boolean hasWakeLockPermission(android.content.Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            java.lang.Boolean bool = hasWakeLockPermission;
            if (bool == null) {
                booleanValue = hasPermission(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            hasWakeLockPermission = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean hasAccessNetworkStatePermission(android.content.Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            java.lang.Boolean bool = hasAccessNetworkStatePermission;
            if (bool == null) {
                booleanValue = hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            hasAccessNetworkStatePermission = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean hasPermission(android.content.Context context, java.lang.String str, java.lang.Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            createPermissionMissingLog(str);
        }
        return z;
    }

    private static java.lang.String createPermissionMissingLog(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {
        private com.google.firebase.messaging.TopicsSyncTask task;

        public ConnectivityChangeReceiver(com.google.firebase.messaging.TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            synchronized (this) {
                com.google.firebase.messaging.TopicsSyncTask topicsSyncTask = this.task;
                if (topicsSyncTask == null) {
                    return;
                }
                if (topicsSyncTask.isDeviceConnected()) {
                    com.google.firebase.messaging.TopicsSyncTask.isLoggable();
                    this.task.topicsSubscriber.scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                    context.unregisterReceiver(this);
                    this.task = null;
                }
            }
        }

        public void registerReceiver() {
            com.google.firebase.messaging.TopicsSyncTask.isLoggable();
            com.google.firebase.messaging.TopicsSyncTask.this.context.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
}
