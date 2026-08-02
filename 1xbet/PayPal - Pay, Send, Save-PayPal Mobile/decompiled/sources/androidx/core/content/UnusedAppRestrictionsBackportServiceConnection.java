package androidx.core.content;

/* loaded from: classes7.dex */
class UnusedAppRestrictionsBackportServiceConnection implements android.content.ServiceConnection {
    androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> Camera2StreamConfigurationMap;
    androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService getHighResolutionOutputSizeshNQ4ISI = null;
    boolean getHighSpeedVideoFpsRanges = false;
    final android.content.Context getHighSpeedVideoFpsRangesFor;

    UnusedAppRestrictionsBackportServiceConnection(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.getHighResolutionOutputSizeshNQ4ISI = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
                @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws android.os.RemoteException {
                    if (!z) {
                        androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.Camera2StreamConfigurationMap.set(0);
                    } else if (z2) {
                        androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.Camera2StreamConfigurationMap.set(3);
                    } else {
                        androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.Camera2StreamConfigurationMap.set(2);
                    }
                }
            });
        } catch (android.os.RemoteException unused) {
            this.Camera2StreamConfigurationMap.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
