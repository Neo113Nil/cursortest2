package com.google.android.exoplayer2.scheduler;

/* loaded from: classes3.dex */
public final class RequirementsWatcher {
    private final android.content.Context context;
    private final android.os.Handler handler = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper();
    private final com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener listener;
    private com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback networkCallback;
    private int notMetRequirements;
    private com.google.android.exoplayer2.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver receiver;
    private final com.google.android.exoplayer2.scheduler.Requirements requirements;

    public interface Listener {
        void onRequirementsStateChanged(com.google.android.exoplayer2.scheduler.RequirementsWatcher requirementsWatcher, int i);
    }

    public RequirementsWatcher(android.content.Context context, com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener listener, com.google.android.exoplayer2.scheduler.Requirements requirements) {
        this.context = context.getApplicationContext();
        this.listener = listener;
        this.requirements = requirements;
    }

    public int start() {
        this.notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (this.requirements.isNetworkRequired()) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 24) {
                registerNetworkCallbackV24();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        com.google.android.exoplayer2.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver deviceStatusChangeReceiver = new com.google.android.exoplayer2.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        com.google.android.exoplayer2.util.Util.registerReceiverNotExported(this.context, deviceStatusChangeReceiver, intentFilter, this.handler);
        return this.notMetRequirements;
    }

    public void stop() {
        this.context.unregisterReceiver((android.content.BroadcastReceiver) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.receiver));
        this.receiver = null;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 24 || this.networkCallback == null) {
            return;
        }
        unregisterNetworkCallbackV24();
    }

    public com.google.android.exoplayer2.scheduler.Requirements getRequirements() {
        return this.requirements;
    }

    private void registerNetworkCallbackV24() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.google.android.exoplayer2.util.Assertions.checkNotNull((android.net.ConnectivityManager) this.context.getSystemService("connectivity"));
        com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback networkCallback = new com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback();
        this.networkCallback = networkCallback;
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    private void unregisterNetworkCallbackV24() {
        ((android.net.ConnectivityManager) com.google.android.exoplayer2.util.Assertions.checkNotNull((android.net.ConnectivityManager) this.context.getSystemService("connectivity"))).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.networkCallback));
        this.networkCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        if (this.notMetRequirements != notMetRequirements) {
            this.notMetRequirements = notMetRequirements;
            this.listener.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.notMetRequirements & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    private class DeviceStatusChangeReceiver extends android.content.BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.checkRequirements();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class NetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;

        private NetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(android.net.Network network, boolean z) {
            if (z) {
                return;
            }
            postRecheckNotMetNetworkRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.receivedCapabilitiesChange && this.networkValidated == hasCapability) {
                if (hasCapability) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.receivedCapabilitiesChange = true;
                this.networkValidated = hasCapability;
                postCheckRequirements();
            }
        }

        private void postCheckRequirements() {
            com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback.this.m5417x11a0b99a();
                }
            });
        }

        /* renamed from: lambda$postCheckRequirements$0$com-google-android-exoplayer2-scheduler-RequirementsWatcher$NetworkCallback, reason: not valid java name */
        /* synthetic */ void m5417x11a0b99a() {
            if (com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.networkCallback != null) {
                com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.checkRequirements();
            }
        }

        private void postRecheckNotMetNetworkRequirements() {
            com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback.this.m5418x28780c1d();
                }
            });
        }

        /* renamed from: lambda$postRecheckNotMetNetworkRequirements$1$com-google-android-exoplayer2-scheduler-RequirementsWatcher$NetworkCallback, reason: not valid java name */
        /* synthetic */ void m5418x28780c1d() {
            if (com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.networkCallback != null) {
                com.google.android.exoplayer2.scheduler.RequirementsWatcher.this.recheckNotMetNetworkRequirements();
            }
        }
    }
}
