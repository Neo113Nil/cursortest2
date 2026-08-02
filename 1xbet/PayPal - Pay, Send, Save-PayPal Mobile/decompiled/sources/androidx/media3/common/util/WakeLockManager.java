package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class WakeLockManager {
    private final androidx.media3.common.util.HandlerWrapper Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    final androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal getHighSpeedVideoFpsRanges;
    final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    static /* synthetic */ boolean getHighSpeedVideoSizes(boolean z, boolean z2) {
        return z && z2;
    }

    public WakeLockManager(android.content.Context context, android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.getHighSpeedVideoFpsRanges = new androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal(context.getApplicationContext());
        this.Camera2StreamConfigurationMap = clock.createHandler(looper, null);
        this.getHighSpeedVideoFpsRangesFor = clock.createHandler(android.os.Looper.getMainLooper(), null);
    }

    public final void setEnabled(boolean z) {
        if (this.getHighSpeedVideoSizes == z) {
            return;
        }
        this.getHighSpeedVideoSizes = z;
        getHighResolutionOutputSizeshNQ4ISI(z, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void setStayAwake(boolean z) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            if (this.getHighSpeedVideoSizes) {
                getHighResolutionOutputSizeshNQ4ISI(true, z);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(final boolean z, final boolean z2) {
        if (z && z2) {
            this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.media3.common.util.WakeLockManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.util.WakeLockManager wakeLockManager = androidx.media3.common.util.WakeLockManager.this;
                    androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal.getHighSpeedVideoFpsRanges(wakeLockManager.getHighSpeedVideoFpsRanges, z, z2);
                }
            });
            return;
        }
        final androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal wakeLockManagerInternal = this.getHighSpeedVideoFpsRanges;
        java.util.Objects.requireNonNull(wakeLockManagerInternal);
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.common.util.WakeLockManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal.Camera2StreamConfigurationMap(androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal.this);
            }
        };
        this.getHighSpeedVideoFpsRangesFor.postDelayed(runnable, 1000L);
        this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.media3.common.util.WakeLockManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.WakeLockManager wakeLockManager = androidx.media3.common.util.WakeLockManager.this;
                java.lang.Runnable runnable2 = runnable;
                boolean z3 = z;
                boolean z4 = z2;
                wakeLockManager.getHighSpeedVideoFpsRangesFor.removeCallbacks(runnable2);
                androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal.getHighSpeedVideoFpsRanges(wakeLockManager.getHighSpeedVideoFpsRanges, z3, z4);
            }
        });
    }

    static final class WakeLockManagerInternal {
        private final android.content.Context Camera2StreamConfigurationMap;
        private android.os.PowerManager.WakeLock getHighSpeedVideoFpsRangesFor;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void Camera2StreamConfigurationMap(androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal wakeLockManagerInternal) {
            synchronized (wakeLockManagerInternal) {
                android.os.PowerManager.WakeLock wakeLock = wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor;
                if (wakeLock != null) {
                    wakeLock.release();
                }
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal wakeLockManagerInternal, boolean z, boolean z2) {
            synchronized (wakeLockManagerInternal) {
                if (z) {
                    if (wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor == null) {
                        if (wakeLockManagerInternal.Camera2StreamConfigurationMap.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                            androidx.media3.common.util.Log.w("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                            return;
                        }
                        android.os.PowerManager powerManager = (android.os.PowerManager) wakeLockManagerInternal.Camera2StreamConfigurationMap.getSystemService("power");
                        if (powerManager == null) {
                            androidx.media3.common.util.Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                            return;
                        } else {
                            android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                            wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor = newWakeLock;
                            newWakeLock.setReferenceCounted(false);
                        }
                    }
                }
                if (wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor == null) {
                    return;
                }
                if (androidx.media3.common.util.WakeLockManager.getHighSpeedVideoSizes(z, z2)) {
                    wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor.acquire();
                } else {
                    wakeLockManagerInternal.getHighSpeedVideoFpsRangesFor.release();
                }
            }
        }

        public WakeLockManagerInternal(android.content.Context context) {
            this.Camera2StreamConfigurationMap = context;
        }
    }
}
