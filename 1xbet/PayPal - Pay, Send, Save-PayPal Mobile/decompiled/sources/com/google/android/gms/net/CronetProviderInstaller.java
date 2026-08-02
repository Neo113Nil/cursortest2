package com.google.android.gms.net;

/* loaded from: classes4.dex */
public class CronetProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final java.lang.String zza = "CronetProviderInstaller";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zzb = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object zzc = new java.lang.Object();
    private static com.google.android.gms.dynamite.DynamiteModule zzd = null;
    private static java.lang.String zze = "0";
    private static boolean zzf;

    public static com.google.android.gms.tasks.Task<java.lang.Void> installProvider(final android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
            taskCompletionSource.setResult(null);
            synchronized (zzc) {
                zzf = true;
            }
            return taskCompletionSource.getTask();
        }
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new com.google.android.gms.net.zze("PlayServices CronetProviderInstaller#installProvider starting thread");
        try {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.net.zza
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    java.lang.String str = com.google.android.gms.net.CronetProviderInstaller.PROVIDER_NAME;
                    android.content.Context context2 = context;
                    com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        com.google.android.gms.net.CronetProviderInstaller.zza(context2);
                        taskCompletionSource2.setResult(null);
                    } catch (java.lang.Exception e) {
                        taskCompletionSource2.setException(e);
                    }
                }
            }).start();
            android.os.Trace.endSection();
            return taskCompletionSource.getTask();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean isInstalled() {
        synchronized (zzc) {
            if (zzf) {
                return true;
            }
            return zzb() != null;
        }
    }

    @java.lang.Deprecated
    public static void zza(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        synchronized (zzc) {
            if (isInstalled()) {
                return;
            }
            com.google.android.gms.net.zzd zzdVar = new com.google.android.gms.net.zzd(context, 37401, 1.0f);
            try {
                new com.google.android.gms.net.zze("PlayServices CronetProviderInstaller#installIfNeeded");
                try {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
                    if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                        zzf = true;
                        zzdVar.zza();
                        android.os.Trace.endSection();
                        zzdVar.close();
                        return;
                    }
                    try {
                        ((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.net.CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                        int apiLevel = org.chromium.net.ApiVersion.getApiLevel();
                        new com.google.android.gms.net.zze("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                        try {
                            com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = zzb;
                            googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                            android.os.Trace.endSection();
                            try {
                                new com.google.android.gms.net.zze("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                                try {
                                    com.google.android.gms.dynamite.DynamiteModule load = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                                    android.os.Trace.endSection();
                                    try {
                                        new com.google.android.gms.net.zze("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                        try {
                                            java.lang.Class<?> loadClass = load.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (loadClass.getClassLoader() == com.google.android.gms.net.CronetProviderInstaller.class.getClassLoader()) {
                                                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
                                            }
                                            java.lang.reflect.Method method = loadClass.getMethod("getApiLevel", new java.lang.Class[0]);
                                            java.lang.reflect.Method method2 = loadClass.getMethod("getCronetVersion", new java.lang.Class[0]);
                                            int intValue = ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.Integer) method.invoke(null, new java.lang.Object[0]))).intValue();
                                            zze = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.String) method2.invoke(null, new java.lang.Object[0]));
                                            android.os.Trace.endSection();
                                            if (apiLevel <= intValue) {
                                                zzd = load;
                                                zzdVar.zza();
                                                android.os.Trace.endSection();
                                                zzdVar.close();
                                                return;
                                            }
                                            android.content.Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                                            if (errorResolutionIntent == null) {
                                                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(2);
                                            }
                                            java.lang.String str = zze;
                                            int length = java.lang.String.valueOf(apiLevel).length();
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 113 + java.lang.String.valueOf(intValue).length() + 39 + java.lang.String.valueOf(str).length());
                                            sb.append("Google Play Services update is required. The API Level of the client is ");
                                            sb.append(apiLevel);
                                            sb.append(". The API Level of the implementation is ");
                                            sb.append(intValue);
                                            sb.append(". The Cronet implementation version is ");
                                            sb.append(str);
                                            throw new com.google.android.gms.common.GooglePlayServicesRepairableException(2, sb.toString(), errorResolutionIntent);
                                        } catch (java.lang.Throwable th) {
                                            throw th;
                                        }
                                    } catch (java.lang.Exception e) {
                                        throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8).initCause(e));
                                    }
                                } finally {
                                    try {
                                        android.os.Trace.endSection();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                                throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8).initCause(e2));
                            }
                        } finally {
                        }
                    } catch (java.lang.ClassNotFoundException e3) {
                        throw ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) new com.google.android.gms.common.GooglePlayServicesNotAvailableException(10).initCause(e3));
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    static com.google.android.gms.dynamite.DynamiteModule zzb() {
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        synchronized (zzc) {
            dynamiteModule = zzd;
        }
        return dynamiteModule;
    }

    static java.lang.String zzc() {
        java.lang.String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    private CronetProviderInstaller() {
    }
}
