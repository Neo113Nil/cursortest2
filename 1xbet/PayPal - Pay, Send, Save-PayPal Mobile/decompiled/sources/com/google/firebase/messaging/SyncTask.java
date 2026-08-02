package com.google.firebase.messaging;

/* loaded from: classes9.dex */
class SyncTask implements java.lang.Runnable {
    private final com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;
    java.util.concurrent.ExecutorService processorExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor"));
    private final android.os.PowerManager.WakeLock syncWakeLock;

    public SyncTask(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, long j) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            try {
                this.firebaseMessaging.setSyncScheduledOrRunning(true);
                if (!this.firebaseMessaging.isGmsCorePresent()) {
                    this.firebaseMessaging.setSyncScheduledOrRunning(false);
                    if (!com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                } else if (!com.google.firebase.messaging.ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                    if (maybeRefreshToken()) {
                        this.firebaseMessaging.setSyncScheduledOrRunning(false);
                    } else {
                        this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                    }
                    if (!com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                } else {
                    new com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver(this).registerReceiver();
                    if (!com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                }
                this.syncWakeLock.release();
            } catch (java.io.IOException e) {
                e.getMessage();
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
                if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    this.syncWakeLock.release();
                }
            }
        } catch (java.lang.Throwable th) {
            if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
            throw th;
        }
    }

    boolean maybeRefreshToken() throws java.io.IOException {
        try {
            return this.firebaseMessaging.blockingGetToken() != null;
        } catch (java.io.IOException e) {
            if (com.google.firebase.messaging.GmsRpc.isErrorMessageForRetryableError(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    android.content.Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    boolean isDeviceConnected() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) getContext().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    static class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {
        private android.content.Context receiverContext;
        private com.google.firebase.messaging.SyncTask task;

        public ConnectivityChangeReceiver(com.google.firebase.messaging.SyncTask syncTask) {
            this.task = syncTask;
        }

        public void registerReceiver() {
            com.google.firebase.messaging.SyncTask.isDebugLogEnabled();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            com.google.firebase.messaging.SyncTask syncTask = this.task;
            if (syncTask != null) {
                android.content.Context context = syncTask.getContext();
                this.receiverContext = context;
                context.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.google.firebase.messaging.SyncTask syncTask = this.task;
            if (syncTask == null || !syncTask.isDeviceConnected()) {
                return;
            }
            com.google.firebase.messaging.SyncTask.isDebugLogEnabled();
            this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
            android.content.Context context2 = this.receiverContext;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.task = null;
        }
    }

    static boolean isDebugLogEnabled() {
        return android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3);
    }
}
