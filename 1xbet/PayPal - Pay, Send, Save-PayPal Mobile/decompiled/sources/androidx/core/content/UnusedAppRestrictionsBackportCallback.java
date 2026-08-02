package androidx.core.content;

/* loaded from: classes7.dex */
public class UnusedAppRestrictionsBackportCallback {
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback Camera2StreamConfigurationMap;

    public UnusedAppRestrictionsBackportCallback(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.Camera2StreamConfigurationMap = iUnusedAppRestrictionsBackportCallback;
    }

    public void onResult(boolean z, boolean z2) throws android.os.RemoteException {
        this.Camera2StreamConfigurationMap.onIsPermissionRevocationEnabledForAppResult(z, z2);
    }
}
