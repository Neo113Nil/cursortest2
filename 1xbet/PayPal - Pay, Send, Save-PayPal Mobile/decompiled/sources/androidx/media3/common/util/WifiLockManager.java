package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class WifiLockManager {
    private boolean Camera2StreamConfigurationMap;
    final androidx.media3.common.util.HandlerWrapper getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    final androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal getHighSpeedVideoFpsRangesFor;
    private final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoSizes;

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2) {
        return z && z2;
    }

    public WifiLockManager(android.content.Context context, android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal(context.getApplicationContext());
        this.getHighSpeedVideoSizes = clock.createHandler(looper, null);
        this.getHighResolutionOutputSizeshNQ4ISI = clock.createHandler(android.os.Looper.getMainLooper(), null);
    }

    public final void setEnabled(boolean z) {
        if (this.getHighSpeedVideoFpsRanges == z) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = z;
        getHighSpeedVideoSizes(z, this.Camera2StreamConfigurationMap);
    }

    public final void setStayAwake(boolean z) {
        if (this.Camera2StreamConfigurationMap != z) {
            this.Camera2StreamConfigurationMap = z;
            if (this.getHighSpeedVideoFpsRanges) {
                getHighSpeedVideoSizes(true, z);
            }
        }
    }

    private void getHighSpeedVideoSizes(final boolean z, final boolean z2) {
        if (z && z2) {
            this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.media3.common.util.WifiLockManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.util.WifiLockManager wifiLockManager = androidx.media3.common.util.WifiLockManager.this;
                    wifiLockManager.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(z, z2);
                }
            });
            return;
        }
        final androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal wifiLockManagerInternal = this.getHighSpeedVideoFpsRangesFor;
        java.util.Objects.requireNonNull(wifiLockManagerInternal);
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.common.util.WifiLockManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal.getHighSpeedVideoSizes(androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal.this);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI.postDelayed(runnable, 1000L);
        this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.media3.common.util.WifiLockManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.WifiLockManager wifiLockManager = androidx.media3.common.util.WifiLockManager.this;
                java.lang.Runnable runnable2 = runnable;
                boolean z3 = z;
                boolean z4 = z2;
                wifiLockManager.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(runnable2);
                wifiLockManager.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(z3, z4);
            }
        });
    }

    static final class WifiLockManagerInternal {
        private android.net.wifi.WifiManager.WifiLock getHighSpeedVideoFpsRanges;
        private final android.content.Context getHighSpeedVideoSizes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal wifiLockManagerInternal) {
            synchronized (wifiLockManagerInternal) {
                android.net.wifi.WifiManager.WifiLock wifiLock = wifiLockManagerInternal.getHighSpeedVideoFpsRanges;
                if (wifiLock != null) {
                    wifiLock.release();
                }
            }
        }

        public WifiLockManagerInternal(android.content.Context context) {
            this.getHighSpeedVideoSizes = context;
        }

        public final void getHighSpeedVideoSizes(boolean z, boolean z2) {
            if (z && this.getHighSpeedVideoFpsRanges == null) {
                if (this.getHighSpeedVideoSizes.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    androidx.media3.common.util.Log.w("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.getHighSpeedVideoSizes.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    androidx.media3.common.util.Log.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    android.net.wifi.WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.getHighSpeedVideoFpsRanges = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                return;
            }
            if (androidx.media3.common.util.WifiLockManager.getHighSpeedVideoFpsRanges(z, z2)) {
                this.getHighSpeedVideoFpsRanges.acquire();
            } else {
                this.getHighSpeedVideoFpsRanges.release();
            }
        }
    }
}
