package com.google.android.gms.net;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* loaded from: classes4.dex */
public class CronetProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final java.lang.String zza = "CronetProviderInstaller";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zzb = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object zzc = new java.lang.Object();
    private static com.google.android.gms.dynamite.DynamiteModule zzd = null;
    private static java.lang.String zze = "0";

    private CronetProviderInstaller() {
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> installProvider(final android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context2 = context;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                java.lang.String str = com.google.android.gms.net.CronetProviderInstaller.PROVIDER_NAME;
                try {
                    com.google.android.gms.net.CronetProviderInstaller.zzc(context2);
                    taskCompletionSource2.setResult(null);
                } catch (java.lang.Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    static com.google.android.gms.dynamite.DynamiteModule zza() {
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        synchronized (zzc) {
            dynamiteModule = zzd;
        }
        return dynamiteModule;
    }

    static java.lang.String zzb() {
        java.lang.String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @java.lang.Deprecated
    public static void zzc(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        synchronized (zzc) {
            if (isInstalled()) {
                return;
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
            try {
                ((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.net.CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                int apiLevel = org.chromium.net.ApiVersion.getApiLevel();
                com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = zzb;
                googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                try {
                    com.google.android.gms.dynamite.DynamiteModule load = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                    try {
                        java.lang.Class<?> loadClass = load.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == com.google.android.gms.net.CronetProviderInstaller.class.getClassLoader()) {
                            android.util.Log.e(zza, "ImplVersion class is missing from Cronet module.");
                            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
                        }
                        java.lang.reflect.Method method = loadClass.getMethod("getApiLevel", new java.lang.Class[0]);
                        java.lang.reflect.Method method2 = loadClass.getMethod("getCronetVersion", new java.lang.Class[0]);
                        int intValue = ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.Integer) method.invoke(null, new java.lang.Object[0]))).intValue();
                        zze = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.String) method2.invoke(null, new java.lang.Object[0]));
                        if (apiLevel <= intValue) {
                            zzd = load;
                            return;
                        }
                        android.content.Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                        if (errorResolutionIntent == null) {
                            android.util.Log.e(zza, "Unable to fetch error resolution intent");
                            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(2);
                        }
                        java.lang.String str = zze;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 174);
                        sb.append("Google Play Services update is required. The API Level of the client is ");
                        sb.append(apiLevel);
                        sb.append(". The API Level of the implementation is ");
                        sb.append(intValue);
                        sb.append(". The Cronet implementation version is ");
                        sb.append(str);
                        throw new com.google.android.gms.common.GooglePlayServicesRepairableException(2, sb.toString(), errorResolutionIntent);
                    } catch (java.lang.Exception e) {
                        android.util.Log.e(zza, "Unable to read Cronet version from the Cronet module ", e);
                        throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8).initCause(e));
                    }
                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                    android.util.Log.e(zza, "Unable to load Cronet module", e2);
                    throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8).initCause(e2));
                }
            } catch (java.lang.ClassNotFoundException e3) {
                android.util.Log.e(zza, "Cronet API is not available. Have you included all required dependencies?");
                throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(10).initCause(e3));
            }
        }
    }
}
