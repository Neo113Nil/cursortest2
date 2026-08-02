package androidx.appcompat.app;

/* loaded from: classes3.dex */
public final class AppLocalesMetadataHolderService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }

    public static android.content.pm.ServiceInfo getServiceInfo(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.appcompat.app.AppLocalesMetadataHolderService.class), androidx.appcompat.app.AppLocalesMetadataHolderService.Api24Impl.Camera2StreamConfigurationMap() | 128);
    }

    static class Api24Impl {
        static int Camera2StreamConfigurationMap() {
            return 512;
        }

        private Api24Impl() {
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
