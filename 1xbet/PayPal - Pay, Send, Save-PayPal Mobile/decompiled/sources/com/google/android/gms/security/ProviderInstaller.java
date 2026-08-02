package com.google.android.gms.security;

/* loaded from: classes8.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object zzb = new java.lang.Object();
    private static java.lang.reflect.Method zzc = null;
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, android.content.Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        android.content.Context context2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (zzb) {
            android.content.Context context3 = null;
            if (!zzd) {
                try {
                    context2 = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                    e.getMessage();
                    context2 = null;
                }
                if (context2 != null) {
                    zzb(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z = zzd;
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                zzd = true;
                if (!z) {
                    try {
                        com.google.android.gms.internal.common.zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), com.google.android.gms.internal.common.zzi.zzb(android.content.Context.class, context), com.google.android.gms.internal.common.zzh.zza(uptimeMillis), com.google.android.gms.internal.common.zzh.zza(android.os.SystemClock.uptimeMillis()));
                    } catch (java.lang.Exception unused) {
                    }
                }
                context3 = remoteContext;
            }
            if (context3 == null) {
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
            }
            zzb(context3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
        }
    }

    public static void installIfNeededAsync(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the UI thread");
        new com.google.android.gms.security.zza(context, providerInstallListener).execute(new java.lang.Void[0]);
    }

    private static void zzb(android.content.Context context, android.content.Context context2, java.lang.String str) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", android.content.Context.class);
            }
            zzc.invoke(null, context);
        } catch (java.lang.Exception e) {
            e.getCause();
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
        }
    }
}
