package androidx.appcompat.app;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }

    public static android.content.pm.ServiceInfo getServiceInfo(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.appcompat.app.AppLocalesMetadataHolderService.class), android.os.Build.VERSION.SDK_INT >= 24 ? androidx.appcompat.app.AppLocalesMetadataHolderService.Api24Impl.getDisabledComponentFlag() | 128 : 640);
    }

    private static class Api24Impl {
        static int getDisabledComponentFlag() {
            return 512;
        }

        private Api24Impl() {
        }
    }
}
