package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class WifiLockManager {
    private static final java.lang.String TAG = "WifiLockManager";
    private static final java.lang.String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private android.net.wifi.WifiManager.WifiLock wifiLock;
    private final android.net.wifi.WifiManager wifiManager;

    public WifiLockManager(android.content.Context context) {
        this.wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService(com.ironsource.T3.b);
    }

    public void setEnabled(boolean z) {
        if (z && this.wifiLock == null) {
            android.net.wifi.WifiManager wifiManager = this.wifiManager;
            if (wifiManager == null) {
                com.google.android.exoplayer2.util.Log.w(TAG, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                android.net.wifi.WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, WIFI_LOCK_TAG);
                this.wifiLock = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.enabled = z;
        updateWifiLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWifiLock();
    }

    private void updateWifiLock() {
        android.net.wifi.WifiManager.WifiLock wifiLock = this.wifiLock;
        if (wifiLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
