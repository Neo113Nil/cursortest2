package androidx.core.content;

/* loaded from: classes7.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {
    public static final java.lang.String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub getHighSpeedVideoFpsRanges = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportService.1
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            androidx.core.content.UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new androidx.core.content.UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
        }
    };

    protected abstract void isPermissionRevocationEnabled(androidx.core.content.UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
